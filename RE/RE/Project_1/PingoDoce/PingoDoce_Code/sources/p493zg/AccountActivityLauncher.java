package p493zg;

import android.app.Activity;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import bh.LoggedAccountActivity;
import p013ah.AnonymousAccountActivity;
import p181jd.Intrinsics;

/* renamed from: zg.a */
/* loaded from: classes2.dex */
public final class AccountActivityLauncher {
    /* renamed from: a */
    public static final void m157a(AbstractC0304b abstractC0304b, boolean z, Activity activity) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        if (z) {
            LoggedAccountActivity.m35146a(abstractC0304b, activity);
        } else {
            AnonymousAccountActivity.m41770a(abstractC0304b, activity);
        }
    }

    /* renamed from: b */
    public static final void m156b(ActivityC0325c activityC0325c, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        if (z) {
            LoggedAccountActivity.m35145b(activityC0325c);
        } else {
            AnonymousAccountActivity.m41769b(activityC0325c);
        }
    }
}
