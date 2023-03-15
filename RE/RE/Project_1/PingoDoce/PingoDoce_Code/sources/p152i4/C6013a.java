package p152i4;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C2201d;

/* renamed from: i4.a */
/* loaded from: classes.dex */
public class C6013a<T> {

    /* renamed from: a */
    private final C2201d f16602a;

    /* renamed from: b */
    public final T f16603b;

    /* renamed from: c */
    public T f16604c;

    /* renamed from: d */
    public final Interpolator f16605d;

    /* renamed from: e */
    public final Interpolator f16606e;

    /* renamed from: f */
    public final Interpolator f16607f;

    /* renamed from: g */
    public final float f16608g;

    /* renamed from: h */
    public Float f16609h;

    /* renamed from: i */
    private float f16610i;

    /* renamed from: j */
    private float f16611j;

    /* renamed from: k */
    private int f16612k;

    /* renamed from: l */
    private int f16613l;

    /* renamed from: m */
    private float f16614m;

    /* renamed from: n */
    private float f16615n;

    /* renamed from: o */
    public PointF f16616o;

    /* renamed from: p */
    public PointF f16617p;

    public C6013a(C2201d c2201d, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f16610i = -3987645.8f;
        this.f16611j = -3987645.8f;
        this.f16612k = 784923401;
        this.f16613l = 784923401;
        this.f16614m = Float.MIN_VALUE;
        this.f16615n = Float.MIN_VALUE;
        this.f16616o = null;
        this.f16617p = null;
        this.f16602a = c2201d;
        this.f16603b = t;
        this.f16604c = t2;
        this.f16605d = interpolator;
        this.f16606e = null;
        this.f16607f = null;
        this.f16608g = f;
        this.f16609h = f2;
    }

    /* renamed from: a */
    public boolean m22365a(float f) {
        return f >= m22361e() && f < m22364b();
    }

    /* renamed from: b */
    public float m22364b() {
        if (this.f16602a == null) {
            return 1.0f;
        }
        if (this.f16615n == Float.MIN_VALUE) {
            if (this.f16609h == null) {
                this.f16615n = 1.0f;
            } else {
                this.f16615n = m22361e() + ((this.f16609h.floatValue() - this.f16608g) / this.f16602a.m34427e());
            }
        }
        return this.f16615n;
    }

    /* renamed from: c */
    public float m22363c() {
        if (this.f16611j == -3987645.8f) {
            this.f16611j = ((Float) this.f16604c).floatValue();
        }
        return this.f16611j;
    }

    /* renamed from: d */
    public int m22362d() {
        if (this.f16613l == 784923401) {
            this.f16613l = ((Integer) this.f16604c).intValue();
        }
        return this.f16613l;
    }

    /* renamed from: e */
    public float m22361e() {
        C2201d c2201d = this.f16602a;
        if (c2201d == null) {
            return 0.0f;
        }
        if (this.f16614m == Float.MIN_VALUE) {
            this.f16614m = (this.f16608g - c2201d.m34416p()) / this.f16602a.m34427e();
        }
        return this.f16614m;
    }

    /* renamed from: f */
    public float m22360f() {
        if (this.f16610i == -3987645.8f) {
            this.f16610i = ((Float) this.f16603b).floatValue();
        }
        return this.f16610i;
    }

    /* renamed from: g */
    public int m22359g() {
        if (this.f16612k == 784923401) {
            this.f16612k = ((Integer) this.f16603b).intValue();
        }
        return this.f16612k;
    }

    /* renamed from: h */
    public boolean m22358h() {
        return this.f16605d == null && this.f16606e == null && this.f16607f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f16603b + ", endValue=" + this.f16604c + ", startFrame=" + this.f16608g + ", endFrame=" + this.f16609h + ", interpolator=" + this.f16605d + '}';
    }

    public C6013a(C2201d c2201d, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f16610i = -3987645.8f;
        this.f16611j = -3987645.8f;
        this.f16612k = 784923401;
        this.f16613l = 784923401;
        this.f16614m = Float.MIN_VALUE;
        this.f16615n = Float.MIN_VALUE;
        this.f16616o = null;
        this.f16617p = null;
        this.f16602a = c2201d;
        this.f16603b = t;
        this.f16604c = t2;
        this.f16605d = null;
        this.f16606e = interpolator;
        this.f16607f = interpolator2;
        this.f16608g = f;
        this.f16609h = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C6013a(C2201d c2201d, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f16610i = -3987645.8f;
        this.f16611j = -3987645.8f;
        this.f16612k = 784923401;
        this.f16613l = 784923401;
        this.f16614m = Float.MIN_VALUE;
        this.f16615n = Float.MIN_VALUE;
        this.f16616o = null;
        this.f16617p = null;
        this.f16602a = c2201d;
        this.f16603b = t;
        this.f16604c = t2;
        this.f16605d = interpolator;
        this.f16606e = interpolator2;
        this.f16607f = interpolator3;
        this.f16608g = f;
        this.f16609h = f2;
    }

    public C6013a(T t) {
        this.f16610i = -3987645.8f;
        this.f16611j = -3987645.8f;
        this.f16612k = 784923401;
        this.f16613l = 784923401;
        this.f16614m = Float.MIN_VALUE;
        this.f16615n = Float.MIN_VALUE;
        this.f16616o = null;
        this.f16617p = null;
        this.f16602a = null;
        this.f16603b = t;
        this.f16604c = t;
        this.f16605d = null;
        this.f16606e = null;
        this.f16607f = null;
        this.f16608g = Float.MIN_VALUE;
        this.f16609h = Float.valueOf(Float.MAX_VALUE);
    }
}
