package p308q6;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.AbstractC2472b;
import com.google.android.gms.common.api.internal.C2481a;
import com.google.android.gms.common.api.internal.InterfaceC2535q;
import p217l7.C6998g;
import p291p6.C8436a;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: q6.b */
/* loaded from: classes.dex */
public class C9668b extends AbstractC2472b<C8436a.C8437a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9668b(Activity activity, C8436a.C8437a c8437a) {
        super(activity, C8436a.f21832a, c8437a, (InterfaceC2535q) new C2481a());
    }

    @RecentlyNonNull
    /* renamed from: u */
    public PendingIntent m10229u(@RecentlyNonNull HintRequest hintRequest) {
        return C6998g.m19635a(m33489m(), m33490l(), hintRequest, m33490l().m15402e());
    }
}
