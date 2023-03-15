package ki;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.core.content.res.C0955h;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.flows.FlowData;
import td.InterfaceC10524i0;

/* renamed from: ki.e */
/* loaded from: classes2.dex */
public abstract class SubmitAnimatedViewModel<F extends FlowData> extends FlowViewModel {

    /* renamed from: A */
    private final LiveData f17973A;

    /* renamed from: B */
    private final LiveData f17974B;

    /* renamed from: q */
    private C2381h f17975q;

    /* renamed from: r */
    private final C2381h f17976r;

    /* renamed from: s */
    private final Drawable f17977s;

    /* renamed from: t */
    private final InterfaceC13178g f17978t;

    /* renamed from: u */
    private final C1436e0 f17979u;

    /* renamed from: v */
    private final InterfaceC13178g f17980v;

    /* renamed from: w */
    private final InterfaceC13178g f17981w;

    /* renamed from: x */
    private boolean f17982x;

    /* renamed from: y */
    private final InterfaceC6108l f17983y;

    /* renamed from: z */
    private final LiveData f17984z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubmitAnimatedViewModel.kt */
    /* renamed from: ki.e$a */
    /* loaded from: classes2.dex */
    public static final class C6670a extends AbstractC6438m implements InterfaceC6097a {
        C6670a() {
            super(0);
        }

        /* renamed from: a */
        public final C1436e0 mo42214q() {
            return new C1436e0(SubmitAnimatedViewModel.this.m20329f0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubmitAnimatedViewModel.kt */
    /* renamed from: ki.e$b */
    /* loaded from: classes2.dex */
    public static final class C6671b extends AbstractC6438m implements InterfaceC6097a {
        C6671b() {
            super(0);
        }

        /* renamed from: a */
        public final C1436e0 mo42214q() {
            return new C1436e0(SubmitAnimatedViewModel.this.m20328g0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubmitAnimatedViewModel.kt */
    /* renamed from: ki.e$c */
    /* loaded from: classes2.dex */
    public static final class C6672c extends AbstractC6438m implements InterfaceC6097a {
        C6672c() {
            super(0);
        }

        /* renamed from: a */
        public final Drawable mo42214q() {
            return SubmitAnimatedViewModel.this.m20329f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubmitAnimatedViewModel.kt */
    /* renamed from: ki.e$d */
    /* loaded from: classes2.dex */
    public static final class C6673d extends AbstractC6438m implements InterfaceC6108l {
        C6673d() {
            super(1);
        }

        /* renamed from: a */
        public final void m20311a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            SubmitAnimatedViewModel.m20332c0(SubmitAnimatedViewModel.this);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20311a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubmitAnimatedViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.SubmitAnimatedViewModel$submitFunction$1", m20196f = "SubmitAnimatedViewModel.kt", m20195l = {72}, m20194m = "invokeSuspend")
    /* renamed from: ki.e$e */
    /* loaded from: classes2.dex */
    public static final class C6674e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f17989x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SubmitAnimatedViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.SubmitAnimatedViewModel$submitFunction$1$res$1", m20196f = "SubmitAnimatedViewModel.kt", m20195l = {73}, m20194m = "invokeSuspend")
        /* renamed from: ki.e$e$a */
        /* loaded from: classes2.dex */
        public static final class C6675a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f17991x;

            /* renamed from: y */
            final /* synthetic */ SubmitAnimatedViewModel f17992y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6675a(SubmitAnimatedViewModel submitAnimatedViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f17992y = submitAnimatedViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C6675a(this.f17992y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C6675a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f17991x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    SubmitAnimatedViewModel submitAnimatedViewModel = this.f17992y;
                    this.f17991x = 1;
                    if (submitAnimatedViewModel.m20321n0(this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                SubmitAnimatedViewModel.m20333b0(this.f17992y, false);
                SubmitAnimatedViewModel.m20335Z(this.f17992y).mo169m(C6755b.m20201a(this.f17992y.m20324k0()));
                SubmitAnimatedViewModel.m20337X(this.f17992y).mo169m(this.f17992y.m20330e0());
                SubmitAnimatedViewModel.m20336Y(this.f17992y).mo169m(this.f17992y.m20328g0());
                return C13195u.f34156a;
            }
        }

        C6674e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C6674e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C6674e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f17989x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SubmitAnimatedViewModel.m20333b0(SubmitAnimatedViewModel.this, true);
                SubmitAnimatedViewModel.m20335Z(SubmitAnimatedViewModel.this).mo169m(C6755b.m20201a(SubmitAnimatedViewModel.this.m20324k0()));
                SubmitAnimatedViewModel.m20336Y(SubmitAnimatedViewModel.this).mo169m(SubmitAnimatedViewModel.m20338W(SubmitAnimatedViewModel.this));
                SubmitAnimatedViewModel submitAnimatedViewModel = SubmitAnimatedViewModel.this;
                C6675a c6675a = new C6675a(submitAnimatedViewModel, null);
                this.f17989x = 1;
                obj = SubmitAnimatedViewModel.m20334a0(submitAnimatedViewModel, true, c6675a, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            if (((C13195u) obj) == null) {
                SubmitAnimatedViewModel.this.m20319p0();
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitAnimatedViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        this.f17975q = c2381h;
        C2381h c2381h2 = new C2381h();
        c2381h2.m33752h(2);
        int m20320o0 = m20320o0();
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(resourcesProvider.m6899a(), m20320o0).getTheme().resolveAttribute(C2336R.attr.viewsIconTint, typedValue, true);
        c2381h2.m33730r(Integer.valueOf(C0928a.m39113d(resourcesProvider.m6899a(), typedValue.resourceId)));
        this.f17976r = c2381h2;
        Drawable m38996e = C0955h.m38996e(resourcesProvider.m6899a().getResources(), C2336R.C2337drawable.ic_icn_next, new ContextThemeWrapper(resourcesProvider.m6899a(), 2131951646).getTheme());
        if (m38996e != null) {
            m38996e.setBounds(new Rect(0, 0, UtilsExtensions.m35167e(20), UtilsExtensions.m35167e(20)));
        } else {
            m38996e = null;
        }
        this.f17977s = m38996e;
        m1464a = LazyJVM.m1464a(new C6672c());
        this.f17978t = m1464a;
        C1436e0 m37003d = c1459l0.m37003d("_showProgress", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…>(\"_showProgress\", false)");
        this.f17979u = m37003d;
        m1464a2 = LazyJVM.m1464a(new C6671b());
        this.f17980v = m1464a2;
        m1464a3 = LazyJVM.m1464a(new C6670a());
        this.f17981w = m1464a3;
        this.f17983y = BaseViewModel.m113I(this, 0L, new C6673d(), 1, null);
        this.f17984z = m37003d;
        this.f17973A = m20322m0();
        this.f17974B = m20323l0();
    }

    /* renamed from: V */
    public static /* synthetic */ void m20339V(SubmitAnimatedViewModel submitAnimatedViewModel, View view) {
        m20316s0(submitAnimatedViewModel, view);
    }

    /* renamed from: W */
    public static final /* synthetic */ C2381h m20338W(SubmitAnimatedViewModel submitAnimatedViewModel) {
        return submitAnimatedViewModel.f17976r;
    }

    /* renamed from: X */
    public static final /* synthetic */ C1436e0 m20337X(SubmitAnimatedViewModel submitAnimatedViewModel) {
        return submitAnimatedViewModel.m20323l0();
    }

    /* renamed from: Y */
    public static final /* synthetic */ C1436e0 m20336Y(SubmitAnimatedViewModel submitAnimatedViewModel) {
        return submitAnimatedViewModel.m20322m0();
    }

    /* renamed from: Z */
    public static final /* synthetic */ C1436e0 m20335Z(SubmitAnimatedViewModel submitAnimatedViewModel) {
        return submitAnimatedViewModel.f17979u;
    }

    /* renamed from: a0 */
    public static final /* synthetic */ Object m20334a0(SubmitAnimatedViewModel submitAnimatedViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return submitAnimatedViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: b0 */
    public static final /* synthetic */ void m20333b0(SubmitAnimatedViewModel submitAnimatedViewModel, boolean z) {
        submitAnimatedViewModel.f17982x = z;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ void m20332c0(SubmitAnimatedViewModel submitAnimatedViewModel) {
        submitAnimatedViewModel.m20315t0();
    }

    /* renamed from: l0 */
    private final C1436e0 m20323l0() {
        return (C1436e0) this.f17981w.getValue();
    }

    /* renamed from: m0 */
    private final C1436e0 m20322m0() {
        return (C1436e0) this.f17980v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m20316s0(SubmitAnimatedViewModel submitAnimatedViewModel, View view) {
        Intrinsics.isThisObjectNull(submitAnimatedViewModel, "this$0");
        submitAnimatedViewModel.f17983y.mo9587d(C13195u.f34156a);
    }

    /* renamed from: t0 */
    private final void m20315t0() {
        if (this.f17982x) {
            return;
        }
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C6674e(null), 3, null);
    }

    /* renamed from: d0 */
    public final LiveData m20331d0() {
        return this.f17974B;
    }

    /* renamed from: e0 */
    protected Drawable m20330e0() {
        return (Drawable) this.f17978t.getValue();
    }

    /* renamed from: f0 */
    protected Drawable m20329f0() {
        return this.f17977s;
    }

    /* renamed from: g0 */
    protected C2381h m20328g0() {
        return this.f17975q;
    }

    /* renamed from: h0 */
    public final LiveData m20327h0() {
        return this.f17973A;
    }

    /* renamed from: i0 */
    public final LiveData m20326i0() {
        return this.f17984z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j0 */
    public final InterfaceC6108l m20325j0() {
        return this.f17983y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k0 */
    public final boolean m20324k0() {
        return this.f17982x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n0 */
    public abstract Object m20321n0(InterfaceC1886d interfaceC1886d);

    /* renamed from: o0 */
    protected int m20320o0() {
        return 2131951646;
    }

    /* renamed from: p0 */
    public final void m20319p0() {
        if (this.f17982x) {
            return;
        }
        this.f17979u.mo169m(Boolean.FALSE);
        m20323l0().mo169m(m20329f0());
        m20322m0().mo169m(m20328g0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q0 */
    public void m20318q0(C2381h c2381h) {
        Intrinsics.isThisObjectNull(c2381h, "<set-?>");
        this.f17975q = c2381h;
    }

    /* renamed from: r0 */
    public final View.OnClickListener m20317r0() {
        return new View.OnClickListener() { // from class: ki.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubmitAnimatedViewModel.m20316s0(SubmitAnimatedViewModel.this, view);
            }
        };
    }
}
