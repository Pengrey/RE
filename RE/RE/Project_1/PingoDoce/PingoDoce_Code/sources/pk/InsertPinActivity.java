package pk;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.LoginFlowData;

/* renamed from: pk.a */
/* loaded from: classes2.dex */
public final class InsertPinActivity {
    /* renamed from: a */
    public static final void m14937a(AbstractC0304b abstractC0304b, Activity activity, LoginFlowData loginFlowData) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(loginFlowData, "data");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.login.pin.insert.InsertPinActivity.class);
        intent.putExtra("EXTRA_FOR_RESULT", true);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", loginFlowData);
        abstractC0304b.m41324a(intent);
    }

    /* renamed from: b */
    public static final void m14936b(ActivityC0325c activityC0325c, LoginFlowData loginFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(loginFlowData, "data");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.login.pin.insert.InsertPinActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", loginFlowData);
        activityC0325c.startActivity(intent);
    }
}
