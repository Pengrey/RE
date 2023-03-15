package pt.pingodoce.app.presentation.landing.walkthrough;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1469p;
import hk.AppWalkThroughAdapter;
import hk.AppWalkThroughViewModel;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p299pj.WalkThroughActivity;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC12021t4;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.C13877n0;

/* compiled from: AppWalkThroughActivity.kt */
/* loaded from: classes2.dex */
public final class AppWalkThroughActivity extends WalkThroughActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24465f0;

    /* compiled from: AppWalkThroughActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.walkthrough.AppWalkThroughActivity$a */
    /* loaded from: classes2.dex */
    static final class C9294a extends AbstractC6438m implements InterfaceC6097a {
        C9294a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(AppWalkThroughActivity.this.m11842n1(), AppWalkThroughActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppWalkThroughActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.walkthrough.AppWalkThroughActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9295b extends AbstractC6438m implements InterfaceC6108l {
        C9295b() {
            super(1);
        }

        /* renamed from: a */
        public final void m11838a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            if (Intrinsics.equals((InterfaceC7186c) c13182l.m1460c(), C13877n0.f34992a)) {
                AppWalkThroughActivity.this.finish();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11838a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11847J0() {
        return C6450z.m20906b(AppWalkThroughViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11846K0() {
        return new C9294a();
    }

    /* renamed from: n1 */
    public final ViewModelFactoryByInjection m11842n1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24465f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o1 */
    public AppWalkThroughAdapter m11844k1() {
        FragmentManager m37323P = m37323P();
        Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
        AbstractC1469p mo137b = mo137b();
        Intrinsics.checkIfNull(mo137b, "lifecycle");
        return new AppWalkThroughAdapter(m37323P, mo137b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p1 */
    public void m11843l1(AbstractC12021t4 abstractC12021t4, AppWalkThroughViewModel appWalkThroughViewModel) {
        Intrinsics.isThisObjectNull(abstractC12021t4, "binding");
        Intrinsics.isThisObjectNull(appWalkThroughViewModel, "viewModel");
        super.m14963P0(abstractC12021t4, appWalkThroughViewModel);
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9295b()));
    }
}
