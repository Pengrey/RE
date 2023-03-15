package p430wk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: wk.a */
/* loaded from: classes2.dex */
public final class OnboardingCardQuestionActivity {
    /* renamed from: a */
    public static final void m3476a(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(onboardingFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingCardQuestionActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", onboardingFlowData);
        activityC0325c.startActivity(intent);
    }
}
