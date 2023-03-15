package pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.email;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p278oi.EmailActivity;
import p314qd.InterfaceC9717b;
import p318qh.ElectronicInvoiceEditEmailViewModel;
import p468yc.C13182l;

/* compiled from: ElectronicInvoiceEditEmailActivity.kt */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceEditEmailActivity extends EmailActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23513g0;

    /* compiled from: ElectronicInvoiceEditEmailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.email.ElectronicInvoiceEditEmailActivity$a */
    /* loaded from: classes2.dex */
    static final class C8892a extends AbstractC6438m implements InterfaceC6097a {
        C8892a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13275t1 = ElectronicInvoiceEditEmailActivity.this.m13275t1();
            ElectronicInvoiceEditEmailActivity electronicInvoiceEditEmailActivity = ElectronicInvoiceEditEmailActivity.this;
            return m13275t1.m20377b(electronicInvoiceEditEmailActivity, electronicInvoiceEditEmailActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13279J0() {
        return C6450z.m20906b(ElectronicInvoiceEditEmailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13278K0() {
        return new C8892a();
    }

    /* renamed from: m1 */
    public void m13277m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: n */
    public boolean m13276n() {
        return true;
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m13275t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23513g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
