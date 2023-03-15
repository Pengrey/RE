package p322ql;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingActivity;
import pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.AnonymousSessionTakeAwayLandingActivity;

/* renamed from: ql.a */
/* loaded from: classes2.dex */
public final class Launchers {
    /* renamed from: a */
    public static final void m10001a(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        activityC0325c.startActivity(new Intent(activityC0325c, AnonymousSessionTakeAwayLandingActivity.class));
    }

    /* renamed from: b */
    private static final void m10000b(ActivityC0325c activityC0325c) {
        activityC0325c.startActivity(new Intent(activityC0325c, TakeAwayLandingActivity.class));
    }

    /* renamed from: c */
    public static final void m9999c(ActivityC0325c activityC0325c, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        if (z) {
            m10000b(activityC0325c);
        } else {
            m10001a(activityC0325c);
        }
    }
}
