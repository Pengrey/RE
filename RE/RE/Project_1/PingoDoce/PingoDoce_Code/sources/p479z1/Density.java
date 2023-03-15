package p479z1;

import com.google.crypto.tink.shaded.protobuf.Reader;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p373u0.C10781l;
import p373u0.C10783m;

/* renamed from: z1.d */
/* loaded from: classes.dex */
public interface Density {

    /* compiled from: Density.kt */
    /* renamed from: z1.d$a */
    /* loaded from: classes.dex */
    public static final class C13602a {
        /* renamed from: a */
        public static int m893a(Density density, float f) {
            int m19530c;
            Intrinsics.isThisObjectNull(density, "this");
            float m899A = density.m899A(f);
            if (Float.isInfinite(m899A)) {
                return Reader.READ_DONE;
            }
            m19530c = C7037c.m19530c(m899A);
            return m19530c;
        }

        /* renamed from: b */
        public static float m892b(Density density, int i) {
            Intrinsics.isThisObjectNull(density, "this");
            return C13605g.m875g(i / density.getDensity());
        }

        /* renamed from: c */
        public static float m891c(Density density, long j) {
            Intrinsics.isThisObjectNull(density, "this");
            if (C13622r.m794g(C13619p.m811g(j), C13622r.f34617b.m789b())) {
                return C13619p.m810h(j) * density.m894r() * density.getDensity();
            }
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }

        /* renamed from: d */
        public static float m890d(Density density, float f) {
            Intrinsics.isThisObjectNull(density, "this");
            return f * density.getDensity();
        }

        /* renamed from: e */
        public static long m889e(Density density, long j) {
            Intrinsics.isThisObjectNull(density, "this");
            if (j != C13610j.f34604a.m848a()) {
                return C10783m.m7085a(density.m899A(C13610j.m850f(j)), density.m899A(C13610j.m851e(j)));
            }
            return C10781l.f27885b.m7087a();
        }
    }

    /* renamed from: A */
    float m899A(float f);

    /* renamed from: O */
    int m898O(float f);

    /* renamed from: U */
    long m897U(long j);

    /* renamed from: Y */
    float m896Y(long j);

    float getDensity();

    /* renamed from: i0 */
    float m895i0(int i);

    /* renamed from: r */
    float m894r();
}
