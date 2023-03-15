package p160ic;

import android.graphics.Rect;
import android.util.Log;
import p138hc.C5905q;

/* renamed from: ic.l */
/* loaded from: classes2.dex */
public class C6090l extends AbstractC6095q {

    /* renamed from: b */
    private static final String f16792b = "l";

    @Override // p160ic.AbstractC6095q
    /* renamed from: c */
    protected float mo22160c(C5905q c5905q, C5905q c5905q2) {
        if (c5905q.f16352w <= 0 || c5905q.f16353x <= 0) {
            return 0.0f;
        }
        C5905q m22776d = c5905q.m22776d(c5905q2);
        float f = (m22776d.f16352w * 1.0f) / c5905q.f16352w;
        if (f > 1.0f) {
            f = (float) Math.pow(1.0f / f, 1.1d);
        }
        float f2 = ((m22776d.f16352w * 1.0f) / c5905q2.f16352w) + ((m22776d.f16353x * 1.0f) / c5905q2.f16353x);
        return f * ((1.0f / f2) / f2);
    }

    @Override // p160ic.AbstractC6095q
    /* renamed from: d */
    public Rect mo22159d(C5905q c5905q, C5905q c5905q2) {
        C5905q m22776d = c5905q.m22776d(c5905q2);
        String str = f16792b;
        Log.i(str, "Preview: " + c5905q + "; Scaled: " + m22776d + "; Want: " + c5905q2);
        int i = (m22776d.f16352w - c5905q2.f16352w) / 2;
        int i2 = (m22776d.f16353x - c5905q2.f16353x) / 2;
        return new Rect(-i, -i2, m22776d.f16352w - i, m22776d.f16353x - i2);
    }
}
