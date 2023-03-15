package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.sa */
/* loaded from: classes.dex */
public final class C2974sa {

    /* renamed from: f */
    private static final C2974sa f7984f = new C2974sa(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f7985a;

    /* renamed from: b */
    private int[] f7986b;

    /* renamed from: c */
    private Object[] f7987c;

    /* renamed from: d */
    private int f7988d;

    /* renamed from: e */
    private boolean f7989e;

    private C2974sa() {
        this(0, new int[8], new Object[8], true);
    }

    private C2974sa(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f7988d = -1;
        this.f7985a = i;
        this.f7986b = iArr;
        this.f7987c = objArr;
        this.f7989e = z;
    }

    /* renamed from: c */
    public static C2974sa m32106c() {
        return f7984f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C2974sa m32105d(C2974sa c2974sa, C2974sa c2974sa2) {
        int i = c2974sa.f7985a + c2974sa2.f7985a;
        int[] copyOf = Arrays.copyOf(c2974sa.f7986b, i);
        System.arraycopy(c2974sa2.f7986b, 0, copyOf, c2974sa.f7985a, c2974sa2.f7985a);
        Object[] copyOf2 = Arrays.copyOf(c2974sa.f7987c, i);
        System.arraycopy(c2974sa2.f7987c, 0, copyOf2, c2974sa.f7985a, c2974sa2.f7985a);
        return new C2974sa(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C2974sa m32104e() {
        return new C2974sa(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m32108a() {
        int m31798a;
        int m31797b;
        int i;
        int i2 = this.f7988d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f7985a; i4++) {
                int i5 = this.f7986b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.f7987c[i4]).longValue();
                        i = AbstractC3062y7.m31798a(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int m31798a2 = AbstractC3062y7.m31798a(i6 << 3);
                        int mo32153g = ((AbstractC2955r7) this.f7987c[i4]).mo32153g();
                        i3 += m31798a2 + AbstractC3062y7.m31798a(mo32153g) + mo32153g;
                    } else if (i7 == 3) {
                        int m31799D = AbstractC3062y7.m31799D(i6);
                        m31798a = m31799D + m31799D;
                        m31797b = ((C2974sa) this.f7987c[i4]).m32108a();
                    } else if (i7 == 5) {
                        ((Integer) this.f7987c[i4]).intValue();
                        i = AbstractC3062y7.m31798a(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzkh.m31640a());
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f7987c[i4]).longValue();
                    m31798a = AbstractC3062y7.m31798a(i6 << 3);
                    m31797b = AbstractC3062y7.m31797b(longValue);
                }
                i = m31798a + m31797b;
                i3 += i;
            }
            this.f7988d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m32107b() {
        int i = this.f7988d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f7985a; i3++) {
                int i4 = this.f7986b[i3];
                int m31798a = AbstractC3062y7.m31798a(8);
                int mo32153g = ((AbstractC2955r7) this.f7987c[i3]).mo32153g();
                i2 += m31798a + m31798a + AbstractC3062y7.m31798a(16) + AbstractC3062y7.m31798a(i4 >>> 3) + AbstractC3062y7.m31798a(24) + AbstractC3062y7.m31798a(mo32153g) + mo32153g;
            }
            this.f7988d = i2;
            return i2;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2974sa)) {
            C2974sa c2974sa = (C2974sa) obj;
            int i = this.f7985a;
            if (i == c2974sa.f7985a) {
                int[] iArr = this.f7986b;
                int[] iArr2 = c2974sa.f7986b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.f7987c;
                        Object[] objArr2 = c2974sa.f7987c;
                        int i3 = this.f7985a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final void m32103f() {
        this.f7989e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m32102g(StringBuilder sb2, int i) {
        for (int i2 = 0; i2 < this.f7985a; i2++) {
            C3004u9.m32001b(sb2, i, String.valueOf(this.f7986b[i2] >>> 3), this.f7987c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m32101h(int i, Object obj) {
        if (this.f7989e) {
            int i2 = this.f7985a;
            int[] iArr = this.f7986b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f7986b = Arrays.copyOf(iArr, i3);
                this.f7987c = Arrays.copyOf(this.f7987c, i3);
            }
            int[] iArr2 = this.f7986b;
            int i4 = this.f7985a;
            iArr2[i4] = i;
            this.f7987c[i4] = obj;
            this.f7985a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f7985a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f7986b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f7987c;
        int i7 = this.f7985a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m32100i(C3077z7 c3077z7) throws IOException {
        if (this.f7985a != 0) {
            for (int i = 0; i < this.f7985a; i++) {
                int i2 = this.f7986b[i];
                Object obj = this.f7987c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    c3077z7.m31685E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    c3077z7.m31655x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    c3077z7.m31664o(i3, (AbstractC2955r7) obj);
                } else if (i4 == 3) {
                    c3077z7.m31674e(i3);
                    ((C2974sa) obj).m32100i(c3077z7);
                    c3077z7.m31660s(i3);
                } else if (i4 == 5) {
                    c3077z7.m31657v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkh.m31640a());
                }
            }
        }
    }
}
