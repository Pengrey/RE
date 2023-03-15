package p393v0;

import id.InterfaceC6108l;
import p181jd.Intrinsics;
import p411w0.AbstractC11509c;
import p411w0.C11507b;
import p411w0.ColorSpace;
import p411w0.Rgb;
import p468yc.C13192s;

/* compiled from: Color.kt */
/* renamed from: v0.c0 */
/* loaded from: classes.dex */
public final class C11003c0 {
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long m6595a(float r9, float r10, float r11, float r12, p411w0.AbstractC11509c r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p393v0.C11003c0.m6595a(float, float, float, float, w0.c):long");
    }

    /* renamed from: b */
    public static final long m6594b(int i) {
        return Color.m6651i(C13192s.m1445c(C13192s.m1445c(i) << 32));
    }

    /* renamed from: c */
    public static final long m6593c(long j) {
        return Color.m6651i(C13192s.m1445c(C13192s.m1445c(C13192s.m1445c(j) & 4294967295L) << 32));
    }

    /* renamed from: d */
    public static final /* synthetic */ float[] m6592d(long j) {
        return m6590f(j);
    }

    /* renamed from: e */
    public static final long m6591e(long j, long j2) {
        long m6650j = Color.m6650j(j, Color.m6643q(j2));
        float m6645o = Color.m6645o(j2);
        float m6645o2 = Color.m6645o(m6650j);
        float f = 1.0f - m6645o2;
        float f2 = (m6645o * f) + m6645o2;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        return m6595a(i == 0 ? 0.0f : ((Color.m6641s(m6650j) * m6645o2) + ((Color.m6641s(j2) * m6645o) * f)) / f2, i == 0 ? 0.0f : ((Color.m6642r(m6650j) * m6645o2) + ((Color.m6642r(j2) * m6645o) * f)) / f2, i == 0 ? 0.0f : ((Color.m6644p(m6650j) * m6645o2) + ((Color.m6644p(j2) * m6645o) * f)) / f2, f2, Color.m6643q(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final float[] m6590f(long j) {
        return new float[]{Color.m6641s(j), Color.m6642r(j), Color.m6644p(j), Color.m6645o(j)};
    }

    /* renamed from: g */
    public static final float m6589g(long j) {
        AbstractC11509c m6643q = Color.m6643q(j);
        if (C11507b.m4932e(m6643q.m4920f(), C11507b.f29451a.m4927b())) {
            InterfaceC6108l m4842l = ((Rgb) m6643q).m4842l();
            return m6588h((float) ((((Number) m4842l.mo9587d(Double.valueOf(Color.m6641s(j)))).doubleValue() * 0.2126d) + (((Number) m4842l.mo9587d(Double.valueOf(Color.m6642r(j)))).doubleValue() * 0.7152d) + (((Number) m4842l.mo9587d(Double.valueOf(Color.m6644p(j)))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(Intrinsics.addStrAndObj("The specified color must be encoded in an RGB color space. The supplied color space is ", C11507b.m4929h(m6643q.m4920f())).toString());
    }

    /* renamed from: h */
    private static final float m6588h(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: i */
    public static final int m6587i(long j) {
        AbstractC11509c m6643q = Color.m6643q(j);
        if (m6643q.m4918h()) {
            return (int) C13192s.m1445c(j >>> 32);
        }
        float[] m6590f = m6590f(j);
        ColorSpace.m4908i(m6643q, null, 0, 3, null).m4877a(m6590f);
        return ((int) ((m6590f[2] * 255.0f) + 0.5f)) | (((int) ((m6590f[3] * 255.0f) + 0.5f)) << 24) | (((int) ((m6590f[0] * 255.0f) + 0.5f)) << 16) | (((int) ((m6590f[1] * 255.0f) + 0.5f)) << 8);
    }
}
