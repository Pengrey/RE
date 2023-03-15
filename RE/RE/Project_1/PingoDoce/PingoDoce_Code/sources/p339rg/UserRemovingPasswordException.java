package p339rg;

import af.ApiError;
import p181jd.Intrinsics;
import p425we.ApiBaseException;

/* renamed from: rg.a0 */
/* loaded from: classes2.dex */
public final class UserRemovingPasswordException extends ApiBaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRemovingPasswordException(ApiError apiError) {
        super(apiError);
        Intrinsics.isThisObjectNull(apiError, "apiError");
    }
}
