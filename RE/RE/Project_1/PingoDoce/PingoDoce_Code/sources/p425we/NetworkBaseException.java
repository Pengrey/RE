package p425we;

import af.ApiError;
import p181jd.Intrinsics;

/* renamed from: we.d */
/* loaded from: classes2.dex */
public class NetworkBaseException extends BaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkBaseException(ApiError apiError, Throwable th2) {
        super(apiError, th2);
        Intrinsics.isThisObjectNull(apiError, "apiError");
        Intrinsics.isThisObjectNull(th2, "throwable");
    }
}
