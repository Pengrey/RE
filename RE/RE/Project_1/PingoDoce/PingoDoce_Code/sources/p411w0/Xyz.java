package p411w0;

import p181jd.Intrinsics;
import p297pd._Ranges;

/* renamed from: w0.n */
/* loaded from: classes.dex */
public final class Xyz extends AbstractC11509c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xyz(String str, int i) {
        super(str, C11507b.f29451a.m4926c(), i, null);
        Intrinsics.isThisObjectNull(str, "name");
    }

    /* renamed from: j */
    private final float m4800j(float f) {
        float m14997l;
        m14997l = _Ranges.m14997l(f, -2.0f, 2.0f);
        return m14997l;
    }

    /* renamed from: a */
    public float[] m4804a(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "v");
        fArr[0] = m4800j(fArr[0]);
        fArr[1] = m4800j(fArr[1]);
        fArr[2] = m4800j(fArr[2]);
        return fArr;
    }

    /* renamed from: d */
    public float m4803d(int i) {
        return 2.0f;
    }

    /* renamed from: e */
    public float m4802e(int i) {
        return -2.0f;
    }

    /* renamed from: i */
    public float[] m4801i(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "v");
        fArr[0] = m4800j(fArr[0]);
        fArr[1] = m4800j(fArr[1]);
        fArr[2] = m4800j(fArr[2]);
        return fArr;
    }
}
