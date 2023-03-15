package pg;

import android.content.SharedPreferences;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p398v5.SharedPrefsKtx;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: pg.a */
/* loaded from: classes2.dex */
public final class OnboardingFlowDataSharedPreferences {

    /* renamed from: a */
    private final SharedPreferences f22232a;

    /* compiled from: OnboardingFlowDataSharedPreferences.kt */
    /* renamed from: pg.a$a */
    /* loaded from: classes2.dex */
    public static final class C8621a {
        private C8621a() {
        }

        public /* synthetic */ C8621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C8621a(null);
    }

    public OnboardingFlowDataSharedPreferences(SharedPreferences sharedPreferences) {
        Intrinsics.isThisObjectNull(sharedPreferences, "prefs");
        this.f22232a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m14991a() {
        this.f22232a.edit().remove("KEY_FOR_ONBOARDING_FLOW_DATA").apply();
    }

    /* renamed from: b */
    public final OnboardingFlowData m14990b() {
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) SharedPrefsKtx.m6043d(this.f22232a, "KEY_FOR_ONBOARDING_FLOW_DATA", C6450z.m20906b(OnboardingFlowData.class), new OnboardingFlowData(BuildConfig.VERSION_NAME, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, null, null, 524286, null), null, 8, null);
        if (onboardingFlowData.m14723b().length() == 0) {
            return null;
        }
        return onboardingFlowData;
    }

    /* renamed from: c */
    public final void m14989c(OnboardingFlowData onboardingFlowData) {
        Intrinsics.isThisObjectNull(onboardingFlowData, "onboardingFlowData");
        SharedPrefsKtx.m6039h(this.f22232a, "KEY_FOR_ONBOARDING_FLOW_DATA", onboardingFlowData, null, 4, null);
    }
}
