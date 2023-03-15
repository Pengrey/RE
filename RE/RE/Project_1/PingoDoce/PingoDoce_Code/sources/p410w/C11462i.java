package p410w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p479z1.C13599b;
import p479z1.Density;

/* renamed from: w.i */
/* loaded from: classes.dex */
final class C11462i implements InterfaceC11459h {

    /* renamed from: a */
    private final Density f29378a;

    /* renamed from: b */
    private final long f29379b;

    private C11462i(Density density, long j) {
        this.f29378a = density;
        this.f29379b = j;
        C11440f c11440f = C11440f.f29335a;
    }

    public /* synthetic */ C11462i(Density density, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j);
    }

    /* renamed from: a */
    public long mo5073a() {
        return this.f29379b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11462i) {
            C11462i c11462i = (C11462i) obj;
            return Intrinsics.equals(this.f29378a, c11462i.f29378a) && C13599b.m923g(mo5073a(), c11462i.mo5073a());
        }
        return false;
    }

    public int hashCode() {
        return (this.f29378a.hashCode() * 31) + C13599b.m913q(mo5073a());
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f29378a + ", constraints=" + ((Object) C13599b.m912r(mo5073a())) + ')';
    }
}
