package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.g4 */
/* loaded from: classes.dex */
public final class C3198g4 extends FutureTask implements Comparable {

    /* renamed from: w */
    private final long f8459w;

    /* renamed from: x */
    final boolean f8460x;

    /* renamed from: y */
    private final String f8461y;

    /* renamed from: z */
    final /* synthetic */ C3220i4 f8462z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3198g4(C3220i4 c3220i4, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f8462z = c3220i4;
        C2597i.m33076j(str);
        atomicLong = C3220i4.f8515l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f8459w = andIncrement;
        this.f8461y = str;
        this.f8460x = z;
        if (andIncrement == Long.MAX_VALUE) {
            c3220i4.f8410a.mo31116d().m31332r().m31398a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C3198g4 c3198g4 = (C3198g4) obj;
        boolean z = this.f8460x;
        if (z != c3198g4.f8460x) {
            return !z ? 1 : -1;
        }
        int i = (this.f8459w > c3198g4.f8459w ? 1 : (this.f8459w == c3198g4.f8459w ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.f8462z.f8410a.mo31116d().m31330t().m31397b("Two tasks share the same index. index", Long.valueOf(this.f8459w));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        this.f8462z.f8410a.mo31116d().m31332r().m31397b(this.f8461y, th2);
        super.setException(th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3198g4(C3220i4 c3220i4, Callable callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f8462z = c3220i4;
        C2597i.m33076j("Task exception on worker thread");
        atomicLong = C3220i4.f8515l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f8459w = andIncrement;
        this.f8461y = "Task exception on worker thread";
        this.f8460x = z;
        if (andIncrement == Long.MAX_VALUE) {
            c3220i4.f8410a.mo31116d().m31332r().m31398a("Tasks index overflow");
        }
    }
}
