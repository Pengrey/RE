package p260o0;

/* renamed from: o0.s */
/* loaded from: classes.dex */
public final class C7986s {

    /* renamed from: a */
    private static final Object f20688a = new Object();

    /* renamed from: d */
    public static final Void m17257d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* renamed from: e */
    public static final void m17256e(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
    }
}
