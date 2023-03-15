package mk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData;

/* renamed from: mk.a */
/* loaded from: classes2.dex */
public final class CreatePhoneActivity {
    /* renamed from: a */
    public static final void m18365a(ActivityC0325c activityC0325c, UpdatePhoneFlowData updatePhoneFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(updatePhoneFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.login.phone.update.CreatePhoneActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", updatePhoneFlowData);
        activityC0325c.startActivity(intent);
    }
}
