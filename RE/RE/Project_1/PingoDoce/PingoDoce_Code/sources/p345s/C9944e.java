package p345s;

import p181jd.Intrinsics;

/* compiled from: Animation.kt */
/* renamed from: s.e */
/* loaded from: classes.dex */
public final class C9944e {
    /* renamed from: a */
    public static final C9977o0 m9596a(InterfaceC9950h interfaceC9950h, InterfaceC9980q0 interfaceC9980q0, Object obj, Object obj2, Object obj3) {
        Intrinsics.isThisObjectNull(interfaceC9950h, "animationSpec");
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
        return new C9977o0(interfaceC9950h, interfaceC9980q0, obj, obj2, (AbstractC9976o) interfaceC9980q0.mo9468a().mo9587d(obj3));
    }

    /* renamed from: b */
    public static final long m9595b(Animation animation) {
        Intrinsics.isThisObjectNull(animation, "<this>");
        return animation.m9615c() / 1000000;
    }
}
