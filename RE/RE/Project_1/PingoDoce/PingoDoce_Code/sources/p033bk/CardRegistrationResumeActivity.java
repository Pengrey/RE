package p033bk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: bk.h */
/* loaded from: classes2.dex */
public final class CardRegistrationResumeActivity {
    /* renamed from: a */
    public static final void m35101a(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(onboardingFlowData, "onboardingFlowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.home.loyaltycard.resume.CardRegistrationResumeActivity.class);
        intent.putExtra("EXTRA_FOR_ONBOARDING_DATA", onboardingFlowData);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", onboardingFlowData);
        intent.putExtra("EXTRA_FOR_ONBOARDING_OVERRIDE_CARD", false);
        intent.putExtra("EXTRA_FOR_HIDE_TOOLBAR_IMAGE", true);
        intent.addFlags(33554432);
        activityC0325c.startActivity(intent);
    }
}
