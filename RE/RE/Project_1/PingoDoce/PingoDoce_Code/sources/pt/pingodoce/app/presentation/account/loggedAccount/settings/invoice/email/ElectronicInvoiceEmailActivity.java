package pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.email;

import androidx.lifecycle.AbstractC1423a;
import ci.C2139d;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p278oi.EmailActivity;
import p314qd.InterfaceC9717b;
import p318qh.ElectronicInvoiceEmailViewModel;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13851j0;
import pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData;
import sh.ElectronicInvoiceStatusActivity;

/* compiled from: ElectronicInvoiceEmailActivity.kt */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceEmailActivity extends EmailActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23515g0;

    /* compiled from: ElectronicInvoiceEmailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.email.ElectronicInvoiceEmailActivity$a */
    /* loaded from: classes2.dex */
    static final class C8893a extends AbstractC6438m implements InterfaceC6097a {
        C8893a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ElectronicInvoiceEmailActivity.this.m13269t1(), ElectronicInvoiceEmailActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13273J0() {
        return C6450z.m20906b(ElectronicInvoiceEmailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13272K0() {
        return new C8893a();
    }

    /* renamed from: k1 */
    protected List m13271k1() {
        List m194j;
        m194j = C13780s.m194j(C2139d.f6174a, C2139d.C2140a.f6175a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m13270m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13851j0.f34959a)) {
            ElectronicInvoiceStatusActivity.m8502a(this, (ElectronicInvoiceFlowData) c13182l.m1459d());
        }
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m13269t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23515g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
