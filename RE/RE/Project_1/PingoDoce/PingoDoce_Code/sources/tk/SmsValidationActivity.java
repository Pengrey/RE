package tk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.LoginFlowData;

/* renamed from: tk.a */
/* loaded from: classes2.dex */
public final class SmsValidationActivity {
    /* renamed from: a */
    public static final void m7451a(ActivityC0325c activityC0325c, LoginFlowData loginFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(loginFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.login.sms.validate.SmsValidationActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", loginFlowData);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static final void m7450b(ActivityC0325c activityC0325c, LoginFlowData loginFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(loginFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.login.sms.validate.SmsValidationActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", loginFlowData);
        intent.putExtra("EXTRA_FOR_PIN_RECOVERY", true);
        activityC0325c.startActivity(intent);
    }
}
