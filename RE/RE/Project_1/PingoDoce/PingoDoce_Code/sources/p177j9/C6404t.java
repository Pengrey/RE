package p177j9;

import p136ha.InterfaceC5882b;

/* renamed from: j9.t */
/* loaded from: classes.dex */
public class C6404t<T> implements InterfaceC5882b<T> {

    /* renamed from: c */
    private static final Object f17467c = new Object();

    /* renamed from: a */
    private volatile Object f17468a = f17467c;

    /* renamed from: b */
    private volatile InterfaceC5882b<T> f17469b;

    public C6404t(InterfaceC5882b<T> interfaceC5882b) {
        this.f17469b = interfaceC5882b;
    }

    @Override // p136ha.InterfaceC5882b
    public T get() {
        T t = (T) this.f17468a;
        Object obj = f17467c;
        if (t == obj) {
            synchronized (this) {
                t = this.f17468a;
                if (t == obj) {
                    t = this.f17469b.get();
                    this.f17468a = t;
                    this.f17469b = null;
                }
            }
        }
        return t;
    }
}
