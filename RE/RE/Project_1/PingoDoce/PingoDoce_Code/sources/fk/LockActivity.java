package fk;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.ActivityC0325c;
import androidx.core.app.C0890c;
import androidx.core.content.C0928a;
import androidx.core.util.C1072d;
import p181jd.Intrinsics;

/* renamed from: fk.m */
/* loaded from: classes2.dex */
public final class LockActivity {
    /* renamed from: a */
    public static final void m23739a(ActivityC0325c activityC0325c, View view) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.landing.lock.LockActivity.class);
        intent.addFlags(131072);
        if (view == null) {
            activityC0325c.startActivity(intent);
        } else {
            C0928a.m39104m(activityC0325c, intent, C0890c.m39251a(activityC0325c, new C1072d(view, "TRANSITION_IMAGE")).mo39250b());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m23738b(ActivityC0325c activityC0325c, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        m23739a(activityC0325c, view);
    }

    /* renamed from: c */
    public static final void m23737c(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.landing.lock.LockActivity.class);
        intent.addFlags(131072);
        intent.putExtra("EXTRA_FOR_VERSION_CONTROL", true);
        activityC0325c.startActivity(intent);
    }
}
