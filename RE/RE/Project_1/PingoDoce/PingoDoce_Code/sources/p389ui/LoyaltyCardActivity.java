package p389ui;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import androidx.core.app.C0890c;
import androidx.core.content.C0928a;
import androidx.core.util.C1072d;
import androidx.fragment.app.Fragment;
import p181jd.Intrinsics;
import p426wg.AbstractC12028tb;

/* renamed from: ui.b */
/* loaded from: classes2.dex */
public final class LoyaltyCardActivity {
    /* renamed from: a */
    public static final void m6785a(ActivityC0325c activityC0325c, AbstractC12028tb abstractC12028tb) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity.class);
        if (abstractC12028tb == null) {
            activityC0325c.startActivity(intent);
        } else {
            C0928a.m39104m(activityC0325c, intent, C0890c.m39251a(activityC0325c, new C1072d(abstractC12028tb.f31549z, "TRANSITION_VIEW"), new C1072d(abstractC12028tb.f31538A, "TRANSITION_EAN_AREA"), new C1072d(abstractC12028tb.f31547x, "TRANSITION_BARCODE"), new C1072d(abstractC12028tb.f31540C, "TRANSITION_NUMBER")).mo39250b());
        }
    }

    /* renamed from: b */
    public static final void m6784b(Fragment fragment, AbstractC12028tb abstractC12028tb) {
        Intrinsics.isThisObjectNull(fragment, "<this>");
        Intent intent = new Intent(fragment.m37652G1(), pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity.class);
        if (abstractC12028tb == null) {
            fragment.m37595c2(intent);
        } else {
            C0928a.m39104m(fragment.m37652G1(), intent, C0890c.m39251a(fragment.m37652G1(), new C1072d(abstractC12028tb.f31549z, "TRANSITION_VIEW"), new C1072d(abstractC12028tb.f31538A, "TRANSITION_EAN_AREA"), new C1072d(abstractC12028tb.f31547x, "TRANSITION_BARCODE"), new C1072d(abstractC12028tb.f31540C, "TRANSITION_NUMBER")).mo39250b());
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m6783c(ActivityC0325c activityC0325c, AbstractC12028tb abstractC12028tb, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC12028tb = null;
        }
        m6785a(activityC0325c, abstractC12028tb);
    }

    /* renamed from: d */
    public static /* synthetic */ void m6782d(Fragment fragment, AbstractC12028tb abstractC12028tb, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC12028tb = null;
        }
        m6784b(fragment, abstractC12028tb);
    }
}
