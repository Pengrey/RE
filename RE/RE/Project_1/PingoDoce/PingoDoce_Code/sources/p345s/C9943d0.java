package p345s;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p345s.FloatAnimationSpec;

/* renamed from: s.d0 */
/* loaded from: classes.dex */
public final class C9943d0 implements FloatAnimationSpec {

    /* renamed from: a */
    private final float f26037a;

    /* renamed from: b */
    private final float f26038b;

    /* renamed from: c */
    private final float f26039c;

    /* renamed from: d */
    private final C9961k0 f26040d;

    public C9943d0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public C9943d0(float f, float f2, float f3) {
        this.f26037a = f;
        this.f26038b = f2;
        this.f26039c = f3;
        C9961k0 c9961k0 = new C9961k0(1.0f);
        c9961k0.m9523d(m9599f());
        c9961k0.m9521f(m9598g());
        this.f26040d = c9961k0;
    }

    @Override // p345s.FloatAnimationSpec
    /* renamed from: b */
    public float mo9603b(long j, float f, float f2, float f3) {
        this.f26040d.m9522e(f2);
        return C9949g0.m9572b(this.f26040d.m9520g(f, f3, j / 1000000));
    }

    @Override // p345s.FloatAnimationSpec
    /* renamed from: c */
    public float mo9602c(long j, float f, float f2, float f3) {
        this.f26040d.m9522e(f2);
        return C9949g0.m9571c(this.f26040d.m9520g(f, f3, j / 1000000));
    }

    @Override // p345s.FloatAnimationSpec
    /* renamed from: d */
    public long mo9601d(float f, float f2, float f3) {
        float m9525b = this.f26040d.m9525b();
        float m9526a = this.f26040d.m9526a();
        float f4 = f - f2;
        float f5 = this.f26039c;
        return C9955j0.m9543b(m9525b, m9526a, f3 / f5, f4 / f5, 1.0f) * 1000000;
    }

    @Override // p345s.FloatAnimationSpec
    /* renamed from: e */
    public float mo9600e(float f, float f2, float f3) {
        return 0.0f;
    }

    /* renamed from: f */
    public final float m9599f() {
        return this.f26037a;
    }

    /* renamed from: g */
    public final float m9598g() {
        return this.f26038b;
    }

    @Override // p345s.InterfaceC9950h
    /* renamed from: h */
    public <V extends AbstractC9976o> C10017y0<V> mo9570a(InterfaceC9980q0<Float, V> interfaceC9980q0) {
        return FloatAnimationSpec.C9938a.m9625b(this, interfaceC9980q0);
    }

    public /* synthetic */ C9943d0(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
