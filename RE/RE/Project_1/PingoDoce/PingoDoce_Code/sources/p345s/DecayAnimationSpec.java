package p345s;

import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.w */
/* loaded from: classes.dex */
public final class DecayAnimationSpec<T> implements InterfaceC10009v {

    /* renamed from: a */
    private final InterfaceC9941c0 f26196a;

    public DecayAnimationSpec(InterfaceC9941c0 interfaceC9941c0) {
        Intrinsics.isThisObjectNull(interfaceC9941c0, "floatDecaySpec");
        this.f26196a = interfaceC9941c0;
    }

    /* renamed from: a */
    public InterfaceC10010v0 mo9409a(InterfaceC9980q0 interfaceC9980q0) {
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
        return new C10021z0(this.f26196a);
    }
}
