package sd;

import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.s */
/* loaded from: classes2.dex */
public class StringNumberConversions extends C10170r {
    /* renamed from: i */
    public static Integer m8954i(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        return m8953j(str, 10);
    }

    /* renamed from: j */
    public static final Integer m8953j(String str, int i) {
        boolean z;
        int i2;
        Intrinsics.isThisObjectNull(str, "<this>");
        CharJVM.m9044a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        int i5 = 1;
        if (Intrinsics.isLessOrEqual(charAt, 48) >= 0) {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int m9043b = CharJVM.m9043b(str.charAt(i5), i);
            if (m9043b < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + m9043b) {
                return null;
            }
            i3 = i2 - m9043b;
            i5++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* renamed from: k */
    public static Long m8952k(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        return m8951l(str, 10);
    }

    /* renamed from: l */
    public static final Long m8951l(String str, int i) {
        Intrinsics.isThisObjectNull(str, "<this>");
        CharJVM.m9044a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        boolean z = true;
        if (Intrinsics.isLessOrEqual(charAt, 48) >= 0) {
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i2 = 1;
            }
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int m9043b = CharJVM.m9043b(str.charAt(i2), i);
            if (m9043b < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / i;
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * i;
            long j6 = m9043b;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
