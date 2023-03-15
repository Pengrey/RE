package p455y;

import androidx.compose.foundation.lazy.InterfaceC0632c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p479z1.C13599b;
import p479z1.Density;

/* renamed from: y.f */
/* loaded from: classes.dex */
public final class C13019f implements InterfaceC0632c {

    /* renamed from: a */
    private final Density f33783a;

    /* renamed from: b */
    private final long f33784b;

    private C13019f(Density density, long j) {
        this.f33783a = density;
        this.f33784b = j;
        density.m895i0(C13599b.m916n(m1902a()));
        density.m895i0(C13599b.m917m(m1902a()));
    }

    public /* synthetic */ C13019f(Density density, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j);
    }

    /* renamed from: a */
    public final long m1902a() {
        return this.f33784b;
    }

    /* renamed from: b */
    public final Density m1901b() {
        return this.f33783a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13019f) {
            C13019f c13019f = (C13019f) obj;
            return Intrinsics.equals(this.f33783a, c13019f.f33783a) && C13599b.m923g(this.f33784b, c13019f.f33784b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f33783a.hashCode() * 31) + C13599b.m913q(this.f33784b);
    }

    public String toString() {
        return "LazyItemScopeImpl(density=" + this.f33783a + ", constraints=" + ((Object) C13599b.m912r(this.f33784b)) + ')';
    }
}
