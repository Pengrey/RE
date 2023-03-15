package mk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;

/* renamed from: mk.k */
/* loaded from: classes2.dex */
public final class ValidatePinForUpdatePhoneActivity {
    /* renamed from: a */
    public static final void m18346a(ActivityC0325c activityC0325c, PhoneFlowData phoneFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(phoneFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.login.phone.update.ValidatePinForUpdatePhoneActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", phoneFlowData);
        activityC0325c.startActivity(intent);
    }
}
