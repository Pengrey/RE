package p015ak;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: ak.a */
/* loaded from: classes2.dex */
public final class CardRegistrationActivity {
    /* renamed from: a */
    public static final void m41600a(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(onboardingFlowData, "onboardingFlowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.home.loyaltycard.registration.CardRegistrationActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", onboardingFlowData);
        intent.putExtra("EXTRA_FOR_LAUNCH_FOR_RESUME", z);
        intent.addFlags(33554432);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m41599b(ActivityC0325c activityC0325c, OnboardingFlowData onboardingFlowData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        m41600a(activityC0325c, onboardingFlowData, z);
    }
}
