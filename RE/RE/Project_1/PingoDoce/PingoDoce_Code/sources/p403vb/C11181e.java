package p403vb;

import com.google.crypto.tink.shaded.protobuf.Reader;
import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.ChecksumException;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeConstants;
import p239mb.C7154a;

/* renamed from: vb.e */
/* loaded from: classes2.dex */
public final class C11181e extends AbstractC11194r {

    /* renamed from: e */
    static final int[] f28726e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, DateTimeConstants.HOURS_PER_WEEK, 162, 138, 42};

    /* renamed from: a */
    private final boolean f28727a;

    /* renamed from: b */
    private final boolean f28728b;

    /* renamed from: c */
    private final StringBuilder f28729c;

    /* renamed from: d */
    private final int[] f28730d;

    public C11181e() {
        this(false);
    }

    /* renamed from: i */
    private static String m5812i(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt != '+' && charAt != '$' && charAt != '%' && charAt != '/') {
                sb2.append(charAt);
            } else {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 != 'Z') {
                                    throw FormatException.m27702a();
                                } else {
                                    c = ':';
                                    sb2.append(c);
                                }
                            }
                            c = 0;
                            sb2.append(c);
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.m27702a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 < 'P' || charAt2 > 'T') {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c = '@';
                            } else if (charAt2 == 'W') {
                                c = '`';
                            } else if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                throw FormatException.m27702a();
                            } else {
                                c = 127;
                            }
                            sb2.append(c);
                        }
                        c = 0;
                        sb2.append(c);
                    } else {
                        i = charAt2 + '+';
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.m27702a();
                } else {
                    i = charAt2 - '@';
                }
                c = (char) i;
                sb2.append(c);
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: j */
    private static int[] m5811j(C7154a c7154a, int[] iArr) throws NotFoundException {
        int m19072l = c7154a.m19072l();
        int m19074j = c7154a.m19074j(0);
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
                } else if (m5809l(iArr) == 148 && c7154a.m19070n(Math.max(0, i2 - ((m19074j - i2) / 2)), i2, false)) {
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

    /* renamed from: k */
    private static char m5810k(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f28726e;
            if (i2 >= iArr.length) {
                if (i == 148) {
                    return '*';
                }
                throw NotFoundException.m27700a();
            } else if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
            } else {
                i2++;
            }
        }
    }

    /* renamed from: l */
    private static int m5809l(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Reader.READ_DONE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] m5811j;
        String sb2;
        int[] iArr = this.f28730d;
        Arrays.fill(iArr, 0);
        StringBuilder sb3 = this.f28729c;
        sb3.setLength(0);
        int m19074j = c7154a.m19074j(m5811j(c7154a, iArr)[1]);
        int m19072l = c7154a.m19072l();
        while (true) {
            AbstractC11194r.m5784g(c7154a, m19074j, iArr);
            int m5809l = m5809l(iArr);
            if (m5809l >= 0) {
                char m5810k = m5810k(m5809l);
                sb3.append(m5810k);
                int i2 = m19074j;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int m19074j2 = c7154a.m19074j(i2);
                if (m5810k == '*') {
                    sb3.setLength(sb3.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = (m19074j2 - m19074j) - i4;
                    if (m19074j2 != m19072l && (i6 << 1) < i4) {
                        throw NotFoundException.m27700a();
                    }
                    if (this.f28727a) {
                        int length = sb3.length() - 1;
                        int i7 = 0;
                        for (int i8 = 0; i8 < length; i8++) {
                            i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f28729c.charAt(i8));
                        }
                        if (sb3.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7 % 43)) {
                            sb3.setLength(length);
                        } else {
                            throw ChecksumException.m27703a();
                        }
                    }
                    if (sb3.length() != 0) {
                        if (this.f28728b) {
                            sb2 = m5812i(sb3);
                        } else {
                            sb2 = sb3.toString();
                        }
                        float f = i;
                        return new C4409m(sb2, null, new C4411o[]{new C4411o((m5811j[1] + m5811j[0]) / 2.0f, f), new C4411o(m19074j + (i4 / 2.0f), f)}, EnumC4392a.CODE_39);
                    }
                    throw NotFoundException.m27700a();
                }
                m19074j = m19074j2;
            } else {
                throw NotFoundException.m27700a();
            }
        }
    }

    public C11181e(boolean z) {
        this(z, false);
    }

    public C11181e(boolean z, boolean z2) {
        this.f28727a = z;
        this.f28728b = z2;
        this.f28729c = new StringBuilder(20);
        this.f28730d = new int[9];
    }
}
