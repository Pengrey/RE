package p206kk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: kk.b */
/* loaded from: classes2.dex */
public final class FetchTermsAndConditionsActivity {
    /* renamed from: a */
    public static final void m20280a(ActivityC0325c activityC0325c, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.login.phone.terms.FetchTermsAndConditionsActivity.class);
        intent.putExtra("EXTRA_FOR_BACKGROUND", z);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20279b(ActivityC0325c activityC0325c, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        m20280a(activityC0325c, z);
    }
}
