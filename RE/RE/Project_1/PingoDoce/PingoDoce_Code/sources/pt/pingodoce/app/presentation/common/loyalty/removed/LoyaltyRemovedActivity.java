package pt.pingodoce.app.presentation.common.loyalty.removed;

import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11721d1;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13914w;
import p496zj.CardRegistrationLandingActivity;
import pe.C8617d;

/* compiled from: LoyaltyRemovedActivity.kt */
/* loaded from: classes2.dex */
public final class LoyaltyRemovedActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23876f0;

    /* compiled from: LoyaltyRemovedActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyalty.removed.LoyaltyRemovedActivity$a */
    /* loaded from: classes2.dex */
    static final class C9058a extends AbstractC6438m implements InterfaceC6097a {
        C9058a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(LoyaltyRemovedActivity.this.m12711j1(), LoyaltyRemovedActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyRemovedActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyalty.removed.LoyaltyRemovedActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9059b extends AbstractC6438m implements InterfaceC6108l {
        C9059b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12706a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            if (Intrinsics.equals((InterfaceC7186c) c13182l.m1460c(), C13914w.f35035a)) {
                CardRegistrationLandingActivity.m59b(LoyaltyRemovedActivity.this);
                LoyaltyRemovedActivity.this.finish();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12706a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12716J0() {
        return C6450z.m20906b(LoyaltyRemovedViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12715K0() {
        return new C9058a();
    }

    /* renamed from: S0 */
    protected boolean m12713S0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m12711j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23876f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m12714P0(AbstractC11721d1 abstractC11721d1, LoyaltyRemovedViewModel loyaltyRemovedViewModel) {
        Intrinsics.isThisObjectNull(abstractC11721d1, "binding");
        Intrinsics.isThisObjectNull(loyaltyRemovedViewModel, "viewModel");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9059b()));
    }

    /* renamed from: n */
    public boolean m12709n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_removed;
    }
}
