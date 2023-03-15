package p411w0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p297pd._Ranges;

/* renamed from: w0.h */
/* loaded from: classes.dex */
public final class Lab extends AbstractC11509c {

    /* compiled from: Lab.kt */
    /* renamed from: w0.h$a */
    /* loaded from: classes.dex */
    public static final class C11518a {
        private C11518a() {
        }

        public /* synthetic */ C11518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11518a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(String str, int i) {
        super(str, C11507b.f29451a.m4928a(), i, null);
        Intrinsics.isThisObjectNull(str, "name");
    }

    /* renamed from: a */
    public float[] m4865a(float[] fArr) {
        float m14997l;
        float m14997l2;
        float m14997l3;
        Intrinsics.isThisObjectNull(fArr, "v");
        float f = fArr[0];
        C11517g c11517g = C11517g.f29492a;
        float f2 = f / c11517g.m4868c()[0];
        float f3 = fArr[1] / c11517g.m4868c()[1];
        float f4 = fArr[2] / c11517g.m4868c()[2];
        float pow = f2 > 0.008856452f ? (float) Math.pow(f2, 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float pow2 = f3 > 0.008856452f ? (float) Math.pow(f3, 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float pow3 = f4 > 0.008856452f ? (float) Math.pow(f4, 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        m14997l = _Ranges.m14997l((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[0] = m14997l;
        m14997l2 = _Ranges.m14997l((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[1] = m14997l2;
        m14997l3 = _Ranges.m14997l((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        fArr[2] = m14997l3;
        return fArr;
    }

    /* renamed from: d */
    public float m4864d(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    /* renamed from: e */
    public float m4863e(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    /* renamed from: i */
    public float[] m4862i(float[] fArr) {
        float m14997l;
        float m14997l2;
        float m14997l3;
        Intrinsics.isThisObjectNull(fArr, "v");
        m14997l = _Ranges.m14997l(fArr[0], 0.0f, 100.0f);
        fArr[0] = m14997l;
        m14997l2 = _Ranges.m14997l(fArr[1], -128.0f, 128.0f);
        fArr[1] = m14997l2;
        m14997l3 = _Ranges.m14997l(fArr[2], -128.0f, 128.0f);
        fArr[2] = m14997l3;
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (fArr[2] * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        C11517g c11517g = C11517g.f29492a;
        fArr[0] = f4 * c11517g.m4868c()[0];
        fArr[1] = f5 * c11517g.m4868c()[1];
        fArr[2] = f6 * c11517g.m4868c()[2];
        return fArr;
    }
}
