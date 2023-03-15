package p374u1;

/* renamed from: u1.r */
/* loaded from: classes.dex */
public final class C10804r implements InterfaceC10786d {

    /* renamed from: a */
    private final int f27939a;

    /* renamed from: b */
    private final int f27940b;

    public C10804r(int i, int i2) {
        this.f27939a = i;
        this.f27940b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10804r) {
            C10804r c10804r = (C10804r) obj;
            return this.f27939a == c10804r.f27939a && this.f27940b == c10804r.f27940b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f27939a * 31) + this.f27940b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f27939a + ", end=" + this.f27940b + ')';
    }
}
