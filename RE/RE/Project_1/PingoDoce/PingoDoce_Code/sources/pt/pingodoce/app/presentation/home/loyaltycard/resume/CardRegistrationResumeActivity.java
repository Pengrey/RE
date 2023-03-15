package pt.pingodoce.app.presentation.home.loyaltycard.resume;

import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import be.OperatorExtensions;
import ci.InterfaceC2154o;
import ck.CardRegistrationStatusActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Arrays;
import ke.ViewModelFactoryByInjection;
import p033bk.CardRegistrationResumeViewModel;
import p106fe.IntentUtils;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p451xi.LoyaltyCardResumeActivity;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.AbstractC13816c;
import p494zh.C13914w;
import pt.pingodoce.app.data.local.flows.LoyaltyCardFlowData;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.EnumC9077a;

/* compiled from: CardRegistrationResumeActivity.kt */
/* loaded from: classes2.dex */
public final class CardRegistrationResumeActivity extends LoyaltyCardResumeActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24298g0;

    /* renamed from: h0 */
    private final InterfaceC6108l f24299h0 = OperatorExtensions.m35178c(LifecycleOwner.m36965a(this), new C9230c());

    /* compiled from: CardRegistrationResumeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.resume.CardRegistrationResumeActivity$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9228a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24300a;

        static {
            int[] iArr = new int[LoyaltyCard.PoupaMaisStatus.values().length];
            iArr[LoyaltyCard.PoupaMaisStatus.UnknownOwner.ordinal()] = 1;
            iArr[LoyaltyCard.PoupaMaisStatus.Pending.ordinal()] = 2;
            iArr[LoyaltyCard.PoupaMaisStatus.Unapproved.ordinal()] = 3;
            f24300a = iArr;
        }
    }

    /* compiled from: CardRegistrationResumeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.resume.CardRegistrationResumeActivity$b */
    /* loaded from: classes2.dex */
    static final class C9229b extends AbstractC6438m implements InterfaceC6097a {
        C9229b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12048z1 = CardRegistrationResumeActivity.this.m12048z1();
            CardRegistrationResumeActivity cardRegistrationResumeActivity = CardRegistrationResumeActivity.this;
            return m12048z1.m20377b(cardRegistrationResumeActivity, cardRegistrationResumeActivity.getIntent().getExtras());
        }
    }

    /* compiled from: CardRegistrationResumeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.resume.CardRegistrationResumeActivity$c */
    /* loaded from: classes2.dex */
    static final class C9230c extends AbstractC6438m implements InterfaceC6108l {
        C9230c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12046a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            CardRegistrationResumeActivity cardRegistrationResumeActivity = CardRegistrationResumeActivity.this;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String string = cardRegistrationResumeActivity.getString(C2336R.string.lbl_share_app_message);
            Intrinsics.checkIfNull(string, "getString(R.string.lbl_share_app_message)");
            String format = String.format(string, Arrays.copyOf(new Object[]{((LoyaltyCardFlowData) CardRegistrationResumeActivity.m12049y1(CardRegistrationResumeActivity.this).m34578S()).m14742a()}, 1));
            Intrinsics.checkIfNull(format, "format(format, *args)");
            String string2 = CardRegistrationResumeActivity.this.getString(C2336R.string.lbl_share_app_title);
            Intrinsics.checkIfNull(string2, "getString(R.string.lbl_share_app_title)");
            IntentUtils.m24292b(cardRegistrationResumeActivity, format, string2);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12046a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: y1 */
    public static final /* synthetic */ CardRegistrationResumeViewModel m12049y1(CardRegistrationResumeActivity cardRegistrationResumeActivity) {
        return (CardRegistrationResumeViewModel) cardRegistrationResumeActivity.m22758I0();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12054J0() {
        return C6450z.m20906b(CardRegistrationResumeViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12053K0() {
        return new C9229b();
    }

    /* renamed from: l1 */
    protected void m12052l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        setResult(-1);
    }

    /* renamed from: m1 */
    public void m12051m1(C13182l c13182l) {
        String m14741b;
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13914w.f35035a)) {
            LoyaltyCardFlowData loyaltyCardFlowData = (LoyaltyCardFlowData) c13182l.m1459d();
            int i = C9228a.f24300a[loyaltyCardFlowData.m14740c().ordinal()];
            if (i == 1) {
                m14741b = loyaltyCardFlowData.m14741b();
            } else if (i != 2 && i != 3) {
                m14741b = loyaltyCardFlowData.m14742a();
            } else {
                m14741b = loyaltyCardFlowData.m14741b();
            }
            CardRegistrationStatusActivity.m34538b(this, m14741b, loyaltyCardFlowData.m14740c(), false, 4, null);
        }
    }

    public void onBackPressed() {
        ((CardRegistrationResumeViewModel) m22758I0()).m35094M0();
        super.onBackPressed();
    }

    /* renamed from: t1 */
    public void m12050t1(EnumC9077a enumC9077a) {
        Intrinsics.isThisObjectNull(enumC9077a, "action");
        if (enumC9077a == EnumC9077a.INVITE) {
            this.f24299h0.mo9587d(C13195u.f34156a);
        }
    }

    /* renamed from: z1 */
    public final ViewModelFactoryByInjection m12048z1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24298g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
