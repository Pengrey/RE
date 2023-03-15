package p425we;

import af.ApiError;
import p181jd.Intrinsics;

/* renamed from: we.a */
/* loaded from: classes2.dex */
public class ApiBaseException extends BaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiBaseException(ApiError apiError) {
        super(apiError);
        Intrinsics.isThisObjectNull(apiError, "apiError");
    }
}
