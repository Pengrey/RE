package p479z1;

/* renamed from: z1.q */
/* loaded from: classes.dex */
public final class C13621q {
    /* renamed from: a */
    public static final long m805a(float f, long j) {
        return m801e(j, f);
    }

    /* renamed from: b */
    public static final long m804b(double d) {
        return m801e(4294967296L, (float) d);
    }

    /* renamed from: c */
    public static final long m803c(int i) {
        return m801e(4294967296L, i);
    }

    /* renamed from: d */
    public static final boolean m802d(long j) {
        return C13619p.m812f(j) == 0;
    }

    /* renamed from: e */
    public static final long m801e(long j, float f) {
        return C13619p.m815c(j | (Float.floatToIntBits(f) & 4294967295L));
    }
}
