package com.google.android.gms.common;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.o */
/* loaded from: classes.dex */
final class BinderC2623o extends AbstractBinderC2622n {

    /* renamed from: b */
    private final byte[] f7543b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2623o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7543b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC2622n
    /* renamed from: S1 */
    public final byte[] mo33009S1() {
        return this.f7543b;
    }
}
