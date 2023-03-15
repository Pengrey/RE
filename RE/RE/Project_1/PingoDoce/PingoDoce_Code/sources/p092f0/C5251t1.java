package p092f0;

import p181jd.Intrinsics;

/* renamed from: f0.t1 */
/* loaded from: classes.dex */
public final class C5251t1<T> implements InterfaceC5242r1 {

    /* renamed from: w */
    private final Object f14517w;

    public C5251t1(Object obj) {
        this.f14517w = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5251t1) && Intrinsics.equals(getValue(), ((C5251t1) obj).getValue());
    }

    public Object getValue() {
        return this.f14517w;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
