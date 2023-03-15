package p051d0;

import id.InterfaceC6097a;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p393v0.C11003c0;
import p393v0.Color;

/* renamed from: d0.h */
/* loaded from: classes.dex */
public final class Colors {

    /* renamed from: a */
    private static final AbstractC5250t0 f12446a = CompositionLocal.m24951d(C4580a.f12447w);

    /* compiled from: Colors.kt */
    /* renamed from: d0.h$a */
    /* loaded from: classes.dex */
    static final class C4580a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C4580a f12447w = new C4580a();

        C4580a() {
            super(0);
        }

        /* renamed from: a */
        public final C4576g mo42214q() {
            return Colors.m27143f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    /* renamed from: a */
    public static final long m27148a(C4576g c4576g, long j) {
        Intrinsics.isThisObjectNull(c4576g, "$this$contentColorFor");
        if (!Color.m6646n(j, c4576g.m27171j()) && !Color.m6646n(j, c4576g.m27170k())) {
            if (!Color.m6646n(j, c4576g.m27169l()) && !Color.m6646n(j, c4576g.m27168m())) {
                return Color.m6646n(j, c4576g.m27178c()) ? c4576g.m27176e() : Color.m6646n(j, c4576g.m27167n()) ? c4576g.m27172i() : Color.m6646n(j, c4576g.m27177d()) ? c4576g.m27175f() : Color.f28297b.m6632f();
            }
            return c4576g.m27173h();
        }
        return c4576g.m27174g();
    }

    /* renamed from: b */
    public static final long m27147b(long j, InterfaceC5179i interfaceC5179i, int i) {
        long m27148a = m27148a(C4591j0.f12477a.m27117a(interfaceC5179i, 6), j);
        return (m27148a > Color.f28297b.m6632f() ? 1 : (m27148a == Color.f28297b.m6632f() ? 0 : -1)) != 0 ? m27148a : ((Color) interfaceC5179i.mo25256n(C4602m.m27098a())).m6638v();
    }

    /* renamed from: c */
    public static final AbstractC5250t0 m27146c() {
        return f12446a;
    }

    /* renamed from: d */
    public static final long m27145d(C4576g c4576g) {
        Intrinsics.isThisObjectNull(c4576g, "<this>");
        return c4576g.m27166o() ? c4576g.m27171j() : c4576g.m27167n();
    }

    /* renamed from: e */
    public static final C4576g m27144e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new C4576g(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    /* renamed from: f */
    public static /* synthetic */ C4576g m27143f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        return m27144e((i & 1) != 0 ? C11003c0.m6593c(4284612846L) : j, (i & 2) != 0 ? C11003c0.m6593c(4281794739L) : j2, (i & 4) != 0 ? C11003c0.m6593c(4278442694L) : j3, (i & 8) != 0 ? C11003c0.m6593c(4278290310L) : j4, (i & 16) != 0 ? Color.f28297b.m6631g() : j5, (i & 32) != 0 ? Color.f28297b.m6631g() : j6, (i & 64) != 0 ? C11003c0.m6593c(4289724448L) : j7, (i & 128) != 0 ? Color.f28297b.m6631g() : j8, (i & 256) != 0 ? Color.f28297b.m6637a() : j9, (i & 512) != 0 ? Color.f28297b.m6637a() : j10, (i & 1024) != 0 ? Color.f28297b.m6637a() : j11, (i & 2048) != 0 ? Color.f28297b.m6631g() : j12);
    }

    /* renamed from: g */
    public static final void m27142g(C4576g c4576g, C4576g c4576g2) {
        Intrinsics.isThisObjectNull(c4576g, "<this>");
        Intrinsics.isThisObjectNull(c4576g2, "other");
        c4576g.m27157x(c4576g2.m27171j());
        c4576g.m27156y(c4576g2.m27170k());
        c4576g.m27155z(c4576g2.m27169l());
        c4576g.m27182A(c4576g2.m27168m());
        c4576g.m27165p(c4576g2.m27178c());
        c4576g.m27181B(c4576g2.m27167n());
        c4576g.m27164q(c4576g2.m27177d());
        c4576g.m27160u(c4576g2.m27174g());
        c4576g.m27159v(c4576g2.m27173h());
        c4576g.m27162s(c4576g2.m27176e());
        c4576g.m27158w(c4576g2.m27172i());
        c4576g.m27161t(c4576g2.m27175f());
        c4576g.m27163r(c4576g2.m27166o());
    }
}
