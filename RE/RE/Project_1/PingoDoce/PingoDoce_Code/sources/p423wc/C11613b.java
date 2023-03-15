package p423wc;

import p445xc.InterfaceC12341a;

/* renamed from: wc.b */
/* loaded from: classes2.dex */
public final class C11613b<T> implements InterfaceC12341a<T> {

    /* renamed from: c */
    private static final Object f29700c = new Object();

    /* renamed from: a */
    private volatile InterfaceC12341a<T> f29701a;

    /* renamed from: b */
    private volatile Object f29702b = f29700c;

    private C11613b(InterfaceC12341a<T> interfaceC12341a) {
        this.f29701a = interfaceC12341a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC12341a<T>, T> InterfaceC12341a<T> m4596a(P p) {
        C11617f.m4590a(p);
        return p instanceof C11613b ? p : new C11613b(p);
    }

    /* renamed from: b */
    private static Object m4595b(Object obj, Object obj2) {
        if (!(obj != f29700c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: get */
    public T mo42226get() {
        T t = (T) this.f29702b;
        Object obj = f29700c;
        if (t == obj) {
            synchronized (this) {
                t = this.f29702b;
                if (t == obj) {
                    t = this.f29701a.mo42226get();
                    this.f29702b = m4595b(this.f29702b, t);
                    this.f29701a = null;
                }
            }
        }
        return t;
    }
}
