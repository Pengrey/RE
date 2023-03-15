package p210l0;

/* renamed from: l0.d */
/* loaded from: classes.dex */
public final class C6959d {
    static {
        new C6959d();
    }

    private C6959d() {
    }

    /* renamed from: a */
    public static final void m19703a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    /* renamed from: b */
    public static final void m19702b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    /* renamed from: c */
    public static final void m19701c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        } else if (i <= i2) {
        } else {
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
    }
}
