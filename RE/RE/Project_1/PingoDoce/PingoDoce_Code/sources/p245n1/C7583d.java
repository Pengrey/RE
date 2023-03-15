package p245n1;

import id.InterfaceC6097a;
import p181jd.Intrinsics;

/* renamed from: n1.d */
/* loaded from: classes.dex */
public final class C7583d {

    /* renamed from: a */
    private final String f20068a;

    /* renamed from: b */
    private final InterfaceC6097a f20069b;

    /* renamed from: a */
    public final InterfaceC6097a m18097a() {
        return this.f20069b;
    }

    /* renamed from: b */
    public final String m18096b() {
        return this.f20068a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7583d) {
            C7583d c7583d = (C7583d) obj;
            return Intrinsics.equals(this.f20068a, c7583d.f20068a) && Intrinsics.equals(this.f20069b, c7583d.f20069b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f20068a.hashCode() * 31) + this.f20069b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f20068a + ", action=" + this.f20069b + ')';
    }
}
