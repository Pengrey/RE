package p057d6;

import p042c6.InterfaceC2092a;

/* renamed from: d6.c */
/* loaded from: classes.dex */
public final class C4745c<T> implements InterfaceC4744b<T>, InterfaceC2092a<T> {

    /* renamed from: a */
    private final T f13020a;

    static {
        new C4745c(null);
    }

    private C4745c(T t) {
        this.f13020a = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC4744b<T> m26716a(T t) {
        return new C4745c(C4746d.m26713c(t, "instance cannot be null"));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: get */
    public T mo42226get() {
        return this.f13020a;
    }
}
