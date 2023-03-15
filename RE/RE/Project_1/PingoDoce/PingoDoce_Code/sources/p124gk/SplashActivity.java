package p124gk;

import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.p300goto.PushActionGotoType;

/* renamed from: gk.a */
/* loaded from: classes2.dex */
public final class SplashActivity {
    /* renamed from: a */
    public static final void m23308a(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.landing.splash.SplashActivity.class);
        intent.addFlags(268468224);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static final void m23307b(Application application) {
        Intrinsics.isThisObjectNull(application, "<this>");
        Intent intent = new Intent(application, pt.pingodoce.app.presentation.landing.splash.SplashActivity.class);
        intent.putExtra("EXTRA_FOR_RESET", true);
        intent.addFlags(335544320);
        application.startActivity(intent);
    }

    /* renamed from: c */
    public static final void m23306c(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.landing.splash.SplashActivity.class);
        intent.putExtra("EXTRA_FOR_RESET", true);
        intent.addFlags(335544320);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: d */
    public static final void m23305d(ActivityC0325c activityC0325c, PushActionGotoType pushActionGotoType) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(pushActionGotoType, "menu");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.landing.splash.SplashActivity.class);
        intent.putExtra("goto", (Parcelable) pushActionGotoType);
        intent.addFlags(268468224);
        activityC0325c.startActivity(intent);
    }
}
