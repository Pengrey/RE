package com.google.crypto.tink.prf;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class PrfConfig {
    public static final String PRF_TYPE_URL = new HkdfPrfKeyManager().getKeyType();

    private PrfConfig() {
    }

    public static void register() throws GeneralSecurityException {
        HkdfPrfKeyManager.register(true);
        PrfSetWrapper.register();
    }
}
