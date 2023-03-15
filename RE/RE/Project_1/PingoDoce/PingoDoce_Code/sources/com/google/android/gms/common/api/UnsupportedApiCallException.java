package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: w */
    private final Feature f7165w;

    public UnsupportedApiCallException(Feature feature) {
        this.f7165w = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7165w));
    }
}
