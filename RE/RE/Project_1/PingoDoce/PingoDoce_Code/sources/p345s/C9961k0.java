package p345s;

/* renamed from: s.k0 */
/* loaded from: classes.dex */
public final class C9961k0 {

    /* renamed from: a */
    private float f26089a;

    /* renamed from: c */
    private boolean f26091c;

    /* renamed from: d */
    private double f26092d;

    /* renamed from: e */
    private double f26093e;

    /* renamed from: f */
    private double f26094f;

    /* renamed from: b */
    private double f26090b = Math.sqrt(50.0d);

    /* renamed from: g */
    private float f26095g = 1.0f;

    public C9961k0(float f) {
        this.f26089a = f;
    }

    /* renamed from: c */
    private final void m9524c() {
        if (this.f26091c) {
            return;
        }
        if (!(this.f26089a == C9963l0.m9516b())) {
            float f = this.f26095g;
            double d = f * f;
            if (f > 1.0f) {
                double d2 = this.f26090b;
                double d3 = d - 1;
                this.f26092d = ((-f) * d2) + (d2 * Math.sqrt(d3));
                double d4 = this.f26090b;
                this.f26093e = ((-this.f26095g) * d4) - (d4 * Math.sqrt(d3));
            } else if (f >= 0.0f && f < 1.0f) {
                this.f26094f = this.f26090b * Math.sqrt(1 - d);
            }
            this.f26091c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* renamed from: a */
    public final float m9526a() {
        return this.f26095g;
    }

    /* renamed from: b */
    public final float m9525b() {
        double d = this.f26090b;
        return (float) (d * d);
    }

    /* renamed from: d */
    public final void m9523d(float f) {
        if (f >= 0.0f) {
            this.f26095g = f;
            this.f26091c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public final void m9522e(float f) {
        this.f26089a = f;
    }

    /* renamed from: f */
    public final void m9521f(float f) {
        if (m9525b() > 0.0f) {
            this.f26090b = Math.sqrt(f);
            this.f26091c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: g */
    public final long m9520g(float f, float f2, long j) {
        float f3;
        double cos;
        double d;
        m9524c();
        float f4 = f - this.f26089a;
        double d2 = j / 1000.0d;
        float f5 = this.f26095g;
        if (f5 > 1.0f) {
            double d3 = f4;
            double d4 = this.f26093e;
            double d5 = f2;
            double d6 = this.f26092d;
            double d7 = d3 - (((d4 * d3) - d5) / (d4 - d6));
            double d8 = ((d3 * d4) - d5) / (d4 - d6);
            d = (Math.exp(d4 * d2) * d7) + (Math.exp(this.f26092d * d2) * d8);
            double d9 = this.f26093e;
            double exp = d7 * d9 * Math.exp(d9 * d2);
            double d10 = this.f26092d;
            cos = exp + (d8 * d10 * Math.exp(d10 * d2));
        } else {
            if (f5 == 1.0f) {
                double d11 = this.f26090b;
                double d12 = f4;
                double d13 = f2 + (d11 * d12);
                double d14 = d12 + (d13 * d2);
                double exp2 = Math.exp((-d11) * d2) * d14;
                double exp3 = d14 * Math.exp((-this.f26090b) * d2);
                double d15 = this.f26090b;
                cos = (exp3 * (-d15)) + (d13 * Math.exp((-d15) * d2));
                d = exp2;
            } else {
                double d16 = this.f26090b;
                double d17 = f4;
                double d18 = (1 / this.f26094f) * ((f5 * d16 * d17) + f2);
                double exp4 = Math.exp((-f5) * d16 * d2) * ((Math.cos(this.f26094f * d2) * d17) + (Math.sin(this.f26094f * d2) * d18));
                double d19 = this.f26090b;
                double d20 = (-d19) * exp4 * this.f26095g;
                double exp5 = Math.exp((-f3) * d19 * d2);
                double d21 = this.f26094f;
                double sin = (-d21) * d17 * Math.sin(d21 * d2);
                double d22 = this.f26094f;
                cos = d20 + (exp5 * (sin + (d18 * d22 * Math.cos(d22 * d2))));
                d = exp4;
            }
        }
        return C9963l0.m9517a((float) (d + this.f26089a), (float) cos);
    }
}
