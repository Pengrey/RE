package kotlinx.coroutines.sync;

import bd.InterfaceC1886d;
import p468yc.C13195u;

/* renamed from: kotlinx.coroutines.sync.c */
/* loaded from: classes2.dex */
public interface InterfaceC6930c {

    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.sync.c$a */
    /* loaded from: classes2.dex */
    public static final class C6931a {
        /* renamed from: a */
        public static /* synthetic */ Object m19773a(InterfaceC6930c interfaceC6930c, Object obj, InterfaceC1886d interfaceC1886d, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return interfaceC6930c.mo19768c(obj, interfaceC1886d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m19772b(InterfaceC6930c interfaceC6930c, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return interfaceC6930c.mo19769b(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        /* renamed from: c */
        public static /* synthetic */ void m19771c(InterfaceC6930c interfaceC6930c, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            interfaceC6930c.mo19770a(obj);
        }
    }

    /* renamed from: a */
    void mo19770a(Object obj);

    /* renamed from: b */
    boolean mo19769b(Object obj);

    /* renamed from: c */
    Object mo19768c(Object obj, InterfaceC1886d<? super C13195u> interfaceC1886d);
}
