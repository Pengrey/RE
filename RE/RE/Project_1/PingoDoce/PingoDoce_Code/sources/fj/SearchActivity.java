package fj;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: fj.u */
/* loaded from: classes2.dex */
public final class SearchActivity {
    /* renamed from: a */
    public static final void m23751a(AbstractC0304b abstractC0304b, Activity activity, Boolean bool, Integer num) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.common.search.SearchActivity.class);
        if (bool != null) {
            bool.booleanValue();
            intent.putExtra("EXTRA_FOR_HAS_PROMO", bool.booleanValue());
        }
        if (num != null) {
            num.intValue();
            intent.putExtra("EXTRA_FOR_FLYER_ID", num.intValue());
        }
        abstractC0304b.m41324a(intent);
    }

    /* renamed from: b */
    public static final void m23750b(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        activityC0325c.startActivity(new Intent(activityC0325c, pt.pingodoce.app.presentation.common.search.SearchActivity.class));
    }

    /* renamed from: c */
    public static /* synthetic */ void m23749c(AbstractC0304b abstractC0304b, Activity activity, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        m23751a(abstractC0304b, activity, bool, num);
    }

    /* renamed from: d */
    public static final void m23748d(AbstractC0304b abstractC0304b, Activity activity, String str) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.common.search.SearchActivity.class);
        intent.putExtra("EXTRA_FOR_TRADE", true);
        if (str != null) {
            intent.putExtra("EXTRA_FOR_QUERY", str);
        }
        abstractC0304b.m41324a(intent);
    }

    /* renamed from: e */
    public static /* synthetic */ void m23747e(AbstractC0304b abstractC0304b, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        m23748d(abstractC0304b, activity, str);
    }
}
