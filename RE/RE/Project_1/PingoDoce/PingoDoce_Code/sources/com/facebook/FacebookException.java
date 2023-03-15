package com.facebook;

import com.facebook.internal.FeatureManager;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p097f5.ErrorReportHandler;

/* compiled from: FacebookException.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\fB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nB\u0013\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\u000b¨\u0006\r"}, m20207d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", BuildConfig.VERSION_NAME, "message", "(Ljava/lang/String;)V", BuildConfig.VERSION_NAME, "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "b", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* compiled from: FacebookException.kt */
    /* renamed from: com.facebook.FacebookException$a */
    /* loaded from: classes.dex */
    static final class C2266a implements FeatureManager.InterfaceC2316a {

        /* renamed from: a */
        final /* synthetic */ String f6584a;

        C2266a(String str) {
            this.f6584a = str;
        }

        @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
        /* renamed from: a */
        public final void mo17769a(boolean z) {
            if (z) {
                try {
                    ErrorReportHandler.m24385c(this.f6584a);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: FacebookException.kt */
    /* renamed from: com.facebook.FacebookException$b */
    /* loaded from: classes.dex */
    public static final class C2267b {
        private C2267b() {
        }

        public /* synthetic */ C2267b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2267b(null);
    }

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message != null ? message : BuildConfig.VERSION_NAME;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C2290b.m34095t() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.m34008a(FeatureManager.EnumC2317b.ErrorReport, new C2266a(str));
    }

    public FacebookException(String str, Throwable th2) {
        super(str, th2);
    }

    public FacebookException(Throwable th2) {
        super(th2);
    }
}
