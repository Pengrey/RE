package p345s;

import id.InterfaceC6097a;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p181jd.Intrinsics;
import p345s.AbstractC9976o;

/* renamed from: s.g */
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AbstractC9976o> {

    /* renamed from: a */
    private final InterfaceC9980q0 f26046a;

    /* renamed from: b */
    private final Object f26047b;

    /* renamed from: c */
    private final long f26048c;

    /* renamed from: d */
    private final InterfaceC6097a f26049d;

    /* renamed from: e */
    private final InterfaceC5220m0 f26050e;

    /* renamed from: f */
    private AbstractC9976o f26051f;

    /* renamed from: g */
    private long f26052g;

    /* renamed from: h */
    private long f26053h;

    /* renamed from: i */
    private final InterfaceC5220m0 f26054i;

    public AnimationState(Object obj, InterfaceC9980q0 interfaceC9980q0, AbstractC9976o abstractC9976o, long j, Object obj2, long j2, boolean z, InterfaceC6097a interfaceC6097a) {
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
        Intrinsics.isThisObjectNull(abstractC9976o, "initialVelocityVector");
        Intrinsics.isThisObjectNull(interfaceC6097a, "onCancel");
        this.f26046a = interfaceC9980q0;
        this.f26047b = obj2;
        this.f26048c = j2;
        this.f26049d = interfaceC6097a;
        m24962d = C5232o1.m24962d(obj, null, 2, null);
        this.f26050e = m24962d;
        this.f26051f = AnimationVectors.m9473b(abstractC9976o);
        this.f26052g = j;
        this.f26053h = Long.MIN_VALUE;
        m24962d2 = C5232o1.m24962d(Boolean.valueOf(z), null, 2, null);
        this.f26054i = m24962d2;
    }

    /* renamed from: a */
    public final void m9586a() {
        m9576k(false);
        this.f26049d.mo42214q();
    }

    /* renamed from: b */
    public final long m9585b() {
        return this.f26053h;
    }

    /* renamed from: c */
    public final long m9584c() {
        return this.f26052g;
    }

    /* renamed from: d */
    public final long m9583d() {
        return this.f26048c;
    }

    /* renamed from: e */
    public final Object m9582e() {
        return this.f26050e.getValue();
    }

    /* renamed from: f */
    public final Object m9581f() {
        return this.f26046a.mo9467b().mo9587d((V) this.f26051f);
    }

    /* renamed from: g */
    public final AbstractC9976o m9580g() {
        return this.f26051f;
    }

    /* renamed from: h */
    public final boolean m9579h() {
        return ((Boolean) this.f26054i.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final void m9578i(long j) {
        this.f26053h = j;
    }

    /* renamed from: j */
    public final void m9577j(long j) {
        this.f26052g = j;
    }

    /* renamed from: k */
    public final void m9576k(boolean z) {
        this.f26054i.setValue(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final void m9575l(Object obj) {
        this.f26050e.setValue(obj);
    }

    /* renamed from: m */
    public final void m9574m(AbstractC9976o abstractC9976o) {
        Intrinsics.isThisObjectNull(abstractC9976o, "<set-?>");
        this.f26051f = abstractC9976o;
    }
}
