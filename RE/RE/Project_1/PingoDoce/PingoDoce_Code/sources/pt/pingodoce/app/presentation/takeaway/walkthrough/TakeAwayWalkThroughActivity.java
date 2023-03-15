package pt.pingodoce.app.presentation.takeaway.walkthrough;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1469p;
import dm.TakeAwayWalkThroughAdapter;
import dm.TakeAwayWalkThroughViewModel;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p299pj.WalkThroughActivity;
import p314qd.InterfaceC9717b;

/* compiled from: TakeAwayWalkThroughActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayWalkThroughActivity extends WalkThroughActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f25071f0;

    /* compiled from: TakeAwayWalkThroughActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.walkthrough.TakeAwayWalkThroughActivity$a */
    /* loaded from: classes2.dex */
    static final class C9536a extends AbstractC6438m implements InterfaceC6097a {
        C9536a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(TakeAwayWalkThroughActivity.this.m10701n1(), TakeAwayWalkThroughActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10705J0() {
        return C6450z.m20906b(TakeAwayWalkThroughViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10704K0() {
        return new C9536a();
    }

    /* renamed from: n */
    public boolean m10702n() {
        return true;
    }

    /* renamed from: n1 */
    public final ViewModelFactoryByInjection m10701n1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25071f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o1 */
    public TakeAwayWalkThroughAdapter m10703k1() {
        FragmentManager m37323P = m37323P();
        Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
        AbstractC1469p mo137b = mo137b();
        Intrinsics.checkIfNull(mo137b, "lifecycle");
        return new TakeAwayWalkThroughAdapter(m37323P, mo137b);
    }
}
