package pt.pingodoce.app.presentation.login.phone.update;

import androidx.lifecycle.AbstractC1423a;
import ci.C2136a;
import ci.C2146h;
import ci.InterfaceC2154o;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import mk.UpdatePhoneViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p187jk.PhoneActivity;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13900s1;
import pe.C8618e;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;

/* compiled from: UpdatePhoneActivity.kt */
/* loaded from: classes2.dex */
public final class UpdatePhoneActivity extends PhoneActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f24472h0;

    /* compiled from: UpdatePhoneActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.phone.update.UpdatePhoneActivity$a */
    /* loaded from: classes2.dex */
    static final class C9299a extends AbstractC6438m implements InterfaceC6097a {
        C9299a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(UpdatePhoneActivity.this.m11816B1(), UpdatePhoneActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: B1 */
    public final ViewModelFactoryByInjection m11816B1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24472h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11814J0() {
        return C6450z.m20906b(UpdatePhoneViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11813K0() {
        return new C9299a();
    }

    /* renamed from: k1 */
    protected List m11812k1() {
        List m194j;
        m194j = C13780s.m194j(C2136a.f6171a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: l1 */
    protected void m11811l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        if (Intrinsics.equals(interfaceC2154o, C2136a.f6171a)) {
            setResult(-1);
        }
    }

    /* renamed from: m1 */
    public void m11810m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13900s1.f35021a)) {
            mk.ValidatePinForUpdatePhoneActivity.m18346a(this, (PhoneFlowData) c13182l.m1459d());
        }
    }
}
