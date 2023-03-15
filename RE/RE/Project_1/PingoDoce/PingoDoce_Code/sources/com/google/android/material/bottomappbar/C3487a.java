package com.google.android.material.bottomappbar;

import p401v8.C11140f;
import p401v8.C11156m;

/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes.dex */
public class C3487a extends C11140f implements Cloneable {

    /* renamed from: A */
    private float f9505A;

    /* renamed from: B */
    private float f9506B;

    /* renamed from: w */
    private float f9507w;

    /* renamed from: x */
    private float f9508x;

    /* renamed from: y */
    private float f9509y;

    /* renamed from: z */
    private float f9510z;

    @Override // p401v8.C11140f
    /* renamed from: b */
    public void mo6030b(float f, float f2, float f3, C11156m c11156m) {
        float f4;
        float f5;
        float f6 = this.f9509y;
        if (f6 == 0.0f) {
            c11156m.m5871m(f, 0.0f);
            return;
        }
        float f7 = ((this.f9508x * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f9507w;
        float f9 = f2 + this.f9505A;
        float f10 = (this.f9510z * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            c11156m.m5871m(f, 0.0f);
            return;
        }
        float f11 = this.f9506B;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        c11156m.m5871m(f15, 0.0f);
        float f18 = f8 * 2.0f;
        c11156m.m5883a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            c11156m.m5883a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f9508x;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            c11156m.m5883a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f9508x;
            c11156m.m5871m(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f9508x;
            c11156m.m5883a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        c11156m.m5883a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        c11156m.m5871m(f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m30433c() {
        return this.f9510z;
    }

    /* renamed from: d */
    public float m30432d() {
        return this.f9506B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m30431e() {
        return this.f9508x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m30430f() {
        return this.f9507w;
    }

    /* renamed from: g */
    public float m30429g() {
        return this.f9509y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m30428i(float f) {
        if (f >= 0.0f) {
            this.f9510z = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: j */
    public void m30427j(float f) {
        this.f9506B = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m30426k(float f) {
        this.f9508x = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m30425l(float f) {
        this.f9507w = f;
    }

    /* renamed from: m */
    public void m30424m(float f) {
        this.f9509y = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m30423n(float f) {
        this.f9505A = f;
    }
}
