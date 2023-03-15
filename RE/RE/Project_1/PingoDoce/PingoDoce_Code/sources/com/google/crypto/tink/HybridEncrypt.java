package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public interface HybridEncrypt {
    byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException;
}
