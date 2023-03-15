package p245n1;

import id.InterfaceC6097a;
import p181jd.Intrinsics;

/* compiled from: SemanticsProperties.kt */
/* renamed from: n1.i */
/* loaded from: classes.dex */
public final class C7593i {

    /* renamed from: a */
    private final InterfaceC6097a f20095a;

    /* renamed from: b */
    private final InterfaceC6097a f20096b;

    /* renamed from: c */
    private final boolean f20097c;

    public C7593i(InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "value");
        Intrinsics.isThisObjectNull(interfaceC6097a2, "maxValue");
        this.f20095a = interfaceC6097a;
        this.f20096b = interfaceC6097a2;
        this.f20097c = z;
    }

    /* renamed from: a */
    public final InterfaceC6097a m18054a() {
        return this.f20096b;
    }

    /* renamed from: b */
    public final boolean m18053b() {
        return this.f20097c;
    }

    /* renamed from: c */
    public final InterfaceC6097a m18052c() {
        return this.f20095a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f20095a.mo42214q()).floatValue() + ", maxValue=" + ((Number) this.f20096b.mo42214q()).floatValue() + ", reverseScrolling=" + this.f20097c + ')';
    }
}
