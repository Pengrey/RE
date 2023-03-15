package p057d6;

import p042c6.InterfaceC2092a;
import p445xc.InterfaceC12341a;

/* renamed from: d6.a */
/* loaded from: classes.dex */
public final class C4743a<T> implements InterfaceC12341a<T>, InterfaceC2092a<T> {

    /* renamed from: c */
    private static final Object f13017c = new Object();

    /* renamed from: a */
    private volatile InterfaceC12341a<T> f13018a;

    /* renamed from: b */
    private volatile Object f13019b = f13017c;

    private C4743a(InterfaceC12341a<T> interfaceC12341a) {
        this.f13018a = interfaceC12341a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC12341a<T>, T> InterfaceC2092a<T> m26719a(P p) {
        if (p instanceof InterfaceC2092a) {
            return (InterfaceC2092a) p;
        }
        return new C4743a((InterfaceC12341a) C4746d.m26714b(p));
    }

    /* renamed from: b */
    public static <P extends InterfaceC12341a<T>, T> InterfaceC12341a<T> m26718b(P p) {
        C4746d.m26714b(p);
        return p instanceof C4743a ? p : new C4743a(p);
    }

    /* renamed from: c */
    public static Object m26717c(Object obj, Object obj2) {
        if (!(obj != f13017c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: get */
    public T mo42226get() {
        T t = (T) this.f13019b;
        Object obj = f13017c;
        if (t == obj) {
            synchronized (this) {
                t = this.f13019b;
                if (t == obj) {
                    t = this.f13018a.mo42226get();
                    this.f13019b = m26717c(this.f13019b, t);
                    this.f13018a = null;
                }
            }
        }
        return t;
    }
}
