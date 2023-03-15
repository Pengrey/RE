package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* renamed from: vb.a0 */
/* loaded from: classes2.dex */
public final class C11175a0 extends AbstractC11201y {

    /* renamed from: j */
    private static final int[] f28718j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    static final int[][] f28719k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    private final int[] f28720i = new int[4];

    /* renamed from: t */
    public static String m5818t(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    /* renamed from: u */
    private static void m5817u(StringBuilder sb2, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f28719k[i2][i3]) {
                    sb2.insert(0, (char) (i2 + 48));
                    sb2.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.m27700a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p403vb.AbstractC11201y
    /* renamed from: i */
    public boolean mo5766i(String str) throws FormatException {
        return super.mo5766i(m5818t(str));
    }

    @Override // p403vb.AbstractC11201y
    /* renamed from: l */
    protected int[] mo5763l(C7154a c7154a, int i) throws NotFoundException {
        return AbstractC11201y.m5760o(c7154a, i, true, f28718j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p403vb.AbstractC11201y
    /* renamed from: m */
    public int mo5762m(C7154a c7154a, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f28720i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m19072l = c7154a.m19072l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m19072l; i3++) {
            int m5764k = AbstractC11201y.m5764k(c7154a, iArr2, i, AbstractC11201y.f28768h);
            sb2.append((char) ((m5764k % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m5764k >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m5817u(sb2, i2);
        return i;
    }

    @Override // p403vb.AbstractC11201y
    /* renamed from: r */
    EnumC4392a mo5757r() {
        return EnumC4392a.UPC_E;
    }
}
