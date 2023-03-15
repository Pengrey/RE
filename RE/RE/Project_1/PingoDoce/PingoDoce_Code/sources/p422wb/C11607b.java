package p422wb;

/* renamed from: wb.b */
/* loaded from: classes2.dex */
public class C11607b {

    /* renamed from: a */
    private final int f29684a;

    /* renamed from: b */
    private final int f29685b;

    public C11607b(int i, int i2) {
        this.f29684a = i;
        this.f29685b = i2;
    }

    /* renamed from: a */
    public final int m4616a() {
        return this.f29685b;
    }

    /* renamed from: b */
    public final int m4615b() {
        return this.f29684a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11607b) {
            C11607b c11607b = (C11607b) obj;
            return this.f29684a == c11607b.f29684a && this.f29685b == c11607b.f29685b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29684a ^ this.f29685b;
    }

    public final String toString() {
        return this.f29684a + "(" + this.f29685b + ')';
    }
}
