package p244n0;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;

/* renamed from: n0.j */
/* loaded from: classes.dex */
public final class Saver {

    /* renamed from: a */
    private static final InterfaceC7575i f20055a = m18111a(C7576a.f20056w, C7577b.f20057w);

    /* compiled from: Saver.kt */
    /* renamed from: n0.j$a */
    /* loaded from: classes.dex */
    static final class C7576a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C7576a f20056w = new C7576a();

        C7576a() {
            super(2);
        }

        /* renamed from: a */
        public final Object mo39856d(InterfaceC7579k interfaceC7579k, Object obj) {
            Intrinsics.isThisObjectNull(interfaceC7579k, "$this$Saver");
            return obj;
        }
    }

    /* compiled from: Saver.kt */
    /* renamed from: n0.j$b */
    /* loaded from: classes.dex */
    static final class C7577b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C7577b f20057w = new C7577b();

        C7577b() {
            super(1);
        }

        /* renamed from: invoke */
        public final Object mo9587d(Object obj) {
            Intrinsics.isThisObjectNull(obj, "it");
            return obj;
        }
    }

    /* compiled from: Saver.kt */
    /* renamed from: n0.j$c */
    /* loaded from: classes.dex */
    public static final class C7578c implements InterfaceC7575i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6112p f20058a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC6108l f20059b;

        C7578c(InterfaceC6112p interfaceC6112p, InterfaceC6108l interfaceC6108l) {
            this.f20058a = interfaceC6112p;
            this.f20059b = interfaceC6108l;
        }

        /* renamed from: a */
        public Object mo18113a(InterfaceC7579k interfaceC7579k, Object obj) {
            Intrinsics.isThisObjectNull(interfaceC7579k, "<this>");
            return this.f20058a.mo39856d(interfaceC7579k, obj);
        }

        /* renamed from: b */
        public Object mo18112b(Object obj) {
            Intrinsics.isThisObjectNull(obj, "value");
            return this.f20059b.mo9587d(obj);
        }
    }

    /* renamed from: a */
    public static final InterfaceC7575i m18111a(InterfaceC6112p interfaceC6112p, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "save");
        Intrinsics.isThisObjectNull(interfaceC6108l, "restore");
        return new C7578c(interfaceC6112p, interfaceC6108l);
    }

    /* renamed from: b */
    public static final InterfaceC7575i m18110b() {
        return f20055a;
    }
}
