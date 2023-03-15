package td;

/* compiled from: EventLoop.common.kt */
/* renamed from: td.p2 */
/* loaded from: classes2.dex */
public final class C10558p2 {

    /* renamed from: a */
    public static final C10558p2 f27272a = new C10558p2();

    /* renamed from: b */
    private static final ThreadLocal<AbstractC10491c1> f27273b = new ThreadLocal<>();

    private C10558p2() {
    }

    /* renamed from: a */
    public final AbstractC10491c1 m7685a() {
        return f27273b.get();
    }

    /* renamed from: b */
    public final AbstractC10491c1 m7684b() {
        ThreadLocal<AbstractC10491c1> threadLocal = f27273b;
        AbstractC10491c1 abstractC10491c1 = threadLocal.get();
        if (abstractC10491c1 == null) {
            AbstractC10491c1 m7791a = C10512f1.m7791a();
            threadLocal.set(m7791a);
            return m7791a;
        }
        return abstractC10491c1;
    }

    /* renamed from: c */
    public final void m7683c() {
        f27273b.set(null);
    }

    /* renamed from: d */
    public final void m7682d(AbstractC10491c1 abstractC10491c1) {
        f27273b.set(abstractC10491c1);
    }
}
