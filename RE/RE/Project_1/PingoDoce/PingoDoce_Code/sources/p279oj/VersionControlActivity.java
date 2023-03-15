package p279oj;

import android.app.Application;
import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: oj.c */
/* loaded from: classes2.dex */
public final class VersionControlActivity {
    /* renamed from: a */
    public static final void m16919a(Application application) {
        Intrinsics.isThisObjectNull(application, "<this>");
        application.startActivity(new Intent(application, pt.pingodoce.app.presentation.common.versioncontrol.VersionControlActivity.class));
    }

    /* renamed from: b */
    public static final void m16918b(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        activityC0325c.startActivity(new Intent(activityC0325c, pt.pingodoce.app.presentation.common.versioncontrol.VersionControlActivity.class));
    }
}
