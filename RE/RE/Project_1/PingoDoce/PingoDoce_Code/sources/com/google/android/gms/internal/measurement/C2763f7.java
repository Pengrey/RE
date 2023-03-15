package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.f7 */
/* loaded from: classes.dex */
public final class C2763f7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m32720a(byte[] bArr, int i, C2747e7 c2747e7) throws zzkh {
        int m32711j = m32711j(bArr, i, c2747e7);
        int i2 = c2747e7.f7721a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m32711j) {
                if (i2 == 0) {
                    c2747e7.f7723c = AbstractC2955r7.f7969x;
                    return m32711j;
                }
                c2747e7.f7723c = AbstractC2955r7.m32145v(bArr, m32711j, i2);
                return m32711j + i2;
            }
            throw zzkh.m31635f();
        }
        throw zzkh.m31637d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m32719b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m32718c(InterfaceC2734da interfaceC2734da, byte[] bArr, int i, int i2, int i3, C2747e7 c2747e7) throws IOException {
        C3019v9 c3019v9 = (C3019v9) interfaceC2734da;
        Object mo31902d = c3019v9.mo31902d();
        int m31952D = c3019v9.m31952D(mo31902d, bArr, i, i2, i3, c2747e7);
        c3019v9.mo31905a(mo31902d);
        c2747e7.f7723c = mo31902d;
        return m31952D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m32717d(InterfaceC2734da interfaceC2734da, byte[] bArr, int i, int i2, C2747e7 c2747e7) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m32710k(i4, bArr, i3, c2747e7);
            i4 = c2747e7.f7721a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object mo31902d = interfaceC2734da.mo31902d();
            int i6 = i4 + i5;
            interfaceC2734da.mo31903c(mo31902d, bArr, i5, i6, c2747e7);
            interfaceC2734da.mo31905a(mo31902d);
            c2747e7.f7723c = mo31902d;
            return i6;
        }
        throw zzkh.m31635f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m32716e(InterfaceC2734da interfaceC2734da, int i, byte[] bArr, int i2, int i3, InterfaceC3033w8 interfaceC3033w8, C2747e7 c2747e7) throws IOException {
        int m32717d = m32717d(interfaceC2734da, bArr, i2, i3, c2747e7);
        interfaceC3033w8.add(c2747e7.f7723c);
        while (m32717d < i3) {
            int m32711j = m32711j(bArr, m32717d, c2747e7);
            if (i != c2747e7.f7721a) {
                break;
            }
            m32717d = m32717d(interfaceC2734da, bArr, m32711j, i3, c2747e7);
            interfaceC3033w8.add(c2747e7.f7723c);
        }
        return m32717d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m32715f(byte[] bArr, int i, InterfaceC3033w8 interfaceC3033w8, C2747e7 c2747e7) throws IOException {
        C2956r8 c2956r8 = (C2956r8) interfaceC3033w8;
        int m32711j = m32711j(bArr, i, c2747e7);
        int i2 = c2747e7.f7721a + m32711j;
        while (m32711j < i2) {
            m32711j = m32711j(bArr, m32711j, c2747e7);
            c2956r8.m32140h(c2747e7.f7721a);
        }
        if (m32711j == i2) {
            return m32711j;
        }
        throw zzkh.m31635f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m32714g(byte[] bArr, int i, C2747e7 c2747e7) throws zzkh {
        int m32711j = m32711j(bArr, i, c2747e7);
        int i2 = c2747e7.f7721a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c2747e7.f7723c = BuildConfig.VERSION_NAME;
                return m32711j;
            }
            c2747e7.f7723c = new String(bArr, m32711j, i2, C3048x8.f8089a);
            return m32711j + i2;
        }
        throw zzkh.m31637d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m32713h(byte[] bArr, int i, C2747e7 c2747e7) throws zzkh {
        int m32711j = m32711j(bArr, i, c2747e7);
        int i2 = c2747e7.f7721a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c2747e7.f7723c = BuildConfig.VERSION_NAME;
                return m32711j;
            }
            c2747e7.f7723c = C2783gb.m32612d(bArr, m32711j, i2);
            return m32711j + i2;
        }
        throw zzkh.m31637d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m32712i(int i, byte[] bArr, int i2, int i3, C2974sa c2974sa, C2747e7 c2747e7) throws zzkh {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m32708m = m32708m(bArr, i2, c2747e7);
                c2974sa.m32101h(i, Long.valueOf(c2747e7.f7722b));
                return m32708m;
            } else if (i4 == 1) {
                c2974sa.m32101h(i, Long.valueOf(m32707n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int m32711j = m32711j(bArr, i2, c2747e7);
                int i5 = c2747e7.f7721a;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - m32711j) {
                        if (i5 == 0) {
                            c2974sa.m32101h(i, AbstractC2955r7.f7969x);
                        } else {
                            c2974sa.m32101h(i, AbstractC2955r7.m32145v(bArr, m32711j, i5));
                        }
                        return m32711j + i5;
                    }
                    throw zzkh.m31635f();
                }
                throw zzkh.m31637d();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    c2974sa.m32101h(i, Integer.valueOf(m32719b(bArr, i2)));
                    return i2 + 4;
                }
                throw zzkh.m31639b();
            } else {
                int i6 = (i & (-8)) | 4;
                C2974sa m32104e = C2974sa.m32104e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int m32711j2 = m32711j(bArr, i2, c2747e7);
                    int i8 = c2747e7.f7721a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = m32711j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m32712i(i8, bArr, m32711j2, i3, m32104e, c2747e7);
                }
                if (i2 <= i3 && i7 == i6) {
                    c2974sa.m32101h(i, m32104e);
                    return i2;
                }
                throw zzkh.m31636e();
            }
        }
        throw zzkh.m31639b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m32711j(byte[] bArr, int i, C2747e7 c2747e7) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c2747e7.f7721a = b;
            return i2;
        }
        return m32710k(b, bArr, i2, c2747e7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m32710k(int i, byte[] bArr, int i2, C2747e7 c2747e7) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c2747e7.f7721a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c2747e7.f7721a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c2747e7.f7721a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c2747e7.f7721a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c2747e7.f7721a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m32709l(int i, byte[] bArr, int i2, int i3, InterfaceC3033w8 interfaceC3033w8, C2747e7 c2747e7) {
        C2956r8 c2956r8 = (C2956r8) interfaceC3033w8;
        int m32711j = m32711j(bArr, i2, c2747e7);
        c2956r8.m32140h(c2747e7.f7721a);
        while (m32711j < i3) {
            int m32711j2 = m32711j(bArr, m32711j, c2747e7);
            if (i != c2747e7.f7721a) {
                break;
            }
            m32711j = m32711j(bArr, m32711j2, c2747e7);
            c2956r8.m32140h(c2747e7.f7721a);
        }
        return m32711j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m32708m(byte[] bArr, int i, C2747e7 c2747e7) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c2747e7.f7722b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        c2747e7.f7722b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static long m32707n(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
