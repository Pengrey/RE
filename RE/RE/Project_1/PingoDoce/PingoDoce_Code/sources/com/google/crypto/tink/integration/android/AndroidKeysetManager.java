package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Hex;
import com.google.crypto.tink.subtle.Random;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class AndroidKeysetManager {
    private static final String TAG = "AndroidKeysetManager";
    private final KeyTemplate keyTemplate;
    @GuardedBy("this")
    private KeysetManager keysetManager;
    private final Aead masterKey;
    private final KeysetReader reader;
    private final boolean useKeystore;
    private final KeysetWriter writer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C40081 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* synthetic */ AndroidKeysetManager(Builder builder, C40081 c40081) throws GeneralSecurityException, IOException {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTemplate.OutputPrefixType fromProto(OutputPrefixType outputPrefixType) {
        int i = C40081.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return KeyTemplate.OutputPrefixType.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return KeyTemplate.OutputPrefixType.RAW;
            }
            return KeyTemplate.OutputPrefixType.LEGACY;
        }
        return KeyTemplate.OutputPrefixType.TINK;
    }

    private static boolean isAtLeastM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private KeysetManager read() throws GeneralSecurityException, IOException {
        if (shouldUseKeystore()) {
            try {
                return KeysetManager.withKeysetHandle(KeysetHandle.read(this.reader, this.masterKey));
            } catch (InvalidProtocolBufferException | GeneralSecurityException e) {
                String str = TAG;
                Log.i(str, "cannot decrypt keyset: " + e);
            }
        }
        KeysetHandle read = CleartextKeysetHandle.read(this.reader);
        if (shouldUseKeystore()) {
            read.write(this.writer, this.masterKey);
        }
        return KeysetManager.withKeysetHandle(read);
    }

    private KeysetManager readOrGenerateNewKeyset() throws GeneralSecurityException, IOException {
        try {
            return read();
        } catch (IOException e) {
            String str = TAG;
            Log.i(str, "cannot read keyset: " + e);
            if (this.keyTemplate != null) {
                KeysetManager add = KeysetManager.withEmptyKeyset().add(this.keyTemplate);
                KeysetManager primary = add.setPrimary(add.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
                write(primary);
                return primary;
            }
            throw new GeneralSecurityException("cannot obtain keyset handle");
        }
    }

    private boolean shouldUseKeystore() {
        return this.useKeystore && isAtLeastM();
    }

    private static boolean verifyAndroidKeystore() {
        if (isAtLeastM()) {
            try {
                String str = AndroidKeystoreKmsClient.PREFIX + new String(Random.randBytes(16), Charset.forName("UTF-8"));
                Aead orGenerateNewAeadKey = AndroidKeystoreKmsClient.getOrGenerateNewAeadKey(str);
                byte[] bArr = new byte[0];
                if (orGenerateNewAeadKey.decrypt(orGenerateNewAeadKey.encrypt(new byte[0], bArr), bArr).length != 0) {
                    Log.i(TAG, "cannot use Android Keystore: encryption/decryption of empty message and empty aad returns incorrect results");
                    return false;
                }
                byte[] randBytes = Random.randBytes(10);
                byte[] bArr2 = new byte[0];
                if (!Hex.encode(orGenerateNewAeadKey.decrypt(orGenerateNewAeadKey.encrypt(randBytes, bArr2), bArr2)).equals(Hex.encode(randBytes))) {
                    Log.i(TAG, "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns incorrect results");
                    return false;
                }
                byte[] randBytes2 = Random.randBytes(10);
                byte[] randBytes3 = Random.randBytes(10);
                if (!Hex.encode(orGenerateNewAeadKey.decrypt(orGenerateNewAeadKey.encrypt(randBytes2, randBytes3), randBytes3)).equals(Hex.encode(randBytes2))) {
                    Log.i(TAG, "cannot use Android Keystore: encryption/decryption of non-empty message and non-empty aad returns incorrect results");
                    return false;
                }
                AndroidKeystoreKmsClient.delete(str);
                return true;
            } catch (Exception e) {
                Log.i(TAG, "cannot use Android Keystore: " + e);
                return false;
            }
        }
        return false;
    }

    private void write(KeysetManager keysetManager) throws GeneralSecurityException {
        try {
            if (shouldUseKeystore()) {
                keysetManager.getKeysetHandle().write(this.writer, this.masterKey);
            } else {
                CleartextKeysetHandle.write(keysetManager.getKeysetHandle(), this.writer);
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    @GuardedBy("this")
    @Deprecated
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager add = this.keysetManager.add(keyTemplate);
        this.keysetManager = add;
        write(add);
        return this;
    }

    public synchronized AndroidKeysetManager delete(int i) throws GeneralSecurityException {
        KeysetManager delete = this.keysetManager.delete(i);
        this.keysetManager = delete;
        write(delete);
        return this;
    }

    public synchronized AndroidKeysetManager destroy(int i) throws GeneralSecurityException {
        KeysetManager destroy = this.keysetManager.destroy(i);
        this.keysetManager = destroy;
        write(destroy);
        return this;
    }

    public synchronized AndroidKeysetManager disable(int i) throws GeneralSecurityException {
        KeysetManager disable = this.keysetManager.disable(i);
        this.keysetManager = disable;
        write(disable);
        return this;
    }

    public synchronized AndroidKeysetManager enable(int i) throws GeneralSecurityException {
        KeysetManager enable = this.keysetManager.enable(i);
        this.keysetManager = enable;
        write(enable);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return this.keysetManager.getKeysetHandle();
    }

    public synchronized boolean isUsingKeystore() {
        return shouldUseKeystore();
    }

    @Deprecated
    public synchronized AndroidKeysetManager promote(int i) throws GeneralSecurityException {
        return setPrimary(i);
    }

    @Deprecated
    public synchronized AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager rotate = this.keysetManager.rotate(keyTemplate);
        this.keysetManager = rotate;
        write(rotate);
        return this;
    }

    public synchronized AndroidKeysetManager setPrimary(int i) throws GeneralSecurityException {
        KeysetManager primary = this.keysetManager.setPrimary(i);
        this.keysetManager = primary;
        write(primary);
        return this;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private KeysetReader reader = null;
        private KeysetWriter writer = null;
        private String masterKeyUri = null;
        private boolean useKeystore = true;
        private KeyTemplate keyTemplate = null;

        public AndroidKeysetManager build() throws GeneralSecurityException, IOException {
            return new AndroidKeysetManager(this, null);
        }

        public Builder doNotUseKeystore() {
            this.useKeystore = false;
            return this;
        }

        @Deprecated
        public Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
            this.keyTemplate = KeyTemplate.create(keyTemplate.getTypeUrl(), keyTemplate.getValue().toByteArray(), AndroidKeysetManager.fromProto(keyTemplate.getOutputPrefixType()));
            return this;
        }

        public Builder withMasterKeyUri(String str) {
            if (str.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                this.masterKeyUri = str;
                return this;
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public Builder withSharedPref(Context context, String str, String str2) throws IOException {
            if (context != null) {
                if (str != null) {
                    this.reader = new SharedPrefKeysetReader(context, str, str2);
                    this.writer = new SharedPrefKeysetWriter(context, str, str2);
                    return this;
                }
                throw new IllegalArgumentException("need a keyset name");
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public Builder withKeyTemplate(KeyTemplate keyTemplate) {
            this.keyTemplate = keyTemplate;
            return this;
        }
    }

    private AndroidKeysetManager(Builder builder) throws GeneralSecurityException, IOException {
        KeysetReader keysetReader = builder.reader;
        this.reader = keysetReader;
        if (keysetReader != null) {
            KeysetWriter keysetWriter = builder.writer;
            this.writer = keysetWriter;
            if (keysetWriter != null) {
                if (!builder.useKeystore || builder.masterKeyUri != null) {
                    this.useKeystore = builder.useKeystore && verifyAndroidKeystore();
                    if (shouldUseKeystore()) {
                        this.masterKey = AndroidKeystoreKmsClient.getOrGenerateNewAeadKey(builder.masterKeyUri);
                    } else {
                        this.masterKey = null;
                    }
                    this.keyTemplate = builder.keyTemplate;
                    this.keysetManager = readOrGenerateNewKeyset();
                    return;
                }
                throw new IllegalArgumentException("need a master key URI, please set it with Builder#masterKeyUri");
            }
            throw new IllegalArgumentException("need to specify where to write the keyset to with Builder#withSharedPref");
        }
        throw new IllegalArgumentException("need to specify where to read the keyset from with Builder#withSharedPref");
    }

    @GuardedBy("this")
    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager add = this.keysetManager.add(keyTemplate);
        this.keysetManager = add;
        write(add);
        return this;
    }
}
