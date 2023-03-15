package p479z1;

import p297pd._Ranges;

/* renamed from: z1.c */
/* loaded from: classes.dex */
public final class C13601c {
    /* renamed from: a */
    public static final long m907a(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (!(i4 >= i3)) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        if (i < 0 || i3 < 0) {
            z = false;
        }
        if (z) {
            return C13599b.f34590b.m909b(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m906b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m907a(i, i2, i3, i4);
    }

    /* renamed from: c */
    private static final int m905c(int i, int i2) {
        int m15005d;
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        m15005d = _Ranges.m15005d(i + i2, 0);
        return m15005d;
    }

    /* renamed from: d */
    public static final long m904d(long j, long j2) {
        int m14996m;
        int m14996m2;
        m14996m = _Ranges.m14996m(C13615m.m824g(j2), C13599b.m914p(j), C13599b.m916n(j));
        m14996m2 = _Ranges.m14996m(C13615m.m825f(j2), C13599b.m915o(j), C13599b.m917m(j));
        return C13617n.m819a(m14996m, m14996m2);
    }

    /* renamed from: e */
    public static final long m903e(long j, long j2) {
        int m14996m;
        int m14996m2;
        int m14996m3;
        int m14996m4;
        m14996m = _Ranges.m14996m(C13599b.m914p(j2), C13599b.m914p(j), C13599b.m916n(j));
        m14996m2 = _Ranges.m14996m(C13599b.m916n(j2), C13599b.m914p(j), C13599b.m916n(j));
        m14996m3 = _Ranges.m14996m(C13599b.m915o(j2), C13599b.m915o(j), C13599b.m917m(j));
        m14996m4 = _Ranges.m14996m(C13599b.m917m(j2), C13599b.m915o(j), C13599b.m917m(j));
        return m907a(m14996m, m14996m2, m14996m3, m14996m4);
    }

    /* renamed from: f */
    public static final int m902f(long j, int i) {
        int m14996m;
        m14996m = _Ranges.m14996m(i, C13599b.m915o(j), C13599b.m917m(j));
        return m14996m;
    }

    /* renamed from: g */
    public static final int m901g(long j, int i) {
        int m14996m;
        m14996m = _Ranges.m14996m(i, C13599b.m914p(j), C13599b.m916n(j));
        return m14996m;
    }

    /* renamed from: h */
    public static final long m900h(long j, int i, int i2) {
        int m15005d;
        int m15005d2;
        m15005d = _Ranges.m15005d(C13599b.m914p(j) + i, 0);
        int m905c = m905c(C13599b.m916n(j), i);
        m15005d2 = _Ranges.m15005d(C13599b.m915o(j) + i2, 0);
        return m907a(m15005d, m905c, m15005d2, m905c(C13599b.m917m(j), i2));
    }
}
