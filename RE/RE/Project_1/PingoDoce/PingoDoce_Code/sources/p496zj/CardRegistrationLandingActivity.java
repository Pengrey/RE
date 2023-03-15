package p496zj;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import com.github.aachartmodel.aainfographics.BuildConfig;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: zj.a */
/* loaded from: classes2.dex */
public final class CardRegistrationLandingActivity {
    /* renamed from: a */
    public static final void m60a(AbstractC0304b abstractC0304b, Activity activity) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.home.loyaltycard.landing.CardRegistrationLandingActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", new OnboardingFlowData(BuildConfig.VERSION_NAME, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, null, null, 524286, null));
        abstractC0304b.m41324a(intent);
    }

    /* renamed from: b */
    public static final void m59b(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.home.loyaltycard.landing.CardRegistrationLandingActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", new OnboardingFlowData(BuildConfig.VERSION_NAME, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, null, null, 524286, null));
        activityC0325c.startActivity(intent);
    }
}
