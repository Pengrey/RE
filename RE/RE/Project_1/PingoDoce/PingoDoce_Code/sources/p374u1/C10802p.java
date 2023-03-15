package p374u1;

/* renamed from: u1.p */
/* loaded from: classes.dex */
public final class C10802p implements InterfaceC10786d {

    /* renamed from: a */
    private final int f27935a;

    /* renamed from: b */
    private final int f27936b;

    public C10802p(int i, int i2) {
        this.f27935a = i;
        this.f27936b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10802p) {
            C10802p c10802p = (C10802p) obj;
            return this.f27935a == c10802p.f27935a && this.f27936b == c10802p.f27936b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f27935a * 31) + this.f27936b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f27935a + ", end=" + this.f27936b + ')';
    }
}
