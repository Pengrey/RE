package p393v0;

import p181jd.Intrinsics;
import p393v0.GraphicsLayerScope;
import p479z1.C13604f;
import p479z1.Density;

/* compiled from: GraphicsLayerScope.kt */
/* renamed from: v0.y0 */
/* loaded from: classes.dex */
public final class C11075y0 implements GraphicsLayerScope {

    /* renamed from: A */
    private float f28455A;

    /* renamed from: B */
    private float f28456B;

    /* renamed from: C */
    private float f28457C;

    /* renamed from: D */
    private float f28458D;

    /* renamed from: E */
    private float f28459E;

    /* renamed from: I */
    private boolean f28463I;

    /* renamed from: K */
    private AbstractC11073x0 f28465K;

    /* renamed from: z */
    private float f28469z;

    /* renamed from: w */
    private float f28466w = 1.0f;

    /* renamed from: x */
    private float f28467x = 1.0f;

    /* renamed from: y */
    private float f28468y = 1.0f;

    /* renamed from: F */
    private float f28460F = 8.0f;

    /* renamed from: G */
    private long f28461G = C11022g1.f28371b.m6480a();

    /* renamed from: H */
    private InterfaceC11001b1 f28462H = RectangleShape.m6240a();

    /* renamed from: J */
    private Density f28464J = C13604f.m881b(1.0f, 0.0f, 2, null);

    /* renamed from: A */
    public float m6235A(float f) {
        return GraphicsLayerScope.C11021a.m6492d(this, f);
    }

    /* renamed from: C */
    public float m6234C() {
        return this.f28456B;
    }

    /* renamed from: F */
    public InterfaceC11001b1 m6233F() {
        return this.f28462H;
    }

    /* renamed from: I */
    public long m6232I() {
        return this.f28461G;
    }

    /* renamed from: K */
    public float m6231K() {
        return this.f28469z;
    }

    /* renamed from: L */
    public void m6230L(boolean z) {
        this.f28463I = z;
    }

    /* renamed from: O */
    public int m6229O(float f) {
        return GraphicsLayerScope.C11021a.m6495a(this, f);
    }

    /* renamed from: P */
    public void m6228P(long j) {
        this.f28461G = j;
    }

    /* renamed from: S */
    public float m6227S() {
        return this.f28455A;
    }

    /* renamed from: U */
    public long m6226U(long j) {
        return GraphicsLayerScope.C11021a.m6491e(this, j);
    }

    /* renamed from: V */
    public final void m6225V() {
        m6218g(1.0f);
        m6214j(1.0f);
        m6222c(1.0f);
        m6216i(0.0f);
        m6219f(0.0f);
        m6203v(0.0f);
        m6211m(0.0f);
        m6221d(0.0f);
        m6220e(0.0f);
        m6212l(8.0f);
        m6228P(C11022g1.f28371b.m6480a());
        m6200z(RectangleShape.m6240a());
        m6230L(false);
        m6217h(null);
    }

    /* renamed from: Y */
    public float m6224Y(long j) {
        return GraphicsLayerScope.C11021a.m6493c(this, j);
    }

    /* renamed from: a0 */
    public final void m6223a0(Density density) {
        Intrinsics.isThisObjectNull(density, "<set-?>");
        this.f28464J = density;
    }

    /* renamed from: c */
    public void m6222c(float f) {
        this.f28468y = f;
    }

    /* renamed from: d */
    public void m6221d(float f) {
        this.f28458D = f;
    }

    /* renamed from: e */
    public void m6220e(float f) {
        this.f28459E = f;
    }

    /* renamed from: f */
    public void m6219f(float f) {
        this.f28455A = f;
    }

    /* renamed from: g */
    public void m6218g(float f) {
        this.f28466w = f;
    }

    public float getDensity() {
        return this.f28464J.getDensity();
    }

    /* renamed from: h */
    public void m6217h(AbstractC11073x0 abstractC11073x0) {
    }

    /* renamed from: i */
    public void m6216i(float f) {
        this.f28469z = f;
    }

    /* renamed from: i0 */
    public float m6215i0(int i) {
        return GraphicsLayerScope.C11021a.m6494b(this, i);
    }

    /* renamed from: j */
    public void m6214j(float f) {
        this.f28467x = f;
    }

    /* renamed from: k */
    public float m6213k() {
        return this.f28468y;
    }

    /* renamed from: l */
    public void m6212l(float f) {
        this.f28460F = f;
    }

    /* renamed from: m */
    public void m6211m(float f) {
        this.f28457C = f;
    }

    /* renamed from: n */
    public float m6210n() {
        return this.f28460F;
    }

    /* renamed from: o */
    public boolean m6209o() {
        return this.f28463I;
    }

    /* renamed from: p */
    public AbstractC11073x0 m6208p() {
        return this.f28465K;
    }

    /* renamed from: q */
    public float m6207q() {
        return this.f28457C;
    }

    /* renamed from: r */
    public float m6206r() {
        return this.f28464J.m894r();
    }

    /* renamed from: t */
    public float m6205t() {
        return this.f28458D;
    }

    /* renamed from: u */
    public float m6204u() {
        return this.f28459E;
    }

    /* renamed from: v */
    public void m6203v(float f) {
        this.f28456B = f;
    }

    /* renamed from: x */
    public float m6202x() {
        return this.f28466w;
    }

    /* renamed from: y */
    public float m6201y() {
        return this.f28467x;
    }

    /* renamed from: z */
    public void m6200z(InterfaceC11001b1 interfaceC11001b1) {
        Intrinsics.isThisObjectNull(interfaceC11001b1, "<set-?>");
        this.f28462H = interfaceC11001b1;
    }
}
