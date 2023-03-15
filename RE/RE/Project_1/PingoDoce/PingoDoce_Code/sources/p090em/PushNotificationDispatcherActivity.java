package p090em;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: em.c */
/* loaded from: classes2.dex */
public final class PushNotificationDispatcherActivity {
    /* renamed from: a */
    public static final void m25577a(ActivityC0325c activityC0325c, String str) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(str, "productId");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.services.PushNotificationDispatcherActivity.class);
        intent.putExtra("EXTRAS_PRODUCT_ID", str);
        activityC0325c.startActivity(intent);
    }
}
