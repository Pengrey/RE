package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.ExceptionsH;
import td.AbstractC10492c2;

/* renamed from: kotlinx.coroutines.internal.x */
/* loaded from: classes2.dex */
public final class C6905x {

    /* renamed from: a */
    private static final boolean f18372a = true;

    /* renamed from: a */
    private static final C6906y m19844a(Throwable th2, String str) {
        if (f18372a) {
            return new C6906y(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        m19841d();
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ C6906y m19843b(Throwable th2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th2 = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m19844a(th2, str);
    }

    /* renamed from: c */
    public static final boolean m19842c(AbstractC10492c2 abstractC10492c2) {
        return abstractC10492c2.mo7830H0() instanceof C6906y;
    }

    /* renamed from: d */
    public static final Void m19841d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC10492c2 m19840e(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.mo20016b(list);
        } catch (Throwable th2) {
            return m19844a(th2, mainDispatcherFactory.mo20017a());
        }
    }
}
