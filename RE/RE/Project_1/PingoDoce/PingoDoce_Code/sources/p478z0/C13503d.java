package p478z0;

import id.InterfaceC6097a;
import java.util.List;
import kotlin.EnumC6754a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p393v0.AbstractC11057s;
import p393v0.C11038m;
import p393v0.C11042n;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11063t0;
import p433x0.C12246j;
import p433x0.DrawScope;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* compiled from: Vector.kt */
/* renamed from: z0.d */
/* loaded from: classes.dex */
public final class C13503d extends AbstractC13528i {

    /* renamed from: b */
    private AbstractC11057s f34358b;

    /* renamed from: c */
    private float f34359c;

    /* renamed from: d */
    private List f34360d;

    /* renamed from: e */
    private float f34361e;

    /* renamed from: f */
    private float f34362f;

    /* renamed from: g */
    private AbstractC11057s f34363g;

    /* renamed from: h */
    private int f34364h;

    /* renamed from: i */
    private int f34365i;

    /* renamed from: j */
    private float f34366j;

    /* renamed from: k */
    private float f34367k;

    /* renamed from: l */
    private float f34368l;

    /* renamed from: m */
    private float f34369m;

    /* renamed from: n */
    private boolean f34370n;

    /* renamed from: o */
    private boolean f34371o;

    /* renamed from: p */
    private boolean f34372p;

    /* renamed from: q */
    private C12246j f34373q;

    /* renamed from: r */
    private final InterfaceC11052q0 f34374r;

    /* renamed from: s */
    private final InterfaceC11052q0 f34375s;

    /* renamed from: t */
    private final InterfaceC13178g f34376t;

    /* renamed from: u */
    private final PathParser f34377u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vector.kt */
    /* renamed from: z0.d$a */
    /* loaded from: classes.dex */
    public static final class C13504a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C13504a f34378w = new C13504a();

        C13504a() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC11063t0 mo42214q() {
            return C11038m.m6426a();
        }
    }

    public C13503d() {
        super(null);
        InterfaceC13178g m1463b;
        this.f34359c = 1.0f;
        this.f34360d = C13565o.m977e();
        C13565o.m980b();
        this.f34361e = 1.0f;
        this.f34364h = C13565o.m979c();
        this.f34365i = C13565o.m978d();
        this.f34366j = 4.0f;
        this.f34368l = 1.0f;
        this.f34370n = true;
        this.f34371o = true;
        this.f34372p = true;
        this.f34374r = C11042n.m6421a();
        this.f34375s = C11042n.m6421a();
        m1463b = LazyJVM.m1463b(EnumC6754a.NONE, C13504a.f34378w);
        this.f34376t = m1463b;
        this.f34377u = new PathParser();
    }

    /* renamed from: A */
    private final void m1209A() {
        this.f34375s.mo6316a();
        if (this.f34367k == 0.0f) {
            if (this.f34368l == 1.0f) {
                InterfaceC11052q0.C11053a.m6301a(this.f34375s, this.f34374r, 0L, 2, null);
                return;
            }
        }
        m1207f().mo6277c(this.f34374r, false);
        float mo6278b = m1207f().mo6278b();
        float f = this.f34367k;
        float f2 = this.f34369m;
        float f3 = ((f + f2) % 1.0f) * mo6278b;
        float f4 = ((this.f34368l + f2) % 1.0f) * mo6278b;
        if (f3 > f4) {
            m1207f().mo6279a(f3, mo6278b, this.f34375s, true);
            m1207f().mo6279a(0.0f, f4, this.f34375s, true);
            return;
        }
        m1207f().mo6279a(f3, f4, this.f34375s, true);
    }

    /* renamed from: f */
    private final InterfaceC11063t0 m1207f() {
        return (InterfaceC11063t0) this.f34376t.getValue();
    }

    /* renamed from: z */
    private final void m1187z() {
        this.f34377u.m1114e();
        this.f34374r.mo6316a();
        this.f34377u.m1117b(this.f34360d).m1121D(this.f34374r);
        m1209A();
    }

    /* renamed from: a */
    public void mo1077a(DrawScope drawScope) {
        Intrinsics.isThisObjectNull(drawScope, "<this>");
        if (this.f34370n) {
            m1187z();
        } else if (this.f34372p) {
            m1209A();
        }
        this.f34370n = false;
        this.f34372p = false;
        AbstractC11057s abstractC11057s = this.f34358b;
        if (abstractC11057s != null) {
            DrawScope.C12241b.m3257c(drawScope, this.f34375s, abstractC11057s, m1208e(), null, null, 0, 56, null);
        }
        AbstractC11057s abstractC11057s2 = this.f34363g;
        if (abstractC11057s2 == null) {
            return;
        }
        C12246j c12246j = this.f34373q;
        if (this.f34371o || c12246j == null) {
            c12246j = new C12246j(m1202k(), m1203j(), m1205h(), m1204i(), null, 16, null);
            this.f34373q = c12246j;
            this.f34371o = false;
        }
        DrawScope.C12241b.m3257c(drawScope, this.f34375s, abstractC11057s2, m1206g(), c12246j, null, 0, 48, null);
    }

    /* renamed from: e */
    public final float m1208e() {
        return this.f34359c;
    }

    /* renamed from: g */
    public final float m1206g() {
        return this.f34361e;
    }

    /* renamed from: h */
    public final int m1205h() {
        return this.f34364h;
    }

    /* renamed from: i */
    public final int m1204i() {
        return this.f34365i;
    }

    /* renamed from: j */
    public final float m1203j() {
        return this.f34366j;
    }

    /* renamed from: k */
    public final float m1202k() {
        return this.f34362f;
    }

    /* renamed from: l */
    public final void m1201l(AbstractC11057s abstractC11057s) {
        this.f34358b = abstractC11057s;
        m1075c();
    }

    /* renamed from: m */
    public final void m1200m(float f) {
        this.f34359c = f;
        m1075c();
    }

    /* renamed from: n */
    public final void m1199n(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        m1075c();
    }

    /* renamed from: o */
    public final void m1198o(List list) {
        Intrinsics.isThisObjectNull(list, "value");
        this.f34360d = list;
        this.f34370n = true;
        m1075c();
    }

    /* renamed from: p */
    public final void m1197p(int i) {
        this.f34375s.mo6303n(i);
        m1075c();
    }

    /* renamed from: q */
    public final void m1196q(AbstractC11057s abstractC11057s) {
        this.f34363g = abstractC11057s;
        m1075c();
    }

    /* renamed from: r */
    public final void m1195r(float f) {
        this.f34361e = f;
        m1075c();
    }

    /* renamed from: s */
    public final void m1194s(int i) {
        this.f34364h = i;
        this.f34371o = true;
        m1075c();
    }

    /* renamed from: t */
    public final void m1193t(int i) {
        this.f34365i = i;
        this.f34371o = true;
        m1075c();
    }

    public String toString() {
        return this.f34374r.toString();
    }

    /* renamed from: u */
    public final void m1192u(float f) {
        this.f34366j = f;
        this.f34371o = true;
        m1075c();
    }

    /* renamed from: v */
    public final void m1191v(float f) {
        this.f34362f = f;
        m1075c();
    }

    /* renamed from: w */
    public final void m1190w(float f) {
        if (this.f34368l == f) {
            return;
        }
        this.f34368l = f;
        this.f34372p = true;
        m1075c();
    }

    /* renamed from: x */
    public final void m1189x(float f) {
        if (this.f34369m == f) {
            return;
        }
        this.f34369m = f;
        this.f34372p = true;
        m1075c();
    }

    /* renamed from: y */
    public final void m1188y(float f) {
        if (this.f34367k == f) {
            return;
        }
        this.f34367k = f;
        this.f34372p = true;
        m1075c();
    }
}
