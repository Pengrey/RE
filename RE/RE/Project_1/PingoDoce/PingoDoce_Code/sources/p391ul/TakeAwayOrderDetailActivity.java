package p391ul;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;

/* renamed from: ul.b */
/* loaded from: classes2.dex */
public final class TakeAwayOrderDetailActivity {
    /* renamed from: a */
    public static final void m6701a(ActivityC0325c activityC0325c, TakeAwayOrder takeAwayOrder) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(takeAwayOrder, "order");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.takeaway.orders.detail.TakeAwayOrderDetailActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", new TakeAwayFlowData(takeAwayOrder));
        activityC0325c.startActivity(intent);
    }
}
