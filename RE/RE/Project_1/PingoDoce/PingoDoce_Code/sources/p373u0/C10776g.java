package p373u0;

/* renamed from: u0.g */
/* loaded from: classes.dex */
public final class C10776g {
    /* renamed from: a */
    public static final long m7133a(float f, float f2) {
        return C10774f.m7149g((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: b */
    public static final boolean m7132b(long j) {
        float m7145k = C10774f.m7145k(j);
        if ((Float.isInfinite(m7145k) || Float.isNaN(m7145k)) ? false : true) {
            float m7144l = C10774f.m7144l(j);
            if ((Float.isInfinite(m7144l) || Float.isNaN(m7144l)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m7131c(long j) {
        return j != C10774f.f27866b.m7135b();
    }
}
