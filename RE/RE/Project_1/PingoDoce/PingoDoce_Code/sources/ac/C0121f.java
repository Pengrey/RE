package ac;

import java.util.Formatter;

/* renamed from: ac.f */
/* loaded from: classes2.dex */
final class C0121f {

    /* renamed from: a */
    private final C0114a f288a;

    /* renamed from: b */
    private final C0122g[] f289b;

    /* renamed from: c */
    private C0116c f290c;

    /* renamed from: d */
    private final int f291d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0121f(C0114a c0114a, C0116c c0116c) {
        this.f288a = c0114a;
        int m41889a = c0114a.m41889a();
        this.f291d = m41889a;
        this.f290c = c0116c;
        this.f289b = new C0122g[m41889a + 2];
    }

    /* renamed from: a */
    private void m41855a(C0122g c0122g) {
        if (c0122g != null) {
            ((C0123h) c0122g).m41832g(this.f288a);
        }
    }

    /* renamed from: b */
    private static boolean m41854b(C0117d c0117d, C0117d c0117d2) {
        if (c0117d2 != null && c0117d2.m41866g() && c0117d2.m41872a() == c0117d.m41872a()) {
            c0117d.m41864i(c0117d2.m41870c());
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static int m41853c(int i, int i2, C0117d c0117d) {
        if (c0117d == null || c0117d.m41866g()) {
            return i2;
        }
        if (c0117d.m41865h(i)) {
            c0117d.m41864i(i);
            return 0;
        }
        return i2 + 1;
    }

    /* renamed from: d */
    private int m41852d() {
        int m41850f = m41850f();
        if (m41850f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f291d + 1; i++) {
            C0117d[] m41835d = this.f289b[i].m41835d();
            for (int i2 = 0; i2 < m41835d.length; i2++) {
                if (m41835d[i2] != null && !m41835d[i2].m41866g()) {
                    m41851e(i, i2, m41835d);
                }
            }
        }
        return m41850f;
    }

    /* renamed from: e */
    private void m41851e(int i, int i2, C0117d[] c0117dArr) {
        C0117d c0117d = c0117dArr[i2];
        C0117d[] m41835d = this.f289b[i - 1].m41835d();
        C0122g[] c0122gArr = this.f289b;
        int i3 = i + 1;
        C0117d[] m41835d2 = c0122gArr[i3] != null ? c0122gArr[i3].m41835d() : m41835d;
        C0117d[] c0117dArr2 = new C0117d[14];
        c0117dArr2[2] = m41835d[i2];
        c0117dArr2[3] = m41835d2[i2];
        if (i2 > 0) {
            int i4 = i2 - 1;
            c0117dArr2[0] = c0117dArr[i4];
            c0117dArr2[4] = m41835d[i4];
            c0117dArr2[5] = m41835d2[i4];
        }
        if (i2 > 1) {
            int i5 = i2 - 2;
            c0117dArr2[8] = c0117dArr[i5];
            c0117dArr2[10] = m41835d[i5];
            c0117dArr2[11] = m41835d2[i5];
        }
        if (i2 < c0117dArr.length - 1) {
            int i6 = i2 + 1;
            c0117dArr2[1] = c0117dArr[i6];
            c0117dArr2[6] = m41835d[i6];
            c0117dArr2[7] = m41835d2[i6];
        }
        if (i2 < c0117dArr.length - 2) {
            int i7 = i2 + 2;
            c0117dArr2[9] = c0117dArr[i7];
            c0117dArr2[12] = m41835d[i7];
            c0117dArr2[13] = m41835d2[i7];
        }
        for (int i8 = 0; i8 < 14 && !m41854b(c0117d, c0117dArr2[i8]); i8++) {
        }
    }

    /* renamed from: f */
    private int m41850f() {
        m41849g();
        return m41848h() + m41847i();
    }

    /* renamed from: g */
    private void m41849g() {
        C0122g[] c0122gArr = this.f289b;
        if (c0122gArr[0] == null || c0122gArr[this.f291d + 1] == null) {
            return;
        }
        C0117d[] m41835d = c0122gArr[0].m41835d();
        C0117d[] m41835d2 = this.f289b[this.f291d + 1].m41835d();
        for (int i = 0; i < m41835d.length; i++) {
            if (m41835d[i] != null && m41835d2[i] != null && m41835d[i].m41870c() == m41835d2[i].m41870c()) {
                for (int i2 = 1; i2 <= this.f291d; i2++) {
                    C0117d c0117d = this.f289b[i2].m41835d()[i];
                    if (c0117d != null) {
                        c0117d.m41864i(m41835d[i].m41870c());
                        if (!c0117d.m41866g()) {
                            this.f289b[i2].m41835d()[i] = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m41848h() {
        C0122g[] c0122gArr = this.f289b;
        if (c0122gArr[0] == null) {
            return 0;
        }
        C0117d[] m41835d = c0122gArr[0].m41835d();
        int i = 0;
        for (int i2 = 0; i2 < m41835d.length; i2++) {
            if (m41835d[i2] != null) {
                int m41870c = m41835d[i2].m41870c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f291d + 1 && i3 < 2; i4++) {
                    C0117d c0117d = this.f289b[i4].m41835d()[i2];
                    if (c0117d != null) {
                        i3 = m41853c(m41870c, i3, c0117d);
                        if (!c0117d.m41866g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m41847i() {
        C0122g[] c0122gArr = this.f289b;
        int i = this.f291d;
        if (c0122gArr[i + 1] == null) {
            return 0;
        }
        C0117d[] m41835d = c0122gArr[i + 1].m41835d();
        int i2 = 0;
        for (int i3 = 0; i3 < m41835d.length; i3++) {
            if (m41835d[i3] != null) {
                int m41870c = m41835d[i3].m41870c();
                int i4 = 0;
                for (int i5 = this.f291d + 1; i5 > 0 && i4 < 2; i5--) {
                    C0117d c0117d = this.f289b[i5].m41835d()[i3];
                    if (c0117d != null) {
                        i4 = m41853c(m41870c, i4, c0117d);
                        if (!c0117d.m41866g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m41846j() {
        return this.f291d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m41845k() {
        return this.f288a.m41888b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m41844l() {
        return this.f288a.m41887c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C0116c m41843m() {
        return this.f290c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C0122g m41842n(int i) {
        return this.f289b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C0122g[] m41841o() {
        m41855a(this.f289b[0]);
        m41855a(this.f289b[this.f291d + 1]);
        int i = 928;
        while (true) {
            int m41852d = m41852d();
            if (m41852d <= 0 || m41852d >= i) {
                break;
            }
            i = m41852d;
        }
        return this.f289b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m41840p(C0116c c0116c) {
        this.f290c = c0116c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m41839q(int i, C0122g c0122g) {
        this.f289b[i] = c0122g;
    }

    public String toString() {
        C0122g[] c0122gArr = this.f289b;
        C0122g c0122g = c0122gArr[0];
        if (c0122g == null) {
            c0122g = c0122gArr[this.f291d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < c0122g.m41835d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.f291d + 2; i2++) {
                    C0122g[] c0122gArr2 = this.f289b;
                    if (c0122gArr2[i2] == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C0117d c0117d = c0122gArr2[i2].m41835d()[i];
                        if (c0117d == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c0117d.m41870c()), Integer.valueOf(c0117d.m41868e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
