package cm;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.core.app.C0890c;
import androidx.core.util.C1072d;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: cm.b */
/* loaded from: classes2.dex */
public final class TakeAwayMealDetailActivity {
    /* renamed from: a */
    public static final void m34500a(AbstractC0304b abstractC0304b, Activity activity, TakeAwayFlowData takeAwayFlowData, TakeAwayProduct takeAwayProduct, View view) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMealDetailActivity.class);
        intent.putExtra("EXTRA_FOR_PRODUCT", takeAwayProduct);
        if (takeAwayFlowData != null) {
            intent.putExtra("EXTRA_FOR_FLOW_DATA", takeAwayFlowData);
        }
        if (view == null) {
            abstractC0304b.m41324a(intent);
        } else {
            abstractC0304b.mo37539b(intent, C0890c.m39251a(activity, new C1072d(view, "TRANSITION_IMAGE")));
        }
    }
}
