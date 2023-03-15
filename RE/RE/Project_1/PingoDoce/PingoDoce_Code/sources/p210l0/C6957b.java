package p210l0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: l0.b */
/* loaded from: classes.dex */
public final class C6957b {

    /* renamed from: a */
    private int f18491a;

    public C6957b() {
        this(0, 1, null);
    }

    public C6957b(int i) {
        this.f18491a = i;
    }

    /* renamed from: a */
    public final int m19706a() {
        return this.f18491a;
    }

    /* renamed from: b */
    public final void m19705b(int i) {
        this.f18491a += i;
    }

    /* renamed from: c */
    public final void m19704c(int i) {
        this.f18491a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6957b) && this.f18491a == ((C6957b) obj).f18491a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f18491a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f18491a + ')';
    }

    public /* synthetic */ C6957b(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
