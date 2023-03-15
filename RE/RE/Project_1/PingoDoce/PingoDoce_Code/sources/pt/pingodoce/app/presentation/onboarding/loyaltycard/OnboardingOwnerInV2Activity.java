package pt.pingodoce.app.presentation.onboarding.loyaltycard;

import al.CreatePinActivity;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.Arrays;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p106fe.IntentUtils;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p390uj.HomeActivity;
import p426wg.AbstractC12128z1;
import p430wk.OnboardingOwnerInV2ViewModel;
import p468yc.C13182l;
import p489zc.CollectionsJVM;
import p494zh.AbstractC13816c;
import p494zh.C13829e2;
import p494zh.C13869l0;
import p494zh.C13900s1;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;

/* compiled from: OnboardingOwnerInV2Activity.kt */
/* loaded from: classes2.dex */
public final class OnboardingOwnerInV2Activity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24550g0;

    /* compiled from: OnboardingOwnerInV2Activity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingOwnerInV2Activity$a */
    /* loaded from: classes2.dex */
    public static final class C9333a {
        private C9333a() {
        }

        public /* synthetic */ C9333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OnboardingOwnerInV2Activity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingOwnerInV2Activity$b */
    /* loaded from: classes2.dex */
    static final class C9334b extends AbstractC6438m implements InterfaceC6097a {
        C9334b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(OnboardingOwnerInV2Activity.this.m11626s1(), OnboardingOwnerInV2Activity.this, null, 2, null);
        }
    }

    static {
        new C9333a(null);
    }

    /* renamed from: E0 */
    protected Integer m11635E0() {
        return Integer.valueOf((int) C2336R.C2338id.toolbar);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11634J0() {
        return C6450z.m20906b(OnboardingOwnerInV2ViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11633K0() {
        return new C9334b();
    }

    /* renamed from: S0 */
    protected boolean m11631S0() {
        return true;
    }

    /* renamed from: k1 */
    protected List m11630k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2143g.f6178a);
        return m202b;
    }

    /* renamed from: m1 */
    public void m11629m1(C13182l c13182l) {
        String str;
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13869l0.f34986a)) {
            HomeActivity.m6743b(this);
        } else if (Intrinsics.equals(abstractC13816c, C13900s1.f35021a)) {
            CreatePinActivity.m41589a(this, (PhoneFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13829e2.f34936a)) {
            C6429c0 c6429c0 = C6429c0.f17515a;
            String string = getString(C2336R.string.lbl_share_app_message);
            Intrinsics.checkIfNull(string, "getString(R.string.lbl_share_app_message)");
            Object[] objArr = new Object[1];
            Bundle extras = getIntent().getExtras();
            if (extras == null || (str = extras.getString(((OnboardingFlowData) c13182l.m1459d()).m14737A().m14568c())) == null) {
                str = BuildConfig.VERSION_NAME;
            }
            objArr[0] = str;
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            Intrinsics.checkIfNull(format, "format(format, *args)");
            String string2 = getString(C2336R.string.lbl_share_app_title);
            Intrinsics.checkIfNull(string2, "getString(R.string.lbl_share_app_title)");
            IntentUtils.m24292b(this, format, string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m11626s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24550g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t1 */
    public void m11628n1(AbstractC12128z1 abstractC12128z1, OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel) {
        Intrinsics.isThisObjectNull(abstractC12128z1, "binding");
        Intrinsics.isThisObjectNull(onboardingOwnerInV2ViewModel, "viewModel");
        super.m34589n1(abstractC12128z1, onboardingOwnerInV2ViewModel);
        Bundle extras = getIntent().getExtras();
        boolean z = false;
        if (extras != null && extras.getBoolean("IS_ACCOUNT_FLOW")) {
            z = true;
        }
        if (z) {
            onboardingOwnerInV2ViewModel.m3467d0(true);
        }
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_onboarding_loyalty_owner_in_v2;
    }
}
