package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import id.InterfaceC6112p;
import java.util.Objects;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import td.InterfaceC10553o2;

/* renamed from: kotlinx.coroutines.internal.l0 */
/* loaded from: classes2.dex */
public final class C6881l0 {

    /* renamed from: a */
    public static final C6867h0 f18331a = new C6867h0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final InterfaceC6112p f18332b = C6882a.f18335w;

    /* renamed from: c */
    private static final InterfaceC6112p f18333c = C6883b.f18336w;

    /* renamed from: d */
    private static final InterfaceC6112p f18334d = C6884c.f18337w;

    /* compiled from: ThreadContext.kt */
    /* renamed from: kotlinx.coroutines.internal.l0$a */
    /* loaded from: classes2.dex */
    static final class C6882a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6882a f18335w = new C6882a();

        C6882a() {
            super(2);
        }

        /* renamed from: a */
        public final Object mo39856d(Object obj, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            if (interfaceC1891b instanceof InterfaceC10553o2) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC1891b : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* renamed from: kotlinx.coroutines.internal.l0$b */
    /* loaded from: classes2.dex */
    static final class C6883b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6883b f18336w = new C6883b();

        C6883b() {
            super(2);
        }

        /* renamed from: a */
        public final InterfaceC10553o2 mo39856d(InterfaceC10553o2 interfaceC10553o2, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            if (interfaceC10553o2 != null) {
                return interfaceC10553o2;
            }
            if (interfaceC1891b instanceof InterfaceC10553o2) {
                return (InterfaceC10553o2) interfaceC1891b;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* renamed from: kotlinx.coroutines.internal.l0$c */
    /* loaded from: classes2.dex */
    static final class C6884c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6884c f18337w = new C6884c();

        C6884c() {
            super(2);
        }

        /* renamed from: a */
        public final C6890o0 mo39856d(C6890o0 c6890o0, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            if (interfaceC1891b instanceof InterfaceC10553o2) {
                InterfaceC10553o2 interfaceC10553o2 = (InterfaceC10553o2) interfaceC1891b;
                c6890o0.m19893a(interfaceC10553o2, interfaceC10553o2.mo7692a0(c6890o0.f18341a));
            }
            return c6890o0;
        }
    }

    /* renamed from: a */
    public static final void m19924a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f18331a) {
            return;
        }
        if (obj instanceof C6890o0) {
            ((C6890o0) obj).m19892b(coroutineContext);
            return;
        }
        Object mo4547M = coroutineContext.mo4547M(null, f18333c);
        Objects.requireNonNull(mo4547M, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC10553o2) mo4547M).mo7691v0(coroutineContext, obj);
    }

    /* renamed from: b */
    public static final Object m19923b(CoroutineContext coroutineContext) {
        Object mo4547M = coroutineContext.mo4547M(0, f18332b);
        Intrinsics.ifNullDoSomething(mo4547M);
        return mo4547M;
    }

    /* renamed from: c */
    public static final Object m19922c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m19923b(coroutineContext);
        }
        if (obj == 0) {
            return f18331a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.mo4547M(new C6890o0(coroutineContext, ((Number) obj).intValue()), f18334d);
        }
        return ((InterfaceC10553o2) obj).mo7692a0(coroutineContext);
    }
}
