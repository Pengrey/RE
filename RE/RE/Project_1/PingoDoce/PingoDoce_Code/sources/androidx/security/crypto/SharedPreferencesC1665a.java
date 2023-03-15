package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AesGcmKeyManager;
import com.google.crypto.tink.config.TinkConfig;
import com.google.crypto.tink.daead.AesSivKeyManager;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.subtle.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p301q.C9552b;

/* renamed from: androidx.security.crypto.a */
/* loaded from: classes.dex */
public final class SharedPreferencesC1665a implements SharedPreferences {

    /* renamed from: a */
    final SharedPreferences f5035a;

    /* renamed from: b */
    final List<SharedPreferences.OnSharedPreferenceChangeListener> f5036b = new ArrayList();

    /* renamed from: c */
    final String f5037c;

    /* renamed from: d */
    final Aead f5038d;

    /* renamed from: e */
    final DeterministicAead f5039e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EncryptedSharedPreferences.java */
    /* renamed from: androidx.security.crypto.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1666a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5040a;

        static {
            int[] iArr = new int[EnumC1668c.values().length];
            f5040a = iArr;
            try {
                iArr[EnumC1668c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5040a[EnumC1668c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5040a[EnumC1668c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5040a[EnumC1668c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5040a[EnumC1668c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5040a[EnumC1668c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    /* renamed from: androidx.security.crypto.a$b */
    /* loaded from: classes.dex */
    private static final class SharedPreferences$EditorC1667b implements SharedPreferences.Editor {

        /* renamed from: a */
        private final SharedPreferencesC1665a f5041a;

        /* renamed from: b */
        private final SharedPreferences.Editor f5042b;

        /* renamed from: d */
        private AtomicBoolean f5043d = new AtomicBoolean(false);

        /* renamed from: c */
        private final List<String> f5044c = new CopyOnWriteArrayList();

        SharedPreferences$EditorC1667b(SharedPreferencesC1665a sharedPreferencesC1665a, SharedPreferences.Editor editor) {
            this.f5041a = sharedPreferencesC1665a;
            this.f5042b = editor;
        }

        /* renamed from: a */
        private void m35774a() {
            if (this.f5043d.getAndSet(false)) {
                for (String str : this.f5041a.getAll().keySet()) {
                    if (!this.f5044c.contains(str) && !this.f5041a.m35775g(str)) {
                        this.f5042b.remove(this.f5041a.m35778d(str));
                    }
                }
            }
        }

        /* renamed from: b */
        private void m35773b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f5041a.f5036b) {
                for (String str : this.f5044c) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f5041a, str);
                }
            }
        }

        /* renamed from: c */
        private void m35772c(String str, byte[] bArr) {
            if (!this.f5041a.m35775g(str)) {
                this.f5044c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> m35777e = this.f5041a.m35777e(str, bArr);
                    this.f5042b.putString((String) m35777e.first, (String) m35777e.second);
                    return;
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
                }
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            m35774a();
            this.f5042b.apply();
            m35773b();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f5043d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            m35774a();
            try {
                return this.f5042b.commit();
            } finally {
                m35773b();
                this.f5044c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EnumC1668c.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : (byte) 0);
            m35772c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EnumC1668c.FLOAT.getId());
            allocate.putFloat(f);
            m35772c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EnumC1668c.INT.getId());
            allocate.putInt(i);
            m35772c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EnumC1668c.LONG.getId());
            allocate.putLong(j);
            m35772c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EnumC1668c.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            m35772c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C9552b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EnumC1668c.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            m35772c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f5041a.m35775g(str)) {
                this.f5042b.remove(this.f5041a.m35778d(str));
                this.f5044c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EncryptedSharedPreferences.java */
    /* renamed from: androidx.security.crypto.a$c */
    /* loaded from: classes.dex */
    public enum EnumC1668c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        EnumC1668c(int i) {
            this.mId = i;
        }

        public static EnumC1668c fromId(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    /* renamed from: androidx.security.crypto.a$d */
    /* loaded from: classes.dex */
    public enum EnumC1669d {
        AES256_SIV(AesSivKeyManager.aes256SivTemplate());
        
        private final KeyTemplate mDeterministicAeadKeyTemplate;

        EnumC1669d(KeyTemplate keyTemplate) {
            this.mDeterministicAeadKeyTemplate = keyTemplate;
        }

        KeyTemplate getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    /* renamed from: androidx.security.crypto.a$e */
    /* loaded from: classes.dex */
    public enum EnumC1670e {
        AES256_GCM(AesGcmKeyManager.aes256GcmTemplate());
        
        private final KeyTemplate mAeadKeyTemplate;

        EnumC1670e(KeyTemplate keyTemplate) {
            this.mAeadKeyTemplate = keyTemplate;
        }

        KeyTemplate getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    SharedPreferencesC1665a(String str, String str2, SharedPreferences sharedPreferences, Aead aead, DeterministicAead deterministicAead) {
        this.f5037c = str;
        this.f5035a = sharedPreferences;
        this.f5038d = aead;
        this.f5039e = deterministicAead;
    }

    /* renamed from: a */
    public static SharedPreferences m35781a(Context context, String str, C1671b c1671b, EnumC1669d enumC1669d, EnumC1670e enumC1670e) throws GeneralSecurityException, IOException {
        return m35780b(str, c1671b.m35771a(), context, enumC1669d, enumC1670e);
    }

    @Deprecated
    /* renamed from: b */
    public static SharedPreferences m35780b(String str, String str2, Context context, EnumC1669d enumC1669d, EnumC1670e enumC1670e) throws GeneralSecurityException, IOException {
        TinkConfig.register();
        Context applicationContext = context.getApplicationContext();
        AndroidKeysetManager.Builder withSharedPref = new AndroidKeysetManager.Builder().withKeyTemplate(enumC1669d.getKeyTemplate()).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        KeysetHandle keysetHandle = withSharedPref.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        AndroidKeysetManager.Builder withSharedPref2 = new AndroidKeysetManager.Builder().withKeyTemplate(enumC1670e.getKeyTemplate()).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        KeysetHandle keysetHandle2 = withSharedPref2.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        DeterministicAead deterministicAead = (DeterministicAead) keysetHandle.getPrimitive(DeterministicAead.class);
        return new SharedPreferencesC1665a(str, str2, applicationContext.getSharedPreferences(str, 0), (Aead) keysetHandle2.getPrimitive(Aead.class), deterministicAead);
    }

    /* renamed from: f */
    private Object m35776f(String str) {
        if (!m35775g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String m35778d = m35778d(str);
                String string = this.f5035a.getString(m35778d, null);
                if (string != null) {
                    ByteBuffer wrap = ByteBuffer.wrap(this.f5038d.decrypt(Base64.decode(string, 0), m35778d.getBytes(StandardCharsets.UTF_8)));
                    wrap.position(0);
                    switch (C1666a.f5040a[EnumC1668c.fromId(wrap.getInt()).ordinal()]) {
                        case 1:
                            int i = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i);
                            String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                            if (charBuffer.equals("__NULL__")) {
                                return null;
                            }
                            return charBuffer;
                        case 2:
                            return Integer.valueOf(wrap.getInt());
                        case 3:
                            return Long.valueOf(wrap.getLong());
                        case 4:
                            return Float.valueOf(wrap.getFloat());
                        case 5:
                            return Boolean.valueOf(wrap.get() != 0);
                        case 6:
                            C9552b c9552b = new C9552b();
                            while (wrap.hasRemaining()) {
                                int i2 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i2);
                                wrap.position(wrap.position() + i2);
                                c9552b.add(StandardCharsets.UTF_8.decode(slice2).toString());
                            }
                            if (c9552b.size() == 1 && "__NULL__".equals(c9552b.m10658q(0))) {
                                return null;
                            }
                            return c9552b;
                        default:
                            return null;
                    }
                }
                return null;
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
            }
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* renamed from: c */
    String m35779c(String str) {
        try {
            String str2 = new String(this.f5039e.decryptDeterministically(Base64.decode(str, 0), this.f5037c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!m35775g(str)) {
            return this.f5035a.contains(m35778d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* renamed from: d */
    String m35778d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Base64.encode(this.f5039e.encryptDeterministically(str.getBytes(StandardCharsets.UTF_8), this.f5037c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    /* renamed from: e */
    Pair<String, String> m35777e(String str, byte[] bArr) throws GeneralSecurityException {
        String m35778d = m35778d(str);
        return new Pair<>(m35778d, Base64.encode(this.f5038d.encrypt(bArr, m35778d.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC1667b(this, this.f5035a.edit());
    }

    /* renamed from: g */
    boolean m35775g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f5035a.getAll().entrySet()) {
            if (!m35775g(entry.getKey())) {
                String m35779c = m35779c(entry.getKey());
                hashMap.put(m35779c, m35776f(m35779c));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object m35776f = m35776f(str);
        return (m35776f == null || !(m35776f instanceof Boolean)) ? z : ((Boolean) m35776f).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object m35776f = m35776f(str);
        return (m35776f == null || !(m35776f instanceof Float)) ? f : ((Float) m35776f).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object m35776f = m35776f(str);
        return (m35776f == null || !(m35776f instanceof Integer)) ? i : ((Integer) m35776f).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object m35776f = m35776f(str);
        return (m35776f == null || !(m35776f instanceof Long)) ? j : ((Long) m35776f).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object m35776f = m35776f(str);
        return (m35776f == null || !(m35776f instanceof String)) ? str2 : (String) m35776f;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> c9552b;
        Object m35776f = m35776f(str);
        if (m35776f instanceof Set) {
            c9552b = (Set) m35776f;
        } else {
            c9552b = new C9552b<>();
        }
        return c9552b.size() > 0 ? c9552b : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5036b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5036b.remove(onSharedPreferenceChangeListener);
    }
}
