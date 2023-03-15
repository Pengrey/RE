package p051d0;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.InterfaceC5242r1;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p244n0.InterfaceC7575i;
import p244n0.InterfaceC7579k;
import p244n0.Saver;
import p345s.InterfaceC9950h;
import p468yc.C13195u;

/* compiled from: Drawer.kt */
/* renamed from: d0.t */
/* loaded from: classes.dex */
public final class C4652t {

    /* renamed from: b */
    public static final C4653a f12689b = new C4653a(null);

    /* renamed from: a */
    private final C4551e1 f12690a;

    /* compiled from: Drawer.kt */
    /* renamed from: d0.t$a */
    /* loaded from: classes.dex */
    public static final class C4653a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.t$a$a */
        /* loaded from: classes.dex */
        public static final class C4654a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            public static final C4654a f12691w = new C4654a();

            C4654a() {
                super(2);
            }

            /* renamed from: a */
            public final EnumC4657u mo39856d(InterfaceC7579k interfaceC7579k, C4652t c4652t) {
                Intrinsics.isThisObjectNull(interfaceC7579k, "$this$Saver");
                Intrinsics.isThisObjectNull(c4652t, "it");
                return c4652t.m27026c();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.t$a$b */
        /* loaded from: classes.dex */
        public static final class C4655b extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6108l f12692w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4655b(InterfaceC6108l interfaceC6108l) {
                super(1);
                this.f12692w = interfaceC6108l;
            }

            /* renamed from: a */
            public final C4652t mo9587d(EnumC4657u enumC4657u) {
                Intrinsics.isThisObjectNull(enumC4657u, "it");
                return new C4652t(enumC4657u, this.f12692w);
            }
        }

        private C4653a() {
        }

        public /* synthetic */ C4653a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC7575i m27022a(InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(interfaceC6108l, "confirmStateChange");
            return Saver.m18111a(C4654a.f12691w, new C4655b(interfaceC6108l));
        }
    }

    public C4652t(EnumC4657u enumC4657u, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(enumC4657u, "initialValue");
        Intrinsics.isThisObjectNull(interfaceC6108l, "confirmStateChange");
        this.f12690a = new C4551e1(enumC4657u, Drawer.m27054e(), interfaceC6108l);
    }

    /* renamed from: a */
    public final Object m27028a(EnumC4657u enumC4657u, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m27223i = m27024e().m27223i(enumC4657u, interfaceC9950h, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m27223i == m34636d ? m27223i : C13195u.f34156a;
    }

    /* renamed from: b */
    public final Object m27027b(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m27028a = m27028a(EnumC4657u.Closed, Drawer.m27054e(), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m27028a == m34636d ? m27028a : C13195u.f34156a;
    }

    /* renamed from: c */
    public final EnumC4657u m27026c() {
        return (EnumC4657u) this.f12690a.m27217o();
    }

    /* renamed from: d */
    public final InterfaceC5242r1 m27025d() {
        return this.f12690a.m27213s();
    }

    /* renamed from: e */
    public final C4551e1 m27024e() {
        return this.f12690a;
    }

    /* renamed from: f */
    public final boolean m27023f() {
        return m27026c() == EnumC4657u.Open;
    }
}
