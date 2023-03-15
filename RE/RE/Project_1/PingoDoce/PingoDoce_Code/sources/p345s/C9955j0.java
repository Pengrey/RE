package p345s;

import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p468yc.C13182l;

/* renamed from: s.j0 */
/* loaded from: classes.dex */
public final class C9955j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpringEstimation.kt */
    /* renamed from: s.j0$a */
    /* loaded from: classes.dex */
    public static final class C9956a extends AbstractC6438m implements InterfaceC6108l<Double, Double> {

        /* renamed from: w */
        final /* synthetic */ double f26073w;

        /* renamed from: x */
        final /* synthetic */ double f26074x;

        /* renamed from: y */
        final /* synthetic */ double f26075y;

        /* renamed from: z */
        final /* synthetic */ double f26076z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9956a(double d, double d2, double d3, double d4) {
            super(1);
            this.f26073w = d;
            this.f26074x = d2;
            this.f26075y = d3;
            this.f26076z = d4;
        }

        /* renamed from: a */
        public final Double m9535a(double d) {
            return Double.valueOf(((this.f26073w + (this.f26074x * d)) * Math.exp(this.f26075y * d)) + this.f26076z);
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Double mo9587d(Double d) {
            return m9535a(d.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpringEstimation.kt */
    /* renamed from: s.j0$b */
    /* loaded from: classes.dex */
    public static final class C9957b extends AbstractC6438m implements InterfaceC6108l<Double, Double> {

        /* renamed from: w */
        final /* synthetic */ double f26077w;

        /* renamed from: x */
        final /* synthetic */ double f26078x;

        /* renamed from: y */
        final /* synthetic */ double f26079y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9957b(double d, double d2, double d3) {
            super(1);
            this.f26077w = d;
            this.f26078x = d2;
            this.f26079y = d3;
        }

        /* renamed from: a */
        public final Double m9534a(double d) {
            double d2 = this.f26077w;
            double d3 = this.f26078x;
            return Double.valueOf(((d2 * ((d3 * d) + 1)) + (this.f26079y * d3)) * Math.exp(d3 * d));
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Double mo9587d(Double d) {
            return m9534a(d.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpringEstimation.kt */
    /* renamed from: s.j0$c */
    /* loaded from: classes.dex */
    public static final class C9958c extends AbstractC6438m implements InterfaceC6108l<Double, Double> {

        /* renamed from: A */
        final /* synthetic */ double f26080A;

        /* renamed from: w */
        final /* synthetic */ double f26081w;

        /* renamed from: x */
        final /* synthetic */ double f26082x;

        /* renamed from: y */
        final /* synthetic */ double f26083y;

        /* renamed from: z */
        final /* synthetic */ double f26084z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9958c(double d, double d2, double d3, double d4, double d5) {
            super(1);
            this.f26081w = d;
            this.f26082x = d2;
            this.f26083y = d3;
            this.f26084z = d4;
            this.f26080A = d5;
        }

        /* renamed from: a */
        public final Double m9533a(double d) {
            return Double.valueOf((this.f26081w * Math.exp(this.f26082x * d)) + (this.f26083y * Math.exp(this.f26084z * d)) + this.f26080A);
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Double mo9587d(Double d) {
            return m9533a(d.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpringEstimation.kt */
    /* renamed from: s.j0$d */
    /* loaded from: classes.dex */
    public static final class C9959d extends AbstractC6438m implements InterfaceC6108l<Double, Double> {

        /* renamed from: w */
        final /* synthetic */ double f26085w;

        /* renamed from: x */
        final /* synthetic */ double f26086x;

        /* renamed from: y */
        final /* synthetic */ double f26087y;

        /* renamed from: z */
        final /* synthetic */ double f26088z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9959d(double d, double d2, double d3, double d4) {
            super(1);
            this.f26085w = d;
            this.f26086x = d2;
            this.f26087y = d3;
            this.f26088z = d4;
        }

        /* renamed from: a */
        public final Double m9532a(double d) {
            double d2 = this.f26085w;
            double d3 = this.f26086x;
            double exp = d2 * d3 * Math.exp(d3 * d);
            double d4 = this.f26087y;
            double d5 = this.f26088z;
            return Double.valueOf(exp + (d4 * d5 * Math.exp(d5 * d)));
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Double mo9587d(Double d) {
            return m9532a(d.doubleValue());
        }
    }

    /* renamed from: a */
    public static final long m9544a(double d, double d2, double d3, double d4, double d5) {
        return m9539f(C9982s.m9458a(1.0d, 2.0d * d2 * Math.sqrt(d), d), d2, d3, d4, d5);
    }

    /* renamed from: b */
    public static final long m9543b(float f, float f2, float f3, float f4, float f5) {
        return m9544a(f, f2, f3, f4, f5);
    }

    /* renamed from: c */
    private static final double m9542c(C13182l<C9981r, C9981r> c13182l, double d, double d2, double d3) {
        double d4;
        double d5;
        C9956a c9956a;
        C9957b c9957b;
        double d6;
        double m9461f = ((C9981r) c13182l.m1460c()).m9461f();
        double d7 = m9461f * d;
        double d8 = d2 - d7;
        double log = Math.log(Math.abs(d3 / d)) / m9461f;
        double m9541d = m9541d(Math.log(Math.abs(d3 / d8)), m9461f) / m9461f;
        int i = 0;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            d4 = m9541d;
        } else {
            if (!(!((Double.isInfinite(m9541d) || Double.isNaN(m9541d)) ? false : true))) {
                log = Math.max(log, m9541d);
            }
            d4 = log;
        }
        double d9 = (-(d7 + d8)) / (m9461f * d8);
        if (!Double.isNaN(d9) && d9 > 0.0d) {
            if (d9 <= 0.0d || (-m9540e(d, m9461f, d9, d8)) >= d3) {
                d4 = (-(2.0d / m9461f)) - (d / d8);
                d5 = d3;
                c9956a = new C9956a(d, d8, m9461f, d5);
                c9957b = new C9957b(d8, m9461f, d);
                d6 = Double.MAX_VALUE;
                while (d6 > 0.001d && i < 100) {
                    i++;
                    double doubleValue = d4 - (c9956a.mo9587d(Double.valueOf(d4)).doubleValue() / c9957b.mo9587d(Double.valueOf(d4)).doubleValue());
                    double abs = Math.abs(d4 - doubleValue);
                    d4 = doubleValue;
                    d6 = abs;
                }
                return d4;
            } else if (d8 < 0.0d && d > 0.0d) {
                d4 = 0.0d;
            }
        }
        d5 = -d3;
        c9956a = new C9956a(d, d8, m9461f, d5);
        c9957b = new C9957b(d8, m9461f, d);
        d6 = Double.MAX_VALUE;
        while (d6 > 0.001d) {
            i++;
            double doubleValue2 = d4 - (c9956a.mo9587d(Double.valueOf(d4)).doubleValue() / c9957b.mo9587d(Double.valueOf(d4)).doubleValue());
            double abs2 = Math.abs(d4 - doubleValue2);
            d4 = doubleValue2;
            d6 = abs2;
        }
        return d4;
    }

    /* renamed from: d */
    private static final double m9541d(double d, double d2) {
        int i = 0;
        double d3 = d;
        while (i < 6) {
            i++;
            d3 = d - Math.log(Math.abs(d3 / d2));
        }
        return d3;
    }

    /* renamed from: e */
    private static final double m9540e(double d, double d2, double d3, double d4) {
        double d5 = d2 * d3;
        return (d * Math.exp(d5)) + (d4 * d3 * Math.exp(d5));
    }

    /* renamed from: f */
    private static final long m9539f(C13182l<C9981r, C9981r> c13182l, double d, double d2, double d3, double d4) {
        double m9542c;
        int i = (d3 > 0.0d ? 1 : (d3 == 0.0d ? 0 : -1));
        if (i == 0) {
            if (d2 == 0.0d) {
                return 0L;
            }
        }
        if (i < 0) {
            d2 = -d2;
        }
        double d5 = d2;
        double abs = Math.abs(d3);
        if (d > 1.0d) {
            m9542c = m9538g(c13182l, abs, d5, d4);
        } else if (d < 1.0d) {
            m9542c = m9536i(c13182l, abs, d5, d4);
        } else {
            m9542c = m9542c(c13182l, abs, d5, d4);
        }
        return (long) (m9542c * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double m9538g(p468yc.C13182l<p345s.C9981r, p345s.C9981r> r31, double r32, double r34, double r36) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p345s.C9955j0.m9538g(yc.l, double, double, double):double");
    }

    /* renamed from: h */
    private static final double m9537h(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    /* renamed from: i */
    private static final double m9536i(C13182l<C9981r, C9981r> c13182l, double d, double d2, double d3) {
        double m9461f = ((C9981r) c13182l.m1460c()).m9461f();
        double m9462e = (d2 - (m9461f * d)) / ((C9981r) c13182l.m1460c()).m9462e();
        return Math.log(d3 / Math.sqrt((d * d) + (m9462e * m9462e))) / m9461f;
    }
}
