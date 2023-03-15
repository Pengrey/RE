package p470yf;

import id.InterfaceC6097a;
import p181jd.Intrinsics;

/* renamed from: yf.a */
/* loaded from: classes2.dex */
public final class SnackBarAction {

    /* renamed from: a */
    private final String f34176a;

    /* renamed from: b */
    private final InterfaceC6097a f34177b;

    public SnackBarAction(String str, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(str, "description");
        Intrinsics.isThisObjectNull(interfaceC6097a, "action");
        this.f34176a = str;
        this.f34177b = interfaceC6097a;
    }

    /* renamed from: a */
    public final InterfaceC6097a m1413a() {
        return this.f34177b;
    }

    /* renamed from: b */
    public final String m1412b() {
        return this.f34176a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SnackBarAction) {
            SnackBarAction snackBarAction = (SnackBarAction) obj;
            return Intrinsics.equals(this.f34176a, snackBarAction.f34176a) && Intrinsics.equals(this.f34177b, snackBarAction.f34177b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f34176a.hashCode() * 31) + this.f34177b.hashCode();
    }

    public String toString() {
        String str = this.f34176a;
        InterfaceC6097a interfaceC6097a = this.f34177b;
        return "SnackBarAction(description=" + str + ", action=" + interfaceC6097a + ")";
    }
}
