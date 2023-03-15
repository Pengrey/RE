package il;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: il.e */
/* loaded from: classes2.dex */
public final class PurchaseListActivity {
    /* renamed from: a */
    public static final void m21959a(AbstractC0304b abstractC0304b, Activity activity, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity.class);
        intent.putExtra("EXTRA_FOR_SLIDE_ON_TOP", z);
        intent.putExtra("EXTRA_FROM_MOSAIC_CLICK", z2);
        abstractC0304b.m41324a(intent);
    }

    /* renamed from: b */
    public static final void m21958b(ActivityC0325c activityC0325c, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity.class);
        intent.putExtra("EXTRA_FOR_SLIDE_ON_TOP", z);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: c */
    public static /* synthetic */ void m21957c(AbstractC0304b abstractC0304b, Activity activity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        m21959a(abstractC0304b, activity, z, z2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m21956d(ActivityC0325c activityC0325c, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        m21958b(activityC0325c, z);
    }
}
