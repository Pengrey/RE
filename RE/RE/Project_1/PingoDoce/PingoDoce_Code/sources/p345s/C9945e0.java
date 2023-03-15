package p345s;

import p181jd.Intrinsics;
import p297pd._Ranges;
import p345s.FloatAnimationSpec;

/* compiled from: FloatAnimationSpec.kt */
/* renamed from: s.e0 */
/* loaded from: classes.dex */
public final class C9945e0 implements FloatAnimationSpec {

    /* renamed from: a */
    private final int f26041a;

    /* renamed from: b */
    private final int f26042b;

    /* renamed from: c */
    private final InterfaceC10016y f26043c;

    public C9945e0(int i, int i2, InterfaceC10016y interfaceC10016y) {
        Intrinsics.isThisObjectNull(interfaceC10016y, "easing");
        this.f26041a = i;
        this.f26042b = i2;
        this.f26043c = interfaceC10016y;
    }

    /* renamed from: f */
    private final long m9590f(long j) {
        long m14995n;
        m14995n = _Ranges.m14995n(j - this.f26042b, 0L, this.f26041a);
        return m14995n;
    }

    /* renamed from: b */
    public float mo9603b(long j, float f, float f2, float f3) {
        float m14997l;
        long m9590f = m9590f(j / 1000000);
        int i = this.f26041a;
        float f4 = i == 0 ? 1.0f : ((float) m9590f) / i;
        InterfaceC10016y interfaceC10016y = this.f26043c;
        m14997l = _Ranges.m14997l(f4, 0.0f, 1.0f);
        return C9983s0.m9446k(f, f2, interfaceC10016y.mo9387a(m14997l));
    }

    /* renamed from: c */
    public float mo9602c(long j, float f, float f2, float f3) {
        long m9590f = m9590f(j / 1000000);
        int i = (m9590f > 0L ? 1 : (m9590f == 0L ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (mo9603b(m9590f * 1000000, f, f2, f3) - mo9603b((m9590f - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    /* renamed from: d */
    public long mo9601d(float f, float f2, float f3) {
        return (this.f26042b + this.f26041a) * 1000000;
    }

    /* renamed from: e */
    public float mo9600e(float f, float f2, float f3) {
        return FloatAnimationSpec.C9938a.m9626a(this, f, f2, f3);
    }

    /* renamed from: g */
    public C10017y0 mo9570a(InterfaceC9980q0 interfaceC9980q0) {
        return FloatAnimationSpec.C9938a.m9625b(this, interfaceC9980q0);
    }
}
