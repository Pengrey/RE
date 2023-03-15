package p140he;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentViewModelLazy;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.InterfaceC1488t0;
import id.InterfaceC6097a;
import ke.CoreBaseViewModel;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import vc.AbstractC11206d;

/* renamed from: he.f */
/* loaded from: classes2.dex */
public abstract class CoreBaseFragment<ViewBinding extends ViewDataBinding, ViewModel extends CoreBaseViewModel> extends AbstractC11206d {

    /* renamed from: x0 */
    private final InterfaceC13178g f16380x0;

    /* renamed from: y0 */
    private ViewDataBinding f16381y0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseFragment.kt */
    /* renamed from: he.f$a */
    /* loaded from: classes2.dex */
    public static final class C5922a extends AbstractC6438m implements InterfaceC6097a {
        C5922a() {
            super(0);
        }

        /* renamed from: a */
        public final CoreBaseViewModel mo42214q() {
            return CoreBaseFragment.m22724g2(CoreBaseFragment.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseFragment.kt */
    /* renamed from: he.f$b */
    /* loaded from: classes2.dex */
    public static final class C5923b extends AbstractC6438m implements InterfaceC6097a {
        C5923b() {
            super(0);
        }

        /* renamed from: a */
        public final CoreBaseFragment mo42214q() {
            return CoreBaseFragment.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseFragment.kt */
    /* renamed from: he.f$c */
    /* loaded from: classes2.dex */
    public static final class C5924c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f16384w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5924c(InterfaceC6097a interfaceC6097a) {
            super(0);
            this.f16384w = interfaceC6097a;
        }

        /* renamed from: a */
        public final C1486s0 mo42214q() {
            C1486s0 mo36970z = ((InterfaceC1488t0) this.f16384w.mo42214q()).mo36970z();
            Intrinsics.checkIfNull(mo36970z, "ownerProducer().viewModelStore");
            return mo36970z;
        }
    }

    public CoreBaseFragment() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C5922a());
        this.f16380x0 = m1464a;
    }

    /* renamed from: g2 */
    public static final /* synthetic */ CoreBaseViewModel m22724g2(CoreBaseFragment coreBaseFragment) {
        return coreBaseFragment.m22718n2();
    }

    /* renamed from: n2 */
    private final CoreBaseViewModel m22718n2() {
        return m22717o2(m22714r2(this, m22720k2(), null, m22719l2(), 2, null));
    }

    /* renamed from: o2 */
    private static final CoreBaseViewModel m22717o2(InterfaceC13178g interfaceC13178g) {
        return (CoreBaseViewModel) interfaceC13178g.getValue();
    }

    /* renamed from: q2 */
    private final InterfaceC13178g m22715q2(InterfaceC9717b interfaceC9717b, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2) {
        return FragmentViewModelLazy.m37123a(this, interfaceC9717b, new C5924c(interfaceC6097a), interfaceC6097a2);
    }

    /* renamed from: r2 */
    static /* synthetic */ InterfaceC13178g m22714r2(CoreBaseFragment coreBaseFragment, InterfaceC9717b interfaceC9717b, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                interfaceC6097a = new C5923b();
            }
            if ((i & 4) != 0) {
                interfaceC6097a2 = null;
            }
            return coreBaseFragment.m22715q2(interfaceC9717b, interfaceC6097a, interfaceC6097a2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: viewModels");
    }

    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.isThisObjectNull(layoutInflater, "inflater");
        ViewDataBinding m37764e = C1275f.m37764e(layoutInflater, m22722i2(), viewGroup, false);
        Intrinsics.checkIfNull(m37764e, "inflate(inflater, getLay…esId(), container, false)");
        this.f16381y0 = m37764e;
        m22723h2().mo3593M(mo122m2(), m22721j2());
        m22723h2().mo3594K(m37582i0());
        m22716p2(m22723h2(), m22721j2());
        return m22723h2().m37802s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h2 */
    public final ViewDataBinding m22723h2() {
        ViewDataBinding viewDataBinding = this.f16381y0;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        Intrinsics.throwUninitPropException("binding");
        return null;
    }

    /* renamed from: i2 */
    protected abstract int m22722i2();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j2 */
    public final CoreBaseViewModel m22721j2() {
        return (CoreBaseViewModel) this.f16380x0.getValue();
    }

    /* renamed from: k2 */
    protected abstract InterfaceC9717b m22720k2();

    /* renamed from: l2 */
    protected InterfaceC6097a m22719l2() {
        return null;
    }

    /* renamed from: m2 */
    protected abstract int mo122m2();

    /* renamed from: p2 */
    protected abstract void m22716p2(ViewDataBinding viewDataBinding, CoreBaseViewModel coreBaseViewModel);
}
