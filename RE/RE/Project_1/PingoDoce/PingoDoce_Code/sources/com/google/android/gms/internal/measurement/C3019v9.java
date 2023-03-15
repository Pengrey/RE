package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.v9 */
/* loaded from: classes.dex */
public final class C3019v9<T> implements InterfaceC2734da<T> {

    /* renamed from: o */
    private static final int[] f8045o = new int[0];

    /* renamed from: p */
    private static final Unsafe f8046p = C2703bb.m32845l();

    /* renamed from: a */
    private final int[] f8047a;

    /* renamed from: b */
    private final Object[] f8048b;

    /* renamed from: c */
    private final int f8049c;

    /* renamed from: d */
    private final int f8050d;

    /* renamed from: e */
    private final InterfaceC2973s9 f8051e;

    /* renamed from: f */
    private final boolean f8052f;

    /* renamed from: g */
    private final boolean f8053g;

    /* renamed from: h */
    private final int[] f8054h;

    /* renamed from: i */
    private final int f8055i;

    /* renamed from: j */
    private final int f8056j;

    /* renamed from: k */
    private final AbstractC2765f9 f8057k;

    /* renamed from: l */
    private final AbstractC2958ra f8058l;

    /* renamed from: m */
    private final AbstractC2748e8 f8059m;

    /* renamed from: n */
    private final C2877m9 f8060n;

    private C3019v9(int[] iArr, Object[] objArr, int i, int i2, InterfaceC2973s9 interfaceC2973s9, boolean z, boolean z2, int[] iArr2, int i3, int i4, C3049x9 c3049x9, AbstractC2765f9 abstractC2765f9, AbstractC2958ra abstractC2958ra, AbstractC2748e8 abstractC2748e8, C2877m9 c2877m9, byte[] bArr) {
        this.f8047a = iArr;
        this.f8048b = objArr;
        this.f8049c = i;
        this.f8050d = i2;
        this.f8053g = z;
        boolean z3 = false;
        if (abstractC2748e8 != null && abstractC2748e8.mo32704c(interfaceC2973s9)) {
            z3 = true;
        }
        this.f8052f = z3;
        this.f8054h = iArr2;
        this.f8055i = i3;
        this.f8056j = i4;
        this.f8057k = abstractC2765f9;
        this.f8058l = abstractC2958ra;
        this.f8059m = abstractC2748e8;
        this.f8051e = interfaceC2973s9;
        this.f8060n = c2877m9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: A */
    private final void m31955A(Object obj, C3077z7 c3077z7) throws IOException {
        int i;
        boolean z;
        if (!this.f8052f) {
            int length = this.f8047a.length;
            Unsafe unsafe = f8046p;
            int i2 = 1048575;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int m31934k = m31934k(i4);
                int[] iArr = this.f8047a;
                int i6 = iArr[i4];
                int m31935j = m31935j(m31934k);
                if (m31935j <= 17) {
                    int i7 = iArr[i4 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i3) {
                        i5 = unsafe.getInt(obj, i8);
                        i3 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = m31934k & i2;
                switch (m31935j) {
                    case 0:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31662q(i6, C2703bb.m32851f(obj, j));
                            break;
                        }
                    case 1:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31653z(i6, C2703bb.m32850g(obj, j));
                            break;
                        }
                    case 2:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31685E(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 3:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31669j(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 4:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31687C(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 5:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31655x(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 6:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31657v(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 7:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31666m(i6, C2703bb.m32860B(obj, j));
                            break;
                        }
                    case 8:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            m31953C(i6, unsafe.getObject(obj, j), c3077z7);
                            break;
                        }
                    case 9:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31683G(i6, unsafe.getObject(obj, j), m31931n(i4));
                            break;
                        }
                    case 10:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31664o(i6, (AbstractC2955r7) unsafe.getObject(obj, j));
                            break;
                        }
                    case 11:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31671h(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 12:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31659t(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 13:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31682H(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 14:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31680J(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 15:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31678a(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 16:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31676c(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 17:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            c3077z7.m31688B(i6, unsafe.getObject(obj, j), m31931n(i4));
                            break;
                        }
                    case 18:
                        C2766fa.m32660l(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 19:
                        C2766fa.m32656p(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 20:
                        C2766fa.m32653s(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 21:
                        C2766fa.m32698B(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 22:
                        C2766fa.m32654r(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 23:
                        C2766fa.m32657o(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 24:
                        C2766fa.m32658n(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 25:
                        C2766fa.m32662j(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 26:
                        C2766fa.m32647y(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7);
                        break;
                    case 27:
                        C2766fa.m32652t(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, m31931n(i4));
                        break;
                    case 28:
                        C2766fa.m32661k(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7);
                        break;
                    case 29:
                        z = false;
                        C2766fa.m32646z(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 30:
                        z = false;
                        C2766fa.m32659m(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 31:
                        z = false;
                        C2766fa.m32651u(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 32:
                        z = false;
                        C2766fa.m32650v(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 33:
                        z = false;
                        C2766fa.m32649w(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 34:
                        z = false;
                        C2766fa.m32648x(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, false);
                        break;
                    case 35:
                        C2766fa.m32660l(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 36:
                        C2766fa.m32656p(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 37:
                        C2766fa.m32653s(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 38:
                        C2766fa.m32698B(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 39:
                        C2766fa.m32654r(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 40:
                        C2766fa.m32657o(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 41:
                        C2766fa.m32658n(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 42:
                        C2766fa.m32662j(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 43:
                        C2766fa.m32646z(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 44:
                        C2766fa.m32659m(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 45:
                        C2766fa.m32651u(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 46:
                        C2766fa.m32650v(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 47:
                        C2766fa.m32649w(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 48:
                        C2766fa.m32648x(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, true);
                        break;
                    case 49:
                        C2766fa.m32655q(this.f8047a[i4], (List) unsafe.getObject(obj, j), c3077z7, m31931n(i4));
                        break;
                    case 50:
                        m31954B(c3077z7, i6, unsafe.getObject(obj, j), i4);
                        break;
                    case 51:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31662q(i6, m31948H(obj, j));
                        }
                        break;
                    case 52:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31653z(i6, m31947I(obj, j));
                        }
                        break;
                    case 53:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31685E(i6, m31933l(obj, j));
                        }
                        break;
                    case 54:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31669j(i6, m31933l(obj, j));
                        }
                        break;
                    case 55:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31687C(i6, m31944L(obj, j));
                        }
                        break;
                    case 56:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31655x(i6, m31933l(obj, j));
                        }
                        break;
                    case 57:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31657v(i6, m31944L(obj, j));
                        }
                        break;
                    case 58:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31666m(i6, m31919z(obj, j));
                        }
                        break;
                    case 59:
                        if (m31920y(obj, i6, i4)) {
                            m31953C(i6, unsafe.getObject(obj, j), c3077z7);
                        }
                        break;
                    case 60:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31683G(i6, unsafe.getObject(obj, j), m31931n(i4));
                        }
                        break;
                    case 61:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31664o(i6, (AbstractC2955r7) unsafe.getObject(obj, j));
                        }
                        break;
                    case 62:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31671h(i6, m31944L(obj, j));
                        }
                        break;
                    case 63:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31659t(i6, m31944L(obj, j));
                        }
                        break;
                    case 64:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31682H(i6, m31944L(obj, j));
                        }
                        break;
                    case 65:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31680J(i6, m31933l(obj, j));
                        }
                        break;
                    case 66:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31678a(i6, m31944L(obj, j));
                        }
                        break;
                    case 67:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31676c(i6, m31933l(obj, j));
                        }
                        break;
                    case 68:
                        if (m31920y(obj, i6, i4)) {
                            c3077z7.m31688B(i6, unsafe.getObject(obj, j), m31931n(i4));
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            }
            AbstractC2958ra abstractC2958ra = this.f8058l;
            abstractC2958ra.mo32053i(abstractC2958ra.mo32059c(obj), c3077z7);
            return;
        }
        this.f8059m.mo32706a(obj);
        throw null;
    }

    /* renamed from: B */
    private final void m31954B(C3077z7 c3077z7, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        C2845k9 c2845k9 = (C2845k9) m31930o(i2);
        throw null;
    }

    /* renamed from: C */
    private static final void m31953C(int i, Object obj, C3077z7 c3077z7) throws IOException {
        if (obj instanceof String) {
            c3077z7.m31673f(i, (String) obj);
        } else {
            c3077z7.m31664o(i, (AbstractC2955r7) obj);
        }
    }

    /* renamed from: E */
    static C2974sa m31951E(Object obj) {
        AbstractC2940q8 abstractC2940q8 = (AbstractC2940q8) obj;
        C2974sa c2974sa = abstractC2940q8.zzc;
        if (c2974sa == C2974sa.m32106c()) {
            C2974sa m32104e = C2974sa.m32104e();
            abstractC2940q8.zzc = m32104e;
            return m32104e;
        }
        return c2974sa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static C3019v9 m31950F(Class cls, InterfaceC2909o9 interfaceC2909o9, C3049x9 c3049x9, AbstractC2765f9 abstractC2765f9, AbstractC2958ra abstractC2958ra, AbstractC2748e8 abstractC2748e8, C2877m9 c2877m9) {
        if (interfaceC2909o9 instanceof C2718ca) {
            return m31949G((C2718ca) interfaceC2909o9, c3049x9, abstractC2765f9, abstractC2958ra, abstractC2748e8, c2877m9);
        }
        C2910oa c2910oa = (C2910oa) interfaceC2909o9;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.measurement.C3019v9 m31949G(com.google.android.gms.internal.measurement.C2718ca r34, com.google.android.gms.internal.measurement.C3049x9 r35, com.google.android.gms.internal.measurement.AbstractC2765f9 r36, com.google.android.gms.internal.measurement.AbstractC2958ra r37, com.google.android.gms.internal.measurement.AbstractC2748e8 r38, com.google.android.gms.internal.measurement.C2877m9 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3019v9.m31949G(com.google.android.gms.internal.measurement.ca, com.google.android.gms.internal.measurement.x9, com.google.android.gms.internal.measurement.f9, com.google.android.gms.internal.measurement.ra, com.google.android.gms.internal.measurement.e8, com.google.android.gms.internal.measurement.m9):com.google.android.gms.internal.measurement.v9");
    }

    /* renamed from: H */
    private static double m31948H(Object obj, long j) {
        return ((Double) C2703bb.m32846k(obj, j)).doubleValue();
    }

    /* renamed from: I */
    private static float m31947I(Object obj, long j) {
        return ((Float) C2703bb.m32846k(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: J */
    private final int m31946J(Object obj) {
        int i;
        int m31798a;
        int m31798a2;
        int m31798a3;
        int m31797b;
        int m31798a4;
        int m31773z;
        int m31798a5;
        int m31798a6;
        int mo32153g;
        int m31798a7;
        int i2;
        int m32677W;
        boolean z;
        int m32694F;
        int m32689K;
        int m31799D;
        int m31798a8;
        int i3;
        int m31798a9;
        int m31798a10;
        int m31798a11;
        int m31797b2;
        int m31798a12;
        int mo32153g2;
        int m31798a13;
        int i4;
        Unsafe unsafe = f8046p;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.f8047a.length) {
            int m31934k = m31934k(i7);
            int[] iArr = this.f8047a;
            int i10 = iArr[i7];
            int m31935j = m31935j(m31934k);
            if (m31935j <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i9 = unsafe.getInt(obj, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j = m31934k & i5;
            switch (m31935j) {
                case 0:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a = AbstractC3062y7.m31798a(i10 << 3);
                        m31798a5 = m31798a + 8;
                        i8 += m31798a5;
                        break;
                    }
                case 1:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a2 = AbstractC3062y7.m31798a(i10 << 3);
                        m31798a5 = m31798a2 + 4;
                        i8 += m31798a5;
                        break;
                    }
                case 2:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        m31798a3 = AbstractC3062y7.m31798a(i10 << 3);
                        m31797b = AbstractC3062y7.m31797b(j2);
                        i8 += m31798a3 + m31797b;
                        break;
                    }
                case 3:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        m31798a3 = AbstractC3062y7.m31798a(i10 << 3);
                        m31797b = AbstractC3062y7.m31797b(j3);
                        i8 += m31798a3 + m31797b;
                        break;
                    }
                case 4:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i10 << 3);
                        m31773z = AbstractC3062y7.m31773z(i13);
                        i2 = m31798a4 + m31773z;
                        i8 += i2;
                        break;
                    }
                case 5:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a = AbstractC3062y7.m31798a(i10 << 3);
                        m31798a5 = m31798a + 8;
                        i8 += m31798a5;
                        break;
                    }
                case 6:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a2 = AbstractC3062y7.m31798a(i10 << 3);
                        m31798a5 = m31798a2 + 4;
                        i8 += m31798a5;
                        break;
                    }
                case 7:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a5 = AbstractC3062y7.m31798a(i10 << 3) + 1;
                        i8 += m31798a5;
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof AbstractC2955r7) {
                            m31798a6 = AbstractC3062y7.m31798a(i10 << 3);
                            mo32153g = ((AbstractC2955r7) object).mo32153g();
                            m31798a7 = AbstractC3062y7.m31798a(mo32153g);
                            i2 = m31798a6 + m31798a7 + mo32153g;
                            i8 += i2;
                            break;
                        } else {
                            m31798a4 = AbstractC3062y7.m31798a(i10 << 3);
                            m31773z = AbstractC3062y7.m31800C((String) object);
                            i2 = m31798a4 + m31773z;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a5 = C2766fa.m32683Q(i10, unsafe.getObject(obj, j), m31931n(i7));
                        i8 += m31798a5;
                        break;
                    }
                case 10:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a6 = AbstractC3062y7.m31798a(i10 << 3);
                        mo32153g = ((AbstractC2955r7) unsafe.getObject(obj, j)).mo32153g();
                        m31798a7 = AbstractC3062y7.m31798a(mo32153g);
                        i2 = m31798a6 + m31798a7 + mo32153g;
                        i8 += i2;
                        break;
                    }
                case 11:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i10 << 3);
                        m31773z = AbstractC3062y7.m31798a(i14);
                        i2 = m31798a4 + m31773z;
                        i8 += i2;
                        break;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i10 << 3);
                        m31773z = AbstractC3062y7.m31773z(i15);
                        i2 = m31798a4 + m31773z;
                        i8 += i2;
                        break;
                    }
                case 13:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a2 = AbstractC3062y7.m31798a(i10 << 3);
                        m31798a5 = m31798a2 + 4;
                        i8 += m31798a5;
                        break;
                    }
                case 14:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a = AbstractC3062y7.m31798a(i10 << 3);
                        m31798a5 = m31798a + 8;
                        i8 += m31798a5;
                        break;
                    }
                case 15:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i10 << 3);
                        m31773z = AbstractC3062y7.m31798a((i16 >> 31) ^ (i16 + i16));
                        i2 = m31798a4 + m31773z;
                        i8 += i2;
                        break;
                    }
                case 16:
                    if ((i & i9) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += AbstractC3062y7.m31798a(i10 << 3) + AbstractC3062y7.m31797b((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        m31798a5 = AbstractC3062y7.m31774y(i10, (InterfaceC2973s9) unsafe.getObject(obj, j), m31931n(i7));
                        i8 += m31798a5;
                        break;
                    }
                case 18:
                    m31798a5 = C2766fa.m32690J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m31798a5;
                    break;
                case 19:
                    m31798a5 = C2766fa.m32692H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m31798a5;
                    break;
                case 20:
                    m31798a5 = C2766fa.m32685O(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m31798a5;
                    break;
                case 21:
                    m31798a5 = C2766fa.m32674Z(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m31798a5;
                    break;
                case 22:
                    m31798a5 = C2766fa.m32687M(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m31798a5;
                    break;
                case 23:
                    m31798a5 = C2766fa.m32690J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m31798a5;
                    break;
                case 24:
                    m31798a5 = C2766fa.m32692H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m31798a5;
                    break;
                case 25:
                    m31798a5 = C2766fa.m32699A(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m31798a5;
                    break;
                case 26:
                    m32677W = C2766fa.m32677W(i10, (List) unsafe.getObject(obj, j));
                    i8 += m32677W;
                    break;
                case 27:
                    m32677W = C2766fa.m32682R(i10, (List) unsafe.getObject(obj, j), m31931n(i7));
                    i8 += m32677W;
                    break;
                case 28:
                    m32677W = C2766fa.m32695E(i10, (List) unsafe.getObject(obj, j));
                    i8 += m32677W;
                    break;
                case 29:
                    m32677W = C2766fa.m32676X(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m32677W;
                    break;
                case 30:
                    z = false;
                    m32694F = C2766fa.m32694F(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m32694F;
                    break;
                case 31:
                    z = false;
                    m32694F = C2766fa.m32692H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m32694F;
                    break;
                case 32:
                    z = false;
                    m32694F = C2766fa.m32690J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m32694F;
                    break;
                case 33:
                    z = false;
                    m32694F = C2766fa.m32681S(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m32694F;
                    break;
                case 34:
                    z = false;
                    m32694F = C2766fa.m32679U(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m32694F;
                    break;
                case 35:
                    m32689K = C2766fa.m32689K((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 36:
                    m32689K = C2766fa.m32691I((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 37:
                    m32689K = C2766fa.m32684P((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 38:
                    m32689K = C2766fa.m32672a0((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 39:
                    m32689K = C2766fa.m32686N((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 40:
                    m32689K = C2766fa.m32689K((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 41:
                    m32689K = C2766fa.m32691I((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 42:
                    m32689K = C2766fa.m32696D((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 43:
                    m32689K = C2766fa.m32675Y((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 44:
                    m32689K = C2766fa.m32693G((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 45:
                    m32689K = C2766fa.m32691I((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 46:
                    m32689K = C2766fa.m32689K((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 47:
                    m32689K = C2766fa.m32680T((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 48:
                    m32689K = C2766fa.m32678V((List) unsafe.getObject(obj, j));
                    if (m32689K > 0) {
                        m31799D = AbstractC3062y7.m31799D(i10);
                        m31798a8 = AbstractC3062y7.m31798a(m32689K);
                        i3 = m31799D + m31798a8;
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 49:
                    m32677W = C2766fa.m32688L(i10, (List) unsafe.getObject(obj, j), m31931n(i7));
                    i8 += m32677W;
                    break;
                case 50:
                    C2877m9.m32466a(i10, unsafe.getObject(obj, j), m31930o(i7));
                    break;
                case 51:
                    if (m31920y(obj, i10, i7)) {
                        m31798a9 = AbstractC3062y7.m31798a(i10 << 3);
                        m32677W = m31798a9 + 8;
                        i8 += m32677W;
                    }
                    break;
                case 52:
                    if (m31920y(obj, i10, i7)) {
                        m31798a10 = AbstractC3062y7.m31798a(i10 << 3);
                        m32677W = m31798a10 + 4;
                        i8 += m32677W;
                    }
                    break;
                case 53:
                    if (m31920y(obj, i10, i7)) {
                        long m31933l = m31933l(obj, j);
                        m31798a11 = AbstractC3062y7.m31798a(i10 << 3);
                        m31797b2 = AbstractC3062y7.m31797b(m31933l);
                        i8 += m31798a11 + m31797b2;
                    }
                    break;
                case 54:
                    if (m31920y(obj, i10, i7)) {
                        long m31933l2 = m31933l(obj, j);
                        m31798a11 = AbstractC3062y7.m31798a(i10 << 3);
                        m31797b2 = AbstractC3062y7.m31797b(m31933l2);
                        i8 += m31798a11 + m31797b2;
                    }
                    break;
                case 55:
                    if (m31920y(obj, i10, i7)) {
                        int m31944L = m31944L(obj, j);
                        i3 = AbstractC3062y7.m31798a(i10 << 3);
                        m32689K = AbstractC3062y7.m31773z(m31944L);
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (m31920y(obj, i10, i7)) {
                        m31798a9 = AbstractC3062y7.m31798a(i10 << 3);
                        m32677W = m31798a9 + 8;
                        i8 += m32677W;
                    }
                    break;
                case 57:
                    if (m31920y(obj, i10, i7)) {
                        m31798a10 = AbstractC3062y7.m31798a(i10 << 3);
                        m32677W = m31798a10 + 4;
                        i8 += m32677W;
                    }
                    break;
                case 58:
                    if (m31920y(obj, i10, i7)) {
                        m32677W = AbstractC3062y7.m31798a(i10 << 3) + 1;
                        i8 += m32677W;
                    }
                    break;
                case 59:
                    if (m31920y(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof AbstractC2955r7) {
                            m31798a12 = AbstractC3062y7.m31798a(i10 << 3);
                            mo32153g2 = ((AbstractC2955r7) object2).mo32153g();
                            m31798a13 = AbstractC3062y7.m31798a(mo32153g2);
                            i4 = m31798a12 + m31798a13 + mo32153g2;
                            i8 += i4;
                        } else {
                            i3 = AbstractC3062y7.m31798a(i10 << 3);
                            m32689K = AbstractC3062y7.m31800C((String) object2);
                            i4 = i3 + m32689K;
                            i8 += i4;
                        }
                    }
                    break;
                case 60:
                    if (m31920y(obj, i10, i7)) {
                        m32677W = C2766fa.m32683Q(i10, unsafe.getObject(obj, j), m31931n(i7));
                        i8 += m32677W;
                    }
                    break;
                case 61:
                    if (m31920y(obj, i10, i7)) {
                        m31798a12 = AbstractC3062y7.m31798a(i10 << 3);
                        mo32153g2 = ((AbstractC2955r7) unsafe.getObject(obj, j)).mo32153g();
                        m31798a13 = AbstractC3062y7.m31798a(mo32153g2);
                        i4 = m31798a12 + m31798a13 + mo32153g2;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (m31920y(obj, i10, i7)) {
                        int m31944L2 = m31944L(obj, j);
                        i3 = AbstractC3062y7.m31798a(i10 << 3);
                        m32689K = AbstractC3062y7.m31798a(m31944L2);
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (m31920y(obj, i10, i7)) {
                        int m31944L3 = m31944L(obj, j);
                        i3 = AbstractC3062y7.m31798a(i10 << 3);
                        m32689K = AbstractC3062y7.m31773z(m31944L3);
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (m31920y(obj, i10, i7)) {
                        m31798a10 = AbstractC3062y7.m31798a(i10 << 3);
                        m32677W = m31798a10 + 4;
                        i8 += m32677W;
                    }
                    break;
                case 65:
                    if (m31920y(obj, i10, i7)) {
                        m31798a9 = AbstractC3062y7.m31798a(i10 << 3);
                        m32677W = m31798a9 + 8;
                        i8 += m32677W;
                    }
                    break;
                case 66:
                    if (m31920y(obj, i10, i7)) {
                        int m31944L4 = m31944L(obj, j);
                        i3 = AbstractC3062y7.m31798a(i10 << 3);
                        m32689K = AbstractC3062y7.m31798a((m31944L4 >> 31) ^ (m31944L4 + m31944L4));
                        i4 = i3 + m32689K;
                        i8 += i4;
                    }
                    break;
                case 67:
                    if (m31920y(obj, i10, i7)) {
                        long m31933l3 = m31933l(obj, j);
                        i8 += AbstractC3062y7.m31798a(i10 << 3) + AbstractC3062y7.m31797b((m31933l3 >> 63) ^ (m31933l3 + m31933l3));
                    }
                    break;
                case 68:
                    if (m31920y(obj, i10, i7)) {
                        m32677W = AbstractC3062y7.m31774y(i10, (InterfaceC2973s9) unsafe.getObject(obj, j), m31931n(i7));
                        i8 += m32677W;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        AbstractC2958ra abstractC2958ra = this.f8058l;
        int mo32061a = i8 + abstractC2958ra.mo32061a(abstractC2958ra.mo32059c(obj));
        if (this.f8052f) {
            this.f8059m.mo32706a(obj);
            throw null;
        }
        return mo32061a;
    }

    /* renamed from: K */
    private final int m31945K(Object obj) {
        int m31798a;
        int m31798a2;
        int m31798a3;
        int m31797b;
        int m31798a4;
        int m31773z;
        int m31798a5;
        int m31798a6;
        int mo32153g;
        int m31798a7;
        int m32683Q;
        int m31799D;
        int m31798a8;
        int i;
        Unsafe unsafe = f8046p;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f8047a.length; i3 += 3) {
            int m31934k = m31934k(i3);
            int m31935j = m31935j(m31934k);
            int i4 = this.f8047a[i3];
            long j = m31934k & 1048575;
            if (m31935j >= EnumC2828j8.zzJ.zza() && m31935j <= EnumC2828j8.zzW.zza()) {
                int i5 = this.f8047a[i3 + 2];
            }
            switch (m31935j) {
                case 0:
                    if (m31923v(obj, i3)) {
                        m31798a = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a + 8;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m31923v(obj, i3)) {
                        m31798a2 = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a2 + 4;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m31923v(obj, i3)) {
                        long m32848i = C2703bb.m32848i(obj, j);
                        m31798a3 = AbstractC3062y7.m31798a(i4 << 3);
                        m31797b = AbstractC3062y7.m31797b(m32848i);
                        i2 += m31798a3 + m31797b;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m31923v(obj, i3)) {
                        long m32848i2 = C2703bb.m32848i(obj, j);
                        m31798a3 = AbstractC3062y7.m31798a(i4 << 3);
                        m31797b = AbstractC3062y7.m31797b(m32848i2);
                        i2 += m31798a3 + m31797b;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m31923v(obj, i3)) {
                        int m32849h = C2703bb.m32849h(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31773z(m32849h);
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m31923v(obj, i3)) {
                        m31798a = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a + 8;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m31923v(obj, i3)) {
                        m31798a2 = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a2 + 4;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m31923v(obj, i3)) {
                        m31798a5 = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a5 + 1;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m31923v(obj, i3)) {
                        break;
                    } else {
                        Object m32846k = C2703bb.m32846k(obj, j);
                        if (m32846k instanceof AbstractC2955r7) {
                            m31798a6 = AbstractC3062y7.m31798a(i4 << 3);
                            mo32153g = ((AbstractC2955r7) m32846k).mo32153g();
                            m31798a7 = AbstractC3062y7.m31798a(mo32153g);
                            i = m31798a6 + m31798a7 + mo32153g;
                            i2 += i;
                            break;
                        } else {
                            m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                            m31773z = AbstractC3062y7.m31800C((String) m32846k);
                            i = m31798a4 + m31773z;
                            i2 += i;
                        }
                    }
                case 9:
                    if (m31923v(obj, i3)) {
                        m32683Q = C2766fa.m32683Q(i4, C2703bb.m32846k(obj, j), m31931n(i3));
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m31923v(obj, i3)) {
                        m31798a6 = AbstractC3062y7.m31798a(i4 << 3);
                        mo32153g = ((AbstractC2955r7) C2703bb.m32846k(obj, j)).mo32153g();
                        m31798a7 = AbstractC3062y7.m31798a(mo32153g);
                        i = m31798a6 + m31798a7 + mo32153g;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m31923v(obj, i3)) {
                        int m32849h2 = C2703bb.m32849h(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31798a(m32849h2);
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m31923v(obj, i3)) {
                        int m32849h3 = C2703bb.m32849h(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31773z(m32849h3);
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m31923v(obj, i3)) {
                        m31798a2 = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a2 + 4;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m31923v(obj, i3)) {
                        m31798a = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a + 8;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m31923v(obj, i3)) {
                        int m32849h4 = C2703bb.m32849h(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31798a((m32849h4 >> 31) ^ (m32849h4 + m32849h4));
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m31923v(obj, i3)) {
                        long m32848i3 = C2703bb.m32848i(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31797b((m32848i3 >> 63) ^ (m32848i3 + m32848i3));
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m31923v(obj, i3)) {
                        m32683Q = AbstractC3062y7.m31774y(i4, (InterfaceC2973s9) C2703bb.m32846k(obj, j), m31931n(i3));
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m32683Q = C2766fa.m32690J(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 19:
                    m32683Q = C2766fa.m32692H(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 20:
                    m32683Q = C2766fa.m32685O(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 21:
                    m32683Q = C2766fa.m32674Z(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 22:
                    m32683Q = C2766fa.m32687M(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 23:
                    m32683Q = C2766fa.m32690J(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 24:
                    m32683Q = C2766fa.m32692H(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 25:
                    m32683Q = C2766fa.m32699A(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 26:
                    m32683Q = C2766fa.m32677W(i4, (List) C2703bb.m32846k(obj, j));
                    i2 += m32683Q;
                    break;
                case 27:
                    m32683Q = C2766fa.m32682R(i4, (List) C2703bb.m32846k(obj, j), m31931n(i3));
                    i2 += m32683Q;
                    break;
                case 28:
                    m32683Q = C2766fa.m32695E(i4, (List) C2703bb.m32846k(obj, j));
                    i2 += m32683Q;
                    break;
                case 29:
                    m32683Q = C2766fa.m32676X(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 30:
                    m32683Q = C2766fa.m32694F(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 31:
                    m32683Q = C2766fa.m32692H(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 32:
                    m32683Q = C2766fa.m32690J(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 33:
                    m32683Q = C2766fa.m32681S(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 34:
                    m32683Q = C2766fa.m32679U(i4, (List) C2703bb.m32846k(obj, j), false);
                    i2 += m32683Q;
                    break;
                case 35:
                    m31773z = C2766fa.m32689K((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m31773z = C2766fa.m32691I((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m31773z = C2766fa.m32684P((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m31773z = C2766fa.m32672a0((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m31773z = C2766fa.m32686N((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m31773z = C2766fa.m32689K((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m31773z = C2766fa.m32691I((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m31773z = C2766fa.m32696D((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m31773z = C2766fa.m32675Y((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m31773z = C2766fa.m32693G((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m31773z = C2766fa.m32691I((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m31773z = C2766fa.m32689K((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m31773z = C2766fa.m32680T((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m31773z = C2766fa.m32678V((List) unsafe.getObject(obj, j));
                    if (m31773z > 0) {
                        m31799D = AbstractC3062y7.m31799D(i4);
                        m31798a8 = AbstractC3062y7.m31798a(m31773z);
                        m31798a4 = m31799D + m31798a8;
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m32683Q = C2766fa.m32688L(i4, (List) C2703bb.m32846k(obj, j), m31931n(i3));
                    i2 += m32683Q;
                    break;
                case 50:
                    C2877m9.m32466a(i4, C2703bb.m32846k(obj, j), m31930o(i3));
                    break;
                case 51:
                    if (m31920y(obj, i4, i3)) {
                        m31798a = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a + 8;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m31920y(obj, i4, i3)) {
                        m31798a2 = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a2 + 4;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m31920y(obj, i4, i3)) {
                        long m31933l = m31933l(obj, j);
                        m31798a3 = AbstractC3062y7.m31798a(i4 << 3);
                        m31797b = AbstractC3062y7.m31797b(m31933l);
                        i2 += m31798a3 + m31797b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m31920y(obj, i4, i3)) {
                        long m31933l2 = m31933l(obj, j);
                        m31798a3 = AbstractC3062y7.m31798a(i4 << 3);
                        m31797b = AbstractC3062y7.m31797b(m31933l2);
                        i2 += m31798a3 + m31797b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m31920y(obj, i4, i3)) {
                        int m31944L = m31944L(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31773z(m31944L);
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m31920y(obj, i4, i3)) {
                        m31798a = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a + 8;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m31920y(obj, i4, i3)) {
                        m31798a2 = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a2 + 4;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m31920y(obj, i4, i3)) {
                        m31798a5 = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a5 + 1;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m31920y(obj, i4, i3)) {
                        break;
                    } else {
                        Object m32846k2 = C2703bb.m32846k(obj, j);
                        if (m32846k2 instanceof AbstractC2955r7) {
                            m31798a6 = AbstractC3062y7.m31798a(i4 << 3);
                            mo32153g = ((AbstractC2955r7) m32846k2).mo32153g();
                            m31798a7 = AbstractC3062y7.m31798a(mo32153g);
                            i = m31798a6 + m31798a7 + mo32153g;
                            i2 += i;
                            break;
                        } else {
                            m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                            m31773z = AbstractC3062y7.m31800C((String) m32846k2);
                            i = m31798a4 + m31773z;
                            i2 += i;
                        }
                    }
                case 60:
                    if (m31920y(obj, i4, i3)) {
                        m32683Q = C2766fa.m32683Q(i4, C2703bb.m32846k(obj, j), m31931n(i3));
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m31920y(obj, i4, i3)) {
                        m31798a6 = AbstractC3062y7.m31798a(i4 << 3);
                        mo32153g = ((AbstractC2955r7) C2703bb.m32846k(obj, j)).mo32153g();
                        m31798a7 = AbstractC3062y7.m31798a(mo32153g);
                        i = m31798a6 + m31798a7 + mo32153g;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m31920y(obj, i4, i3)) {
                        int m31944L2 = m31944L(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31798a(m31944L2);
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m31920y(obj, i4, i3)) {
                        int m31944L3 = m31944L(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31773z(m31944L3);
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m31920y(obj, i4, i3)) {
                        m31798a2 = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a2 + 4;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m31920y(obj, i4, i3)) {
                        m31798a = AbstractC3062y7.m31798a(i4 << 3);
                        m32683Q = m31798a + 8;
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m31920y(obj, i4, i3)) {
                        int m31944L4 = m31944L(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31798a((m31944L4 >> 31) ^ (m31944L4 + m31944L4));
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m31920y(obj, i4, i3)) {
                        long m31933l3 = m31933l(obj, j);
                        m31798a4 = AbstractC3062y7.m31798a(i4 << 3);
                        m31773z = AbstractC3062y7.m31797b((m31933l3 >> 63) ^ (m31933l3 + m31933l3));
                        i = m31798a4 + m31773z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m31920y(obj, i4, i3)) {
                        m32683Q = AbstractC3062y7.m31774y(i4, (InterfaceC2973s9) C2703bb.m32846k(obj, j), m31931n(i3));
                        i2 += m32683Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC2958ra abstractC2958ra = this.f8058l;
        return i2 + abstractC2958ra.mo32061a(abstractC2958ra.mo32059c(obj));
    }

    /* renamed from: L */
    private static int m31944L(Object obj, long j) {
        return ((Integer) C2703bb.m32846k(obj, j)).intValue();
    }

    /* renamed from: M */
    private final int m31943M(Object obj, byte[] bArr, int i, int i2, int i3, long j, C2747e7 c2747e7) throws IOException {
        Unsafe unsafe = f8046p;
        Object m31930o = m31930o(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C2861l9) object).m32482j()) {
            C2861l9 m32485d = C2861l9.m32486b().m32485d();
            C2877m9.m32465b(m32485d, object);
            unsafe.putObject(obj, j, m32485d);
        }
        C2845k9 c2845k9 = (C2845k9) m31930o;
        throw null;
    }

    /* renamed from: N */
    private final int m31942N(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C2747e7 c2747e7) throws IOException {
        Unsafe unsafe = f8046p;
        long j2 = this.f8047a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(C2763f7.m32707n(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(C2763f7.m32719b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m32708m = C2763f7.m32708m(bArr, i, c2747e7);
                    unsafe.putObject(obj, j, Long.valueOf(c2747e7.f7722b));
                    unsafe.putInt(obj, j2, i4);
                    return m32708m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m32711j = C2763f7.m32711j(bArr, i, c2747e7);
                    unsafe.putObject(obj, j, Integer.valueOf(c2747e7.f7721a));
                    unsafe.putInt(obj, j2, i4);
                    return m32711j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(C2763f7.m32707n(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(C2763f7.m32719b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m32708m2 = C2763f7.m32708m(bArr, i, c2747e7);
                    unsafe.putObject(obj, j, Boolean.valueOf(c2747e7.f7722b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m32708m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m32711j2 = C2763f7.m32711j(bArr, i, c2747e7);
                    int i9 = c2747e7.f7721a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, BuildConfig.VERSION_NAME);
                    } else if ((i6 & 536870912) != 0 && !C2783gb.m32610f(bArr, m32711j2, m32711j2 + i9)) {
                        throw zzkh.m31638c();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m32711j2, i9, C3048x8.f8089a));
                        m32711j2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m32711j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m32717d = C2763f7.m32717d(m31931n(i8), bArr, i, i2, c2747e7);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, c2747e7.f7723c);
                    } else {
                        unsafe.putObject(obj, j, C3048x8.m31823g(object, c2747e7.f7723c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m32717d;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m32720a = C2763f7.m32720a(bArr, i, c2747e7);
                    unsafe.putObject(obj, j, c2747e7.f7723c);
                    unsafe.putInt(obj, j2, i4);
                    return m32720a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m32711j3 = C2763f7.m32711j(bArr, i, c2747e7);
                    int i10 = c2747e7.f7721a;
                    InterfaceC2988t8 m31932m = m31932m(i8);
                    if (m31932m != null && !m31932m.mo31842e(i10)) {
                        m31951E(obj).m32101h(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m32711j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m32711j4 = C2763f7.m32711j(bArr, i, c2747e7);
                    unsafe.putObject(obj, j, Integer.valueOf(C3017v7.m31959a(c2747e7.f7721a)));
                    unsafe.putInt(obj, j2, i4);
                    return m32711j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m32708m3 = C2763f7.m32708m(bArr, i, c2747e7);
                    unsafe.putObject(obj, j, Long.valueOf(C3017v7.m31958b(c2747e7.f7722b)));
                    unsafe.putInt(obj, j2, i4);
                    return m32708m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m32718c = C2763f7.m32718c(m31931n(i8), bArr, i, i2, (i3 & (-8)) | 4, c2747e7);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, c2747e7.f7723c);
                    } else {
                        unsafe.putObject(obj, j, C3048x8.m31823g(object2, c2747e7.f7723c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m32718c;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d9, code lost:
        if (r0 != r5) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02db, code lost:
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r10 = r19;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02f1, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0322, code lost:
        if (r0 != r15) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0345, code lost:
        if (r0 != r15) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int m31941O(java.lang.Object r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.measurement.C2747e7 r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3019v9.m31941O(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.e7):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int m31940P(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.C2747e7 r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3019v9.m31940P(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.e7):int");
    }

    /* renamed from: Q */
    private final int m31939Q(int i) {
        if (i < this.f8049c || i > this.f8050d) {
            return -1;
        }
        return m31936T(i, 0);
    }

    /* renamed from: R */
    private final int m31938R(int i, int i2) {
        if (i < this.f8049c || i > this.f8050d) {
            return -1;
        }
        return m31936T(i, i2);
    }

    /* renamed from: S */
    private final int m31937S(int i) {
        return this.f8047a[i + 2];
    }

    /* renamed from: T */
    private final int m31936T(int i, int i2) {
        int length = (this.f8047a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f8047a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static int m31935j(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: k */
    private final int m31934k(int i) {
        return this.f8047a[i + 1];
    }

    /* renamed from: l */
    private static long m31933l(Object obj, long j) {
        return ((Long) C2703bb.m32846k(obj, j)).longValue();
    }

    /* renamed from: m */
    private final InterfaceC2988t8 m31932m(int i) {
        int i2 = i / 3;
        return (InterfaceC2988t8) this.f8048b[i2 + i2 + 1];
    }

    /* renamed from: n */
    private final InterfaceC2734da m31931n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC2734da interfaceC2734da = (InterfaceC2734da) this.f8048b[i3];
        if (interfaceC2734da != null) {
            return interfaceC2734da;
        }
        InterfaceC2734da m32914b = C2686aa.m32915a().m32914b((Class) this.f8048b[i3 + 1]);
        this.f8048b[i3] = m32914b;
        return m32914b;
    }

    /* renamed from: o */
    private final Object m31930o(int i) {
        int i2 = i / 3;
        return this.f8048b[i2 + i2];
    }

    /* renamed from: p */
    private static Field m31929p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: q */
    private final void m31928q(Object obj, Object obj2, int i) {
        long m31934k = m31934k(i) & 1048575;
        if (m31923v(obj2, i)) {
            Object m32846k = C2703bb.m32846k(obj, m31934k);
            Object m32846k2 = C2703bb.m32846k(obj2, m31934k);
            if (m32846k != null && m32846k2 != null) {
                C2703bb.m32833x(obj, m31934k, C3048x8.m31823g(m32846k, m32846k2));
                m31926s(obj, i);
            } else if (m32846k2 != null) {
                C2703bb.m32833x(obj, m31934k, m32846k2);
                m31926s(obj, i);
            }
        }
    }

    /* renamed from: r */
    private final void m31927r(Object obj, Object obj2, int i) {
        int m31934k = m31934k(i);
        int i2 = this.f8047a[i];
        long j = m31934k & 1048575;
        if (m31920y(obj2, i2, i)) {
            Object m32846k = m31920y(obj, i2, i) ? C2703bb.m32846k(obj, j) : null;
            Object m32846k2 = C2703bb.m32846k(obj2, j);
            if (m32846k != null && m32846k2 != null) {
                C2703bb.m32833x(obj, j, C3048x8.m31823g(m32846k, m32846k2));
                m31925t(obj, i2, i);
            } else if (m32846k2 != null) {
                C2703bb.m32833x(obj, j, m32846k2);
                m31925t(obj, i2, i);
            }
        }
    }

    /* renamed from: s */
    private final void m31926s(Object obj, int i) {
        int m31937S = m31937S(i);
        long j = 1048575 & m31937S;
        if (j == 1048575) {
            return;
        }
        C2703bb.m32835v(obj, j, (1 << (m31937S >>> 20)) | C2703bb.m32849h(obj, j));
    }

    /* renamed from: t */
    private final void m31925t(Object obj, int i, int i2) {
        C2703bb.m32835v(obj, m31937S(i2) & 1048575, i);
    }

    /* renamed from: u */
    private final boolean m31924u(Object obj, Object obj2, int i) {
        return m31923v(obj, i) == m31923v(obj2, i);
    }

    /* renamed from: v */
    private final boolean m31923v(Object obj, int i) {
        int m31937S = m31937S(i);
        long j = m31937S & 1048575;
        if (j != 1048575) {
            return (C2703bb.m32849h(obj, j) & (1 << (m31937S >>> 20))) != 0;
        }
        int m31934k = m31934k(i);
        long j2 = m31934k & 1048575;
        switch (m31935j(m31934k)) {
            case 0:
                return Double.doubleToRawLongBits(C2703bb.m32851f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(C2703bb.m32850g(obj, j2)) != 0;
            case 2:
                return C2703bb.m32848i(obj, j2) != 0;
            case 3:
                return C2703bb.m32848i(obj, j2) != 0;
            case 4:
                return C2703bb.m32849h(obj, j2) != 0;
            case 5:
                return C2703bb.m32848i(obj, j2) != 0;
            case 6:
                return C2703bb.m32849h(obj, j2) != 0;
            case 7:
                return C2703bb.m32860B(obj, j2);
            case 8:
                Object m32846k = C2703bb.m32846k(obj, j2);
                if (m32846k instanceof String) {
                    return !((String) m32846k).isEmpty();
                } else if (m32846k instanceof AbstractC2955r7) {
                    return !AbstractC2955r7.f7969x.equals(m32846k);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return C2703bb.m32846k(obj, j2) != null;
            case 10:
                return !AbstractC2955r7.f7969x.equals(C2703bb.m32846k(obj, j2));
            case 11:
                return C2703bb.m32849h(obj, j2) != 0;
            case 12:
                return C2703bb.m32849h(obj, j2) != 0;
            case 13:
                return C2703bb.m32849h(obj, j2) != 0;
            case 14:
                return C2703bb.m32848i(obj, j2) != 0;
            case 15:
                return C2703bb.m32849h(obj, j2) != 0;
            case 16:
                return C2703bb.m32848i(obj, j2) != 0;
            case 17:
                return C2703bb.m32846k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: w */
    private final boolean m31922w(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m31923v(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: x */
    private static boolean m31921x(Object obj, int i, InterfaceC2734da interfaceC2734da) {
        return interfaceC2734da.mo31904b(C2703bb.m32846k(obj, i & 1048575));
    }

    /* renamed from: y */
    private final boolean m31920y(Object obj, int i, int i2) {
        return C2703bb.m32849h(obj, (long) (m31937S(i2) & 1048575)) == i;
    }

    /* renamed from: z */
    private static boolean m31919z(Object obj, long j) {
        return ((Boolean) C2703bb.m32846k(obj, j)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final int m31952D(Object obj, byte[] bArr, int i, int i2, int i3, C2747e7 c2747e7) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        C3019v9<T> c3019v9;
        byte b;
        int m31939Q;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        C2747e7 c2747e72;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C3019v9<T> c3019v92 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i21 = i2;
        int i22 = i3;
        C2747e7 c2747e73 = c2747e7;
        Unsafe unsafe2 = f8046p;
        int i23 = i;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        int i28 = 1048575;
        while (true) {
            if (i23 < i21) {
                int i29 = i23 + 1;
                byte b2 = bArr2[i23];
                if (b2 < 0) {
                    int m32710k = C2763f7.m32710k(b2, bArr2, i29, c2747e73);
                    b = c2747e73.f7721a;
                    i29 = m32710k;
                } else {
                    b = b2;
                }
                int i30 = b >>> 3;
                int i31 = b & 7;
                if (i30 > i27) {
                    m31939Q = c3019v92.m31938R(i30, i25 / 3);
                } else {
                    m31939Q = c3019v92.m31939Q(i30);
                }
                if (m31939Q == -1) {
                    i5 = i30;
                    i6 = i29;
                    i7 = b;
                    i8 = i26;
                    unsafe = unsafe2;
                    i4 = i22;
                    i9 = 0;
                } else {
                    int[] iArr = c3019v92.f8047a;
                    int i32 = iArr[m31939Q + 1];
                    int m31935j = m31935j(i32);
                    int i33 = i29;
                    long j = i32 & 1048575;
                    if (m31935j <= 17) {
                        int i34 = iArr[m31939Q + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i28) {
                            i11 = b;
                            if (i28 != 1048575) {
                                unsafe2.putInt(obj4, i28, i26);
                            }
                            i26 = unsafe2.getInt(obj4, i36);
                            i12 = i36;
                        } else {
                            i11 = b;
                            i12 = i28;
                        }
                        int i37 = i26;
                        switch (m31935j) {
                            case 0:
                                i13 = m31939Q;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 1) {
                                    C2703bb.m32837t(obj4, j, Double.longBitsToDouble(C2763f7.m32707n(bArr2, i14)));
                                    i23 = i14 + 8;
                                    i26 = i37 | i35;
                                    i27 = i5;
                                    i22 = i3;
                                    i25 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 1:
                                i13 = m31939Q;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 5) {
                                    C2703bb.m32836u(obj4, j, Float.intBitsToFloat(C2763f7.m32719b(bArr2, i14)));
                                    i23 = i14 + 4;
                                    i26 = i37 | i35;
                                    i27 = i5;
                                    i22 = i3;
                                    i25 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                i13 = m31939Q;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 0) {
                                    int m32708m = C2763f7.m32708m(bArr2, i14, c2747e73);
                                    unsafe2.putLong(obj, j, c2747e73.f7722b);
                                    i26 = i37 | i35;
                                    i27 = i5;
                                    i22 = i3;
                                    i23 = m32708m;
                                    i25 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 4:
                            case 11:
                                i13 = m31939Q;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 0) {
                                    i23 = C2763f7.m32711j(bArr2, i14, c2747e73);
                                    unsafe2.putInt(obj4, j, c2747e73.f7721a);
                                    i26 = i37 | i35;
                                    i27 = i5;
                                    i22 = i3;
                                    i25 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                int i38 = i11;
                                i5 = i30;
                                if (i31 == 1) {
                                    i13 = m31939Q;
                                    i11 = i38;
                                    i14 = i33;
                                    unsafe2.putLong(obj, j, C2763f7.m32707n(bArr2, i33));
                                    i23 = i14 + 8;
                                    i26 = i37 | i35;
                                    i27 = i5;
                                    i22 = i3;
                                    i25 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i13 = m31939Q;
                                    i11 = i38;
                                    i33 = i33;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = i11;
                                i5 = i30;
                                i16 = i33;
                                if (i31 == 5) {
                                    unsafe2.putInt(obj4, j, C2763f7.m32719b(bArr2, i16));
                                    i23 = i16 + 4;
                                    i26 = i37 | i35;
                                    i25 = m31939Q;
                                    i24 = i15;
                                    i28 = i12;
                                    i27 = i5;
                                    i22 = i3;
                                    break;
                                } else {
                                    i13 = m31939Q;
                                    i33 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 7:
                                i15 = i11;
                                i5 = i30;
                                i16 = i33;
                                if (i31 == 0) {
                                    i23 = C2763f7.m32708m(bArr2, i16, c2747e73);
                                    C2703bb.m32839r(obj4, j, c2747e73.f7722b != 0);
                                    i26 = i37 | i35;
                                    i25 = m31939Q;
                                    i24 = i15;
                                    i28 = i12;
                                    i27 = i5;
                                    i22 = i3;
                                    break;
                                } else {
                                    i13 = m31939Q;
                                    i33 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 8:
                                i15 = i11;
                                i5 = i30;
                                i16 = i33;
                                if (i31 == 2) {
                                    if ((536870912 & i32) == 0) {
                                        i23 = C2763f7.m32714g(bArr2, i16, c2747e73);
                                    } else {
                                        i23 = C2763f7.m32713h(bArr2, i16, c2747e73);
                                    }
                                    unsafe2.putObject(obj4, j, c2747e73.f7723c);
                                    i26 = i37 | i35;
                                    i25 = m31939Q;
                                    i24 = i15;
                                    i28 = i12;
                                    i27 = i5;
                                    i22 = i3;
                                    break;
                                } else {
                                    i13 = m31939Q;
                                    i33 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 9:
                                i17 = m31939Q;
                                i15 = i11;
                                i5 = i30;
                                i18 = i33;
                                if (i31 == 2) {
                                    i23 = C2763f7.m32717d(c3019v92.m31931n(i17), bArr2, i18, i21, c2747e73);
                                    if ((i37 & i35) == 0) {
                                        unsafe2.putObject(obj4, j, c2747e73.f7723c);
                                    } else {
                                        unsafe2.putObject(obj4, j, C3048x8.m31823g(unsafe2.getObject(obj4, j), c2747e73.f7723c));
                                    }
                                    i26 = i37 | i35;
                                    i27 = i5;
                                    i25 = i17;
                                    i24 = i15;
                                    i28 = i12;
                                    i22 = i3;
                                    break;
                                } else {
                                    i33 = i18;
                                    i13 = i17;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 10:
                                i17 = m31939Q;
                                i15 = i11;
                                i5 = i30;
                                i18 = i33;
                                if (i31 == 2) {
                                    i23 = C2763f7.m32720a(bArr2, i18, c2747e73);
                                    unsafe2.putObject(obj4, j, c2747e73.f7723c);
                                    i26 = i37 | i35;
                                    i27 = i5;
                                    i25 = i17;
                                    i24 = i15;
                                    i28 = i12;
                                    i22 = i3;
                                    break;
                                } else {
                                    i33 = i18;
                                    i13 = i17;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 12:
                                i17 = m31939Q;
                                i15 = i11;
                                i5 = i30;
                                i18 = i33;
                                if (i31 == 0) {
                                    i23 = C2763f7.m32711j(bArr2, i18, c2747e73);
                                    int i39 = c2747e73.f7721a;
                                    InterfaceC2988t8 m31932m = c3019v92.m31932m(i17);
                                    if (m31932m != null && !m31932m.mo31842e(i39)) {
                                        m31951E(obj).m32101h(i15, Long.valueOf(i39));
                                        i27 = i5;
                                        i26 = i37;
                                        i25 = i17;
                                        i24 = i15;
                                        i28 = i12;
                                        i22 = i3;
                                    } else {
                                        unsafe2.putInt(obj4, j, i39);
                                        i26 = i37 | i35;
                                        i27 = i5;
                                        i25 = i17;
                                        i24 = i15;
                                        i28 = i12;
                                        i22 = i3;
                                        break;
                                    }
                                } else {
                                    i33 = i18;
                                    i13 = i17;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                i17 = m31939Q;
                                i15 = i11;
                                i5 = i30;
                                i18 = i33;
                                if (i31 == 0) {
                                    i23 = C2763f7.m32711j(bArr2, i18, c2747e73);
                                    unsafe2.putInt(obj4, j, C3017v7.m31959a(c2747e73.f7721a));
                                    i26 = i37 | i35;
                                    i27 = i5;
                                    i25 = i17;
                                    i24 = i15;
                                    i28 = i12;
                                    i22 = i3;
                                    break;
                                } else {
                                    i33 = i18;
                                    i13 = i17;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 16:
                                if (i31 == 0) {
                                    int m32708m2 = C2763f7.m32708m(bArr2, i33, c2747e73);
                                    i17 = m31939Q;
                                    i15 = i11;
                                    unsafe2.putLong(obj, j, C3017v7.m31958b(c2747e73.f7722b));
                                    i26 = i37 | i35;
                                    i27 = i30;
                                    i23 = m32708m2;
                                    i25 = i17;
                                    i24 = i15;
                                    i28 = i12;
                                    i22 = i3;
                                    break;
                                } else {
                                    i5 = i30;
                                    i13 = m31939Q;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            default:
                                i13 = m31939Q;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 3) {
                                    i23 = C2763f7.m32718c(c3019v92.m31931n(i13), bArr, i14, i2, (i5 << 3) | 4, c2747e7);
                                    if ((i37 & i35) == 0) {
                                        unsafe2.putObject(obj4, j, c2747e73.f7723c);
                                    } else {
                                        unsafe2.putObject(obj4, j, C3048x8.m31823g(unsafe2.getObject(obj4, j), c2747e73.f7723c));
                                    }
                                    i26 = i37 | i35;
                                    bArr2 = bArr;
                                    i27 = i5;
                                    i22 = i3;
                                    i25 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                        }
                    } else {
                        int i40 = m31939Q;
                        int i41 = b;
                        if (m31935j != 27) {
                            i8 = i26;
                            i19 = i28;
                            if (m31935j <= 49) {
                                i5 = i30;
                                unsafe = unsafe2;
                                i9 = i40;
                                i23 = m31940P(obj, bArr, i33, i2, i41, i30, i31, i40, i32, m31935j, j, c2747e7);
                                if (i23 != i33) {
                                    c3019v92 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i27 = i5;
                                    i21 = i2;
                                    i22 = i3;
                                    c2747e73 = c2747e7;
                                    i24 = i41;
                                    i25 = i9;
                                    i26 = i8;
                                    i28 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i6 = i23;
                                    i7 = i41;
                                    i28 = i19;
                                }
                            } else {
                                i5 = i30;
                                unsafe = unsafe2;
                                i20 = i33;
                                i9 = i40;
                                if (m31935j != 50) {
                                    i23 = m31942N(obj, bArr, i20, i2, i41, i5, i31, i32, m31935j, j, i9, c2747e7);
                                    if (i23 != i20) {
                                        c3019v92 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i27 = i5;
                                        i21 = i2;
                                        i22 = i3;
                                        c2747e73 = c2747e7;
                                        i24 = i41;
                                        i25 = i9;
                                        i26 = i8;
                                        i28 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i6 = i23;
                                        i7 = i41;
                                        i28 = i19;
                                    }
                                } else if (i31 == 2) {
                                    i23 = m31943M(obj, bArr, i20, i2, i9, j, c2747e7);
                                    if (i23 != i20) {
                                        c3019v92 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i27 = i5;
                                        i21 = i2;
                                        i22 = i3;
                                        c2747e73 = c2747e7;
                                        i24 = i41;
                                        i25 = i9;
                                        i26 = i8;
                                        i28 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i6 = i23;
                                        i7 = i41;
                                        i28 = i19;
                                    }
                                }
                            }
                        } else if (i31 == 2) {
                            InterfaceC3033w8 interfaceC3033w8 = (InterfaceC3033w8) unsafe2.getObject(obj4, j);
                            if (!interfaceC3033w8.mo31907a()) {
                                int size = interfaceC3033w8.size();
                                interfaceC3033w8 = interfaceC3033w8.mo31906k(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, interfaceC3033w8);
                            }
                            i24 = i41;
                            i12 = i28;
                            i23 = C2763f7.m32716e(c3019v92.m31931n(i40), i24, bArr, i33, i2, interfaceC3033w8, c2747e7);
                            bArr2 = bArr;
                            i22 = i3;
                            i27 = i30;
                            i25 = i40;
                            i26 = i26;
                            i28 = i12;
                            i21 = i2;
                        } else {
                            i8 = i26;
                            i19 = i28;
                            i5 = i30;
                            unsafe = unsafe2;
                            i20 = i33;
                            i9 = i40;
                        }
                        i4 = i3;
                        i6 = i20;
                        i7 = i41;
                        i28 = i19;
                    }
                }
                if (i7 != i4 || i4 == 0) {
                    if (this.f8052f) {
                        c2747e72 = c2747e7;
                        if (c2747e72.f7724d != C2732d8.m32783a()) {
                            i10 = i5;
                            if (c2747e72.f7724d.m32781c(this.f8051e, i10) == null) {
                                i23 = C2763f7.m32712i(i7, bArr, i6, i2, m31951E(obj), c2747e7);
                                obj3 = obj;
                                i21 = i2;
                                i24 = i7;
                                c3019v92 = this;
                                c2747e73 = c2747e72;
                                i27 = i10;
                                obj4 = obj3;
                                i25 = i9;
                                i26 = i8;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i22 = i4;
                            } else {
                                AbstractC2908o8 abstractC2908o8 = (AbstractC2908o8) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                            i10 = i5;
                        }
                    } else {
                        obj3 = obj;
                        i10 = i5;
                        c2747e72 = c2747e7;
                    }
                    i23 = C2763f7.m32712i(i7, bArr, i6, i2, m31951E(obj), c2747e7);
                    i21 = i2;
                    i24 = i7;
                    c3019v92 = this;
                    c2747e73 = c2747e72;
                    i27 = i10;
                    obj4 = obj3;
                    i25 = i9;
                    i26 = i8;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i22 = i4;
                } else {
                    c3019v9 = this;
                    obj2 = obj;
                    i23 = i6;
                    i24 = i7;
                    i26 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i22;
                obj2 = obj4;
                c3019v9 = c3019v92;
            }
        }
        if (i28 != 1048575) {
            unsafe.putInt(obj2, i28, i26);
        }
        for (int i42 = c3019v9.f8055i; i42 < c3019v9.f8056j; i42++) {
            int i43 = c3019v9.f8054h[i42];
            int i44 = c3019v9.f8047a[i43];
            Object m32846k = C2703bb.m32846k(obj2, c3019v9.m31934k(i43) & 1048575);
            if (m32846k != null && c3019v9.m31932m(i43) != null) {
                C2861l9 c2861l9 = (C2861l9) m32846k;
                C2845k9 c2845k9 = (C2845k9) c3019v9.m31930o(i43);
                throw null;
            }
        }
        if (i4 == 0) {
            if (i23 != i2) {
                throw zzkh.m31636e();
            }
        } else if (i23 > i2 || i24 != i4) {
            throw zzkh.m31636e();
        }
        return i23;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: a */
    public final void mo31905a(Object obj) {
        int i;
        int i2 = this.f8055i;
        while (true) {
            i = this.f8056j;
            if (i2 >= i) {
                break;
            }
            long m31934k = m31934k(this.f8054h[i2]) & 1048575;
            Object m32846k = C2703bb.m32846k(obj, m31934k);
            if (m32846k != null) {
                ((C2861l9) m32846k).m32484e();
                C2703bb.m32833x(obj, m31934k, m32846k);
            }
            i2++;
        }
        int length = this.f8054h.length;
        while (i < length) {
            this.f8057k.mo32703a(obj, this.f8054h[i]);
            i++;
        }
        this.f8058l.mo32055g(obj);
        if (this.f8052f) {
            this.f8059m.mo32705b(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: b */
    public final boolean mo31904b(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f8055i) {
            int i6 = this.f8054h[i5];
            int i7 = this.f8047a[i6];
            int m31934k = m31934k(i6);
            int i8 = this.f8047a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f8046p.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m31934k) != 0 && !m31922w(obj, i6, i, i2, i10)) {
                return false;
            }
            int m31935j = m31935j(m31934k);
            if (m31935j != 9 && m31935j != 17) {
                if (m31935j != 27) {
                    if (m31935j == 60 || m31935j == 68) {
                        if (m31920y(obj, i7, i6) && !m31921x(obj, m31934k, m31931n(i6))) {
                            return false;
                        }
                    } else if (m31935j != 49) {
                        if (m31935j == 50 && !((C2861l9) C2703bb.m32846k(obj, m31934k & 1048575)).isEmpty()) {
                            C2845k9 c2845k9 = (C2845k9) m31930o(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C2703bb.m32846k(obj, m31934k & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC2734da m31931n = m31931n(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m31931n.mo31904b(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m31922w(obj, i6, i, i2, i10) && !m31921x(obj, m31934k, m31931n(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f8052f) {
            this.f8059m.mo32706a(obj);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: c */
    public final void mo31903c(Object obj, byte[] bArr, int i, int i2, C2747e7 c2747e7) throws IOException {
        if (this.f8053g) {
            m31941O(obj, bArr, i, i2, c2747e7);
        } else {
            m31952D(obj, bArr, i, i2, 0, c2747e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: d */
    public final Object mo31902d() {
        return ((AbstractC2940q8) this.f8051e).mo31692z(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: e */
    public final int mo31901e(Object obj) {
        return this.f8053g ? m31945K(obj) : m31946J(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: f */
    public final void mo31900f(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f8047a.length; i += 3) {
            int m31934k = m31934k(i);
            long j = 1048575 & m31934k;
            int i2 = this.f8047a[i];
            switch (m31935j(m31934k)) {
                case 0:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32837t(obj, j, C2703bb.m32851f(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32836u(obj, j, C2703bb.m32850g(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32834w(obj, j, C2703bb.m32848i(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32834w(obj, j, C2703bb.m32848i(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32835v(obj, j, C2703bb.m32849h(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32834w(obj, j, C2703bb.m32848i(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32835v(obj, j, C2703bb.m32849h(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32839r(obj, j, C2703bb.m32860B(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32833x(obj, j, C2703bb.m32846k(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m31928q(obj, obj2, i);
                    break;
                case 10:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32833x(obj, j, C2703bb.m32846k(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32835v(obj, j, C2703bb.m32849h(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32835v(obj, j, C2703bb.m32849h(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32835v(obj, j, C2703bb.m32849h(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32834w(obj, j, C2703bb.m32848i(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32835v(obj, j, C2703bb.m32849h(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m31923v(obj2, i)) {
                        C2703bb.m32834w(obj, j, C2703bb.m32848i(obj2, j));
                        m31926s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m31928q(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f8057k.mo32702b(obj, obj2, j);
                    break;
                case 50:
                    C2766fa.m32663i(this.f8060n, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m31920y(obj2, i2, i)) {
                        C2703bb.m32833x(obj, j, C2703bb.m32846k(obj2, j));
                        m31925t(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m31927r(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m31920y(obj2, i2, i)) {
                        C2703bb.m32833x(obj, j, C2703bb.m32846k(obj2, j));
                        m31925t(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m31927r(obj, obj2, i);
                    break;
            }
        }
        C2766fa.m32666f(this.f8058l, obj, obj2);
        if (this.f8052f) {
            C2766fa.m32667e(this.f8059m, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: g */
    public final boolean mo31899g(Object obj, Object obj2) {
        boolean m32664h;
        int length = this.f8047a.length;
        for (int i = 0; i < length; i += 3) {
            int m31934k = m31934k(i);
            long j = m31934k & 1048575;
            switch (m31935j(m31934k)) {
                case 0:
                    if (m31924u(obj, obj2, i) && Double.doubleToLongBits(C2703bb.m32851f(obj, j)) == Double.doubleToLongBits(C2703bb.m32851f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m31924u(obj, obj2, i) && Float.floatToIntBits(C2703bb.m32850g(obj, j)) == Float.floatToIntBits(C2703bb.m32850g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m31924u(obj, obj2, i) && C2703bb.m32848i(obj, j) == C2703bb.m32848i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m31924u(obj, obj2, i) && C2703bb.m32848i(obj, j) == C2703bb.m32848i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m31924u(obj, obj2, i) && C2703bb.m32849h(obj, j) == C2703bb.m32849h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m31924u(obj, obj2, i) && C2703bb.m32848i(obj, j) == C2703bb.m32848i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m31924u(obj, obj2, i) && C2703bb.m32849h(obj, j) == C2703bb.m32849h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m31924u(obj, obj2, i) && C2703bb.m32860B(obj, j) == C2703bb.m32860B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m31924u(obj, obj2, i) && C2766fa.m32664h(C2703bb.m32846k(obj, j), C2703bb.m32846k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m31924u(obj, obj2, i) && C2766fa.m32664h(C2703bb.m32846k(obj, j), C2703bb.m32846k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m31924u(obj, obj2, i) && C2766fa.m32664h(C2703bb.m32846k(obj, j), C2703bb.m32846k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m31924u(obj, obj2, i) && C2703bb.m32849h(obj, j) == C2703bb.m32849h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m31924u(obj, obj2, i) && C2703bb.m32849h(obj, j) == C2703bb.m32849h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m31924u(obj, obj2, i) && C2703bb.m32849h(obj, j) == C2703bb.m32849h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m31924u(obj, obj2, i) && C2703bb.m32848i(obj, j) == C2703bb.m32848i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m31924u(obj, obj2, i) && C2703bb.m32849h(obj, j) == C2703bb.m32849h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m31924u(obj, obj2, i) && C2703bb.m32848i(obj, j) == C2703bb.m32848i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m31924u(obj, obj2, i) && C2766fa.m32664h(C2703bb.m32846k(obj, j), C2703bb.m32846k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    m32664h = C2766fa.m32664h(C2703bb.m32846k(obj, j), C2703bb.m32846k(obj2, j));
                    break;
                case 50:
                    m32664h = C2766fa.m32664h(C2703bb.m32846k(obj, j), C2703bb.m32846k(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long m31937S = m31937S(i) & 1048575;
                    if (C2703bb.m32849h(obj, m31937S) == C2703bb.m32849h(obj2, m31937S) && C2766fa.m32664h(C2703bb.m32846k(obj, j), C2703bb.m32846k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m32664h) {
                return false;
            }
        }
        if (this.f8058l.mo32059c(obj).equals(this.f8058l.mo32059c(obj2))) {
            if (this.f8052f) {
                this.f8059m.mo32706a(obj);
                this.f8059m.mo32706a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: h */
    public final void mo31898h(Object obj, C3077z7 c3077z7) throws IOException {
        if (!this.f8053g) {
            m31955A(obj, c3077z7);
        } else if (!this.f8052f) {
            int length = this.f8047a.length;
            for (int i = 0; i < length; i += 3) {
                int m31934k = m31934k(i);
                int i2 = this.f8047a[i];
                switch (m31935j(m31934k)) {
                    case 0:
                        if (m31923v(obj, i)) {
                            c3077z7.m31662q(i2, C2703bb.m32851f(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m31923v(obj, i)) {
                            c3077z7.m31653z(i2, C2703bb.m32850g(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m31923v(obj, i)) {
                            c3077z7.m31685E(i2, C2703bb.m32848i(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m31923v(obj, i)) {
                            c3077z7.m31669j(i2, C2703bb.m32848i(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m31923v(obj, i)) {
                            c3077z7.m31687C(i2, C2703bb.m32849h(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m31923v(obj, i)) {
                            c3077z7.m31655x(i2, C2703bb.m32848i(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m31923v(obj, i)) {
                            c3077z7.m31657v(i2, C2703bb.m32849h(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m31923v(obj, i)) {
                            c3077z7.m31666m(i2, C2703bb.m32860B(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m31923v(obj, i)) {
                            m31953C(i2, C2703bb.m32846k(obj, m31934k & 1048575), c3077z7);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m31923v(obj, i)) {
                            c3077z7.m31683G(i2, C2703bb.m32846k(obj, m31934k & 1048575), m31931n(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m31923v(obj, i)) {
                            c3077z7.m31664o(i2, (AbstractC2955r7) C2703bb.m32846k(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m31923v(obj, i)) {
                            c3077z7.m31671h(i2, C2703bb.m32849h(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m31923v(obj, i)) {
                            c3077z7.m31659t(i2, C2703bb.m32849h(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m31923v(obj, i)) {
                            c3077z7.m31682H(i2, C2703bb.m32849h(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m31923v(obj, i)) {
                            c3077z7.m31680J(i2, C2703bb.m32848i(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m31923v(obj, i)) {
                            c3077z7.m31678a(i2, C2703bb.m32849h(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m31923v(obj, i)) {
                            c3077z7.m31676c(i2, C2703bb.m32848i(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m31923v(obj, i)) {
                            c3077z7.m31688B(i2, C2703bb.m32846k(obj, m31934k & 1048575), m31931n(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        C2766fa.m32660l(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 19:
                        C2766fa.m32656p(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 20:
                        C2766fa.m32653s(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 21:
                        C2766fa.m32698B(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 22:
                        C2766fa.m32654r(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 23:
                        C2766fa.m32657o(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 24:
                        C2766fa.m32658n(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 25:
                        C2766fa.m32662j(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 26:
                        C2766fa.m32647y(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7);
                        break;
                    case 27:
                        C2766fa.m32652t(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, m31931n(i));
                        break;
                    case 28:
                        C2766fa.m32661k(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7);
                        break;
                    case 29:
                        C2766fa.m32646z(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 30:
                        C2766fa.m32659m(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 31:
                        C2766fa.m32651u(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 32:
                        C2766fa.m32650v(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 33:
                        C2766fa.m32649w(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 34:
                        C2766fa.m32648x(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, false);
                        break;
                    case 35:
                        C2766fa.m32660l(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 36:
                        C2766fa.m32656p(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 37:
                        C2766fa.m32653s(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 38:
                        C2766fa.m32698B(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 39:
                        C2766fa.m32654r(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 40:
                        C2766fa.m32657o(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 41:
                        C2766fa.m32658n(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 42:
                        C2766fa.m32662j(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 43:
                        C2766fa.m32646z(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 44:
                        C2766fa.m32659m(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 45:
                        C2766fa.m32651u(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 46:
                        C2766fa.m32650v(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 47:
                        C2766fa.m32649w(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 48:
                        C2766fa.m32648x(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, true);
                        break;
                    case 49:
                        C2766fa.m32655q(i2, (List) C2703bb.m32846k(obj, m31934k & 1048575), c3077z7, m31931n(i));
                        break;
                    case 50:
                        m31954B(c3077z7, i2, C2703bb.m32846k(obj, m31934k & 1048575), i);
                        break;
                    case 51:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31662q(i2, m31948H(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31653z(i2, m31947I(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31685E(i2, m31933l(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31669j(i2, m31933l(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31687C(i2, m31944L(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31655x(i2, m31933l(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31657v(i2, m31944L(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31666m(i2, m31919z(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m31920y(obj, i2, i)) {
                            m31953C(i2, C2703bb.m32846k(obj, m31934k & 1048575), c3077z7);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31683G(i2, C2703bb.m32846k(obj, m31934k & 1048575), m31931n(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31664o(i2, (AbstractC2955r7) C2703bb.m32846k(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31671h(i2, m31944L(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31659t(i2, m31944L(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31682H(i2, m31944L(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31680J(i2, m31933l(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31678a(i2, m31944L(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31676c(i2, m31933l(obj, m31934k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m31920y(obj, i2, i)) {
                            c3077z7.m31688B(i2, C2703bb.m32846k(obj, m31934k & 1048575), m31931n(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC2958ra abstractC2958ra = this.f8058l;
            abstractC2958ra.mo32053i(abstractC2958ra.mo32059c(obj), c3077z7);
        } else {
            this.f8059m.mo32706a(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: i */
    public final int mo31897i(Object obj) {
        int i;
        int m31827c;
        int length = this.f8047a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m31934k = m31934k(i3);
            int i4 = this.f8047a[i3];
            long j = 1048575 & m31934k;
            int i5 = 37;
            switch (m31935j(m31934k)) {
                case 0:
                    i = i2 * 53;
                    m31827c = C3048x8.m31827c(Double.doubleToLongBits(C2703bb.m32851f(obj, j)));
                    i2 = i + m31827c;
                    break;
                case 1:
                    i = i2 * 53;
                    m31827c = Float.floatToIntBits(C2703bb.m32850g(obj, j));
                    i2 = i + m31827c;
                    break;
                case 2:
                    i = i2 * 53;
                    m31827c = C3048x8.m31827c(C2703bb.m32848i(obj, j));
                    i2 = i + m31827c;
                    break;
                case 3:
                    i = i2 * 53;
                    m31827c = C3048x8.m31827c(C2703bb.m32848i(obj, j));
                    i2 = i + m31827c;
                    break;
                case 4:
                    i = i2 * 53;
                    m31827c = C2703bb.m32849h(obj, j);
                    i2 = i + m31827c;
                    break;
                case 5:
                    i = i2 * 53;
                    m31827c = C3048x8.m31827c(C2703bb.m32848i(obj, j));
                    i2 = i + m31827c;
                    break;
                case 6:
                    i = i2 * 53;
                    m31827c = C2703bb.m32849h(obj, j);
                    i2 = i + m31827c;
                    break;
                case 7:
                    i = i2 * 53;
                    m31827c = C3048x8.m31829a(C2703bb.m32860B(obj, j));
                    i2 = i + m31827c;
                    break;
                case 8:
                    i = i2 * 53;
                    m31827c = ((String) C2703bb.m32846k(obj, j)).hashCode();
                    i2 = i + m31827c;
                    break;
                case 9:
                    Object m32846k = C2703bb.m32846k(obj, j);
                    if (m32846k != null) {
                        i5 = m32846k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m31827c = C2703bb.m32846k(obj, j).hashCode();
                    i2 = i + m31827c;
                    break;
                case 11:
                    i = i2 * 53;
                    m31827c = C2703bb.m32849h(obj, j);
                    i2 = i + m31827c;
                    break;
                case 12:
                    i = i2 * 53;
                    m31827c = C2703bb.m32849h(obj, j);
                    i2 = i + m31827c;
                    break;
                case 13:
                    i = i2 * 53;
                    m31827c = C2703bb.m32849h(obj, j);
                    i2 = i + m31827c;
                    break;
                case 14:
                    i = i2 * 53;
                    m31827c = C3048x8.m31827c(C2703bb.m32848i(obj, j));
                    i2 = i + m31827c;
                    break;
                case 15:
                    i = i2 * 53;
                    m31827c = C2703bb.m32849h(obj, j);
                    i2 = i + m31827c;
                    break;
                case 16:
                    i = i2 * 53;
                    m31827c = C3048x8.m31827c(C2703bb.m32848i(obj, j));
                    i2 = i + m31827c;
                    break;
                case 17:
                    Object m32846k2 = C2703bb.m32846k(obj, j);
                    if (m32846k2 != null) {
                        i5 = m32846k2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    m31827c = C2703bb.m32846k(obj, j).hashCode();
                    i2 = i + m31827c;
                    break;
                case 50:
                    i = i2 * 53;
                    m31827c = C2703bb.m32846k(obj, j).hashCode();
                    i2 = i + m31827c;
                    break;
                case 51:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C3048x8.m31827c(Double.doubleToLongBits(m31948H(obj, j)));
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = Float.floatToIntBits(m31947I(obj, j));
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C3048x8.m31827c(m31933l(obj, j));
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C3048x8.m31827c(m31933l(obj, j));
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = m31944L(obj, j);
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C3048x8.m31827c(m31933l(obj, j));
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = m31944L(obj, j);
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C3048x8.m31829a(m31919z(obj, j));
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = ((String) C2703bb.m32846k(obj, j)).hashCode();
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C2703bb.m32846k(obj, j).hashCode();
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C2703bb.m32846k(obj, j).hashCode();
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = m31944L(obj, j);
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = m31944L(obj, j);
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = m31944L(obj, j);
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C3048x8.m31827c(m31933l(obj, j));
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = m31944L(obj, j);
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C3048x8.m31827c(m31933l(obj, j));
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m31920y(obj, i4, i3)) {
                        i = i2 * 53;
                        m31827c = C2703bb.m32846k(obj, j).hashCode();
                        i2 = i + m31827c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f8058l.mo32059c(obj).hashCode();
        if (this.f8052f) {
            this.f8059m.mo32706a(obj);
            throw null;
        }
        return hashCode;
    }
}
