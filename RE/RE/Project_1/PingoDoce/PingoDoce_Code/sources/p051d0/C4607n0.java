package p051d0;

import p297pd._Ranges;

/* renamed from: d0.n0 */
/* loaded from: classes.dex */
public final class C4607n0 {

    /* renamed from: a */
    private final float f12506a;

    /* renamed from: b */
    private final float f12507b;

    /* renamed from: c */
    private final float f12508c;

    public C4607n0(float f, float f2, float f3) {
        this.f12506a = f;
        this.f12507b = f2;
        this.f12508c = f3;
    }

    /* renamed from: a */
    public final float m27091a(float f) {
        float m14997l;
        float f2 = f < 0.0f ? this.f12507b : this.f12508c;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        m14997l = _Ranges.m14997l(f / this.f12506a, -1.0f, 1.0f);
        return (this.f12506a / f2) * ((float) Math.sin((m14997l * 3.1415927f) / 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4607n0) {
            C4607n0 c4607n0 = (C4607n0) obj;
            if (this.f12506a == c4607n0.f12506a) {
                if (this.f12507b == c4607n0.f12507b) {
                    return (this.f12508c > c4607n0.f12508c ? 1 : (this.f12508c == c4607n0.f12508c ? 0 : -1)) == 0;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f12506a) * 31) + Float.hashCode(this.f12507b)) * 31) + Float.hashCode(this.f12508c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.f12506a + ", factorAtMin=" + this.f12507b + ", factorAtMax=" + this.f12508c + ')';
    }
}
