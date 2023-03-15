package p373u0;

/* renamed from: u0.b */
/* loaded from: classes.dex */
public final class C10771b {
    /* renamed from: a */
    public static final long m7170a(float f, float f2) {
        return C10769a.m7177b((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: b */
    public static /* synthetic */ long m7169b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return m7170a(f, f2);
    }
}
