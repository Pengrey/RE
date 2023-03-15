package p304q2;

import p304q2.AbstractC9601b;

/* renamed from: q2.e */
/* loaded from: classes.dex */
public final class C9622e {

    /* renamed from: a */
    double f25290a;

    /* renamed from: b */
    double f25291b;

    /* renamed from: c */
    private boolean f25292c;

    /* renamed from: d */
    private double f25293d;

    /* renamed from: e */
    private double f25294e;

    /* renamed from: f */
    private double f25295f;

    /* renamed from: g */
    private double f25296g;

    /* renamed from: h */
    private double f25297h;

    /* renamed from: i */
    private double f25298i;

    /* renamed from: j */
    private final AbstractC9601b.C9616o f25299j;

    public C9622e() {
        this.f25290a = Math.sqrt(1500.0d);
        this.f25291b = 0.5d;
        this.f25292c = false;
        this.f25298i = Double.MAX_VALUE;
        this.f25299j = new AbstractC9601b.C9616o();
    }

    /* renamed from: b */
    private void m10440b() {
        if (this.f25292c) {
            return;
        }
        if (this.f25298i != Double.MAX_VALUE) {
            double d = this.f25291b;
            if (d > 1.0d) {
                double d2 = this.f25290a;
                this.f25295f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                double d3 = this.f25291b;
                double d4 = this.f25290a;
                this.f25296g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
            } else if (d >= 0.0d && d < 1.0d) {
                this.f25297h = this.f25290a * Math.sqrt(1.0d - (d * d));
            }
            this.f25292c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* renamed from: a */
    public float m10441a() {
        return (float) this.f25298i;
    }

    /* renamed from: c */
    public boolean m10439c(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f25294e && ((double) Math.abs(f - m10441a())) < this.f25293d;
    }

    /* renamed from: d */
    public C9622e m10438d(float f) {
        if (f >= 0.0f) {
            this.f25291b = f;
            this.f25292c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C9622e m10437e(float f) {
        this.f25298i = f;
        return this;
    }

    /* renamed from: f */
    public C9622e m10436f(float f) {
        if (f > 0.0f) {
            this.f25290a = Math.sqrt(f);
            this.f25292c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m10435g(double d) {
        double abs = Math.abs(d);
        this.f25293d = abs;
        this.f25294e = abs * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public AbstractC9601b.C9616o m10434h(double d, double d2, long j) {
        double cos;
        double d3;
        m10440b();
        double d4 = j / 1000.0d;
        double d5 = d - this.f25298i;
        double d6 = this.f25291b;
        if (d6 > 1.0d) {
            double d7 = this.f25296g;
            double d8 = this.f25295f;
            double d9 = d5 - (((d7 * d5) - d2) / (d7 - d8));
            double d10 = ((d5 * d7) - d2) / (d7 - d8);
            d3 = (Math.pow(2.718281828459045d, d7 * d4) * d9) + (Math.pow(2.718281828459045d, this.f25295f * d4) * d10);
            double d11 = this.f25296g;
            double pow = d9 * d11 * Math.pow(2.718281828459045d, d11 * d4);
            double d12 = this.f25295f;
            cos = pow + (d10 * d12 * Math.pow(2.718281828459045d, d12 * d4));
        } else if (d6 == 1.0d) {
            double d13 = this.f25290a;
            double d14 = d2 + (d13 * d5);
            double d15 = d5 + (d14 * d4);
            d3 = Math.pow(2.718281828459045d, (-d13) * d4) * d15;
            double pow2 = d15 * Math.pow(2.718281828459045d, (-this.f25290a) * d4);
            double d16 = this.f25290a;
            cos = (d14 * Math.pow(2.718281828459045d, (-d16) * d4)) + (pow2 * (-d16));
        } else {
            double d17 = 1.0d / this.f25297h;
            double d18 = this.f25290a;
            double d19 = d17 * ((d6 * d18 * d5) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d6) * d18 * d4) * ((Math.cos(this.f25297h * d4) * d5) + (Math.sin(this.f25297h * d4) * d19));
            double d20 = this.f25290a;
            double d21 = this.f25291b;
            double pow4 = Math.pow(2.718281828459045d, (-d21) * d20 * d4);
            double d22 = this.f25297h;
            double sin = (-d22) * d5 * Math.sin(d22 * d4);
            double d23 = this.f25297h;
            cos = ((-d20) * pow3 * d21) + (pow4 * (sin + (d19 * d23 * Math.cos(d23 * d4))));
            d3 = pow3;
        }
        AbstractC9601b.C9616o c9616o = this.f25299j;
        c9616o.f25285a = (float) (d3 + this.f25298i);
        c9616o.f25286b = (float) cos;
        return c9616o;
    }

    public C9622e(float f) {
        this.f25290a = Math.sqrt(1500.0d);
        this.f25291b = 0.5d;
        this.f25292c = false;
        this.f25298i = Double.MAX_VALUE;
        this.f25299j = new AbstractC9601b.C9616o();
        this.f25298i = f;
    }
}
