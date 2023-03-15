package p127h1;

import p181jd.Intrinsics;

/* renamed from: h1.f */
/* loaded from: classes.dex */
public final class C5765f implements InterfaceC5753d {

    /* renamed from: b */
    private final float f16076b;

    public C5765f(float f) {
        this.f16076b = f;
    }

    /* renamed from: a */
    public long mo23142a(long j, long j2) {
        float f = this.f16076b;
        return C5775i0.m23111a(f, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5765f) && Intrinsics.equals(Float.valueOf(this.f16076b), Float.valueOf(((C5765f) obj).f16076b));
    }

    public int hashCode() {
        return Float.hashCode(this.f16076b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f16076b + ')';
    }
}
