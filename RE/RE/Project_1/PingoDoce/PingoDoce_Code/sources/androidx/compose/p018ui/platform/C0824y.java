package androidx.compose.p018ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.lifecycle.InterfaceC1491v;
import androidx.savedstate.InterfaceC1663c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.ExceptionsH;
import p092f0.AbstractC5250t0;
import p092f0.C5209j1;
import p092f0.C5255u0;
import p092f0.C5266y;
import p092f0.CompositionLocal;
import p092f0.Effects;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5264x;
import p181jd.AbstractC6438m;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p230m1.C7094b;
import p244n0.C7573h;
import p468yc.C13195u;

/* compiled from: AndroidCompositionLocals.android.kt */
/* renamed from: androidx.compose.ui.platform.y */
/* loaded from: classes.dex */
public final class C0824y {

    /* renamed from: a */
    private static final AbstractC5250t0 f2443a = CompositionLocal.m24953b(C5209j1.m25071g(), C0825a.f2449w);

    /* renamed from: b */
    private static final AbstractC5250t0 f2444b = CompositionLocal.m24951d(C0826b.f2450w);

    /* renamed from: c */
    private static final AbstractC5250t0 f2445c = CompositionLocal.m24951d(C0827c.f2451w);

    /* renamed from: d */
    private static final AbstractC5250t0 f2446d = CompositionLocal.m24951d(C0828d.f2452w);

    /* renamed from: e */
    private static final AbstractC5250t0 f2447e = CompositionLocal.m24951d(C0829e.f2453w);

    /* renamed from: f */
    private static final AbstractC5250t0 f2448f = CompositionLocal.m24951d(C0830f.f2454w);

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$a */
    /* loaded from: classes.dex */
    static final class C0825a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0825a f2449w = new C0825a();

        C0825a() {
            super(0);
        }

        /* renamed from: a */
        public final Configuration mo42214q() {
            C0824y.m39473e("LocalConfiguration");
            throw new ExceptionsH();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$b */
    /* loaded from: classes.dex */
    static final class C0826b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0826b f2450w = new C0826b();

        C0826b() {
            super(0);
        }

        /* renamed from: a */
        public final Context mo42214q() {
            C0824y.m39473e("LocalContext");
            throw new ExceptionsH();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$c */
    /* loaded from: classes.dex */
    static final class C0827c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0827c f2451w = new C0827c();

        C0827c() {
            super(0);
        }

        /* renamed from: a */
        public final C7094b mo42214q() {
            C0824y.m39473e("LocalImageVectorCache");
            throw new ExceptionsH();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$d */
    /* loaded from: classes.dex */
    static final class C0828d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0828d f2452w = new C0828d();

        C0828d() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC1491v mo42214q() {
            C0824y.m39473e("LocalLifecycleOwner");
            throw new ExceptionsH();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$e */
    /* loaded from: classes.dex */
    static final class C0829e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0829e f2453w = new C0829e();

        C0829e() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC1663c mo42214q() {
            C0824y.m39473e("LocalSavedStateRegistryOwner");
            throw new ExceptionsH();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$f */
    /* loaded from: classes.dex */
    static final class C0830f extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0830f f2454w = new C0830f();

        C0830f() {
            super(0);
        }

        /* renamed from: a */
        public final View mo42214q() {
            C0824y.m39473e("LocalView");
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$g */
    /* loaded from: classes.dex */
    public static final class C0831g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5220m0 f2455w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0831g(InterfaceC5220m0 interfaceC5220m0) {
            super(1);
            this.f2455w = interfaceC5220m0;
        }

        /* renamed from: a */
        public final void m39460a(Configuration configuration) {
            Intrinsics.isThisObjectNull(configuration, "it");
            C0824y.m39474d(this.f2455w, configuration);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39460a((Configuration) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$h */
    /* loaded from: classes.dex */
    public static final class C0832h extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C0759o0 f2456w;

        /* compiled from: Effects.kt */
        /* renamed from: androidx.compose.ui.platform.y$h$a */
        /* loaded from: classes.dex */
        public static final class C0833a implements InterfaceC5264x {

            /* renamed from: a */
            final /* synthetic */ C0759o0 f2457a;

            public C0833a(C0759o0 c0759o0) {
                this.f2457a = c0759o0;
            }

            /* renamed from: b */
            public void mo24852b() {
                this.f2457a.m39648e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0832h(C0759o0 c0759o0) {
            super(1);
            this.f2456w = c0759o0;
        }

        /* renamed from: a */
        public final InterfaceC5264x mo9587d(C5266y c5266y) {
            Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
            return new C0833a(this.f2456w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$i */
    /* loaded from: classes.dex */
    public static final class C0834i extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ AndroidComposeView f2458w;

        /* renamed from: x */
        final /* synthetic */ C0713f0 f2459x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6112p f2460y;

        /* renamed from: z */
        final /* synthetic */ int f2461z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0834i(AndroidComposeView androidComposeView, C0713f0 c0713f0, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f2458w = androidComposeView;
            this.f2459x = c0713f0;
            this.f2460y = interfaceC6112p;
            this.f2461z = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m39458a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m39458a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                CompositionLocals.m39711a(this.f2458w, this.f2459x, this.f2460y, interfaceC5179i, ((this.f2461z << 3) & 896) | 72);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$j */
    /* loaded from: classes.dex */
    public static final class C0835j extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ AndroidComposeView f2462w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f2463x;

        /* renamed from: y */
        final /* synthetic */ int f2464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0835j(AndroidComposeView androidComposeView, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f2462w = androidComposeView;
            this.f2463x = interfaceC6112p;
            this.f2464y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m39457a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m39457a(InterfaceC5179i interfaceC5179i, int i) {
            C0824y.m39477a(this.f2462w, this.f2463x, interfaceC5179i, this.f2464y | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$k */
    /* loaded from: classes.dex */
    public static final class C0836k extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Context f2465w;

        /* renamed from: x */
        final /* synthetic */ ComponentCallbacks2C0838l f2466x;

        /* compiled from: Effects.kt */
        /* renamed from: androidx.compose.ui.platform.y$k$a */
        /* loaded from: classes.dex */
        public static final class C0837a implements InterfaceC5264x {

            /* renamed from: a */
            final /* synthetic */ Context f2467a;

            /* renamed from: b */
            final /* synthetic */ ComponentCallbacks2C0838l f2468b;

            public C0837a(Context context, ComponentCallbacks2C0838l componentCallbacks2C0838l) {
                this.f2467a = context;
                this.f2468b = componentCallbacks2C0838l;
            }

            /* renamed from: b */
            public void mo24852b() {
                this.f2467a.getApplicationContext().unregisterComponentCallbacks(this.f2468b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0836k(Context context, ComponentCallbacks2C0838l componentCallbacks2C0838l) {
            super(1);
            this.f2465w = context;
            this.f2466x = componentCallbacks2C0838l;
        }

        /* renamed from: a */
        public final InterfaceC5264x mo9587d(C5266y c5266y) {
            Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
            this.f2465w.getApplicationContext().registerComponentCallbacks(this.f2466x);
            return new C0837a(this.f2465w, this.f2466x);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.y$l */
    /* loaded from: classes.dex */
    public static final class ComponentCallbacks2C0838l implements ComponentCallbacks2 {

        /* renamed from: w */
        final /* synthetic */ C6449y f2469w;

        /* renamed from: x */
        final /* synthetic */ C7094b f2470x;

        ComponentCallbacks2C0838l(C6449y c6449y, C7094b c7094b) {
            this.f2469w = c6449y;
            this.f2470x = c7094b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onConfigurationChanged(Configuration configuration) {
            Intrinsics.isThisObjectNull(configuration, "configuration");
            Configuration configuration2 = (Configuration) this.f2469w.f17533w;
            this.f2470x.m19314c(configuration2 == null ? -1 : configuration2.updateFrom(configuration));
            this.f2469w.f17533w = configuration;
        }

        public void onLowMemory() {
            this.f2470x.m19316a();
        }

        public void onTrimMemory(int i) {
            this.f2470x.m19316a();
        }
    }

    /* renamed from: a */
    public static final void m39477a(AndroidComposeView androidComposeView, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(androidComposeView, "owner");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-340663129);
        Context context = androidComposeView.getContext();
        mo25249u.mo25263g(-3687241);
        Object mo25262h = mo25249u.mo25262h();
        InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
        if (mo25262h == c5180a.m25243a()) {
            mo25262h = C5209j1.m25073e(context.getResources().getConfiguration(), C5209j1.m25071g());
            mo25249u.mo25247w(mo25262h);
        }
        mo25249u.mo25282C();
        InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
        mo25249u.mo25263g(-3686930);
        boolean mo25276I = mo25249u.mo25276I(interfaceC5220m0);
        Object mo25262h2 = mo25249u.mo25262h();
        if (mo25276I || mo25262h2 == c5180a.m25243a()) {
            mo25262h2 = new C0831g(interfaceC5220m0);
            mo25249u.mo25247w(mo25262h2);
        }
        mo25249u.mo25282C();
        androidComposeView.setConfigurationChangeObserver((InterfaceC6108l) mo25262h2);
        mo25249u.mo25263g(-3687241);
        Object mo25262h3 = mo25249u.mo25262h();
        if (mo25262h3 == c5180a.m25243a()) {
            Intrinsics.checkIfNull(context, "context");
            mo25262h3 = new C0713f0(context);
            mo25249u.mo25247w(mo25262h3);
        }
        mo25249u.mo25282C();
        C0713f0 c0713f0 = (C0713f0) mo25262h3;
        AndroidComposeView.C0664b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            mo25249u.mo25263g(-3687241);
            Object mo25262h4 = mo25249u.mo25262h();
            if (mo25262h4 == c5180a.m25243a()) {
                mo25262h4 = C0768q0.m39637b(androidComposeView, viewTreeOwners.m39872b());
                mo25249u.mo25247w(mo25262h4);
            }
            mo25249u.mo25282C();
            C0759o0 c0759o0 = (C0759o0) mo25262h4;
            Effects.m25541a(C13195u.f34156a, new C0832h(c0759o0), mo25249u, 0);
            Intrinsics.checkIfNull(context, "context");
            C7094b m39467k = m39467k(context, m39476b(interfaceC5220m0), mo25249u, 72);
            AbstractC5250t0 abstractC5250t0 = f2443a;
            Configuration m39476b = m39476b(interfaceC5220m0);
            Intrinsics.checkIfNull(m39476b, "configuration");
            CompositionLocal.m24954a(new C5255u0[]{abstractC5250t0.m24909c(m39476b), f2444b.m24909c(context), f2446d.m24909c(viewTreeOwners.m39873a()), f2447e.m24909c(viewTreeOwners.m39872b()), C7573h.m18115b().m24909c(c0759o0), f2448f.m24909c(androidComposeView.getView()), f2445c.m24909c(m39467k)}, ComposableLambda.m19327b(mo25249u, -819890514, true, new C0834i(androidComposeView, c0713f0, interfaceC6112p, i)), mo25249u, 56);
            InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
            if (mo25274K == null) {
                return;
            }
            mo25274K.mo25532a(new C0835j(androidComposeView, interfaceC6112p, i));
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    /* renamed from: b */
    private static final Configuration m39476b(InterfaceC5220m0 interfaceC5220m0) {
        return (Configuration) interfaceC5220m0.getValue();
    }

    /* renamed from: c */
    private static final void m39475c(InterfaceC5220m0 interfaceC5220m0, Configuration configuration) {
        interfaceC5220m0.setValue(configuration);
    }

    /* renamed from: d */
    public static final /* synthetic */ void m39474d(InterfaceC5220m0 interfaceC5220m0, Configuration configuration) {
        m39475c(interfaceC5220m0, configuration);
    }

    /* renamed from: e */
    public static final /* synthetic */ Void m39473e(String str) {
        return m39468j(str);
    }

    /* renamed from: f */
    public static final AbstractC5250t0 m39472f() {
        return f2443a;
    }

    /* renamed from: g */
    public static final AbstractC5250t0 m39471g() {
        return f2444b;
    }

    /* renamed from: h */
    public static final AbstractC5250t0 m39470h() {
        return f2445c;
    }

    /* renamed from: i */
    public static final AbstractC5250t0 m39469i() {
        return f2448f;
    }

    /* renamed from: j */
    private static final Void m39468j(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    private static final C7094b m39467k(Context context, Configuration configuration, InterfaceC5179i interfaceC5179i, int i) {
        T t;
        interfaceC5179i.mo25263g(2099958348);
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
        if (mo25262h == c5180a.m25243a()) {
            mo25262h = new C7094b();
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        C7094b c7094b = (C7094b) mo25262h;
        C6449y c6449y = new C6449y();
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h2 = interfaceC5179i.mo25262h();
        if (mo25262h2 == c5180a.m25243a()) {
            interfaceC5179i.mo25247w(configuration);
            t = configuration;
        } else {
            t = mo25262h2;
        }
        interfaceC5179i.mo25282C();
        c6449y.f17533w = t;
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h3 = interfaceC5179i.mo25262h();
        if (mo25262h3 == c5180a.m25243a()) {
            mo25262h3 = new ComponentCallbacks2C0838l(c6449y, c7094b);
            interfaceC5179i.mo25247w(mo25262h3);
        }
        interfaceC5179i.mo25282C();
        Effects.m25541a(c7094b, new C0836k(context, (ComponentCallbacks2C0838l) mo25262h3), interfaceC5179i, 8);
        interfaceC5179i.mo25282C();
        return c7094b;
    }
}
