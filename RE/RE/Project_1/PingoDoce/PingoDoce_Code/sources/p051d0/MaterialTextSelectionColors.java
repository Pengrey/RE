package p051d0;

import p036c0.C1976j;
import p092f0.InterfaceC5179i;
import p181jd.Intrinsics;
import p393v0.C11003c0;
import p393v0.Color;

/* renamed from: d0.i0 */
/* loaded from: classes.dex */
public final class MaterialTextSelectionColors {
    /* renamed from: a */
    private static final float m27127a(long j, long j2, long j3) {
        float f = 0.4f;
        float f2 = 0.2f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float m27125c = (m27125c(j, f, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= m27125c && m27125c <= 0.01f) {
                break;
            }
            if (m27125c < 0.0f) {
                f3 = f;
            } else {
                f2 = f;
            }
            f = (f3 + f2) / 2.0f;
        }
        return f;
    }

    /* renamed from: b */
    public static final float m27126b(long j, long j2) {
        float m6589g = C11003c0.m6589g(j) + 0.05f;
        float m6589g2 = C11003c0.m6589g(j2) + 0.05f;
        return Math.max(m6589g, m6589g2) / Math.min(m6589g, m6589g2);
    }

    /* renamed from: c */
    private static final float m27125c(long j, float f, long j2, long j3) {
        long m6591e = C11003c0.m6591e(Color.m6648l(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m27126b(C11003c0.m6591e(j2, m6591e), m6591e);
    }

    /* renamed from: d */
    public static final long m27124d(long j, long j2, long j3) {
        float m27127a;
        float m27125c = m27125c(j, 0.4f, j2, j3);
        float m27125c2 = m27125c(j, 0.2f, j2, j3);
        if (m27125c >= 4.5f) {
            m27127a = 0.4f;
        } else {
            m27127a = m27125c2 < 4.5f ? 0.2f : m27127a(j, j2, j3);
        }
        return Color.m6648l(j, m27127a, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: e */
    public static final C1976j m27123e(C4576g c4576g, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(c4576g, "colors");
        interfaceC5179i.mo25263g(35572393);
        long m27171j = c4576g.m27171j();
        long m27178c = c4576g.m27178c();
        interfaceC5179i.mo25263g(35572910);
        long m27148a = Colors.m27148a(c4576g, m27178c);
        if (!(m27148a != Color.f28297b.m6632f())) {
            m27148a = ((Color) interfaceC5179i.mo25256n(C4602m.m27098a())).m6638v();
        }
        interfaceC5179i.mo25282C();
        long m6648l = Color.m6648l(m27148a, C4594k.f12480a.m27107d(interfaceC5179i, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m6652h = Color.m6652h(m27171j);
        Color m6652h2 = Color.m6652h(m27178c);
        Color m6652h3 = Color.m6652h(m6648l);
        interfaceC5179i.mo25263g(-3686095);
        boolean mo25276I = interfaceC5179i.mo25276I(m6652h) | interfaceC5179i.mo25276I(m6652h2) | interfaceC5179i.mo25276I(m6652h3);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = new C1976j(c4576g.m27171j(), m27124d(m27171j, m6648l, m27178c), null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        C1976j c1976j = (C1976j) mo25262h;
        interfaceC5179i.mo25282C();
        return c1976j;
    }
}
