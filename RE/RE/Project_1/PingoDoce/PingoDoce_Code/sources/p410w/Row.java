package p410w;

import id.InterfaceC6115s;
import p092f0.InterfaceC5179i;
import p127h1.InterfaceC5804s;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p410w.Arrangement;
import p468yc.C13195u;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: w.c0 */
/* loaded from: classes.dex */
public final class Row {

    /* renamed from: a */
    private static final InterfaceC5804s f29306a;

    /* compiled from: Row.kt */
    /* renamed from: w.c0$a */
    /* loaded from: classes.dex */
    static final class C11426a extends AbstractC6438m implements InterfaceC6115s {

        /* renamed from: w */
        public static final C11426a f29307w = new C11426a();

        C11426a() {
            super(5);
        }

        /* renamed from: K */
        public /* bridge */ /* synthetic */ Object mo22156K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m5139a(((Number) obj).intValue(), (int[]) obj2, (EnumC13618o) obj3, (Density) obj4, (int[]) obj5);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m5139a(int i, int[] iArr, EnumC13618o enumC13618o, Density density, int[] iArr2) {
            Intrinsics.isThisObjectNull(iArr, "size");
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(density, "density");
            Intrinsics.isThisObjectNull(iArr2, "outPosition");
            Arrangement.f29297a.m5176c().m5160c(density, i, iArr, enumC13618o, iArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Row.kt */
    /* renamed from: w.c0$b */
    /* loaded from: classes.dex */
    public static final class C11427b extends AbstractC6438m implements InterfaceC6115s {

        /* renamed from: w */
        final /* synthetic */ Arrangement.InterfaceC11416d f29308w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11427b(Arrangement.InterfaceC11416d interfaceC11416d) {
            super(5);
            this.f29308w = interfaceC11416d;
        }

        /* renamed from: K */
        public /* bridge */ /* synthetic */ Object mo22156K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m5137a(((Number) obj).intValue(), (int[]) obj2, (EnumC13618o) obj3, (Density) obj4, (int[]) obj5);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m5137a(int i, int[] iArr, EnumC13618o enumC13618o, Density density, int[] iArr2) {
            Intrinsics.isThisObjectNull(iArr, "size");
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(density, "density");
            Intrinsics.isThisObjectNull(iArr2, "outPosition");
            this.f29308w.m5160c(density, i, iArr, enumC13618o, iArr2);
        }
    }

    static {
        EnumC11486q enumC11486q = EnumC11486q.Horizontal;
        float m5161a = Arrangement.f29297a.m5176c().m5161a();
        AbstractC11475m m5031b = AbstractC11475m.f29401a.m5031b(InterfaceC9560a.f25145a.m10590f());
        f29306a = RowColumnImpl.m5196m(enumC11486q, C11426a.f29307w, m5161a, EnumC11458g0.Wrap, m5031b);
    }

    /* renamed from: a */
    public static final InterfaceC5804s m5142a() {
        return f29306a;
    }

    /* renamed from: b */
    public static final InterfaceC5804s m5141b(Arrangement.InterfaceC11416d interfaceC11416d, InterfaceC9560a.InterfaceC9563c interfaceC9563c, InterfaceC5179i interfaceC5179i, int i) {
        InterfaceC5804s m5196m;
        Intrinsics.isThisObjectNull(interfaceC11416d, "horizontalArrangement");
        Intrinsics.isThisObjectNull(interfaceC9563c, "verticalAlignment");
        interfaceC5179i.mo25263g(495203992);
        interfaceC5179i.mo25263g(-3686552);
        boolean mo25276I = interfaceC5179i.mo25276I(interfaceC11416d) | interfaceC5179i.mo25276I(interfaceC9563c);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            if (Intrinsics.equals(interfaceC11416d, Arrangement.f29297a.m5176c()) && Intrinsics.equals(interfaceC9563c, InterfaceC9560a.f25145a.m10590f())) {
                m5196m = m5142a();
            } else {
                EnumC11486q enumC11486q = EnumC11486q.Horizontal;
                float m5161a = interfaceC11416d.m5161a();
                AbstractC11475m m5031b = AbstractC11475m.f29401a.m5031b(interfaceC9563c);
                m5196m = RowColumnImpl.m5196m(enumC11486q, new C11427b(interfaceC11416d), m5161a, EnumC11458g0.Wrap, m5031b);
            }
            mo25262h = m5196m;
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5804s interfaceC5804s = (InterfaceC5804s) mo25262h;
        interfaceC5179i.mo25282C();
        return interfaceC5804s;
    }
}
