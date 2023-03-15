package org.threeten.p283bp.chrono;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.EnumC8168a;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;
import p070e.C4906j;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.chrono.k */
/* loaded from: classes2.dex */
public final class C8192k extends AbstractC8174a<C8192k> {

    /* renamed from: D */
    private static final int[] f21296D;

    /* renamed from: E */
    private static final int[] f21297E;

    /* renamed from: F */
    private static final int[] f21298F;

    /* renamed from: G */
    private static final int[] f21299G;

    /* renamed from: H */
    private static final int[] f21300H;

    /* renamed from: I */
    private static final int[] f21301I;

    /* renamed from: J */
    private static final int[] f21302J;

    /* renamed from: K */
    private static final int[] f21303K;

    /* renamed from: L */
    private static final char f21304L;

    /* renamed from: M */
    private static final String f21305M;

    /* renamed from: N */
    private static final String f21306N;

    /* renamed from: O */
    private static final HashMap<Integer, Integer[]> f21307O;

    /* renamed from: P */
    private static final HashMap<Integer, Integer[]> f21308P;

    /* renamed from: Q */
    private static final HashMap<Integer, Integer[]> f21309Q;

    /* renamed from: R */
    private static final Long[] f21310R;

    /* renamed from: S */
    private static final Integer[] f21311S;

    /* renamed from: T */
    private static final Integer[] f21312T;

    /* renamed from: U */
    private static final Integer[] f21313U;

    /* renamed from: V */
    private static final Integer[] f21314V;

    /* renamed from: W */
    private static final Integer[] f21315W;

    /* renamed from: X */
    private static final Integer[] f21316X;

    /* renamed from: Y */
    private static final Integer[] f21317Y;

    /* renamed from: Z */
    private static final Integer[] f21318Z;

    /* renamed from: A */
    private final transient int f21319A;

    /* renamed from: B */
    private final transient EnumC8168a f21320B;

    /* renamed from: C */
    private final long f21321C;

    /* renamed from: w */
    private final transient EnumC8194l f21322w;

    /* renamed from: x */
    private final transient int f21323x;

    /* renamed from: y */
    private final transient int f21324y;

    /* renamed from: z */
    private final transient int f21325z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HijrahDate.java */
    /* renamed from: org.threeten.bp.chrono.k$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8193a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21326a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21326a = iArr;
            try {
                iArr[EnumC8288a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21326a[EnumC8288a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21326a[EnumC8288a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21326a[EnumC8288a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21326a[EnumC8288a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21326a[EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21326a[EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21326a[EnumC8288a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21326a[EnumC8288a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21326a[EnumC8288a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21326a[EnumC8288a.YEAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21326a[EnumC8288a.ERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, C4906j.f13380A0, 148, 177, 207, 236, 266, 295, 325};
        f21296D = iArr;
        f21297E = new int[]{0, 30, 59, 89, C4906j.f13380A0, 148, 177, 207, 236, 266, 295, 325};
        f21298F = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
        f21299G = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
        f21300H = new int[]{0, 1, 0, 1, 0, 1, 1};
        f21301I = new int[]{1, 9999, 11, 51, 5, 29, 354};
        f21302J = new int[]{1, 9999, 11, 52, 6, 30, 355};
        f21303K = new int[]{0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
        char c = File.separatorChar;
        f21304L = c;
        f21305M = File.pathSeparator;
        f21306N = "org" + c + "threeten" + c + "bp" + c + "chrono";
        f21307O = new HashMap<>();
        f21308P = new HashMap<>();
        f21309Q = new HashMap<>();
        f21314V = new Integer[iArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = f21296D;
            if (i2 >= iArr2.length) {
                break;
            }
            f21314V[i2] = Integer.valueOf(iArr2[i2]);
            i2++;
        }
        f21315W = new Integer[f21297E.length];
        int i3 = 0;
        while (true) {
            int[] iArr3 = f21297E;
            if (i3 >= iArr3.length) {
                break;
            }
            f21315W[i3] = Integer.valueOf(iArr3[i3]);
            i3++;
        }
        f21316X = new Integer[f21298F.length];
        int i4 = 0;
        while (true) {
            int[] iArr4 = f21298F;
            if (i4 >= iArr4.length) {
                break;
            }
            f21316X[i4] = Integer.valueOf(iArr4[i4]);
            i4++;
        }
        f21317Y = new Integer[f21299G.length];
        int i5 = 0;
        while (true) {
            int[] iArr5 = f21299G;
            if (i5 >= iArr5.length) {
                break;
            }
            f21317Y[i5] = Integer.valueOf(iArr5[i5]);
            i5++;
        }
        f21318Z = new Integer[f21303K.length];
        int i6 = 0;
        while (true) {
            int[] iArr6 = f21303K;
            if (i6 >= iArr6.length) {
                break;
            }
            f21318Z[i6] = Integer.valueOf(iArr6[i6]);
            i6++;
        }
        f21310R = new Long[334];
        int i7 = 0;
        while (true) {
            Long[] lArr = f21310R;
            if (i7 >= lArr.length) {
                break;
            }
            lArr[i7] = Long.valueOf(i7 * 10631);
            i7++;
        }
        f21311S = new Integer[f21300H.length];
        int i8 = 0;
        while (true) {
            int[] iArr7 = f21300H;
            if (i8 >= iArr7.length) {
                break;
            }
            f21311S[i8] = Integer.valueOf(iArr7[i8]);
            i8++;
        }
        f21312T = new Integer[f21301I.length];
        int i9 = 0;
        while (true) {
            int[] iArr8 = f21301I;
            if (i9 >= iArr8.length) {
                break;
            }
            f21312T[i9] = Integer.valueOf(iArr8[i9]);
            i9++;
        }
        f21313U = new Integer[f21302J.length];
        while (true) {
            int[] iArr9 = f21302J;
            if (i < iArr9.length) {
                f21313U[i] = Integer.valueOf(iArr9[i]);
                i++;
            } else {
                try {
                    m16302k0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private C8192k(long j) {
        int[] m16322Q = m16322Q(j);
        m16334D(m16322Q[1]);
        m16335C(m16322Q[2]);
        m16337A(m16322Q[3]);
        m16336B(m16322Q[4]);
        this.f21322w = EnumC8194l.m16294of(m16322Q[0]);
        int i = m16322Q[1];
        this.f21323x = i;
        this.f21324y = m16322Q[2];
        this.f21325z = m16322Q[3];
        this.f21319A = m16322Q[4];
        this.f21320B = EnumC8168a.m16409of(m16322Q[5]);
        this.f21321C = j;
        m16314Y(i);
    }

    /* renamed from: A */
    private static void m16337A(int i) {
        if (i < 1 || i > m16321R()) {
            throw new DateTimeException("Invalid day of month of Hijrah date, day " + i + " greater than " + m16321R() + " or less than 1");
        }
    }

    /* renamed from: B */
    private static void m16336B(int i) {
        if (i < 1 || i > m16320S()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
    }

    /* renamed from: C */
    private static void m16335C(int i) {
        if (i < 1 || i > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
    }

    /* renamed from: D */
    private static void m16334D(int i) {
        if (i < 1 || i > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
    }

    /* renamed from: F */
    private static Integer[] m16333F(int i) {
        Integer[] numArr;
        try {
            numArr = f21309Q.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? f21318Z : numArr;
    }

    /* renamed from: G */
    private static Integer[] m16332G(int i) {
        Integer[] numArr;
        try {
            numArr = f21307O.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            if (m16314Y(i)) {
                return f21315W;
            }
            return f21314V;
        }
        return numArr;
    }

    /* renamed from: H */
    private static Integer[] m16331H(int i) {
        Integer[] numArr;
        try {
            numArr = f21308P.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            if (m16314Y(i)) {
                return f21317Y;
            }
            return f21316X;
        }
        return numArr;
    }

    /* renamed from: J */
    private static InputStream m16329J() throws IOException {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + f21304L + property);
            if (file.exists()) {
                try {
                    return new FileInputStream(file);
                } catch (IOException e) {
                    throw e;
                }
            }
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), f21305M);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            File file2 = new File(nextToken);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(nextToken);
                    char c = f21304L;
                    sb2.append(c);
                    String str = f21306N;
                    sb2.append(str);
                    if (new File(sb2.toString(), property).exists()) {
                        try {
                            return new FileInputStream(nextToken + c + str + c + property);
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                } else {
                    try {
                        zipFile = new ZipFile(file2);
                    } catch (IOException unused) {
                        zipFile = null;
                    }
                    if (zipFile != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f21306N);
                        char c2 = f21304L;
                        sb3.append(c2);
                        sb3.append(property);
                        String sb4 = sb3.toString();
                        ZipEntry entry = zipFile.getEntry(sb4);
                        if (entry == null) {
                            if (c2 == '/') {
                                sb4 = sb4.replace('/', '\\');
                            } else if (c2 == '\\') {
                                sb4 = sb4.replace('\\', '/');
                            }
                            entry = zipFile.getEntry(sb4);
                        }
                        if (entry != null) {
                            try {
                                return zipFile.getInputStream(entry);
                            } catch (IOException e3) {
                                throw e3;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: K */
    private static int m16328K(long j) {
        Long[] lArr = f21310R;
        for (int i = 0; i < lArr.length; i++) {
            try {
                if (j < lArr[i].longValue()) {
                    return i - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j) / 10631;
            }
        }
        return ((int) j) / 10631;
    }

    /* renamed from: L */
    private static int m16327L(long j, int i) {
        Long l;
        try {
            l = f21310R[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf(i * 10631);
        }
        return (int) (j - l.longValue());
    }

    /* renamed from: M */
    private static int m16326M(int i, int i2, int i3) {
        int intValue;
        Integer[] m16332G = m16332G(i3);
        if (i < 0) {
            i = m16314Y((long) i3) ? i + 355 : i + 354;
            if (i2 <= 0) {
                return i;
            }
            intValue = m16332G[i2].intValue();
        } else if (i2 <= 0) {
            return i;
        } else {
            intValue = m16332G[i2].intValue();
        }
        return i - intValue;
    }

    /* renamed from: N */
    private static int m16325N(int i, int i2, int i3) {
        Integer[] m16333F = m16333F(i);
        if (i2 > 0) {
            return i2 - m16333F[i3].intValue();
        }
        return m16333F[i3].intValue() + i2;
    }

    /* renamed from: P */
    private static long m16323P(int i, int i2, int i3) {
        return m16296q0(i) + m16319T(i2 - 1, i) + i3;
    }

    /* renamed from: Q */
    private static int[] m16322Q(long j) {
        int m16317V;
        int m16326M;
        int value;
        int i;
        int i2;
        long j2 = j - (-492148);
        if (j2 >= 0) {
            int m16328K = m16328K(j2);
            int m16327L = m16327L(j2, m16328K);
            int m16316W = m16316W(m16328K, m16327L);
            i = m16325N(m16328K, m16327L, m16316W);
            i2 = (m16328K * 30) + m16316W + 1;
            m16317V = m16317V(i, i2);
            m16326M = m16326M(i, m16317V, i2) + 1;
            value = EnumC8194l.AH.getValue();
        } else {
            int i3 = (int) j2;
            int i4 = i3 / 10631;
            int i5 = i3 % 10631;
            if (i5 == 0) {
                i5 = -10631;
                i4++;
            }
            int m16316W2 = m16316W(i4, i5);
            int m16325N = m16325N(i4, i5, m16316W2);
            int i6 = 1 - ((i4 * 30) - m16316W2);
            int i7 = m16314Y((long) i6) ? m16325N + 355 : m16325N + 354;
            m16317V = m16317V(i7, i6);
            m16326M = m16326M(i7, m16317V, i6) + 1;
            value = EnumC8194l.BEFORE_AH.getValue();
            i = i7;
            i2 = i6;
        }
        int i8 = (int) ((j2 + 5) % 7);
        return new int[]{value, i2, m16317V + 1, m16326M, i + 1, i8 + (i8 <= 0 ? 7 : 0)};
    }

    /* renamed from: R */
    static int m16321R() {
        return f21313U[5].intValue();
    }

    /* renamed from: S */
    static int m16320S() {
        return f21313U[6].intValue();
    }

    /* renamed from: T */
    private static int m16319T(int i, int i2) {
        return m16332G(i2)[i].intValue();
    }

    /* renamed from: U */
    static int m16318U(int i, int i2) {
        return m16331H(i2)[i].intValue();
    }

    /* renamed from: V */
    private static int m16317V(int i, int i2) {
        Integer[] m16332G = m16332G(i2);
        int i3 = 0;
        if (i >= 0) {
            while (i3 < m16332G.length) {
                if (i < m16332G[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 11;
        }
        int i4 = m16314Y((long) i2) ? i + 355 : i + 354;
        while (i3 < m16332G.length) {
            if (i4 < m16332G[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 11;
    }

    /* renamed from: W */
    private static int m16316W(int i, long j) {
        Integer[] m16333F = m16333F(i);
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i2 > 0) {
            while (i3 < m16333F.length) {
                if (j < m16333F[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j2 = -j;
        while (i3 < m16333F.length) {
            if (j2 <= m16333F[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    /* renamed from: X */
    static int m16315X(int i) {
        Integer[] numArr;
        int i2 = i - 1;
        int i3 = i2 / 30;
        try {
            numArr = f21309Q.get(Integer.valueOf(i3));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return m16314Y((long) i) ? 355 : 354;
        }
        int i4 = i2 % 30;
        if (i4 == 29) {
            Long[] lArr = f21310R;
            return (lArr[i3 + 1].intValue() - lArr[i3].intValue()) - numArr[i4].intValue();
        }
        return numArr[i4 + 1].intValue() - numArr[i4].intValue();
    }

    /* renamed from: Y */
    static boolean m16314Y(long j) {
        if (j <= 0) {
            j = -j;
        }
        return ((j * 11) + 14) % 30 < 11;
    }

    /* renamed from: c0 */
    public static C8192k m16310c0(int i, int i2, int i3) {
        if (i >= 1) {
            return m16309d0(EnumC8194l.AH, i, i2, i3);
        }
        return m16309d0(EnumC8194l.BEFORE_AH, 1 - i, i2, i3);
    }

    /* renamed from: d0 */
    static C8192k m16309d0(EnumC8194l enumC8194l, int i, int i2, int i3) {
        C11251d.m5623i(enumC8194l, "era");
        m16334D(i);
        m16335C(i2);
        m16337A(i3);
        return new C8192k(m16323P(enumC8194l.prolepticYear(i), i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public static C8192k m16308e0(long j) {
        return new C8192k(j);
    }

    /* renamed from: f0 */
    private static void m16307f0(String str, int i) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 != -1 && parseInt3 != -1 && parseInt4 != -1 && parseInt5 != -1) {
                                                    m16295z(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                                } else {
                                                    throw new ParseException("Unknown error at line " + i + ".", i);
                                                }
                                            } catch (NumberFormatException unused) {
                                                throw new ParseException("End month is not properly set at line " + i + ".", i);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw new ParseException("End year is not properly set at line " + i + ".", i);
                                        }
                                    } else {
                                        throw new ParseException("End year/month has incorrect format at line " + i + ".", i);
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw new ParseException("Start month is not properly set at line " + i + ".", i);
                                }
                            } catch (NumberFormatException unused4) {
                                throw new ParseException("Start year is not properly set at line " + i + ".", i);
                            }
                        } else {
                            throw new ParseException("Start year/month has incorrect format at line " + i + ".", i);
                        }
                    } else {
                        throw new ParseException("Start and end year/month has incorrect format at line " + i + ".", i);
                    }
                } catch (NumberFormatException unused5) {
                    throw new ParseException("Offset is not properly set at line " + i + ".", i);
                }
            } else {
                throw new ParseException("Offset has incorrect format at line " + i + ".", i);
            }
        }
    }

    /* renamed from: k0 */
    private static void m16302k0() throws IOException, ParseException {
        InputStream m16329J = m16329J();
        if (m16329J == null) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(m16329J));
            int i = 0;
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        i++;
                        m16307f0(readLine.trim(), i);
                    } else {
                        bufferedReader2.close();
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public static AbstractC8176b m16301l0(DataInput dataInput) throws IOException {
        return C8191j.f21294y.m16341s(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: m0 */
    private static C8192k m16300m0(int i, int i2, int i3) {
        int m16319T = m16319T(i2 - 1, i);
        if (i3 > m16319T) {
            i3 = m16319T;
        }
        return m16310c0(i, i2, i3);
    }

    /* renamed from: q0 */
    private static long m16296q0(int i) {
        Long l;
        int i2 = i - 1;
        int i3 = i2 / 30;
        int i4 = i2 % 30;
        int intValue = m16333F(i3)[Math.abs(i4)].intValue();
        if (i4 < 0) {
            intValue = -intValue;
        }
        try {
            l = f21310R[i3];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf(i3 * 10631);
        }
        return ((l.longValue() + intValue) - 492148) - 1;
    }

    private Object readResolve() {
        return new C8192k(this.f21321C);
    }

    private Object writeReplace() {
        return new C8207u((byte) 3, this);
    }

    /* renamed from: z */
    private static void m16295z(int i, int i2, int i3, int i4, int i5) {
        if (i < 1) {
            throw new IllegalArgumentException("startYear < 1");
        }
        if (i3 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        }
        if (i2 < 0 || i2 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        }
        if (i4 < 0 || i4 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        }
        if (i3 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        }
        if (i3 < i) {
            throw new IllegalArgumentException("startYear > endYear");
        }
        if (i3 == i && i4 < i2) {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
        boolean m16314Y = m16314Y(i);
        Integer[] numArr = f21307O.get(Integer.valueOf(i));
        if (numArr == null) {
            if (m16314Y) {
                numArr = new Integer[f21297E.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = f21297E;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    numArr[i6] = Integer.valueOf(iArr[i6]);
                    i6++;
                }
            } else {
                numArr = new Integer[f21296D.length];
                int i7 = 0;
                while (true) {
                    int[] iArr2 = f21296D;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    numArr[i7] = Integer.valueOf(iArr2[i7]);
                    i7++;
                }
            }
        }
        Integer[] numArr2 = new Integer[numArr.length];
        for (int i8 = 0; i8 < 12; i8++) {
            if (i8 > i2) {
                numArr2[i8] = Integer.valueOf(numArr[i8].intValue() - i5);
            } else {
                numArr2[i8] = Integer.valueOf(numArr[i8].intValue());
            }
        }
        f21307O.put(Integer.valueOf(i), numArr2);
        Integer[] numArr3 = f21308P.get(Integer.valueOf(i));
        if (numArr3 == null) {
            if (m16314Y) {
                numArr3 = new Integer[f21299G.length];
                int i9 = 0;
                while (true) {
                    int[] iArr3 = f21299G;
                    if (i9 >= iArr3.length) {
                        break;
                    }
                    numArr3[i9] = Integer.valueOf(iArr3[i9]);
                    i9++;
                }
            } else {
                numArr3 = new Integer[f21298F.length];
                int i10 = 0;
                while (true) {
                    int[] iArr4 = f21298F;
                    if (i10 >= iArr4.length) {
                        break;
                    }
                    numArr3[i10] = Integer.valueOf(iArr4[i10]);
                    i10++;
                }
            }
        }
        Integer[] numArr4 = new Integer[numArr3.length];
        for (int i11 = 0; i11 < 12; i11++) {
            if (i11 == i2) {
                numArr4[i11] = Integer.valueOf(numArr3[i11].intValue() - i5);
            } else {
                numArr4[i11] = Integer.valueOf(numArr3[i11].intValue());
            }
        }
        f21308P.put(Integer.valueOf(i), numArr4);
        if (i != i3) {
            int i12 = i - 1;
            int i13 = i12 / 30;
            int i14 = i12 % 30;
            Integer[] numArr5 = f21309Q.get(Integer.valueOf(i13));
            if (numArr5 == null) {
                int length = f21303K.length;
                Integer[] numArr6 = new Integer[length];
                for (int i15 = 0; i15 < length; i15++) {
                    numArr6[i15] = Integer.valueOf(f21303K[i15]);
                }
                numArr5 = numArr6;
            }
            for (int i16 = i14 + 1; i16 < f21303K.length; i16++) {
                numArr5[i16] = Integer.valueOf(numArr5[i16].intValue() - i5);
            }
            f21309Q.put(Integer.valueOf(i13), numArr5);
            int i17 = i3 - 1;
            int i18 = i17 / 30;
            if (i13 != i18) {
                int i19 = i13 + 1;
                while (true) {
                    Long[] lArr = f21310R;
                    if (i19 >= lArr.length) {
                        break;
                    }
                    lArr[i19] = Long.valueOf(lArr[i19].longValue() - i5);
                    i19++;
                }
                int i20 = i18 + 1;
                while (true) {
                    Long[] lArr2 = f21310R;
                    if (i20 >= lArr2.length) {
                        break;
                    }
                    lArr2[i20] = Long.valueOf(lArr2[i20].longValue() + i5);
                    i20++;
                    i18 = i18;
                }
            }
            int i21 = i18;
            int i22 = i17 % 30;
            Integer[] numArr7 = f21309Q.get(Integer.valueOf(i21));
            if (numArr7 == null) {
                int length2 = f21303K.length;
                Integer[] numArr8 = new Integer[length2];
                for (int i23 = 0; i23 < length2; i23++) {
                    numArr8[i23] = Integer.valueOf(f21303K[i23]);
                }
                numArr7 = numArr8;
            }
            for (int i24 = i22 + 1; i24 < f21303K.length; i24++) {
                numArr7[i24] = Integer.valueOf(numArr7[i24].intValue() + i5);
            }
            f21309Q.put(Integer.valueOf(i21), numArr7);
        }
        boolean m16314Y2 = m16314Y(i3);
        Integer[] numArr9 = f21307O.get(Integer.valueOf(i3));
        if (numArr9 == null) {
            if (m16314Y2) {
                numArr9 = new Integer[f21297E.length];
                int i25 = 0;
                while (true) {
                    int[] iArr5 = f21297E;
                    if (i25 >= iArr5.length) {
                        break;
                    }
                    numArr9[i25] = Integer.valueOf(iArr5[i25]);
                    i25++;
                }
            } else {
                numArr9 = new Integer[f21296D.length];
                int i26 = 0;
                while (true) {
                    int[] iArr6 = f21296D;
                    if (i26 >= iArr6.length) {
                        break;
                    }
                    numArr9[i26] = Integer.valueOf(iArr6[i26]);
                    i26++;
                }
            }
        }
        Integer[] numArr10 = new Integer[numArr9.length];
        for (int i27 = 0; i27 < 12; i27++) {
            if (i27 > i4) {
                numArr10[i27] = Integer.valueOf(numArr9[i27].intValue() + i5);
            } else {
                numArr10[i27] = Integer.valueOf(numArr9[i27].intValue());
            }
        }
        f21307O.put(Integer.valueOf(i3), numArr10);
        Integer[] numArr11 = f21308P.get(Integer.valueOf(i3));
        if (numArr11 == null) {
            if (m16314Y2) {
                numArr11 = new Integer[f21299G.length];
                int i28 = 0;
                while (true) {
                    int[] iArr7 = f21299G;
                    if (i28 >= iArr7.length) {
                        break;
                    }
                    numArr11[i28] = Integer.valueOf(iArr7[i28]);
                    i28++;
                }
            } else {
                numArr11 = new Integer[f21298F.length];
                int i29 = 0;
                while (true) {
                    int[] iArr8 = f21298F;
                    if (i29 >= iArr8.length) {
                        break;
                    }
                    numArr11[i29] = Integer.valueOf(iArr8[i29]);
                    i29++;
                }
            }
        }
        Integer[] numArr12 = new Integer[numArr11.length];
        for (int i30 = 0; i30 < 12; i30++) {
            if (i30 == i4) {
                numArr12[i30] = Integer.valueOf(numArr11[i30].intValue() + i5);
            } else {
                numArr12[i30] = Integer.valueOf(numArr11[i30].intValue());
            }
        }
        HashMap<Integer, Integer[]> hashMap = f21308P;
        hashMap.put(Integer.valueOf(i3), numArr12);
        Integer[] numArr13 = hashMap.get(Integer.valueOf(i));
        Integer[] numArr14 = hashMap.get(Integer.valueOf(i3));
        HashMap<Integer, Integer[]> hashMap2 = f21307O;
        int intValue = numArr13[i2].intValue();
        int intValue2 = numArr14[i4].intValue();
        int intValue3 = hashMap2.get(Integer.valueOf(i))[11].intValue() + numArr13[11].intValue();
        int intValue4 = hashMap2.get(Integer.valueOf(i3))[11].intValue() + numArr14[11].intValue();
        Integer[] numArr15 = f21313U;
        int intValue5 = numArr15[5].intValue();
        Integer[] numArr16 = f21312T;
        int intValue6 = numArr16[5].intValue();
        if (intValue5 < intValue) {
            intValue5 = intValue;
        }
        if (intValue5 < intValue2) {
            intValue5 = intValue2;
        }
        numArr15[5] = Integer.valueOf(intValue5);
        if (intValue6 <= intValue) {
            intValue = intValue6;
        }
        if (intValue <= intValue2) {
            intValue2 = intValue;
        }
        numArr16[5] = Integer.valueOf(intValue2);
        int intValue7 = numArr15[6].intValue();
        int intValue8 = numArr16[6].intValue();
        if (intValue7 < intValue3) {
            intValue7 = intValue3;
        }
        if (intValue7 < intValue4) {
            intValue7 = intValue4;
        }
        numArr15[6] = Integer.valueOf(intValue7);
        if (intValue8 <= intValue3) {
            intValue3 = intValue8;
        }
        if (intValue3 <= intValue4) {
            intValue4 = intValue3;
        }
        numArr16[6] = Integer.valueOf(intValue4);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: I */
    public C8191j mo16173j() {
        return C8191j.f21294y;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: O */
    public EnumC8194l mo16172k() {
        return this.f21322w;
    }

    /* renamed from: Z */
    public int m16313Z() {
        return m16318U(this.f21324y - 1, this.f21323x);
    }

    /* renamed from: a0 */
    public int m16312a0() {
        return m16315X(this.f21323x);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: b0 */
    public C8192k mo16169n(long j, InterfaceC8314k interfaceC8314k) {
        return (C8192k) super.mo5632d(j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8174a, org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: g */
    public final AbstractC8178c<C8192k> mo16175g(C8219f c8219f) {
        return super.mo16175g(c8219f);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: g0 */
    public C8192k mo16212s(long j, InterfaceC8314k interfaceC8314k) {
        return (C8192k) super.mo16168o(j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        int i;
        int i2;
        if (interfaceC8304h instanceof EnumC8288a) {
            switch (C8193a.f21326a[((EnumC8288a) interfaceC8304h).ordinal()]) {
                case 1:
                    i = this.f21325z;
                    break;
                case 2:
                    i = this.f21319A;
                    break;
                case 3:
                    i2 = (this.f21325z - 1) / 7;
                    i = i2 + 1;
                    break;
                case 4:
                    i = this.f21323x;
                    break;
                case 5:
                    i = this.f21320B.getValue();
                    break;
                case 6:
                    i2 = (this.f21325z - 1) % 7;
                    i = i2 + 1;
                    break;
                case 7:
                    i2 = (this.f21319A - 1) % 7;
                    i = i2 + 1;
                    break;
                case 8:
                    return mo16167p();
                case 9:
                    i2 = (this.f21319A - 1) / 7;
                    i = i2 + 1;
                    break;
                case 10:
                    i = this.f21324y;
                    break;
                case 11:
                    i = this.f21323x;
                    break;
                case 12:
                    i = this.f21322w.getValue();
                    break;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            }
            return i;
        }
        return interfaceC8304h.getFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: h0 */
    public C8192k mo16211u(long j) {
        return new C8192k(this.f21321C + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: i0 */
    public C8192k mo16210w(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f21324y - 1) + ((int) j);
        int i2 = i / 12;
        int i3 = i % 12;
        while (i3 < 0) {
            i3 += 12;
            i2 = C11251d.m5618n(i2, 1);
        }
        return m16309d0(this.f21322w, C11251d.m5622j(this.f21323x, i2), i3 + 1, this.f21325z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: j0 */
    public C8192k mo16209x(long j) {
        if (j == 0) {
            return this;
        }
        return m16309d0(this.f21322w, C11251d.m5622j(this.f21323x, (int) j), this.f21324y, this.f21325z);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: n0 */
    public C8192k mo16166q(InterfaceC8300f interfaceC8300f) {
        return (C8192k) super.mo5633b(interfaceC8300f);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: o0 */
    public C8192k mo16165r(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            enumC8288a.checkValidValue(j);
            int i = (int) j;
            switch (C8193a.f21326a[enumC8288a.ordinal()]) {
                case 1:
                    return m16300m0(this.f21323x, this.f21324y, i);
                case 2:
                    int i2 = i - 1;
                    return m16300m0(this.f21323x, (i2 / 30) + 1, (i2 % 30) + 1);
                case 3:
                    return mo16211u((j - getLong(EnumC8288a.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    if (this.f21323x < 1) {
                        i = 1 - i;
                    }
                    return m16300m0(i, this.f21324y, this.f21325z);
                case 5:
                    return mo16211u(j - this.f21320B.getValue());
                case 6:
                    return mo16211u(j - getLong(EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return mo16211u(j - getLong(EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return new C8192k(i);
                case 9:
                    return mo16211u((j - getLong(EnumC8288a.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 10:
                    return m16300m0(this.f21323x, i, this.f21325z);
                case 11:
                    return m16300m0(i, this.f21324y, this.f21325z);
                case 12:
                    return m16300m0(1 - this.f21323x, this.f21324y, this.f21325z);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            }
        }
        return (C8192k) interfaceC8304h.adjustInto(this, j);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: p */
    public long mo16167p() {
        return m16323P(this.f21323x, this.f21324y, this.f21325z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void m16297p0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(EnumC8288a.YEAR));
        dataOutput.writeByte(get(EnumC8288a.MONTH_OF_YEAR));
        dataOutput.writeByte(get(EnumC8288a.DAY_OF_MONTH));
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (isSupported(interfaceC8304h)) {
                EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
                int i = C8193a.f21326a[enumC8288a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return mo16173j().m16338v(enumC8288a);
                            }
                            return C8315l.m15846i(1L, 1000L);
                        }
                        return C8315l.m15846i(1L, 5L);
                    }
                    return C8315l.m15846i(1L, m16312a0());
                }
                return C8315l.m15846i(1L, m16313Z());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }
}
