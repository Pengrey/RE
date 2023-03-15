package p374u1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: u1.g */
/* loaded from: classes.dex */
public final class C10790g {

    /* renamed from: f */
    public static final C10791a f27905f = new C10791a(null);

    /* renamed from: g */
    private static final C10790g f27906g = new C10790g(false, 0, false, 0, 0, 31, null);

    /* renamed from: a */
    private final boolean f27907a;

    /* renamed from: b */
    private final int f27908b;

    /* renamed from: c */
    private final boolean f27909c;

    /* renamed from: d */
    private final int f27910d;

    /* renamed from: e */
    private final int f27911e;

    /* compiled from: ImeOptions.kt */
    /* renamed from: u1.g$a */
    /* loaded from: classes.dex */
    public static final class C10791a {
        private C10791a() {
        }

        public /* synthetic */ C10791a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10790g m7052a() {
            return C10790g.f27906g;
        }
    }

    private C10790g(boolean z, int i, boolean z2, int i2, int i3) {
        this.f27907a = z;
        this.f27908b = i;
        this.f27909c = z2;
        this.f27910d = i2;
        this.f27911e = i3;
    }

    public /* synthetic */ C10790g(boolean z, int i, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3);
    }

    /* renamed from: b */
    public final boolean m7057b() {
        return this.f27909c;
    }

    /* renamed from: c */
    public final int m7056c() {
        return this.f27908b;
    }

    /* renamed from: d */
    public final int m7055d() {
        return this.f27911e;
    }

    /* renamed from: e */
    public final int m7054e() {
        return this.f27910d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10790g) {
            C10790g c10790g = (C10790g) obj;
            return this.f27907a == c10790g.f27907a && C10796l.m7036f(m7056c(), c10790g.m7056c()) && this.f27909c == c10790g.f27909c && C10798m.m7020j(m7054e(), c10790g.m7054e()) && C10788f.m7070l(m7055d(), c10790g.m7055d());
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m7053f() {
        return this.f27907a;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f27907a) * 31) + C10796l.m7035g(m7056c())) * 31) + Boolean.hashCode(this.f27909c)) * 31) + C10798m.m7019k(m7054e())) * 31) + C10788f.m7069m(m7055d());
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f27907a + ", capitalization=" + ((Object) C10796l.m7034h(m7056c())) + ", autoCorrect=" + this.f27909c + ", keyboardType=" + ((Object) C10798m.m7018l(m7054e())) + ", imeAction=" + ((Object) C10788f.m7068n(m7055d())) + ')';
    }

    public /* synthetic */ C10790g(boolean z, int i, boolean z2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? C10796l.f27914a.m7032b() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? C10798m.f27919a.m7011g() : i2, (i4 & 16) != 0 ? C10788f.f27895b.m7066a() : i3, null);
    }
}
