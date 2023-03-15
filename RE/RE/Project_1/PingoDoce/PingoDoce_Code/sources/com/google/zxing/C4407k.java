package com.google.zxing;

/* renamed from: com.google.zxing.k */
/* loaded from: classes2.dex */
public final class C4407k extends AbstractC4403h {

    /* renamed from: c */
    private final byte[] f11923c;

    /* renamed from: d */
    private final int f11924d;

    /* renamed from: e */
    private final int f11925e;

    /* renamed from: f */
    private final int f11926f;

    /* renamed from: g */
    private final int f11927g;

    public C4407k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 <= i && i4 + i6 <= i2) {
            this.f11923c = bArr;
            this.f11924d = i;
            this.f11925e = i2;
            this.f11926f = i3;
            this.f11927g = i4;
            if (z) {
                m27651h(i5, i6);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    /* renamed from: h */
    private void m27651h(int i, int i2) {
        byte[] bArr = this.f11923c;
        int i3 = (this.f11927g * this.f11924d) + this.f11926f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f11924d;
        }
    }

    @Override // com.google.zxing.AbstractC4403h
    /* renamed from: b */
    public byte[] mo27653b() {
        int m27661d = m27661d();
        int m27662a = m27662a();
        int i = this.f11924d;
        if (m27661d == i && m27662a == this.f11925e) {
            return this.f11923c;
        }
        int i2 = m27661d * m27662a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f11927g * i) + this.f11926f;
        if (m27661d == i) {
            System.arraycopy(this.f11923c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < m27662a; i4++) {
            System.arraycopy(this.f11923c, i3, bArr, i4 * m27661d, m27661d);
            i3 += this.f11924d;
        }
        return bArr;
    }

    @Override // com.google.zxing.AbstractC4403h
    /* renamed from: c */
    public byte[] mo27652c(int i, byte[] bArr) {
        if (i >= 0 && i < m27662a()) {
            int m27661d = m27661d();
            if (bArr == null || bArr.length < m27661d) {
                bArr = new byte[m27661d];
            }
            System.arraycopy(this.f11923c, ((i + this.f11927g) * this.f11924d) + this.f11926f, bArr, 0, m27661d);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
    }
}
