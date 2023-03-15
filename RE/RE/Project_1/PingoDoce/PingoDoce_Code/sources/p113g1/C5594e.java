package p113g1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.C10774f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g1.e */
/* loaded from: classes.dex */
public final class C5594e {

    /* renamed from: e */
    public static final C5595a f15809e = new C5595a(null);

    /* renamed from: f */
    private static final C5594e f15810f;

    /* renamed from: a */
    private final long f15811a;

    /* renamed from: b */
    private final float f15812b;

    /* renamed from: c */
    private final long f15813c;

    /* renamed from: d */
    private final long f15814d;

    /* compiled from: VelocityTracker.kt */
    /* renamed from: g1.e$a */
    /* loaded from: classes.dex */
    public static final class C5595a {
        private C5595a() {
        }

        public /* synthetic */ C5595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C5594e m23621a() {
            return C5594e.m23623a();
        }
    }

    static {
        C10774f.C10775a c10775a = C10774f.f27866b;
        f15810f = new C5594e(c10775a.m7134c(), 1.0f, 0L, c10775a.m7134c(), null);
    }

    private C5594e(long j, float f, long j2, long j3) {
        this.f15811a = j;
        this.f15812b = f;
        this.f15813c = j2;
        this.f15814d = j3;
    }

    public /* synthetic */ C5594e(long j, float f, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, j2, j3);
    }

    /* renamed from: a */
    public static final /* synthetic */ C5594e m23623a() {
        return f15810f;
    }

    /* renamed from: b */
    public final long m23622b() {
        return this.f15811a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5594e) {
            C5594e c5594e = (C5594e) obj;
            return C10774f.m7147i(this.f15811a, c5594e.f15811a) && Intrinsics.equals(Float.valueOf(this.f15812b), Float.valueOf(c5594e.f15812b)) && this.f15813c == c5594e.f15813c && C10774f.m7147i(this.f15814d, c5594e.f15814d);
        }
        return false;
    }

    public int hashCode() {
        return (((((C10774f.m7143m(this.f15811a) * 31) + Float.hashCode(this.f15812b)) * 31) + Long.hashCode(this.f15813c)) * 31) + C10774f.m7143m(this.f15814d);
    }

    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) C10774f.m7138r(this.f15811a)) + ", confidence=" + this.f15812b + ", durationMillis=" + this.f15813c + ", offset=" + ((Object) C10774f.m7138r(this.f15814d)) + ')';
    }
}
