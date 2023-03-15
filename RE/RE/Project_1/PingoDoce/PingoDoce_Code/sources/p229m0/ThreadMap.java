package p229m0;

import p181jd.Intrinsics;

/* renamed from: m0.d */
/* loaded from: classes.dex */
public final class ThreadMap {

    /* renamed from: a */
    private final int f18827a;

    /* renamed from: b */
    private final long[] f18828b;

    /* renamed from: c */
    private final Object[] f18829c;

    public ThreadMap(int i, long[] jArr, Object[] objArr) {
        Intrinsics.isThisObjectNull(jArr, "keys");
        Intrinsics.isThisObjectNull(objArr, "values");
        this.f18827a = i;
        this.f18828b = jArr;
        this.f18829c = objArr;
    }

    /* renamed from: a */
    private final int m19322a(long j) {
        int i = this.f18827a - 1;
        if (i != -1) {
            int i2 = 0;
            if (i == 0) {
                long[] jArr = this.f18828b;
                if (jArr[0] == j) {
                    return 0;
                }
                return jArr[0] > j ? -2 : -1;
            }
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.f18828b[i3] - j) > 0L ? 1 : ((this.f18828b[i3] - j) == 0L ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 <= 0) {
                    return i3;
                } else {
                    i = i3 - 1;
                }
            }
            return -(i2 + 1);
        }
        return -1;
    }

    /* renamed from: b */
    public final Object m19321b(long j) {
        int m19322a = m19322a(j);
        if (m19322a >= 0) {
            return this.f18829c[m19322a];
        }
        return null;
    }

    /* renamed from: c */
    public final ThreadMap m19320c(long j, Object obj) {
        int i = this.f18827a;
        Object[] objArr = this.f18829c;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Object obj2 = objArr[i3];
            i3++;
            if (obj2 != null) {
                i4++;
            }
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = this.f18828b[i6];
                Object obj3 = this.f18829c[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj3;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.f18828b[i6];
                    Object obj4 = this.f18829c[i6];
                    if (obj4 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj4;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new ThreadMap(i5, jArr, objArr2);
    }

    /* renamed from: d */
    public final boolean m19319d(long j, Object obj) {
        int m19322a = m19322a(j);
        if (m19322a < 0) {
            return false;
        }
        this.f18829c[m19322a] = obj;
        return true;
    }
}
