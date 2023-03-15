package ag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0325c;
import id.InterfaceC6097a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.TransactionCacheManager;
import p106fe.IntentUtils;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11914nc;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import pt.pingodoce.app.data.remote.models.response.Flyer;
import sj.FlyerActivity;
import vc.AbstractC11206d;

/* renamed from: ag.b */
/* loaded from: classes2.dex */
public final class FlyersFragment extends AbstractC11206d {

    /* renamed from: x0 */
    public TransactionCacheManager f309x0;

    /* renamed from: y0 */
    private final InterfaceC13178g f310y0;

    /* renamed from: z0 */
    private AbstractC11914nc f311z0;

    /* compiled from: FlyersFragment.kt */
    /* renamed from: ag.b$a */
    /* loaded from: classes2.dex */
    public static final class C0136a {
        private C0136a() {
        }

        public /* synthetic */ C0136a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FlyersFragment.kt */
    /* renamed from: ag.b$b */
    /* loaded from: classes2.dex */
    static final class C0137b extends AbstractC6438m implements InterfaceC6097a {
        C0137b() {
            super(0);
        }

        /* renamed from: a */
        public final Flyer mo42214q() {
            return FlyersFragment.this.m41775h2().m18584f();
        }
    }

    static {
        new C0136a(null);
    }

    public FlyersFragment() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C0137b());
        this.f310y0 = m1464a;
    }

    /* renamed from: g2 */
    public static /* synthetic */ void m41776g2(FlyersFragment flyersFragment, View view) {
        m41773j2(flyersFragment, view);
    }

    /* renamed from: i2 */
    private final Flyer m41774i2() {
        return (Flyer) this.f310y0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m41773j2(FlyersFragment flyersFragment, View view) {
        Intrinsics.isThisObjectNull(flyersFragment, "this$0");
        ActivityC0325c activityC0325c = (ActivityC0325c) flyersFragment.m37652G1();
        if (flyersFragment.m41774i2().m13832m()) {
            IntentUtils.m24293a(activityC0325c, flyersFragment.m41774i2().m13836h());
        } else {
            FlyerActivity.m8458a(activityC0325c, flyersFragment.m41774i2(), flyersFragment.m41775h2());
        }
    }

    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.isThisObjectNull(layoutInflater, "inflater");
        AbstractC11914nc m3975Q = AbstractC11914nc.m3975Q(layoutInflater, viewGroup, false);
        Intrinsics.checkIfNull(m3975Q, "inflate(inflater, container, false)");
        this.f311z0 = m3975Q;
        AbstractC11914nc abstractC11914nc = null;
        if (m3975Q == null) {
            Intrinsics.throwUninitPropException("binding");
            m3975Q = null;
        }
        m3975Q.mo3919S(m41774i2());
        AbstractC11914nc abstractC11914nc2 = this.f311z0;
        if (abstractC11914nc2 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC11914nc2 = null;
        }
        abstractC11914nc2.f31059x.setOnClickListener(new View.OnClickListener() { // from class: ag.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlyersFragment.m41773j2(FlyersFragment.this, view);
            }
        });
        AbstractC11914nc abstractC11914nc3 = this.f311z0;
        if (abstractC11914nc3 == null) {
            Intrinsics.throwUninitPropException("binding");
        } else {
            abstractC11914nc = abstractC11914nc3;
        }
        View m37802s = abstractC11914nc.m37802s();
        Intrinsics.checkIfNull(m37802s, "binding.root");
        return m37802s;
    }

    /* renamed from: h2 */
    public final TransactionCacheManager m41775h2() {
        TransactionCacheManager transactionCacheManager = this.f309x0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }
}
