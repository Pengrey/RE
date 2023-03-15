package p345s;

import p181jd.Intrinsics;
import p345s.AbstractC9976o;
import p345s.Animation;

/* compiled from: Animation.kt */
/* renamed from: s.o0 */
/* loaded from: classes.dex */
public final class C9977o0<T, V extends AbstractC9976o> implements Animation {

    /* renamed from: a */
    private final InterfaceC10003t0 f26133a;

    /* renamed from: b */
    private final InterfaceC9980q0 f26134b;

    /* renamed from: c */
    private final Object f26135c;

    /* renamed from: d */
    private final Object f26136d;

    /* renamed from: e */
    private final AbstractC9976o f26137e;

    /* renamed from: f */
    private final AbstractC9976o f26138f;

    /* renamed from: g */
    private final AbstractC9976o f26139g;

    /* renamed from: h */
    private final long f26140h;

    /* renamed from: i */
    private final AbstractC9976o f26141i;

    public C9977o0(InterfaceC10003t0 interfaceC10003t0, InterfaceC9980q0 interfaceC9980q0, Object obj, Object obj2, AbstractC9976o abstractC9976o) {
        Intrinsics.isThisObjectNull(interfaceC10003t0, "animationSpec");
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
        this.f26133a = interfaceC10003t0;
        this.f26134b = interfaceC9980q0;
        this.f26135c = obj;
        this.f26136d = obj2;
        V mo9587d = m9478d().mo9468a().mo9587d(obj);
        this.f26137e = mo9587d;
        V mo9587d2 = m9478d().mo9468a().mo9587d((T) m9477e());
        this.f26138f = mo9587d2;
        AbstractC9976o m9473b = abstractC9976o == null ? null : AnimationVectors.m9473b(abstractC9976o);
        m9473b = m9473b == null ? AnimationVectors.m9471d(m9478d().mo9468a().mo9587d(obj)) : m9473b;
        this.f26139g = m9473b;
        this.f26140h = interfaceC10003t0.m9425b(mo9587d, mo9587d2, m9473b);
        this.f26141i = interfaceC10003t0.m9422g(mo9587d, mo9587d2, m9473b);
    }

    /* renamed from: a */
    public boolean m9481a() {
        return this.f26133a.m9426a();
    }

    /* renamed from: b */
    public Object m9480b(long j) {
        if (!m9475g(j)) {
            return m9478d().mo9467b().mo9587d((V) this.f26133a.m9424c(j, this.f26137e, this.f26138f, this.f26139g));
        }
        return m9477e();
    }

    /* renamed from: c */
    public long m9479c() {
        return this.f26140h;
    }

    /* renamed from: d */
    public InterfaceC9980q0 m9478d() {
        return this.f26134b;
    }

    /* renamed from: e */
    public Object m9477e() {
        return this.f26136d;
    }

    /* renamed from: f */
    public AbstractC9976o m9476f(long j) {
        if (!m9475g(j)) {
            return this.f26133a.m9423f(j, this.f26137e, this.f26138f, this.f26139g);
        }
        return this.f26141i;
    }

    /* renamed from: g */
    public boolean m9475g(long j) {
        return Animation.C9940a.m9610a(this, j);
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f26135c + " -> " + m9477e() + ",initial velocity: " + this.f26139g + ", duration: " + C9944e.m9595b(this) + " ms";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9977o0(InterfaceC9950h interfaceC9950h, InterfaceC9980q0 interfaceC9980q0, Object obj, Object obj2, AbstractC9976o abstractC9976o) {
        this(interfaceC9950h.mo9570a(interfaceC9980q0), interfaceC9980q0, obj, obj2, abstractC9976o);
        Intrinsics.isThisObjectNull(interfaceC9950h, "animationSpec");
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
    }
}
