package p425we;

import af.ApiError;
import com.github.aachartmodel.aainfographics.BuildConfig;
import p181jd.Intrinsics;

/* renamed from: we.b */
/* loaded from: classes2.dex */
public class BaseException extends Throwable {

    /* renamed from: w */
    private ApiError f29802w;

    public BaseException() {
        this.f29802w = new ApiError(BuildConfig.VERSION_NAME);
    }

    public String getMessage() {
        return this.f29802w.m41777a();
    }

    public BaseException(ApiError apiError) {
        Intrinsics.isThisObjectNull(apiError, "error");
        this.f29802w = new ApiError(BuildConfig.VERSION_NAME);
        this.f29802w = apiError;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseException(ApiError apiError, Throwable th2) {
        super(th2);
        Intrinsics.isThisObjectNull(apiError, "error");
        Intrinsics.isThisObjectNull(th2, "throwable");
        this.f29802w = new ApiError(BuildConfig.VERSION_NAME);
        this.f29802w = apiError;
    }
}
