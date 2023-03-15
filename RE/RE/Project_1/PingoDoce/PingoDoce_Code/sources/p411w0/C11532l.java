package p411w0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: w0.l */
/* loaded from: classes.dex */
public final class C11532l {

    /* renamed from: a */
    private final double f29529a;

    /* renamed from: b */
    private final double f29530b;

    /* renamed from: c */
    private final double f29531c;

    /* renamed from: d */
    private final double f29532d;

    /* renamed from: e */
    private final double f29533e;

    /* renamed from: f */
    private final double f29534f;

    /* renamed from: g */
    private final double f29535g;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11532l(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p411w0.C11532l.<init>(double, double, double, double, double, double, double):void");
    }

    /* renamed from: a */
    public final double m4814a() {
        return this.f29530b;
    }

    /* renamed from: b */
    public final double m4813b() {
        return this.f29531c;
    }

    /* renamed from: c */
    public final double m4812c() {
        return this.f29532d;
    }

    /* renamed from: d */
    public final double m4811d() {
        return this.f29533e;
    }

    /* renamed from: e */
    public final double m4810e() {
        return this.f29534f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11532l) {
            C11532l c11532l = (C11532l) obj;
            return Intrinsics.equals(Double.valueOf(this.f29529a), Double.valueOf(c11532l.f29529a)) && Intrinsics.equals(Double.valueOf(this.f29530b), Double.valueOf(c11532l.f29530b)) && Intrinsics.equals(Double.valueOf(this.f29531c), Double.valueOf(c11532l.f29531c)) && Intrinsics.equals(Double.valueOf(this.f29532d), Double.valueOf(c11532l.f29532d)) && Intrinsics.equals(Double.valueOf(this.f29533e), Double.valueOf(c11532l.f29533e)) && Intrinsics.equals(Double.valueOf(this.f29534f), Double.valueOf(c11532l.f29534f)) && Intrinsics.equals(Double.valueOf(this.f29535g), Double.valueOf(c11532l.f29535g));
        }
        return false;
    }

    /* renamed from: f */
    public final double m4809f() {
        return this.f29535g;
    }

    /* renamed from: g */
    public final double m4808g() {
        return this.f29529a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f29529a) * 31) + Double.hashCode(this.f29530b)) * 31) + Double.hashCode(this.f29531c)) * 31) + Double.hashCode(this.f29532d)) * 31) + Double.hashCode(this.f29533e)) * 31) + Double.hashCode(this.f29534f)) * 31) + Double.hashCode(this.f29535g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f29529a + ", a=" + this.f29530b + ", b=" + this.f29531c + ", c=" + this.f29532d + ", d=" + this.f29533e + ", e=" + this.f29534f + ", f=" + this.f29535g + ')';
    }

    public /* synthetic */ C11532l(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}
