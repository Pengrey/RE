package am;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;

/* renamed from: am.p */
/* loaded from: classes2.dex */
public final class TakeAwayProductsActivity {
    /* renamed from: a */
    public static final void m41515a(ActivityC0325c activityC0325c, TakeAwayFlowData takeAwayFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(takeAwayFlowData, "data");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", takeAwayFlowData);
        activityC0325c.startActivity(intent);
    }
}
