package p302q0;

import p181jd.Intrinsics;
import p220ld.C7037c;
import p302q0.InterfaceC9560a;
import p479z1.C13614l;
import p479z1.C13615m;
import p479z1.EnumC13618o;

/* renamed from: q0.b */
/* loaded from: classes.dex */
public final class Alignment implements InterfaceC9560a {

    /* renamed from: b */
    private final float f25154b;

    /* renamed from: c */
    private final float f25155c;

    /* compiled from: Alignment.kt */
    /* renamed from: q0.b$a */
    /* loaded from: classes.dex */
    public static final class C9564a implements InterfaceC9560a.InterfaceC9562b {

        /* renamed from: a */
        private final float f25156a;

        public C9564a(float f) {
            this.f25156a = f;
        }

        /* renamed from: a */
        public int mo10588a(int i, int i2, EnumC13618o enumC13618o) {
            int m19530c;
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            m19530c = C7037c.m19530c(((i2 - i) / 2.0f) * (1 + (enumC13618o == EnumC13618o.Ltr ? this.f25156a : (-1) * this.f25156a)));
            return m19530c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9564a) && Intrinsics.equals(Float.valueOf(this.f25156a), Float.valueOf(((C9564a) obj).f25156a));
        }

        public int hashCode() {
            return Float.hashCode(this.f25156a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f25156a + ')';
        }
    }

    /* compiled from: Alignment.kt */
    /* renamed from: q0.b$b */
    /* loaded from: classes.dex */
    public static final class C9565b implements InterfaceC9560a.InterfaceC9563c {

        /* renamed from: a */
        private final float f25157a;

        public C9565b(float f) {
            this.f25157a = f;
        }

        /* renamed from: a */
        public int mo10587a(int i, int i2) {
            int m19530c;
            m19530c = C7037c.m19530c(((i2 - i) / 2.0f) * (1 + this.f25157a));
            return m19530c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9565b) && Intrinsics.equals(Float.valueOf(this.f25157a), Float.valueOf(((C9565b) obj).f25157a));
        }

        public int hashCode() {
            return Float.hashCode(this.f25157a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f25157a + ')';
        }
    }

    public Alignment(float f, float f2) {
        this.f25154b = f;
        this.f25155c = f2;
    }

    /* renamed from: a */
    public long mo10596a(long j, long j2, EnumC13618o enumC13618o) {
        float f;
        int m19530c;
        int m19530c2;
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        float m824g = (C13615m.m824g(j2) - C13615m.m824g(j)) / 2.0f;
        float m825f = (C13615m.m825f(j2) - C13615m.m825f(j)) / 2.0f;
        if (enumC13618o == EnumC13618o.Ltr) {
            f = this.f25154b;
        } else {
            f = (-1) * this.f25154b;
        }
        float f2 = 1;
        m19530c = C7037c.m19530c(m824g * (f + f2));
        m19530c2 = C7037c.m19530c(m825f * (f2 + this.f25155c));
        return C13614l.m833a(m19530c, m19530c2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Alignment) {
            Alignment alignment = (Alignment) obj;
            return Intrinsics.equals(Float.valueOf(this.f25154b), Float.valueOf(alignment.f25154b)) && Intrinsics.equals(Float.valueOf(this.f25155c), Float.valueOf(alignment.f25155c));
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f25154b) * 31) + Float.hashCode(this.f25155c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f25154b + ", verticalBias=" + this.f25155c + ')';
    }
}
