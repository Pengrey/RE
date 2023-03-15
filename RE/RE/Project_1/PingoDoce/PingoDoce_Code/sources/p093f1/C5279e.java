package p093f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p373u0.C10774f;

/* renamed from: f1.e */
/* loaded from: classes.dex */
public final class C5279e {

    /* renamed from: a */
    private final long f14550a;

    /* renamed from: b */
    private final long f14551b;

    private C5279e(long j, long j2) {
        this.f14550a = j;
        this.f14551b = j2;
    }

    public /* synthetic */ C5279e(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long m24814a() {
        return this.f14551b;
    }

    /* renamed from: b */
    public final long m24813b() {
        return this.f14550a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f14550a + ", position=" + ((Object) C10774f.m7138r(m24814a())) + ')';
    }
}
