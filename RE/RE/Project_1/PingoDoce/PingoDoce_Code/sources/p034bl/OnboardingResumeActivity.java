package p034bl;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: bl.b */
/* loaded from: classes2.dex */
public final class OnboardingResumeActivity {
    /* renamed from: a */
    public static final void m35085a(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(onboardingFlowData, "onboardingFlowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", onboardingFlowData);
        intent.putExtra("EXTRA_FOR_ONBOARDING_OVERRIDE_CARD", z);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m35084b(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        m35085a(activityC0325c, onboardingFlowData, z);
    }
}
