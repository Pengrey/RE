package p093f1;

import androidx.compose.p018ui.input.pointer.EnumC0662a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p112g0.MutableVector;
import p127h1.InterfaceC5776j;
import p181jd.Intrinsics;
import p373u0.C10774f;

/* compiled from: HitPathTracker.kt */
/* renamed from: f1.j */
/* loaded from: classes.dex */
public final class C5303j extends C5304k {

    /* renamed from: b */
    private final AbstractC5271a0 f14626b;

    /* renamed from: c */
    private final MutableVector f14627c;

    /* renamed from: d */
    private final Map f14628d;

    /* renamed from: e */
    private InterfaceC5776j f14629e;

    /* renamed from: f */
    private C5306m f14630f;

    /* renamed from: g */
    private boolean f14631g;

    /* renamed from: h */
    private boolean f14632h;

    /* renamed from: i */
    private boolean f14633i;

    public C5303j(AbstractC5271a0 abstractC5271a0) {
        Intrinsics.isThisObjectNull(abstractC5271a0, "pointerInputFilter");
        this.f14626b = abstractC5271a0;
        this.f14627c = new MutableVector(new C5317t[16], 0);
        this.f14628d = new LinkedHashMap();
        this.f14632h = true;
        this.f14633i = true;
    }

    /* renamed from: i */
    private final void m24722i() {
        this.f14628d.clear();
        this.f14629e = null;
    }

    /* renamed from: l */
    private final boolean m24719l(C5306m c5306m, C5306m c5306m2) {
        if (c5306m == null || c5306m.m24707b().size() != c5306m2.m24707b().size()) {
            return true;
        }
        int size = c5306m2.m24707b().size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!C10774f.m7147i(((C5318u) c5306m.m24707b().get(i)).m24651h(), ((C5318u) c5306m2.m24707b().get(i)).m24651h())) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m24727a(java.util.Map r30, p127h1.InterfaceC5776j r31, p093f1.C5283g r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p093f1.C5303j.m24727a(java.util.Map, h1.j, f1.g, boolean):boolean");
    }

    /* renamed from: b */
    public void m24726b(C5283g c5283g) {
        Intrinsics.isThisObjectNull(c5283g, "internalPointerEvent");
        super.m24716b(c5283g);
        C5306m c5306m = this.f14630f;
        if (c5306m == null) {
            return;
        }
        this.f14631g = this.f14632h;
        List m24707b = c5306m.m24707b();
        int size = m24707b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C5318u c5318u = (C5318u) m24707b.get(i);
            if ((c5318u.m24650i() || (c5283g.m24789d(c5318u.m24652g()) && this.f14632h)) ? false : true) {
                m24721j().m23644u(C5317t.m24665a(c5318u.m24652g()));
            }
            i = i2;
        }
        this.f14632h = false;
        this.f14633i = C5308o.m24681i(c5306m.m24705d(), C5308o.f14638a.m24679b());
    }

    /* renamed from: d */
    public void m24725d() {
        MutableVector m24711g = m24711g();
        int m23649p = m24711g.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = m24711g.m23650o();
            do {
                ((C5303j) m23650o[i]).m24725d();
                i++;
            } while (i < m23649p);
            this.f14626b.mo24836o0();
        }
        this.f14626b.mo24836o0();
    }

    /* renamed from: e */
    public boolean m24724e(C5283g c5283g) {
        MutableVector m24711g;
        int m23649p;
        Intrinsics.isThisObjectNull(c5283g, "internalPointerEvent");
        boolean z = true;
        int i = 0;
        if (!this.f14628d.isEmpty() && m24720k().m24837n0()) {
            C5306m c5306m = this.f14630f;
            Intrinsics.ifNullDoSomething(c5306m);
            InterfaceC5776j interfaceC5776j = this.f14629e;
            Intrinsics.ifNullDoSomething(interfaceC5776j);
            m24720k().mo24835p0(c5306m, EnumC0662a.Final, interfaceC5776j.mo23107b());
            if (m24720k().m24837n0() && (m23649p = (m24711g = m24711g()).m23649p()) > 0) {
                Object[] m23650o = m24711g.m23650o();
                do {
                    ((C5303j) m23650o[i]).m24724e(c5283g);
                    i++;
                } while (i < m23649p);
            }
        } else {
            z = false;
        }
        m24726b(c5283g);
        m24722i();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m24723f(java.util.Map r9, p127h1.InterfaceC5776j r10, p093f1.C5283g r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            p181jd.Intrinsics.isThisObjectNull(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            p181jd.Intrinsics.isThisObjectNull(r10, r9)
            java.lang.String r9 = "internalPointerEvent"
            p181jd.Intrinsics.isThisObjectNull(r11, r9)
            java.util.Map r9 = r8.f14628d
            boolean r9 = r9.isEmpty()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L1b
        L19:
            r10 = r0
            goto L79
        L1b:
            f1.a0 r9 = r8.m24720k()
            boolean r9 = r9.m24837n0()
            if (r9 != 0) goto L26
            goto L19
        L26:
            f1.m r9 = r8.f14630f
            p181jd.Intrinsics.ifNullDoSomething(r9)
            h1.j r1 = r8.f14629e
            p181jd.Intrinsics.ifNullDoSomething(r1)
            long r1 = r1.mo23107b()
            f1.a0 r3 = r8.m24720k()
            androidx.compose.ui.input.pointer.a r4 = androidx.compose.p018ui.input.pointer.EnumC0662a.Initial
            r3.mo24835p0(r9, r4, r1)
            f1.a0 r3 = r8.m24720k()
            boolean r3 = r3.m24837n0()
            if (r3 == 0) goto L66
            g0.e r3 = r8.m24711g()
            int r4 = r3.m23649p()
            if (r4 <= 0) goto L66
            java.lang.Object[] r3 = r3.m23650o()
        L55:
            r5 = r3[r0]
            f1.j r5 = (p093f1.C5303j) r5
            java.util.Map r6 = r8.f14628d
            h1.j r7 = r8.f14629e
            p181jd.Intrinsics.ifNullDoSomething(r7)
            r5.m24723f(r6, r7, r11, r12)
            int r0 = r0 + r10
            if (r0 < r4) goto L55
        L66:
            f1.a0 r11 = r8.m24720k()
            boolean r11 = r11.m24837n0()
            if (r11 == 0) goto L79
            f1.a0 r11 = r8.m24720k()
            androidx.compose.ui.input.pointer.a r12 = androidx.compose.p018ui.input.pointer.EnumC0662a.Main
            r11.mo24835p0(r9, r12, r1)
        L79:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p093f1.C5303j.m24723f(java.util.Map, h1.j, f1.g, boolean):boolean");
    }

    /* renamed from: j */
    public final MutableVector m24721j() {
        return this.f14627c;
    }

    /* renamed from: k */
    public final AbstractC5271a0 m24720k() {
        return this.f14626b;
    }

    /* renamed from: m */
    public final void m24718m() {
        this.f14632h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f14626b + ", children=" + m24711g() + ", pointerIds=" + this.f14627c + ')';
    }
}
