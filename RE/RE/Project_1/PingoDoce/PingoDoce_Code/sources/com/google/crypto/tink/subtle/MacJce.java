package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Mac;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

@Immutable
/* loaded from: classes.dex */
public final class MacJce implements Mac {
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private final String algorithm;
    private final int digestSize;
    private final Key key;
    private final javax.crypto.Mac mac;

    public MacJce(String str, Key key, int i) throws GeneralSecurityException {
        if (i >= 10) {
            if (key.getEncoded().length >= 16) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (i > 20) {
                            throw new InvalidAlgorithmParameterException("tag size too big");
                        }
                        break;
                    case 1:
                        if (i > 32) {
                            throw new InvalidAlgorithmParameterException("tag size too big");
                        }
                        break;
                    case 2:
                        if (i > 64) {
                            throw new InvalidAlgorithmParameterException("tag size too big");
                        }
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
                }
                this.algorithm = str;
                this.digestSize = i;
                this.key = key;
                javax.crypto.Mac engineFactory = EngineFactory.MAC.getInstance(str);
                this.mac = engineFactory;
                engineFactory.init(key);
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.crypto.tink.Mac
    public byte[] computeMac(byte[] bArr) throws GeneralSecurityException {
        javax.crypto.Mac engineFactory;
        try {
            engineFactory = (javax.crypto.Mac) this.mac.clone();
        } catch (CloneNotSupportedException unused) {
            engineFactory = EngineFactory.MAC.getInstance(this.algorithm);
            engineFactory.init(this.key);
        }
        engineFactory.update(bArr);
        byte[] bArr2 = new byte[this.digestSize];
        System.arraycopy(engineFactory.doFinal(), 0, bArr2, 0, this.digestSize);
        return bArr2;
    }

    @Override // com.google.crypto.tink.Mac
    public void verifyMac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!Bytes.equal(computeMac(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
