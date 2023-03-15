package p345s;

/* renamed from: s.m */
/* loaded from: classes.dex */
public final class C9964m extends AbstractC9976o {

    /* renamed from: a */
    private float f26099a;

    /* renamed from: b */
    private float f26100b;

    /* renamed from: c */
    private final int f26101c;

    public C9964m(float f, float f2) {
        super(null);
        this.f26099a = f;
        this.f26100b = f2;
        this.f26101c = 2;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: a */
    public float mo9486a(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.f26100b;
        }
        return this.f26099a;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: b */
    public int mo9485b() {
        return this.f26101c;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: d */
    public void mo9483d() {
        this.f26099a = 0.0f;
        this.f26100b = 0.0f;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: e */
    public void mo9482e(int i, float f) {
        if (i == 0) {
            this.f26099a = f;
        } else if (i != 1) {
        } else {
            this.f26100b = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9964m) {
            C9964m c9964m = (C9964m) obj;
            if (c9964m.f26099a == this.f26099a) {
                if (c9964m.f26100b == this.f26100b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final float m9515f() {
        return this.f26099a;
    }

    /* renamed from: g */
    public final float m9514g() {
        return this.f26100b;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: h */
    public C9964m mo9513h() {
        return new C9964m(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f26099a) * 31) + Float.hashCode(this.f26100b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f26099a + ", v2 = " + this.f26100b;
    }
}
