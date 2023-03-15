package p051d0;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p127h1.InterfaceC5753d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7591h;
import p245n1.C7600o;
import p245n1.C7617t;
import p245n1.InterfaceC7621v;
import p302q0.InterfaceC9570f;
import p346s0.C10031i;
import p373u0.C10781l;
import p393v0.C11015f0;
import p393v0.Color;
import p393v0.ColorFilter;
import p410w.C11430e;
import p410w.Size;
import p456y0.Painter;
import p468yc.C13195u;
import p479z1.C13605g;

/* renamed from: d0.g0 */
/* loaded from: classes.dex */
public final class Icon {

    /* renamed from: a */
    private static final InterfaceC9570f f12438a = Size.m5094o(InterfaceC9570f.f25164r, C13605g.m875g(24));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Icon.kt */
    /* renamed from: d0.g0$a */
    /* loaded from: classes.dex */
    public static final class C4577a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f12439A;

        /* renamed from: B */
        final /* synthetic */ int f12440B;

        /* renamed from: w */
        final /* synthetic */ Painter f12441w;

        /* renamed from: x */
        final /* synthetic */ String f12442x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC9570f f12443y;

        /* renamed from: z */
        final /* synthetic */ long f12444z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4577a(Painter painter, String str, InterfaceC9570f interfaceC9570f, long j, int i, int i2) {
            super(2);
            this.f12441w = painter;
            this.f12442x = str;
            this.f12443y = interfaceC9570f;
            this.f12444z = j;
            this.f12439A = i;
            this.f12440B = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27151a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27151a(InterfaceC5179i interfaceC5179i, int i) {
            Icon.m27154a(this.f12441w, this.f12442x, this.f12443y, this.f12444z, interfaceC5179i, this.f12439A | 1, this.f12440B);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Icon.kt */
    /* renamed from: d0.g0$b */
    /* loaded from: classes.dex */
    public static final class C4578b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f12445w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4578b(String str) {
            super(1);
            this.f12445w = str;
        }

        /* renamed from: a */
        public final void m27150a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
            C7617t.m17922p(interfaceC7621v, this.f12445w);
            C7617t.m17917u(interfaceC7621v, C7591h.f20087b.m18058c());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27150a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final void m27154a(Painter painter, String str, InterfaceC9570f interfaceC9570f, long j, InterfaceC5179i interfaceC5179i, int i, int i2) {
        InterfaceC9570f interfaceC9570f2;
        Intrinsics.isThisObjectNull(painter, "painter");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(1547384967);
        InterfaceC9570f.C9571a c9571a = (i2 & 4) != 0 ? InterfaceC9570f.f25164r : interfaceC9570f;
        long m6648l = (i2 & 8) != 0 ? Color.m6648l(((Color) mo25249u.mo25256n(C4602m.m27098a())).m6638v(), ((Number) mo25249u.mo25256n(C4598l.m27102a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        ColorFilter m6600b = Color.m6646n(m6648l, Color.f28297b.m6632f()) ? null : ColorFilter.C11000a.m6600b(ColorFilter.f28316b, m6648l, 0, 2, null);
        mo25249u.mo25263g(1547385320);
        if (str != null) {
            InterfaceC9570f.C9571a c9571a2 = InterfaceC9570f.f25164r;
            mo25249u.mo25263g(-3686930);
            boolean mo25276I = mo25249u.mo25276I(str);
            Object mo25262h = mo25249u.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new C4578b(str);
                mo25249u.mo25247w(mo25262h);
            }
            mo25249u.mo25282C();
            interfaceC9570f2 = C7600o.m18015b(c9571a2, false, (InterfaceC6108l) mo25262h, 1, null);
        } else {
            interfaceC9570f2 = InterfaceC9570f.f25164r;
        }
        mo25249u.mo25282C();
        C11430e.m5126a(C10031i.m9355b(m27153b(C11015f0.m6527d(c9571a), painter), painter, false, null, InterfaceC5753d.f16069a.m23144a(), 0.0f, m6600b, 22, null).mo7205u(interfaceC9570f2), mo25249u, 0);
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C4577a(painter, str, c9571a, m6648l, i, i2));
    }

    /* renamed from: b */
    private static final InterfaceC9570f m27153b(InterfaceC9570f interfaceC9570f, Painter painter) {
        InterfaceC9570f interfaceC9570f2;
        if (!C10781l.m7094f(painter.m1760h(), C10781l.f27885b.m7087a()) && !m27152c(painter.m1760h())) {
            interfaceC9570f2 = InterfaceC9570f.f25164r;
        } else {
            interfaceC9570f2 = f12438a;
        }
        return interfaceC9570f.mo7205u(interfaceC9570f2);
    }

    /* renamed from: c */
    private static final boolean m27152c(long j) {
        return Float.isInfinite(C10781l.m7091i(j)) && Float.isInfinite(C10781l.m7093g(j));
    }
}
