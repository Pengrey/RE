package p073e2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p053d2.C4711d;
import p053d2.C4720i;
import p073e2.C4966e;
import p094f2.C5325b;
import p094f2.C5330e;
import p094f2.C5334h;
import p094f2.C5335i;

/* renamed from: e2.f */
/* loaded from: classes.dex */
public class C4969f extends C4976l {

    /* renamed from: v0 */
    int f13889v0;

    /* renamed from: w0 */
    int f13890w0;

    /* renamed from: q0 */
    C5325b f13884q0 = new C5325b(this);

    /* renamed from: r0 */
    public C5330e f13885r0 = new C5330e(this);

    /* renamed from: s0 */
    protected C5325b.InterfaceC5327b f13886s0 = null;

    /* renamed from: t0 */
    private boolean f13887t0 = false;

    /* renamed from: u0 */
    protected C4711d f13888u0 = new C4711d();

    /* renamed from: x0 */
    public int f13891x0 = 0;

    /* renamed from: y0 */
    public int f13892y0 = 0;

    /* renamed from: z0 */
    C4962c[] f13893z0 = new C4962c[4];

    /* renamed from: A0 */
    C4962c[] f13875A0 = new C4962c[4];

    /* renamed from: B0 */
    private int f13876B0 = 257;

    /* renamed from: C0 */
    private boolean f13877C0 = false;

    /* renamed from: D0 */
    private boolean f13878D0 = false;

    /* renamed from: E0 */
    private WeakReference<C4963d> f13879E0 = null;

    /* renamed from: F0 */
    private WeakReference<C4963d> f13880F0 = null;

    /* renamed from: G0 */
    private WeakReference<C4963d> f13881G0 = null;

    /* renamed from: H0 */
    private WeakReference<C4963d> f13882H0 = null;

    /* renamed from: I0 */
    public C5325b.C5326a f13883I0 = new C5325b.C5326a();

    /* renamed from: A1 */
    public static boolean m26048A1(C4966e c4966e, C5325b.InterfaceC5327b interfaceC5327b, C5325b.C5326a c5326a, int i) {
        int i2;
        int i3;
        if (interfaceC5327b == null) {
            return false;
        }
        c5326a.f14697a = c4966e.m26052y();
        c5326a.f14698b = c4966e.m26112O();
        c5326a.f14699c = c4966e.m26106R();
        c5326a.f14700d = c4966e.m26058v();
        c5326a.f14705i = false;
        c5326a.f14706j = i;
        C4966e.EnumC4968b enumC4968b = c5326a.f14697a;
        C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
        boolean z = enumC4968b == enumC4968b2;
        boolean z2 = c5326a.f14698b == enumC4968b2;
        boolean z3 = z && c4966e.f13827U > 0.0f;
        boolean z4 = z2 && c4966e.f13827U > 0.0f;
        if (z && c4966e.m26098V(0) && c4966e.f13859n == 0 && !z3) {
            c5326a.f14697a = C4966e.EnumC4968b.WRAP_CONTENT;
            if (z2 && c4966e.f13861o == 0) {
                c5326a.f14697a = C4966e.EnumC4968b.FIXED;
            }
            z = false;
        }
        if (z2 && c4966e.m26098V(1) && c4966e.f13861o == 0 && !z4) {
            c5326a.f14698b = C4966e.EnumC4968b.WRAP_CONTENT;
            if (z && c4966e.f13859n == 0) {
                c5326a.f14698b = C4966e.EnumC4968b.FIXED;
            }
            z2 = false;
        }
        if (c4966e.mo26012e0()) {
            c5326a.f14697a = C4966e.EnumC4968b.FIXED;
            z = false;
        }
        if (c4966e.mo26010f0()) {
            c5326a.f14698b = C4966e.EnumC4968b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (c4966e.f13862p[0] == 4) {
                c5326a.f14697a = C4966e.EnumC4968b.FIXED;
            } else if (!z2) {
                C4966e.EnumC4968b enumC4968b3 = c5326a.f14698b;
                C4966e.EnumC4968b enumC4968b4 = C4966e.EnumC4968b.FIXED;
                if (enumC4968b3 == enumC4968b4) {
                    i3 = c5326a.f14700d;
                } else {
                    c5326a.f14697a = C4966e.EnumC4968b.WRAP_CONTENT;
                    interfaceC5327b.mo24618b(c4966e, c5326a);
                    i3 = c5326a.f14702f;
                }
                c5326a.f14697a = enumC4968b4;
                int i4 = c4966e.f13828V;
                if (i4 != 0 && i4 != -1) {
                    c5326a.f14699c = (int) (c4966e.m26062t() / i3);
                } else {
                    c5326a.f14699c = (int) (c4966e.m26062t() * i3);
                }
            }
        }
        if (z4) {
            if (c4966e.f13862p[1] == 4) {
                c5326a.f14698b = C4966e.EnumC4968b.FIXED;
            } else if (!z) {
                C4966e.EnumC4968b enumC4968b5 = c5326a.f14697a;
                C4966e.EnumC4968b enumC4968b6 = C4966e.EnumC4968b.FIXED;
                if (enumC4968b5 == enumC4968b6) {
                    i2 = c5326a.f14699c;
                } else {
                    c5326a.f14698b = C4966e.EnumC4968b.WRAP_CONTENT;
                    interfaceC5327b.mo24618b(c4966e, c5326a);
                    i2 = c5326a.f14701e;
                }
                c5326a.f14698b = enumC4968b6;
                int i5 = c4966e.f13828V;
                if (i5 != 0 && i5 != -1) {
                    c5326a.f14700d = (int) (i2 * c4966e.m26062t());
                } else {
                    c5326a.f14700d = (int) (i2 / c4966e.m26062t());
                }
            }
        }
        interfaceC5327b.mo24618b(c4966e, c5326a);
        c4966e.m26099U0(c5326a.f14701e);
        c4966e.m26057v0(c5326a.f14702f);
        c4966e.m26059u0(c5326a.f14704h);
        c4966e.m26078k0(c5326a.f14703g);
        c5326a.f14706j = C5325b.C5326a.f14694k;
        return c5326a.f14705i;
    }

    /* renamed from: C1 */
    private void m26046C1() {
        this.f13891x0 = 0;
        this.f13892y0 = 0;
    }

    /* renamed from: g1 */
    private void m26037g1(C4966e c4966e) {
        int i = this.f13891x0 + 1;
        C4962c[] c4962cArr = this.f13875A0;
        if (i >= c4962cArr.length) {
            this.f13875A0 = (C4962c[]) Arrays.copyOf(c4962cArr, c4962cArr.length * 2);
        }
        this.f13875A0[this.f13891x0] = new C4962c(c4966e, 0, m26020x1());
        this.f13891x0++;
    }

    /* renamed from: j1 */
    private void m26034j1(C4963d c4963d, C4720i c4720i) {
        this.f13888u0.m26854h(c4720i, this.f13888u0.m26845q(c4963d), 0, 5);
    }

    /* renamed from: k1 */
    private void m26033k1(C4963d c4963d, C4720i c4720i) {
        this.f13888u0.m26854h(this.f13888u0.m26845q(c4963d), c4720i, 0, 5);
    }

    /* renamed from: l1 */
    private void m26032l1(C4966e c4966e) {
        int i = this.f13892y0 + 1;
        C4962c[] c4962cArr = this.f13893z0;
        if (i >= c4962cArr.length) {
            this.f13893z0 = (C4962c[]) Arrays.copyOf(c4962cArr, c4962cArr.length * 2);
        }
        this.f13893z0[this.f13892y0] = new C4962c(c4966e, 1, m26020x1());
        this.f13892y0++;
    }

    /* renamed from: B1 */
    public boolean m26047B1(int i) {
        return (this.f13876B0 & i) == i;
    }

    /* renamed from: D1 */
    public void m26045D1(C5325b.InterfaceC5327b interfaceC5327b) {
        this.f13886s0 = interfaceC5327b;
        this.f13885r0.m24601n(interfaceC5327b);
    }

    /* renamed from: E1 */
    public void m26044E1(int i) {
        this.f13876B0 = i;
        C4711d.f12856r = m26047B1(512);
    }

    /* renamed from: F1 */
    public void m26043F1(boolean z) {
        this.f13887t0 = z;
    }

    /* renamed from: G1 */
    public void m26042G1(C4711d c4711d, boolean[] zArr) {
        zArr[2] = false;
        boolean m26047B1 = m26047B1(64);
        mo26017Z0(c4711d, m26047B1);
        int size = this.f13905p0.size();
        for (int i = 0; i < size; i++) {
            this.f13905p0.get(i).mo26017Z0(c4711d, m26047B1);
        }
    }

    /* renamed from: H1 */
    public void m26041H1() {
        this.f13884q0.m24620e(this);
    }

    @Override // p073e2.C4966e
    /* renamed from: Y0 */
    public void mo26040Y0(boolean z, boolean z2) {
        super.mo26040Y0(z, z2);
        int size = this.f13905p0.size();
        for (int i = 0; i < size; i++) {
            this.f13905p0.get(i).mo26040Y0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // p073e2.C4976l
    /* renamed from: b1 */
    public void mo25990b1() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        ?? r6;
        boolean z3;
        C4966e.EnumC4968b enumC4968b;
        int i3 = 0;
        this.f13829W = 0;
        this.f13830X = 0;
        this.f13877C0 = false;
        this.f13878D0 = false;
        int size = this.f13905p0.size();
        int max = Math.max(0, m26106R());
        int max2 = Math.max(0, m26058v());
        C4966e.EnumC4968b[] enumC4968bArr = this.f13823Q;
        C4966e.EnumC4968b enumC4968b2 = enumC4968bArr[1];
        C4966e.EnumC4968b enumC4968b3 = enumC4968bArr[0];
        if (C4974j.m25996b(this.f13876B0, 1)) {
            C5334h.m24590h(this, m26026r1());
            for (int i4 = 0; i4 < size; i4++) {
                C4966e c4966e = this.f13905p0.get(i4);
                if (c4966e.m26086d0() && !(c4966e instanceof C4970g) && !(c4966e instanceof C4960a) && !(c4966e instanceof C4975k) && !c4966e.m26088c0()) {
                    C4966e.EnumC4968b m26064s = c4966e.m26064s(0);
                    C4966e.EnumC4968b m26064s2 = c4966e.m26064s(1);
                    C4966e.EnumC4968b enumC4968b4 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                    if (!(m26064s == enumC4968b4 && c4966e.f13859n != 1 && m26064s2 == enumC4968b4 && c4966e.f13861o != 1)) {
                        m26048A1(c4966e, this.f13886s0, new C5325b.C5326a(), C5325b.C5326a.f14694k);
                    }
                }
            }
        }
        if (size <= 2 || !((enumC4968b3 == (enumC4968b = C4966e.EnumC4968b.WRAP_CONTENT) || enumC4968b2 == enumC4968b) && C4974j.m25996b(this.f13876B0, 1024) && C5335i.m24586c(this, m26026r1()))) {
            i = max2;
            i2 = max;
            z = false;
        } else {
            if (enumC4968b3 == enumC4968b) {
                if (max < m26106R() && max > 0) {
                    m26099U0(max);
                    this.f13877C0 = true;
                } else {
                    max = m26106R();
                }
            }
            if (enumC4968b2 == enumC4968b) {
                if (max2 < m26058v() && max2 > 0) {
                    m26057v0(max2);
                    this.f13878D0 = true;
                } else {
                    max2 = m26058v();
                }
            }
            i = max2;
            i2 = max;
            z = true;
        }
        boolean z4 = m26047B1(64) || m26047B1(128);
        C4711d c4711d = this.f13888u0;
        c4711d.f12872h = false;
        c4711d.f12873i = false;
        if (this.f13876B0 != 0 && z4) {
            c4711d.f12873i = true;
        }
        ArrayList<C4966e> arrayList = this.f13905p0;
        C4966e.EnumC4968b m26052y = m26052y();
        C4966e.EnumC4968b enumC4968b5 = C4966e.EnumC4968b.WRAP_CONTENT;
        boolean z5 = m26052y == enumC4968b5 || m26112O() == enumC4968b5;
        m26046C1();
        for (int i5 = 0; i5 < size; i5++) {
            C4966e c4966e2 = this.f13905p0.get(i5);
            if (c4966e2 instanceof C4976l) {
                ((C4976l) c4966e2).mo25990b1();
            }
        }
        boolean m26047B1 = m26047B1(64);
        boolean z6 = z;
        int i6 = 0;
        boolean z7 = true;
        while (z7) {
            int i7 = i6 + 1;
            try {
                this.f13888u0.m26862D();
                m26046C1();
                m26079k(this.f13888u0);
                for (int i8 = i3; i8 < size; i8++) {
                    this.f13905p0.get(i8).m26079k(this.f13888u0);
                }
                z7 = m26038f1(this.f13888u0);
                WeakReference<C4963d> weakReference = this.f13879E0;
                if (weakReference != null && weakReference.get() != null) {
                    m26033k1(this.f13879E0.get(), this.f13888u0.m26845q(this.f13813G));
                    this.f13879E0 = null;
                }
                WeakReference<C4963d> weakReference2 = this.f13881G0;
                if (weakReference2 != null && weakReference2.get() != null) {
                    m26034j1(this.f13881G0.get(), this.f13888u0.m26845q(this.f13815I));
                    this.f13881G0 = null;
                }
                WeakReference<C4963d> weakReference3 = this.f13880F0;
                if (weakReference3 != null && weakReference3.get() != null) {
                    m26033k1(this.f13880F0.get(), this.f13888u0.m26845q(this.f13812F));
                    this.f13880F0 = null;
                }
                WeakReference<C4963d> weakReference4 = this.f13882H0;
                if (weakReference4 != null && weakReference4.get() != null) {
                    m26034j1(this.f13882H0.get(), this.f13888u0.m26845q(this.f13814H));
                    this.f13882H0 = null;
                }
                if (z7) {
                    this.f13888u0.m26836z();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (z7) {
                m26042G1(this.f13888u0, C4974j.f13903a);
            } else {
                mo26017Z0(this.f13888u0, m26047B1);
                for (int i9 = 0; i9 < size; i9++) {
                    this.f13905p0.get(i9).mo26017Z0(this.f13888u0, m26047B1);
                }
            }
            if (z5 && i7 < 8 && C4974j.f13903a[2]) {
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    C4966e c4966e3 = this.f13905p0.get(i12);
                    i10 = Math.max(i10, c4966e3.f13829W + c4966e3.m26106R());
                    i11 = Math.max(i11, c4966e3.f13830X + c4966e3.m26058v());
                }
                int max3 = Math.max(this.f13832Z, i10);
                int max4 = Math.max(this.f13834a0, i11);
                C4966e.EnumC4968b enumC4968b6 = C4966e.EnumC4968b.WRAP_CONTENT;
                if (enumC4968b3 != enumC4968b6 || m26106R() >= max3) {
                    z2 = false;
                } else {
                    m26099U0(max3);
                    this.f13823Q[0] = enumC4968b6;
                    z2 = true;
                    z6 = true;
                }
                if (enumC4968b2 == enumC4968b6 && m26058v() < max4) {
                    m26057v0(max4);
                    this.f13823Q[1] = enumC4968b6;
                    z2 = true;
                    z6 = true;
                }
            } else {
                z2 = false;
            }
            int max5 = Math.max(this.f13832Z, m26106R());
            if (max5 > m26106R()) {
                m26099U0(max5);
                this.f13823Q[0] = C4966e.EnumC4968b.FIXED;
                z2 = true;
                z6 = true;
            }
            int max6 = Math.max(this.f13834a0, m26058v());
            if (max6 > m26058v()) {
                m26057v0(max6);
                r6 = 1;
                this.f13823Q[1] = C4966e.EnumC4968b.FIXED;
                z2 = true;
                z3 = true;
            } else {
                r6 = 1;
                z3 = z6;
            }
            if (!z3) {
                C4966e.EnumC4968b enumC4968b7 = this.f13823Q[0];
                C4966e.EnumC4968b enumC4968b8 = C4966e.EnumC4968b.WRAP_CONTENT;
                if (enumC4968b7 == enumC4968b8 && i2 > 0 && m26106R() > i2) {
                    this.f13877C0 = r6;
                    this.f13823Q[0] = C4966e.EnumC4968b.FIXED;
                    m26099U0(i2);
                    z2 = r6;
                    z3 = z2;
                }
                if (this.f13823Q[r6] == enumC4968b8 && i > 0 && m26058v() > i) {
                    this.f13878D0 = r6;
                    this.f13823Q[r6] = C4966e.EnumC4968b.FIXED;
                    m26057v0(i);
                    z6 = true;
                    z7 = true;
                    i6 = i7;
                    i3 = 0;
                }
            }
            z7 = z2;
            z6 = z3;
            i6 = i7;
            i3 = 0;
        }
        this.f13905p0 = arrayList;
        if (z6) {
            C4966e.EnumC4968b[] enumC4968bArr2 = this.f13823Q;
            enumC4968bArr2[0] = enumC4968b3;
            enumC4968bArr2[1] = enumC4968b2;
        }
        mo25986j0(this.f13888u0.m26840v());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void m26039e1(C4966e c4966e, int i) {
        if (i == 0) {
            m26037g1(c4966e);
        } else if (i == 1) {
            m26032l1(c4966e);
        }
    }

    /* renamed from: f1 */
    public boolean m26038f1(C4711d c4711d) {
        boolean m26047B1 = m26047B1(64);
        mo26008g(c4711d, m26047B1);
        int size = this.f13905p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C4966e c4966e = this.f13905p0.get(i);
            c4966e.m26135C0(0, false);
            c4966e.m26135C0(1, false);
            if (c4966e instanceof C4960a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C4966e c4966e2 = this.f13905p0.get(i2);
                if (c4966e2 instanceof C4960a) {
                    ((C4960a) c4966e2).m26168h1();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C4966e c4966e3 = this.f13905p0.get(i3);
            if (c4966e3.m26084f()) {
                c4966e3.mo26008g(c4711d, m26047B1);
            }
        }
        if (C4711d.f12856r) {
            HashSet<C4966e> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                C4966e c4966e4 = this.f13905p0.get(i4);
                if (!c4966e4.m26084f()) {
                    hashSet.add(c4966e4);
                }
            }
            m26085e(this, c4711d, hashSet, m26052y() == C4966e.EnumC4968b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<C4966e> it = hashSet.iterator();
            while (it.hasNext()) {
                C4966e next = it.next();
                C4974j.m25997a(this, c4711d, next);
                next.mo26008g(c4711d, m26047B1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C4966e c4966e5 = this.f13905p0.get(i5);
                if (c4966e5 instanceof C4969f) {
                    C4966e.EnumC4968b[] enumC4968bArr = c4966e5.f13823Q;
                    C4966e.EnumC4968b enumC4968b = enumC4968bArr[0];
                    C4966e.EnumC4968b enumC4968b2 = enumC4968bArr[1];
                    C4966e.EnumC4968b enumC4968b3 = C4966e.EnumC4968b.WRAP_CONTENT;
                    if (enumC4968b == enumC4968b3) {
                        c4966e5.m26049z0(C4966e.EnumC4968b.FIXED);
                    }
                    if (enumC4968b2 == enumC4968b3) {
                        c4966e5.m26107Q0(C4966e.EnumC4968b.FIXED);
                    }
                    c4966e5.mo26008g(c4711d, m26047B1);
                    if (enumC4968b == enumC4968b3) {
                        c4966e5.m26049z0(enumC4968b);
                    }
                    if (enumC4968b2 == enumC4968b3) {
                        c4966e5.m26107Q0(enumC4968b2);
                    }
                } else {
                    C4974j.m25997a(this, c4711d, c4966e5);
                    if (!c4966e5.m26084f()) {
                        c4966e5.mo26008g(c4711d, m26047B1);
                    }
                }
            }
        }
        if (this.f13891x0 > 0) {
            C4961b.m26163b(this, c4711d, null, 0);
        }
        if (this.f13892y0 > 0) {
            C4961b.m26163b(this, c4711d, null, 1);
        }
        return true;
    }

    @Override // p073e2.C4976l, p073e2.C4966e
    /* renamed from: h0 */
    public void mo25987h0() {
        this.f13888u0.m26862D();
        this.f13889v0 = 0;
        this.f13890w0 = 0;
        super.mo25987h0();
    }

    /* renamed from: h1 */
    public void m26036h1(C4963d c4963d) {
        WeakReference<C4963d> weakReference = this.f13882H0;
        if (weakReference == null || weakReference.get() == null || c4963d.m26156d() > this.f13882H0.get().m26156d()) {
            this.f13882H0 = new WeakReference<>(c4963d);
        }
    }

    /* renamed from: i1 */
    public void m26035i1(C4963d c4963d) {
        WeakReference<C4963d> weakReference = this.f13880F0;
        if (weakReference == null || weakReference.get() == null || c4963d.m26156d() > this.f13880F0.get().m26156d()) {
            this.f13880F0 = new WeakReference<>(c4963d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void m26031m1(C4963d c4963d) {
        WeakReference<C4963d> weakReference = this.f13881G0;
        if (weakReference == null || weakReference.get() == null || c4963d.m26156d() > this.f13881G0.get().m26156d()) {
            this.f13881G0 = new WeakReference<>(c4963d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void m26030n1(C4963d c4963d) {
        WeakReference<C4963d> weakReference = this.f13879E0;
        if (weakReference == null || weakReference.get() == null || c4963d.m26156d() > this.f13879E0.get().m26156d()) {
            this.f13879E0 = new WeakReference<>(c4963d);
        }
    }

    /* renamed from: o1 */
    public boolean m26029o1(boolean z) {
        return this.f13885r0.m24609f(z);
    }

    /* renamed from: p1 */
    public boolean m26028p1(boolean z) {
        return this.f13885r0.m24608g(z);
    }

    /* renamed from: q1 */
    public boolean m26027q1(boolean z, int i) {
        return this.f13885r0.m24607h(z, i);
    }

    /* renamed from: r1 */
    public C5325b.InterfaceC5327b m26026r1() {
        return this.f13886s0;
    }

    /* renamed from: s1 */
    public int m26025s1() {
        return this.f13876B0;
    }

    /* renamed from: t1 */
    public C4711d m26024t1() {
        return this.f13888u0;
    }

    /* renamed from: u1 */
    public void m26023u1() {
        this.f13885r0.m24605j();
    }

    /* renamed from: v1 */
    public void m26022v1() {
        this.f13885r0.m24604k();
    }

    /* renamed from: w1 */
    public boolean m26021w1() {
        return this.f13878D0;
    }

    /* renamed from: x1 */
    public boolean m26020x1() {
        return this.f13887t0;
    }

    /* renamed from: y1 */
    public boolean m26019y1() {
        return this.f13877C0;
    }

    /* renamed from: z1 */
    public long m26018z1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f13889v0 = i8;
        this.f13890w0 = i9;
        return this.f13884q0.m24621d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }
}
