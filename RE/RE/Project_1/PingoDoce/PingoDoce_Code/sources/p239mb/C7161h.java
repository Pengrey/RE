package p239mb;

import com.google.zxing.AbstractC4393b;
import com.google.zxing.AbstractC4403h;
import com.google.zxing.NotFoundException;

/* renamed from: mb.h */
/* loaded from: classes2.dex */
public class C7161h extends AbstractC4393b {

    /* renamed from: d */
    private static final byte[] f18983d = new byte[0];

    /* renamed from: b */
    private byte[] f18984b;

    /* renamed from: c */
    private final int[] f18985c;

    public C7161h(AbstractC4403h abstractC4403h) {
        super(abstractC4403h);
        this.f18984b = f18983d;
        this.f18985c = new int[32];
    }

    /* renamed from: g */
    private static int m19027g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = -1;
            int i13 = i11;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i12) {
                    i13 = i11;
                    i12 = i15;
                }
                i11--;
            }
            return i13 << 3;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: h */
    private void m19026h(int i) {
        if (this.f18984b.length < i) {
            this.f18984b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f18985c[i2] = 0;
        }
    }

    @Override // com.google.zxing.AbstractC4393b
    /* renamed from: b */
    public C7155b mo19020b() throws NotFoundException {
        AbstractC4403h m27698e = m27698e();
        int m27661d = m27698e.m27661d();
        int m27662a = m27698e.m27662a();
        C7155b c7155b = new C7155b(m27661d, m27662a);
        m19026h(m27661d);
        int[] iArr = this.f18985c;
        for (int i = 1; i < 5; i++) {
            byte[] mo27652c = m27698e.mo27652c((m27662a * i) / 5, this.f18984b);
            int i2 = (m27661d << 2) / 5;
            for (int i3 = m27661d / 5; i3 < i2; i3++) {
                int i4 = (mo27652c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int m19027g = m19027g(iArr);
        byte[] mo27653b = m27698e.mo27653b();
        for (int i5 = 0; i5 < m27662a; i5++) {
            int i6 = i5 * m27661d;
            for (int i7 = 0; i7 < m27661d; i7++) {
                if ((mo27653b[i6 + i7] & 255) < m19027g) {
                    c7155b.m19051n(i7, i5);
                }
            }
        }
        return c7155b;
    }

    @Override // com.google.zxing.AbstractC4393b
    /* renamed from: c */
    public C7154a mo19028c(int i, C7154a c7154a) throws NotFoundException {
        AbstractC4403h m27698e = m27698e();
        int m27661d = m27698e.m27661d();
        if (c7154a != null && c7154a.m19072l() >= m27661d) {
            c7154a.m19079d();
        } else {
            c7154a = new C7154a(m27661d);
        }
        m19026h(m27661d);
        byte[] mo27652c = m27698e.mo27652c(i, this.f18984b);
        int[] iArr = this.f18985c;
        for (int i2 = 0; i2 < m27661d; i2++) {
            int i3 = (mo27652c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int m19027g = m19027g(iArr);
        if (m27661d < 3) {
            for (int i4 = 0; i4 < m27661d; i4++) {
                if ((mo27652c[i4] & 255) < m19027g) {
                    c7154a.m19067q(i4);
                }
            }
        } else {
            int i5 = mo27652c[1] & 255;
            int i6 = 1;
            int i7 = mo27652c[0] & 255;
            int i8 = i5;
            while (i6 < m27661d - 1) {
                int i9 = i6 + 1;
                int i10 = mo27652c[i9] & 255;
                if ((((i8 << 2) - i7) - i10) / 2 < m19027g) {
                    c7154a.m19067q(i6);
                }
                i7 = i8;
                i6 = i9;
                i8 = i10;
            }
        }
        return c7154a;
    }
}
