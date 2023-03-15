package p138hc;

import android.graphics.Rect;

/* renamed from: hc.n */
/* loaded from: classes2.dex */
public class C5901n {

    /* renamed from: a */
    private byte[] f16344a;

    /* renamed from: b */
    private int f16345b;

    /* renamed from: c */
    private int f16346c;

    public C5901n(byte[] bArr, int i, int i2) {
        this.f16344a = bArr;
        this.f16345b = i;
        this.f16346c = i2;
    }

    /* renamed from: e */
    public static byte[] m22789e(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4] = bArr[i5];
            i4--;
        }
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m22788f(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i) + i5];
                i4--;
            }
        }
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m22787g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                bArr2[i3] = bArr[(i5 * i) + i4];
                i3++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C5901n m22793a(Rect rect, int i) {
        int width = rect.width() / i;
        int height = rect.height() / i;
        int i2 = rect.top;
        byte[] bArr = new byte[width * height];
        if (i == 1) {
            int i3 = (i2 * this.f16345b) + rect.left;
            for (int i4 = 0; i4 < height; i4++) {
                System.arraycopy(this.f16344a, i3, bArr, i4 * width, width);
                i3 += this.f16345b;
            }
        } else {
            int i5 = (i2 * this.f16345b) + rect.left;
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = i6 * width;
                int i8 = i5;
                for (int i9 = 0; i9 < width; i9++) {
                    bArr[i7] = this.f16344a[i8];
                    i8 += i;
                    i7++;
                }
                i5 += this.f16345b * i;
            }
        }
        return new C5901n(bArr, width, height);
    }

    /* renamed from: b */
    public byte[] m22792b() {
        return this.f16344a;
    }

    /* renamed from: c */
    public int m22791c() {
        return this.f16346c;
    }

    /* renamed from: d */
    public int m22790d() {
        return this.f16345b;
    }

    /* renamed from: h */
    public C5901n m22786h(int i) {
        if (i != 90) {
            if (i != 180) {
                return i != 270 ? this : new C5901n(m22788f(this.f16344a, this.f16345b, this.f16346c), this.f16346c, this.f16345b);
            }
            return new C5901n(m22789e(this.f16344a, this.f16345b, this.f16346c), this.f16345b, this.f16346c);
        }
        return new C5901n(m22787g(this.f16344a, this.f16345b, this.f16346c), this.f16346c, this.f16345b);
    }
}
