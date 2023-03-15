package mk;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: mk.f */
/* loaded from: classes2.dex */
public final class UpdatePhoneActivity {
    /* renamed from: a */
    public static final void m18356a(AbstractC0304b abstractC0304b, Activity activity) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        abstractC0304b.m41324a(new Intent(activity, pt.pingodoce.app.presentation.login.phone.update.UpdatePhoneActivity.class));
    }

    /* renamed from: b */
    public static final void m18355b(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        activityC0325c.startActivity(new Intent(activityC0325c, pt.pingodoce.app.presentation.login.phone.update.UpdatePhoneActivity.class));
    }
}
