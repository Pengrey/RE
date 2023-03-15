package com.google.zxing.qrcode.decoder;

import com.google.crypto.tink.shaded.protobuf.Reader;

/* renamed from: com.google.zxing.qrcode.decoder.g */
/* loaded from: classes2.dex */
final class C4429g {

    /* renamed from: c */
    private static final int[][] f11948c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final EnumC4428f f11949a;

    /* renamed from: b */
    private final byte f11950b;

    private C4429g(int i) {
        this.f11949a = EnumC4428f.forBits((i >> 3) & 3);
        this.f11950b = (byte) (i & 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4429g m27616a(int i, int i2) {
        C4429g m27615b = m27615b(i, i2);
        return m27615b != null ? m27615b : m27615b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C4429g m27615b(int i, int i2) {
        int m27612e;
        int[][] iArr = f11948c;
        int i3 = Reader.READ_DONE;
        int i4 = 0;
        for (int[] iArr2 : iArr) {
            int i5 = iArr2[0];
            if (i5 != i && i5 != i2) {
                int m27612e2 = m27612e(i, i5);
                if (m27612e2 < i3) {
                    i4 = iArr2[1];
                    i3 = m27612e2;
                }
                if (i != i2 && (m27612e = m27612e(i2, i5)) < i3) {
                    i4 = iArr2[1];
                    i3 = m27612e;
                }
            } else {
                return new C4429g(iArr2[1]);
            }
        }
        if (i3 <= 3) {
            return new C4429g(i4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m27612e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte m27614c() {
        return this.f11950b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public EnumC4428f m27613d() {
        return this.f11949a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4429g) {
            C4429g c4429g = (C4429g) obj;
            return this.f11949a == c4429g.f11949a && this.f11950b == c4429g.f11950b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f11949a.ordinal() << 3) | this.f11950b;
    }
}
