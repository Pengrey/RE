package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;

/* loaded from: classes.dex */
class ChaCha20 extends ChaCha20Base {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChaCha20(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    int[] createInitialState(int[] iArr, int i) {
        if (iArr.length == nonceSizeInBytes() / 4) {
            int[] iArr2 = new int[16];
            ChaCha20Base.setSigmaAndKey(iArr2, this.key);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    public int nonceSizeInBytes() {
        return 12;
    }
}