package tl;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import p181jd.Intrinsics;

/* renamed from: tl.a */
/* loaded from: classes2.dex */
public final class TakeAwayEditEmailActivity {
    /* renamed from: a */
    public static final void m7432a(AbstractC0304b abstractC0304b, Activity activity, String str) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(str, "email");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.takeaway.orders.checkout.email.TakeAwayEditEmailActivity.class);
        intent.putExtra("EXTRA_FOR_EMAIL", str);
        abstractC0304b.m41324a(intent);
    }
}
