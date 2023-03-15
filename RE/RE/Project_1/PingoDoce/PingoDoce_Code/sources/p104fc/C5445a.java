package p104fc;

import com.google.zxing.C4411o;

/* renamed from: fc.a */
/* loaded from: classes2.dex */
public final class C5445a extends C4411o {

    /* renamed from: c */
    private final float f15337c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5445a(float f, float f2, float f3) {
        super(f, f2);
        this.f15337c = f3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m24343f(float f, float f2, float f3) {
        if (Math.abs(f2 - m27639d()) > f || Math.abs(f3 - m27640c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f15337c);
        return abs <= 1.0f || abs <= this.f15337c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C5445a m24342g(float f, float f2, float f3) {
        return new C5445a((m27640c() + f2) / 2.0f, (m27639d() + f) / 2.0f, (this.f15337c + f3) / 2.0f);
    }
}
