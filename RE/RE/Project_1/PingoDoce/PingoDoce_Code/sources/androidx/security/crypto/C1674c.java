package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

@Deprecated
/* renamed from: androidx.security.crypto.c */
/* loaded from: classes.dex */
public final class C1674c {
    static {
        m35766a("_androidx_security_master_key_");
    }

    /* renamed from: a */
    private static KeyGenParameterSpec m35766a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }

    /* renamed from: b */
    private static void m35765b(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e) {
            throw new GeneralSecurityException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static String m35764c(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        m35762e(keyGenParameterSpec);
        if (!m35763d(keyGenParameterSpec.getKeystoreAlias())) {
            m35765b(keyGenParameterSpec);
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    /* renamed from: d */
    private static boolean m35763d(String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    /* renamed from: e */
    static void m35762e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() == 256) {
            if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                if (keyGenParameterSpec.getPurposes() == 3) {
                    if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                        }
                        return;
                    }
                    throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                }
                throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
            }
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
    }
}
