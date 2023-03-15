package ve;

import af.ApiError;
import p181jd.Intrinsics;
import p425we.ApiBaseException;

/* renamed from: ve.d */
/* loaded from: classes2.dex */
public final class NullBodyException extends ApiBaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullBodyException(ApiError apiError) {
        super(apiError);
        Intrinsics.isThisObjectNull(apiError, "apiError");
    }
}
