package p047ce;

/* renamed from: ce.d */
/* loaded from: classes2.dex */
public final class C2122d {

    /* renamed from: a */
    private final boolean f6143a;

    /* renamed from: b */
    private final int f6144b;

    /* renamed from: c */
    private final int f6145c;

    public C2122d(boolean z, int i, int i2) {
        this.f6143a = z;
        this.f6144b = i;
        this.f6145c = i2;
    }

    /* renamed from: a */
    public final int m34619a() {
        return this.f6144b;
    }

    /* renamed from: b */
    public final int m34618b() {
        return this.f6145c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2122d) {
            C2122d c2122d = (C2122d) obj;
            return this.f6143a == c2122d.f6143a && this.f6144b == c2122d.f6144b && this.f6145c == c2122d.f6145c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.f6143a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.f6144b)) * 31) + Integer.hashCode(this.f6145c);
    }

    public String toString() {
        boolean z = this.f6143a;
        int i = this.f6144b;
        int i2 = this.f6145c;
        return "KeyboardVisibilityChanged(visible=" + z + ", contentHeight=" + i + ", contentHeightBeforeResize=" + i2 + ")";
    }
}
