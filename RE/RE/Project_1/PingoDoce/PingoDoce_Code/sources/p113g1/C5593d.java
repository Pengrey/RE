package p113g1;

import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VelocityTracker.kt */
/* renamed from: g1.d */
/* loaded from: classes.dex */
public final class C5593d {

    /* renamed from: a */
    private final int f15807a;

    /* renamed from: b */
    private final Float[] f15808b;

    public C5593d(int i) {
        this.f15807a = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.f15808b = fArr;
    }

    /* renamed from: a */
    public final float m23627a(int i) {
        return this.f15808b[i].floatValue();
    }

    /* renamed from: b */
    public final float m23626b() {
        return (float) Math.sqrt(m23624d(this));
    }

    /* renamed from: c */
    public final void m23625c(int i, float f) {
        this.f15808b[i] = Float.valueOf(f);
    }

    /* renamed from: d */
    public final float m23624d(C5593d c5593d) {
        Intrinsics.isThisObjectNull(c5593d, "a");
        int i = this.f15807a;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += m23627a(i2) * c5593d.m23627a(i2);
        }
        return f;
    }
}
