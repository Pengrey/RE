package p297pd;

import p181jd.Intrinsics;
import p297pd.C8608d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pd.i */
/* loaded from: classes2.dex */
public class _Ranges extends Ranges {
    /* renamed from: c */
    public static float m15006c(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: d */
    public static int m15005d(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: e */
    public static long m15004e(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: f */
    public static Comparable m15003f(Comparable comparable, Comparable comparable2) {
        Intrinsics.isThisObjectNull(comparable, "<this>");
        Intrinsics.isThisObjectNull(comparable2, "minimumValue");
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    /* renamed from: g */
    public static double m15002g(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    /* renamed from: h */
    public static float m15001h(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: i */
    public static int m15000i(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: j */
    public static long m14999j(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: k */
    public static double m14998k(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* renamed from: l */
    public static float m14997l(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* renamed from: m */
    public static int m14996m(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: n */
    public static long m14995n(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* renamed from: o */
    public static C8608d m14994o(int i, int i2) {
        return C8608d.f22221z.m15030a(i, i2, -1);
    }

    /* renamed from: p */
    public static C8608d m14993p(C8608d c8608d, int i) {
        Intrinsics.isThisObjectNull(c8608d, "<this>");
        Ranges.m15008a(i > 0, Integer.valueOf(i));
        C8608d.C8609a c8609a = C8608d.f22221z;
        int m15034f = c8608d.m15034f();
        int m15033h = c8608d.m15033h();
        if (c8608d.m15032l() <= 0) {
            i = -i;
        }
        return c8609a.m15030a(m15034f, m15033h, i);
    }

    /* renamed from: q */
    public static C8611f m14992q(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C8611f.f22229A.m15025a();
        }
        return new C8611f(i, i2 - 1);
    }
}
