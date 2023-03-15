package p323r;

import p181jd.Intrinsics;
import p345s.InterfaceC9941c0;
import p479z1.Density;

/* renamed from: r.e */
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements InterfaceC9941c0 {

    /* renamed from: a */
    private final FlingCalculator f25716a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        Intrinsics.isThisObjectNull(density, "density");
        this.f25716a = new FlingCalculator(C9780f.m9975a(), density);
    }

    /* renamed from: f */
    private final float m9976f(float f) {
        return this.f25716a.m9987b(f) * Math.signum(f);
    }

    /* renamed from: a */
    public float mo9609a() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo9608b(long j, float f, float f2) {
        return this.f25716a.m9985d(f2).m9982b(j / 1000000);
    }

    /* renamed from: c */
    public long mo9607c(float f, float f2) {
        return this.f25716a.m9986c(f2) * 1000000;
    }

    /* renamed from: d */
    public float mo9606d(float f, float f2) {
        return f + m9976f(f2);
    }

    /* renamed from: e */
    public float mo9605e(long j, float f, float f2) {
        return f + this.f25716a.m9985d(f2).m9983a(j / 1000000);
    }
}
