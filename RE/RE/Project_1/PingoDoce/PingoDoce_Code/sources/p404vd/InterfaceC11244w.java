package p404vd;

import bd.InterfaceC1886d;
import p468yc.C13195u;

/* renamed from: vd.w */
/* loaded from: classes2.dex */
public interface InterfaceC11244w<E> {

    /* compiled from: Channel.kt */
    /* renamed from: vd.w$a */
    /* loaded from: classes2.dex */
    public static final class C11245a {
        /* renamed from: a */
        public static /* synthetic */ boolean m5640a(InterfaceC11244w interfaceC11244w, Throwable th2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th2 = null;
                }
                return interfaceC11244w.mo5642d(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    /* renamed from: b */
    Object mo5643b(E e, InterfaceC1886d<? super C13195u> interfaceC1886d);

    /* renamed from: d */
    boolean mo5642d(Throwable th2);

    /* renamed from: i */
    Object mo5641i(E e);
}
