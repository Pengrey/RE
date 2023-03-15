package p113g1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p373u0.C10774f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g1.b */
/* loaded from: classes.dex */
public final class C5592b {

    /* renamed from: a */
    private final long f15803a;

    /* renamed from: b */
    private final long f15804b;

    private C5592b(long j, long j2) {
        this.f15803a = j;
        this.f15804b = j2;
    }

    public /* synthetic */ C5592b(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long m23631a() {
        return this.f15803a;
    }

    /* renamed from: b */
    public final long m23630b() {
        return this.f15804b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5592b) {
            C5592b c5592b = (C5592b) obj;
            return C10774f.m7147i(this.f15803a, c5592b.f15803a) && this.f15804b == c5592b.f15804b;
        }
        return false;
    }

    public int hashCode() {
        return (C10774f.m7143m(this.f15803a) * 31) + Long.hashCode(this.f15804b);
    }

    public String toString() {
        return "PointAtTime(point=" + ((Object) C10774f.m7138r(this.f15803a)) + ", time=" + this.f15804b + ')';
    }
}
