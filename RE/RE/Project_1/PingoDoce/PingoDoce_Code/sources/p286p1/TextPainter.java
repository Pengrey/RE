package p286p1;

import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.C10778i;
import p373u0.C10783m;
import p373u0.Rect;
import p393v0.InterfaceC11064u;
import p457y1.C13070h;
import p479z1.C13615m;

/* renamed from: p1.v */
/* loaded from: classes.dex */
public final class TextPainter {

    /* renamed from: a */
    public static final TextPainter f21717a = new TextPainter();

    private TextPainter() {
    }

    /* renamed from: a */
    public final void m15545a(InterfaceC11064u interfaceC11064u, C8392u c8392u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        Intrinsics.isThisObjectNull(c8392u, "textLayoutResult");
        boolean z = c8392u.m15560f() && C13070h.m1692d(c8392u.m15558h().m15571g(), C13070h.f33992a.m1689a());
        if (z) {
            Rect m7114a = C10778i.m7114a(C10774f.f27866b.m7134c(), C10783m.m7085a(C13615m.m824g(c8392u.m15546t()), C13615m.m825f(c8392u.m15546t())));
            interfaceC11064u.m6269h();
            InterfaceC11064u.C11065a.m6257d(interfaceC11064u, m7114a, 0, 2, null);
        }
        try {
            c8392u.m15550p().m15734r(interfaceC11064u, c8392u.m15558h().m15567k().m15521f(), c8392u.m15558h().m15567k().m15511p(), c8392u.m15558h().m15567k().m15509r());
        } finally {
            if (z) {
                interfaceC11064u.m6270g();
            }
        }
    }
}
