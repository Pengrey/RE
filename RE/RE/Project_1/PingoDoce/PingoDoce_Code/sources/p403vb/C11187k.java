package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* renamed from: vb.k */
/* loaded from: classes2.dex */
public final class C11187k extends AbstractC11201y {

    /* renamed from: i */
    private final int[] f28738i = new int[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p403vb.AbstractC11201y
    /* renamed from: m */
    public int mo5762m(C7154a c7154a, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f28738i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m19072l = c7154a.m19072l();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < m19072l; i2++) {
            sb2.append((char) (AbstractC11201y.m5764k(c7154a, iArr2, i, AbstractC11201y.f28767g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = AbstractC11201y.m5760o(c7154a, i, true, AbstractC11201y.f28765e)[1];
        for (int i5 = 0; i5 < 4 && i4 < m19072l; i5++) {
            sb2.append((char) (AbstractC11201y.m5764k(c7154a, iArr2, i4, AbstractC11201y.f28767g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // p403vb.AbstractC11201y
    /* renamed from: r */
    EnumC4392a mo5757r() {
        return EnumC4392a.EAN_8;
    }
}
