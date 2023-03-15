package p092f0;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlinx.coroutines.flow.InterfaceC6785c;
import p260o0.C7982r;
import p260o0.C7987t;
import p468yc.C13195u;

/* renamed from: f0.j1 */
/* loaded from: classes.dex */
public final class C5209j1 {
    /* renamed from: a */
    public static final <T extends R, R> InterfaceC5242r1<R> m25077a(InterfaceC6785c<? extends T> interfaceC6785c, R r, CoroutineContext coroutineContext, InterfaceC5179i interfaceC5179i, int i, int i2) {
        return SnapshotFlow.m24999b(interfaceC6785c, r, coroutineContext, interfaceC5179i, i, i2);
    }

    /* renamed from: b */
    public static final <T> InterfaceC5242r1<T> m25076b(InterfaceC6097a<? extends T> interfaceC6097a) {
        return DerivedState.m25011c(interfaceC6097a);
    }

    /* renamed from: c */
    public static final <T> C7982r<T> m25075c() {
        return C5232o1.m24965a();
    }

    /* renamed from: d */
    public static final <K, V> C7987t<K, V> m25074d() {
        return C5232o1.m24964b();
    }

    /* renamed from: e */
    public static final <T> InterfaceC5220m0<T> m25073e(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return C5232o1.m24963c(t, snapshotMutationPolicy);
    }

    /* renamed from: g */
    public static final <T> SnapshotMutationPolicy<T> m25071g() {
        return C5230n1.m24972a();
    }

    /* renamed from: h */
    public static final <R> void m25070h(InterfaceC6108l<? super InterfaceC5242r1<?>, C13195u> interfaceC6108l, InterfaceC6108l<? super InterfaceC5242r1<?>, C13195u> interfaceC6108l2, InterfaceC6097a<? extends R> interfaceC6097a) {
        DerivedState.m25010d(interfaceC6108l, interfaceC6108l2, interfaceC6097a);
    }

    /* renamed from: i */
    public static final <T> InterfaceC5242r1<T> m25069i(T t, Object obj, Object obj2, InterfaceC6112p<? super InterfaceC5241r0<T>, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        return ProduceState.m25003a(t, obj, obj2, interfaceC6112p, interfaceC5179i, i);
    }

    /* renamed from: j */
    public static final <T> SnapshotMutationPolicy<T> m25068j() {
        return C5230n1.m24971b();
    }

    /* renamed from: k */
    public static final <T> InterfaceC5242r1<T> m25067k(T t, InterfaceC5179i interfaceC5179i, int i) {
        return C5232o1.m24961e(t, interfaceC5179i, i);
    }

    /* renamed from: l */
    public static final <T> InterfaceC6785c<T> m25066l(InterfaceC6097a<? extends T> interfaceC6097a) {
        return SnapshotFlow.m24997d(interfaceC6097a);
    }

    /* renamed from: m */
    public static final <T> SnapshotMutationPolicy<T> m25065m() {
        return C5230n1.m24970c();
    }
}
