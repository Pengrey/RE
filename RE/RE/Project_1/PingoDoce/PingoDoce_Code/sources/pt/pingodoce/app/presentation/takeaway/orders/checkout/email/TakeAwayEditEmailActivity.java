package pt.pingodoce.app.presentation.takeaway.orders.checkout.email;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p278oi.EmailActivity;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import tl.TakeAwayEditEmailViewModel;

/* compiled from: TakeAwayEditEmailActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayEditEmailActivity extends EmailActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f25031g0;

    /* compiled from: TakeAwayEditEmailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.orders.checkout.email.TakeAwayEditEmailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9516a extends AbstractC6438m implements InterfaceC6097a {
        C9516a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10828t1 = TakeAwayEditEmailActivity.this.m10828t1();
            TakeAwayEditEmailActivity takeAwayEditEmailActivity = TakeAwayEditEmailActivity.this;
            return m10828t1.m20377b(takeAwayEditEmailActivity, takeAwayEditEmailActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10832J0() {
        return C6450z.m20906b(TakeAwayEditEmailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10831K0() {
        return new C9516a();
    }

    /* renamed from: m1 */
    public void m10830m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: n */
    public boolean m10829n() {
        return true;
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m10828t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25031g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
