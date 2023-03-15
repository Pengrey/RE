package p345s;

/* renamed from: s.n */
/* loaded from: classes.dex */
public final class C9966n extends AbstractC9976o {

    /* renamed from: a */
    private float f26105a;

    /* renamed from: b */
    private float f26106b;

    /* renamed from: c */
    private float f26107c;

    /* renamed from: d */
    private float f26108d;

    /* renamed from: e */
    private final int f26109e;

    public C9966n(float f, float f2, float f3, float f4) {
        super(null);
        this.f26105a = f;
        this.f26106b = f2;
        this.f26107c = f3;
        this.f26108d = f4;
        this.f26109e = 4;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: a */
    public float mo9486a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.f26108d;
                }
                return this.f26107c;
            }
            return this.f26106b;
        }
        return this.f26105a;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: b */
    public int mo9485b() {
        return this.f26109e;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: d */
    public void mo9483d() {
        this.f26105a = 0.0f;
        this.f26106b = 0.0f;
        this.f26107c = 0.0f;
        this.f26108d = 0.0f;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: e */
    public void mo9482e(int i, float f) {
        if (i == 0) {
            this.f26105a = f;
        } else if (i == 1) {
            this.f26106b = f;
        } else if (i == 2) {
            this.f26107c = f;
        } else if (i != 3) {
        } else {
            this.f26108d = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9966n) {
            C9966n c9966n = (C9966n) obj;
            if (c9966n.f26105a == this.f26105a) {
                if (c9966n.f26106b == this.f26106b) {
                    if (c9966n.f26107c == this.f26107c) {
                        if (c9966n.f26108d == this.f26108d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final float m9510f() {
        return this.f26105a;
    }

    /* renamed from: g */
    public final float m9509g() {
        return this.f26106b;
    }

    /* renamed from: h */
    public final float m9508h() {
        return this.f26107c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f26105a) * 31) + Float.hashCode(this.f26106b)) * 31) + Float.hashCode(this.f26107c)) * 31) + Float.hashCode(this.f26108d);
    }

    /* renamed from: i */
    public final float m9507i() {
        return this.f26108d;
    }

    @Override // p345s.AbstractC9976o
    /* renamed from: j */
    public C9966n mo9513h() {
        return new C9966n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f26105a + ", v2 = " + this.f26106b + ", v3 = " + this.f26107c + ", v4 = " + this.f26108d;
    }
}
