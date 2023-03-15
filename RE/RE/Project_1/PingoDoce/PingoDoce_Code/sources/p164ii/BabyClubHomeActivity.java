package p164ii;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: ii.f */
/* loaded from: classes2.dex */
public final class BabyClubHomeActivity {
    /* renamed from: a */
    public static final void m22025a(ActivityC0325c activityC0325c, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity.class);
        intent.putExtra("KEY_FOR_CLUB_SUBSCRIPTION", z);
        activityC0325c.startActivity(intent);
    }
}
