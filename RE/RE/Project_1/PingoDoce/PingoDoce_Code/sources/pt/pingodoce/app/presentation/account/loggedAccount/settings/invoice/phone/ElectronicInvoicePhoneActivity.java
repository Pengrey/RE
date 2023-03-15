package pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.phone;

import androidx.lifecycle.AbstractC1423a;
import ci.C2139d;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p187jk.PhoneActivity;
import p314qd.InterfaceC9717b;
import p318qh.ElectronicInvoiceEmailActivity;
import p340rh.ElectronicInvoicePhoneViewModel;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13841h0;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;
import sh.ElectronicInvoiceStatusActivity;

/* compiled from: ElectronicInvoicePhoneActivity.kt */
/* loaded from: classes2.dex */
public final class ElectronicInvoicePhoneActivity extends PhoneActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f23517h0;

    /* compiled from: ElectronicInvoicePhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.phone.ElectronicInvoicePhoneActivity$a */
    /* loaded from: classes2.dex */
    static final class C8894a extends AbstractC6438m implements InterfaceC6097a {
        C8894a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ElectronicInvoicePhoneActivity.this.m13266B1(), ElectronicInvoicePhoneActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: B1 */
    public final ViewModelFactoryByInjection m13266B1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23517h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13265J0() {
        return C6450z.m20906b(ElectronicInvoicePhoneViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13264K0() {
        return new C8894a();
    }

    /* renamed from: k1 */
    protected List m13263k1() {
        List m194j;
        m194j = C13780s.m194j(C2139d.f6174a, C2139d.C2140a.f6175a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m13262m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13841h0.f34949a)) {
            if (((ElectronicInvoiceFlowData) c13182l.m1459d()).m14754i()) {
                ElectronicInvoiceStatusActivity.m8502a(this, (ElectronicInvoiceFlowData) c13182l.m1459d());
            } else {
                ElectronicInvoiceEmailActivity.m10079a(this, (PhoneFlowData) c13182l.m1459d());
            }
        }
    }
}
