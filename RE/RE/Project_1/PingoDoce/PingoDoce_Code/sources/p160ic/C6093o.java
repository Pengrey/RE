package p160ic;

import android.graphics.Rect;
import p138hc.C5905q;

/* renamed from: ic.o */
/* loaded from: classes2.dex */
public class C6093o extends AbstractC6095q {
    /* renamed from: e */
    private static float m22165e(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    @Override // p160ic.AbstractC6095q
    /* renamed from: c */
    protected float mo22160c(C5905q c5905q, C5905q c5905q2) {
        int i = c5905q.f16352w;
        if (i <= 0 || c5905q.f16353x <= 0) {
            return 0.0f;
        }
        float m22165e = (1.0f / m22165e((i * 1.0f) / c5905q2.f16352w)) / m22165e((c5905q.f16353x * 1.0f) / c5905q2.f16353x);
        float m22165e2 = m22165e(((c5905q.f16352w * 1.0f) / c5905q.f16353x) / ((c5905q2.f16352w * 1.0f) / c5905q2.f16353x));
        return m22165e * (((1.0f / m22165e2) / m22165e2) / m22165e2);
    }

    @Override // p160ic.AbstractC6095q
    /* renamed from: d */
    public Rect mo22159d(C5905q c5905q, C5905q c5905q2) {
        return new Rect(0, 0, c5905q2.f16352w, c5905q2.f16353x);
    }
}
