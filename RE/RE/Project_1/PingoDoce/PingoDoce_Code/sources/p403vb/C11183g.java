package p403vb;

import androidx.constraintlayout.widget.C0868i;
import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.ChecksumException;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import p239mb.C7154a;

/* renamed from: vb.g */
/* loaded from: classes2.dex */
public final class C11183g extends AbstractC11194r {

    /* renamed from: c */
    private static final char[] f28731c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f28732d;

    /* renamed from: e */
    static final int f28733e;

    /* renamed from: a */
    private final StringBuilder f28734a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f28735b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f28732d = iArr;
        f28733e = iArr[47];
    }

    /* renamed from: i */
    private static void m5806i(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        m5805j(charSequence, length - 2, 20);
        m5805j(charSequence, length - 1, 15);
    }

    /* renamed from: j */
    private static void m5805j(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f28731c[i3 % 47]) {
            throw ChecksumException.m27703a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: k */
    private static String m5804k(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'a' || charAt > 'd') {
                sb2.append(charAt);
            } else if (i2 < length - 1) {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                switch (charAt) {
                    case C0868i.f2988x0 /* 97 */:
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 - '@';
                            c = (char) i;
                            break;
                        } else {
                            throw FormatException.m27702a();
                        }
                        break;
                    case C0868i.f2993y0 /* 98 */:
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i = charAt2 + 16;
                        } else if (charAt2 < 'P' || charAt2 > 'T') {
                            if (charAt2 != 'U') {
                                if (charAt2 != 'V') {
                                    if (charAt2 != 'W') {
                                        if (charAt2 >= 'X' && charAt2 <= 'Z') {
                                            c = 127;
                                            break;
                                        } else {
                                            throw FormatException.m27702a();
                                        }
                                    } else {
                                        c = '`';
                                        break;
                                    }
                                } else {
                                    c = '@';
                                    break;
                                }
                            }
                            c = 0;
                            break;
                        } else {
                            i = charAt2 + '+';
                        }
                        c = (char) i;
                        break;
                    case C0868i.f2998z0 /* 99 */:
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i = charAt2 - ' ';
                            c = (char) i;
                            break;
                        } else if (charAt2 == 'Z') {
                            c = ':';
                            break;
                        } else {
                            throw FormatException.m27702a();
                        }
                    case C0868i.f2738A0 /* 100 */:
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 + ' ';
                            c = (char) i;
                            break;
                        } else {
                            throw FormatException.m27702a();
                        }
                    default:
                        c = 0;
                        break;
                }
                sb2.append(c);
            } else {
                throw FormatException.m27702a();
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: l */
    private int[] m5803l(C7154a c7154a) throws NotFoundException {
        int m19072l = c7154a.m19072l();
        int m19074j = c7154a.m19074j(0);
        Arrays.fill(this.f28735b, 0);
        int[] iArr = this.f28735b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = m19074j;
        while (m19074j < m19072l) {
            if (c7154a.m19076g(m19074j) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i != length - 1) {
                    i++;
                } else if (m5801n(iArr) == f28733e) {
                    return new int[]{i2, m19074j};
                } else {
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            m19074j++;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: m */
    private static char m5802m(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f28732d;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return f28731c[i2];
                }
                i2++;
            } else {
                throw NotFoundException.m27700a();
            }
        }
    }

    /* renamed from: n */
    private static int m5801n(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] m5803l;
        int m19074j = c7154a.m19074j(m5803l(c7154a)[1]);
        int m19072l = c7154a.m19072l();
        int[] iArr = this.f28735b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f28734a;
        sb2.setLength(0);
        while (true) {
            AbstractC11194r.m5784g(c7154a, m19074j, iArr);
            int m5801n = m5801n(iArr);
            if (m5801n >= 0) {
                char m5802m = m5802m(m5801n);
                sb2.append(m5802m);
                int i2 = m19074j;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int m19074j2 = c7154a.m19074j(i2);
                if (m5802m == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (m19074j2 != m19072l && c7154a.m19076g(m19074j2)) {
                        if (sb2.length() >= 2) {
                            m5806i(sb2);
                            sb2.setLength(sb2.length() - 2);
                            float f = i;
                            return new C4409m(m5804k(sb2), null, new C4411o[]{new C4411o((m5803l[1] + m5803l[0]) / 2.0f, f), new C4411o(m19074j + (i4 / 2.0f), f)}, EnumC4392a.CODE_93);
                        }
                        throw NotFoundException.m27700a();
                    }
                    throw NotFoundException.m27700a();
                }
                m19074j = m19074j2;
            } else {
                throw NotFoundException.m27700a();
            }
        }
    }
}
