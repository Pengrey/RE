package td;

import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import p468yc.C13195u;

/* renamed from: td.j */
/* loaded from: classes2.dex */
public interface InterfaceC10529j<T> extends InterfaceC1886d<T> {

    /* compiled from: CancellableContinuation.kt */
    /* renamed from: td.j$a */
    /* loaded from: classes2.dex */
    public static final class C10530a {
        /* renamed from: a */
        public static /* synthetic */ boolean m7773a(InterfaceC10529j interfaceC10529j, Throwable th2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th2 = null;
                }
                return interfaceC10529j.mo7776p(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m7772b(InterfaceC10529j interfaceC10529j, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return interfaceC10529j.mo7779k(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    /* renamed from: S */
    void mo7781S(Object obj);

    /* renamed from: V */
    void mo7780V(AbstractC10505e0 abstractC10505e0, T t);

    /* renamed from: k */
    Object mo7779k(T t, Object obj);

    /* renamed from: n */
    void mo7778n(InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l);

    /* renamed from: o */
    void mo7777o(T t, InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l);

    /* renamed from: p */
    boolean mo7776p(Throwable th2);

    /* renamed from: u */
    Object mo7775u(T t, Object obj, InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l);

    /* renamed from: x */
    Object mo7774x(Throwable th2);
}
