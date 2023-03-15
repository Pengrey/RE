package com.google.zxing;

/* renamed from: com.google.zxing.h */
/* loaded from: classes2.dex */
public abstract class AbstractC4403h {

    /* renamed from: a */
    private final int f11917a;

    /* renamed from: b */
    private final int f11918b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4403h(int i, int i2) {
        this.f11917a = i;
        this.f11918b = i2;
    }

    /* renamed from: a */
    public final int m27662a() {
        return this.f11918b;
    }

    /* renamed from: b */
    public abstract byte[] mo27653b();

    /* renamed from: c */
    public abstract byte[] mo27652c(int i, byte[] bArr);

    /* renamed from: d */
    public final int m27661d() {
        return this.f11917a;
    }

    /* renamed from: e */
    public AbstractC4403h mo27660e() {
        return new C4402g(this);
    }

    /* renamed from: f */
    public boolean mo27659f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC4403h mo27658g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f11917a;
        byte[] bArr = new byte[i];
        StringBuilder sb2 = new StringBuilder(this.f11918b * (i + 1));
        for (int i2 = 0; i2 < this.f11918b; i2++) {
            bArr = mo27652c(i2, bArr);
            for (int i3 = 0; i3 < this.f11917a; i3++) {
                int i4 = bArr[i3] & 255;
                sb2.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
