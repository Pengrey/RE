package p169j1;

import androidx.compose.p018ui.platform.ViewConfiguration;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import p127h1.InterfaceC5804s;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public interface ComposeUiNode {

    /* renamed from: o */
    public static final C6227a f17063o = C6227a.f17064a;

    /* compiled from: ComposeUiNode.kt */
    /* renamed from: j1.a$a */
    /* loaded from: classes.dex */
    public static final class C6227a {

        /* renamed from: a */
        static final /* synthetic */ C6227a f17064a = new C6227a();

        /* renamed from: b */
        private static final InterfaceC6097a f17065b = LayoutNode.f17161i0.m21488a();

        /* renamed from: c */
        private static final InterfaceC6112p f17066c = C6231d.f17074w;

        /* renamed from: d */
        private static final InterfaceC6112p f17067d = C6228a.f17071w;

        /* renamed from: e */
        private static final InterfaceC6112p f17068e = C6230c.f17073w;

        /* renamed from: f */
        private static final InterfaceC6112p f17069f = C6229b.f17072w;

        /* renamed from: g */
        private static final InterfaceC6112p f17070g = C6232e.f17075w;

        /* compiled from: ComposeUiNode.kt */
        /* renamed from: j1.a$a$a */
        /* loaded from: classes.dex */
        static final class C6228a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            public static final C6228a f17071w = new C6228a();

            C6228a() {
                super(2);
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m21770a((ComposeUiNode) obj, (Density) obj2);
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m21770a(ComposeUiNode composeUiNode, Density density) {
                Intrinsics.isThisObjectNull(composeUiNode, "$this$null");
                Intrinsics.isThisObjectNull(density, "it");
                composeUiNode.m21777h(density);
            }
        }

        /* compiled from: ComposeUiNode.kt */
        /* renamed from: j1.a$a$b */
        /* loaded from: classes.dex */
        static final class C6229b extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            public static final C6229b f17072w = new C6229b();

            C6229b() {
                super(2);
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m21769a((ComposeUiNode) obj, (EnumC13618o) obj2);
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m21769a(ComposeUiNode composeUiNode, EnumC13618o enumC13618o) {
                Intrinsics.isThisObjectNull(composeUiNode, "$this$null");
                Intrinsics.isThisObjectNull(enumC13618o, "it");
                composeUiNode.m21779d(enumC13618o);
            }
        }

        /* compiled from: ComposeUiNode.kt */
        /* renamed from: j1.a$a$c */
        /* loaded from: classes.dex */
        static final class C6230c extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            public static final C6230c f17073w = new C6230c();

            C6230c() {
                super(2);
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m21768a((ComposeUiNode) obj, (InterfaceC5804s) obj2);
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m21768a(ComposeUiNode composeUiNode, InterfaceC5804s interfaceC5804s) {
                Intrinsics.isThisObjectNull(composeUiNode, "$this$null");
                Intrinsics.isThisObjectNull(interfaceC5804s, "it");
                composeUiNode.m21780c(interfaceC5804s);
            }
        }

        /* compiled from: ComposeUiNode.kt */
        /* renamed from: j1.a$a$d */
        /* loaded from: classes.dex */
        static final class C6231d extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            public static final C6231d f17074w = new C6231d();

            C6231d() {
                super(2);
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m21767a((ComposeUiNode) obj, (InterfaceC9570f) obj2);
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m21767a(ComposeUiNode composeUiNode, InterfaceC9570f interfaceC9570f) {
                Intrinsics.isThisObjectNull(composeUiNode, "$this$null");
                Intrinsics.isThisObjectNull(interfaceC9570f, "it");
                composeUiNode.m21778g(interfaceC9570f);
            }
        }

        /* compiled from: ComposeUiNode.kt */
        /* renamed from: j1.a$a$e */
        /* loaded from: classes.dex */
        static final class C6232e extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            public static final C6232e f17075w = new C6232e();

            C6232e() {
                super(2);
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m21766a((ComposeUiNode) obj, (ViewConfiguration) obj2);
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m21766a(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                Intrinsics.isThisObjectNull(composeUiNode, "$this$null");
                Intrinsics.isThisObjectNull(viewConfiguration, "it");
                composeUiNode.m21781b(viewConfiguration);
            }
        }

        private C6227a() {
        }

        /* renamed from: a */
        public final InterfaceC6097a m21776a() {
            return f17065b;
        }

        /* renamed from: b */
        public final InterfaceC6112p m21775b() {
            return f17067d;
        }

        /* renamed from: c */
        public final InterfaceC6112p m21774c() {
            return f17069f;
        }

        /* renamed from: d */
        public final InterfaceC6112p m21773d() {
            return f17068e;
        }

        /* renamed from: e */
        public final InterfaceC6112p m21772e() {
            return f17066c;
        }

        /* renamed from: f */
        public final InterfaceC6112p m21771f() {
            return f17070g;
        }
    }

    /* renamed from: b */
    void m21781b(ViewConfiguration viewConfiguration);

    /* renamed from: c */
    void m21780c(InterfaceC5804s interfaceC5804s);

    /* renamed from: d */
    void m21779d(EnumC13618o enumC13618o);

    /* renamed from: g */
    void m21778g(InterfaceC9570f interfaceC9570f);

    /* renamed from: h */
    void m21777h(Density density);
}
