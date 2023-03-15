package p339rg;

import af.ApiError;
import p181jd.Intrinsics;
import p425we.ApiBaseException;

/* renamed from: rg.s */
/* loaded from: classes2.dex */
public final class UserCantSignInException extends ApiBaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCantSignInException(ApiError apiError) {
        super(apiError);
        Intrinsics.isThisObjectNull(apiError, "apiError");
    }
}
