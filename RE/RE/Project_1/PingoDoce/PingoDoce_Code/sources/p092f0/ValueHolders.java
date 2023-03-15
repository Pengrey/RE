package p092f0;

import id.InterfaceC6097a;
import p181jd.Intrinsics;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* renamed from: f0.j0 */
/* loaded from: classes.dex */
public final class ValueHolders<T> implements InterfaceC5242r1 {

    /* renamed from: w */
    private final InterfaceC13178g f14422w;

    public ValueHolders(InterfaceC6097a interfaceC6097a) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(interfaceC6097a, "valueProducer");
        m1464a = LazyJVM.m1464a(interfaceC6097a);
        this.f14422w = m1464a;
    }

    /* renamed from: b */
    private final Object m25078b() {
        return this.f14422w.getValue();
    }

    public Object getValue() {
        return m25078b();
    }
}
