package p468yc;

import id.InterfaceC6097a;
import java.io.Serializable;
import p181jd.Intrinsics;

/* renamed from: yc.v */
/* loaded from: classes2.dex */
public final class Lazy<T> implements InterfaceC13178g, Serializable {

    /* renamed from: w */
    private InterfaceC6097a f34157w;

    /* renamed from: x */
    private Object f34158x;

    public Lazy(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "initializer");
        this.f34157w = interfaceC6097a;
        this.f34158x = C13194t.f34155a;
    }

    private final Object writeReplace() {
        return new C13175d(getValue());
    }

    /* renamed from: a */
    public boolean m1440a() {
        return this.f34158x != C13194t.f34155a;
    }

    public Object getValue() {
        if (this.f34158x == C13194t.f34155a) {
            InterfaceC6097a interfaceC6097a = this.f34157w;
            Intrinsics.ifNullDoSomething(interfaceC6097a);
            this.f34158x = interfaceC6097a.mo42214q();
            this.f34157w = null;
        }
        return this.f34158x;
    }

    public String toString() {
        return m1440a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
