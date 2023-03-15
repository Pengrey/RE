package p169j1;

import p181jd.C6432f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j1.d */
/* loaded from: classes.dex */
public final class C6242d {
    /* renamed from: a */
    public static final int m21712a(long j, long j2) {
        boolean m21709d = m21709d(j);
        if (m21709d != m21709d(j2)) {
            return m21709d ? -1 : 1;
        }
        return (int) Math.signum(m21710c(j) - m21710c(j2));
    }

    /* renamed from: b */
    public static long m21711b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final float m21710c(long j) {
        C6432f c6432f = C6432f.f17524a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: d */
    public static final boolean m21709d(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }
}
