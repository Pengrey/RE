package p425we;

import af.ApiError;
import p181jd.Intrinsics;

/* renamed from: we.c */
/* loaded from: classes2.dex */
public class GenericApiException extends ApiBaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericApiException(ApiError apiError) {
        super(apiError);
        Intrinsics.isThisObjectNull(apiError, "apiError");
    }
}
