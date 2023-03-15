package p444xb;

import androidx.constraintlayout.widget.C0868i;
import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p070e.C4906j;
import p239mb.C7154a;
import p254nb.C7693a;
import p403vb.AbstractC11194r;
import p422wb.AbstractC11606a;
import p422wb.C11607b;
import p422wb.C11608c;
import p422wb.C11611f;
import p467yb.AbstractC13162j;

/* renamed from: xb.d */
/* loaded from: classes2.dex */
public final class C12340d extends AbstractC11606a {

    /* renamed from: k */
    private static final int[] f32497k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f32498l = {4, 20, 52, C0868i.f2758E0, 204};

    /* renamed from: m */
    private static final int[] f32499m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f32500n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f32501o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, C4906j.f13380A0, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, C4906j.f13617z0, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, C0868i.f2773H0}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, C4906j.f13405F0, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, C4906j.f13400E0, 155}, new int[]{43, 129, 176, 106, C0868i.f2768G0, 110, C4906j.f13385B0, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{C0868i.f2778I0, C4906j.f13612y0, 137, 200, 178, 112, C4906j.f13415H0, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{C4906j.f13390C0, 149, 25, 75, 14, 42, C4906j.f13420I0, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{C0868i.f2753D0, 98, 83, 38, 114, 131, 182, C4906j.f13410G0}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f32502p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C12338b> f32503g = new ArrayList(11);

    /* renamed from: h */
    private final List<C12339c> f32504h = new ArrayList();

    /* renamed from: i */
    private final int[] f32505i = new int[2];

    /* renamed from: j */
    private boolean f32506j;

    /* renamed from: A */
    private static int m3045A(C7154a c7154a, int i) {
        if (c7154a.m19076g(i)) {
            return c7154a.m19074j(c7154a.m19073k(i));
        }
        return c7154a.m19073k(c7154a.m19074j(i));
    }

    /* renamed from: B */
    private static boolean m3044B(C11608c c11608c, boolean z, boolean z2) {
        return (c11608c.m4612c() == 0 && z && z2) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        continue;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m3043C(java.lang.Iterable<p444xb.C12338b> r7, java.lang.Iterable<p444xb.C12339c> r8) {
        /*
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L46
            java.lang.Object r0 = r8.next()
            xb.c r0 = (p444xb.C12339c) r0
            java.util.Iterator r2 = r7.iterator()
        L15:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            xb.b r3 = (p444xb.C12338b) r3
            java.util.List r5 = r0.m3048a()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r5.next()
            xb.b r6 = (p444xb.C12338b) r6
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L2a
            r3 = r4
            goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 != 0) goto L15
            goto L43
        L42:
            r1 = r4
        L43:
            if (r1 == 0) goto L4
            return r4
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p444xb.C12340d.m3043C(java.lang.Iterable, java.lang.Iterable):boolean");
    }

    /* renamed from: D */
    private static boolean m3042D(List<C12338b> list) {
        int[][] iArr;
        boolean z;
        for (int[] iArr2 : f32502p) {
            if (list.size() <= iArr2.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).m3052a().m4612c() != iArr2[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    private C11608c m3041E(C7154a c7154a, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f32505i[0] - 1;
            while (i5 >= 0 && !c7154a.m19076g(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f32505i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f32505i;
            int i7 = iArr2[0];
            int m19073k = c7154a.m19073k(iArr2[1] + 1);
            i2 = m19073k;
            i3 = i7;
            i4 = m19073k - this.f32505i[1];
        }
        int[] m4624k = m4624k();
        System.arraycopy(m4624k, 0, m4624k, 1, m4624k.length - 1);
        m4624k[0] = i4;
        try {
            return new C11608c(AbstractC11606a.m4617r(m4624k, f32500n), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: F */
    private static void m3040F(Collection<C12338b> collection, Collection<C12339c> collection2) {
        Iterator<C12339c> it = collection2.iterator();
        while (it.hasNext()) {
            C12339c next = it.next();
            if (next.m3048a().size() != collection.size()) {
                boolean z = true;
                Iterator<C12338b> it2 = next.m3048a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!collection.contains(it2.next())) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: H */
    private static void m3038H(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: I */
    private void m3037I(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f32504h.size()) {
                break;
            }
            C12339c c12339c = this.f32504h.get(i2);
            if (c12339c.m3047b() > i) {
                z2 = c12339c.m3046c(this.f32503g);
                break;
            } else {
                z3 = c12339c.m3046c(this.f32503g);
                i2++;
            }
        }
        if (z2 || z3 || m3043C(this.f32503g, this.f32504h)) {
            return;
        }
        this.f32504h.add(i2, new C12339c(this.f32503g, i, z));
        m3040F(this.f32503g, this.f32504h);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3035s(int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p444xb.C12340d.m3035s(int):void");
    }

    /* renamed from: t */
    private boolean m3034t() {
        C12338b c12338b = this.f32503g.get(0);
        C11607b m3051b = c12338b.m3051b();
        C11607b m3050c = c12338b.m3050c();
        if (m3050c == null) {
            return false;
        }
        int m4616a = m3050c.m4616a();
        int i = 2;
        for (int i2 = 1; i2 < this.f32503g.size(); i2++) {
            C12338b c12338b2 = this.f32503g.get(i2);
            m4616a += c12338b2.m3051b().m4616a();
            i++;
            C11607b m3050c2 = c12338b2.m3050c();
            if (m3050c2 != null) {
                m4616a += m3050c2.m4616a();
                i++;
            }
        }
        return ((i + (-4)) * 211) + (m4616a % 211) == m3051b.m4615b();
    }

    /* renamed from: u */
    private List<C12338b> m3033u(List<C12339c> list, int i) throws NotFoundException {
        while (i < this.f32504h.size()) {
            C12339c c12339c = this.f32504h.get(i);
            this.f32503g.clear();
            for (C12339c c12339c2 : list) {
                this.f32503g.addAll(c12339c2.m3048a());
            }
            this.f32503g.addAll(c12339c.m3048a());
            if (m3042D(this.f32503g)) {
                if (m3034t()) {
                    return this.f32503g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(c12339c);
                try {
                    return m3033u(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: v */
    private List<C12338b> m3032v(boolean z) {
        List<C12338b> list = null;
        if (this.f32504h.size() > 25) {
            this.f32504h.clear();
            return null;
        }
        this.f32503g.clear();
        if (z) {
            Collections.reverse(this.f32504h);
        }
        try {
            list = m3033u(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f32504h);
        }
        return list;
    }

    /* renamed from: w */
    static C4409m m3031w(List<C12338b> list) throws NotFoundException, FormatException {
        String mo1512d = AbstractC13162j.m1515a(C12337a.m3053a(list)).mo1512d();
        C4411o[] m4614a = list.get(0).m3052a().m4614a();
        C4411o[] m4614a2 = list.get(list.size() - 1).m3052a().m4614a();
        return new C4409m(mo1512d, null, new C4411o[]{m4614a[0], m4614a[1], m4614a2[0], m4614a2[1]}, EnumC4392a.RSS_EXPANDED);
    }

    /* renamed from: z */
    private void m3028z(C7154a c7154a, List<C12338b> list, int i) throws NotFoundException {
        int[] m4624k = m4624k();
        m4624k[0] = 0;
        m4624k[1] = 0;
        m4624k[2] = 0;
        m4624k[3] = 0;
        int m19072l = c7154a.m19072l();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).m3052a().m4613b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f32506j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < m19072l) {
            z2 = !c7154a.m19076g(i);
            if (!z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        boolean z3 = z2;
        int i3 = i;
        while (i < m19072l) {
            if (c7154a.m19076g(i) != z3) {
                m4624k[i2] = m4624k[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m3038H(m4624k);
                    }
                    if (AbstractC11606a.m4618q(m4624k)) {
                        int[] iArr = this.f32505i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m3038H(m4624k);
                    }
                    i3 += m4624k[0] + m4624k[1];
                    m4624k[0] = m4624k[2];
                    m4624k[1] = m4624k[3];
                    m4624k[2] = 0;
                    m4624k[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                m4624k[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: G */
    C12338b m3039G(C7154a c7154a, List<C12338b> list, int i) throws NotFoundException {
        C11608c m3041E;
        C11607b c11607b;
        boolean z = list.size() % 2 == 0;
        if (this.f32506j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m3028z(c7154a, list, i2);
            m3041E = m3041E(c7154a, i, z);
            if (m3041E == null) {
                i2 = m3045A(c7154a, this.f32505i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C11607b m3030x = m3030x(c7154a, m3041E, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m3049d()) {
            throw NotFoundException.m27700a();
        }
        try {
            c11607b = m3030x(c7154a, m3041E, z, false);
        } catch (NotFoundException unused) {
            c11607b = null;
        }
        return new C12338b(m3030x, c11607b, m3041E);
    }

    @Override // p403vb.AbstractC11194r, com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
        this.f32503g.clear();
        this.f32504h.clear();
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException, FormatException {
        this.f32503g.clear();
        this.f32506j = false;
        try {
            return m3031w(m3029y(i, c7154a));
        } catch (NotFoundException unused) {
            this.f32503g.clear();
            this.f32506j = true;
            return m3031w(m3029y(i, c7154a));
        }
    }

    /* renamed from: x */
    C11607b m3030x(C7154a c7154a, C11608c c11608c, boolean z, boolean z2) throws NotFoundException {
        int[] m4625j = m4625j();
        for (int i = 0; i < m4625j.length; i++) {
            m4625j[i] = 0;
        }
        if (z2) {
            AbstractC11194r.m5783h(c7154a, c11608c.m4613b()[0], m4625j);
        } else {
            AbstractC11194r.m5784g(c7154a, c11608c.m4613b()[1], m4625j);
            int i2 = 0;
            for (int length = m4625j.length - 1; i2 < length; length--) {
                int i3 = m4625j[i2];
                m4625j[i2] = m4625j[length];
                m4625j[length] = i3;
                i2++;
            }
        }
        float m17702d = C7693a.m17702d(m4625j) / 17.0f;
        float f = (c11608c.m4613b()[1] - c11608c.m4613b()[0]) / 15.0f;
        if (Math.abs(m17702d - f) / f <= 0.3f) {
            int[] m4621n = m4621n();
            int[] m4623l = m4623l();
            float[] m4620o = m4620o();
            float[] m4622m = m4622m();
            for (int i4 = 0; i4 < m4625j.length; i4++) {
                float f2 = (m4625j[i4] * 1.0f) / m17702d;
                int i5 = (int) (0.5f + f2);
                if (i5 <= 0) {
                    if (f2 < 0.3f) {
                        throw NotFoundException.m27700a();
                    }
                    i5 = 1;
                } else if (i5 > 8) {
                    if (f2 > 8.7f) {
                        throw NotFoundException.m27700a();
                    }
                    i5 = 8;
                }
                int i6 = i4 / 2;
                if ((i4 & 1) == 0) {
                    m4621n[i6] = i5;
                    m4620o[i6] = f2 - i5;
                } else {
                    m4623l[i6] = i5;
                    m4622m[i6] = f2 - i5;
                }
            }
            m3035s(17);
            int m4612c = (((c11608c.m4612c() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
            int i7 = 0;
            int i8 = 0;
            for (int length2 = m4621n.length - 1; length2 >= 0; length2--) {
                if (m3044B(c11608c, z, z2)) {
                    i7 += m4621n[length2] * f32501o[m4612c][length2 * 2];
                }
                i8 += m4621n[length2];
            }
            int i9 = 0;
            for (int length3 = m4623l.length - 1; length3 >= 0; length3--) {
                if (m3044B(c11608c, z, z2)) {
                    i9 += m4623l[length3] * f32501o[m4612c][(length3 * 2) + 1];
                }
            }
            int i10 = i7 + i9;
            if ((i8 & 1) == 0 && i8 <= 13 && i8 >= 4) {
                int i11 = (13 - i8) / 2;
                int i12 = f32497k[i11];
                return new C11607b((C11611f.m4599b(m4621n, i12, true) * f32498l[i11]) + C11611f.m4599b(m4623l, 9 - i12, false) + f32499m[i11], i10);
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: y */
    List<C12338b> m3029y(int i, C7154a c7154a) throws NotFoundException {
        boolean z = false;
        while (!z) {
            try {
                List<C12338b> list = this.f32503g;
                list.add(m3039G(c7154a, list, i));
            } catch (NotFoundException e) {
                if (this.f32503g.isEmpty()) {
                    throw e;
                }
                z = true;
            }
        }
        if (m3034t()) {
            return this.f32503g;
        }
        boolean z2 = !this.f32504h.isEmpty();
        m3037I(i, false);
        if (z2) {
            List<C12338b> m3032v = m3032v(false);
            if (m3032v != null) {
                return m3032v;
            }
            List<C12338b> m3032v2 = m3032v(true);
            if (m3032v2 != null) {
                return m3032v2;
            }
        }
        throw NotFoundException.m27700a();
    }
}
