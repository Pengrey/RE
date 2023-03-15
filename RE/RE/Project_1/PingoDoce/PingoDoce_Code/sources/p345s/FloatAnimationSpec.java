package p345s;

import p181jd.Intrinsics;

/* renamed from: s.b0 */
/* loaded from: classes.dex */
public interface FloatAnimationSpec extends InterfaceC9950h {

    /* compiled from: FloatAnimationSpec.kt */
    /* renamed from: s.b0$a */
    /* loaded from: classes.dex */
    public static final class C9938a {
        /* renamed from: a */
        public static float m9626a(FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
            Intrinsics.isThisObjectNull(floatAnimationSpec, "this");
            return floatAnimationSpec.mo9602c(floatAnimationSpec.mo9601d(f, f2, f3), f, f2, f3);
        }

        /* renamed from: b */
        public static C10017y0 m9625b(FloatAnimationSpec floatAnimationSpec, InterfaceC9980q0 interfaceC9980q0) {
            Intrinsics.isThisObjectNull(floatAnimationSpec, "this");
            Intrinsics.isThisObjectNull(interfaceC9980q0, "converter");
            return new C10017y0(floatAnimationSpec);
        }
    }

    /* renamed from: b */
    float mo9603b(long j, float f, float f2, float f3);

    /* renamed from: c */
    float mo9602c(long j, float f, float f2, float f3);

    /* renamed from: d */
    long mo9601d(float f, float f2, float f3);

    /* renamed from: e */
    float mo9600e(float f, float f2, float f3);
}
