package sk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData;

/* renamed from: sk.a */
/* loaded from: classes2.dex */
public final class PhoneUpdateSmsValidationActivity {
    /* renamed from: a */
    public static final void m8444a(ActivityC0325c activityC0325c, UpdatePhoneFlowData updatePhoneFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(updatePhoneFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.login.sms.update.PhoneUpdateSmsValidationActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", updatePhoneFlowData);
        activityC0325c.startActivity(intent);
    }
}
