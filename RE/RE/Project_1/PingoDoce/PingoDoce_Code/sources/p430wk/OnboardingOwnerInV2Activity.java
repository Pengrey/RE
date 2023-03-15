package p430wk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: wk.w */
/* loaded from: classes2.dex */
public final class OnboardingOwnerInV2Activity {
    /* renamed from: a */
    public static final void m3413a(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(onboardingFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingOwnerInV2Activity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", onboardingFlowData);
        intent.putExtra("IS_ACCOUNT_FLOW", z);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m3412b(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        m3413a(activityC0325c, onboardingFlowData, z);
    }
}
