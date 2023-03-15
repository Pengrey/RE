package com.google.zxing;

/* renamed from: com.google.zxing.g */
/* loaded from: classes2.dex */
public final class C4402g extends AbstractC4403h {

    /* renamed from: c */
    private final AbstractC4403h f11916c;

    public C4402g(AbstractC4403h abstractC4403h) {
        super(abstractC4403h.m27661d(), abstractC4403h.m27662a());
        this.f11916c = abstractC4403h;
    }

    @Override // com.google.zxing.AbstractC4403h
    /* renamed from: b */
    public byte[] mo27653b() {
        byte[] mo27653b = this.f11916c.mo27653b();
        int m27661d = m27661d() * m27662a();
        byte[] bArr = new byte[m27661d];
        for (int i = 0; i < m27661d; i++) {
            bArr[i] = (byte) (255 - (mo27653b[i] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.AbstractC4403h
    /* renamed from: c */
    public byte[] mo27652c(int i, byte[] bArr) {
        byte[] mo27652c = this.f11916c.mo27652c(i, bArr);
        int m27661d = m27661d();
        for (int i2 = 0; i2 < m27661d; i2++) {
            mo27652c[i2] = (byte) (255 - (mo27652c[i2] & 255));
        }
        return mo27652c;
    }

    @Override // com.google.zxing.AbstractC4403h
    /* renamed from: e */
    public AbstractC4403h mo27660e() {
        return this.f11916c;
    }

    @Override // com.google.zxing.AbstractC4403h
    /* renamed from: f */
    public boolean mo27659f() {
        return this.f11916c.mo27659f();
    }

    @Override // com.google.zxing.AbstractC4403h
    /* renamed from: g */
    public AbstractC4403h mo27658g() {
        return new C4402g(this.f11916c.mo27658g());
    }
}
