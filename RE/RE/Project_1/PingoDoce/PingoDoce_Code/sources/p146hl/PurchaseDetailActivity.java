package p146hl;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity;

/* renamed from: hl.c */
/* loaded from: classes2.dex */
public final class PurchaseDetailActivity {
    /* renamed from: a */
    public static final void m22580a(AbstractC0304b abstractC0304b, Activity activity, String str, String str2, int i, String str3, boolean z) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "storeName");
        Intrinsics.isThisObjectNull(str3, "date");
        Intent intent = new Intent(activity, PurchaseListActivity.class);
        intent.putExtra("EXTRA_FOR_PURCHASE_ID", str);
        intent.putExtra("EXTRA_FOR_STORE_NAME", str2);
        intent.putExtra("EXTRA_FOR_ITEM_COUNT", i);
        intent.putExtra("EXTRA_FOR_PURCHASE_DATE", str3);
        intent.putExtra("EXTRA_FOR_SLIDE_ON_TOP", z);
        abstractC0304b.m41324a(intent);
    }

    /* renamed from: b */
    public static final void m22579b(ActivityC0325c activityC0325c, String str, String str2, int i, String str3, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(str, "id");
        Intrinsics.isThisObjectNull(str2, "storeName");
        Intrinsics.isThisObjectNull(str3, "date");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailActivity.class);
        intent.putExtra("EXTRA_FOR_PURCHASE_ID", str);
        intent.putExtra("EXTRA_FOR_STORE_NAME", str2);
        intent.putExtra("EXTRA_FOR_ITEM_COUNT", i);
        intent.putExtra("EXTRA_FOR_PURCHASE_DATE", str3);
        intent.putExtra("EXTRA_FOR_SLIDE_ON_TOP", z);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: c */
    public static /* synthetic */ void m22578c(AbstractC0304b abstractC0304b, Activity activity, String str, String str2, int i, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z = true;
        }
        m22580a(abstractC0304b, activity, str, str2, i, str3, z);
    }
}
