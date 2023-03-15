package p245n1;

import p181jd.Intrinsics;
import p468yc.InterfaceC13174c;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class C7580a<T extends InterfaceC13174c<? extends Boolean>> {

    /* renamed from: a */
    private final String f20060a;

    /* renamed from: b */
    private final InterfaceC13174c f20061b;

    public C7580a(String str, InterfaceC13174c interfaceC13174c) {
        this.f20060a = str;
        this.f20061b = interfaceC13174c;
    }

    /* renamed from: a */
    public final InterfaceC13174c m18105a() {
        return this.f20061b;
    }

    /* renamed from: b */
    public final String m18104b() {
        return this.f20060a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7580a) {
            C7580a c7580a = (C7580a) obj;
            return Intrinsics.equals(this.f20060a, c7580a.f20060a) && Intrinsics.equals(this.f20061b, c7580a.f20061b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20060a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InterfaceC13174c interfaceC13174c = this.f20061b;
        return hashCode + (interfaceC13174c != null ? interfaceC13174c.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + ((Object) this.f20060a) + ", action=" + this.f20061b + ')';
    }
}
