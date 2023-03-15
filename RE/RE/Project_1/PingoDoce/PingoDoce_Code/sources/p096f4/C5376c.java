package p096f4;

import android.graphics.PointF;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import p026b4.C1798b;
import p026b4.C1800d;
import p026b4.C1801e;
import p026b4.C1803g;
import p026b4.C1805i;
import p026b4.C1808l;
import p026b4.InterfaceC1809m;
import p116g4.AbstractC5604c;
import p152i4.C6013a;

/* renamed from: f4.c */
/* loaded from: classes.dex */
public class C5376c {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14825a = AbstractC5604c.C5605a.m23609a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final AbstractC5604c.C5605a f14826b = AbstractC5604c.C5605a.m23609a("k");

    /* renamed from: a */
    private static boolean m24462a(C1801e c1801e) {
        return c1801e == null || (c1801e.mo35327c() && c1801e.mo35328b().get(0).f16603b.equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    private static boolean m24461b(InterfaceC1809m<PointF, PointF> interfaceC1809m) {
        return interfaceC1809m == null || (!(interfaceC1809m instanceof C1805i) && interfaceC1809m.mo35327c() && interfaceC1809m.mo35328b().get(0).f16603b.equals(0.0f, 0.0f));
    }

    /* renamed from: c */
    private static boolean m24460c(C1798b c1798b) {
        return c1798b == null || (c1798b.mo35327c() && c1798b.mo35328b().get(0).f16603b.floatValue() == 0.0f);
    }

    /* renamed from: d */
    private static boolean m24459d(C1803g c1803g) {
        return c1803g == null || (c1803g.mo35327c() && c1803g.mo35328b().get(0).f16603b.m22353a(1.0f, 1.0f));
    }

    /* renamed from: e */
    private static boolean m24458e(C1798b c1798b) {
        return c1798b == null || (c1798b.mo35327c() && c1798b.mo35328b().get(0).f16603b.floatValue() == 0.0f);
    }

    /* renamed from: f */
    private static boolean m24457f(C1798b c1798b) {
        return c1798b == null || (c1798b.mo35327c() && c1798b.mo35328b().get(0).f16603b.floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C1808l m24456g(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        boolean z;
        boolean z2 = false;
        boolean z3 = abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_OBJECT;
        if (z3) {
            abstractC5604c.mo23591e();
        }
        C1798b c1798b = null;
        C1801e c1801e = null;
        InterfaceC1809m<PointF, PointF> interfaceC1809m = null;
        C1803g c1803g = null;
        C1798b c1798b2 = null;
        C1798b c1798b3 = null;
        C1800d c1800d = null;
        C1798b c1798b4 = null;
        C1798b c1798b5 = null;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14825a)) {
                case 0:
                    boolean z4 = z2;
                    abstractC5604c.mo23591e();
                    while (abstractC5604c.mo23580y()) {
                        if (abstractC5604c.mo23595X(f14826b) != 0) {
                            abstractC5604c.mo23594a0();
                            abstractC5604c.mo23593b0();
                        } else {
                            c1801e = C5372a.m24468a(abstractC5604c, c2201d);
                        }
                    }
                    abstractC5604c.mo23584t();
                    z2 = z4;
                    continue;
                case 1:
                    interfaceC1809m = C5372a.m24467b(abstractC5604c, c2201d);
                    continue;
                case 2:
                    c1803g = C5378d.m24445j(abstractC5604c, c2201d);
                    continue;
                case 3:
                    c2201d.m34431a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    c1800d = C5378d.m24447h(abstractC5604c, c2201d);
                    continue;
                case 6:
                    c1798b4 = C5378d.m24449f(abstractC5604c, c2201d, z2);
                    continue;
                case 7:
                    c1798b5 = C5378d.m24449f(abstractC5604c, c2201d, z2);
                    continue;
                case 8:
                    c1798b2 = C5378d.m24449f(abstractC5604c, c2201d, z2);
                    continue;
                case 9:
                    c1798b3 = C5378d.m24449f(abstractC5604c, c2201d, z2);
                    continue;
                default:
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                    continue;
            }
            C1798b m24449f = C5378d.m24449f(abstractC5604c, c2201d, z2);
            if (m24449f.mo35328b().isEmpty()) {
                m24449f.mo35328b().add(new C6013a<>(c2201d, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c2201d.m34426f())));
            } else if (m24449f.mo35328b().get(0).f16603b == null) {
                z = false;
                m24449f.mo35328b().set(0, new C6013a<>(c2201d, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c2201d.m34426f())));
                z2 = z;
                c1798b = m24449f;
            }
            z = false;
            z2 = z;
            c1798b = m24449f;
        }
        if (z3) {
            abstractC5604c.mo23584t();
        }
        C1801e c1801e2 = m24462a(c1801e) ? null : c1801e;
        InterfaceC1809m<PointF, PointF> interfaceC1809m2 = m24461b(interfaceC1809m) ? null : interfaceC1809m;
        C1798b c1798b6 = m24460c(c1798b) ? null : c1798b;
        if (m24459d(c1803g)) {
            c1803g = null;
        }
        return new C1808l(c1801e2, interfaceC1809m2, c1803g, c1798b6, c1800d, c1798b4, c1798b5, m24457f(c1798b2) ? null : c1798b2, m24458e(c1798b3) ? null : c1798b3);
    }
}
