package ac;

import com.google.zxing.FormatException;
import java.math.BigInteger;
import java.util.Arrays;
import p488zb.C13746c;

/* renamed from: ac.e */
/* loaded from: classes2.dex */
final class C0118e {

    /* renamed from: a */
    private static final char[] f284a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f285b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f286c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodedBitStreamParser.java */
    /* renamed from: ac.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0119a {

        /* renamed from: a */
        static final /* synthetic */ int[] f287a;

        static {
            int[] iArr = new int[EnumC0120b.values().length];
            f287a = iArr;
            try {
                iArr[EnumC0120b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f287a[EnumC0120b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f287a[EnumC0120b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f287a[EnumC0120b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f287a[EnumC0120b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f287a[EnumC0120b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodedBitStreamParser.java */
    /* renamed from: ac.e$b */
    /* loaded from: classes2.dex */
    public enum EnumC0120b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f286c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f286c;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m41862a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0118e.m41862a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p239mb.C7158e m41861b(int[] r6, java.lang.String r7) throws com.google.zxing.FormatException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            zb.c r3 = new zb.c
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L6d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L58
            switch(r2) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2d;
                case 928: goto L28;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            int r2 = m41856g(r6, r4, r0)
            goto L60
        L28:
            int r2 = m41859d(r6, r4, r3)
            goto L60
        L2d:
            int r2 = r4 + 1
            r1 = r6[r4]
            mb.d r1 = p239mb.EnumC7157d.getCharacterSetECIByValue(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L60
        L3e:
            int r2 = r4 + 2
            goto L60
        L41:
            int r2 = r4 + 1
            goto L60
        L44:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.m27702a()
            throw r6
        L49:
            int r2 = m41857f(r6, r4, r0)
            goto L60
        L4e:
            int r2 = m41862a(r2, r6, r1, r4, r0)
            goto L60
        L53:
            int r2 = m41856g(r6, r4, r0)
            goto L60
        L58:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L60:
            int r4 = r6.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L68:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.m27702a()
            throw r6
        L6d:
            int r6 = r0.length()
            if (r6 == 0) goto L81
            mb.e r6 = new mb.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.m19031m(r3)
            return r6
        L81:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.m27702a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0118e.m41861b(int[], java.lang.String):mb.e");
    }

    /* renamed from: c */
    private static String m41860c(int[] iArr, int i) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f286c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.m27702a();
    }

    /* renamed from: d */
    static int m41859d(int[] iArr, int i, C13746c c13746c) throws FormatException {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            c13746c.m500j(Integer.parseInt(m41860c(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int m41856g = m41856g(iArr, i, sb2);
            c13746c.m506d(sb2.toString());
            int i3 = iArr[m41856g] == 923 ? m41856g + 1 : -1;
            while (m41856g < iArr[0]) {
                int i4 = iArr[m41856g];
                if (i4 == 922) {
                    m41856g++;
                    c13746c.m503g(true);
                } else if (i4 == 923) {
                    int i5 = m41856g + 1;
                    switch (iArr[i5]) {
                        case 0:
                            StringBuilder sb3 = new StringBuilder();
                            m41856g = m41856g(iArr, i5 + 1, sb3);
                            c13746c.m505e(sb3.toString());
                            continue;
                        case 1:
                            StringBuilder sb4 = new StringBuilder();
                            m41856g = m41857f(iArr, i5 + 1, sb4);
                            c13746c.m501i(Integer.parseInt(sb4.toString()));
                            continue;
                        case 2:
                            StringBuilder sb5 = new StringBuilder();
                            m41856g = m41857f(iArr, i5 + 1, sb5);
                            c13746c.m498l(Long.parseLong(sb5.toString()));
                            continue;
                        case 3:
                            StringBuilder sb6 = new StringBuilder();
                            m41856g = m41856g(iArr, i5 + 1, sb6);
                            c13746c.m499k(sb6.toString());
                            continue;
                        case 4:
                            StringBuilder sb7 = new StringBuilder();
                            m41856g = m41856g(iArr, i5 + 1, sb7);
                            c13746c.m508b(sb7.toString());
                            continue;
                        case 5:
                            StringBuilder sb8 = new StringBuilder();
                            m41856g = m41857f(iArr, i5 + 1, sb8);
                            c13746c.m504f(Long.parseLong(sb8.toString()));
                            continue;
                        case 6:
                            StringBuilder sb9 = new StringBuilder();
                            m41856g = m41857f(iArr, i5 + 1, sb9);
                            c13746c.m507c(Integer.parseInt(sb9.toString()));
                            continue;
                        default:
                            throw FormatException.m27702a();
                    }
                } else {
                    throw FormatException.m27702a();
                }
            }
            if (i3 != -1) {
                int i6 = m41856g - i3;
                if (c13746c.m509a()) {
                    i6--;
                }
                c13746c.m502h(Arrays.copyOfRange(iArr, i3, i6 + i3));
            }
            return m41856g;
        }
        throw FormatException.m27702a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static void m41858e(int[] iArr, int[] iArr2, int i, StringBuilder sb2) {
        EnumC0120b enumC0120b;
        int i2;
        EnumC0120b enumC0120b2 = EnumC0120b.ALPHA;
        EnumC0120b enumC0120b3 = enumC0120b2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c = ' ';
            switch (C0119a.f287a[enumC0120b2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 == 900) {
                            enumC0120b2 = EnumC0120b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    enumC0120b2 = EnumC0120b.LOWER;
                                    break;
                                case 28:
                                    enumC0120b2 = EnumC0120b.MIXED;
                                    break;
                                case 29:
                                    enumC0120b = EnumC0120b.PUNCT_SHIFT;
                                    c = 0;
                                    EnumC0120b enumC0120b4 = enumC0120b;
                                    enumC0120b3 = enumC0120b2;
                                    enumC0120b2 = enumC0120b4;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 == 900) {
                            enumC0120b2 = EnumC0120b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    enumC0120b = EnumC0120b.ALPHA_SHIFT;
                                    c = 0;
                                    EnumC0120b enumC0120b42 = enumC0120b;
                                    enumC0120b3 = enumC0120b2;
                                    enumC0120b2 = enumC0120b42;
                                    break;
                                case 28:
                                    enumC0120b2 = EnumC0120b.MIXED;
                                    break;
                                case 29:
                                    enumC0120b = EnumC0120b.PUNCT_SHIFT;
                                    c = 0;
                                    EnumC0120b enumC0120b422 = enumC0120b;
                                    enumC0120b3 = enumC0120b2;
                                    enumC0120b2 = enumC0120b422;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                case 3:
                    if (i4 < 25) {
                        c = f285b[i4];
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 25:
                                        enumC0120b2 = EnumC0120b.PUNCT;
                                        break;
                                    case 27:
                                        enumC0120b2 = EnumC0120b.LOWER;
                                        break;
                                    case 29:
                                        enumC0120b = EnumC0120b.PUNCT_SHIFT;
                                        c = 0;
                                        EnumC0120b enumC0120b4222 = enumC0120b;
                                        enumC0120b3 = enumC0120b2;
                                        enumC0120b2 = enumC0120b4222;
                                        break;
                                }
                            } else {
                                sb2.append((char) iArr2[i3]);
                            }
                            c = 0;
                            break;
                        }
                        enumC0120b2 = EnumC0120b.ALPHA;
                        c = 0;
                    }
                    break;
                case 4:
                    if (i4 < 29) {
                        c = f284a[i4];
                        break;
                    } else {
                        if (i4 == 29 || i4 == 900) {
                            enumC0120b2 = EnumC0120b.ALPHA;
                        } else if (i4 == 913) {
                            sb2.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                case 5:
                    if (i4 < 26) {
                        c = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        enumC0120b2 = i4 != 900 ? enumC0120b3 : EnumC0120b.ALPHA;
                        c = 0;
                        break;
                    }
                    enumC0120b2 = enumC0120b3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c = f284a[i4];
                    } else if (i4 == 29 || i4 == 900) {
                        enumC0120b2 = EnumC0120b.ALPHA;
                        c = 0;
                        break;
                    } else {
                        if (i4 == 913) {
                            sb2.append((char) iArr2[i3]);
                        }
                        c = 0;
                    }
                    enumC0120b2 = enumC0120b3;
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                sb2.append(c);
            }
        }
    }

    /* renamed from: f */
    private static int m41857f(int[] iArr, int i, StringBuilder sb2) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else {
                if (i4 != 900 && i4 != 901 && i4 != 928) {
                    switch (i4) {
                    }
                }
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb2.append(m41860c(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* renamed from: g */
    private static int m41856g(int[] iArr, int i, StringBuilder sb2) {
        int[] iArr2 = new int[(iArr[0] - i) << 1];
        int[] iArr3 = new int[(iArr[0] - i) << 1];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i4) {
                            }
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        m41858e(iArr2, iArr3, i2, sb2);
        return i;
    }
}
