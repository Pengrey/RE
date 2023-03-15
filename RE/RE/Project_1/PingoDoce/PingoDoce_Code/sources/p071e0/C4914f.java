package p071e0;

/* renamed from: e0.f */
/* loaded from: classes.dex */
public final class C4914f {

    /* renamed from: a */
    private final float f13651a;

    /* renamed from: b */
    private final float f13652b;

    /* renamed from: c */
    private final float f13653c;

    /* renamed from: d */
    private final float f13654d;

    public C4914f(float f, float f2, float f3, float f4) {
        this.f13651a = f;
        this.f13652b = f2;
        this.f13653c = f3;
        this.f13654d = f4;
    }

    /* renamed from: a */
    public final float m26298a() {
        return this.f13651a;
    }

    /* renamed from: b */
    public final float m26297b() {
        return this.f13652b;
    }

    /* renamed from: c */
    public final float m26296c() {
        return this.f13653c;
    }

    /* renamed from: d */
    public final float m26295d() {
        return this.f13654d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4914f) {
            C4914f c4914f = (C4914f) obj;
            if (this.f13651a == c4914f.f13651a) {
                if (this.f13652b == c4914f.f13652b) {
                    if (this.f13653c == c4914f.f13653c) {
                        return (this.f13654d > c4914f.f13654d ? 1 : (this.f13654d == c4914f.f13654d ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f13651a) * 31) + Float.hashCode(this.f13652b)) * 31) + Float.hashCode(this.f13653c)) * 31) + Float.hashCode(this.f13654d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f13651a + ", focusedAlpha=" + this.f13652b + ", hoveredAlpha=" + this.f13653c + ", pressedAlpha=" + this.f13654d + ')';
    }
}
