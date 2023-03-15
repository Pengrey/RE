package p318qh;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;

/* renamed from: qh.f */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceEmailActivity {
    /* renamed from: a */
    public static final void m10079a(ActivityC0325c activityC0325c, PhoneFlowData phoneFlowData) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(phoneFlowData, "flowData");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.email.ElectronicInvoiceEmailActivity.class);
        intent.putExtra("EXTRA_FOR_FLOW_DATA", new ElectronicInvoiceFlowData(phoneFlowData.m14701b(), null, null, false, 14, null));
        intent.addFlags(33554432);
        activityC0325c.startActivity(intent);
    }
}
