package p345s;

/* renamed from: s.t */
/* loaded from: classes.dex */
public final class C10002t implements InterfaceC10016y {

    /* renamed from: a */
    private final float f26176a;

    /* renamed from: b */
    private final float f26177b;

    /* renamed from: c */
    private final float f26178c;

    /* renamed from: d */
    private final float f26179d;

    public C10002t(float f, float f2, float f3, float f4) {
        this.f26176a = f;
        this.f26177b = f2;
        this.f26178c = f3;
        this.f26179d = f4;
    }

    /* renamed from: b */
    private final float m9427b(float f, float f2, float f3) {
        float f4 = 3;
        float f5 = 1 - f3;
        return (f * f4 * f5 * f5 * f3) + (f4 * f2 * f5 * f3 * f3) + (f3 * f3 * f3);
    }

    @Override // p345s.InterfaceC10016y
    /* renamed from: a */
    public float mo9387a(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float m9427b = m9427b(this.f26176a, this.f26178c, f4);
                    if (Math.abs(f - m9427b) < 0.001f) {
                        return m9427b(this.f26177b, this.f26179d, f4);
                    }
                    if (m9427b < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10002t) {
            C10002t c10002t = (C10002t) obj;
            if (this.f26176a == c10002t.f26176a) {
                if (this.f26177b == c10002t.f26177b) {
                    if (this.f26178c == c10002t.f26178c) {
                        if (this.f26179d == c10002t.f26179d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f26176a) * 31) + Float.hashCode(this.f26177b)) * 31) + Float.hashCode(this.f26178c)) * 31) + Float.hashCode(this.f26179d);
    }
}
