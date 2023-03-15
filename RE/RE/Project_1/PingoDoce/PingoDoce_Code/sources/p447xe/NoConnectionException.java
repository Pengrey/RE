package p447xe;

import af.ApiError;
import p181jd.Intrinsics;
import p425we.NetworkBaseException;

/* renamed from: xe.a */
/* loaded from: classes2.dex */
public final class NoConnectionException extends NetworkBaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoConnectionException(ApiError apiError, Throwable th2) {
        super(apiError, th2);
        Intrinsics.isThisObjectNull(apiError, "apiError");
        Intrinsics.isThisObjectNull(th2, "throwable");
    }
}
