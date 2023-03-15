package p239mb;

import com.google.zxing.AbstractC4393b;
import com.google.zxing.AbstractC4403h;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* renamed from: mb.j */
/* loaded from: classes2.dex */
public final class C7163j extends C7161h {

    /* renamed from: e */
    private C7155b f18987e;

    public C7163j(AbstractC4403h abstractC4403h) {
        super(abstractC4403h);
    }

    /* renamed from: i */
    private static int[][] m19019i(byte[] bArr, int i, int i2, int i3, int i4) {
        char c;
        int i5 = 8;
        int i6 = i4 - 8;
        int i7 = i3 - 8;
        char c2 = 2;
        boolean z = true;
        int i8 = 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i2, i);
        int i9 = 0;
        while (i9 < i2) {
            int i10 = i9 << 3;
            if (i10 > i6) {
                i10 = i6;
            }
            int i11 = i8;
            while (i11 < i) {
                int i12 = i11 << 3;
                if (i12 > i7) {
                    i12 = i7;
                }
                int i13 = (i10 * i3) + i12;
                int i14 = i8;
                int i15 = i14;
                int i16 = i15;
                int i17 = 255;
                while (i14 < i5) {
                    int i18 = i16;
                    int i19 = 0;
                    while (i19 < i5) {
                        int i20 = bArr[i13 + i19] & 255;
                        i15 += i20;
                        if (i20 < i17) {
                            i17 = i20;
                        }
                        if (i20 > i18) {
                            i18 = i20;
                        }
                        i19++;
                        i5 = 8;
                    }
                    if (i18 - i17 <= 24) {
                        i14++;
                        i13 += i3;
                        i16 = i18;
                        z = true;
                        i5 = 8;
                    }
                    while (true) {
                        i14++;
                        i13 += i3;
                        if (i14 < 8) {
                            int i21 = 0;
                            for (int i22 = 8; i21 < i22; i22 = 8) {
                                i15 += bArr[i13 + i21] & 255;
                                i21++;
                            }
                        }
                    }
                    i14++;
                    i13 += i3;
                    i16 = i18;
                    z = true;
                    i5 = 8;
                }
                boolean z2 = z;
                int i23 = i15 >> 6;
                if (i16 - i17 <= 24) {
                    i23 = i17 / 2;
                    if (i9 > 0 && i11 > 0) {
                        int i24 = i9 - 1;
                        int i25 = i11 - 1;
                        c = 2;
                        int i26 = ((iArr[i24][i11] + (iArr[i9][i25] * 2)) + iArr[i24][i25]) / 4;
                        if (i17 < i26) {
                            i23 = i26;
                        }
                        iArr[i9][i11] = i23;
                        i11++;
                        z = z2;
                        c2 = c;
                        i5 = 8;
                        i8 = 0;
                    }
                }
                c = 2;
                iArr[i9][i11] = i23;
                i11++;
                z = z2;
                c2 = c;
                i5 = 8;
                i8 = 0;
            }
            i9++;
            i5 = 8;
            i8 = 0;
        }
        return iArr;
    }

    /* renamed from: j */
    private static void m19018j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C7155b c7155b) {
        int i5 = i4 - 8;
        int i6 = i3 - 8;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 << 3;
            int i9 = i8 > i5 ? i5 : i8;
            int m19017k = m19017k(i7, i2 - 3);
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 << 3;
                int i12 = i11 > i6 ? i6 : i11;
                int m19017k2 = m19017k(i10, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[m19017k + i14];
                    i13 += iArr2[m19017k2 - 2] + iArr2[m19017k2 - 1] + iArr2[m19017k2] + iArr2[m19017k2 + 1] + iArr2[2 + m19017k2];
                }
                m19016l(bArr, i12, i9, i13 / 25, i3, c7155b);
            }
        }
    }

    /* renamed from: k */
    private static int m19017k(int i, int i2) {
        if (i < 2) {
            return 2;
        }
        return i > i2 ? i2 : i;
    }

    /* renamed from: l */
    private static void m19016l(byte[] bArr, int i, int i2, int i3, int i4, C7155b c7155b) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    c7155b.m19051n(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // com.google.zxing.AbstractC4393b
    /* renamed from: a */
    public AbstractC4393b mo19021a(AbstractC4403h abstractC4403h) {
        return new C7163j(abstractC4403h);
    }

    @Override // p239mb.C7161h, com.google.zxing.AbstractC4393b
    /* renamed from: b */
    public C7155b mo19020b() throws NotFoundException {
        C7155b c7155b = this.f18987e;
        if (c7155b != null) {
            return c7155b;
        }
        AbstractC4403h m27698e = m27698e();
        int m27661d = m27698e.m27661d();
        int m27662a = m27698e.m27662a();
        if (m27661d >= 40 && m27662a >= 40) {
            byte[] mo27653b = m27698e.mo27653b();
            int i = m27661d >> 3;
            if ((m27661d & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = m27662a >> 3;
            if ((m27662a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] m19019i = m19019i(mo27653b, i2, i4, m27661d, m27662a);
            C7155b c7155b2 = new C7155b(m27661d, m27662a);
            m19018j(mo27653b, i2, i4, m27661d, m27662a, m19019i, c7155b2);
            this.f18987e = c7155b2;
        } else {
            this.f18987e = super.mo19020b();
        }
        return this.f18987e;
    }
}
