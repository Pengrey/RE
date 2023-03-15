package p033bk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: bk.a */
/* loaded from: classes2.dex */
public final class AvailableCardsResumeActivity {
    /* renamed from: a */
    public static final void m35123a(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(onboardingFlowData, "onboardingFlowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.home.loyaltycard.resume.AvailableCardsResumeActivity.class);
        intent.putExtra("EXTRA_FOR_ONBOARDING_DATA", onboardingFlowData);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", onboardingFlowData);
        intent.putExtra("EXTRA_FOR_ONBOARDING_OVERRIDE_CARD", z);
        intent.putExtra("EXTRA_FOR_HIDE_TOOLBAR_IMAGE", true);
        intent.addFlags(33554432);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m35122b(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        m35123a(activityC0325c, onboardingFlowData, z);
    }
}
