package p104fc;

import com.google.zxing.C4411o;

/* renamed from: fc.d */
/* loaded from: classes2.dex */
public final class C5448d extends C4411o {

    /* renamed from: c */
    private final float f15349c;

    /* renamed from: d */
    private final int f15350d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5448d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m24326f(float f, float f2, float f3) {
        if (Math.abs(f2 - m27639d()) > f || Math.abs(f3 - m27640c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f15349c);
        return abs <= 1.0f || abs <= this.f15349c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C5448d m24325g(float f, float f2, float f3) {
        int i = this.f15350d;
        int i2 = i + 1;
        float m27640c = (i * m27640c()) + f2;
        float f4 = i2;
        return new C5448d(m27640c / f4, ((this.f15350d * m27639d()) + f) / f4, ((this.f15350d * this.f15349c) + f3) / f4, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m24324h() {
        return this.f15350d;
    }

    /* renamed from: i */
    public float m24323i() {
        return this.f15349c;
    }

    private C5448d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f15349c = f3;
        this.f15350d = i;
    }
}
