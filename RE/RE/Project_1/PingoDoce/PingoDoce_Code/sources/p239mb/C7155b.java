package p239mb;

import java.util.Arrays;

/* renamed from: mb.b */
/* loaded from: classes2.dex */
public final class C7155b implements Cloneable {

    /* renamed from: w */
    private final int f18966w;

    /* renamed from: x */
    private final int f18967x;

    /* renamed from: y */
    private final int f18968y;

    /* renamed from: z */
    private final int[] f18969z;

    public C7155b(int i) {
        this(i, i);
    }

    /* renamed from: a */
    private String m19063a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f18967x * (this.f18966w + 1));
        for (int i = 0; i < this.f18967x; i++) {
            for (int i2 = 0; i2 < this.f18966w; i2++) {
                sb2.append(m19059e(i2, i) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public void m19062b() {
        int length = this.f18969z.length;
        for (int i = 0; i < length; i++) {
            this.f18969z[i] = 0;
        }
    }

    /* renamed from: c */
    public C7155b clone() {
        return new C7155b(this.f18966w, this.f18967x, this.f18968y, (int[]) this.f18969z.clone());
    }

    /* renamed from: d */
    public void m19060d(int i, int i2) {
        int i3 = (i2 * this.f18968y) + (i / 32);
        int[] iArr = this.f18969z;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: e */
    public boolean m19059e(int i, int i2) {
        return ((this.f18969z[(i2 * this.f18968y) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7155b) {
            C7155b c7155b = (C7155b) obj;
            return this.f18966w == c7155b.f18966w && this.f18967x == c7155b.f18967x && this.f18968y == c7155b.f18968y && Arrays.equals(this.f18969z, c7155b.f18969z);
        }
        return false;
    }

    /* renamed from: f */
    public int[] m19058f() {
        int length = this.f18969z.length - 1;
        while (length >= 0 && this.f18969z[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f18968y;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f18969z[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: g */
    public int[] m19057g() {
        int i = this.f18966w;
        int i2 = this.f18967x;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f18967x; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f18968y;
                if (i6 < i7) {
                    int i8 = this.f18969z[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int hashCode() {
        int i = this.f18966w;
        return (((((((i * 31) + i) * 31) + this.f18967x) * 31) + this.f18968y) * 31) + Arrays.hashCode(this.f18969z);
    }

    /* renamed from: i */
    public int m19056i() {
        return this.f18967x;
    }

    /* renamed from: j */
    public C7154a m19055j(int i, C7154a c7154a) {
        if (c7154a != null && c7154a.m19072l() >= this.f18966w) {
            c7154a.m19079d();
        } else {
            c7154a = new C7154a(this.f18966w);
        }
        int i2 = i * this.f18968y;
        for (int i3 = 0; i3 < this.f18968y; i3++) {
            c7154a.m19066r(i3 << 5, this.f18969z[i2 + i3]);
        }
        return c7154a;
    }

    /* renamed from: k */
    public int[] m19054k() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f18969z;
            if (i >= iArr.length || iArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f18968y;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: l */
    public int m19053l() {
        return this.f18966w;
    }

    /* renamed from: m */
    public void m19052m() {
        int m19053l = m19053l();
        int m19056i = m19056i();
        C7154a c7154a = new C7154a(m19053l);
        C7154a c7154a2 = new C7154a(m19053l);
        for (int i = 0; i < (m19056i + 1) / 2; i++) {
            c7154a = m19055j(i, c7154a);
            int i2 = (m19056i - 1) - i;
            c7154a2 = m19055j(i2, c7154a2);
            c7154a.m19068p();
            c7154a2.m19068p();
            m19049p(i, c7154a2);
            m19049p(i2, c7154a);
        }
    }

    /* renamed from: n */
    public void m19051n(int i, int i2) {
        int i3 = (i2 * this.f18968y) + (i / 32);
        int[] iArr = this.f18969z;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: o */
    public void m19050o(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 > 0 && i3 > 0) {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f18967x || i5 > this.f18966w) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f18968y * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f18969z;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Height and width must be at least 1");
    }

    /* renamed from: p */
    public void m19049p(int i, C7154a c7154a) {
        int[] m19075i = c7154a.m19075i();
        int[] iArr = this.f18969z;
        int i2 = this.f18968y;
        System.arraycopy(m19075i, 0, iArr, i * i2, i2);
    }

    /* renamed from: q */
    public String m19048q(String str, String str2) {
        return m19063a(str, str2, "\n");
    }

    public String toString() {
        return m19048q("X ", "  ");
    }

    public C7155b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f18966w = i;
            this.f18967x = i2;
            int i3 = (i + 31) / 32;
            this.f18968y = i3;
            this.f18969z = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private C7155b(int i, int i2, int i3, int[] iArr) {
        this.f18966w = i;
        this.f18967x = i2;
        this.f18968y = i3;
        this.f18969z = iArr;
    }
}
