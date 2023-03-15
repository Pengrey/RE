package p422wb;

import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.InterfaceC4412p;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p070e.C4906j;
import p239mb.C7154a;
import p254nb.C7693a;
import p403vb.AbstractC11194r;

/* renamed from: wb.e */
/* loaded from: classes2.dex */
public final class C11610e extends AbstractC11606a {

    /* renamed from: i */
    private static final int[] f29691i = {1, 10, 34, 70, C4906j.f13420I0};

    /* renamed from: j */
    private static final int[] f29692j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f29693k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f29694l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f29695m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f29696n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f29697o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C11609d> f29698g = new ArrayList();

    /* renamed from: h */
    private final List<C11609d> f29699h = new ArrayList();

    /* renamed from: s */
    private static void m4608s(Collection<C11609d> collection, C11609d c11609d) {
        if (c11609d == null) {
            return;
        }
        boolean z = false;
        Iterator<C11609d> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C11609d next = it.next();
            if (next.m4615b() == c11609d.m4615b()) {
                next.m4609e();
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        collection.add(c11609d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        r5 = false;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4607t(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p422wb.C11610e.m4607t(boolean, int):void");
    }

    /* renamed from: u */
    private static boolean m4606u(C11609d c11609d, C11609d c11609d2) {
        int m4616a = (c11609d.m4616a() + (c11609d2.m4616a() * 16)) % 79;
        int m4612c = (c11609d.m4610d().m4612c() * 9) + c11609d2.m4610d().m4612c();
        if (m4612c > 72) {
            m4612c--;
        }
        if (m4612c > 8) {
            m4612c--;
        }
        return m4616a == m4612c;
    }

    /* renamed from: v */
    private static C4409m m4605v(C11609d c11609d, C11609d c11609d2) {
        String valueOf = String.valueOf((c11609d.m4615b() * 4537077) + c11609d2.m4615b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb2.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb2.append(i3);
        C4411o[] m4614a = c11609d.m4610d().m4614a();
        C4411o[] m4614a2 = c11609d2.m4610d().m4614a();
        return new C4409m(sb2.toString(), null, new C4411o[]{m4614a[0], m4614a[1], m4614a2[0], m4614a2[1]}, EnumC4392a.RSS_14);
    }

    /* renamed from: w */
    private C11607b m4604w(C7154a c7154a, C11608c c11608c, boolean z) throws NotFoundException {
        int[] m4625j = m4625j();
        for (int i = 0; i < m4625j.length; i++) {
            m4625j[i] = 0;
        }
        if (z) {
            AbstractC11194r.m5783h(c7154a, c11608c.m4613b()[0], m4625j);
        } else {
            AbstractC11194r.m5784g(c7154a, c11608c.m4613b()[1] + 1, m4625j);
            int i2 = 0;
            for (int length = m4625j.length - 1; i2 < length; length--) {
                int i3 = m4625j[i2];
                m4625j[i2] = m4625j[length];
                m4625j[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float m17702d = C7693a.m17702d(m4625j) / i4;
        int[] m4621n = m4621n();
        int[] m4623l = m4623l();
        float[] m4620o = m4620o();
        float[] m4622m = m4622m();
        for (int i5 = 0; i5 < m4625j.length; i5++) {
            float f = m4625j[i5] / m17702d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                m4621n[i7] = i6;
                m4620o[i7] = f - i6;
            } else {
                m4623l[i7] = i6;
                m4622m[i7] = f - i6;
            }
        }
        m4607t(z, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = m4621n.length - 1; length2 >= 0; length2--) {
            i8 = (i8 * 9) + m4621n[length2];
            i9 += m4621n[length2];
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = m4623l.length - 1; length3 >= 0; length3--) {
            i10 = (i10 * 9) + m4623l[length3];
            i11 += m4623l[length3];
        }
        int i12 = i8 + (i10 * 3);
        if (!z) {
            if ((i11 & 1) == 0 && i11 <= 10 && i11 >= 4) {
                int i13 = (10 - i11) / 2;
                int i14 = f29696n[i13];
                return new C11607b((C11611f.m4599b(m4623l, 9 - i14, false) * f29692j[i13]) + C11611f.m4599b(m4621n, i14, true) + f29694l[i13], i12);
            }
            throw NotFoundException.m27700a();
        } else if ((i9 & 1) == 0 && i9 <= 12 && i9 >= 4) {
            int i15 = (12 - i9) / 2;
            int i16 = f29695m[i15];
            return new C11607b((C11611f.m4599b(m4621n, i16, false) * f29691i[i15]) + C11611f.m4599b(m4623l, 9 - i16, true) + f29693k[i15], i12);
        } else {
            throw NotFoundException.m27700a();
        }
    }

    /* renamed from: x */
    private C11609d m4603x(C7154a c7154a, boolean z, int i, Map<EnumC4399d, ?> map) {
        try {
            int[] m4602y = m4602y(c7154a, z);
            C11608c m4601z = m4601z(c7154a, i, z, m4602y);
            InterfaceC4412p interfaceC4412p = map == null ? null : (InterfaceC4412p) map.get(EnumC4399d.NEED_RESULT_POINT_CALLBACK);
            if (interfaceC4412p != null) {
                float f = (m4602y[0] + m4602y[1]) / 2.0f;
                if (z) {
                    f = (c7154a.m19072l() - 1) - f;
                }
                interfaceC4412p.mo22809a(new C4411o(f, i));
            }
            C11607b m4604w = m4604w(c7154a, m4601z, true);
            C11607b m4604w2 = m4604w(c7154a, m4601z, false);
            return new C11609d((m4604w.m4615b() * 1597) + m4604w2.m4615b(), m4604w.m4616a() + (m4604w2.m4616a() * 4), m4601z);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: y */
    private int[] m4602y(C7154a c7154a, boolean z) throws NotFoundException {
        int[] m4624k = m4624k();
        m4624k[0] = 0;
        m4624k[1] = 0;
        m4624k[2] = 0;
        m4624k[3] = 0;
        int m19072l = c7154a.m19072l();
        int i = 0;
        boolean z2 = false;
        while (i < m19072l) {
            z2 = !c7154a.m19076g(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < m19072l) {
            if (c7154a.m19076g(i) != z2) {
                m4624k[i2] = m4624k[i2] + 1;
            } else {
                if (i2 != 3) {
                    i2++;
                } else if (AbstractC11606a.m4618q(m4624k)) {
                    return new int[]{i3, i};
                } else {
                    i3 += m4624k[0] + m4624k[1];
                    m4624k[0] = m4624k[2];
                    m4624k[1] = m4624k[3];
                    m4624k[2] = 0;
                    m4624k[3] = 0;
                    i2--;
                }
                m4624k[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: z */
    private C11608c m4601z(C7154a c7154a, int i, boolean z, int[] iArr) throws NotFoundException {
        int i2;
        int i3;
        boolean m19076g = c7154a.m19076g(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && m19076g != c7154a.m19076g(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] m4624k = m4624k();
        System.arraycopy(m4624k, 0, m4624k, 1, m4624k.length - 1);
        m4624k[0] = iArr[0] - i5;
        int m4617r = AbstractC11606a.m4617r(m4624k, f29697o);
        int i6 = iArr[1];
        if (z) {
            i2 = (c7154a.m19072l() - 1) - i6;
            i3 = (c7154a.m19072l() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C11608c(m4617r, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    @Override // p403vb.AbstractC11194r, com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
        this.f29698g.clear();
        this.f29699h.clear();
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException {
        m4608s(this.f29698g, m4603x(c7154a, false, i, map));
        c7154a.m19068p();
        m4608s(this.f29699h, m4603x(c7154a, true, i, map));
        c7154a.m19068p();
        for (C11609d c11609d : this.f29698g) {
            if (c11609d.m4611c() > 1) {
                for (C11609d c11609d2 : this.f29699h) {
                    if (c11609d2.m4611c() > 1 && m4606u(c11609d, c11609d2)) {
                        return m4605v(c11609d, c11609d2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.m27700a();
    }
}
