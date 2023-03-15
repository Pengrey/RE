package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.C1001a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.biometric.h */
/* loaded from: classes.dex */
public class C0591h {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoObjectUtils.java */
    /* renamed from: androidx.biometric.h$a */
    /* loaded from: classes.dex */
    public static class C0592a {
        /* renamed from: a */
        static KeyGenParameterSpec m40141a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        static KeyGenParameterSpec.Builder m40140b(String str, int i) {
            return new KeyGenParameterSpec.Builder(str, i);
        }

        /* renamed from: c */
        static void m40139c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        /* renamed from: d */
        static void m40138d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        /* renamed from: e */
        static void m40137e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoObjectUtils.java */
    /* renamed from: androidx.biometric.h$b */
    /* loaded from: classes.dex */
    public static class C0593b {
        /* renamed from: a */
        static BiometricPrompt.CryptoObject m40136a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        /* renamed from: b */
        static BiometricPrompt.CryptoObject m40135b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        /* renamed from: c */
        static BiometricPrompt.CryptoObject m40134c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        /* renamed from: d */
        static Cipher m40133d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        /* renamed from: e */
        static Mac m40132e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        /* renamed from: f */
        static Signature m40131f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoObjectUtils.java */
    /* renamed from: androidx.biometric.h$c */
    /* loaded from: classes.dex */
    public static class C0594c {
        /* renamed from: a */
        static BiometricPrompt.CryptoObject m40130a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        /* renamed from: b */
        static IdentityCredential m40129b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static BiometricPrompt.C0546c m40146a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder m40140b = C0592a.m40140b("androidxBiometric", 3);
            C0592a.m40138d(m40140b);
            C0592a.m40137e(m40140b);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            C0592a.m40139c(keyGenerator, C0592a.m40141a(m40140b));
            keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) keyStore.getKey("androidxBiometric", null));
            return new BiometricPrompt.C0546c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static BiometricPrompt.C0546c m40145b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential m40129b;
        if (cryptoObject == null) {
            return null;
        }
        Cipher m40133d = C0593b.m40133d(cryptoObject);
        if (m40133d != null) {
            return new BiometricPrompt.C0546c(m40133d);
        }
        Signature m40131f = C0593b.m40131f(cryptoObject);
        if (m40131f != null) {
            return new BiometricPrompt.C0546c(m40131f);
        }
        Mac m40132e = C0593b.m40132e(cryptoObject);
        if (m40132e != null) {
            return new BiometricPrompt.C0546c(m40132e);
        }
        if (Build.VERSION.SDK_INT < 30 || (m40129b = C0594c.m40129b(cryptoObject)) == null) {
            return null;
        }
        return new BiometricPrompt.C0546c(m40129b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static BiometricPrompt.C0546c m40144c(C1001a.C1006e c1006e) {
        if (c1006e == null) {
            return null;
        }
        Cipher m38764a = c1006e.m38764a();
        if (m38764a != null) {
            return new BiometricPrompt.C0546c(m38764a);
        }
        Signature m38762c = c1006e.m38762c();
        if (m38762c != null) {
            return new BiometricPrompt.C0546c(m38762c);
        }
        Mac m38763b = c1006e.m38763b();
        if (m38763b != null) {
            return new BiometricPrompt.C0546c(m38763b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static BiometricPrompt.CryptoObject m40143d(BiometricPrompt.C0546c c0546c) {
        IdentityCredential m40306b;
        if (c0546c == null) {
            return null;
        }
        Cipher m40307a = c0546c.m40307a();
        if (m40307a != null) {
            return C0593b.m40135b(m40307a);
        }
        Signature m40304d = c0546c.m40304d();
        if (m40304d != null) {
            return C0593b.m40136a(m40304d);
        }
        Mac m40305c = c0546c.m40305c();
        if (m40305c != null) {
            return C0593b.m40134c(m40305c);
        }
        if (Build.VERSION.SDK_INT < 30 || (m40306b = c0546c.m40306b()) == null) {
            return null;
        }
        return C0594c.m40130a(m40306b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1001a.C1006e m40142e(BiometricPrompt.C0546c c0546c) {
        if (c0546c == null) {
            return null;
        }
        Cipher m40307a = c0546c.m40307a();
        if (m40307a != null) {
            return new C1001a.C1006e(m40307a);
        }
        Signature m40304d = c0546c.m40304d();
        if (m40304d != null) {
            return new C1001a.C1006e(m40304d);
        }
        Mac m40305c = c0546c.m40305c();
        if (m40305c != null) {
            return new C1001a.C1006e(m40305c);
        }
        if (Build.VERSION.SDK_INT >= 30 && c0546c.m40306b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }
}
