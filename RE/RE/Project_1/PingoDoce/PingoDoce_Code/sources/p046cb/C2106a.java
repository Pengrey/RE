package p046cb;

/* renamed from: cb.a */
/* loaded from: classes2.dex */
public class C2106a {

    /* renamed from: a */
    public final double f6106a;

    /* renamed from: b */
    public final double f6107b;

    /* renamed from: c */
    public final double f6108c;

    /* renamed from: d */
    public final double f6109d;

    /* renamed from: e */
    public final double f6110e;

    /* renamed from: f */
    public final double f6111f;

    public C2106a(double d, double d2, double d3, double d4) {
        this.f6106a = d;
        this.f6107b = d3;
        this.f6108c = d2;
        this.f6109d = d4;
        this.f6110e = (d + d2) / 2.0d;
        this.f6111f = (d3 + d4) / 2.0d;
    }

    /* renamed from: a */
    public boolean m34657a(double d, double d2) {
        return this.f6106a <= d && d <= this.f6108c && this.f6107b <= d2 && d2 <= this.f6109d;
    }

    /* renamed from: b */
    public boolean m34656b(C2106a c2106a) {
        return c2106a.f6106a >= this.f6106a && c2106a.f6108c <= this.f6108c && c2106a.f6107b >= this.f6107b && c2106a.f6109d <= this.f6109d;
    }

    /* renamed from: c */
    public boolean m34655c(C2107b c2107b) {
        return m34657a(c2107b.f6112a, c2107b.f6113b);
    }

    /* renamed from: d */
    public boolean m34654d(double d, double d2, double d3, double d4) {
        return d < this.f6108c && this.f6106a < d2 && d3 < this.f6109d && this.f6107b < d4;
    }

    /* renamed from: e */
    public boolean m34653e(C2106a c2106a) {
        return m34654d(c2106a.f6106a, c2106a.f6108c, c2106a.f6107b, c2106a.f6109d);
    }
}
