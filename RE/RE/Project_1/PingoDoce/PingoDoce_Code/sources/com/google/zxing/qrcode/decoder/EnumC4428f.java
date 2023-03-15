package com.google.zxing.qrcode.decoder;

/* renamed from: com.google.zxing.qrcode.decoder.f */
/* loaded from: classes2.dex */
public enum EnumC4428f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final EnumC4428f[] FOR_BITS;
    private final int bits;

    static {
        EnumC4428f enumC4428f = L;
        EnumC4428f enumC4428f2 = M;
        EnumC4428f enumC4428f3 = Q;
        FOR_BITS = new EnumC4428f[]{enumC4428f2, enumC4428f, H, enumC4428f3};
    }

    EnumC4428f(int i) {
        this.bits = i;
    }

    public static EnumC4428f forBits(int i) {
        if (i >= 0) {
            EnumC4428f[] enumC4428fArr = FOR_BITS;
            if (i < enumC4428fArr.length) {
                return enumC4428fArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
