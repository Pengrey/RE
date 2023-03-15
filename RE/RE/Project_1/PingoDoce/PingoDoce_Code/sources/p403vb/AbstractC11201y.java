package p403vb;

import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.ChecksumException;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.EnumC4410n;
import com.google.zxing.FormatException;
import com.google.zxing.InterfaceC4412p;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.Map;
import p239mb.C7154a;

/* renamed from: vb.y */
/* loaded from: classes2.dex */
public abstract class AbstractC11201y extends AbstractC11194r {

    /* renamed from: d */
    static final int[] f28764d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f28765e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[] f28766f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    static final int[][] f28767g;

    /* renamed from: h */
    static final int[][] f28768h;

    /* renamed from: a */
    private final StringBuilder f28769a = new StringBuilder(20);

    /* renamed from: b */
    private final C11200x f28770b = new C11200x();

    /* renamed from: c */
    private final C11189m f28771c = new C11189m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f28767g = iArr;
        int[][] iArr2 = new int[20];
        f28768h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f28767g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f28768h[i] = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m5765j(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m5756s(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m5764k(C7154a c7154a, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        AbstractC11194r.m5784g(c7154a, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float m5785f = AbstractC11194r.m5785f(iArr, iArr2[i3], 0.7f);
            if (m5785f < f) {
                i2 = i3;
                f = m5785f;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.m27700a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int[] m5760o(C7154a c7154a, int i, boolean z, int[] iArr) throws NotFoundException {
        return m5759p(c7154a, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: p */
    private static int[] m5759p(C7154a c7154a, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int m19072l = c7154a.m19072l();
        int m19073k = z ? c7154a.m19073k(i) : c7154a.m19074j(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = m19073k;
        while (m19073k < m19072l) {
            if (c7154a.m19076g(m19073k) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else if (AbstractC11194r.m5785f(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, m19073k};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            m19073k++;
        }
        throw NotFoundException.m27700a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int[] m5758q(C7154a c7154a) throws NotFoundException {
        int[] iArr = new int[f28764d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f28764d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m5759p(c7154a, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = c7154a.m19070n(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m5756s(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.m27702a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.m27702a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return mo5761n(i, c7154a, m5758q(c7154a), map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo5766i(String str) throws FormatException {
        return m5765j(str);
    }

    /* renamed from: l */
    int[] mo5763l(C7154a c7154a, int i) throws NotFoundException {
        return m5760o(c7154a, i, false, f28764d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo5762m(C7154a c7154a, int[] iArr, StringBuilder sb2) throws NotFoundException;

    /* renamed from: n */
    public C4409m mo5761n(int i, C7154a c7154a, int[] iArr, Map<EnumC4399d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int i2;
        String m5794c;
        InterfaceC4412p interfaceC4412p = map == null ? null : (InterfaceC4412p) map.get(EnumC4399d.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (interfaceC4412p != null) {
            interfaceC4412p.mo22809a(new C4411o((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb2 = this.f28769a;
        sb2.setLength(0);
        int mo5762m = mo5762m(c7154a, iArr, sb2);
        if (interfaceC4412p != null) {
            interfaceC4412p.mo22809a(new C4411o(mo5762m, i));
        }
        int[] mo5763l = mo5763l(c7154a, mo5762m);
        if (interfaceC4412p != null) {
            interfaceC4412p.mo22809a(new C4411o((mo5763l[0] + mo5763l[1]) / 2.0f, i));
        }
        int i3 = mo5763l[1];
        int i4 = (i3 - mo5763l[0]) + i3;
        if (i4 < c7154a.m19072l() && c7154a.m19070n(i3, i4, false)) {
            String sb3 = sb2.toString();
            if (sb3.length() >= 8) {
                if (mo5766i(sb3)) {
                    EnumC4392a mo5757r = mo5757r();
                    float f = i;
                    C4409m c4409m = new C4409m(sb3, null, new C4411o[]{new C4411o((iArr[1] + iArr[0]) / 2.0f, f), new C4411o((mo5763l[1] + mo5763l[0]) / 2.0f, f)}, mo5757r);
                    try {
                        C4409m m5767a = this.f28770b.m5767a(i, c7154a, mo5763l[1]);
                        c4409m.m27643h(EnumC4410n.UPC_EAN_EXTENSION, m5767a.m27645f());
                        c4409m.m27644g(m5767a.m27647d());
                        c4409m.m27650a(m5767a.m27646e());
                        i2 = m5767a.m27645f().length();
                    } catch (ReaderException unused) {
                        i2 = 0;
                    }
                    int[] iArr2 = map != null ? (int[]) map.get(EnumC4399d.ALLOWED_EAN_EXTENSIONS) : null;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                z = false;
                                break;
                            } else if (i2 == iArr2[i5]) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (!z) {
                            throw NotFoundException.m27700a();
                        }
                    }
                    if ((mo5757r == EnumC4392a.EAN_13 || mo5757r == EnumC4392a.UPC_A) && (m5794c = this.f28771c.m5794c(sb3)) != null) {
                        c4409m.m27643h(EnumC4410n.POSSIBLE_COUNTRY, m5794c);
                    }
                    return c4409m;
                }
                throw ChecksumException.m27703a();
            }
            throw FormatException.m27702a();
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: r */
    abstract EnumC4392a mo5757r();
}
