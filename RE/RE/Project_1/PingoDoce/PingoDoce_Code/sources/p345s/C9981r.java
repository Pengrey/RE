package p345s;

import p181jd.Intrinsics;

/* renamed from: s.r */
/* loaded from: classes.dex */
public final class C9981r {

    /* renamed from: a */
    private double f26145a;

    /* renamed from: b */
    private double f26146b;

    public C9981r(double d, double d2) {
        this.f26145a = d;
        this.f26146b = d2;
    }

    /* renamed from: a */
    public static final /* synthetic */ double m9466a(C9981r c9981r) {
        return c9981r.f26146b;
    }

    /* renamed from: b */
    public static final /* synthetic */ double m9465b(C9981r c9981r) {
        return c9981r.f26145a;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m9464c(C9981r c9981r, double d) {
        c9981r.f26146b = d;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m9463d(C9981r c9981r, double d) {
        c9981r.f26145a = d;
    }

    /* renamed from: e */
    public final double m9462e() {
        return this.f26146b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9981r) {
            C9981r c9981r = (C9981r) obj;
            return Intrinsics.equals(Double.valueOf(this.f26145a), Double.valueOf(c9981r.f26145a)) && Intrinsics.equals(Double.valueOf(this.f26146b), Double.valueOf(c9981r.f26146b));
        }
        return false;
    }

    /* renamed from: f */
    public final double m9461f() {
        return this.f26145a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f26145a) * 31) + Double.hashCode(this.f26146b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f26145a + ", _imaginary=" + this.f26146b + ')';
    }
}
