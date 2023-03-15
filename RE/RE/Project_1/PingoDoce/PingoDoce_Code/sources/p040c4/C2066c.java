package p040c4;

import p130h4.C5846b;
import p130h4.C5851g;

/* renamed from: c4.c */
/* loaded from: classes.dex */
public class C2066c {

    /* renamed from: a */
    private final float[] f5984a;

    /* renamed from: b */
    private final int[] f5985b;

    public C2066c(float[] fArr, int[] iArr) {
        this.f5984a = fArr;
        this.f5985b = iArr;
    }

    /* renamed from: a */
    public int[] m34788a() {
        return this.f5985b;
    }

    /* renamed from: b */
    public float[] m34787b() {
        return this.f5984a;
    }

    /* renamed from: c */
    public int m34786c() {
        return this.f5985b.length;
    }

    /* renamed from: d */
    public void m34785d(C2066c c2066c, C2066c c2066c2, float f) {
        if (c2066c.f5985b.length == c2066c2.f5985b.length) {
            for (int i = 0; i < c2066c.f5985b.length; i++) {
                this.f5984a[i] = C5851g.m22893k(c2066c.f5984a[i], c2066c2.f5984a[i], f);
                this.f5985b[i] = C5846b.m22937c(f, c2066c.f5985b[i], c2066c2.f5985b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c2066c.f5985b.length + " vs " + c2066c2.f5985b.length + ")");
    }
}
