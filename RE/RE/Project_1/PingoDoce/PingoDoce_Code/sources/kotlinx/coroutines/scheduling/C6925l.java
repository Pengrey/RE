package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C6869i0;
import p297pd._Ranges;

/* renamed from: kotlinx.coroutines.scheduling.l */
/* loaded from: classes2.dex */
public final class C6925l {

    /* renamed from: a */
    public static final long f18411a = C6869i0.m19959g("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: b */
    public static final int f18412b;

    /* renamed from: c */
    public static final int f18413c;

    /* renamed from: d */
    public static final long f18414d;

    /* renamed from: e */
    public static AbstractC6920g f18415e;

    /* renamed from: f */
    public static final InterfaceC6922i f18416f;

    /* renamed from: g */
    public static final InterfaceC6922i f18417g;

    static {
        int m15005d;
        m15005d = _Ranges.m15005d(C6869i0.m19965a(), 2);
        f18412b = C6869i0.m19960f("kotlinx.coroutines.scheduler.core.pool.size", m15005d, 1, 0, 8, null);
        f18413c = C6869i0.m19960f("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f18414d = TimeUnit.SECONDS.toNanos(C6869i0.m19959g("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f18415e = C6918e.f18401a;
        f18416f = new C6923j(0);
        f18417g = new C6923j(1);
    }
}
