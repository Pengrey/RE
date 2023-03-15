package p390uj;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: uj.u */
/* loaded from: classes2.dex */
public final class HomeActivity {
    /* renamed from: a */
    public static final void m6744a(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.home.HomeActivity.class);
        intent.putExtra("EXTRA_FOR_BENEFITS_AT_HOME_PAGE", true);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static final void m6743b(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        activityC0325c.startActivity(new Intent(activityC0325c, pt.pingodoce.app.presentation.home.HomeActivity.class));
    }

    /* renamed from: c */
    public static final void m6742c(ActivityC0325c activityC0325c, String str) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(str, "bannerId");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.home.HomeActivity.class);
        intent.putExtra("EXTRAS_BANNER_ID", str);
        intent.putExtra("EXTRAS_IS_BANNER", true);
        activityC0325c.startActivity(intent);
    }
}
