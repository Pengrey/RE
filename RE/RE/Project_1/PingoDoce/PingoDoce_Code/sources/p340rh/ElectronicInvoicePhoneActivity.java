package p340rh;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: rh.a */
/* loaded from: classes2.dex */
public final class ElectronicInvoicePhoneActivity {
    /* renamed from: a */
    public static final void m9737a(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.phone.ElectronicInvoicePhoneActivity.class);
        intent.addFlags(33554432);
        activityC0325c.startActivity(intent);
    }
}
