package p327r3;

import bd.InterfaceC1886d;
import p181jd.Intrinsics;

/* renamed from: r3.f */
/* loaded from: classes.dex */
public final class C9802f implements InterfaceC9807j {

    /* renamed from: a */
    private final C9805i f25741a;

    public C9802f(C9805i c9805i) {
        this.f25741a = c9805i;
    }

    /* renamed from: a */
    public Object mo9941a(InterfaceC1886d interfaceC1886d) {
        return this.f25741a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9802f) && Intrinsics.equals(this.f25741a, ((C9802f) obj).f25741a);
    }

    public int hashCode() {
        return this.f25741a.hashCode();
    }
}
