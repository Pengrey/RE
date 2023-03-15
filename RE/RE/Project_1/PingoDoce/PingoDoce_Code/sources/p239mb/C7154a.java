package p239mb;

import java.util.Arrays;

/* renamed from: mb.a */
/* loaded from: classes2.dex */
public final class C7154a implements Cloneable {

    /* renamed from: w */
    private int[] f18964w;

    /* renamed from: x */
    private int f18965x;

    public C7154a() {
        this.f18965x = 0;
        this.f18964w = new int[1];
    }

    /* renamed from: f */
    private void m19077f(int i) {
        if (i > (this.f18964w.length << 5)) {
            int[] m19069o = m19069o(i);
            int[] iArr = this.f18964w;
            System.arraycopy(iArr, 0, m19069o, 0, iArr.length);
            this.f18964w = m19069o;
        }
    }

    /* renamed from: o */
    private static int[] m19069o(int i) {
        return new int[(i + 31) / 32];
    }

    /* renamed from: a */
    public void m19082a(boolean z) {
        m19077f(this.f18965x + 1);
        if (z) {
            int[] iArr = this.f18964w;
            int i = this.f18965x;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f18965x++;
    }

    /* renamed from: b */
    public void m19081b(C7154a c7154a) {
        int i = c7154a.f18965x;
        m19077f(this.f18965x + i);
        for (int i2 = 0; i2 < i; i2++) {
            m19082a(c7154a.m19076g(i2));
        }
    }

    /* renamed from: c */
    public void m19080c(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            m19077f(this.f18965x + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                m19082a(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    /* renamed from: d */
    public void m19079d() {
        int length = this.f18964w.length;
        for (int i = 0; i < length; i++) {
            this.f18964w[i] = 0;
        }
    }

    /* renamed from: e */
    public C7154a clone() {
        return new C7154a((int[]) this.f18964w.clone(), this.f18965x);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7154a) {
            C7154a c7154a = (C7154a) obj;
            return this.f18965x == c7154a.f18965x && Arrays.equals(this.f18964w, c7154a.f18964w);
        }
        return false;
    }

    /* renamed from: g */
    public boolean m19076g(int i) {
        return ((1 << (i & 31)) & this.f18964w[i / 32]) != 0;
    }

    public int hashCode() {
        return (this.f18965x * 31) + Arrays.hashCode(this.f18964w);
    }

    /* renamed from: i */
    public int[] m19075i() {
        return this.f18964w;
    }

    /* renamed from: j */
    public int m19074j(int i) {
        int i2 = this.f18965x;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.f18964w[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f18964w;
            if (i3 == iArr.length) {
                return this.f18965x;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f18965x;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: k */
    public int m19073k(int i) {
        int i2 = this.f18965x;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.f18964w[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f18964w;
            if (i3 == iArr.length) {
                return this.f18965x;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f18965x;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: l */
    public int m19072l() {
        return this.f18965x;
    }

    /* renamed from: m */
    public int m19071m() {
        return (this.f18965x + 7) / 8;
    }

    /* renamed from: n */
    public boolean m19070n(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f18965x) {
            throw new IllegalArgumentException();
        }
        if (i2 == i) {
            return true;
        }
        int i3 = i2 - 1;
        int i4 = i / 32;
        int i5 = i3 / 32;
        int i6 = i4;
        while (i6 <= i5) {
            int i7 = (2 << (i6 >= i5 ? 31 & i3 : 31)) - (1 << (i6 > i4 ? 0 : i & 31));
            int i8 = this.f18964w[i6] & i7;
            if (!z) {
                i7 = 0;
            }
            if (i8 != i7) {
                return false;
            }
            i6++;
        }
        return true;
    }

    /* renamed from: p */
    public void m19068p() {
        int[] iArr = new int[this.f18964w.length];
        int i = (this.f18965x - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f18964w[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f18965x;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f18964w = iArr;
    }

    /* renamed from: q */
    public void m19067q(int i) {
        int[] iArr = this.f18964w;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: r */
    public void m19066r(int i, int i2) {
        this.f18964w[i / 32] = i2;
    }

    /* renamed from: s */
    public void m19065s(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (m19076g(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public String toString() {
        int i = this.f18965x;
        StringBuilder sb2 = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f18965x; i2++) {
            if ((i2 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(m19076g(i2) ? 'X' : '.');
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public void m19064u(C7154a c7154a) {
        if (this.f18965x != c7154a.f18965x) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f18964w;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ c7154a.f18964w[i];
            i++;
        }
    }

    public C7154a(int i) {
        this.f18965x = i;
        this.f18964w = m19069o(i);
    }

    C7154a(int[] iArr, int i) {
        this.f18964w = iArr;
        this.f18965x = i;
    }
}
