package p411w0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p297pd._Ranges;

/* renamed from: w0.i */
/* loaded from: classes.dex */
public final class Oklab extends AbstractC11509c {

    /* renamed from: d */
    private static final float[] f29498d;

    /* renamed from: e */
    private static final float[] f29499e;

    /* renamed from: f */
    private static final float[] f29500f;

    /* renamed from: g */
    private static final float[] f29501g;

    /* compiled from: Oklab.kt */
    /* renamed from: w0.i$a */
    /* loaded from: classes.dex */
    public static final class C11519a {
        private C11519a() {
        }

        public /* synthetic */ C11519a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11519a(null);
        float[] m4939c = AbstractC11502a.f29447b.m4937b().m4939c();
        C11517g c11517g = C11517g.f29492a;
        float[] m4906k = ColorSpace.m4906k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpace.m4912e(m4939c, c11517g.m4869b().m4805c(), c11517g.m4866e().m4805c()));
        f29498d = m4906k;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f29499e = fArr;
        f29500f = ColorSpace.m4907j(m4906k);
        f29501g = ColorSpace.m4907j(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oklab(String str, int i) {
        super(str, C11507b.f29451a.m4928a(), i, null);
        Intrinsics.isThisObjectNull(str, "name");
    }

    /* renamed from: a */
    public float[] m4861a(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "v");
        ColorSpace.m4904m(f29498d, fArr);
        double d = 0.33333334f;
        fArr[0] = (float) Math.pow(fArr[0], d);
        fArr[1] = (float) Math.pow(fArr[1], d);
        fArr[2] = (float) Math.pow(fArr[2], d);
        ColorSpace.m4904m(f29499e, fArr);
        return fArr;
    }

    /* renamed from: d */
    public float m4860d(int i) {
        return i == 0 ? 1.0f : 2.0f;
    }

    /* renamed from: e */
    public float m4859e(int i) {
        return i == 0 ? 0.0f : -2.0f;
    }

    /* renamed from: i */
    public float[] m4858i(float[] fArr) {
        float m14997l;
        float m14997l2;
        float m14997l3;
        Intrinsics.isThisObjectNull(fArr, "v");
        m14997l = _Ranges.m14997l(fArr[0], 0.0f, 1.0f);
        fArr[0] = m14997l;
        m14997l2 = _Ranges.m14997l(fArr[1], -2.0f, 2.0f);
        fArr[1] = m14997l2;
        m14997l3 = _Ranges.m14997l(fArr[2], -2.0f, 2.0f);
        fArr[2] = m14997l3;
        ColorSpace.m4904m(f29501g, fArr);
        double d = 3.0f;
        fArr[0] = (float) Math.pow(fArr[0], d);
        fArr[1] = (float) Math.pow(fArr[1], d);
        fArr[2] = (float) Math.pow(fArr[2], d);
        ColorSpace.m4904m(f29500f, fArr);
        return fArr;
    }
}
