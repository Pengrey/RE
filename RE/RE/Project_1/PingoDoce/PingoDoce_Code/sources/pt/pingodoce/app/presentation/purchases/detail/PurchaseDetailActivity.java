package pt.pingodoce.app.presentation.purchases.detail;

import android.os.Bundle;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2141e;
import ci.FlowActivity;
import ci.InterfaceC2154o;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p050d.C4519c;
import p146hl.PurchaseDetailAdapter;
import p146hl.PurchaseDetailViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p188jl.PurchaseProductsActivity;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p426wg.AbstractC12060v2;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.CollectionsJVM;
import pe.C8617d;
import pe.C8618e;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailActivity;
import td.InterfaceC10524i0;

/* compiled from: PurchaseDetailActivity.kt */
/* loaded from: classes2.dex */
public final class PurchaseDetailActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24597g0;

    /* renamed from: h0 */
    private final PurchaseDetailAdapter f24598h0 = new PurchaseDetailAdapter(new C9359a());

    /* renamed from: i0 */
    private final AbstractC0304b f24599i0;

    /* compiled from: PurchaseDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9359a extends AbstractC6438m implements InterfaceC6108l {
        C9359a() {
            super(1);
        }

        /* renamed from: a */
        public final void m11470a(Purchase purchase) {
            Intrinsics.isThisObjectNull(purchase, "it");
            PurchaseDetailActivity.m11476v1(PurchaseDetailActivity.this).m22560d0(purchase.m14427t());
            PurchaseProductsActivity.m20707a(PurchaseDetailActivity.m11478u1(PurchaseDetailActivity.this), PurchaseDetailActivity.this);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11470a((Purchase) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: PurchaseDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailActivity$b */
    /* loaded from: classes2.dex */
    static final class C9360b extends AbstractC6438m implements InterfaceC6097a {
        C9360b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11473x1 = PurchaseDetailActivity.this.m11473x1();
            PurchaseDetailActivity purchaseDetailActivity = PurchaseDetailActivity.this;
            return m11473x1.m20377b(purchaseDetailActivity, purchaseDetailActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseDetailActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailActivity$initViews$1$1", m20196f = "PurchaseDetailActivity.kt", m20195l = {89}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9361c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24602x;

        /* renamed from: z */
        final /* synthetic */ List f24604z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9361c(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24604z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9361c(this.f24604z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9361c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24602x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchaseDetailAdapter m11479t1 = PurchaseDetailActivity.m11479t1(PurchaseDetailActivity.this);
                List list = this.f24604z;
                Intrinsics.checkIfNull(list, "it");
                this.f24602x = 1;
                if (m11479t1.m22148H(list, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    public PurchaseDetailActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: hl.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                PurchaseDetailActivity.m11475w1(PurchaseDetailActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…Historic)\n        }\n    }");
        this.f24599i0 = m41364M;
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m11481r1(PurchaseDetailActivity purchaseDetailActivity, List list) {
        m11471z1(purchaseDetailActivity, list);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m11480s1(PurchaseDetailActivity purchaseDetailActivity, ActivityResult activityResult) {
        m11475w1(purchaseDetailActivity, activityResult);
    }

    /* renamed from: t1 */
    public static final /* synthetic */ PurchaseDetailAdapter m11479t1(PurchaseDetailActivity purchaseDetailActivity) {
        return purchaseDetailActivity.f24598h0;
    }

    /* renamed from: u1 */
    public static final /* synthetic */ AbstractC0304b m11478u1(PurchaseDetailActivity purchaseDetailActivity) {
        return purchaseDetailActivity.f24599i0;
    }

    /* renamed from: v1 */
    public static final /* synthetic */ PurchaseDetailViewModel m11476v1(PurchaseDetailActivity purchaseDetailActivity) {
        return (PurchaseDetailViewModel) purchaseDetailActivity.m22758I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m11475w1(PurchaseDetailActivity purchaseDetailActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(purchaseDetailActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            ((PurchaseDetailViewModel) purchaseDetailActivity.m22758I0()).m104v(C2141e.f6176a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m11471z1(PurchaseDetailActivity purchaseDetailActivity, List list) {
        Intrinsics.isThisObjectNull(purchaseDetailActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(purchaseDetailActivity), null, null, new C9361c(list, null), 3, null);
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_SLIDE_ON_TOP")) {
            z = false;
        }
        return z ? C2336R.C2337drawable.ic_close : C2336R.C2337drawable.ic_arrow_back;
    }

    /* renamed from: G0 */
    protected int m11491G0() {
        return C2336R.string.lbl_purchase_detail_title;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11490J0() {
        return C6450z.m20906b(PurchaseDetailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11489K0() {
        return new C9360b();
    }

    /* renamed from: M0 */
    protected boolean m11488M0() {
        return true;
    }

    /* renamed from: k1 */
    protected List m11486k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2141e.f6176a);
        return m202b;
    }

    /* renamed from: l1 */
    protected void m11485l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        if (Intrinsics.equals(interfaceC2154o, C2141e.f6176a)) {
            setResult(-1);
        }
    }

    /* renamed from: m1 */
    public void m11484m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: n */
    public boolean m11483n() {
        return true;
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_SLIDE_ON_TOP")) {
            z = false;
        }
        return z ? new C8618e() : new C8617d();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_purchase_detail;
    }

    /* renamed from: x1 */
    public final ViewModelFactoryByInjection m11473x1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24597g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y1 */
    public void m11482n1(AbstractC12060v2 abstractC12060v2, PurchaseDetailViewModel purchaseDetailViewModel) {
        Intrinsics.isThisObjectNull(abstractC12060v2, "binding");
        Intrinsics.isThisObjectNull(purchaseDetailViewModel, "viewModel");
        super.m34589n1(abstractC12060v2, purchaseDetailViewModel);
        abstractC12060v2.f31704B.setAdapter(this.f24598h0);
        purchaseDetailViewModel.m22557g0().mo171i(this, new InterfaceC1440f0() { // from class: hl.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PurchaseDetailActivity.m11471z1(PurchaseDetailActivity.this, (List) obj);
            }
        });
    }
}
