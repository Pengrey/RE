package p424wd;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlinx.coroutines.flow.InterfaceC6787d;
import kotlinx.coroutines.internal.C6881l0;
import p181jd.C6431d0;

/* renamed from: wd.e */
/* loaded from: classes2.dex */
public final class C11624e {
    /* renamed from: b */
    public static final <T, V> Object m4569b(CoroutineContext coroutineContext, V v, Object obj, InterfaceC6112p<? super V, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p, InterfaceC1886d<? super T> interfaceC1886d) {
        Object m34636d;
        Object m19922c = C6881l0.m19922c(coroutineContext, obj);
        try {
            Object mo39856d = ((InterfaceC6112p) C6431d0.m20951d(interfaceC6112p, 2)).mo39856d(v, new C11658w(interfaceC1886d, coroutineContext));
            C6881l0.m19924a(coroutineContext, m19922c);
            m34636d = C2116d.m34636d();
            if (mo39856d == m34636d) {
                DebugProbes.m20186c(interfaceC1886d);
            }
            return mo39856d;
        } catch (Throwable th2) {
            C6881l0.m19924a(coroutineContext, m19922c);
            throw th2;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m4568c(CoroutineContext coroutineContext, Object obj, Object obj2, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C6881l0.m19923b(coroutineContext);
        }
        return m4569b(coroutineContext, obj, obj2, interfaceC6112p, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <T> InterfaceC6787d<T> m4567d(InterfaceC6787d<? super T> interfaceC6787d, CoroutineContext coroutineContext) {
        return interfaceC6787d instanceof C11657v ? true : interfaceC6787d instanceof C11649q ? interfaceC6787d : new C11659x(interfaceC6787d, coroutineContext);
    }
}
