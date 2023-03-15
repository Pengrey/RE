package cm;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: cm.d */
/* loaded from: classes2.dex */
public final class TakeAwayMenuDetailActivity {
    /* renamed from: a */
    public static final void m34498a(AbstractC0304b abstractC0304b, Activity activity, TakeAwayFlowData takeAwayFlowData, TakeAwayProduct takeAwayProduct) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMenuDetailActivity.class);
        intent.putExtra("EXTRA_FOR_PRODUCT", takeAwayProduct);
        if (takeAwayFlowData != null) {
            intent.putExtra("EXTRA_FOR_FLOW_DATA", takeAwayFlowData);
        }
        abstractC0304b.m41324a(intent);
    }
}
