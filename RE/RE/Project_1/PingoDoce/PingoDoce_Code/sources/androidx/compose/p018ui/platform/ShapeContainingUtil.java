package androidx.compose.p018ui.platform;

import kotlin.NoWhenBranchMatchedException;
import p181jd.Intrinsics;
import p373u0.C10769a;
import p373u0.C10779j;
import p373u0.Rect;
import p393v0.C11042n;
import p393v0.C11066u0;
import p393v0.InterfaceC11052q0;
import p393v0.Outline;

/* renamed from: androidx.compose.ui.platform.i1 */
/* loaded from: classes.dex */
public final class ShapeContainingUtil {
    /* renamed from: a */
    private static final boolean m39724a(C10779j c10779j) {
        return C10769a.m7175d(c10779j.m7106h()) + C10769a.m7175d(c10779j.m7105i()) <= c10779j.m7104j() && C10769a.m7175d(c10779j.m7112b()) + C10769a.m7175d(c10779j.m7111c()) <= c10779j.m7104j() && C10769a.m7174e(c10779j.m7106h()) + C10769a.m7174e(c10779j.m7112b()) <= c10779j.m7110d() && C10769a.m7174e(c10779j.m7105i()) + C10769a.m7174e(c10779j.m7111c()) <= c10779j.m7110d();
    }

    /* renamed from: b */
    public static final boolean m39723b(Outline outline, float f, float f2, InterfaceC11052q0 interfaceC11052q0, InterfaceC11052q0 interfaceC11052q02) {
        Intrinsics.isThisObjectNull(outline, "outline");
        if (outline instanceof Outline.C11040b) {
            return m39721d(((Outline.C11040b) outline).m6424a(), f, f2);
        }
        if (outline instanceof Outline.C11041c) {
            return m39720e((Outline.C11041c) outline, f, f2, interfaceC11052q0, interfaceC11052q02);
        }
        if (outline instanceof Outline.C11039a) {
            return m39722c(((Outline.C11039a) outline).m6425a(), f, f2, interfaceC11052q0, interfaceC11052q02);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    private static final boolean m39722c(InterfaceC11052q0 interfaceC11052q0, float f, float f2, InterfaceC11052q0 interfaceC11052q02, InterfaceC11052q0 interfaceC11052q03) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (interfaceC11052q02 == null) {
            interfaceC11052q02 = C11042n.m6421a();
        }
        interfaceC11052q02.mo6314c(rect);
        if (interfaceC11052q03 == null) {
            interfaceC11052q03 = C11042n.m6421a();
        }
        interfaceC11052q03.mo6306k(interfaceC11052q0, interfaceC11052q02, C11066u0.f28443a.m6248b());
        boolean isEmpty = interfaceC11052q03.isEmpty();
        interfaceC11052q03.mo6316a();
        interfaceC11052q02.mo6316a();
        return !isEmpty;
    }

    /* renamed from: d */
    private static final boolean m39721d(Rect rect, float f, float f2) {
        return rect.m7125f() <= f && f < rect.m7124g() && rect.m7122i() <= f2 && f2 < rect.m7128c();
    }

    /* renamed from: e */
    private static final boolean m39720e(Outline.C11041c c11041c, float f, float f2, InterfaceC11052q0 interfaceC11052q0, InterfaceC11052q0 interfaceC11052q02) {
        C10779j m6423a = c11041c.m6423a();
        if (f < m6423a.m7109e() || f >= m6423a.m7108f() || f2 < m6423a.m7107g() || f2 >= m6423a.m7113a()) {
            return false;
        }
        if (!m39724a(m6423a)) {
            InterfaceC11052q0 m6421a = interfaceC11052q02 == null ? C11042n.m6421a() : interfaceC11052q02;
            m6421a.mo6313d(m6423a);
            return m39722c(m6421a, f, f2, interfaceC11052q0, interfaceC11052q02);
        }
        float m7175d = C10769a.m7175d(m6423a.m7106h()) + m6423a.m7109e();
        float m7174e = C10769a.m7174e(m6423a.m7106h()) + m6423a.m7107g();
        float m7108f = m6423a.m7108f() - C10769a.m7175d(m6423a.m7105i());
        float m7174e2 = C10769a.m7174e(m6423a.m7105i()) + m6423a.m7107g();
        float m7108f2 = m6423a.m7108f() - C10769a.m7175d(m6423a.m7111c());
        float m7113a = m6423a.m7113a() - C10769a.m7174e(m6423a.m7111c());
        float m7113a2 = m6423a.m7113a() - C10769a.m7174e(m6423a.m7112b());
        float m7175d2 = C10769a.m7175d(m6423a.m7112b()) + m6423a.m7109e();
        if (f >= m7175d || f2 >= m7174e) {
            if (f >= m7175d2 || f2 <= m7113a2) {
                if (f <= m7108f || f2 >= m7174e2) {
                    if (f <= m7108f2 || f2 <= m7113a) {
                        return true;
                    }
                    return m39719f(f, f2, m6423a.m7111c(), m7108f2, m7113a);
                }
                return m39719f(f, f2, m6423a.m7105i(), m7108f, m7174e2);
            }
            return m39719f(f, f2, m6423a.m7112b(), m7175d2, m7113a2);
        }
        return m39719f(f, f2, m6423a.m7106h(), m7175d, m7174e);
    }

    /* renamed from: f */
    private static final boolean m39719f(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float m7175d = C10769a.m7175d(j);
        float m7174e = C10769a.m7174e(j);
        return ((f5 * f5) / (m7175d * m7175d)) + ((f6 * f6) / (m7174e * m7174e)) <= 1.0f;
    }
}
