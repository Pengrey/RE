package pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice;

import androidx.lifecycle.AbstractC1423a;
import ci.C2139d;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p340rh.ElectronicInvoicePhoneActivity;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13846i0;
import pe.C8617d;
import ph.ElectronicInvoiceViewModel;

/* compiled from: ElectronicInvoiceActivity.kt */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23511g0;

    /* compiled from: ElectronicInvoiceActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.ElectronicInvoiceActivity$a */
    /* loaded from: classes2.dex */
    static final class C8891a extends AbstractC6438m implements InterfaceC6097a {
        C8891a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ElectronicInvoiceActivity.this.m13282s1(), ElectronicInvoiceActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13287J0() {
        return C6450z.m20906b(ElectronicInvoiceViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13286K0() {
        return new C8891a();
    }

    /* renamed from: k1 */
    protected List m13285k1() {
        List m194j;
        m194j = C13780s.m194j(C2139d.f6174a, C2139d.C2140a.f6175a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m13284m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13846i0.f34954a)) {
            ElectronicInvoicePhoneActivity.m9737a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m13282s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23511g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_electronic_invoice;
    }
}
