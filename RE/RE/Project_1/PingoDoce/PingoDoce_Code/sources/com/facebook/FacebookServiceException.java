package com.facebook;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: FacebookServiceException.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m20207d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "Lcom/facebook/FacebookRequestError;", "requestError", BuildConfig.VERSION_NAME, "errorMessage", "<init>", "(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V", "a", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class FacebookServiceException extends FacebookException {

    /* renamed from: w */
    private final FacebookRequestError f6600w;

    /* compiled from: FacebookServiceException.kt */
    /* renamed from: com.facebook.FacebookServiceException$a */
    /* loaded from: classes.dex */
    public static final class C2274a {
        private C2274a() {
        }

        public /* synthetic */ C2274a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2274a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        Intrinsics.isThisObjectNull(facebookRequestError, "requestError");
        this.f6600w = facebookRequestError;
    }

    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f6600w.m34223f() + ", facebookErrorCode: " + this.f6600w.m34227b() + ", facebookErrorType: " + this.f6600w.m34225d() + ", message: " + this.f6600w.m34226c() + "}";
        Intrinsics.checkIfNull(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
