package p104fc;

import com.google.zxing.C4411o;
import com.google.zxing.EnumC4399d;
import com.google.zxing.InterfaceC4412p;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: fc.e */
/* loaded from: classes2.dex */
public class C5449e {

    /* renamed from: f */
    private static final C5451b f15351f = new C5451b();

    /* renamed from: a */
    private final C7155b f15352a;

    /* renamed from: c */
    private boolean f15354c;

    /* renamed from: e */
    private final InterfaceC4412p f15356e;

    /* renamed from: b */
    private final List<C5448d> f15353b = new ArrayList();

    /* renamed from: d */
    private final int[] f15355d = new int[5];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FinderPatternFinder.java */
    /* renamed from: fc.e$b */
    /* loaded from: classes2.dex */
    public static final class C5451b implements Serializable, Comparator<C5448d> {
        private C5451b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C5448d c5448d, C5448d c5448d2) {
            return Float.compare(c5448d.m24323i(), c5448d2.m24323i());
        }
    }

    public C5449e(C7155b c7155b, InterfaceC4412p interfaceC4412p) {
        this.f15352a = c7155b;
        this.f15356e = interfaceC4412p;
    }

    /* renamed from: a */
    private static float m24322a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* renamed from: c */
    private boolean m24320c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] m24313j = m24313j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f15352a.m19059e(i2 - i6, i - i6)) {
            m24313j[2] = m24313j[2] + 1;
            i6++;
        }
        if (m24313j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f15352a.m19059e(i2 - i6, i - i6)) {
            m24313j[1] = m24313j[1] + 1;
            i6++;
        }
        if (m24313j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f15352a.m19059e(i2 - i6, i - i6)) {
            m24313j[0] = m24313j[0] + 1;
            i6++;
        }
        if (m24313j[0] == 0) {
            return false;
        }
        int m19056i = this.f15352a.m19056i();
        int m19053l = this.f15352a.m19053l();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= m19056i || (i5 = i2 + i7) >= m19053l || !this.f15352a.m19059e(i5, i8)) {
                break;
            }
            m24313j[2] = m24313j[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= m19056i || (i4 = i2 + i7) >= m19053l || this.f15352a.m19059e(i4, i9)) {
                break;
            }
            m24313j[3] = m24313j[3] + 1;
            i7++;
        }
        if (m24313j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= m19056i || (i3 = i2 + i7) >= m19053l || !this.f15352a.m19059e(i3, i10)) {
                break;
            }
            m24313j[4] = m24313j[4] + 1;
            i7++;
        }
        if (m24313j[4] == 0) {
            return false;
        }
        return m24314i(m24313j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r2[1] <= r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r3 < 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r0.m19059e(r3, r12) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r2[0] > r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        r2[0] = r2[0] + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r2[0] <= r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r11 >= r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (r0.m19059e(r11, r12) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        r2[2] = r2[2] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        if (r11 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
        if (r11 >= r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (r0.m19059e(r11, r12) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
        if (r2[3] >= r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
        r2[3] = r2[3] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
        if (r11 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        if (r0.m19059e(r11, r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r2[4] >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        r2[4] = r2[4] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
        if (r2[4] < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b7, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r2[4]) - r14) * 5) < r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00be, code lost:
        if (m24315h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
        return m24322a(r2, r11);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m24319d(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104fc.C5449e.m24319d(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r2[1] <= r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r3 < 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r0.m19059e(r12, r3) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r2[0] > r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        r2[0] = r2[0] + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r2[0] <= r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r11 >= r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (r0.m19059e(r12, r11) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        r2[2] = r2[2] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        if (r11 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
        if (r11 >= r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (r0.m19059e(r12, r11) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
        if (r2[3] >= r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
        r2[3] = r2[3] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
        if (r11 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        if (r0.m19059e(r12, r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r2[4] >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        r2[4] = r2[4] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
        if (r2[4] < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r2[4]) - r14) * 5) < (r14 * 2)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
        if (m24315h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c5, code lost:
        return m24322a(r2, r11);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m24318e(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104fc.C5449e.m24318e(int, int, int, int):float");
    }

    /* renamed from: g */
    private int m24316g() {
        if (this.f15353b.size() <= 1) {
            return 0;
        }
        C5448d c5448d = null;
        for (C5448d c5448d2 : this.f15353b) {
            if (c5448d2.m24324h() >= 2) {
                if (c5448d != null) {
                    this.f15354c = true;
                    return ((int) (Math.abs(c5448d.m27640c() - c5448d2.m27640c()) - Math.abs(c5448d.m27639d() - c5448d2.m27639d()))) / 2;
                }
                c5448d = c5448d2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    protected static boolean m24315h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: i */
    protected static boolean m24314i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: j */
    private int[] m24313j() {
        m24321b(this.f15355d);
        return this.f15355d;
    }

    /* renamed from: l */
    private boolean m24311l() {
        int size = this.f15353b.size();
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        for (C5448d c5448d : this.f15353b) {
            if (c5448d.m24324h() >= 2) {
                i++;
                f2 += c5448d.m24323i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        for (C5448d c5448d2 : this.f15353b) {
            f += Math.abs(c5448d2.m24323i() - f3);
        }
        return f <= f2 * 0.05f;
    }

    /* renamed from: m */
    private C5448d[] m24310m() throws NotFoundException {
        if (this.f15353b.size() >= 3) {
            this.f15353b.sort(f15351f);
            double[] dArr = new double[3];
            C5448d[] c5448dArr = new C5448d[3];
            int i = 0;
            double d = Double.MAX_VALUE;
            while (i < this.f15353b.size() - 2) {
                C5448d c5448d = this.f15353b.get(i);
                float m24323i = c5448d.m24323i();
                i++;
                int i2 = i;
                while (i2 < this.f15353b.size() - 1) {
                    C5448d c5448d2 = this.f15353b.get(i2);
                    double m24308o = m24308o(c5448d, c5448d2);
                    i2++;
                    for (int i3 = i2; i3 < this.f15353b.size(); i3++) {
                        C5448d c5448d3 = this.f15353b.get(i3);
                        if (c5448d3.m24323i() <= 1.4f * m24323i) {
                            dArr[0] = m24308o;
                            dArr[1] = m24308o(c5448d2, c5448d3);
                            dArr[2] = m24308o(c5448d, c5448d3);
                            Arrays.sort(dArr);
                            double abs = Math.abs(dArr[2] - (dArr[1] * 2.0d)) + Math.abs(dArr[2] - (dArr[0] * 2.0d));
                            if (abs < d) {
                                c5448dArr[0] = c5448d;
                                c5448dArr[1] = c5448d2;
                                c5448dArr[2] = c5448d3;
                                d = abs;
                            }
                        }
                    }
                }
            }
            if (d != Double.MAX_VALUE) {
                return c5448dArr;
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: o */
    private static double m24308o(C5448d c5448d, C5448d c5448d2) {
        double m27640c = c5448d.m27640c() - c5448d2.m27640c();
        double m27639d = c5448d.m27639d() - c5448d2.m27639d();
        return (m27640c * m27640c) + (m27639d * m27639d);
    }

    /* renamed from: b */
    protected final void m24321b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C5452f m24317f(Map<EnumC4399d, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(EnumC4399d.TRY_HARDER);
        int m19056i = this.f15352a.m19056i();
        int m19053l = this.f15352a.m19053l();
        int i = (m19056i * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < m19056i && !z2) {
            m24321b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < m19053l) {
                if (this.f15352a.m19059e(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (m24315h(iArr)) {
                        if (m24312k(iArr, i2, i3)) {
                            if (this.f15354c) {
                                z2 = m24311l();
                            } else {
                                int m24316g = m24316g();
                                if (m24316g > iArr[2]) {
                                    i2 += (m24316g - iArr[2]) - 2;
                                    i3 = m19053l - 1;
                                }
                            }
                            m24321b(iArr);
                            i4 = 0;
                            i = 2;
                        } else {
                            m24309n(iArr);
                        }
                    } else {
                        m24309n(iArr);
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m24315h(iArr) && m24312k(iArr, i2, m19053l)) {
                i = iArr[0];
                if (this.f15354c) {
                    z2 = m24311l();
                }
            }
            i2 += i;
        }
        C5448d[] m24310m = m24310m();
        C4411o.m27638e(m24310m);
        return new C5452f(m24310m);
    }

    /* renamed from: k */
    protected final boolean m24312k(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m24322a = (int) m24322a(iArr, i2);
        float m24318e = m24318e(i, m24322a, iArr[2], i3);
        if (!Float.isNaN(m24318e)) {
            int i4 = (int) m24318e;
            float m24319d = m24319d(m24322a, i4, iArr[2], i3);
            if (!Float.isNaN(m24319d) && m24320c(i4, (int) m24319d)) {
                float f = i3 / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f15353b.size()) {
                        break;
                    }
                    C5448d c5448d = this.f15353b.get(i5);
                    if (c5448d.m24326f(f, m24318e, m24319d)) {
                        this.f15353b.set(i5, c5448d.m24325g(m24318e, m24319d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C5448d c5448d2 = new C5448d(m24319d, m24318e, f);
                    this.f15353b.add(c5448d2);
                    InterfaceC4412p interfaceC4412p = this.f15356e;
                    if (interfaceC4412p != null) {
                        interfaceC4412p.mo22809a(c5448d2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    protected final void m24309n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
