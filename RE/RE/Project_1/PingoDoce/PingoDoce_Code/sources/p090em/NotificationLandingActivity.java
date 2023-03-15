package p090em;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* compiled from: NotificationLandingActivity.kt */
/* renamed from: em.a */
/* loaded from: classes2.dex */
public final class NotificationLandingActivity {
    /* renamed from: a */
    public static final void startActivityWithIntentIfNotNull(ActivityC0325c activityC0325c, Intent intent) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(intent, "forwardIntent");
        Intent intent2 = new Intent(activityC0325c, pt.pingodoce.app.services.NotificationLandingActivity.class);
        intent2.putExtras(intent);
        activityC0325c.startActivity(intent2);
    }
}
