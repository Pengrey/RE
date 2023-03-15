package p468yc;

import p181jd.Intrinsics;

/* renamed from: yc.k */
/* loaded from: classes2.dex */
public final class Standard extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Standard(String str) {
        super(str);
        Intrinsics.isThisObjectNull(str, "message");
    }
}
