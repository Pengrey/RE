package androidx.core.util;

import java.io.PrintWriter;
import org.joda.time.DateTimeConstants;

/* renamed from: androidx.core.util.i */
/* loaded from: classes.dex */
public final class C1077i {

    /* renamed from: a */
    private static final Object f3411a = new Object();

    /* renamed from: b */
    private static char[] f3412b = new char[24];

    /* renamed from: a */
    private static int m38617a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m38616b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m38614d(j - j2, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m38615c(long j, PrintWriter printWriter) {
        m38614d(j, printWriter, 0);
    }

    /* renamed from: d */
    public static void m38614d(long j, PrintWriter printWriter, int i) {
        synchronized (f3411a) {
            printWriter.print(new String(f3412b, 0, m38613e(j, i)));
        }
    }

    /* renamed from: e */
    private static int m38613e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (f3412b.length < i) {
            f3412b = new char[i];
        }
        char[] cArr = f3412b;
        int i7 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i7 == 0) {
            int i8 = i - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i7 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i9 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / DateTimeConstants.SECONDS_PER_DAY;
            floor -= DateTimeConstants.SECONDS_PER_DAY * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / DateTimeConstants.SECONDS_PER_HOUR;
            floor -= i3 * DateTimeConstants.SECONDS_PER_HOUR;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i10 = floor / 60;
            i4 = floor - (i10 * 60);
            i5 = i10;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int m38617a = m38617a(i2, 1, false, 0);
            int m38617a2 = m38617a + m38617a(i3, 1, m38617a > 0, 2);
            int m38617a3 = m38617a2 + m38617a(i5, 1, m38617a2 > 0, 2);
            int m38617a4 = m38617a3 + m38617a(i4, 1, m38617a3 > 0, 2);
            i6 = 0;
            for (int m38617a5 = m38617a4 + m38617a(i9, 2, true, m38617a4 > 0 ? 3 : 0) + 1; m38617a5 < i; m38617a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i11 = i6 + 1;
        boolean z = i != 0;
        int m38612f = m38612f(cArr, i2, 'd', i11, false, 0);
        int m38612f2 = m38612f(cArr, i3, 'h', m38612f, m38612f != i11, z ? 2 : 0);
        int m38612f3 = m38612f(cArr, i5, 'm', m38612f2, m38612f2 != i11, z ? 2 : 0);
        int m38612f4 = m38612f(cArr, i4, 's', m38612f3, m38612f3 != i11, z ? 2 : 0);
        int m38612f5 = m38612f(cArr, i9, 'm', m38612f4, true, (!z || m38612f4 == i11) ? 0 : 3);
        cArr[m38612f5] = 's';
        return m38612f5 + 1;
    }

    /* renamed from: f */
    private static int m38612f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (z || i > 0) {
            if ((!z || i3 < 3) && i <= 99) {
                i4 = i2;
            } else {
                int i5 = i / 100;
                cArr[i2] = (char) (i5 + 48);
                i4 = i2 + 1;
                i -= i5 * 100;
            }
            if ((z && i3 >= 2) || i > 9 || i2 != i4) {
                int i6 = i / 10;
                cArr[i4] = (char) (i6 + 48);
                i4++;
                i -= i6 * 10;
            }
            cArr[i4] = (char) (i + 48);
            int i7 = i4 + 1;
            cArr[i7] = c;
            return i7 + 1;
        }
        return i2;
    }
}
