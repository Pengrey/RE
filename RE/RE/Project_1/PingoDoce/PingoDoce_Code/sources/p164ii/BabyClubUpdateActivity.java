package p164ii;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.ClubBabyFlowData;

/* renamed from: ii.l */
/* loaded from: classes2.dex */
public final class BabyClubUpdateActivity {
    /* renamed from: a */
    public static final void m22018a(ActivityC0325c activityC0325c, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity.class);
        intent.putExtra("KEY_FOR_CLUB_SUBSCRIPTION", z);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static final void m22017b(ActivityC0325c activityC0325c, ClubBabyFlowData clubBabyFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(clubBabyFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", clubBabyFlowData);
        intent.putExtra("EXTRA_EDIT_BABY", true);
        activityC0325c.startActivity(intent);
    }
}
