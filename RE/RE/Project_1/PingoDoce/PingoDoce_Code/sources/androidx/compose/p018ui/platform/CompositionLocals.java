package androidx.compose.p018ui.platform;

import id.InterfaceC6097a;
import id.InterfaceC6112p;
import kotlin.ExceptionsH;
import p023b1.InterfaceC1792a;
import p037c1.InterfaceC1987b;
import p092f0.AbstractC5250t0;
import p092f0.C5255u0;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p093f1.InterfaceC5315r;
import p169j1.InterfaceC6253f0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p324r0.AutofillTree;
import p324r0.InterfaceC9784d;
import p358t0.InterfaceC10331g;
import p359t1.InterfaceC10362d;
import p374u1.TextInputService;
import p468yc.C13195u;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: androidx.compose.ui.platform.m0 */
/* loaded from: classes.dex */
public final class CompositionLocals {

    /* renamed from: a */
    private static final AbstractC5250t0 f2283a = CompositionLocal.m24951d(C0738a.f2299w);

    /* renamed from: b */
    private static final AbstractC5250t0 f2284b = CompositionLocal.m24951d(C0739b.f2300w);

    /* renamed from: c */
    private static final AbstractC5250t0 f2285c = CompositionLocal.m24951d(C0740c.f2301w);

    /* renamed from: d */
    private static final AbstractC5250t0 f2286d = CompositionLocal.m24951d(C0741d.f2302w);

    /* renamed from: e */
    private static final AbstractC5250t0 f2287e = CompositionLocal.m24951d(C0742e.f2303w);

    /* renamed from: f */
    private static final AbstractC5250t0 f2288f = CompositionLocal.m24951d(C0743f.f2304w);

    /* renamed from: g */
    private static final AbstractC5250t0 f2289g = CompositionLocal.m24951d(C0744g.f2305w);

    /* renamed from: h */
    private static final AbstractC5250t0 f2290h = CompositionLocal.m24951d(C0745h.f2306w);

    /* renamed from: i */
    private static final AbstractC5250t0 f2291i = CompositionLocal.m24951d(C0746i.f2307w);

    /* renamed from: j */
    private static final AbstractC5250t0 f2292j = CompositionLocal.m24951d(C0747j.f2308w);

    /* renamed from: k */
    private static final AbstractC5250t0 f2293k = CompositionLocal.m24951d(C0749l.f2310w);

    /* renamed from: l */
    private static final AbstractC5250t0 f2294l = CompositionLocal.m24951d(C0750m.f2311w);

    /* renamed from: m */
    private static final AbstractC5250t0 f2295m = CompositionLocal.m24951d(C0751n.f2312w);

    /* renamed from: n */
    private static final AbstractC5250t0 f2296n = CompositionLocal.m24951d(C0752o.f2313w);

    /* renamed from: o */
    private static final AbstractC5250t0 f2297o = CompositionLocal.m24951d(C0753p.f2314w);

    /* renamed from: p */
    private static final AbstractC5250t0 f2298p = CompositionLocal.m24951d(C0748k.f2309w);

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$a */
    /* loaded from: classes.dex */
    static final class C0738a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0738a f2299w = new C0738a();

        C0738a() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC0724i mo42214q() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$b */
    /* loaded from: classes.dex */
    static final class C0739b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0739b f2300w = new C0739b();

        C0739b() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC9784d mo42214q() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$c */
    /* loaded from: classes.dex */
    static final class C0740c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0740c f2301w = new C0740c();

        C0740c() {
            super(0);
        }

        /* renamed from: a */
        public final AutofillTree mo42214q() {
            CompositionLocals.m39710b("LocalAutofillTree");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$d */
    /* loaded from: classes.dex */
    static final class C0741d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0741d f2302w = new C0741d();

        C0741d() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC0726j0 mo42214q() {
            CompositionLocals.m39710b("LocalClipboardManager");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$e */
    /* loaded from: classes.dex */
    static final class C0742e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0742e f2303w = new C0742e();

        C0742e() {
            super(0);
        }

        /* renamed from: a */
        public final Density mo42214q() {
            CompositionLocals.m39710b("LocalDensity");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$f */
    /* loaded from: classes.dex */
    static final class C0743f extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0743f f2304w = new C0743f();

        C0743f() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC10331g mo42214q() {
            CompositionLocals.m39710b("LocalFocusManager");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$g */
    /* loaded from: classes.dex */
    static final class C0744g extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0744g f2305w = new C0744g();

        C0744g() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC10362d.InterfaceC10363a mo42214q() {
            CompositionLocals.m39710b("LocalFontLoader");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$h */
    /* loaded from: classes.dex */
    static final class C0745h extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0745h f2306w = new C0745h();

        C0745h() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC1792a mo42214q() {
            CompositionLocals.m39710b("LocalHapticFeedback");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$i */
    /* loaded from: classes.dex */
    static final class C0746i extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0746i f2307w = new C0746i();

        C0746i() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC1987b mo42214q() {
            CompositionLocals.m39710b("LocalInputManager");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$j */
    /* loaded from: classes.dex */
    static final class C0747j extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0747j f2308w = new C0747j();

        C0747j() {
            super(0);
        }

        /* renamed from: a */
        public final EnumC13618o mo42214q() {
            CompositionLocals.m39710b("LocalLayoutDirection");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$k */
    /* loaded from: classes.dex */
    static final class C0748k extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0748k f2309w = new C0748k();

        C0748k() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC5315r mo42214q() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$l */
    /* loaded from: classes.dex */
    static final class C0749l extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0749l f2310w = new C0749l();

        C0749l() {
            super(0);
        }

        /* renamed from: a */
        public final TextInputService mo42214q() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$m */
    /* loaded from: classes.dex */
    static final class C0750m extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0750m f2311w = new C0750m();

        C0750m() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC0727j1 mo42214q() {
            CompositionLocals.m39710b("LocalTextToolbar");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$n */
    /* loaded from: classes.dex */
    static final class C0751n extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0751n f2312w = new C0751n();

        C0751n() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC0736l1 mo42214q() {
            CompositionLocals.m39710b("LocalUriHandler");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$o */
    /* loaded from: classes.dex */
    static final class C0752o extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0752o f2313w = new C0752o();

        C0752o() {
            super(0);
        }

        /* renamed from: a */
        public final ViewConfiguration mo42214q() {
            CompositionLocals.m39710b("LocalViewConfiguration");
            throw new ExceptionsH();
        }
    }

    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$p */
    /* loaded from: classes.dex */
    static final class C0753p extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C0753p f2314w = new C0753p();

        C0753p() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC0814v1 mo42214q() {
            CompositionLocals.m39710b("LocalWindowInfo");
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompositionLocals.kt */
    /* renamed from: androidx.compose.ui.platform.m0$q */
    /* loaded from: classes.dex */
    public static final class C0754q extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6253f0 f2315w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC0736l1 f2316x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6112p f2317y;

        /* renamed from: z */
        final /* synthetic */ int f2318z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0754q(InterfaceC6253f0 interfaceC6253f0, InterfaceC0736l1 interfaceC0736l1, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f2315w = interfaceC6253f0;
            this.f2316x = interfaceC0736l1;
            this.f2317y = interfaceC6112p;
            this.f2318z = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m39685a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m39685a(InterfaceC5179i interfaceC5179i, int i) {
            CompositionLocals.m39711a(this.f2315w, this.f2316x, this.f2317y, interfaceC5179i, this.f2318z | 1);
        }
    }

    /* renamed from: a */
    public static final void m39711a(InterfaceC6253f0 interfaceC6253f0, InterfaceC0736l1 interfaceC0736l1, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        Intrinsics.isThisObjectNull(interfaceC6253f0, "owner");
        Intrinsics.isThisObjectNull(interfaceC0736l1, "uriHandler");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(1527607293);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC6253f0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC0736l1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC6112p) ? 256 : 128;
        }
        if (((i2 & 731) ^ 146) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            CompositionLocal.m24954a(new C5255u0[]{f2283a.m24909c(interfaceC6253f0.getAccessibilityManager()), f2284b.m24909c(interfaceC6253f0.getAutofill()), f2285c.m24909c(interfaceC6253f0.getAutofillTree()), f2286d.m24909c(interfaceC6253f0.getClipboardManager()), f2287e.m24909c(interfaceC6253f0.getDensity()), f2288f.m24909c(interfaceC6253f0.getFocusManager()), f2289g.m24909c(interfaceC6253f0.getFontLoader()), f2290h.m24909c(interfaceC6253f0.getHapticFeedBack()), f2291i.m24909c(interfaceC6253f0.getInputModeManager()), f2292j.m24909c(interfaceC6253f0.getLayoutDirection()), f2293k.m24909c(interfaceC6253f0.getTextInputService()), f2294l.m24909c(interfaceC6253f0.getTextToolbar()), f2295m.m24909c(interfaceC0736l1), f2296n.m24909c(interfaceC6253f0.getViewConfiguration()), f2297o.m24909c(interfaceC6253f0.getWindowInfo()), f2298p.m24909c(interfaceC6253f0.getPointerIconService())}, interfaceC6112p, mo25249u, ((i2 >> 3) & 112) | 8);
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C0754q(interfaceC6253f0, interfaceC0736l1, interfaceC6112p, i));
    }

    /* renamed from: b */
    public static final /* synthetic */ Void m39710b(String str) {
        return m39702j(str);
    }

    /* renamed from: c */
    public static final AbstractC5250t0 m39709c() {
        return f2283a;
    }

    /* renamed from: d */
    public static final AbstractC5250t0 m39708d() {
        return f2287e;
    }

    /* renamed from: e */
    public static final AbstractC5250t0 m39707e() {
        return f2289g;
    }

    /* renamed from: f */
    public static final AbstractC5250t0 m39706f() {
        return f2291i;
    }

    /* renamed from: g */
    public static final AbstractC5250t0 m39705g() {
        return f2292j;
    }

    /* renamed from: h */
    public static final AbstractC5250t0 m39704h() {
        return f2298p;
    }

    /* renamed from: i */
    public static final AbstractC5250t0 m39703i() {
        return f2296n;
    }

    /* renamed from: j */
    private static final Void m39702j(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
