package p239mb;

import com.google.zxing.NotFoundException;

/* renamed from: mb.f */
/* loaded from: classes2.dex */
public final class C7159f extends AbstractC7162i {
    @Override // p239mb.AbstractC7162i
    /* renamed from: c */
    public C7155b mo19023c(C7155b c7155b, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        return mo19022d(c7155b, i, i2, C7164k.m19014b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // p239mb.AbstractC7162i
    /* renamed from: d */
    public C7155b mo19022d(C7155b c7155b, int i, int i2, C7164k c7164k) throws NotFoundException {
        if (i > 0 && i2 > 0) {
            C7155b c7155b2 = new C7155b(i, i2);
            int i3 = i * 2;
            float[] fArr = new float[i3];
            for (int i4 = 0; i4 < i2; i4++) {
                float f = i4 + 0.5f;
                for (int i5 = 0; i5 < i3; i5 += 2) {
                    fArr[i5] = (i5 / 2) + 0.5f;
                    fArr[i5 + 1] = f;
                }
                c7164k.m19010f(fArr);
                AbstractC7162i.m19025a(c7155b, fArr);
                for (int i6 = 0; i6 < i3; i6 += 2) {
                    try {
                        if (c7155b.m19059e((int) fArr[i6], (int) fArr[i6 + 1])) {
                            c7155b2.m19051n(i6 / 2, i4);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw NotFoundException.m27700a();
                    }
                }
            }
            return c7155b2;
        }
        throw NotFoundException.m27700a();
    }
}
