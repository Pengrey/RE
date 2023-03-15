package p373u0;

/* renamed from: u0.d */
/* loaded from: classes.dex */
public final class C10773d {

    /* renamed from: a */
    private float f27862a;

    /* renamed from: b */
    private float f27863b;

    /* renamed from: c */
    private float f27864c;

    /* renamed from: d */
    private float f27865d;

    public C10773d(float f, float f2, float f3, float f4) {
        this.f27862a = f;
        this.f27863b = f2;
        this.f27864c = f3;
        this.f27865d = f4;
    }

    /* renamed from: a */
    public final float m7167a() {
        return this.f27865d;
    }

    /* renamed from: b */
    public final float m7166b() {
        return this.f27862a;
    }

    /* renamed from: c */
    public final float m7165c() {
        return this.f27864c;
    }

    /* renamed from: d */
    public final float m7164d() {
        return this.f27863b;
    }

    /* renamed from: e */
    public final void m7163e(float f, float f2, float f3, float f4) {
        this.f27862a = Math.max(f, this.f27862a);
        this.f27863b = Math.max(f2, this.f27863b);
        this.f27864c = Math.min(f3, this.f27864c);
        this.f27865d = Math.min(f4, this.f27865d);
    }

    /* renamed from: f */
    public final boolean m7162f() {
        return this.f27862a >= this.f27864c || this.f27863b >= this.f27865d;
    }

    /* renamed from: g */
    public final void m7161g(float f, float f2, float f3, float f4) {
        this.f27862a = f;
        this.f27863b = f2;
        this.f27864c = f3;
        this.f27865d = f4;
    }

    /* renamed from: h */
    public final void m7160h(float f) {
        this.f27865d = f;
    }

    /* renamed from: i */
    public final void m7159i(float f) {
        this.f27862a = f;
    }

    /* renamed from: j */
    public final void m7158j(float f) {
        this.f27864c = f;
    }

    /* renamed from: k */
    public final void m7157k(float f) {
        this.f27863b = f;
    }

    public String toString() {
        return "MutableRect(" + C10772c.m7168a(this.f27862a, 1) + ", " + C10772c.m7168a(this.f27863b, 1) + ", " + C10772c.m7168a(this.f27864c, 1) + ", " + C10772c.m7168a(this.f27865d, 1) + ')';
    }
}
