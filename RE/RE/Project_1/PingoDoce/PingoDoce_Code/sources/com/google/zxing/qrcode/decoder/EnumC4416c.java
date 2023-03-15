package com.google.zxing.qrcode.decoder;

import p239mb.C7155b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.zxing.qrcode.decoder.c */
/* loaded from: classes2.dex */
abstract class EnumC4416c {
    private static final /* synthetic */ EnumC4416c[] $VALUES;
    public static final EnumC4416c DATA_MASK_000;
    public static final EnumC4416c DATA_MASK_001;
    public static final EnumC4416c DATA_MASK_010;
    public static final EnumC4416c DATA_MASK_011;
    public static final EnumC4416c DATA_MASK_100;
    public static final EnumC4416c DATA_MASK_101;
    public static final EnumC4416c DATA_MASK_110;
    public static final EnumC4416c DATA_MASK_111;

    /* compiled from: DataMask.java */
    /* renamed from: com.google.zxing.qrcode.decoder.c$a */
    /* loaded from: classes2.dex */
    enum C4417a extends EnumC4416c {
        C4417a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.zxing.qrcode.decoder.EnumC4416c
        boolean isMasked(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    static {
        C4417a c4417a = new C4417a("DATA_MASK_000", 0);
        DATA_MASK_000 = c4417a;
        EnumC4416c enumC4416c = new EnumC4416c("DATA_MASK_001", 1) { // from class: com.google.zxing.qrcode.decoder.c.b
            @Override // com.google.zxing.qrcode.decoder.EnumC4416c
            boolean isMasked(int i, int i2) {
                return (i & 1) == 0;
            }
        };
        DATA_MASK_001 = enumC4416c;
        EnumC4416c enumC4416c2 = new EnumC4416c("DATA_MASK_010", 2) { // from class: com.google.zxing.qrcode.decoder.c.c
            @Override // com.google.zxing.qrcode.decoder.EnumC4416c
            boolean isMasked(int i, int i2) {
                return i2 % 3 == 0;
            }
        };
        DATA_MASK_010 = enumC4416c2;
        EnumC4416c enumC4416c3 = new EnumC4416c("DATA_MASK_011", 3) { // from class: com.google.zxing.qrcode.decoder.c.d
            @Override // com.google.zxing.qrcode.decoder.EnumC4416c
            boolean isMasked(int i, int i2) {
                return (i + i2) % 3 == 0;
            }
        };
        DATA_MASK_011 = enumC4416c3;
        EnumC4416c enumC4416c4 = new EnumC4416c("DATA_MASK_100", 4) { // from class: com.google.zxing.qrcode.decoder.c.e
            @Override // com.google.zxing.qrcode.decoder.EnumC4416c
            boolean isMasked(int i, int i2) {
                return (((i / 2) + (i2 / 3)) & 1) == 0;
            }
        };
        DATA_MASK_100 = enumC4416c4;
        EnumC4416c enumC4416c5 = new EnumC4416c("DATA_MASK_101", 5) { // from class: com.google.zxing.qrcode.decoder.c.f
            @Override // com.google.zxing.qrcode.decoder.EnumC4416c
            boolean isMasked(int i, int i2) {
                return (i * i2) % 6 == 0;
            }
        };
        DATA_MASK_101 = enumC4416c5;
        EnumC4416c enumC4416c6 = new EnumC4416c("DATA_MASK_110", 6) { // from class: com.google.zxing.qrcode.decoder.c.g
            @Override // com.google.zxing.qrcode.decoder.EnumC4416c
            boolean isMasked(int i, int i2) {
                return (i * i2) % 6 < 3;
            }
        };
        DATA_MASK_110 = enumC4416c6;
        EnumC4416c enumC4416c7 = new EnumC4416c("DATA_MASK_111", 7) { // from class: com.google.zxing.qrcode.decoder.c.h
            @Override // com.google.zxing.qrcode.decoder.EnumC4416c
            boolean isMasked(int i, int i2) {
                return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
            }
        };
        DATA_MASK_111 = enumC4416c7;
        $VALUES = new EnumC4416c[]{c4417a, enumC4416c, enumC4416c2, enumC4416c3, enumC4416c4, enumC4416c5, enumC4416c6, enumC4416c7};
    }

    private EnumC4416c(String str, int i) {
    }

    public static EnumC4416c valueOf(String str) {
        return (EnumC4416c) Enum.valueOf(EnumC4416c.class, str);
    }

    public static EnumC4416c[] values() {
        return (EnumC4416c[]) $VALUES.clone();
    }

    abstract boolean isMasked(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void unmaskBitMatrix(C7155b c7155b, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (isMasked(i2, i3)) {
                    c7155b.m19060d(i3, i2);
                }
            }
        }
    }

    /* synthetic */ EnumC4416c(String str, int i, C4417a c4417a) {
        this(str, i);
    }
}
