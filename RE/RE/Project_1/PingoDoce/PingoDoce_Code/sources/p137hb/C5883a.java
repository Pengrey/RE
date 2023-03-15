package p137hb;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.C4395a;
import com.google.zxing.common.reedsolomon.C4397c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import gb.C5630a;
import java.util.Arrays;
import p239mb.C7155b;
import p239mb.C7158e;

/* renamed from: hb.a */
/* loaded from: classes2.dex */
public final class C5883a {

    /* renamed from: b */
    private static final String[] f16311b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f16312c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f16313d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f16314e = {BuildConfig.VERSION_NAME, "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f16315f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C5630a f16316a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Decoder.java */
    /* renamed from: hb.a$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5884a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16317a;

        static {
            int[] iArr = new int[EnumC5885b.values().length];
            f16317a = iArr;
            try {
                iArr[EnumC5885b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16317a[EnumC5885b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16317a[EnumC5885b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16317a[EnumC5885b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16317a[EnumC5885b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Decoder.java */
    /* renamed from: hb.a$b */
    /* loaded from: classes2.dex */
    public enum EnumC5885b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m22830a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m22823h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m22829b(boolean[] zArr) throws FormatException {
        C4395a c4395a;
        int i = 8;
        if (this.f16316a.m23525d() <= 2) {
            i = 6;
            c4395a = C4395a.f11896j;
        } else if (this.f16316a.m23525d() <= 8) {
            c4395a = C4395a.f11900n;
        } else if (this.f16316a.m23525d() <= 22) {
            i = 10;
            c4395a = C4395a.f11895i;
        } else {
            i = 12;
            c4395a = C4395a.f11894h;
        }
        int m23526c = this.f16316a.m23526c();
        int length = zArr.length / i;
        if (length >= m23526c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m22822i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C4397c(c4395a).m27670a(iArr, length - m23526c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < m23526c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw FormatException.m27702a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[(m23526c * i) - i4];
                int i7 = 0;
                for (int i8 = 0; i8 < m23526c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        Arrays.fill(zArr2, i7, (i7 + i) - 1, i9 > 1);
                        i7 += i - 1;
                    } else {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            zArr2[i7] = ((1 << i10) & i9) != 0;
                            i10--;
                            i7 = i11;
                        }
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e) {
                throw FormatException.m27701b(e);
            }
        }
        throw FormatException.m27702a();
    }

    /* renamed from: d */
    private boolean[] m22827d(C7155b c7155b) {
        boolean m23524e = this.f16316a.m23524e();
        int m23525d = this.f16316a.m23525d();
        int i = (m23524e ? 11 : 14) + (m23525d << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m22821j(m23525d, m23524e)];
        int i2 = 2;
        if (m23524e) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < m23525d) {
            int i10 = ((m23525d - i8) << i2) + (m23524e ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = c7155b.m19059e(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    boolean z = m23524e;
                    zArr[(i10 * 2) + i9 + i14 + i15] = c7155b.m19059e(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = c7155b.m19059e(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = c7155b.m19059e(iArr[i20], iArr[i16]);
                    i15++;
                    m23525d = m23525d;
                    m23524e = z;
                    i2 = 2;
                }
                i13++;
                i2 = 2;
            }
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    /* renamed from: e */
    private static String m22826e(EnumC5885b enumC5885b, int i) {
        int i2 = C5884a.f16317a[enumC5885b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return f16315f[i];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return f16314e[i];
                }
                return f16313d[i];
            }
            return f16312c[i];
        }
        return f16311b[i];
    }

    /* renamed from: f */
    private static String m22825f(boolean[] zArr) {
        int length = zArr.length;
        EnumC5885b enumC5885b = EnumC5885b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        EnumC5885b enumC5885b2 = enumC5885b;
        int i = 0;
        while (i < length) {
            if (enumC5885b != EnumC5885b.BINARY) {
                int i2 = enumC5885b == EnumC5885b.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int m22822i = m22822i(zArr, i, i2);
                i += i2;
                String m22826e = m22826e(enumC5885b, m22822i);
                if (m22826e.startsWith("CTRL_")) {
                    enumC5885b2 = m22824g(m22826e.charAt(5));
                    if (m22826e.charAt(6) != 'L') {
                        enumC5885b2 = enumC5885b;
                        enumC5885b = enumC5885b2;
                    }
                } else {
                    sb2.append(m22826e);
                }
                enumC5885b = enumC5885b2;
            } else if (length - i < 5) {
                break;
            } else {
                int m22822i2 = m22822i(zArr, i, 5);
                i += 5;
                if (m22822i2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    m22822i2 = m22822i(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= m22822i2) {
                        break;
                    } else if (length - i < 8) {
                        i = length;
                        break;
                    } else {
                        sb2.append((char) m22822i(zArr, i, 8));
                        i += 8;
                        i3++;
                    }
                }
                enumC5885b = enumC5885b2;
            }
        }
        return sb2.toString();
    }

    /* renamed from: g */
    private static EnumC5885b m22824g(char c) {
        if (c != 'B') {
            if (c != 'D') {
                if (c != 'P') {
                    if (c != 'L') {
                        if (c != 'M') {
                            return EnumC5885b.UPPER;
                        }
                        return EnumC5885b.MIXED;
                    }
                    return EnumC5885b.LOWER;
                }
                return EnumC5885b.PUNCT;
            }
            return EnumC5885b.DIGIT;
        }
        return EnumC5885b.BINARY;
    }

    /* renamed from: h */
    private static byte m22823h(boolean[] zArr, int i) {
        int m22822i;
        int length = zArr.length - i;
        if (length >= 8) {
            m22822i = m22822i(zArr, i, 8);
        } else {
            m22822i = m22822i(zArr, i, length) << (8 - length);
        }
        return (byte) m22822i;
    }

    /* renamed from: i */
    private static int m22822i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: j */
    private static int m22821j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: c */
    public C7158e m22828c(C5630a c5630a) throws FormatException {
        this.f16316a = c5630a;
        boolean[] m22829b = m22829b(m22827d(c5630a.m19030a()));
        C7158e c7158e = new C7158e(m22830a(m22829b), m22825f(m22829b), null, null);
        c7158e.m19032l(m22829b.length);
        return c7158e;
    }
}
