package p321qk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.RecoverPinFlowData;

/* renamed from: qk.a */
/* loaded from: classes2.dex */
public final class PinRecoverActivity {
    /* renamed from: a */
    public static final void m10009a(ActivityC0325c activityC0325c, RecoverPinFlowData recoverPinFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(recoverPinFlowData, "data");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", recoverPinFlowData);
        intent.addFlags(268468224);
        activityC0325c.startActivity(intent);
    }
}
