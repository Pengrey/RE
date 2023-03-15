package pt.pingodoce.app.presentation.onboarding.pin;

import al.CreatePinViewModel;
import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.C2146h;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p014aj.EnumC0170a;
import p014aj.PinActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13878n1;
import p497zk.OnboardingNotificationActivity;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* compiled from: CreatePinActivity.kt */
/* loaded from: classes2.dex */
public final class CreatePinActivity extends PinActivity {

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f24565j0;

    /* compiled from: CreatePinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.pin.CreatePinActivity$a */
    /* loaded from: classes2.dex */
    static final class C9343a extends AbstractC6438m implements InterfaceC6097a {
        C9343a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(CreatePinActivity.this.m11581L1(), CreatePinActivity.this, null, 2, null);
        }
    }

    /* renamed from: J1 */
    private final void m11584J1() {
        m41666z1(EnumC0170a.Undefined);
        OnboardingNotificationActivity.m42a(this, (OnboardingFlowData) ((CreatePinViewModel) m22758I0()).m34578S());
    }

    /* renamed from: G1 */
    protected void m11587G1() {
        super.m41679G1();
        m11584J1();
    }

    /* renamed from: H1 */
    protected void m11586H1() {
        ((CreatePinViewModel) m22758I0()).m41620l0(true);
        m11584J1();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11585J0() {
        return C6450z.m20906b(CreatePinViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11583K0() {
        return new C9343a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: L1 */
    public final ViewModelFactoryByInjection m11581L1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24565j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k1 */
    protected List m11580k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11579m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13878n1.f34993a)) {
            m41685A1().show();
        }
    }

    public void onBackPressed() {
        ((CreatePinViewModel) m22758I0()).m41585h1();
        super.onBackPressed();
    }
}
