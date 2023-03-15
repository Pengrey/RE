package p001a0;

import p181jd.Intrinsics;

/* compiled from: RoundedCornerShape.kt */
/* renamed from: a0.g */
/* loaded from: classes.dex */
public final class C0006g {
    static {
        m42192a(50);
    }

    /* renamed from: a */
    public static final RoundedCornerShape m42192a(int i) {
        return m42191b(CornerSize.m42198a(i));
    }

    /* renamed from: b */
    public static final RoundedCornerShape m42191b(InterfaceC0002b interfaceC0002b) {
        Intrinsics.isThisObjectNull(interfaceC0002b, "corner");
        return new RoundedCornerShape(interfaceC0002b, interfaceC0002b, interfaceC0002b, interfaceC0002b);
    }

    /* renamed from: c */
    public static final RoundedCornerShape m42190c(float f) {
        return m42191b(CornerSize.m42197b(f));
    }
}
