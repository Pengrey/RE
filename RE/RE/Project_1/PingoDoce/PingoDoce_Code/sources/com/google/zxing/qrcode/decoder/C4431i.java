package com.google.zxing.qrcode.decoder;

import com.google.zxing.C4411o;

/* renamed from: com.google.zxing.qrcode.decoder.i */
/* loaded from: classes2.dex */
public final class C4431i {

    /* renamed from: a */
    private final boolean f11951a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4431i(boolean z) {
        this.f11951a = z;
    }

    /* renamed from: a */
    public void m27611a(C4411o[] c4411oArr) {
        if (!this.f11951a || c4411oArr == null || c4411oArr.length < 3) {
            return;
        }
        C4411o c4411o = c4411oArr[0];
        c4411oArr[0] = c4411oArr[2];
        c4411oArr[2] = c4411o;
    }
}
