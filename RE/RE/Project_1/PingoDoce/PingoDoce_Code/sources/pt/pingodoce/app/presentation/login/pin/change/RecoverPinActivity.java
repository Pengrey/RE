package pt.pingodoce.app.presentation.login.pin.change;

import android.content.Intent;
import androidx.lifecycle.AbstractC1423a;
import ci.C2146h;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p014aj.EnumC0170a;
import p014aj.PinActivity;
import p088ek.IntroActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p280ok.RecoverPinViewModel;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11865l2;
import p468yc.C13182l;
import p489zc.CollectionsJVM;
import p494zh.AbstractC13816c;
import p494zh.C13877n0;
import pe.C8617d;

/* compiled from: RecoverPinActivity.kt */
/* loaded from: classes2.dex */
public final class RecoverPinActivity extends PinActivity {

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f24491j0;

    /* compiled from: RecoverPinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.pin.change.RecoverPinActivity$a */
    /* loaded from: classes2.dex */
    static final class C9309a extends AbstractC6438m implements InterfaceC6097a {
        C9309a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11765L1 = RecoverPinActivity.this.m11765L1();
            RecoverPinActivity recoverPinActivity = RecoverPinActivity.this;
            Intent intent = recoverPinActivity.getIntent();
            return m11765L1.m20377b(recoverPinActivity, intent != null ? intent.getExtras() : null);
        }
    }

    /* renamed from: J1 */
    private final void m11768J1() {
        ((RecoverPinViewModel) m22758I0()).m16901n1();
        m41666z1(EnumC0170a.Undefined);
    }

    /* renamed from: G1 */
    protected void m11771G1() {
        super.m41679G1();
        m11768J1();
    }

    /* renamed from: H1 */
    protected void m11770H1() {
        ((RecoverPinViewModel) m22758I0()).m41620l0(true);
        m11768J1();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11769J0() {
        return C6450z.m20906b(RecoverPinViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11767K0() {
        return new C9309a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: L1 */
    public final ViewModelFactoryByInjection m11765L1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24491j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M1 */
    public void m11759n1(AbstractC11865l2 abstractC11865l2, RecoverPinViewModel recoverPinViewModel) {
        Intrinsics.isThisObjectNull(abstractC11865l2, "binding");
        Intrinsics.isThisObjectNull(recoverPinViewModel, "viewModel");
        super.m41683C1(abstractC11865l2, recoverPinViewModel);
    }

    /* renamed from: S0 */
    protected boolean m11762S0() {
        return false;
    }

    /* renamed from: k1 */
    protected List m11761k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2146h.f6181a);
        return m202b;
    }

    /* renamed from: m1 */
    public void m11760m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13877n0.f34992a)) {
            IntroActivity.m25612a(this);
            finish();
        }
    }
}
