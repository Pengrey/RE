package pt.pingodoce.app.presentation.home.loyaltycard.registration;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.InterfaceC2154o;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p015ak.CardRegistrationViewModel;
import p033bk.CardRegistrationResumeActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p430wk.OnboardingOwnerInV2Activity;
import p468yc.C13182l;
import p489zc.CollectionsJVM;
import p494zh.AbstractC13816c;
import p494zh.C13896r1;
import p494zh.C13914w;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import vi.LoyaltyCardInsertActivity;

/* compiled from: CardRegistrationActivity.kt */
/* loaded from: classes2.dex */
public final class CardRegistrationActivity extends LoyaltyCardInsertActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f24293h0;

    /* compiled from: CardRegistrationActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.registration.CardRegistrationActivity$a */
    /* loaded from: classes2.dex */
    static final class C9225a extends AbstractC6438m implements InterfaceC6097a {
        C9225a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(CardRegistrationActivity.this.m12064z1(), CardRegistrationActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12070J0() {
        return C6450z.m20906b(CardRegistrationViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12069K0() {
        return new C9225a();
    }

    /* renamed from: k1 */
    protected List m12068k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2143g.C2144a.f6179a);
        return m202b;
    }

    /* renamed from: l1 */
    protected void m12067l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        setResult(-1);
    }

    /* renamed from: m1 */
    public void m12066m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (abstractC13816c instanceof C13914w) {
            CardRegistrationResumeActivity.m35101a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (abstractC13816c instanceof C13896r1) {
            OnboardingOwnerInV2Activity.m3413a(this, (OnboardingFlowData) c13182l.m1459d(), true);
        }
    }

    public void onBackPressed() {
        ((CardRegistrationViewModel) m22758I0()).m41597E0();
        super.onBackPressed();
    }

    /* renamed from: w1 */
    protected boolean m12065w1() {
        return true;
    }

    /* renamed from: z1 */
    public final ViewModelFactoryByInjection m12064z1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24293h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
