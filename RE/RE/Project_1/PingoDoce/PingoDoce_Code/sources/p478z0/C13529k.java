package p478z0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10781l;
import p393v0.ColorFilter;
import p433x0.DrawScope;
import p468yc.C13195u;
import p479z1.C13617n;

/* compiled from: Vector.kt */
/* renamed from: z0.k */
/* loaded from: classes.dex */
public final class C13529k extends AbstractC13528i {

    /* renamed from: b */
    private final Vector f34450b;

    /* renamed from: c */
    private boolean f34451c;

    /* renamed from: d */
    private final DrawCache f34452d;

    /* renamed from: e */
    private InterfaceC6097a f34453e;

    /* renamed from: f */
    private ColorFilter f34454f;

    /* renamed from: g */
    private float f34455g;

    /* renamed from: h */
    private float f34456h;

    /* renamed from: i */
    private long f34457i;

    /* renamed from: j */
    private final InterfaceC6108l f34458j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vector.kt */
    /* renamed from: z0.k$a */
    /* loaded from: classes.dex */
    public static final class C13530a extends AbstractC6438m implements InterfaceC6108l {
        C13530a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1051a(DrawScope drawScope) {
            Intrinsics.isThisObjectNull(drawScope, "$this$null");
            C13529k.this.m1059j().mo1077a(drawScope);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1051a((DrawScope) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vector.kt */
    /* renamed from: z0.k$b */
    /* loaded from: classes.dex */
    public static final class C13531b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C13531b f34460w = new C13531b();

        C13531b() {
            super(0);
        }

        /* renamed from: a */
        public final void m1050a() {
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m1050a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vector.kt */
    /* renamed from: z0.k$c */
    /* loaded from: classes.dex */
    public static final class C13532c extends AbstractC6438m implements InterfaceC6097a {
        C13532c() {
            super(0);
        }

        /* renamed from: a */
        public final void m1049a() {
            C13529k.m1064e(C13529k.this);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m1049a();
            return C13195u.f34156a;
        }
    }

    public C13529k() {
        super(null);
        Vector vector = new Vector();
        vector.m1244m(0.0f);
        vector.m1243n(0.0f);
        vector.mo1074d(new C13532c());
        this.f34450b = vector;
        this.f34451c = true;
        this.f34452d = new DrawCache();
        this.f34453e = C13531b.f34460w;
        this.f34457i = C10781l.f27885b.m7087a();
        this.f34458j = new C13530a();
    }

    /* renamed from: e */
    public static final /* synthetic */ void m1064e(C13529k c13529k) {
        c13529k.m1063f();
    }

    /* renamed from: f */
    private final void m1063f() {
        this.f34451c = true;
        this.f34453e.mo42214q();
    }

    /* renamed from: a */
    public void mo1077a(DrawScope drawScope) {
        Intrinsics.isThisObjectNull(drawScope, "<this>");
        m1062g(drawScope, 1.0f, null);
    }

    /* renamed from: g */
    public final void m1062g(DrawScope drawScope, float f, ColorFilter colorFilter) {
        Intrinsics.isThisObjectNull(drawScope, "<this>");
        if (colorFilter == null) {
            colorFilter = this.f34454f;
        }
        if (this.f34451c || !C10781l.m7094f(this.f34457i, drawScope.m3263a())) {
            this.f34450b.m1241p(C10781l.m7091i(drawScope.m3263a()) / this.f34455g);
            this.f34450b.m1240q(C10781l.m7093g(drawScope.m3263a()) / this.f34456h);
            this.f34452d.m1254b(C13617n.m819a((int) Math.ceil(C10781l.m7091i(drawScope.m3263a())), (int) Math.ceil(C10781l.m7093g(drawScope.m3263a()))), drawScope, drawScope.getLayoutDirection(), this.f34458j);
            this.f34451c = false;
            this.f34457i = drawScope.m3263a();
        }
        this.f34452d.m1253c(drawScope, f, colorFilter);
    }

    /* renamed from: h */
    public final ColorFilter m1061h() {
        return this.f34454f;
    }

    /* renamed from: i */
    public final String m1060i() {
        return this.f34450b.m1252e();
    }

    /* renamed from: j */
    public final Vector m1059j() {
        return this.f34450b;
    }

    /* renamed from: k */
    public final float m1058k() {
        return this.f34456h;
    }

    /* renamed from: l */
    public final float m1057l() {
        return this.f34455g;
    }

    /* renamed from: m */
    public final void m1056m(ColorFilter colorFilter) {
        this.f34454f = colorFilter;
    }

    /* renamed from: n */
    public final void m1055n(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "<set-?>");
        this.f34453e = interfaceC6097a;
    }

    /* renamed from: o */
    public final void m1054o(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        this.f34450b.m1245l(str);
    }

    /* renamed from: p */
    public final void m1053p(float f) {
        if (this.f34456h == f) {
            return;
        }
        this.f34456h = f;
        m1063f();
    }

    /* renamed from: q */
    public final void m1052q(float f) {
        if (this.f34455g == f) {
            return;
        }
        this.f34455g = f;
        m1063f();
    }

    public String toString() {
        String str = "Params: \tname: " + m1060i() + "\n\tviewportWidth: " + m1057l() + "\n\tviewportHeight: " + m1058k() + "\n";
        Intrinsics.checkIfNull(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
