package pt.pingodoce.app.presentation.login.phone.update;

import androidx.lifecycle.AbstractC1423a;
import ci.C2136a;
import ci.C2146h;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import mk.CreatePhoneViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p187jk.PhoneActivity;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13848i2;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData;
import sk.PhoneUpdateSmsValidationActivity;

/* compiled from: CreatePhoneActivity.kt */
/* loaded from: classes2.dex */
public final class CreatePhoneActivity extends PhoneActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f24470h0;

    /* compiled from: CreatePhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.update.CreatePhoneActivity$a */
    /* loaded from: classes2.dex */
    static final class C9298a extends AbstractC6438m implements InterfaceC6097a {
        C9298a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(CreatePhoneActivity.this.m11824B1(), CreatePhoneActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: B1 */
    public final ViewModelFactoryByInjection m11824B1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24470h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11823J0() {
        return C6450z.m20906b(CreatePhoneViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11822K0() {
        return new C9298a();
    }

    /* renamed from: k1 */
    protected List m11821k1() {
        List m194j;
        m194j = C13780s.m194j(C2136a.f6171a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11820m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13848i2.f34956a)) {
            PhoneUpdateSmsValidationActivity.m8444a(this, (UpdatePhoneFlowData) c13182l.m1459d());
        }
    }
}
