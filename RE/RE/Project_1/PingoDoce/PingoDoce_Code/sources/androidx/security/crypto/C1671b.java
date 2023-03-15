package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;

/* renamed from: androidx.security.crypto.b */
/* loaded from: classes.dex */
public final class C1671b {

    /* renamed from: a */
    private final String f5045a;

    /* compiled from: MasterKey.java */
    /* renamed from: androidx.security.crypto.b$a */
    /* loaded from: classes.dex */
    public static final class C1672a {

        /* renamed from: a */
        private final String f5046a;

        /* renamed from: b */
        private KeyGenParameterSpec f5047b;

        /* renamed from: c */
        private EnumC1673b f5048c;

        /* renamed from: d */
        private boolean f5049d;

        /* renamed from: e */
        private int f5050e;

        /* renamed from: f */
        private boolean f5051f;

        /* renamed from: g */
        private final Context f5052g;

        public C1672a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        /* renamed from: b */
        private C1671b m35768b() throws GeneralSecurityException, IOException {
            EnumC1673b enumC1673b = this.f5048c;
            if (enumC1673b == null && this.f5047b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (enumC1673b == EnumC1673b.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.f5046a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                if (this.f5049d) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.f5050e);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.f5051f && this.f5052g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.f5047b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f5047b;
            Objects.requireNonNull(keyGenParameterSpec, "KeyGenParameterSpec was null after build() check");
            return new C1671b(C1674c.m35764c(keyGenParameterSpec), this.f5047b);
        }

        /* renamed from: a */
        public C1671b m35769a() throws GeneralSecurityException, IOException {
            if (Build.VERSION.SDK_INT >= 23) {
                return m35768b();
            }
            return new C1671b(this.f5046a, null);
        }

        /* renamed from: c */
        public C1672a m35767c(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f5048c == null) {
                if (this.f5046a.equals(keyGenParameterSpec.getKeystoreAlias())) {
                    this.f5047b = keyGenParameterSpec;
                    return this;
                }
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f5046a + " vs " + keyGenParameterSpec.getKeystoreAlias());
            }
            throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
        }

        public C1672a(Context context, String str) {
            this.f5052g = context.getApplicationContext();
            this.f5046a = str;
        }
    }

    /* compiled from: MasterKey.java */
    /* renamed from: androidx.security.crypto.b$b */
    /* loaded from: classes.dex */
    public enum EnumC1673b {
        AES256_GCM
    }

    C1671b(String str, Object obj) {
        this.f5045a = str;
        if (Build.VERSION.SDK_INT >= 23) {
            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m35771a() {
        return this.f5045a;
    }

    /* renamed from: b */
    public boolean m35770b() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f5045a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f5045a + ", isKeyStoreBacked=" + m35770b() + "}";
    }
}
