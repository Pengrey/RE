package p185ji;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.ClubWineFlowData;

/* renamed from: ji.y */
/* loaded from: classes2.dex */
public final class WineClubUpdateActivity {
    /* renamed from: a */
    public static final void m20787a(ActivityC0325c activityC0325c, boolean z, ClubWineFlowData clubWineFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(clubWineFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity.class);
        intent.putExtra("KEY_FOR_CLUB_SUBSCRIPTION", z);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", clubWineFlowData);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20786b(ActivityC0325c activityC0325c, boolean z, ClubWineFlowData clubWineFlowData, int i, Object obj) {
        if ((i & 2) != 0) {
            clubWineFlowData = new ClubWineFlowData(null, null, null, null, 15, null);
        }
        m20787a(activityC0325c, z, clubWineFlowData);
    }

    /* renamed from: c */
    public static final void m20785c(ActivityC0325c activityC0325c, boolean z, ClubWineFlowData clubWineFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(clubWineFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity.class);
        intent.putExtra("KEY_FOR_CLUB_SUBSCRIPTION", z);
        intent.putExtra("KEY_FOR_WINE_CLUB_TYPE", "region");
        intent.putExtra("EXTRA_EDIT_WINE", true);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", clubWineFlowData);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: d */
    public static /* synthetic */ void m20784d(ActivityC0325c activityC0325c, boolean z, ClubWineFlowData clubWineFlowData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            clubWineFlowData = new ClubWineFlowData(null, null, null, null, 15, null);
        }
        m20785c(activityC0325c, z, clubWineFlowData);
    }

    /* renamed from: e */
    public static final void m20783e(ActivityC0325c activityC0325c, boolean z, ClubWineFlowData clubWineFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(clubWineFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity.class);
        intent.putExtra("KEY_FOR_CLUB_SUBSCRIPTION", z);
        intent.putExtra("KEY_FOR_WINE_CLUB_TYPE", "wineType");
        intent.putExtra("EXTRA_EDIT_WINE", true);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", clubWineFlowData);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: f */
    public static /* synthetic */ void m20782f(ActivityC0325c activityC0325c, boolean z, ClubWineFlowData clubWineFlowData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            clubWineFlowData = new ClubWineFlowData(null, null, null, null, 15, null);
        }
        m20783e(activityC0325c, z, clubWineFlowData);
    }
}
