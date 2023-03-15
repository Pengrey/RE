package p152i4;

/* renamed from: i4.d */
/* loaded from: classes.dex */
public class C6016d {

    /* renamed from: a */
    private float f16622a;

    /* renamed from: b */
    private float f16623b;

    public C6016d(float f, float f2) {
        this.f16622a = f;
        this.f16623b = f2;
    }

    /* renamed from: a */
    public boolean m22353a(float f, float f2) {
        return this.f16622a == f && this.f16623b == f2;
    }

    /* renamed from: b */
    public float m22352b() {
        return this.f16622a;
    }

    /* renamed from: c */
    public float m22351c() {
        return this.f16623b;
    }

    /* renamed from: d */
    public void m22350d(float f, float f2) {
        this.f16622a = f;
        this.f16623b = f2;
    }

    public String toString() {
        return m22352b() + "x" + m22351c();
    }

    public C6016d() {
        this(1.0f, 1.0f);
    }
}
