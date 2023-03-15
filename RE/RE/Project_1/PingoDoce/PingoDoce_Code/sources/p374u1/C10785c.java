package p374u1;

/* renamed from: u1.c */
/* loaded from: classes.dex */
public final class C10785c implements InterfaceC10786d {

    /* renamed from: a */
    private final int f27893a;

    /* renamed from: b */
    private final int f27894b;

    public C10785c(int i, int i2) {
        this.f27893a = i;
        this.f27894b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10785c) {
            C10785c c10785c = (C10785c) obj;
            return this.f27893a == c10785c.f27893a && this.f27894b == c10785c.f27894b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f27893a * 31) + this.f27894b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f27893a + ", lengthAfterCursor=" + this.f27894b + ')';
    }
}
