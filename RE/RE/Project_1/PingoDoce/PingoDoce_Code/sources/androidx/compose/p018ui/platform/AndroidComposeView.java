package androidx.compose.p018ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.compose.p018ui.platform.C0771q1;
import androidx.core.view.C1112b0;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1490u0;
import androidx.lifecycle.InterfaceC1443h;
import androidx.lifecycle.InterfaceC1491v;
import androidx.savedstate.C1664d;
import androidx.savedstate.InterfaceC1663c;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p023b1.C1793b;
import p023b1.InterfaceC1792a;
import p037c1.C1985a;
import p037c1.C1988c;
import p037c1.InterfaceC1987b;
import p052d1.C4699a;
import p052d1.C4701c;
import p052d1.C4703d;
import p052d1.KeyInputModifier;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p093f1.C5284g0;
import p093f1.C5285h;
import p093f1.C5320w;
import p093f1.C5321x;
import p093f1.C5322y;
import p093f1.C5323z;
import p093f1.InterfaceC5282f0;
import p093f1.InterfaceC5310p;
import p093f1.InterfaceC5315r;
import p112g0.MutableVector;
import p127h1.RootMeasurePolicy;
import p169j1.InterfaceC6250e0;
import p169j1.InterfaceC6253f0;
import p169j1.InterfaceC6282l0;
import p169j1.LayoutNode;
import p169j1.LayoutNodeDrawScope;
import p169j1.MeasureAndLayoutDelegate;
import p169j1.OwnerSnapshotObserver;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7598n;
import p245n1.InterfaceC7621v;
import p245n1.SemanticsOwner;
import p302q0.InterfaceC9570f;
import p324r0.AutofillTree;
import p324r0.C9781a;
import p324r0.C9783c;
import p324r0.C9787g;
import p324r0.InterfaceC9784d;
import p358t0.C10325c;
import p358t0.FocusManager;
import p358t0.InterfaceC10331g;
import p359t1.InterfaceC10362d;
import p373u0.C10774f;
import p373u0.C10776g;
import p374u1.C10810w;
import p374u1.TextInputService;
import p393v0.C11020g;
import p393v0.C11068v;
import p393v0.Matrix;
import p468yc.C13182l;
import p468yc.C13191r;
import p468yc.C13195u;
import p479z1.C13598a;
import p479z1.C13599b;
import p479z1.C13601c;
import p479z1.C13612k;
import p479z1.C13614l;
import p479z1.Density;
import p479z1.EnumC13618o;

/* compiled from: AndroidComposeView.android.kt */
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView */
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements InterfaceC6253f0, InterfaceC0805t1, InterfaceC5282f0, InterfaceC1443h {

    /* renamed from: J0 */
    public static final C0663a f2050J0 = new C0663a(null);

    /* renamed from: K0 */
    private static Class f2051K0;

    /* renamed from: L0 */
    private static Method f2052L0;

    /* renamed from: A */
    private final C7598n f2053A;

    /* renamed from: A0 */
    private MotionEvent f2054A0;

    /* renamed from: B */
    private final FocusManager f2055B;

    /* renamed from: B0 */
    private long f2056B0;

    /* renamed from: C */
    private final C0817w1 f2057C;

    /* renamed from: C0 */
    private final C0810u1 f2058C0;

    /* renamed from: D */
    private final KeyInputModifier f2059D;

    /* renamed from: D0 */
    private final RunnableC0670h f2060D0;

    /* renamed from: E */
    private final C11068v f2061E;

    /* renamed from: E0 */
    private final Runnable f2062E0;

    /* renamed from: F */
    private final LayoutNode f2063F;

    /* renamed from: F0 */
    private boolean f2064F0;

    /* renamed from: G */
    private final InterfaceC6282l0 f2065G;

    /* renamed from: G0 */
    private final InterfaceC6097a f2066G0;

    /* renamed from: H */
    private final SemanticsOwner f2067H;

    /* renamed from: H0 */
    private InterfaceC5310p f2068H0;

    /* renamed from: I */
    private final C0780s f2069I;

    /* renamed from: I0 */
    private final InterfaceC5315r f2070I0;

    /* renamed from: J */
    private final AutofillTree f2071J;

    /* renamed from: K */
    private final List f2072K;

    /* renamed from: L */
    private List f2073L;

    /* renamed from: M */
    private boolean f2074M;

    /* renamed from: N */
    private final C5285h f2075N;

    /* renamed from: O */
    private final C5322y f2076O;

    /* renamed from: P */
    private InterfaceC6108l f2077P;

    /* renamed from: Q */
    private final C9781a f2078Q;

    /* renamed from: R */
    private boolean f2079R;

    /* renamed from: S */
    private final C0733l f2080S;

    /* renamed from: T */
    private final C0728k f2081T;

    /* renamed from: U */
    private final OwnerSnapshotObserver f2082U;

    /* renamed from: V */
    private boolean f2083V;

    /* renamed from: W */
    private C0722h0 f2084W;

    /* renamed from: a0 */
    private C0778r0 f2085a0;

    /* renamed from: b0 */
    private C13599b f2086b0;

    /* renamed from: c0 */
    private boolean f2087c0;

    /* renamed from: d0 */
    private final MeasureAndLayoutDelegate f2088d0;

    /* renamed from: e0 */
    private final ViewConfiguration f2089e0;

    /* renamed from: f0 */
    private long f2090f0;

    /* renamed from: g0 */
    private final int[] f2091g0;

    /* renamed from: h0 */
    private final float[] f2092h0;

    /* renamed from: i0 */
    private final float[] f2093i0;

    /* renamed from: j0 */
    private final float[] f2094j0;

    /* renamed from: k0 */
    private long f2095k0;

    /* renamed from: l0 */
    private boolean f2096l0;

    /* renamed from: m0 */
    private long f2097m0;

    /* renamed from: n0 */
    private boolean f2098n0;

    /* renamed from: o0 */
    private final InterfaceC5220m0 f2099o0;

    /* renamed from: p0 */
    private InterfaceC6108l f2100p0;

    /* renamed from: q0 */
    private final ViewTreeObserver.OnGlobalLayoutListener f2101q0;

    /* renamed from: r0 */
    private final ViewTreeObserver.OnScrollChangedListener f2102r0;

    /* renamed from: s0 */
    private final ViewTreeObserver.OnTouchModeChangeListener f2103s0;

    /* renamed from: t0 */
    private final C10810w f2104t0;

    /* renamed from: u0 */
    private final TextInputService f2105u0;

    /* renamed from: v0 */
    private final InterfaceC10362d.InterfaceC10363a f2106v0;

    /* renamed from: w */
    private long f2107w;

    /* renamed from: w0 */
    private final InterfaceC5220m0 f2108w0;

    /* renamed from: x */
    private boolean f2109x;

    /* renamed from: x0 */
    private final InterfaceC1792a f2110x0;

    /* renamed from: y */
    private final LayoutNodeDrawScope f2111y;

    /* renamed from: y0 */
    private final C1988c f2112y0;

    /* renamed from: z */
    private Density f2113z;

    /* renamed from: z0 */
    private final InterfaceC0727j1 f2114z0;

    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$a */
    /* loaded from: classes.dex */
    public static final class C0663a {
        private C0663a() {
        }

        public /* synthetic */ C0663a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ boolean m39875a(C0663a c0663a) {
            return c0663a.m39874b();
        }

        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        /* renamed from: b */
        private final boolean m39874b() {
            try {
                if (AndroidComposeView.m39924B() == null) {
                    AndroidComposeView.m39919G(Class.forName("android.os.SystemProperties"));
                    Class m39924B = AndroidComposeView.m39924B();
                    AndroidComposeView.m39921E(m39924B == null ? null : m39924B.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE));
                }
                Method m39878x = AndroidComposeView.m39878x();
                Object invoke = m39878x == null ? null : m39878x.invoke(null, "debug.layout", Boolean.FALSE);
                Boolean bool = invoke instanceof Boolean ? invoke : null;
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$b */
    /* loaded from: classes.dex */
    public static final class C0664b {

        /* renamed from: a */
        private final InterfaceC1491v f2115a;

        /* renamed from: b */
        private final InterfaceC1663c f2116b;

        public C0664b(InterfaceC1491v interfaceC1491v, InterfaceC1663c interfaceC1663c) {
            Intrinsics.isThisObjectNull(interfaceC1491v, "lifecycleOwner");
            Intrinsics.isThisObjectNull(interfaceC1663c, "savedStateRegistryOwner");
            this.f2115a = interfaceC1491v;
            this.f2116b = interfaceC1663c;
        }

        /* renamed from: a */
        public final InterfaceC1491v m39873a() {
            return this.f2115a;
        }

        /* renamed from: b */
        public final InterfaceC1663c m39872b() {
            return this.f2116b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$c */
    /* loaded from: classes.dex */
    public static final class C0665c extends AbstractC6438m implements InterfaceC6108l {
        C0665c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m39871a(int i) {
            boolean requestFocusFromTouch;
            C1985a.C1986a c1986a = C1985a.f5807b;
            if (C1985a.m34979f(i, c1986a.m34974b())) {
                requestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else {
                requestFocusFromTouch = C1985a.m34979f(i, c1986a.m34975a()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false;
            }
            return Boolean.valueOf(requestFocusFromTouch);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m39871a(((C1985a) obj).m34976i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$d */
    /* loaded from: classes.dex */
    public static final class C0666d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0666d f2118w = new C0666d();

        C0666d() {
            super(1);
        }

        /* renamed from: a */
        public final void m39870a(Configuration configuration) {
            Intrinsics.isThisObjectNull(configuration, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39870a((Configuration) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$e */
    /* loaded from: classes.dex */
    public static final class C0667e extends AbstractC6438m implements InterfaceC6108l {
        C0667e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m39869a(KeyEvent keyEvent) {
            Intrinsics.isThisObjectNull(keyEvent, "it");
            C10325c m39912N = AndroidComposeView.this.m39912N(keyEvent);
            if (m39912N != null && C4701c.m26907e(C4703d.m26902b(keyEvent), C4701c.f12826a.m26906a())) {
                return Boolean.valueOf(AndroidComposeView.this.getFocusManager().mo8247a(m39912N.m8265o()));
            }
            return Boolean.FALSE;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m39869a(((p052d1.KeyEvent) obj).m26912f());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$f */
    /* loaded from: classes.dex */
    public static final class C0668f implements InterfaceC5315r {
        C0668f() {
        }

        /* renamed from: a */
        public void mo24667a(InterfaceC5310p interfaceC5310p) {
            Intrinsics.isThisObjectNull(interfaceC5310p, "value");
            AndroidComposeView.m39922D(AndroidComposeView.this, interfaceC5310p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$g */
    /* loaded from: classes.dex */
    public static final class C0669g extends AbstractC6438m implements InterfaceC6097a {
        C0669g() {
            super(0);
        }

        /* renamed from: a */
        public final void m39868a() {
            MotionEvent m39877y = AndroidComposeView.m39877y(AndroidComposeView.this);
            if (m39877y != null) {
                int actionMasked = m39877y.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.m39920F(AndroidComposeView.this, SystemClock.uptimeMillis());
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(AndroidComposeView.m39925A(androidComposeView));
                }
            }
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m39868a();
            return C13195u.f34156a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$h */
    /* loaded from: classes.dex */
    public static final class RunnableC0670h implements Runnable {
        RunnableC0670h() {
        }

        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent m39877y = AndroidComposeView.m39877y(AndroidComposeView.this);
            if (m39877y != null) {
                boolean z = false;
                boolean z2 = m39877y.getToolType(0) == 3;
                int actionMasked = m39877y.getActionMasked();
                if (!z2 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z = true;
                }
                if (z) {
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    AndroidComposeView.m39923C(androidComposeView, m39877y, i, AndroidComposeView.m39876z(androidComposeView), false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$i */
    /* loaded from: classes.dex */
    public static final class C0671i extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0671i f2123w = new C0671i();

        C0671i() {
            super(1);
        }

        /* renamed from: a */
        public final void m39867a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$$receiver");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39867a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$j */
    /* loaded from: classes.dex */
    public static final class C0672j extends AbstractC6438m implements InterfaceC6108l {
        C0672j() {
            super(1);
        }

        /* renamed from: a */
        public static /* synthetic */ void m39866a(InterfaceC6097a interfaceC6097a) {
            m39864c(interfaceC6097a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m39864c(InterfaceC6097a interfaceC6097a) {
            Intrinsics.isThisObjectNull(interfaceC6097a, "$tmp0");
            interfaceC6097a.mo42214q();
        }

        /* renamed from: b */
        public final void m39865b(final InterfaceC6097a interfaceC6097a) {
            Intrinsics.isThisObjectNull(interfaceC6097a, "command");
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler == null ? null : handler.getLooper()) == Looper.myLooper()) {
                interfaceC6097a.mo42214q();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 == null) {
                return;
            }
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.q
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidComposeView.C0672j.m39864c(InterfaceC6097a.this);
                }
            });
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39865b((InterfaceC6097a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        Intrinsics.isThisObjectNull(context, "context");
        C10774f.C10775a c10775a = C10774f.f27866b;
        this.f2107w = c10775a.m7135b();
        this.f2109x = true;
        this.f2111y = new LayoutNodeDrawScope(null, 1, null);
        this.f2113z = C13598a.m930a(context);
        C7598n c7598n = new C7598n(C7598n.f20118y.m18017a(), false, false, C0671i.f2123w);
        this.f2053A = c7598n;
        FocusManager focusManager = new FocusManager(null, 1, null);
        this.f2055B = focusManager;
        this.f2057C = new C0817w1();
        KeyInputModifier keyInputModifier = new KeyInputModifier(new C0667e(), null);
        this.f2059D = keyInputModifier;
        this.f2061E = new C11068v();
        LayoutNode layoutNode = new LayoutNode(false, 1, null);
        layoutNode.m21544c(RootMeasurePolicy.f16077a);
        layoutNode.m21536g(InterfaceC9570f.f25164r.mo7205u(c7598n).mo7205u(focusManager.m8240e()).mo7205u(keyInputModifier));
        layoutNode.m21534h(getDensity());
        this.f2063F = layoutNode;
        this.f2065G = this;
        this.f2067H = new SemanticsOwner(getRoot());
        C0780s c0780s = new C0780s(this);
        this.f2069I = c0780s;
        this.f2071J = new AutofillTree();
        this.f2072K = new ArrayList();
        this.f2075N = new C5285h();
        this.f2076O = new C5322y(getRoot());
        this.f2077P = C0666d.f2118w;
        this.f2078Q = m39918H() ? new C9781a(this, getAutofillTree()) : null;
        this.f2080S = new C0733l(context);
        this.f2081T = new C0728k(context);
        this.f2082U = new OwnerSnapshotObserver(new C0672j());
        this.f2088d0 = new MeasureAndLayoutDelegate(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkIfNull(viewConfiguration, "get(context)");
        this.f2089e0 = new C0718g0(viewConfiguration);
        this.f2090f0 = C13612k.f34607b.m834a();
        this.f2091g0 = new int[]{0, 0};
        this.f2092h0 = Matrix.m6435b(null, 1, null);
        this.f2093i0 = Matrix.m6435b(null, 1, null);
        this.f2094j0 = Matrix.m6435b(null, 1, null);
        this.f2095k0 = -1L;
        this.f2097m0 = c10775a.m7136a();
        this.f2098n0 = true;
        m24962d = C5232o1.m24962d(null, null, 2, null);
        this.f2099o0 = m24962d;
        this.f2101q0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.m39911O(AndroidComposeView.this);
            }
        };
        this.f2102r0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.m39891i0(AndroidComposeView.this);
            }
        };
        this.f2103s0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.m39885o0(AndroidComposeView.this, z);
            }
        };
        C10810w c10810w = new C10810w(this);
        this.f2104t0 = c10810w;
        this.f2105u0 = (TextInputService) C0818x.m39484e().mo9587d(c10810w);
        this.f2106v0 = new C0842z(context);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkIfNull(configuration, "context.resources.configuration");
        m24962d2 = C5232o1.m24962d(C0818x.m39485d(configuration), null, 2, null);
        this.f2108w0 = m24962d2;
        this.f2110x0 = new C1793b(this);
        this.f2112y0 = new C1988c(isInTouchMode() ? C1985a.f5807b.m34974b() : C1985a.f5807b.m34975a(), new C0665c(), null);
        this.f2114z0 = new C0687b0(this);
        this.f2058C0 = new C0810u1();
        this.f2060D0 = new RunnableC0670h();
        this.f2062E0 = new Runnable() { // from class: androidx.compose.ui.platform.p
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.m39890j0(AndroidComposeView.this);
            }
        };
        this.f2066G0 = new C0669g();
        setWillNotDraw(false);
        setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            C0815w.f2432a.m39493a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        C1112b0.m38405s0(this, c0780s);
        InterfaceC6108l<InterfaceC0805t1, C13195u> m39505a = InterfaceC0805t1.f2420b.m39505a();
        if (m39505a != null) {
            m39505a.mo9587d(this);
        }
        getRoot().m21498z(this);
        if (i >= 29) {
            C0807u.f2423a.m39504a(this);
        }
        this.f2070I0 = new C0668f();
    }

    /* renamed from: A */
    public static final /* synthetic */ RunnableC0670h m39925A(AndroidComposeView androidComposeView) {
        return androidComposeView.f2060D0;
    }

    /* renamed from: B */
    public static final /* synthetic */ Class m39924B() {
        return f2051K0;
    }

    /* renamed from: C */
    public static final /* synthetic */ void m39923C(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z) {
        androidComposeView.m39887m0(motionEvent, i, j, z);
    }

    /* renamed from: D */
    public static final /* synthetic */ void m39922D(AndroidComposeView androidComposeView, InterfaceC5310p interfaceC5310p) {
        androidComposeView.f2068H0 = interfaceC5310p;
    }

    /* renamed from: E */
    public static final /* synthetic */ void m39921E(Method method) {
        f2052L0 = method;
    }

    /* renamed from: F */
    public static final /* synthetic */ void m39920F(AndroidComposeView androidComposeView, long j) {
        androidComposeView.f2056B0 = j;
    }

    /* renamed from: G */
    public static final /* synthetic */ void m39919G(Class cls) {
        f2051K0 = cls;
    }

    /* renamed from: H */
    private final boolean m39918H() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: J */
    private final void m39916J(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).m39915K();
            } else if (childAt instanceof ViewGroup) {
                m39916J((ViewGroup) childAt);
            }
            i = i2;
        }
    }

    /* renamed from: L */
    private final C13182l m39914L(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return C13191r.m1447a(Integer.valueOf(size), Integer.valueOf(size));
                }
                throw new IllegalStateException();
            }
            return C13191r.m1447a(0, Integer.valueOf((int) Reader.READ_DONE));
        }
        return C13191r.m1447a(0, Integer.valueOf(size));
    }

    /* renamed from: M */
    private final View m39913M(int i, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = 0;
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (Intrinsics.equals(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                while (i2 < childCount) {
                    int i3 = i2 + 1;
                    View childAt = viewGroup.getChildAt(i2);
                    Intrinsics.checkIfNull(childAt, "currentView.getChildAt(i)");
                    View m39913M = m39913M(i, childAt);
                    if (m39913M != null) {
                        return m39913M;
                    }
                    i2 = i3;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m39911O(AndroidComposeView androidComposeView) {
        Intrinsics.isThisObjectNull(androidComposeView, "this$0");
        androidComposeView.m39883q0();
    }

    /* renamed from: P */
    private final int m39910P(MotionEvent motionEvent) {
        removeCallbacks(this.f2060D0);
        try {
            m39897c0(motionEvent);
            boolean z = true;
            this.f2096l0 = true;
            mo21652h(false);
            this.f2068H0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f2054A0;
            boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && m39909Q(motionEvent, motionEvent2)) {
                if (m39905U(motionEvent2)) {
                    this.f2076O.m24626c();
                } else if (motionEvent2.getActionMasked() != 10 && z2) {
                    m39886n0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z = false;
            }
            if (!z2 && z && actionMasked != 3 && actionMasked != 9 && m39904V(motionEvent)) {
                m39886n0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f2054A0 = MotionEvent.obtainNoHistory(motionEvent);
            int m39888l0 = m39888l0(motionEvent);
            Trace.endSection();
            if (Build.VERSION.SDK_INT >= 24) {
                C0811v.f2427a.m39498a(this, this.f2068H0);
            }
            return m39888l0;
        } finally {
            this.f2096l0 = false;
        }
    }

    /* renamed from: Q */
    private final boolean m39909Q(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    /* renamed from: R */
    private final void m39908R(LayoutNode layoutNode) {
        layoutNode.m21519o0();
        MutableVector m21537f0 = layoutNode.m21537f0();
        int m23649p = m21537f0.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = m21537f0.m23650o();
            do {
                m39908R((LayoutNode) m23650o[i]);
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: S */
    private final void m39907S(LayoutNode layoutNode) {
        this.f2088d0.m21319n(layoutNode);
        MutableVector m21537f0 = layoutNode.m21537f0();
        int m23649p = m21537f0.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = m21537f0.m23650o();
            do {
                m39907S((LayoutNode) m23650o[i]);
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: T */
    private final boolean m39906T(MotionEvent motionEvent) {
        return Float.isNaN(motionEvent.getX()) || Float.isNaN(motionEvent.getY()) || Float.isNaN(motionEvent.getRawX()) || Float.isNaN(motionEvent.getRawY());
    }

    /* renamed from: U */
    private final boolean m39905U(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    /* renamed from: V */
    private final boolean m39904V(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= ((float) getWidth())) {
            if (0.0f <= y && y <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    private final boolean m39903W(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f2054A0) != null) {
            if (motionEvent.getRawX() == motionEvent2.getRawX()) {
                return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
            }
            return true;
        }
        return true;
    }

    /* renamed from: Z */
    private final void m39900Z(float[] fArr, android.graphics.Matrix matrix) {
        C11020g.m6510b(this.f2094j0, matrix);
        C0818x.m39487b(fArr, this.f2094j0);
    }

    /* renamed from: a0 */
    private final void m39899a0(float[] fArr, float f, float f2) {
        Matrix.m6432e(this.f2094j0);
        Matrix.m6428i(this.f2094j0, f, f2, 0.0f, 4, null);
        C0818x.m39487b(fArr, this.f2094j0);
    }

    /* renamed from: b0 */
    private final void m39898b0() {
        if (this.f2096l0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f2095k0) {
            this.f2095k0 = currentAnimationTimeMillis;
            m39896d0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f2091g0);
            int[] iArr = this.f2091g0;
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f2091g0;
            this.f2097m0 = C10776g.m7133a(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
    }

    /* renamed from: c0 */
    private final void m39897c0(MotionEvent motionEvent) {
        this.f2095k0 = AnimationUtils.currentAnimationTimeMillis();
        m39896d0();
        long m6434c = Matrix.m6434c(this.f2092h0, C10776g.m7133a(motionEvent.getX(), motionEvent.getY()));
        this.f2097m0 = C10776g.m7133a(motionEvent.getRawX() - C10774f.m7145k(m6434c), motionEvent.getRawY() - C10774f.m7144l(m6434c));
    }

    /* renamed from: d0 */
    private final void m39896d0() {
        Matrix.m6432e(this.f2092h0);
        m39884p0(this, this.f2092h0);
        InvertMatrix.m39455a(this.f2092h0, this.f2093i0);
    }

    /* renamed from: g0 */
    private final void m39893g0(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.f2087c0 && layoutNode != null) {
            while (layoutNode != null && layoutNode.m21554U() == LayoutNode.EnumC6274g.InMeasureBlock) {
                layoutNode = layoutNode.m21547a0();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() != 0 && getHeight() != 0) {
            invalidate();
        } else {
            requestLayout();
        }
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* renamed from: h0 */
    static /* synthetic */ void m39892h0(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.m39893g0(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m39891i0(AndroidComposeView androidComposeView) {
        Intrinsics.isThisObjectNull(androidComposeView, "this$0");
        androidComposeView.m39883q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m39890j0(AndroidComposeView androidComposeView) {
        Intrinsics.isThisObjectNull(androidComposeView, "this$0");
        androidComposeView.f2064F0 = false;
        MotionEvent motionEvent = androidComposeView.f2054A0;
        Intrinsics.ifNullDoSomething(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.m39888l0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: l0 */
    private final int m39888l0(MotionEvent motionEvent) {
        Object obj;
        C5320w m24783c = this.f2075N.m24783c(motionEvent, this);
        if (m24783c != null) {
            List m24638b = m24783c.m24638b();
            ListIterator listIterator = m24638b.listIterator(m24638b.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((C5321x) obj).m24637a()) {
                    break;
                }
            }
            C5321x c5321x = (C5321x) obj;
            if (c5321x != null) {
                this.f2107w = c5321x.m24633e();
            }
            int m24627b = this.f2076O.m24627b(m24783c, this, m39904V(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !C5284g0.m24786c(m24627b)) {
                this.f2075N.m24781e(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return m24627b;
            }
            return m24627b;
        }
        this.f2076O.m24626c();
        return C5323z.m24625a(false, false);
    }

    /* renamed from: m0 */
    private final void m39887m0(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = i5 + 1;
            int i7 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i7, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i7, pointerCoords);
            long mo24794b = mo24794b(C10776g.m7133a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C10774f.m7145k(mo24794b);
            pointerCoords.y = C10774f.m7144l(mo24794b);
            i5 = i6;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C5285h c5285h = this.f2075N;
        Intrinsics.checkIfNull(obtain, "event");
        C5320w m24783c = c5285h.m24783c(obtain, this);
        Intrinsics.ifNullDoSomething(m24783c);
        this.f2076O.m24627b(m24783c, this, true);
        obtain.recycle();
    }

    /* renamed from: n0 */
    static /* synthetic */ void m39886n0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.m39887m0(motionEvent, i, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m39885o0(AndroidComposeView androidComposeView, boolean z) {
        Intrinsics.isThisObjectNull(androidComposeView, "this$0");
        androidComposeView.f2112y0.m34972b(z ? C1985a.f5807b.m34974b() : C1985a.f5807b.m34975a());
        androidComposeView.f2055B.m8242c();
    }

    /* renamed from: p0 */
    private final void m39884p0(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m39884p0((View) parent, fArr);
            m39899a0(fArr, -view.getScrollX(), -view.getScrollY());
            m39899a0(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f2091g0);
            m39899a0(fArr, -view.getScrollX(), -view.getScrollY());
            int[] iArr = this.f2091g0;
            m39899a0(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        Intrinsics.checkIfNull(matrix, "viewMatrix");
        m39900Z(fArr, matrix);
    }

    /* renamed from: q0 */
    private final void m39883q0() {
        getLocationOnScreen(this.f2091g0);
        boolean z = false;
        if (C13612k.m839h(this.f2090f0) != this.f2091g0[0] || C13612k.m838i(this.f2090f0) != this.f2091g0[1]) {
            int[] iArr = this.f2091g0;
            this.f2090f0 = C13614l.m833a(iArr[0], iArr[1]);
            z = true;
        }
        this.f2088d0.m21330c(z);
    }

    private void setLayoutDirection(EnumC13618o enumC13618o) {
        this.f2108w0.setValue(enumC13618o);
    }

    private final void setViewTreeOwners(C0664b c0664b) {
        this.f2099o0.setValue(c0664b);
    }

    /* renamed from: t */
    public static /* synthetic */ void m39882t(AndroidComposeView androidComposeView, boolean z) {
        m39885o0(androidComposeView, z);
    }

    /* renamed from: u */
    public static /* synthetic */ void m39881u(AndroidComposeView androidComposeView) {
        m39890j0(androidComposeView);
    }

    /* renamed from: v */
    public static /* synthetic */ void m39880v(AndroidComposeView androidComposeView) {
        m39911O(androidComposeView);
    }

    /* renamed from: w */
    public static /* synthetic */ void m39879w(AndroidComposeView androidComposeView) {
        m39891i0(androidComposeView);
    }

    /* renamed from: x */
    public static final /* synthetic */ Method m39878x() {
        return f2052L0;
    }

    /* renamed from: y */
    public static final /* synthetic */ MotionEvent m39877y(AndroidComposeView androidComposeView) {
        return androidComposeView.f2054A0;
    }

    /* renamed from: z */
    public static final /* synthetic */ long m39876z(AndroidComposeView androidComposeView) {
        return androidComposeView.f2056B0;
    }

    /* renamed from: I */
    public final Object m39917I(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m39551x = this.f2069I.m39551x(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m39551x == m34636d ? m39551x : C13195u.f34156a;
    }

    /* renamed from: K */
    public final void m39915K() {
        if (this.f2079R) {
            getSnapshotObserver().m21614a();
            this.f2079R = false;
        }
        C0722h0 c0722h0 = this.f2084W;
        if (c0722h0 != null) {
            m39916J(c0722h0);
        }
    }

    /* renamed from: N */
    public C10325c m39912N(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "keyEvent");
        long m26903a = C4703d.m26903a(keyEvent);
        C4699a.C4700a c4700a = C4699a.f12814a;
        if (C4699a.m26928l(m26903a, c4700a.m26918j())) {
            return C10325c.m8271i(C4703d.m26901c(keyEvent) ? C10325c.f26902b.m8259f() : C10325c.f26902b.m8261d());
        } else if (C4699a.m26928l(m26903a, c4700a.m26923e())) {
            return C10325c.m8271i(C10325c.f26902b.m8258g());
        } else {
            if (C4699a.m26928l(m26903a, c4700a.m26924d())) {
                return C10325c.m8271i(C10325c.f26902b.m8262c());
            }
            if (C4699a.m26928l(m26903a, c4700a.m26922f())) {
                return C10325c.m8271i(C10325c.f26902b.m8257h());
            }
            if (C4699a.m26928l(m26903a, c4700a.m26925c())) {
                return C10325c.m8271i(C10325c.f26902b.m8264a());
            }
            if (C4699a.m26928l(m26903a, c4700a.m26926b()) ? true : C4699a.m26928l(m26903a, c4700a.m26921g()) ? true : C4699a.m26928l(m26903a, c4700a.m26919i())) {
                return C10325c.m8271i(C10325c.f26902b.m8263b());
            }
            if (C4699a.m26928l(m26903a, c4700a.m26927a()) ? true : C4699a.m26928l(m26903a, c4700a.m26920h())) {
                return C10325c.m8271i(C10325c.f26902b.m8260e());
            }
            return null;
        }
    }

    /* renamed from: X */
    public final Object m39902X(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m6985j = this.f2104t0.m6985j(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m6985j == m34636d ? m6985j : C13195u.f34156a;
    }

    /* renamed from: Y */
    public final void m39901Y(InterfaceC6250e0 interfaceC6250e0, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC6250e0, "layer");
        if (!z) {
            if (!this.f2074M && !this.f2072K.remove(interfaceC6250e0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.f2074M) {
            this.f2072K.add(interfaceC6250e0);
        } else {
            List list = this.f2073L;
            if (list == null) {
                list = new ArrayList();
                this.f2073L = list;
            }
            list.add(interfaceC6250e0);
        }
    }

    /* renamed from: a */
    public void mo36998a(InterfaceC1491v interfaceC1491v) {
        Intrinsics.isThisObjectNull(interfaceC1491v, "owner");
        setShowLayoutBounds(C0663a.m39875a(f2050J0));
    }

    public void autofill(SparseArray sparseArray) {
        C9781a c9781a;
        Intrinsics.isThisObjectNull(sparseArray, "values");
        if (!m39918H() || (c9781a = this.f2078Q) == null) {
            return;
        }
        C9783c.m9969a(c9781a, sparseArray);
    }

    /* renamed from: b */
    public long mo24794b(long j) {
        m39898b0();
        long m6434c = Matrix.m6434c(this.f2092h0, j);
        return C10776g.m7133a(C10774f.m7145k(m6434c) + C10774f.m7145k(this.f2097m0), C10774f.m7144l(m6434c) + C10774f.m7144l(this.f2097m0));
    }

    public boolean canScrollHorizontally(int i) {
        return this.f2069I.m39550y(false, i, this.f2107w);
    }

    public boolean canScrollVertically(int i) {
        return this.f2069I.m39550y(true, i, this.f2107w);
    }

    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        if (!isAttachedToWindow()) {
            m39908R(getRoot());
        }
        InterfaceC6253f0.C6255b.m21641a(this, false, 1, null);
        this.f2074M = true;
        C11068v c11068v = this.f2061E;
        Canvas m6608r = c11068v.m6245a().m6608r();
        c11068v.m6245a().m6606t(canvas);
        getRoot().m21581G(c11068v.m6245a());
        c11068v.m6245a().m6606t(m6608r);
        if (!this.f2072K.isEmpty()) {
            int size = this.f2072K.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC6250e0) this.f2072K.get(i)).mo21668i();
            }
        }
        if (C0771q1.f2338I.m39614b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f2072K.clear();
        this.f2074M = false;
        List list = this.f2073L;
        if (list != null) {
            Intrinsics.ifNullDoSomething(list);
            this.f2072K.addAll(list);
            list.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(motionEvent, "event");
        if (motionEvent.getActionMasked() == 8) {
            return C5284g0.m24786c(m39910P(motionEvent));
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(motionEvent, "event");
        if (this.f2064F0) {
            removeCallbacks(this.f2062E0);
            this.f2062E0.run();
        }
        if (m39906T(motionEvent)) {
            return false;
        }
        if (motionEvent.isFromSource(4098) && motionEvent.getToolType(0) == 1) {
            return this.f2069I.m39604F(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && m39904V(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.f2054A0;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.f2054A0 = MotionEvent.obtainNoHistory(motionEvent);
                    this.f2064F0 = true;
                    post(this.f2062E0);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!m39903W(motionEvent)) {
            return false;
        }
        return C5284g0.m24786c(m39910P(motionEvent));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "event");
        if (isFocused()) {
            return m39889k0(p052d1.KeyEvent.m26916b(keyEvent));
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(motionEvent, "motionEvent");
        if (this.f2064F0) {
            removeCallbacks(this.f2062E0);
            MotionEvent motionEvent2 = this.f2054A0;
            Intrinsics.ifNullDoSomething(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !m39909Q(motionEvent, motionEvent2)) {
                this.f2064F0 = false;
            } else {
                this.f2062E0.run();
            }
        }
        if (m39906T(motionEvent)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 2 || m39903W(motionEvent)) {
            int m39910P = m39910P(motionEvent);
            if (C5284g0.m24787b(m39910P)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return C5284g0.m24786c(m39910P);
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean m39895e0(InterfaceC6250e0 interfaceC6250e0) {
        Intrinsics.isThisObjectNull(interfaceC6250e0, "layer");
        boolean z = this.f2085a0 == null || C0771q1.f2338I.m39614b() || Build.VERSION.SDK_INT >= 23 || this.f2058C0.m39501b() < 10;
        if (z) {
            this.f2058C0.m39499d(interfaceC6250e0);
        }
        return z;
    }

    /* renamed from: f0 */
    public final void m39894f0() {
        this.f2079R = true;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = m39913M(i, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    public final C0722h0 getAndroidViewsHandler$ui_release() {
        if (this.f2084W == null) {
            Context context = getContext();
            Intrinsics.checkIfNull(context, "context");
            C0722h0 c0722h0 = new C0722h0(context);
            this.f2084W = c0722h0;
            addView(c0722h0);
        }
        C0722h0 c0722h02 = this.f2084W;
        Intrinsics.ifNullDoSomething(c0722h02);
        return c0722h02;
    }

    public InterfaceC9784d getAutofill() {
        return this.f2078Q;
    }

    public AutofillTree getAutofillTree() {
        return this.f2071J;
    }

    public final InterfaceC6108l getConfigurationChangeObserver() {
        return this.f2077P;
    }

    public Density getDensity() {
        return this.f2113z;
    }

    public InterfaceC10331g getFocusManager() {
        return this.f2055B;
    }

    public InterfaceC10362d.InterfaceC10363a getFontLoader() {
        return this.f2106v0;
    }

    public InterfaceC1792a getHapticFeedBack() {
        return this.f2110x0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f2088d0.m21325h();
    }

    public InterfaceC1987b getInputModeManager() {
        return this.f2112y0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f2095k0;
    }

    public EnumC13618o getLayoutDirection() {
        return (EnumC13618o) this.f2108w0.getValue();
    }

    public long getMeasureIteration() {
        return this.f2088d0.m21324i();
    }

    public InterfaceC5315r getPointerIconService() {
        return this.f2070I0;
    }

    public LayoutNode getRoot() {
        return this.f2063F;
    }

    public InterfaceC6282l0 getRootForTest() {
        return this.f2065G;
    }

    public SemanticsOwner getSemanticsOwner() {
        return this.f2067H;
    }

    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.f2111y;
    }

    public boolean getShowLayoutBounds() {
        return this.f2083V;
    }

    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.f2082U;
    }

    public TextInputService getTextInputService() {
        return this.f2105u0;
    }

    public InterfaceC0727j1 getTextToolbar() {
        return this.f2114z0;
    }

    public View getView() {
        return this;
    }

    public ViewConfiguration getViewConfiguration() {
        return this.f2089e0;
    }

    public final C0664b getViewTreeOwners() {
        return (C0664b) this.f2099o0.getValue();
    }

    public InterfaceC0814v1 getWindowInfo() {
        return this.f2057C;
    }

    /* renamed from: h */
    public void mo21652h(boolean z) {
        if (this.f2088d0.m21323j(z ? this.f2066G0 : null)) {
            requestLayout();
        }
        MeasureAndLayoutDelegate.m21329d(this.f2088d0, false, 1, null);
    }

    /* renamed from: i */
    public InterfaceC6250e0 mo21651i(InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a) {
        C0778r0 c0779r1;
        Intrinsics.isThisObjectNull(interfaceC6108l, "drawBlock");
        Intrinsics.isThisObjectNull(interfaceC6097a, "invalidateParentLayer");
        InterfaceC6250e0 interfaceC6250e0 = (InterfaceC6250e0) this.f2058C0.m39500c();
        if (interfaceC6250e0 != null) {
            interfaceC6250e0.mo21673d(interfaceC6108l, interfaceC6097a);
            return interfaceC6250e0;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.f2098n0) {
            try {
                return new C0714f1(this, interfaceC6108l, interfaceC6097a);
            } catch (Throwable unused) {
                this.f2098n0 = false;
            }
        }
        if (this.f2085a0 == null) {
            C0771q1.C0774c c0774c = C0771q1.f2338I;
            if (!c0774c.m39615a()) {
                c0774c.m39612d(new View(getContext()));
            }
            if (c0774c.m39614b()) {
                Context context = getContext();
                Intrinsics.checkIfNull(context, "context");
                c0779r1 = new C0778r0(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkIfNull(context2, "context");
                c0779r1 = new C0779r1(context2);
            }
            this.f2085a0 = c0779r1;
            addView(c0779r1);
        }
        C0778r0 c0778r0 = this.f2085a0;
        Intrinsics.ifNullDoSomething(c0778r0);
        return new C0771q1(this, c0778r0, interfaceC6108l, interfaceC6097a);
    }

    /* renamed from: j */
    public long mo21650j(long j) {
        m39898b0();
        return Matrix.m6434c(this.f2092h0, j);
    }

    /* renamed from: k */
    public void mo21649k() {
        this.f2069I.m39589U();
    }

    /* renamed from: k0 */
    public boolean m39889k0(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "keyEvent");
        return this.f2059D.m26897d(keyEvent);
    }

    /* renamed from: l */
    public void mo21648l(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        this.f2088d0.m21327f(layoutNode);
    }

    /* renamed from: m */
    public long mo24793m(long j) {
        m39898b0();
        return Matrix.m6434c(this.f2093i0, C10776g.m7133a(C10774f.m7145k(j) - C10774f.m7145k(this.f2097m0), C10774f.m7144l(j) - C10774f.m7144l(this.f2097m0)));
    }

    /* renamed from: o */
    public void mo21647o(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        if (this.f2088d0.m21319n(layoutNode)) {
            m39893g0(layoutNode);
        }
    }

    protected void onAttachedToWindow() {
        InterfaceC1491v m39873a;
        AbstractC1469p mo137b;
        C9781a c9781a;
        super.onAttachedToWindow();
        m39907S(getRoot());
        m39908R(getRoot());
        getSnapshotObserver().m21609f();
        if (m39918H() && (c9781a = this.f2078Q) != null) {
            C9787g.f25724a.m9954a(c9781a);
        }
        InterfaceC1491v m36969a = C1490u0.m36969a(this);
        InterfaceC1663c m35783a = C1664d.m35783a(this);
        C0664b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(m36969a == null || m35783a == null || (m36969a == viewTreeOwners.m39873a() && m35783a == viewTreeOwners.m39873a()))) {
            if (m36969a == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (m35783a != null) {
                if (viewTreeOwners != null && (m39873a = viewTreeOwners.m39873a()) != null && (mo137b = m39873a.mo137b()) != null) {
                    mo137b.mo10400c(this);
                }
                m36969a.mo137b().mo10402a(this);
                C0664b c0664b = new C0664b(m36969a, m35783a);
                setViewTreeOwners(c0664b);
                InterfaceC6108l interfaceC6108l = this.f2100p0;
                if (interfaceC6108l != null) {
                    interfaceC6108l.mo9587d(c0664b);
                }
                this.f2100p0 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        C0664b viewTreeOwners2 = getViewTreeOwners();
        Intrinsics.ifNullDoSomething(viewTreeOwners2);
        viewTreeOwners2.m39873a().mo137b().mo10402a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f2101q0);
        getViewTreeObserver().addOnScrollChangedListener(this.f2102r0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f2103s0);
    }

    public boolean onCheckIsTextEditor() {
        return this.f2104t0.m6986i();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        Intrinsics.isThisObjectNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        Intrinsics.checkIfNull(context, "context");
        this.f2113z = C13598a.m930a(context);
        this.f2077P.mo9587d(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Intrinsics.isThisObjectNull(editorInfo, "outAttrs");
        return this.f2104t0.m6989f(editorInfo);
    }

    protected void onDetachedFromWindow() {
        C9781a c9781a;
        InterfaceC1491v m39873a;
        AbstractC1469p mo137b;
        super.onDetachedFromWindow();
        getSnapshotObserver().m21608g();
        C0664b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (m39873a = viewTreeOwners.m39873a()) != null && (mo137b = m39873a.mo137b()) != null) {
            mo137b.mo10400c(this);
        }
        if (m39918H() && (c9781a = this.f2078Q) != null) {
            C9787g.f25724a.m9953b(c9781a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f2101q0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f2102r0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f2103s0);
    }

    protected void onDraw(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        FocusManager focusManager = this.f2055B;
        if (z) {
            focusManager.m8237h();
        } else {
            focusManager.m8239f();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2086b0 = null;
        m39883q0();
        if (this.f2084W != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    protected void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m39907S(getRoot());
            }
            C13182l m39914L = m39914L(i);
            int intValue = ((Number) m39914L.m1462a()).intValue();
            int intValue2 = ((Number) m39914L.m1461b()).intValue();
            C13182l m39914L2 = m39914L(i2);
            long m907a = C13601c.m907a(intValue, intValue2, ((Number) m39914L2.m1462a()).intValue(), ((Number) m39914L2.m1461b()).intValue());
            C13599b c13599b = this.f2086b0;
            boolean z = false;
            if (c13599b == null) {
                this.f2086b0 = C13599b.m928b(m907a);
                this.f2087c0 = false;
            } else {
                if (c13599b != null) {
                    z = C13599b.m923g(c13599b.m911s(), m907a);
                }
                if (!z) {
                    this.f2087c0 = true;
                }
            }
            this.f2088d0.m21318o(m907a);
            this.f2088d0.m21323j(this.f2066G0);
            setMeasuredDimension(getRoot().m21541d0(), getRoot().m21567N());
            if (this.f2084W != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().m21541d0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().m21567N(), 1073741824));
            }
            C13195u c13195u = C13195u.f34156a;
        } finally {
            Trace.endSection();
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C9781a c9781a;
        if (!m39918H() || viewStructure == null || (c9781a = this.f2078Q) == null) {
            return;
        }
        C9783c.m9968b(c9781a, viewStructure);
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.f2109x) {
            EnumC13618o m39488a = C0818x.m39488a(i);
            setLayoutDirection(m39488a);
            this.f2055B.m8238g(m39488a);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        this.f2057C.m39489a(z);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: p */
    public void mo21646p(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        this.f2088d0.m21322k(layoutNode);
        m39894f0();
    }

    /* renamed from: q */
    public void mo21645q(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        if (this.f2088d0.m21320m(layoutNode)) {
            m39892h0(this, null, 1, null);
        }
    }

    /* renamed from: r */
    public void mo21644r(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
    }

    /* renamed from: s */
    public void mo21643s(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        this.f2069I.m39590T(layoutNode);
    }

    public final void setConfigurationChangeObserver(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "<set-?>");
        this.f2077P = interfaceC6108l;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f2095k0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "callback");
        C0664b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC6108l.mo9587d(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f2100p0 = interfaceC6108l;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f2083V = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C0728k getAccessibilityManager() {
        return this.f2081T;
    }

    public C0733l getClipboardManager() {
        return this.f2080S;
    }
}
