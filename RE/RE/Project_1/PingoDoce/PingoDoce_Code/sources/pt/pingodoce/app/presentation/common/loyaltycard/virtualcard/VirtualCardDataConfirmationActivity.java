package pt.pingodoce.app.presentation.common.loyaltycard.virtualcard;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.C2148j;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import p473yi.VirtualCardDataConfirmationViewModel;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13925y2;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.VirtualCardFlowData;

/* compiled from: VirtualCardDataConfirmationActivity.kt */
/* loaded from: classes2.dex */
public final class VirtualCardDataConfirmationActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23927g0;

    /* compiled from: VirtualCardDataConfirmationActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardDataConfirmationActivity$a */
    /* loaded from: classes2.dex */
    static final class C9078a extends AbstractC6438m implements InterfaceC6097a {
        C9078a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(VirtualCardDataConfirmationActivity.this.m12624s1(), VirtualCardDataConfirmationActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12629J0() {
        return C6450z.m20906b(VirtualCardDataConfirmationViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12628K0() {
        return new C9078a();
    }

    /* renamed from: k1 */
    protected List m12627k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2148j.f6183a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m12626m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13925y2.f35046a)) {
            p473yi.VirtualCardPreferencesActivity.m1376a(this, (VirtualCardFlowData) c13182l.m1459d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m12624s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23927g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_user_data_confirmation;
    }
}
