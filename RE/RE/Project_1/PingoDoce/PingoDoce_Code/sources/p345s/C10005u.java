package p345s;

import p181jd.Intrinsics;
import p297pd._Ranges;
import p345s.AbstractC9976o;
import p345s.Animation;

/* compiled from: Animation.kt */
/* renamed from: s.u */
/* loaded from: classes.dex */
public final class C10005u<T, V extends AbstractC9976o> implements Animation {

    /* renamed from: a */
    private final InterfaceC10010v0 f26180a;

    /* renamed from: b */
    private final InterfaceC9980q0 f26181b;

    /* renamed from: c */
    private final Object f26182c;

    /* renamed from: d */
    private final AbstractC9976o f26183d;

    /* renamed from: e */
    private final AbstractC9976o f26184e;

    /* renamed from: f */
    private final AbstractC9976o f26185f;

    /* renamed from: g */
    private final Object f26186g;

    /* renamed from: h */
    private final long f26187h;

    /* renamed from: i */
    private final boolean f26188i;

    public C10005u(InterfaceC10010v0 interfaceC10010v0, InterfaceC9980q0 interfaceC9980q0, Object obj, AbstractC9976o abstractC9976o) {
        float m14997l;
        Intrinsics.isThisObjectNull(interfaceC10010v0, "animationSpec");
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
        Intrinsics.isThisObjectNull(abstractC9976o, "initialVelocityVector");
        this.f26180a = interfaceC10010v0;
        this.f26181b = interfaceC9980q0;
        this.f26182c = obj;
        V mo9587d = m9417d().mo9468a().mo9587d(obj);
        this.f26183d = mo9587d;
        this.f26184e = AnimationVectors.m9473b(abstractC9976o);
        this.f26186g = m9417d().mo9467b().mo9587d((V) interfaceC10010v0.mo9405d(mo9587d, abstractC9976o));
        this.f26187h = interfaceC10010v0.mo9407b(mo9587d, abstractC9976o);
        AbstractC9976o m9473b = AnimationVectors.m9473b(interfaceC10010v0.mo9406c(m9418c(), mo9587d, abstractC9976o));
        this.f26185f = m9473b;
        int mo9485b = m9473b.mo9485b();
        for (int i = 0; i < mo9485b; i++) {
            AbstractC9976o abstractC9976o2 = this.f26185f;
            m14997l = _Ranges.m14997l(abstractC9976o2.mo9486a(i), -this.f26180a.mo9408a(), this.f26180a.mo9408a());
            abstractC9976o2.mo9482e(i, m14997l);
        }
    }

    /* renamed from: a */
    public boolean m9420a() {
        return this.f26188i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public Object m9419b(long j) {
        if (!m9414g(j)) {
            return m9417d().mo9467b().mo9587d((V) this.f26180a.mo9404e(j, this.f26183d, this.f26184e));
        }
        return m9416e();
    }

    /* renamed from: c */
    public long m9418c() {
        return this.f26187h;
    }

    /* renamed from: d */
    public InterfaceC9980q0 m9417d() {
        return this.f26181b;
    }

    /* renamed from: e */
    public Object m9416e() {
        return this.f26186g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public AbstractC9976o m9415f(long j) {
        if (!m9414g(j)) {
            return this.f26180a.mo9406c(j, this.f26183d, this.f26184e);
        }
        return this.f26185f;
    }

    /* renamed from: g */
    public boolean m9414g(long j) {
        return Animation.C9940a.m9610a(this, j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10005u(InterfaceC10009v interfaceC10009v, InterfaceC9980q0 interfaceC9980q0, Object obj, AbstractC9976o abstractC9976o) {
        this(interfaceC10009v.mo9409a(interfaceC9980q0), interfaceC9980q0, obj, abstractC9976o);
        Intrinsics.isThisObjectNull(interfaceC10009v, "animationSpec");
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
        Intrinsics.isThisObjectNull(abstractC9976o, "initialVelocityVector");
    }
}
