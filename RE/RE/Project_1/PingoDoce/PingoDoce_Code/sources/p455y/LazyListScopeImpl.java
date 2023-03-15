package p455y;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.Intrinsics;

/* renamed from: y.h */
/* loaded from: classes.dex */
public final class LazyListScopeImpl {

    /* renamed from: a */
    private final InterfaceC6108l f33785a;

    /* renamed from: b */
    private final InterfaceC6112p f33786b;

    public LazyListScopeImpl(InterfaceC6108l interfaceC6108l, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        this.f33785a = interfaceC6108l;
        this.f33786b = interfaceC6112p;
    }

    /* renamed from: a */
    public final InterfaceC6112p m1899a() {
        return this.f33786b;
    }

    /* renamed from: b */
    public final InterfaceC6108l m1898b() {
        return this.f33785a;
    }
}
