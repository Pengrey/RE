package p473yi;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.VirtualCardFlowData;

/* renamed from: yi.h */
/* loaded from: classes2.dex */
public final class VirtualCardPreferencesActivity {
    /* renamed from: a */
    public static final void m1376a(ActivityC0325c activityC0325c, VirtualCardFlowData virtualCardFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(virtualCardFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", virtualCardFlowData);
        activityC0325c.startActivity(intent);
    }
}
