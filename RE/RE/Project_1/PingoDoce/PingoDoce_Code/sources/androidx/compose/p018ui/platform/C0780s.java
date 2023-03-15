package androidx.compose.p018ui.platform;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.p018ui.platform.C0690c;
import androidx.compose.p018ui.platform.C0720h;
import androidx.compose.p018ui.viewinterop.AbstractC0845a;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.C1090d;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6113q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p169j1.HitTestResult;
import p169j1.InterfaceC6253f0;
import p169j1.LayoutNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p191k1.CollectionInfo;
import p220ld.C7037c;
import p245n1.C7580a;
import p245n1.C7583d;
import p245n1.C7584e;
import p245n1.C7591h;
import p245n1.C7593i;
import p245n1.C7594j;
import p245n1.C7595l;
import p245n1.C7607q;
import p245n1.C7608s;
import p245n1.C7619u;
import p245n1.SemanticsConfiguration;
import p245n1.SemanticsModifier;
import p245n1.SemanticsNode;
import p245n1.SemanticsProperties;
import p245n1.SemanticsWrapper;
import p261o1.EnumC7999a;
import p286p1.AnnotatedString;
import p286p1.C8392u;
import p286p1.C8393w;
import p297pd.InterfaceC8606b;
import p297pd._Ranges;
import p301q.C9552b;
import p301q.C9559h;
import p302q0.C9575g;
import p302q0.C9576h;
import p302q0.C9577i;
import p373u0.C10774f;
import p373u0.C10776g;
import p404vd.C11226h;
import p404vd.InterfaceC11222e;
import p412w1.C11534a;
import p468yc.C13195u;
import p489zc.C13769l0;
import p489zc.C13777q;
import p489zc._Arrays;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* renamed from: androidx.compose.ui.platform.s */
/* loaded from: classes.dex */
public final class C0780s extends C1078a {

    /* renamed from: A */
    private static final int[] f2360A;

    /* renamed from: d */
    private final AndroidComposeView f2361d;

    /* renamed from: e */
    private int f2362e;

    /* renamed from: f */
    private final AccessibilityManager f2363f;

    /* renamed from: g */
    private boolean f2364g;

    /* renamed from: h */
    private final Handler f2365h;

    /* renamed from: i */
    private C1090d f2366i;

    /* renamed from: j */
    private int f2367j;

    /* renamed from: k */
    private C9559h f2368k;

    /* renamed from: l */
    private C9559h f2369l;

    /* renamed from: m */
    private int f2370m;

    /* renamed from: n */
    private Integer f2371n;

    /* renamed from: o */
    private final C9552b f2372o;

    /* renamed from: p */
    private final InterfaceC11222e f2373p;

    /* renamed from: q */
    private boolean f2374q;

    /* renamed from: r */
    private C0788f f2375r;

    /* renamed from: s */
    private Map f2376s;

    /* renamed from: t */
    private C9552b f2377t;

    /* renamed from: u */
    private Map f2378u;

    /* renamed from: v */
    private C0789g f2379v;

    /* renamed from: w */
    private boolean f2380w;

    /* renamed from: x */
    private final Runnable f2381x;

    /* renamed from: y */
    private final List f2382y;

    /* renamed from: z */
    private final InterfaceC6108l f2383z;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC0781a implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0781a() {
        }

        public void onViewAttachedToWindow(View view) {
            Intrinsics.isThisObjectNull(view, "view");
        }

        public void onViewDetachedFromWindow(View view) {
            Intrinsics.isThisObjectNull(view, "view");
            C0780s.m39564q(C0780s.this).removeCallbacks(C0780s.m39562r(C0780s.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$b */
    /* loaded from: classes.dex */
    public static final class C0782b {

        /* renamed from: a */
        public static final C0783a f2385a = new C0783a(null);

        /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
        /* renamed from: androidx.compose.ui.platform.s$b$a */
        /* loaded from: classes.dex */
        public static final class C0783a {
            private C0783a() {
            }

            public /* synthetic */ C0783a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final void m39548a(C1085c c1085c, SemanticsNode semanticsNode) {
                C7580a c7580a;
                Intrinsics.isThisObjectNull(c1085c, "info");
                Intrinsics.isThisObjectNull(semanticsNode, "semanticsNode");
                if (!C0801t.m39527b(semanticsNode) || (c7580a = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), C7594j.f20098a.m18039m())) == null) {
                    return;
                }
                c1085c.m38561b(new C1085c.C1086a(16908349, c7580a.m18104b()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$c */
    /* loaded from: classes.dex */
    public static final class C0784c {

        /* renamed from: a */
        public static final C0785a f2386a = new C0785a(null);

        /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
        /* renamed from: androidx.compose.ui.platform.s$c$a */
        /* loaded from: classes.dex */
        public static final class C0785a {
            private C0785a() {
            }

            public /* synthetic */ C0785a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final void m39547a(AccessibilityEvent accessibilityEvent, int i, int i2) {
                Intrinsics.isThisObjectNull(accessibilityEvent, "event");
                accessibilityEvent.setScrollDeltaX(i);
                accessibilityEvent.setScrollDeltaY(i2);
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$d */
    /* loaded from: classes.dex */
    public static final class C0786d {
        private C0786d() {
        }

        public /* synthetic */ C0786d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$e */
    /* loaded from: classes.dex */
    public final class C0787e extends AccessibilityNodeProvider {

        /* renamed from: a */
        final /* synthetic */ C0780s f2387a;

        public C0787e(C0780s c0780s) {
            Intrinsics.isThisObjectNull(c0780s, "this$0");
            this.f2387a = c0780s;
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Intrinsics.isThisObjectNull(accessibilityNodeInfo, "info");
            Intrinsics.isThisObjectNull(str, "extraDataKey");
            C0780s.m39568o(this.f2387a, i, accessibilityNodeInfo, str, bundle);
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return C0780s.m39566p(this.f2387a, i);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return C0780s.m39560s(this.f2387a, i, i2, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$f */
    /* loaded from: classes.dex */
    public static final class C0788f {

        /* renamed from: a */
        private final SemanticsNode f2388a;

        /* renamed from: b */
        private final int f2389b;

        /* renamed from: c */
        private final int f2390c;

        /* renamed from: d */
        private final int f2391d;

        /* renamed from: e */
        private final int f2392e;

        /* renamed from: f */
        private final long f2393f;

        public C0788f(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            Intrinsics.isThisObjectNull(semanticsNode, "node");
            this.f2388a = semanticsNode;
            this.f2389b = i;
            this.f2390c = i2;
            this.f2391d = i3;
            this.f2392e = i4;
            this.f2393f = j;
        }

        /* renamed from: a */
        public final int m39546a() {
            return this.f2389b;
        }

        /* renamed from: b */
        public final int m39545b() {
            return this.f2391d;
        }

        /* renamed from: c */
        public final int m39544c() {
            return this.f2390c;
        }

        /* renamed from: d */
        public final SemanticsNode m39543d() {
            return this.f2388a;
        }

        /* renamed from: e */
        public final int m39542e() {
            return this.f2392e;
        }

        /* renamed from: f */
        public final long m39541f() {
            return this.f2393f;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$g */
    /* loaded from: classes.dex */
    public static final class C0789g {

        /* renamed from: a */
        private final SemanticsConfiguration f2394a;

        /* renamed from: b */
        private final Set f2395b;

        public C0789g(SemanticsNode semanticsNode, Map map) {
            Intrinsics.isThisObjectNull(semanticsNode, "semanticsNode");
            Intrinsics.isThisObjectNull(map, "currentSemanticsNodes");
            this.f2394a = semanticsNode.m17993t();
            this.f2395b = new LinkedHashSet();
            List m17997p = semanticsNode.m17997p();
            int size = m17997p.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                SemanticsNode semanticsNode2 = (SemanticsNode) m17997p.get(i);
                if (map.containsKey(Integer.valueOf(semanticsNode2.m18004i()))) {
                    m39540a().add(Integer.valueOf(semanticsNode2.m18004i()));
                }
                i = i2;
            }
        }

        /* renamed from: a */
        public final Set m39540a() {
            return this.f2395b;
        }

        /* renamed from: b */
        public final SemanticsConfiguration m39539b() {
            return this.f2394a;
        }

        /* renamed from: c */
        public final boolean m39538c() {
            return this.f2394a.m18035h(C7608s.f20138a.m17957n());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$h */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0790h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2396a;

        static {
            int[] iArr = new int[EnumC7999a.values().length];
            iArr[EnumC7999a.On.ordinal()] = 1;
            iArr[EnumC7999a.Off.ordinal()] = 2;
            iArr[EnumC7999a.Indeterminate.ordinal()] = 3;
            f2396a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", m20196f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", m20195l = {1604, 1633}, m20194m = "boundsUpdatesEventLoop")
    /* renamed from: androidx.compose.ui.platform.s$i */
    /* loaded from: classes.dex */
    public static final class C0791i extends AbstractC6757d {

        /* renamed from: B */
        int f2398B;

        /* renamed from: w */
        Object f2399w;

        /* renamed from: x */
        Object f2400x;

        /* renamed from: y */
        Object f2401y;

        /* renamed from: z */
        /* synthetic */ Object f2402z;

        C0791i(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f2402z = obj;
            this.f2398B |= Integer.MIN_VALUE;
            return C0780s.this.m39551x(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$j */
    /* loaded from: classes.dex */
    public static final class C0792j extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0792j f2403w = new C0792j();

        C0792j() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(LayoutNode layoutNode) {
            SemanticsConfiguration m17903Y1;
            Intrinsics.isThisObjectNull(layoutNode, "parent");
            SemanticsWrapper m17974j = C7607q.m17974j(layoutNode);
            return Boolean.valueOf((m17974j == null || (m17903Y1 = m17974j.m17903Y1()) == null || !m17903Y1.m18029u()) ? false : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$k */
    /* loaded from: classes.dex */
    public static final class C0793k extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ C0719g1 f2404w;

        /* renamed from: x */
        final /* synthetic */ C0780s f2405x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0793k(C0719g1 c0719g1, C0780s c0780s) {
            super(0);
            this.f2404w = c0719g1;
            this.f2405x = c0780s;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
            if ((r2 == 0.0f) == false) goto L23;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m39536a() {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p018ui.platform.C0780s.C0793k.m39536a():void");
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m39536a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$l */
    /* loaded from: classes.dex */
    public static final class C0794l extends AbstractC6438m implements InterfaceC6108l {
        C0794l() {
            super(1);
        }

        /* renamed from: a */
        public final void m39535a(C0719g1 c0719g1) {
            Intrinsics.isThisObjectNull(c0719g1, "it");
            C0780s.m39554v(C0780s.this, c0719g1);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39535a((C0719g1) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$m */
    /* loaded from: classes.dex */
    public static final class C0795m extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0795m f2407w = new C0795m();

        C0795m() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(LayoutNode layoutNode) {
            SemanticsConfiguration m17903Y1;
            Intrinsics.isThisObjectNull(layoutNode, "it");
            SemanticsWrapper m17974j = C7607q.m17974j(layoutNode);
            return Boolean.valueOf((m17974j == null || (m17903Y1 = m17974j.m17903Y1()) == null || !m17903Y1.m18029u()) ? false : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.s$n */
    /* loaded from: classes.dex */
    public static final class C0796n extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0796n f2408w = new C0796n();

        C0796n() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "it");
            return Boolean.valueOf(C7607q.m17974j(layoutNode) != null);
        }
    }

    static {
        new C0786d(null);
        f2360A = new int[]{C9575g.f25172a, C9575g.f25173b, C9575g.f25184m, C9575g.f25195x, C9575g.f25166A, C9575g.f25167B, C9575g.f25168C, C9575g.f25169D, C9575g.f25170E, C9575g.f25171F, C9575g.f25174c, C9575g.f25175d, C9575g.f25176e, C9575g.f25177f, C9575g.f25178g, C9575g.f25179h, C9575g.f25180i, C9575g.f25181j, C9575g.f25182k, C9575g.f25183l, C9575g.f25185n, C9575g.f25186o, C9575g.f25187p, C9575g.f25188q, C9575g.f25189r, C9575g.f25190s, C9575g.f25191t, C9575g.f25192u, C9575g.f25193v, C9575g.f25194w, C9575g.f25196y, C9575g.f25197z};
    }

    public C0780s(AndroidComposeView androidComposeView) {
        Map m334e;
        Map m334e2;
        Intrinsics.isThisObjectNull(androidComposeView, "view");
        this.f2361d = androidComposeView;
        this.f2362e = Integer.MIN_VALUE;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f2363f = (AccessibilityManager) systemService;
        this.f2365h = new Handler(Looper.getMainLooper());
        this.f2366i = new C1090d(new C0787e(this));
        this.f2367j = Integer.MIN_VALUE;
        this.f2368k = new C9559h();
        this.f2369l = new C9559h();
        this.f2370m = -1;
        this.f2372o = new C9552b();
        this.f2373p = C11226h.m5692b(-1, null, null, 6, null);
        this.f2374q = true;
        m334e = C13769l0.m334e();
        this.f2376s = m334e;
        this.f2377t = new C9552b();
        this.f2378u = new LinkedHashMap();
        SemanticsNode m17971a = androidComposeView.getSemanticsOwner().m17971a();
        m334e2 = C13769l0.m334e();
        this.f2379v = new C0789g(m17971a, m334e2);
        androidComposeView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0781a());
        this.f2381x = new Runnable() { // from class: androidx.compose.ui.platform.r
            @Override // java.lang.Runnable
            public final void run() {
                C0780s.m39580d0(C0780s.this);
            }
        };
        this.f2382y = new ArrayList();
        this.f2383z = new C0794l();
    }

    /* renamed from: A */
    private final void m39609A() {
        m39571m0(this.f2361d.getSemanticsOwner().m17971a(), this.f2379v);
        m39572l0(m39601I());
        m39553v0();
    }

    /* renamed from: B */
    private final boolean m39608B(int i) {
        if (m39593Q(i)) {
            this.f2367j = Integer.MIN_VALUE;
            this.f2361d.invalidate();
            m39576h0(this, i, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private final AccessibilityNodeInfo m39606D(int i) {
        C1085c m38576N = C1085c.m38576N();
        Intrinsics.checkIfNull(m38576N, "obtain()");
        C0723h1 c0723h1 = (C0723h1) m39601I().get(Integer.valueOf(i));
        if (c0723h1 == null) {
            m38576N.m38572R();
            return null;
        }
        SemanticsNode m39727b = c0723h1.m39727b();
        if (i == -1) {
            ViewParent m38464K = C1112b0.m38464K(this.f2361d);
            m38576N.m38520v0(m38464K instanceof View ? (View) m38464K : null);
        } else if (m39727b.m17999n() != null) {
            SemanticsNode m17999n = m39727b.m17999n();
            Intrinsics.ifNullDoSomething(m17999n);
            int m18004i = m17999n.m18004i();
            m38576N.m38518w0(this.f2361d, m18004i != this.f2361d.getSemanticsOwner().m17971a().m18004i() ? m18004i : -1);
        } else {
            throw new IllegalStateException("semanticsNode " + i + " has null parent");
        }
        m38576N.m38592E0(this.f2361d, i);
        Rect m39728a = c0723h1.m39728a();
        long mo24794b = this.f2361d.mo24794b(C10776g.m7133a(m39728a.left, m39728a.top));
        long mo24794b2 = this.f2361d.mo24794b(C10776g.m7133a(m39728a.right, m39728a.bottom));
        m38576N.m38566X(new Rect((int) Math.floor(C10774f.m7145k(mo24794b)), (int) Math.floor(C10774f.m7144l(mo24794b)), (int) Math.ceil(C10774f.m7145k(mo24794b2)), (int) Math.ceil(C10774f.m7144l(mo24794b2))));
        m39585Y(i, m38576N, m39727b);
        return m38576N.m38580K0();
    }

    /* renamed from: E */
    private final AccessibilityEvent m39605E(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent m39607C = m39607C(i, 8192);
        if (num != null) {
            m39607C.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            m39607C.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            m39607C.setItemCount(num3.intValue());
        }
        if (str != null) {
            m39607C.getText().add(str);
        }
        return m39607C;
    }

    /* renamed from: G */
    private final int m39603G(SemanticsNode semanticsNode) {
        SemanticsConfiguration m17993t = semanticsNode.m17993t();
        C7608s c7608s = C7608s.f20138a;
        if (!m17993t.m18035h(c7608s.m17968c()) && semanticsNode.m17993t().m18035h(c7608s.m17948w())) {
            return C8393w.m15538g(((C8393w) semanticsNode.m17993t().m18033o(c7608s.m17948w())).m15532m());
        }
        return this.f2370m;
    }

    /* renamed from: H */
    private final int m39602H(SemanticsNode semanticsNode) {
        SemanticsConfiguration m17993t = semanticsNode.m17993t();
        C7608s c7608s = C7608s.f20138a;
        if (!m17993t.m18035h(c7608s.m17968c()) && semanticsNode.m17993t().m18035h(c7608s.m17948w())) {
            return C8393w.m15535j(((C8393w) semanticsNode.m17993t().m18033o(c7608s.m17948w())).m15532m());
        }
        return this.f2370m;
    }

    /* renamed from: I */
    private final Map m39601I() {
        if (this.f2374q) {
            this.f2376s = C0801t.m39514o(this.f2361d.getSemanticsOwner());
            this.f2374q = false;
        }
        return this.f2376s;
    }

    /* renamed from: J */
    private final String m39600J(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration m17993t = semanticsNode.m17993t();
        C7608s c7608s = C7608s.f20138a;
        if (m17993t.m18035h(c7608s.m17968c())) {
            return C9577i.m10569d((List) semanticsNode.m17993t().m18033o(c7608s.m17968c()), ",", null, null, 0, null, null, 62, null);
        }
        if (C0801t.m39521h(semanticsNode)) {
            AnnotatedString m39597M = m39597M(semanticsNode.m17993t());
            if (m39597M == null) {
                return null;
            }
            return m39597M.m15771f();
        }
        List list = (List) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17949v());
        if (list == null || (annotatedString = (AnnotatedString) C13777q.m254N(list)) == null) {
            return null;
        }
        return annotatedString.m15771f();
    }

    /* renamed from: K */
    private final InterfaceC0717g m39599K(SemanticsNode semanticsNode, int i) {
        if (semanticsNode == null) {
            return null;
        }
        String m39600J = m39600J(semanticsNode);
        if (m39600J == null || m39600J.length() == 0) {
            return null;
        }
        if (i == 1) {
            C0690c.C0691a c0691a = C0690c.f2191d;
            Locale locale = this.f2361d.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkIfNull(locale, "view.context.resources.configuration.locale");
            C0690c m39803a = c0691a.m39803a(locale);
            m39803a.m39826e(m39600J);
            return m39803a;
        } else if (i != 2) {
            if (i != 4) {
                if (i == 8) {
                    C0711f m39760a = C0711f.f2241c.m39760a();
                    m39760a.m39826e(m39600J);
                    return m39760a;
                } else if (i != 16) {
                    return null;
                }
            }
            SemanticsConfiguration m17993t = semanticsNode.m17993t();
            C7594j c7594j = C7594j.f20098a;
            if (m17993t.m18035h(c7594j.m18045g())) {
                ArrayList arrayList = new ArrayList();
                InterfaceC6108l interfaceC6108l = (InterfaceC6108l) ((C7580a) semanticsNode.m17993t().m18033o(c7594j.m18045g())).m18105a();
                if (Intrinsics.equals(interfaceC6108l == null ? null : (Boolean) interfaceC6108l.mo9587d(arrayList), Boolean.TRUE)) {
                    C8392u c8392u = (C8392u) arrayList.get(0);
                    if (i == 4) {
                        C0700d m39774a = C0700d.f2220d.m39774a();
                        m39774a.m39775j(m39600J, c8392u);
                        return m39774a;
                    }
                    C0704e m39767a = C0704e.f2226e.m39767a();
                    m39767a.m39768j(m39600J, c8392u, semanticsNode);
                    return m39767a;
                }
                return null;
            }
            return null;
        } else {
            C0720h.C0721a c0721a = C0720h.f2264d;
            Locale locale2 = this.f2361d.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkIfNull(locale2, "view.context.resources.configuration.locale");
            C0720h m39730a = c0721a.m39730a(locale2);
            m39730a.m39826e(m39600J);
            return m39730a;
        }
    }

    /* renamed from: M */
    private final AnnotatedString m39597M(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) C7595l.m18025a(semanticsConfiguration, C7608s.f20138a.m17966e());
    }

    /* renamed from: P */
    private final boolean m39594P() {
        return this.f2364g || (this.f2363f.isEnabled() && this.f2363f.isTouchExplorationEnabled());
    }

    /* renamed from: Q */
    private final boolean m39593Q(int i) {
        return this.f2367j == i;
    }

    /* renamed from: R */
    private final boolean m39592R(SemanticsNode semanticsNode) {
        SemanticsConfiguration m17993t = semanticsNode.m17993t();
        C7608s c7608s = C7608s.f20138a;
        return !m17993t.m18035h(c7608s.m17968c()) && semanticsNode.m17993t().m18035h(c7608s.m17966e());
    }

    /* renamed from: S */
    private final void m39591S(LayoutNode layoutNode) {
        if (this.f2372o.add(layoutNode)) {
            this.f2373p.mo5641i(C13195u.f34156a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x00fa -> B:63:0x00dc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0101 -> B:63:0x00dc). Please submit an issue!!! */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m39588V(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p018ui.platform.C0780s.m39588V(int, int, android.os.Bundle):boolean");
    }

    /* renamed from: W */
    private static final boolean m39587W(C7593i c7593i, float f) {
        return (f < 0.0f && ((Number) c7593i.m18052c().mo42214q()).floatValue() > 0.0f) || (f > 0.0f && ((Number) c7593i.m18052c().mo42214q()).floatValue() < ((Number) c7593i.m18054a().mo42214q()).floatValue());
    }

    /* renamed from: X */
    private static final float m39586X(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* renamed from: Z */
    private static final boolean m39584Z(C7593i c7593i) {
        return (((Number) c7593i.m18052c().mo42214q()).floatValue() > 0.0f && !c7593i.m18053b()) || (((Number) c7593i.m18052c().mo42214q()).floatValue() < ((Number) c7593i.m18054a().mo42214q()).floatValue() && c7593i.m18053b());
    }

    /* renamed from: a0 */
    private static final boolean m39583a0(C7593i c7593i) {
        return (((Number) c7593i.m18052c().mo42214q()).floatValue() < ((Number) c7593i.m18054a().mo42214q()).floatValue() && !c7593i.m18053b()) || (((Number) c7593i.m18052c().mo42214q()).floatValue() > 0.0f && c7593i.m18053b());
    }

    /* renamed from: b0 */
    private final boolean m39582b0(int i, List list) {
        boolean z;
        C0719g1 m39516m = C0801t.m39516m(list, i);
        if (m39516m != null) {
            z = false;
        } else {
            C0719g1 c0719g1 = new C0719g1(i, this.f2382y, null, null, null, null);
            z = true;
            m39516m = c0719g1;
        }
        this.f2382y.add(m39516m);
        return z;
    }

    /* renamed from: c0 */
    private final boolean m39581c0(int i) {
        if (m39594P() && !m39593Q(i)) {
            int i2 = this.f2367j;
            if (i2 != Integer.MIN_VALUE) {
                m39576h0(this, i2, 65536, null, null, 12, null);
            }
            this.f2367j = i;
            this.f2361d.invalidate();
            m39576h0(this, i, 32768, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m39580d0(C0780s c0780s) {
        Intrinsics.isThisObjectNull(c0780s, "this$0");
        c0780s.m39609A();
        c0780s.f2380w = false;
    }

    /* renamed from: e0 */
    private final int m39579e0(int i) {
        if (i == this.f2361d.getSemanticsOwner().m17971a().m18004i()) {
            return -1;
        }
        return i;
    }

    /* renamed from: f0 */
    private final boolean m39578f0(AccessibilityEvent accessibilityEvent) {
        if (m39594P()) {
            return this.f2361d.getParent().requestSendAccessibilityEvent(this.f2361d, accessibilityEvent);
        }
        return false;
    }

    /* renamed from: g0 */
    private final boolean m39577g0(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m39594P()) {
            return false;
        }
        AccessibilityEvent m39607C = m39607C(i, i2);
        if (num != null) {
            m39607C.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            m39607C.setContentDescription(C9577i.m10569d(list, ",", null, null, 0, null, null, 62, null));
        }
        return m39578f0(m39607C);
    }

    /* renamed from: h0 */
    static /* synthetic */ boolean m39576h0(C0780s c0780s, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return c0780s.m39577g0(i, i2, num, list);
    }

    /* renamed from: i0 */
    private final void m39575i0(int i, int i2, String str) {
        AccessibilityEvent m39607C = m39607C(m39579e0(i), 32);
        m39607C.setContentChangeTypes(i2);
        if (str != null) {
            m39607C.getText().add(str);
        }
        m39578f0(m39607C);
    }

    /* renamed from: j0 */
    private final void m39574j0(int i) {
        C0788f c0788f = this.f2375r;
        if (c0788f != null) {
            if (i != c0788f.m39543d().m18004i()) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0788f.m39541f() <= 1000) {
                AccessibilityEvent m39607C = m39607C(m39579e0(c0788f.m39543d().m18004i()), 131072);
                m39607C.setFromIndex(c0788f.m39545b());
                m39607C.setToIndex(c0788f.m39542e());
                m39607C.setAction(c0788f.m39546a());
                m39607C.setMovementGranularity(c0788f.m39544c());
                m39607C.getText().add(m39600J(c0788f.m39543d()));
                m39578f0(m39607C);
            }
        }
        this.f2375r = null;
    }

    /* renamed from: k0 */
    private final void m39573k0(C0719g1 c0719g1) {
        if (c0719g1.mo21638k()) {
            this.f2361d.getSnapshotObserver().m21610e(c0719g1, this.f2383z, new C0793k(c0719g1, this));
        }
    }

    /* renamed from: m0 */
    private final void m39571m0(SemanticsNode semanticsNode, C0789g c0789g) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List m17997p = semanticsNode.m17997p();
        int size = m17997p.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            SemanticsNode semanticsNode2 = (SemanticsNode) m17997p.get(i2);
            if (m39601I().containsKey(Integer.valueOf(semanticsNode2.m18004i()))) {
                if (!c0789g.m39540a().contains(Integer.valueOf(semanticsNode2.m18004i()))) {
                    m39591S(semanticsNode.m18002k());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.m18004i()));
            }
            i2 = i3;
        }
        for (Number number : c0789g.m39540a()) {
            if (!linkedHashSet.contains(Integer.valueOf(number.intValue()))) {
                m39591S(semanticsNode.m18002k());
                return;
            }
        }
        List m17997p2 = semanticsNode.m17997p();
        int size2 = m17997p2.size();
        while (i < size2) {
            int i4 = i + 1;
            SemanticsNode semanticsNode3 = (SemanticsNode) m17997p2.get(i);
            if (m39601I().containsKey(Integer.valueOf(semanticsNode3.m18004i()))) {
                Object obj = m39598L().get(Integer.valueOf(semanticsNode3.m18004i()));
                Intrinsics.ifNullDoSomething(obj);
                m39571m0(semanticsNode3, (C0789g) obj);
            }
            i = i4;
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m39570n(C0780s c0780s) {
        m39580d0(c0780s);
    }

    /* renamed from: n0 */
    private final void m39569n0(LayoutNode layoutNode, C9552b c9552b) {
        LayoutNode m39525d;
        SemanticsWrapper m17974j;
        if (layoutNode.m21515q0() && !this.f2361d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            SemanticsWrapper m17974j2 = C7607q.m17974j(layoutNode);
            if (m17974j2 == null) {
                LayoutNode m39525d2 = C0801t.m39525d(layoutNode, C0796n.f2408w);
                m17974j2 = m39525d2 == null ? null : C7607q.m17974j(m39525d2);
                if (m17974j2 == null) {
                    return;
                }
            }
            if (!m17974j2.m17903Y1().m18029u() && (m39525d = C0801t.m39525d(layoutNode, C0795m.f2407w)) != null && (m17974j = C7607q.m17974j(m39525d)) != null) {
                m17974j2 = m17974j;
            }
            int id2 = ((SemanticsModifier) m17974j2.m21755P1()).getId();
            if (c9552b.add(Integer.valueOf(id2))) {
                m39576h0(this, m39579e0(id2), 2048, 1, null, 8, null);
            }
        }
    }

    /* renamed from: o */
    public static final /* synthetic */ void m39568o(C0780s c0780s, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        c0780s.m39552w(i, accessibilityNodeInfo, str, bundle);
    }

    /* renamed from: o0 */
    private final boolean m39567o0(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String m39600J;
        Boolean bool;
        SemanticsConfiguration m17993t = semanticsNode.m17993t();
        C7594j c7594j = C7594j.f20098a;
        if (m17993t.m18035h(c7594j.m18038n()) && C0801t.m39527b(semanticsNode)) {
            InterfaceC6113q interfaceC6113q = (InterfaceC6113q) ((C7580a) semanticsNode.m17993t().m18033o(c7594j.m18038n())).m18105a();
            if (interfaceC6113q == null || (bool = (Boolean) interfaceC6113q.mo4533i(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))) == null) {
                return false;
            }
            return bool.booleanValue();
        } else if ((i == i2 && i2 == this.f2370m) || (m39600J = m39600J(semanticsNode)) == null) {
            return false;
        } else {
            this.f2370m = (i < 0 || i != i2 || i2 > m39600J.length()) ? -1 : -1;
            boolean z2 = m39600J.length() > 0;
            m39578f0(m39605E(m39579e0(semanticsNode.m18004i()), z2 ? Integer.valueOf(this.f2370m) : null, z2 ? Integer.valueOf(this.f2370m) : null, z2 ? Integer.valueOf(m39600J.length()) : null, m39600J));
            m39574j0(semanticsNode.m18004i());
            return true;
        }
    }

    /* renamed from: p */
    public static final /* synthetic */ AccessibilityNodeInfo m39566p(C0780s c0780s, int i) {
        return c0780s.m39606D(i);
    }

    /* renamed from: p0 */
    private final void m39565p0(SemanticsNode semanticsNode, C1085c c1085c) {
        SemanticsConfiguration m17993t = semanticsNode.m17993t();
        C7608s c7608s = C7608s.f20138a;
        if (m17993t.m18035h(c7608s.m17965f())) {
            c1085c.m38552f0(true);
            c1085c.m38544j0((CharSequence) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17965f()));
        }
    }

    /* renamed from: q */
    public static final /* synthetic */ Handler m39564q(C0780s c0780s) {
        return c0780s.f2365h;
    }

    /* renamed from: q0 */
    private final void m39563q0(SemanticsNode semanticsNode, C1085c c1085c) {
        AnnotatedString annotatedString;
        AnnotatedString m39597M = m39597M(semanticsNode.m17993t());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) m39557t0(m39597M == null ? null : C11534a.m4798b(m39597M, this.f2361d.getDensity(), this.f2361d.getFontLoader()), 100000);
        List list = (List) C7595l.m18025a(semanticsNode.m17993t(), C7608s.f20138a.m17949v());
        if (list != null && (annotatedString = (AnnotatedString) C13777q.m254N(list)) != null) {
            spannableString = C11534a.m4798b(annotatedString, this.f2361d.getDensity(), this.f2361d.getFontLoader());
        }
        SpannableString spannableString3 = (SpannableString) m39557t0(spannableString, 100000);
        if (spannableString2 == null) {
            spannableString2 = spannableString3;
        }
        c1085c.m38588G0(spannableString2);
    }

    /* renamed from: r */
    public static final /* synthetic */ Runnable m39562r(C0780s c0780s) {
        return c0780s.f2381x;
    }

    /* renamed from: r0 */
    private final RectF m39561r0(SemanticsNode semanticsNode, p373u0.Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        p373u0.Rect m7116o = rect.m7116o(semanticsNode.m17998o());
        p373u0.Rect m18007f = semanticsNode.m18007f();
        p373u0.Rect m7119l = m7116o.m7118m(m18007f) ? m7116o.m7119l(m18007f) : null;
        if (m7119l != null) {
            long mo24794b = this.f2361d.mo24794b(C10776g.m7133a(m7119l.m7125f(), m7119l.m7122i()));
            long mo24794b2 = this.f2361d.mo24794b(C10776g.m7133a(m7119l.m7124g(), m7119l.m7128c()));
            return new RectF(C10774f.m7145k(mo24794b), C10774f.m7144l(mo24794b), C10774f.m7145k(mo24794b2), C10774f.m7144l(mo24794b2));
        }
        return null;
    }

    /* renamed from: s */
    public static final /* synthetic */ boolean m39560s(C0780s c0780s, int i, int i2, Bundle bundle) {
        return c0780s.m39588V(i, i2, bundle);
    }

    /* renamed from: s0 */
    private final boolean m39559s0(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        InterfaceC0717g m39599K;
        int i2;
        int i3;
        int m18004i = semanticsNode.m18004i();
        Integer num = this.f2371n;
        if (num == null || m18004i != num.intValue()) {
            this.f2370m = -1;
            this.f2371n = Integer.valueOf(semanticsNode.m18004i());
        }
        String m39600J = m39600J(semanticsNode);
        if ((m39600J == null || m39600J.length() == 0) || (m39599K = m39599K(semanticsNode, i)) == null) {
            return false;
        }
        int m39603G = m39603G(semanticsNode);
        if (m39603G == -1) {
            m39603G = z ? 0 : m39600J.length();
        }
        int[] mo39754b = z ? m39599K.mo39754b(m39603G) : m39599K.mo39755a(m39603G);
        if (mo39754b == null) {
            return false;
        }
        int i4 = mo39754b[0];
        int i5 = mo39754b[1];
        if (z2 && m39592R(semanticsNode)) {
            i2 = m39602H(semanticsNode);
            if (i2 == -1) {
                i2 = z ? i4 : i5;
            }
            i3 = z ? i5 : i4;
        } else {
            i2 = z ? i5 : i4;
            i3 = i2;
        }
        this.f2375r = new C0788f(semanticsNode, z ? 256 : 512, i, i4, i5, SystemClock.uptimeMillis());
        m39567o0(semanticsNode, i2, i3, true);
        return true;
    }

    /* renamed from: t */
    public static final /* synthetic */ int m39558t(C0780s c0780s, int i) {
        return c0780s.m39579e0(i);
    }

    /* renamed from: t0 */
    private final CharSequence m39557t0(CharSequence charSequence, int i) {
        boolean z = true;
        if (i > 0) {
            if (charSequence != null && charSequence.length() != 0) {
                z = false;
            }
            if (z || charSequence.length() <= i) {
                return charSequence;
            }
            int i2 = i - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i2)) && Character.isLowSurrogate(charSequence.charAt(i))) {
                i = i2;
            }
            return charSequence.subSequence(0, i);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: u */
    public static final /* synthetic */ boolean m39556u(C0780s c0780s, AccessibilityEvent accessibilityEvent) {
        return c0780s.m39578f0(accessibilityEvent);
    }

    /* renamed from: u0 */
    private final void m39555u0(int i) {
        int i2 = this.f2362e;
        if (i2 == i) {
            return;
        }
        this.f2362e = i;
        m39576h0(this, i, 128, null, null, 12, null);
        m39576h0(this, i2, 256, null, null, 12, null);
    }

    /* renamed from: v */
    public static final /* synthetic */ void m39554v(C0780s c0780s, C0719g1 c0719g1) {
        c0780s.m39573k0(c0719g1);
    }

    /* renamed from: v0 */
    private final void m39553v0() {
        SemanticsConfiguration m39539b;
        Iterator it = this.f2377t.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0723h1 c0723h1 = (C0723h1) m39601I().get(num);
            String str = null;
            SemanticsNode m39727b = c0723h1 == null ? null : c0723h1.m39727b();
            if (m39727b == null || !C0801t.m39524e(m39727b)) {
                this.f2377t.remove(num);
                Intrinsics.checkIfNull(num, "id");
                int intValue = num.intValue();
                C0789g c0789g = (C0789g) this.f2378u.get(num);
                if (c0789g != null && (m39539b = c0789g.m39539b()) != null) {
                    str = (String) C7595l.m18025a(m39539b, C7608s.f20138a.m17957n());
                }
                m39575i0(intValue, 32, str);
            }
        }
        this.f2378u.clear();
        for (Map.Entry entry : m39601I().entrySet()) {
            if (C0801t.m39524e(((C0723h1) entry.getValue()).m39727b()) && this.f2377t.add(entry.getKey())) {
                m39575i0(((Number) entry.getKey()).intValue(), 16, (String) ((C0723h1) entry.getValue()).m39727b().m17993t().m18033o(C7608s.f20138a.m17957n()));
            }
            this.f2378u.put(entry.getKey(), new C0789g(((C0723h1) entry.getValue()).m39727b(), m39601I()));
        }
        this.f2379v = new C0789g(this.f2361d.getSemanticsOwner().m17971a(), m39601I());
    }

    /* renamed from: w */
    private final void m39552w(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        String str2;
        C0723h1 c0723h1 = (C0723h1) m39601I().get(Integer.valueOf(i));
        SemanticsNode m39727b = c0723h1 == null ? null : c0723h1.m39727b();
        if (m39727b == null) {
            return;
        }
        String m39600J = m39600J(m39727b);
        SemanticsConfiguration m17993t = m39727b.m17993t();
        C7594j c7594j = C7594j.f20098a;
        if (m17993t.m18035h(c7594j.m18045g()) && bundle != null && Intrinsics.equals(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (m39600J == null ? Reader.READ_DONE : m39600J.length())) {
                    ArrayList arrayList = new ArrayList();
                    InterfaceC6108l interfaceC6108l = (InterfaceC6108l) ((C7580a) m39727b.m17993t().m18033o(c7594j.m18045g())).m18105a();
                    if (Intrinsics.equals(interfaceC6108l == null ? null : (Boolean) interfaceC6108l.mo9587d(arrayList), Boolean.TRUE)) {
                        C8392u c8392u = (C8392u) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        int i4 = 0;
                        while (i4 < i3) {
                            int i5 = i4 + 1;
                            int i6 = i4 + i2;
                            if (i6 >= c8392u.m15558h().m15566l().length()) {
                                arrayList2.add(null);
                            } else {
                                arrayList2.add(m39561r0(m39727b, c8392u.m15564b(i6)));
                            }
                            i4 = i5;
                        }
                        Bundle extras = accessibilityNodeInfo.getExtras();
                        Object[] array = arrayList2.toArray(new RectF[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        extras.putParcelableArray(str, (Parcelable[]) array);
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        SemanticsConfiguration m17993t2 = m39727b.m17993t();
        C7608s c7608s = C7608s.f20138a;
        if (!m17993t2.m18035h(c7608s.m17950u()) || bundle == null || !Intrinsics.equals(str, "androidx.compose.ui.semantics.testTag") || (str2 = (String) C7595l.m18025a(m39727b.m17993t(), c7608s.m17950u())) == null) {
            return;
        }
        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
    }

    /* renamed from: C */
    public final AccessibilityEvent m39607C(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        Intrinsics.checkIfNull(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f2361d.getContext().getPackageName());
        obtain.setSource(this.f2361d, i);
        C0723h1 c0723h1 = (C0723h1) m39601I().get(Integer.valueOf(i));
        if (c0723h1 != null) {
            obtain.setPassword(C0801t.m39523f(c0723h1.m39727b()));
        }
        return obtain;
    }

    /* renamed from: F */
    public final boolean m39604F(MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(motionEvent, "event");
        if (m39594P()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int m39595O = m39595O(motionEvent.getX(), motionEvent.getY());
                boolean dispatchGenericMotionEvent = this.f2361d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                m39555u0(m39595O);
                if (m39595O == Integer.MIN_VALUE) {
                    return dispatchGenericMotionEvent;
                }
                return true;
            } else if (action != 10) {
                return false;
            } else {
                if (this.f2362e != Integer.MIN_VALUE) {
                    m39555u0(Integer.MIN_VALUE);
                    return true;
                }
                return this.f2361d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
        }
        return false;
    }

    /* renamed from: L */
    public final Map m39598L() {
        return this.f2378u;
    }

    /* renamed from: N */
    public final AndroidComposeView m39596N() {
        return this.f2361d;
    }

    /* renamed from: O */
    public final int m39595O(float f, float f2) {
        LayoutNode m21378c1;
        SemanticsWrapper semanticsWrapper = null;
        InterfaceC6253f0.C6255b.m21641a(this.f2361d, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m21525l0(this.f2361d.getRoot(), C10776g.m7133a(f, f2), hitTestResult, false, false, 12, null);
        SemanticsWrapper semanticsWrapper2 = (SemanticsWrapper) C13777q.m248X(hitTestResult);
        if (semanticsWrapper2 != null && (m21378c1 = semanticsWrapper2.m21378c1()) != null) {
            semanticsWrapper = C7607q.m17974j(m21378c1);
        }
        if (semanticsWrapper != null) {
            SemanticsNode semanticsNode = new SemanticsNode(semanticsWrapper, false);
            SemanticsWrapper m18008e = semanticsNode.m18008e();
            if (semanticsNode.m17993t().m18035h(C7608s.f20138a.m17959l()) || m18008e.m21357t1() || ((AbstractC0845a) this.f2361d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsWrapper.m21378c1())) != null) {
                return Integer.MIN_VALUE;
            }
            return m39579e0(((SemanticsModifier) semanticsWrapper.m21755P1()).getId());
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: T */
    public final void m39590T(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
        this.f2374q = true;
        if (m39594P()) {
            m39591S(layoutNode);
        }
    }

    /* renamed from: U */
    public final void m39589U() {
        this.f2374q = true;
        if (!m39594P() || this.f2380w) {
            return;
        }
        this.f2380w = true;
        this.f2365h.post(this.f2381x);
    }

    /* renamed from: Y */
    public final void m39585Y(int i, C1085c c1085c, SemanticsNode semanticsNode) {
        SemanticsWrapper m18008e;
        List<Integer> m275S;
        C1085c.C1086a c1086a;
        C1085c.C1086a c1086a2;
        float m15006c;
        float m15001h;
        float m14997l;
        int m19530c;
        String string;
        String str;
        Intrinsics.isThisObjectNull(c1085c, "info");
        Intrinsics.isThisObjectNull(semanticsNode, "semanticsNode");
        c1085c.m38562a0("android.view.View");
        C7591h c7591h = (C7591h) C7595l.m18025a(semanticsNode.m17993t(), C7608s.f20138a.m17954q());
        if (c7591h != null) {
            int m18061m = c7591h.m18061m();
            if (semanticsNode.m17992u() || semanticsNode.m17997p().isEmpty()) {
                C7591h.C7592a c7592a = C7591h.f20087b;
                if (C7591h.m18064j(c7591h.m18061m(), c7592a.m18055f())) {
                    c1085c.m38512z0(m39596N().getContext().getResources().getString(C9576h.tab));
                } else {
                    if (C7591h.m18064j(m18061m, c7592a.m18060a())) {
                        str = "android.widget.Button";
                    } else if (C7591h.m18064j(m18061m, c7592a.m18059b())) {
                        str = "android.widget.CheckBox";
                    } else if (C7591h.m18064j(m18061m, c7592a.m18056e())) {
                        str = "android.widget.Switch";
                    } else if (C7591h.m18064j(m18061m, c7592a.m18057d())) {
                        str = "android.widget.RadioButton";
                    } else {
                        str = C7591h.m18064j(m18061m, c7592a.m18058c()) ? "android.widget.ImageView" : null;
                    }
                    if (!C7591h.m18064j(c7591h.m18061m(), c7592a.m18058c())) {
                        c1085c.m38562a0(str);
                    } else if (C0801t.m39525d(semanticsNode.m18002k(), C0792j.f2403w) == null || semanticsNode.m17993t().m18029u()) {
                        c1085c.m38562a0(str);
                    }
                }
            }
            C13195u c13195u = C13195u.f34156a;
        }
        if (C0801t.m39521h(semanticsNode)) {
            c1085c.m38562a0("android.widget.EditText");
        }
        c1085c.m38524t0(this.f2361d.getContext().getPackageName());
        List m17996q = semanticsNode.m17996q();
        int size = m17996q.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            SemanticsNode semanticsNode2 = (SemanticsNode) m17996q.get(i3);
            if (m39601I().containsKey(Integer.valueOf(semanticsNode2.m18004i()))) {
                AbstractC0845a abstractC0845a = (AbstractC0845a) m39596N().getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.m18002k());
                if (abstractC0845a != null) {
                    c1085c.m38559c(abstractC0845a);
                } else {
                    c1085c.m38557d(m39596N(), semanticsNode2.m18004i());
                }
            }
            i3 = i4;
        }
        if (this.f2367j == i) {
            c1085c.m38569U(true);
            c1085c.m38561b(C1085c.C1086a.f3427g);
        } else {
            c1085c.m38569U(false);
            c1085c.m38561b(C1085c.C1086a.f3426f);
        }
        m39563q0(semanticsNode, c1085c);
        m39565p0(semanticsNode, c1085c);
        SemanticsConfiguration m17993t = semanticsNode.m17993t();
        C7608s c7608s = C7608s.f20138a;
        c1085c.m38590F0((CharSequence) C7595l.m18025a(m17993t, c7608s.m17951t()));
        EnumC7999a enumC7999a = (EnumC7999a) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17947x());
        if (enumC7999a != null) {
            c1085c.m38565Y(true);
            int i5 = C0790h.f2396a[enumC7999a.ordinal()];
            if (i5 == 1) {
                c1085c.m38564Z(true);
                if ((c7591h == null ? false : C7591h.m18064j(c7591h.m18061m(), C7591h.f20087b.m18056e())) && c1085c.m38517x() == null) {
                    c1085c.m38590F0(m39596N().getContext().getResources().getString(C9576h.on));
                }
            } else if (i5 != 2) {
                if (i5 == 3 && c1085c.m38517x() == null) {
                    c1085c.m38590F0(m39596N().getContext().getResources().getString(C9576h.indeterminate));
                }
            } else {
                c1085c.m38564Z(false);
                if ((c7591h == null ? false : C7591h.m18064j(c7591h.m18061m(), C7591h.f20087b.m18056e())) && c1085c.m38517x() == null) {
                    c1085c.m38590F0(m39596N().getContext().getResources().getString(C9576h.off));
                }
            }
            C13195u c13195u2 = C13195u.f34156a;
        }
        Boolean bool = (Boolean) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17952s());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (c7591h == null ? false : C7591h.m18064j(c7591h.m18061m(), C7591h.f20087b.m18055f())) {
                c1085c.m38596C0(booleanValue);
            } else {
                c1085c.m38565Y(true);
                c1085c.m38564Z(booleanValue);
                if (c1085c.m38517x() == null) {
                    if (booleanValue) {
                        string = m39596N().getContext().getResources().getString(C9576h.selected);
                    } else {
                        string = m39596N().getContext().getResources().getString(C9576h.not_selected);
                    }
                    c1085c.m38590F0(string);
                }
            }
            C13195u c13195u3 = C13195u.f34156a;
        }
        if (!semanticsNode.m17993t().m18029u() || semanticsNode.m17997p().isEmpty()) {
            List list = (List) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17968c());
            c1085c.m38554e0(list == null ? null : (String) C13777q.m254N(list));
        }
        if (semanticsNode.m17993t().m18029u()) {
            c1085c.m38600A0(true);
        }
        if (((C13195u) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17963h())) != null) {
            c1085c.m38538m0(true);
            C13195u c13195u4 = C13195u.f34156a;
        }
        c1085c.m38516x0(C0801t.m39523f(semanticsNode));
        c1085c.m38548h0(C0801t.m39521h(semanticsNode));
        c1085c.m38546i0(C0801t.m39527b(semanticsNode));
        c1085c.m38542k0(semanticsNode.m17993t().m18035h(c7608s.m17964g()));
        if (c1085c.m38589G()) {
            c1085c.m38540l0(((Boolean) semanticsNode.m17993t().m18033o(c7608s.m17964g())).booleanValue());
            if (c1085c.m38587H()) {
                c1085c.m38563a(2);
            } else {
                c1085c.m38563a(1);
            }
        }
        if (semanticsNode.m17992u()) {
            SemanticsNode m17999n = semanticsNode.m17999n();
            m18008e = m17999n == null ? null : m17999n.m18008e();
        } else {
            m18008e = semanticsNode.m18008e();
        }
        c1085c.m38582J0(!(m18008e == null ? false : m18008e.m21357t1()) && C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17959l()) == null);
        C7584e c7584e = (C7584e) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17958m());
        if (c7584e != null) {
            int m18087i = c7584e.m18087i();
            C7584e.C7585a c7585a = C7584e.f20070b;
            c1085c.m38532p0((C7584e.m18090f(m18087i, c7585a.m18085b()) || !C7584e.m18090f(m18087i, c7585a.m18086a())) ? 1 : 2);
            C13195u c13195u5 = C13195u.f34156a;
        }
        c1085c.m38560b0(false);
        SemanticsConfiguration m17993t2 = semanticsNode.m17993t();
        C7594j c7594j = C7594j.f20098a;
        C7580a c7580a = (C7580a) C7595l.m18025a(m17993t2, c7594j.m18044h());
        if (c7580a != null) {
            boolean equals = Intrinsics.equals(C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17952s()), Boolean.TRUE);
            c1085c.m38560b0(!equals);
            if (C0801t.m39527b(semanticsNode) && !equals) {
                c1085c.m38561b(new C1085c.C1086a(16, c7580a.m18104b()));
            }
            C13195u c13195u6 = C13195u.f34156a;
        }
        c1085c.m38530q0(false);
        C7580a c7580a2 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18043i());
        if (c7580a2 != null) {
            c1085c.m38530q0(true);
            if (C0801t.m39527b(semanticsNode)) {
                c1085c.m38561b(new C1085c.C1086a(32, c7580a2.m18104b()));
            }
            C13195u c13195u7 = C13195u.f34156a;
        }
        C7580a c7580a3 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18050b());
        if (c7580a3 != null) {
            c1085c.m38561b(new C1085c.C1086a(16384, c7580a3.m18104b()));
            C13195u c13195u8 = C13195u.f34156a;
        }
        if (C0801t.m39527b(semanticsNode)) {
            C7580a c7580a4 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18037o());
            if (c7580a4 != null) {
                c1085c.m38561b(new C1085c.C1086a(2097152, c7580a4.m18104b()));
                C13195u c13195u9 = C13195u.f34156a;
            }
            C7580a c7580a5 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18048d());
            if (c7580a5 != null) {
                c1085c.m38561b(new C1085c.C1086a(65536, c7580a5.m18104b()));
                C13195u c13195u10 = C13195u.f34156a;
            }
            C7580a c7580a6 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18042j());
            if (c7580a6 != null) {
                if (c1085c.m38587H() && m39596N().getClipboardManager().m39714a()) {
                    c1085c.m38561b(new C1085c.C1086a(32768, c7580a6.m18104b()));
                }
                C13195u c13195u11 = C13195u.f34156a;
            }
        }
        String m39600J = m39600J(semanticsNode);
        if (!(m39600J == null || m39600J.length() == 0)) {
            c1085c.m38586H0(m39602H(semanticsNode), m39603G(semanticsNode));
            C7580a c7580a7 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18038n());
            c1085c.m38561b(new C1085c.C1086a(131072, c7580a7 != null ? c7580a7.m18104b() : null));
            c1085c.m38563a(256);
            c1085c.m38563a(512);
            c1085c.m38526s0(11);
            List list2 = (List) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17968c());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.m17993t().m18035h(c7594j.m18045g()) && !C0801t.m39526c(semanticsNode)) {
                c1085c.m38526s0(c1085c.m38525t() | 4 | 16);
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence m38515y = c1085c.m38515y();
            if (!(m38515y == null || m38515y.length() == 0) && semanticsNode.m17993t().m18035h(c7594j.m18045g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.m17993t().m18035h(c7608s.m17950u())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                C0725j c0725j = C0725j.f2272a;
                AccessibilityNodeInfo m38580K0 = c1085c.m38580K0();
                Intrinsics.checkIfNull(m38580K0, "info.unwrap()");
                c0725j.m39718a(m38580K0, arrayList);
            }
        }
        SemanticsProperties semanticsProperties = (SemanticsProperties) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17955p());
        if (semanticsProperties != null) {
            if (semanticsNode.m17993t().m18035h(c7594j.m18039m())) {
                c1085c.m38562a0("android.widget.SeekBar");
            } else {
                c1085c.m38562a0("android.widget.ProgressBar");
            }
            if (semanticsProperties != SemanticsProperties.f20082d.m18074a()) {
                c1085c.m38514y0(C1085c.C1089d.m38505a(1, ((Number) semanticsProperties.m18076c().mo42223getStart()).floatValue(), ((Number) semanticsProperties.m18076c().mo42222b()).floatValue(), semanticsProperties.m18077b()));
                if (c1085c.m38517x() == null) {
                    InterfaceC8606b m18076c = semanticsProperties.m18076c();
                    m14997l = _Ranges.m14997l(((((Number) m18076c.mo42222b()).floatValue() - ((Number) m18076c.mo42223getStart()).floatValue()) > 0.0f ? 1 : ((((Number) m18076c.mo42222b()).floatValue() - ((Number) m18076c.mo42223getStart()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (semanticsProperties.m18077b() - ((Number) m18076c.mo42223getStart()).floatValue()) / (((Number) m18076c.mo42222b()).floatValue() - ((Number) m18076c.mo42223getStart()).floatValue()), 0.0f, 1.0f);
                    int i7 = 100;
                    if (m14997l == 0.0f) {
                        i7 = 0;
                    } else {
                        if (!(m14997l == 1.0f)) {
                            m19530c = C7037c.m19530c(m14997l * 100);
                            i7 = _Ranges.m14996m(m19530c, 1, 99);
                        }
                    }
                    c1085c.m38590F0(this.f2361d.getContext().getResources().getString(C9576h.template_percent, Integer.valueOf(i7)));
                }
            } else if (c1085c.m38517x() == null) {
                c1085c.m38590F0(this.f2361d.getContext().getResources().getString(C9576h.in_progress));
            }
            if (semanticsNode.m17993t().m18035h(c7594j.m18039m()) && C0801t.m39527b(semanticsNode)) {
                float m18077b = semanticsProperties.m18077b();
                m15006c = _Ranges.m15006c(((Number) semanticsProperties.m18076c().mo42222b()).floatValue(), ((Number) semanticsProperties.m18076c().mo42223getStart()).floatValue());
                if (m18077b < m15006c) {
                    c1085c.m38561b(C1085c.C1086a.f3428h);
                }
                float m18077b2 = semanticsProperties.m18077b();
                m15001h = _Ranges.m15001h(((Number) semanticsProperties.m18076c().mo42223getStart()).floatValue(), ((Number) semanticsProperties.m18076c().mo42222b()).floatValue());
                if (m18077b2 > m15001h) {
                    c1085c.m38561b(C1085c.C1086a.f3429i);
                }
            }
        }
        if (i6 >= 24) {
            C0782b.f2385a.m39548a(c1085c, semanticsNode);
        }
        CollectionInfo.m20589d(semanticsNode, c1085c);
        CollectionInfo.m20588e(semanticsNode, c1085c);
        C7593i c7593i = (C7593i) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17962i());
        C7580a c7580a8 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18041k());
        if (c7593i != null && c7580a8 != null) {
            if (!CollectionInfo.m20591b(semanticsNode)) {
                c1085c.m38562a0("android.widget.HorizontalScrollView");
            }
            if (((Number) c7593i.m18054a().mo42214q()).floatValue() > 0.0f) {
                c1085c.m38598B0(true);
            }
            if (C0801t.m39527b(semanticsNode)) {
                if (m39583a0(c7593i)) {
                    c1085c.m38561b(C1085c.C1086a.f3428h);
                    if (!C0801t.m39522g(semanticsNode)) {
                        c1086a2 = C1085c.C1086a.f3436p;
                    } else {
                        c1086a2 = C1085c.C1086a.f3434n;
                    }
                    c1085c.m38561b(c1086a2);
                }
                if (m39584Z(c7593i)) {
                    c1085c.m38561b(C1085c.C1086a.f3429i);
                    if (!C0801t.m39522g(semanticsNode)) {
                        c1086a = C1085c.C1086a.f3434n;
                    } else {
                        c1086a = C1085c.C1086a.f3436p;
                    }
                    c1085c.m38561b(c1086a);
                }
            }
        }
        C7593i c7593i2 = (C7593i) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17946y());
        if (c7593i2 != null && c7580a8 != null) {
            if (!CollectionInfo.m20591b(semanticsNode)) {
                c1085c.m38562a0("android.widget.ScrollView");
            }
            if (((Number) c7593i2.m18054a().mo42214q()).floatValue() > 0.0f) {
                c1085c.m38598B0(true);
            }
            if (C0801t.m39527b(semanticsNode)) {
                if (m39583a0(c7593i2)) {
                    c1085c.m38561b(C1085c.C1086a.f3428h);
                    c1085c.m38561b(C1085c.C1086a.f3435o);
                }
                if (m39584Z(c7593i2)) {
                    c1085c.m38561b(C1085c.C1086a.f3429i);
                    c1085c.m38561b(C1085c.C1086a.f3433m);
                }
            }
        }
        c1085c.m38522u0((CharSequence) C7595l.m18025a(semanticsNode.m17993t(), c7608s.m17957n()));
        if (C0801t.m39527b(semanticsNode)) {
            C7580a c7580a9 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18046f());
            if (c7580a9 != null) {
                c1085c.m38561b(new C1085c.C1086a(262144, c7580a9.m18104b()));
                C13195u c13195u12 = C13195u.f34156a;
            }
            C7580a c7580a10 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18051a());
            if (c7580a10 != null) {
                c1085c.m38561b(new C1085c.C1086a(524288, c7580a10.m18104b()));
                C13195u c13195u13 = C13195u.f34156a;
            }
            C7580a c7580a11 = (C7580a) C7595l.m18025a(semanticsNode.m17993t(), c7594j.m18047e());
            if (c7580a11 != null) {
                c1085c.m38561b(new C1085c.C1086a(1048576, c7580a11.m18104b()));
                C13195u c13195u14 = C13195u.f34156a;
            }
            if (semanticsNode.m17993t().m18035h(c7594j.m18049c())) {
                List list3 = (List) semanticsNode.m17993t().m18033o(c7594j.m18049c());
                int size2 = list3.size();
                int[] iArr = f2360A;
                if (size2 < iArr.length) {
                    C9559h c9559h = new C9559h();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f2369l.m10606d(i)) {
                        Map map = (Map) this.f2369l.m10604f(i);
                        m275S = _Arrays.m275S(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list3.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            int i9 = i8 + 1;
                            C7583d c7583d = (C7583d) list3.get(i8);
                            Intrinsics.ifNullDoSomething(map);
                            if (map.containsKey(c7583d.m18096b())) {
                                Integer num = (Integer) map.get(c7583d.m18096b());
                                Intrinsics.ifNullDoSomething(num);
                                c9559h.m10599l(num.intValue(), c7583d.m18096b());
                                linkedHashMap.put(c7583d.m18096b(), num);
                                m275S.remove(num);
                                c1085c.m38561b(new C1085c.C1086a(num.intValue(), c7583d.m18096b()));
                            } else {
                                arrayList2.add(c7583d);
                            }
                            i8 = i9;
                        }
                        int size4 = arrayList2.size();
                        while (i2 < size4) {
                            int i10 = i2 + 1;
                            C7583d c7583d2 = (C7583d) arrayList2.get(i2);
                            int intValue = m275S.get(i2).intValue();
                            c9559h.m10599l(intValue, c7583d2.m18096b());
                            linkedHashMap.put(c7583d2.m18096b(), Integer.valueOf(intValue));
                            c1085c.m38561b(new C1085c.C1086a(intValue, c7583d2.m18096b()));
                            i2 = i10;
                        }
                    } else {
                        int size5 = list3.size();
                        while (i2 < size5) {
                            int i11 = i2 + 1;
                            C7583d c7583d3 = (C7583d) list3.get(i2);
                            int i12 = f2360A[i2];
                            c9559h.m10599l(i12, c7583d3.m18096b());
                            linkedHashMap.put(c7583d3.m18096b(), Integer.valueOf(i12));
                            c1085c.m38561b(new C1085c.C1086a(i12, c7583d3.m18096b()));
                            i2 = i11;
                        }
                    }
                    this.f2368k.m10599l(i, c9559h);
                    this.f2369l.m10599l(i, linkedHashMap);
                    return;
                }
                throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
            }
        }
    }

    /* renamed from: b */
    public C1090d mo19282b(View view) {
        Intrinsics.isThisObjectNull(view, "host");
        return this.f2366i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r1v31, types: [p1.a] */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.ui.platform.s] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    /* renamed from: l0 */
    public final void m39572l0(Map map) {
        int m15000i;
        String m15771f;
        Intrinsics.isThisObjectNull(map, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.f2382y);
        this.f2382y.clear();
        for (Number number : map.keySet()) {
            int intValue = number.intValue();
            C0789g c0789g = (C0789g) this.f2378u.get(Integer.valueOf(intValue));
            if (c0789g != null) {
                C0723h1 c0723h1 = (C0723h1) map.get(Integer.valueOf(intValue));
                SemanticsNode m39727b = c0723h1 == null ? null : c0723h1.m39727b();
                Intrinsics.ifNullDoSomething(m39727b);
                Iterator it = m39727b.m17993t().iterator();
                boolean z = true;
                boolean z2 = false;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    C7608s c7608s = C7608s.f20138a;
                    if (((Intrinsics.equals(key, c7608s.m17962i()) || Intrinsics.equals(entry.getKey(), c7608s.m17946y())) ? m39582b0(intValue, arrayList) : false) || !Intrinsics.equals(entry.getValue(), C7595l.m18025a(c0789g.m39539b(), (C7619u) entry.getKey()))) {
                        C7619u c7619u = (C7619u) entry.getKey();
                        if (Intrinsics.equals(c7619u, c7608s.m17957n())) {
                            Object value = entry.getValue();
                            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) value;
                            if (c0789g.m39538c()) {
                                m39575i0(intValue, 8, str);
                            }
                        } else if (Intrinsics.equals(c7619u, c7608s.m17951t()) ? z : Intrinsics.equals(c7619u, c7608s.m17947x())) {
                            m39576h0(this, m39579e0(intValue), 2048, 64, null, 8, null);
                            m39576h0(this, m39579e0(intValue), 2048, 0, null, 8, null);
                        } else {
                            boolean z3 = z;
                            if (Intrinsics.equals(c7619u, c7608s.m17955p())) {
                                m39576h0(this, m39579e0(intValue), 2048, 64, null, 8, null);
                                m39576h0(this, m39579e0(intValue), 2048, 0, null, 8, null);
                            } else if (Intrinsics.equals(c7619u, c7608s.m17952s())) {
                                C7591h c7591h = (C7591h) C7595l.m18025a(m39727b.m18005h(), c7608s.m17954q());
                                if (c7591h == null ? false : C7591h.m18064j(c7591h.m18061m(), C7591h.f20087b.m18055f())) {
                                    if (Intrinsics.equals(C7595l.m18025a(m39727b.m18005h(), c7608s.m17952s()), Boolean.TRUE)) {
                                        AccessibilityEvent m39607C = m39607C(m39579e0(intValue), 4);
                                        SemanticsNode semanticsNode = new SemanticsNode(m39727b.m18000m(), z3);
                                        List list = (List) C7595l.m18025a(semanticsNode.m18005h(), c7608s.m17968c());
                                        String m10569d = list == null ? null : C9577i.m10569d(list, ",", null, null, 0, null, null, 62, null);
                                        List list2 = (List) C7595l.m18025a(semanticsNode.m18005h(), c7608s.m17949v());
                                        String m10569d2 = list2 == null ? null : C9577i.m10569d(list2, ",", null, null, 0, null, null, 62, null);
                                        if (m10569d != null) {
                                            m39607C.setContentDescription(m10569d);
                                            C13195u c13195u = C13195u.f34156a;
                                        }
                                        if (m10569d2 != null) {
                                            m39607C.getText().add(m10569d2);
                                        }
                                        m39578f0(m39607C);
                                    } else {
                                        m39576h0(this, m39579e0(intValue), 2048, 0, null, 8, null);
                                    }
                                } else {
                                    m39576h0(this, m39579e0(intValue), 2048, 64, null, 8, null);
                                    m39576h0(this, m39579e0(intValue), 2048, 0, null, 8, null);
                                }
                            } else if (Intrinsics.equals(c7619u, c7608s.m17968c())) {
                                int m39579e0 = m39579e0(intValue);
                                Object value2 = entry.getValue();
                                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                m39577g0(m39579e0, 2048, 4, (List) value2);
                            } else {
                                boolean equals = Intrinsics.equals(c7619u, c7608s.m17966e());
                                String str2 = BuildConfig.VERSION_NAME;
                                if (equals) {
                                    if (C0801t.m39521h(m39727b)) {
                                        AnnotatedString m39597M = m39597M(c0789g.m39539b());
                                        if (m39597M == null) {
                                            m39597M = BuildConfig.VERSION_NAME;
                                        }
                                        ?? m39597M2 = m39597M(m39727b.m17993t());
                                        if (m39597M2 != 0) {
                                            str2 = m39597M2;
                                        }
                                        int length = m39597M.length();
                                        int length2 = str2.length();
                                        m15000i = _Ranges.m15000i(length, length2);
                                        int i = 0;
                                        while (i < m15000i && m39597M.charAt(i) == str2.charAt(i)) {
                                            i++;
                                        }
                                        int i2 = 0;
                                        while (i2 < m15000i - i) {
                                            int i3 = m15000i;
                                            if (m39597M.charAt((length - 1) - i2) != str2.charAt((length2 - 1) - i2)) {
                                                break;
                                            }
                                            i2++;
                                            m15000i = i3;
                                        }
                                        AccessibilityEvent m39607C2 = m39607C(m39579e0(intValue), 16);
                                        m39607C2.setFromIndex(i);
                                        m39607C2.setRemovedCount((length - i2) - i);
                                        m39607C2.setAddedCount((length2 - i2) - i);
                                        m39607C2.setBeforeText(m39597M);
                                        m39607C2.getText().add(m39557t0(str2, 100000));
                                        m39578f0(m39607C2);
                                    } else {
                                        m39576h0(this, m39579e0(intValue), 2048, 2, null, 8, null);
                                    }
                                } else if (Intrinsics.equals(c7619u, c7608s.m17948w())) {
                                    AnnotatedString m39597M3 = m39597M(m39727b.m17993t());
                                    if (m39597M3 != null && (m15771f = m39597M3.m15771f()) != null) {
                                        str2 = m15771f;
                                    }
                                    long m15532m = ((C8393w) m39727b.m17993t().m18033o(c7608s.m17948w())).m15532m();
                                    m39578f0(m39605E(m39579e0(intValue), Integer.valueOf(C8393w.m15535j(m15532m)), Integer.valueOf(C8393w.m15538g(m15532m)), Integer.valueOf(str2.length()), (String) m39557t0(str2, 100000)));
                                    m39574j0(m39727b.m18004i());
                                } else if (Intrinsics.equals(c7619u, c7608s.m17962i()) ? true : Intrinsics.equals(c7619u, c7608s.m17946y())) {
                                    m39591S(m39727b.m18002k());
                                    C0719g1 m39516m = C0801t.m39516m(this.f2382y, intValue);
                                    Intrinsics.ifNullDoSomething(m39516m);
                                    m39516m.m39743f((C7593i) C7595l.m18025a(m39727b.m17993t(), c7608s.m17962i()));
                                    m39516m.m39740i((C7593i) C7595l.m18025a(m39727b.m17993t(), c7608s.m17946y()));
                                    m39573k0(m39516m);
                                } else if (Intrinsics.equals(c7619u, c7608s.m17964g())) {
                                    Object value3 = entry.getValue();
                                    Objects.requireNonNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                    if (((Boolean) value3).booleanValue()) {
                                        m39578f0(m39607C(m39579e0(m39727b.m18004i()), 8));
                                    }
                                    m39576h0(this, m39579e0(m39727b.m18004i()), 2048, 0, null, 8, null);
                                } else {
                                    C7594j c7594j = C7594j.f20098a;
                                    if (Intrinsics.equals(c7619u, c7594j.m18049c())) {
                                        List list3 = (List) m39727b.m17993t().m18033o(c7594j.m18049c());
                                        List list4 = (List) C7595l.m18025a(c0789g.m39539b(), c7594j.m18049c());
                                        if (list4 != null) {
                                            ?? linkedHashSet = new LinkedHashSet();
                                            int size = list3.size();
                                            for (int i4 = 0; i4 < size; i4++) {
                                                linkedHashSet.add(((C7583d) list3.get(i4)).m18096b());
                                            }
                                            ?? linkedHashSet2 = new LinkedHashSet();
                                            int size2 = list4.size();
                                            for (int i5 = 0; i5 < size2; i5++) {
                                                linkedHashSet2.add(((C7583d) list4.get(i5)).m18096b());
                                            }
                                            z2 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                        } else if (!list3.isEmpty()) {
                                            z = true;
                                            z2 = true;
                                        }
                                    } else if (entry.getValue() instanceof C7580a) {
                                        Object value4 = entry.getValue();
                                        Objects.requireNonNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                        z = true;
                                        z2 = !C0801t.m39528a((C7580a) value4, C7595l.m18025a(c0789g.m39539b(), (C7619u) entry.getKey()));
                                    } else {
                                        z2 = true;
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                }
                if (!z2) {
                    z2 = C0801t.m39520i(m39727b, c0789g);
                }
                if (z2) {
                    m39576h0(this, m39579e0(intValue), 2048, 0, null, 8, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a6, B:38:0x00ad, B:39:0x00b6, B:18:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c9 -> B:14:0x0037). Please submit an issue!!! */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m39551x(bd.InterfaceC1886d r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p018ui.platform.C0780s.m39551x(bd.d):java.lang.Object");
    }

    /* renamed from: y */
    public final boolean m39550y(boolean z, int i, long j) {
        return m39549z(m39601I().values(), z, i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m39549z(java.util.Collection r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            p181jd.Intrinsics.isThisObjectNull(r6, r0)
            u0.f$a r0 = p373u0.C10774f.f27866b
            long r0 = r0.m7135b()
            boolean r0 = p373u0.C10774f.m7147i(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lb8
            boolean r0 = p373u0.C10774f.m7142n(r9)
            if (r0 != 0) goto L1a
            goto Lb8
        L1a:
            r0 = 1
            if (r7 != r0) goto L24
            n1.s r7 = p245n1.C7608s.f20138a
            n1.u r7 = r7.m17946y()
            goto L2c
        L24:
            if (r7 != 0) goto Lb2
            n1.s r7 = p245n1.C7608s.f20138a
            n1.u r7 = r7.m17962i()
        L2c:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L34
            goto Lb1
        L34:
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.h1 r2 = (androidx.compose.p018ui.platform.C0723h1) r2
            android.graphics.Rect r3 = r2.m39728a()
            u0.h r3 = p393v0.C11069v0.m6242c(r3)
            boolean r3 = r3.m7129b(r9)
            if (r3 != 0) goto L54
        L52:
            r2 = r1
            goto Lae
        L54:
            n1.p r2 = r2.m39727b()
            n1.k r2 = r2.m18005h()
            java.lang.Object r2 = p245n1.C7595l.m18025a(r2, r7)
            n1.i r2 = (p245n1.C7593i) r2
            if (r2 != 0) goto L65
            goto L52
        L65:
            boolean r3 = r2.m18053b()
            if (r3 == 0) goto L6d
            int r3 = -r8
            goto L6e
        L6d:
            r3 = r8
        L6e:
            if (r8 != 0) goto L77
            boolean r4 = r2.m18053b()
            if (r4 == 0) goto L77
            r3 = -1
        L77:
            if (r3 >= 0) goto L8d
            id.a r2 = r2.m18052c()
            java.lang.Object r2 = r2.mo42214q()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L52
            goto Lad
        L8d:
            id.a r3 = r2.m18052c()
            java.lang.Object r3 = r3.mo42214q()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            id.a r2 = r2.m18054a()
            java.lang.Object r2 = r2.mo42214q()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L52
        Lad:
            r2 = r0
        Lae:
            if (r2 == 0) goto L38
            r1 = r0
        Lb1:
            return r1
        Lb2:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p018ui.platform.C0780s.m39549z(java.util.Collection, boolean, int, long):boolean");
    }
}
