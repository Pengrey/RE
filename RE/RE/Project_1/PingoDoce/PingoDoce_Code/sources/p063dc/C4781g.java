package p063dc;

import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p239mb.EnumC7157d;

/* renamed from: dc.g */
/* loaded from: classes2.dex */
final class C4781g {

    /* renamed from: c */
    private static final byte[] f13098c;

    /* renamed from: a */
    private static final byte[] f13096a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f13097b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d */
    private static final byte[] f13099d = new byte[128];

    /* renamed from: e */
    private static final Charset f13100e = StandardCharsets.ISO_8859_1;

    /* compiled from: PDF417HighLevelEncoder.java */
    /* renamed from: dc.g$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C4782a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13101a;

        static {
            int[] iArr = new int[EnumC4777c.values().length];
            f13101a = iArr;
            try {
                iArr[EnumC4777c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13101a[EnumC4777c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13101a[EnumC4777c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f13098c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f13096a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f13098c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f13099d, (byte) -1);
        while (true) {
            byte[] bArr3 = f13097b;
            if (i >= bArr3.length) {
                return;
            }
            byte b2 = bArr3[i];
            if (b2 > 0) {
                f13099d[b2] = (byte) i;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r1 - r6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m26627a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws com.google.zxing.WriterException {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L57
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L25
            boolean r2 = m26617k(r2)
            if (r2 == 0) goto L25
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L25
            char r2 = r5.charAt(r2)
            goto L10
        L25:
            if (r3 < r4) goto L29
            int r1 = r1 - r6
            return r1
        L29:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L36
            int r1 = r1 + 1
            goto L9
        L36:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L57:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p063dc.C4781g.m26627a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    /* renamed from: b */
    private static int m26626b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m26617k(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        return (r1 - r7) - r3;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m26625c(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L37
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = m26617k(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 > 0) goto L5
            char r2 = r6.charAt(r1)
            boolean r2 = m26614n(r2)
            if (r2 == 0) goto L37
            int r1 = r1 + 1
            goto L5
        L37:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p063dc.C4781g.m26625c(java.lang.CharSequence, int):int");
    }

    /* renamed from: d */
    private static void m26624d(byte[] bArr, int i, int i2, int i3, StringBuilder sb2) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb2.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & 255);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb2.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb2.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m26623e(String str, EnumC4777c enumC4777c, Charset charset) throws WriterException {
        EnumC7157d characterSetECIByName;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f13100e;
        } else if (!f13100e.equals(charset) && (characterSetECIByName = EnumC7157d.getCharacterSetECIByName(charset.name())) != null) {
            m26620h(characterSetECIByName.getValue(), sb2);
        }
        int length = str.length();
        int i = C4782a.f13101a[enumC4777c.ordinal()];
        if (i == 1) {
            m26621g(str, 0, length, sb2, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            m26624d(bytes, 0, bytes.length, 1, sb2);
        } else if (i != 3) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int m26626b = m26626b(str, i2);
                if (m26626b >= 13) {
                    sb2.append((char) 902);
                    m26622f(str, i2, m26626b, sb2);
                    i2 += m26626b;
                    i3 = 0;
                    i4 = 2;
                } else {
                    int m26625c = m26625c(str, i2);
                    if (m26625c < 5 && m26626b != length) {
                        int m26627a = m26627a(str, i2, charset);
                        if (m26627a == 0) {
                            m26627a = 1;
                        }
                        int i5 = m26627a + i2;
                        byte[] bytes2 = str.substring(i2, i5).getBytes(charset);
                        if (bytes2.length == 1 && i4 == 0) {
                            m26624d(bytes2, 0, 1, 0, sb2);
                        } else {
                            m26624d(bytes2, 0, bytes2.length, i4, sb2);
                            i4 = 1;
                            i3 = 0;
                        }
                        i2 = i5;
                    } else {
                        if (i4 != 0) {
                            sb2.append((char) 900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i3 = m26621g(str, i2, m26625c, sb2, i3);
                        i2 += m26625c;
                    }
                }
            }
        } else {
            sb2.append((char) 902);
            m26622f(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static void m26622f(String str, int i, int i2, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb3.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb4 = new StringBuilder("1");
            int i4 = i + i3;
            sb4.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6 A[EDGE_INSN: B:76:0x00f6->B:55:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0011 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m26621g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p063dc.C4781g.m26621g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: h */
    private static void m26620h(int i, StringBuilder sb2) throws WriterException {
        if (i >= 0 && i < 900) {
            sb2.append((char) 927);
            sb2.append((char) i);
        } else if (i < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i / 900) - 1));
            sb2.append((char) (i % 900));
        } else if (i < 811800) {
            sb2.append((char) 925);
            sb2.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: i */
    private static boolean m26619i(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m26618j(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m26617k(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: l */
    private static boolean m26616l(char c) {
        return f13098c[c] != -1;
    }

    /* renamed from: m */
    private static boolean m26615m(char c) {
        return f13099d[c] != -1;
    }

    /* renamed from: n */
    private static boolean m26614n(char c) {
        if (c == '\t' || c == '\n' || c == '\r') {
            return true;
        }
        return c >= ' ' && c <= '~';
    }
}
