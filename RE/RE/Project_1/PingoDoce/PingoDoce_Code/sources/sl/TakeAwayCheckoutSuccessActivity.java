package sl;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import androidx.core.app.C0890c;
import androidx.core.content.C0928a;
import androidx.core.util.C1072d;
import com.google.android.material.button.MaterialButton;
import p181jd.Intrinsics;
import p426wg.AbstractC12031te;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: sl.f */
/* loaded from: classes2.dex */
public final class TakeAwayCheckoutSuccessActivity {
    /* renamed from: a */
    public static final void m8398a(ActivityC0325c activityC0325c, TakeAwayCheckout takeAwayCheckout, AbstractC12031te abstractC12031te, MaterialButton materialButton) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(takeAwayCheckout, "status");
        Intrinsics.isThisObjectNull(materialButton, "buttonView");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.takeaway.orders.checkout.TakeAwayCheckoutSuccessActivity.class);
        intent.putExtra("EXTRA_FOR_PICKUP_TAKE_AWAY_ORDER_STATUS", takeAwayCheckout);
        if (abstractC12031te == null) {
            activityC0325c.startActivity(intent);
        } else {
            C0928a.m39104m(activityC0325c, intent, C0890c.m39251a(activityC0325c, new C1072d(abstractC12031te.f31568z, "TRANSITION_STORE_VIEW"), new C1072d(abstractC12031te.f31566x, "TRANSITION_DAY_VIEW"), new C1072d(abstractC12031te.f31564A, "TRANSITION_TIME_VIEW"), new C1072d(materialButton, "TRANSITION_BUTTON")).mo39250b());
        }
    }
}
