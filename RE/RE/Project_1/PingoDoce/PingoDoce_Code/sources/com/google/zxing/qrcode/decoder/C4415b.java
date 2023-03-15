package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.C4432j;

/* renamed from: com.google.zxing.qrcode.decoder.b */
/* loaded from: classes2.dex */
final class C4415b {

    /* renamed from: a */
    private final int f11939a;

    /* renamed from: b */
    private final byte[] f11940b;

    private C4415b(int i, byte[] bArr) {
        this.f11939a = i;
        this.f11940b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4415b[] m27629b(byte[] bArr, C4432j c4432j, EnumC4428f enumC4428f) {
        if (bArr.length == c4432j.m27603h()) {
            C4432j.C4434b m27605f = c4432j.m27605f(enumC4428f);
            C4432j.C4433a[] m27598a = m27605f.m27598a();
            int i = 0;
            for (C4432j.C4433a c4433a : m27598a) {
                i += c4433a.m27600a();
            }
            C4415b[] c4415bArr = new C4415b[i];
            int i2 = 0;
            for (C4432j.C4433a c4433a2 : m27598a) {
                int i3 = 0;
                while (i3 < c4433a2.m27600a()) {
                    int m27599b = c4433a2.m27599b();
                    c4415bArr[i2] = new C4415b(m27599b, new byte[m27605f.m27597b() + m27599b]);
                    i3++;
                    i2++;
                }
            }
            int length = c4415bArr[0].f11940b.length;
            int i4 = i - 1;
            while (i4 >= 0 && c4415bArr[i4].f11940b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int m27597b = length - m27605f.m27597b();
            int i6 = 0;
            for (int i7 = 0; i7 < m27597b; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    c4415bArr[i8].f11940b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                c4415bArr[i9].f11940b[m27597b] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = c4415bArr[0].f11940b.length;
            while (m27597b < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    c4415bArr[i10].f11940b[i10 < i5 ? m27597b : m27597b + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                m27597b++;
            }
            return c4415bArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m27630a() {
        return this.f11940b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m27628c() {
        return this.f11939a;
    }
}
