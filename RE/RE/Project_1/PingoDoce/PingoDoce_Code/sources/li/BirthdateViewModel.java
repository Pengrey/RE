package li;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import ki.SubmitAnimatedViewModel;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: li.c */
/* loaded from: classes2.dex */
public abstract class BirthdateViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private C2381h f18749C;

    /* renamed from: D */
    private final Void f18750D;

    /* renamed from: E */
    private final C1436e0 f18751E;

    /* renamed from: F */
    private final C1436e0 f18752F;

    /* renamed from: G */
    private final C1430c0 f18753G;

    /* renamed from: H */
    private final C1436e0 f18754H;

    /* renamed from: I */
    private final C1436e0 f18755I;

    /* renamed from: J */
    private final C1436e0 f18756J;

    /* renamed from: K */
    private final C1430c0 f18757K;

    /* renamed from: L */
    private final LiveData f18758L;

    /* renamed from: M */
    private final LiveData f18759M;

    /* renamed from: N */
    private final boolean f18760N;

    /* renamed from: O */
    private final InterfaceC6108l f18761O;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BirthdateViewModel.kt */
    /* renamed from: li.c$a */
    /* loaded from: classes2.dex */
    public static final class C7060a extends AbstractC6438m implements InterfaceC6108l {
        C7060a() {
            super(1);
        }

        /* renamed from: a */
        public final void m19398a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BirthdateViewModel.this.m19411E0();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m19398a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdateViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_advance));
        this.f18749C = c2381h;
        C1436e0 m37003d = c1459l0.m37003d("_isErrorEnabled", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…\"_isErrorEnabled\", false)");
        this.f18751E = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_errorLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_errorLabel\", \"\")");
        this.f18752F = m37003d2;
        C1430c0 c1430c0 = new C1430c0();
        this.f18753G = c1430c0;
        C1436e0 c1436e0 = new C1436e0(Boolean.TRUE);
        this.f18754H = c1436e0;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_nif_subtitle);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 c1436e02 = new C1436e0(string);
        this.f18755I = c1436e02;
        C1436e0 m37004c = c1459l0.m37004c("EXTRA_FOR_BIRTHDATE");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<…XTRA_FOR_BIRTHDATE,\n    )");
        this.f18756J = m37004c;
        this.f18757K = c1430c0;
        this.f18758L = c1436e0;
        this.f18759M = c1436e02;
        CharSequence charSequence = (CharSequence) c1436e02.mo172f();
        this.f18760N = charSequence == null || charSequence.length() == 0;
        this.f18761O = BaseViewModel.m113I(this, 0L, new C7060a(), 1, null);
        c1430c0.m37055q(m37004c, new InterfaceC1440f0() { // from class: li.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BirthdateViewModel.m19403v0(BirthdateViewModel.this, (String) obj);
            }
        });
    }

    /* renamed from: D0 */
    static /* synthetic */ Object m19412D0(BirthdateViewModel birthdateViewModel, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        CharSequence charSequence = (CharSequence) birthdateViewModel.f18756J.mo172f();
        if (!(charSequence == null || charSequence.length() == 0)) {
            Object m19410F0 = birthdateViewModel.m19410F0(interfaceC1886d);
            m34636d = C2116d.m34636d();
            return m19410F0 == m34636d ? m19410F0 : C13195u.f34156a;
        }
        return C13195u.f34156a;
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m19408H0(BirthdateViewModel birthdateViewModel, boolean z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleError");
        }
        if ((i & 2) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        birthdateViewModel.m19409G0(z, str);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m19404u0(BirthdateViewModel birthdateViewModel, String str) {
        m19403v0(birthdateViewModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m19403v0(BirthdateViewModel birthdateViewModel, String str) {
        Intrinsics.isThisObjectNull(birthdateViewModel, "this$0");
        birthdateViewModel.m20319p0();
        birthdateViewModel.f18753G.mo166p(Boolean.valueOf(!(str == null || str.length() == 0)));
        m19408H0(birthdateViewModel, false, null, 2, null);
    }

    /* renamed from: A0 */
    public final boolean m19415A0() {
        return this.f18760N;
    }

    /* renamed from: B0 */
    public final LiveData m19414B0() {
        return this.f18759M;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C0 */
    public final C1436e0 m19413C0() {
        return this.f18754H;
    }

    /* renamed from: E0 */
    protected void m19411E0() {
    }

    /* renamed from: F0 */
    public abstract Object m19410F0(InterfaceC1886d interfaceC1886d);

    /* renamed from: G0 */
    protected final void m19409G0(boolean z, String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f18751E.mo166p(Boolean.valueOf(z));
        this.f18752F.mo166p(str);
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m19407f0() {
        return (Drawable) m19399z0();
    }

    /* renamed from: g0 */
    protected C2381h m19406g0() {
        return this.f18749C;
    }

    /* renamed from: n0 */
    protected Object m19405n0(InterfaceC1886d interfaceC1886d) {
        return m19412D0(this, interfaceC1886d);
    }

    /* renamed from: w0 */
    public final C1436e0 m19402w0() {
        return this.f18756J;
    }

    /* renamed from: x0 */
    public final C1430c0 m19401x0() {
        return this.f18757K;
    }

    /* renamed from: y0 */
    public final LiveData m19400y0() {
        return this.f18758L;
    }

    /* renamed from: z0 */
    protected Void m19399z0() {
        return this.f18750D;
    }
}
