package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* renamed from: vb.i */
/* loaded from: classes2.dex */
public final class C11185i extends AbstractC11201y {

    /* renamed from: j */
    static final int[] f28736j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f28737i = new int[4];

    /* renamed from: t */
    private static void m5797t(StringBuilder sb2, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f28736j[i2]) {
                sb2.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.m27700a();
    }

    @Override // p403vb.AbstractC11201y
    /* renamed from: m */
    protected int mo5762m(C7154a c7154a, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f28737i;
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
        m5797t(sb2, i2);
        int i5 = AbstractC11201y.m5760o(c7154a, i, true, AbstractC11201y.f28765e)[1];
        for (int i6 = 0; i6 < 6 && i5 < m19072l; i6++) {
            sb2.append((char) (AbstractC11201y.m5764k(c7154a, iArr2, i5, AbstractC11201y.f28767g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // p403vb.AbstractC11201y
    /* renamed from: r */
    EnumC4392a mo5757r() {
        return EnumC4392a.EAN_13;
    }
}
