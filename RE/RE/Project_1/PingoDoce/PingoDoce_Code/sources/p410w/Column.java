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

/* renamed from: w.j */
/* loaded from: classes.dex */
public final class Column {

    /* renamed from: a */
    private static final InterfaceC5804s f29384a;

    /* compiled from: Column.kt */
    /* renamed from: w.j$a */
    /* loaded from: classes.dex */
    static final class C11466a extends AbstractC6438m implements InterfaceC6115s {

        /* renamed from: w */
        public static final C11466a f29385w = new C11466a();

        C11466a() {
            super(5);
        }

        /* renamed from: K */
        public /* bridge */ /* synthetic */ Object mo22156K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m5057a(((Number) obj).intValue(), (int[]) obj2, (EnumC13618o) obj3, (Density) obj4, (int[]) obj5);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m5057a(int i, int[] iArr, EnumC13618o enumC13618o, Density density, int[] iArr2) {
            Intrinsics.isThisObjectNull(iArr, "size");
            Intrinsics.isThisObjectNull(enumC13618o, "$noName_2");
            Intrinsics.isThisObjectNull(density, "density");
            Intrinsics.isThisObjectNull(iArr2, "outPosition");
            Arrangement.f29297a.m5175d().m5144b(density, i, iArr, iArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Column.kt */
    /* renamed from: w.j$b */
    /* loaded from: classes.dex */
    public static final class C11467b extends AbstractC6438m implements InterfaceC6115s {

        /* renamed from: w */
        final /* synthetic */ Arrangement.InterfaceC11424k f29386w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11467b(Arrangement.InterfaceC11424k interfaceC11424k) {
            super(5);
            this.f29386w = interfaceC11424k;
        }

        /* renamed from: K */
        public /* bridge */ /* synthetic */ Object mo22156K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m5055a(((Number) obj).intValue(), (int[]) obj2, (EnumC13618o) obj3, (Density) obj4, (int[]) obj5);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m5055a(int i, int[] iArr, EnumC13618o enumC13618o, Density density, int[] iArr2) {
            Intrinsics.isThisObjectNull(iArr, "size");
            Intrinsics.isThisObjectNull(enumC13618o, "$noName_2");
            Intrinsics.isThisObjectNull(density, "density");
            Intrinsics.isThisObjectNull(iArr2, "outPosition");
            this.f29386w.m5144b(density, i, iArr, iArr2);
        }
    }

    static {
        EnumC11486q enumC11486q = EnumC11486q.Vertical;
        float m5145a = Arrangement.f29297a.m5175d().m5145a();
        AbstractC11475m m5032a = AbstractC11475m.f29401a.m5032a(InterfaceC9560a.f25145a.m10591e());
        f29384a = RowColumnImpl.m5196m(enumC11486q, C11466a.f29385w, m5145a, EnumC11458g0.Wrap, m5032a);
    }

    /* renamed from: a */
    public static final InterfaceC5804s m5060a(Arrangement.InterfaceC11424k interfaceC11424k, InterfaceC9560a.InterfaceC9562b interfaceC9562b, InterfaceC5179i interfaceC5179i, int i) {
        InterfaceC5804s m5196m;
        Intrinsics.isThisObjectNull(interfaceC11424k, "verticalArrangement");
        Intrinsics.isThisObjectNull(interfaceC9562b, "horizontalAlignment");
        interfaceC5179i.mo25263g(1466279533);
        interfaceC5179i.mo25263g(-3686552);
        boolean mo25276I = interfaceC5179i.mo25276I(interfaceC11424k) | interfaceC5179i.mo25276I(interfaceC9562b);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            if (Intrinsics.equals(interfaceC11424k, Arrangement.f29297a.m5175d()) && Intrinsics.equals(interfaceC9562b, InterfaceC9560a.f25145a.m10591e())) {
                m5196m = m5059b();
            } else {
                EnumC11486q enumC11486q = EnumC11486q.Vertical;
                float m5145a = interfaceC11424k.m5145a();
                AbstractC11475m m5032a = AbstractC11475m.f29401a.m5032a(interfaceC9562b);
                m5196m = RowColumnImpl.m5196m(enumC11486q, new C11467b(interfaceC11424k), m5145a, EnumC11458g0.Wrap, m5032a);
            }
            mo25262h = m5196m;
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5804s interfaceC5804s = (InterfaceC5804s) mo25262h;
        interfaceC5179i.mo25282C();
        return interfaceC5804s;
    }

    /* renamed from: b */
    public static final InterfaceC5804s m5059b() {
        return f29384a;
    }
}
