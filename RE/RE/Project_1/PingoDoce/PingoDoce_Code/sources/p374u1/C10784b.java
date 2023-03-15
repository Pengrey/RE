package p374u1;

/* renamed from: u1.b */
/* loaded from: classes.dex */
public final class C10784b implements InterfaceC10786d {

    /* renamed from: a */
    private final int f27891a;

    /* renamed from: b */
    private final int f27892b;

    public C10784b(int i, int i2) {
        this.f27891a = i;
        this.f27892b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10784b) {
            C10784b c10784b = (C10784b) obj;
            return this.f27891a == c10784b.f27891a && this.f27892b == c10784b.f27892b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f27891a * 31) + this.f27892b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f27891a + ", lengthAfterCursor=" + this.f27892b + ')';
    }
}
