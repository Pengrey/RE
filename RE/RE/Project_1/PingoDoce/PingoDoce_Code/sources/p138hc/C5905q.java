package p138hc;

/* renamed from: hc.q */
/* loaded from: classes2.dex */
public class C5905q implements Comparable<C5905q> {

    /* renamed from: w */
    public final int f16352w;

    /* renamed from: x */
    public final int f16353x;

    public C5905q(int i, int i2) {
        this.f16352w = i;
        this.f16353x = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C5905q c5905q) {
        int i = this.f16353x * this.f16352w;
        int i2 = c5905q.f16353x * c5905q.f16352w;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: c */
    public C5905q m22777c() {
        return new C5905q(this.f16353x, this.f16352w);
    }

    /* renamed from: d */
    public C5905q m22776d(C5905q c5905q) {
        int i = this.f16352w;
        int i2 = c5905q.f16353x;
        int i3 = i * i2;
        int i4 = c5905q.f16352w;
        int i5 = this.f16353x;
        if (i3 <= i4 * i5) {
            return new C5905q(i4, (i5 * i4) / i);
        }
        return new C5905q((i * i2) / i5, i2);
    }

    /* renamed from: e */
    public C5905q m22775e(C5905q c5905q) {
        int i = this.f16352w;
        int i2 = c5905q.f16353x;
        int i3 = i * i2;
        int i4 = c5905q.f16352w;
        int i5 = this.f16353x;
        if (i3 >= i4 * i5) {
            return new C5905q(i4, (i5 * i4) / i);
        }
        return new C5905q((i * i2) / i5, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5905q.class != obj.getClass()) {
            return false;
        }
        C5905q c5905q = (C5905q) obj;
        return this.f16352w == c5905q.f16352w && this.f16353x == c5905q.f16353x;
    }

    public int hashCode() {
        return (this.f16352w * 31) + this.f16353x;
    }

    public String toString() {
        return this.f16352w + "x" + this.f16353x;
    }
}
