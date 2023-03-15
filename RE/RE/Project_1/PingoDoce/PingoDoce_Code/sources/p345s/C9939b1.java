package p345s;

import p181jd.Intrinsics;
import p345s.AbstractC9976o;
import p345s.InterfaceC10011w0;

/* compiled from: VectorizedAnimationSpec.kt */
/* renamed from: s.b1 */
/* loaded from: classes.dex */
public final class C9939b1<V extends AbstractC9976o> implements InterfaceC10011w0 {

    /* renamed from: a */
    private final int f26032a;

    /* renamed from: b */
    private final int f26033b;

    /* renamed from: c */
    private final InterfaceC10016y f26034c;

    /* renamed from: d */
    private final C10017y0 f26035d;

    public C9939b1(int i, int i2, InterfaceC10016y interfaceC10016y) {
        Intrinsics.isThisObjectNull(interfaceC10016y, "easing");
        this.f26032a = i;
        this.f26033b = i2;
        this.f26034c = interfaceC10016y;
        this.f26035d = new C10017y0(new C9945e0(m9620e(), m9621d(), interfaceC10016y));
    }

    /* renamed from: a */
    public boolean m9624a() {
        return InterfaceC10011w0.C10012a.m9398c(this);
    }

    /* renamed from: b */
    public long m9623b(AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
        return InterfaceC10011w0.C10012a.m9400a(this, abstractC9976o, abstractC9976o2, abstractC9976o3);
    }

    /* renamed from: c */
    public AbstractC9976o m9622c(long j, AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "targetValue");
        Intrinsics.isThisObjectNull(abstractC9976o3, "initialVelocity");
        return this.f26035d.m9392c(j, abstractC9976o, abstractC9976o2, abstractC9976o3);
    }

    /* renamed from: d */
    public int m9621d() {
        return this.f26033b;
    }

    /* renamed from: e */
    public int m9620e() {
        return this.f26032a;
    }

    /* renamed from: f */
    public AbstractC9976o m9619f(long j, AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
        Intrinsics.isThisObjectNull(abstractC9976o, "initialValue");
        Intrinsics.isThisObjectNull(abstractC9976o2, "targetValue");
        Intrinsics.isThisObjectNull(abstractC9976o3, "initialVelocity");
        return this.f26035d.m9391f(j, abstractC9976o, abstractC9976o2, abstractC9976o3);
    }

    /* renamed from: g */
    public AbstractC9976o m9618g(AbstractC9976o abstractC9976o, AbstractC9976o abstractC9976o2, AbstractC9976o abstractC9976o3) {
        return InterfaceC10011w0.C10012a.m9399b(this, abstractC9976o, abstractC9976o2, abstractC9976o3);
    }
}
