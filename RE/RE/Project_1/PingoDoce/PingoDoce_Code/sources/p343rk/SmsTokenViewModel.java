package p343rk;

import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import ki.SubmitAnimatedViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;

/* renamed from: rk.h */
/* loaded from: classes2.dex */
public abstract class SmsTokenViewModel<F extends PhoneFlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f25983C;

    /* renamed from: D */
    private final C1436e0 f25984D;

    /* renamed from: E */
    private final C1436e0 f25985E;

    /* renamed from: F */
    private final C1436e0 f25986F;

    /* renamed from: G */
    private final C1436e0 f25987G;

    /* renamed from: H */
    private final C1430c0 f25988H;

    /* renamed from: I */
    private final LiveData f25989I;

    /* renamed from: J */
    private final LiveData f25990J;

    /* renamed from: K */
    private final LiveData f25991K;

    /* renamed from: L */
    private final C1430c0 f25992L;

    /* renamed from: M */
    private final LiveData f25993M;

    /* renamed from: N */
    private final C1436e0 f25994N;

    /* renamed from: O */
    private final C1436e0 f25995O;

    /* renamed from: P */
    private final InterfaceC6108l f25996P;

    /* compiled from: SmsTokenViewModel.kt */
    /* renamed from: rk.h$a */
    /* loaded from: classes2.dex */
    public static final class C9927a {
        private C9927a() {
        }

        public /* synthetic */ C9927a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmsTokenViewModel.kt */
    /* renamed from: rk.h$b */
    /* loaded from: classes2.dex */
    public static final class C9928b extends AbstractC6438m implements InterfaceC6108l {
        C9928b() {
            super(1);
        }

        /* renamed from: a */
        public final void m9665a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            InterfaceC7886d.C7887a.m17629a(SmsTokenViewModel.this.m9684B0(), AnalyticEvents.AbstractC7780f.C7846v1.f20470b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            SmsTokenViewModel.this.m9674L0();
            SmsTokenViewModel.m9672N0(SmsTokenViewModel.this, false, null, 2, null);
            SmsTokenViewModel.this.m9668x0();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9665a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C9927a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsTokenViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f25983C = analyticsManager;
        C1436e0 m37003d = c1459l0.m37003d("_pinColors", C0928a.m39112e(resourcesProvider.m6899a(), C2336R.color.selector_for_pin_entry));
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<….selector_for_pin_entry))");
        this.f25984D = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_isErrorEnabled", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<…\"_isErrorEnabled\", false)");
        this.f25985E = m37003d2;
        C1436e0 m37003d3 = c1459l0.m37003d("_errorLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<String>(\"_errorLabel\", \"\")");
        this.f25986F = m37003d3;
        C1436e0 c1436e0 = new C1436e0(Boolean.TRUE);
        this.f25987G = c1436e0;
        C1430c0 c1430c0 = new C1430c0();
        this.f25988H = c1430c0;
        this.f25989I = m37003d;
        this.f25990J = m37003d2;
        this.f25991K = m37003d3;
        this.f25992L = c1430c0;
        this.f25993M = c1436e0;
        C1436e0 m37004c = c1459l0.m37004c("EXTRA_FOR_PIN_RECOVERY");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<…>(EXTRA_FOR_PIN_RECOVERY)");
        this.f25994N = m37004c;
        C1436e0 m37003d4 = c1459l0.m37003d("code", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData<String>(\"code\", \"\")");
        this.f25995O = m37003d4;
        this.f25996P = BaseViewModel.m113I(this, 0L, new C9928b(), 1, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7834r1.f20458b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        c1430c0.m37055q(m37003d4, new InterfaceC1440f0() { // from class: rk.g
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SmsTokenViewModel.m9669w0(SmsTokenViewModel.this, (String) obj);
            }
        });
    }

    /* renamed from: H0 */
    private final boolean m9678H0() {
        String str = (String) this.f25995O.mo172f();
        return str != null && str.length() == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public static final void m9675K0(SmsTokenViewModel smsTokenViewModel, View view) {
        Intrinsics.isThisObjectNull(smsTokenViewModel, "this$0");
        smsTokenViewModel.f25996P.mo9587d(C13195u.f34156a);
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m9672N0(SmsTokenViewModel smsTokenViewModel, boolean z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleError");
        }
        if ((i & 2) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        smsTokenViewModel.m9673M0(z, str);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m9671u0(SmsTokenViewModel smsTokenViewModel, String str) {
        m9669w0(smsTokenViewModel, str);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m9670v0(SmsTokenViewModel smsTokenViewModel, View view) {
        m9675K0(smsTokenViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m9669w0(SmsTokenViewModel smsTokenViewModel, String str) {
        Intrinsics.isThisObjectNull(smsTokenViewModel, "this$0");
        if (str != null) {
            boolean z = smsTokenViewModel.m9678H0() && Intrinsics.equals(smsTokenViewModel.f25993M.mo172f(), Boolean.TRUE);
            smsTokenViewModel.m9685A0(z);
            if (z) {
                smsTokenViewModel.m20325j0().mo9587d(C13195u.f34156a);
            }
        }
        smsTokenViewModel.m20319p0();
        m9672N0(smsTokenViewModel, false, null, 2, null);
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m9666z0(SmsTokenViewModel smsTokenViewModel, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableResendBtn");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        smsTokenViewModel.m9667y0(z, z2);
    }

    /* renamed from: A0 */
    protected final void m9685A0(boolean z) {
        this.f25988H.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: B0 */
    public final AnalyticsManager m9684B0() {
        return this.f25983C;
    }

    /* renamed from: C0 */
    public final C1430c0 m9683C0() {
        return this.f25992L;
    }

    /* renamed from: D0 */
    public final C1436e0 m9682D0() {
        return this.f25995O;
    }

    /* renamed from: E0 */
    public final LiveData m9681E0() {
        return this.f25991K;
    }

    /* renamed from: F0 */
    public final LiveData m9680F0() {
        return this.f25989I;
    }

    /* renamed from: G0 */
    public final LiveData m9679G0() {
        return this.f25993M;
    }

    /* renamed from: I0 */
    public final LiveData m9677I0() {
        return this.f25990J;
    }

    /* renamed from: J0 */
    public final View.OnClickListener m9676J0() {
        return new View.OnClickListener() { // from class: rk.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmsTokenViewModel.m9675K0(SmsTokenViewModel.this, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L0 */
    public final void m9674L0() {
        this.f25995O.mo166p(BuildConfig.VERSION_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M0 */
    public final void m9673M0(boolean z, String str) {
        int i;
        this.f25985E.mo169m(Boolean.valueOf(z));
        this.f25986F.mo169m(z ? str : BuildConfig.VERSION_NAME);
        C1436e0 c1436e0 = this.f25984D;
        ResourcesProvider m20390g = m20390g();
        if (z) {
            this.f25983C.mo17630a(AnalyticEvents.AbstractC7780f.C7840t1.f20464b, EnumC7885c.Error, EnumC7884b.View, str);
            ResourcesProvider m20390g2 = m20390g();
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m20390g2.m6899a(), (int) C2336R.style.App).getTheme().resolveAttribute(C2336R.attr.colorError, typedValue, true);
            i = typedValue.resourceId;
        } else {
            i = C2336R.color.selector_for_pin_entry;
        }
        c1436e0.mo169m(C0928a.m39112e(m20390g.m6899a(), i));
    }

    /* renamed from: x0 */
    public abstract void m9668x0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y0 */
    public final void m9667y0(boolean z, boolean z2) {
        this.f25987G.mo166p(Boolean.valueOf(z));
        if (z2) {
            m9685A0(m9678H0());
        }
    }
}
