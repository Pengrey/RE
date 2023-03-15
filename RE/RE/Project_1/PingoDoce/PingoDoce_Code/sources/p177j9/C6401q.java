package p177j9;

/* renamed from: j9.q */
/* loaded from: classes.dex */
public final class C6401q {

    /* renamed from: a */
    private final Class<?> f17459a;

    /* renamed from: b */
    private final int f17460b;

    /* renamed from: c */
    private final int f17461c;

    private C6401q(Class<?> cls, int i, int i2) {
        this.f17459a = (Class) C6410z.m21017c(cls, "Null dependency anInterface.");
        this.f17460b = i;
        this.f17461c = i2;
    }

    /* renamed from: a */
    public static C6401q m21051a(Class<?> cls) {
        return new C6401q(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m21050b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    /* renamed from: h */
    public static C6401q m21044h(Class<?> cls) {
        return new C6401q(cls, 0, 0);
    }

    /* renamed from: i */
    public static C6401q m21043i(Class<?> cls) {
        return new C6401q(cls, 0, 1);
    }

    /* renamed from: j */
    public static C6401q m21042j(Class<?> cls) {
        return new C6401q(cls, 1, 0);
    }

    /* renamed from: k */
    public static C6401q m21041k(Class<?> cls) {
        return new C6401q(cls, 2, 0);
    }

    /* renamed from: c */
    public Class<?> m21049c() {
        return this.f17459a;
    }

    /* renamed from: d */
    public boolean m21048d() {
        return this.f17461c == 2;
    }

    /* renamed from: e */
    public boolean m21047e() {
        return this.f17461c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6401q) {
            C6401q c6401q = (C6401q) obj;
            return this.f17459a == c6401q.f17459a && this.f17460b == c6401q.f17460b && this.f17461c == c6401q.f17461c;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m21046f() {
        return this.f17460b == 1;
    }

    /* renamed from: g */
    public boolean m21045g() {
        return this.f17460b == 2;
    }

    public int hashCode() {
        return ((((this.f17459a.hashCode() ^ 1000003) * 1000003) ^ this.f17460b) * 1000003) ^ this.f17461c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f17459a);
        sb2.append(", type=");
        int i = this.f17460b;
        sb2.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(m21050b(this.f17461c));
        sb2.append("}");
        return sb2.toString();
    }
}
