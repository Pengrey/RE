package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p373u0.C10774f;

/* renamed from: v0.a1 */
/* loaded from: classes.dex */
public final class C10995a1 {

    /* renamed from: d */
    public static final C10996a f28306d = new C10996a(null);

    /* renamed from: e */
    private static final C10995a1 f28307e = new C10995a1(0, 0, 0.0f, 7, null);

    /* renamed from: a */
    private final long f28308a;

    /* renamed from: b */
    private final long f28309b;

    /* renamed from: c */
    private final float f28310c;

    /* compiled from: Shadow.kt */
    /* renamed from: v0.a1$a */
    /* loaded from: classes.dex */
    public static final class C10996a {
        private C10996a() {
        }

        public /* synthetic */ C10996a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10995a1 m6626a() {
            return C10995a1.f28307e;
        }
    }

    private C10995a1(long j, long j2, float f) {
        this.f28308a = j;
        this.f28309b = j2;
        this.f28310c = f;
    }

    public /* synthetic */ C10995a1(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    /* renamed from: b */
    public final float m6629b() {
        return this.f28310c;
    }

    /* renamed from: c */
    public final long m6628c() {
        return this.f28308a;
    }

    /* renamed from: d */
    public final long m6627d() {
        return this.f28309b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10995a1) {
            C10995a1 c10995a1 = (C10995a1) obj;
            if (Color.m6646n(m6628c(), c10995a1.m6628c()) && C10774f.m7147i(m6627d(), c10995a1.m6627d())) {
                return (this.f28310c > c10995a1.f28310c ? 1 : (this.f28310c == c10995a1.f28310c ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m6640t(m6628c()) * 31) + C10774f.m7143m(m6627d())) * 31) + Float.hashCode(this.f28310c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Color.m6639u(m6628c())) + ", offset=" + ((Object) C10774f.m7138r(m6627d())) + ", blurRadius=" + this.f28310c + ')';
    }

    public /* synthetic */ C10995a1(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C11003c0.m6593c(4278190080L) : j, (i & 2) != 0 ? C10774f.f27866b.m7134c() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }
}
