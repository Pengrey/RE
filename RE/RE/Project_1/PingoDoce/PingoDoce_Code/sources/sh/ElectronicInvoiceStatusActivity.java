package sh;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData;

/* renamed from: sh.c */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceStatusActivity {
    /* renamed from: a */
    public static final void m8502a(ActivityC0325c activityC0325c, ElectronicInvoiceFlowData electronicInvoiceFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(electronicInvoiceFlowData, "data");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", electronicInvoiceFlowData);
        intent.addFlags(33554432);
        activityC0325c.startActivity(intent);
    }
}
