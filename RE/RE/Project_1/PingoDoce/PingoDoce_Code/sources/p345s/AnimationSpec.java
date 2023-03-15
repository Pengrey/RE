package p345s;

import p181jd.Intrinsics;

/* renamed from: s.i */
/* loaded from: classes.dex */
public final class AnimationSpec {
    /* renamed from: a */
    public static final /* synthetic */ AbstractC9976o m9569a(InterfaceC9980q0 interfaceC9980q0, Object obj) {
        return m9568b(interfaceC9980q0, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final AbstractC9976o m9568b(InterfaceC9980q0 interfaceC9980q0, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AbstractC9976o) interfaceC9980q0.mo9468a().mo9587d(obj);
    }

    /* renamed from: c */
    public static final C9965m0 m9567c(float f, float f2, Object obj) {
        return new C9965m0(f, f2, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ C9965m0 m9566d(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return m9567c(f, f2, obj);
    }

    /* renamed from: e */
    public static final C9978p0 m9565e(int i, int i2, InterfaceC10016y interfaceC10016y) {
        Intrinsics.isThisObjectNull(interfaceC10016y, "easing");
        return new C9978p0(i, i2, interfaceC10016y);
    }

    /* renamed from: f */
    public static /* synthetic */ C9978p0 m9564f(int i, int i2, InterfaceC10016y interfaceC10016y, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            interfaceC10016y = C10019z.m9389a();
        }
        return m9565e(i, i2, interfaceC10016y);
    }
}
