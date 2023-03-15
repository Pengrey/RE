package p182jf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: jf.a */
/* loaded from: classes2.dex */
public abstract class Task {

    /* renamed from: a */
    private final String f17541a;

    /* renamed from: b */
    private final boolean f17542b;

    /* renamed from: c */
    private TaskQueue f17543c;

    /* renamed from: d */
    private long f17544d;

    public Task(String str, boolean z) {
        Intrinsics.isThisObjectNull(str, "name");
        this.f17541a = str;
        this.f17542b = z;
        this.f17544d = -1L;
    }

    /* renamed from: a */
    public final boolean m20890a() {
        return this.f17542b;
    }

    /* renamed from: b */
    public final String m20889b() {
        return this.f17541a;
    }

    /* renamed from: c */
    public final long m20888c() {
        return this.f17544d;
    }

    /* renamed from: d */
    public final TaskQueue m20887d() {
        return this.f17543c;
    }

    /* renamed from: e */
    public final void m20886e(TaskQueue taskQueue) {
        Intrinsics.isThisObjectNull(taskQueue, "queue");
        TaskQueue taskQueue2 = this.f17543c;
        if (taskQueue2 == taskQueue) {
            return;
        }
        if (taskQueue2 == null) {
            this.f17543c = taskQueue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    /* renamed from: f */
    public abstract long mo20881f();

    /* renamed from: g */
    public final void m20885g(long j) {
        this.f17544d = j;
    }

    public String toString() {
        return this.f17541a;
    }

    public /* synthetic */ Task(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
