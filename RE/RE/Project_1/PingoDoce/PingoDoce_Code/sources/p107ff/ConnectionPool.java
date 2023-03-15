package p107ff;

import java.util.concurrent.TimeUnit;
import p181jd.Intrinsics;
import p182jf.TaskRunner;
import p204kf.RealConnectionPool;

/* renamed from: ff.k */
/* loaded from: classes2.dex */
public final class ConnectionPool {

    /* renamed from: a */
    private final RealConnectionPool f15488a;

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        Intrinsics.isThisObjectNull(realConnectionPool, "delegate");
        this.f15488a = realConnectionPool;
    }

    /* renamed from: a */
    public final RealConnectionPool m24118a() {
        return this.f15488a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.f17553i, i, j, timeUnit));
        Intrinsics.isThisObjectNull(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
