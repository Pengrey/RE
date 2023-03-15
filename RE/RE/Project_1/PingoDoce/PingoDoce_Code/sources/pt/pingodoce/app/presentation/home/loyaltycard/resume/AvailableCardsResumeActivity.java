package pt.pingodoce.app.presentation.home.loyaltycard.resume;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.InterfaceC2154o;
import ck.CardRegistrationStatusActivity;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p015ak.CardRegistrationActivity;
import p033bk.AvailableCardsResumeViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p451xi.LoyaltyCardResumeActivity;
import p468yc.C13182l;
import p489zc.CollectionsJVM;
import p494zh.AbstractC13816c;
import p494zh.C13873m0;
import p494zh.C13914w;
import pt.pingodoce.app.data.local.flows.LoyaltyCardFlowData;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.EnumC9077a;

/* compiled from: AvailableCardsResumeActivity.kt */
/* loaded from: classes2.dex */
public final class AvailableCardsResumeActivity extends LoyaltyCardResumeActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24295g0;

    /* compiled from: AvailableCardsResumeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.resume.AvailableCardsResumeActivity$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9226a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24296a;

        static {
            int[] iArr = new int[LoyaltyCard.PoupaMaisStatus.values().length];
            iArr[LoyaltyCard.PoupaMaisStatus.UnknownOwner.ordinal()] = 1;
            iArr[LoyaltyCard.PoupaMaisStatus.Pending.ordinal()] = 2;
            iArr[LoyaltyCard.PoupaMaisStatus.Unapproved.ordinal()] = 3;
            f24296a = iArr;
        }
    }

    /* compiled from: AvailableCardsResumeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.resume.AvailableCardsResumeActivity$b */
    /* loaded from: classes2.dex */
    static final class C9227b extends AbstractC6438m implements InterfaceC6097a {
        C9227b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12056y1 = AvailableCardsResumeActivity.this.m12056y1();
            AvailableCardsResumeActivity availableCardsResumeActivity = AvailableCardsResumeActivity.this;
            return m12056y1.m20377b(availableCardsResumeActivity, availableCardsResumeActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12062J0() {
        return C6450z.m20906b(AvailableCardsResumeViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12061K0() {
        return new C9227b();
    }

    /* renamed from: k1 */
    protected List m12060k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2143g.C2144a.f6179a);
        return m202b;
    }

    /* renamed from: l1 */
    protected void m12059l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        setResult(-1);
    }

    /* renamed from: m1 */
    public void m12058m1(C13182l c13182l) {
        String m14741b;
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13873m0.f34989a)) {
            CardRegistrationActivity.m41599b(this, ((AvailableCardsResumeViewModel) m22758I0()).m35119D0(), false, 2, null);
        } else if (abstractC13816c instanceof C13914w) {
            LoyaltyCardFlowData loyaltyCardFlowData = (LoyaltyCardFlowData) c13182l.m1459d();
            int i = C9226a.f24296a[loyaltyCardFlowData.m14740c().ordinal()];
            if (i == 1) {
                m14741b = loyaltyCardFlowData.m14741b();
            } else if (i != 2 && i != 3) {
                m14741b = loyaltyCardFlowData.m14742a();
            } else {
                m14741b = loyaltyCardFlowData.m14741b();
            }
            CardRegistrationStatusActivity.m34539a(this, m14741b, loyaltyCardFlowData.m14740c(), true);
        }
    }

    public void onBackPressed() {
        ((AvailableCardsResumeViewModel) m22758I0()).m35111P0();
        super.onBackPressed();
    }

    /* renamed from: t1 */
    public void m12057t1(EnumC9077a enumC9077a) {
        Intrinsics.isThisObjectNull(enumC9077a, "action");
    }

    /* renamed from: y1 */
    public final ViewModelFactoryByInjection m12056y1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24295g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
