package p239mb;

/* renamed from: mb.c */
/* loaded from: classes2.dex */
public final class C7156c {

    /* renamed from: a */
    private final byte[] f18970a;

    /* renamed from: b */
    private int f18971b;

    /* renamed from: c */
    private int f18972c;

    public C7156c(byte[] bArr) {
        this.f18970a = bArr;
    }

    /* renamed from: a */
    public int m19047a() {
        return ((this.f18970a.length - this.f18971b) * 8) - this.f18972c;
    }

    /* renamed from: b */
    public int m19046b() {
        return this.f18972c;
    }

    /* renamed from: c */
    public int m19045c() {
        return this.f18971b;
    }

    /* renamed from: d */
    public int m19044d(int i) {
        if (i > 0 && i <= 32 && i <= m19047a()) {
            int i2 = this.f18972c;
            int i3 = 0;
            if (i2 > 0) {
                int i4 = 8 - i2;
                int i5 = i < i4 ? i : i4;
                int i6 = i4 - i5;
                byte[] bArr = this.f18970a;
                int i7 = this.f18971b;
                int i8 = (((255 >> (8 - i5)) << i6) & bArr[i7]) >> i6;
                i -= i5;
                int i9 = i2 + i5;
                this.f18972c = i9;
                if (i9 == 8) {
                    this.f18972c = 0;
                    this.f18971b = i7 + 1;
                }
                i3 = i8;
            }
            if (i > 0) {
                while (i >= 8) {
                    int i10 = i3 << 8;
                    byte[] bArr2 = this.f18970a;
                    int i11 = this.f18971b;
                    i3 = (bArr2[i11] & 255) | i10;
                    this.f18971b = i11 + 1;
                    i -= 8;
                }
                if (i > 0) {
                    int i12 = 8 - i;
                    int i13 = (i3 << i) | ((((255 >> i12) << i12) & this.f18970a[this.f18971b]) >> i12);
                    this.f18972c += i;
                    return i13;
                }
                return i3;
            }
            return i3;
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }
}
