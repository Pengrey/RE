package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p337rd.C9876k;
import p337rd.InterfaceC9870e;
import p337rd._Sequences;
import td.AbstractC10492c2;

/* renamed from: kotlinx.coroutines.internal.w */
/* loaded from: classes2.dex */
public final class C6904w {

    /* renamed from: a */
    public static final C6904w f18369a;

    /* renamed from: b */
    private static final boolean f18370b;

    /* renamed from: c */
    public static final AbstractC10492c2 f18371c;

    static {
        C6904w c6904w = new C6904w();
        f18369a = c6904w;
        f18370b = C6869i0.m19961e("kotlinx.coroutines.fast.service.loader", true);
        f18371c = c6904w.m19845a();
    }

    private C6904w() {
    }

    /* renamed from: a */
    private final AbstractC10492c2 m19845a() {
        InterfaceC9870e m9761c;
        List m9751m;
        Object next;
        AbstractC10492c2 m19840e;
        try {
            if (f18370b) {
                m9751m = C6885m.f18338a.m19916c();
            } else {
                m9761c = C9876k.m9761c(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                m9751m = _Sequences.m9751m(m9761c);
            }
            Iterator it = m9751m.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int mo20015c = ((MainDispatcherFactory) next).mo20015c();
                    do {
                        Object next2 = it.next();
                        int mo20015c2 = ((MainDispatcherFactory) next2).mo20015c();
                        if (mo20015c < mo20015c2) {
                            next = next2;
                            mo20015c = mo20015c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (m19840e = C6905x.m19840e(mainDispatcherFactory, m9751m)) == null) ? C6905x.m19843b(null, null, 3, null) : m19840e;
        } catch (Throwable th2) {
            return C6905x.m19843b(th2, null, 2, null);
        }
    }
}
