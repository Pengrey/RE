package ch;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: ch.a */
/* loaded from: classes2.dex */
public final class LoyaltyActivity {
    /* renamed from: a */
    public static final void m34604a(ActivityC0325c activityC0325c, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity.class);
        intent.putExtra("EXTRA_FOR_PUSH_NOTIFICATION", z);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m34603b(ActivityC0325c activityC0325c, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        m34604a(activityC0325c, z);
    }
}
