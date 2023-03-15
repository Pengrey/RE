package p110fl;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: fl.a */
/* loaded from: classes2.dex */
public final class UserDataUpdateActivity {
    /* renamed from: a */
    public static final void m23729a(AbstractC0304b abstractC0304b, Activity activity, OnboardingFlowData onboardingFlowData, boolean z) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(onboardingFlowData, "flowData");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.onboarding.userdata.update.UserDataUpdateActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", onboardingFlowData);
        intent.putExtra("EXTRA_FOR_TOOLBAR", z);
        abstractC0304b.m41324a(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m23728b(AbstractC0304b abstractC0304b, Activity activity, OnboardingFlowData onboardingFlowData, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        m23729a(abstractC0304b, activity, onboardingFlowData, z);
    }
}
