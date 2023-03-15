package p345s;

import id.InterfaceC6108l;
import p181jd.Intrinsics;
import p345s.AbstractC9976o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.r0 */
/* loaded from: classes.dex */
public final class VectorConverters<T, V extends AbstractC9976o> implements InterfaceC9980q0 {

    /* renamed from: a */
    private final InterfaceC6108l f26147a;

    /* renamed from: b */
    private final InterfaceC6108l f26148b;

    public VectorConverters(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "convertToVector");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "convertFromVector");
        this.f26147a = interfaceC6108l;
        this.f26148b = interfaceC6108l2;
    }

    /* renamed from: a */
    public InterfaceC6108l mo9468a() {
        return this.f26147a;
    }

    /* renamed from: b */
    public InterfaceC6108l mo9467b() {
        return this.f26148b;
    }
}
