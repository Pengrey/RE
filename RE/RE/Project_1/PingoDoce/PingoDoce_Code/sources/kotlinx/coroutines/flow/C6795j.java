package kotlinx.coroutines.flow;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6795j {

    /* renamed from: a */
    private static final InterfaceC6108l f18174a = C6797b.f18177w;

    /* renamed from: b */
    private static final InterfaceC6112p f18175b = C6796a.f18176w;

    /* compiled from: Distinct.kt */
    /* renamed from: kotlinx.coroutines.flow.j$a */
    /* loaded from: classes2.dex */
    static final class C6796a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6796a f18176w = new C6796a();

        C6796a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.equals(obj, obj2));
        }
    }

    /* compiled from: Distinct.kt */
    /* renamed from: kotlinx.coroutines.flow.j$b */
    /* loaded from: classes2.dex */
    static final class C6797b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6797b f18177w = new C6797b();

        C6797b() {
            super(1);
        }

        /* renamed from: invoke */
        public final Object mo9587d(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static final InterfaceC6785c m20112a(InterfaceC6785c interfaceC6785c) {
        return interfaceC6785c instanceof InterfaceC6844x ? interfaceC6785c : m20111b(interfaceC6785c, f18174a, f18175b);
    }

    /* renamed from: b */
    private static final InterfaceC6785c m20111b(InterfaceC6785c interfaceC6785c, InterfaceC6108l interfaceC6108l, InterfaceC6112p interfaceC6112p) {
        if (interfaceC6785c instanceof C6780b) {
            C6780b c6780b = (C6780b) interfaceC6785c;
            if (c6780b.f18151x == interfaceC6108l && c6780b.f18152y == interfaceC6112p) {
                return interfaceC6785c;
            }
        }
        return new C6780b(interfaceC6785c, interfaceC6108l, interfaceC6112p);
    }
}
