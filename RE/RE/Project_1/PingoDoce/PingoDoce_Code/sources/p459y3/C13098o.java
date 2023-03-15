package p459y3;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.InterfaceC2230k;
import java.util.Collections;
import p026b4.C1808l;
import p055d4.AbstractC4724a;
import p152i4.C6013a;
import p152i4.C6015c;
import p152i4.C6016d;
import p459y3.AbstractC13078a;

/* renamed from: y3.o */
/* loaded from: classes.dex */
public class C13098o {

    /* renamed from: a */
    private final Matrix f34041a = new Matrix();

    /* renamed from: b */
    private final Matrix f34042b;

    /* renamed from: c */
    private final Matrix f34043c;

    /* renamed from: d */
    private final Matrix f34044d;

    /* renamed from: e */
    private final float[] f34045e;

    /* renamed from: f */
    private AbstractC13078a<PointF, PointF> f34046f;

    /* renamed from: g */
    private AbstractC13078a<?, PointF> f34047g;

    /* renamed from: h */
    private AbstractC13078a<C6016d, C6016d> f34048h;

    /* renamed from: i */
    private AbstractC13078a<Float, Float> f34049i;

    /* renamed from: j */
    private AbstractC13078a<Integer, Integer> f34050j;

    /* renamed from: k */
    private C13086c f34051k;

    /* renamed from: l */
    private C13086c f34052l;

    /* renamed from: m */
    private AbstractC13078a<?, Float> f34053m;

    /* renamed from: n */
    private AbstractC13078a<?, Float> f34054n;

    public C13098o(C1808l c1808l) {
        this.f34046f = c1808l.m35338c() == null ? null : c1808l.m35338c().mo35329a();
        this.f34047g = c1808l.m35335f() == null ? null : c1808l.m35335f().mo35329a();
        this.f34048h = c1808l.m35333h() == null ? null : c1808l.m35333h().mo35329a();
        this.f34049i = c1808l.m35334g() == null ? null : c1808l.m35334g().mo35329a();
        C13086c c13086c = c1808l.m35332i() == null ? null : (C13086c) c1808l.m35332i().mo35329a();
        this.f34051k = c13086c;
        if (c13086c != null) {
            this.f34042b = new Matrix();
            this.f34043c = new Matrix();
            this.f34044d = new Matrix();
            this.f34045e = new float[9];
        } else {
            this.f34042b = null;
            this.f34043c = null;
            this.f34044d = null;
            this.f34045e = null;
        }
        this.f34052l = c1808l.m35331j() == null ? null : (C13086c) c1808l.m35331j().mo35329a();
        if (c1808l.m35336e() != null) {
            this.f34050j = c1808l.m35336e().mo35329a();
        }
        if (c1808l.m35330k() != null) {
            this.f34053m = c1808l.m35330k().mo35329a();
        } else {
            this.f34053m = null;
        }
        if (c1808l.m35337d() != null) {
            this.f34054n = c1808l.m35337d().mo35329a();
        } else {
            this.f34054n = null;
        }
    }

    /* renamed from: d */
    private void m1642d() {
        for (int i = 0; i < 9; i++) {
            this.f34045e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void m1645a(AbstractC4724a abstractC4724a) {
        abstractC4724a.m26783k(this.f34050j);
        abstractC4724a.m26783k(this.f34053m);
        abstractC4724a.m26783k(this.f34054n);
        abstractC4724a.m26783k(this.f34046f);
        abstractC4724a.m26783k(this.f34047g);
        abstractC4724a.m26783k(this.f34048h);
        abstractC4724a.m26783k(this.f34049i);
        abstractC4724a.m26783k(this.f34051k);
        abstractC4724a.m26783k(this.f34052l);
    }

    /* renamed from: b */
    public void m1644b(AbstractC13078a.InterfaceC13080b interfaceC13080b) {
        AbstractC13078a<Integer, Integer> abstractC13078a = this.f34050j;
        if (abstractC13078a != null) {
            abstractC13078a.m1687a(interfaceC13080b);
        }
        AbstractC13078a<?, Float> abstractC13078a2 = this.f34053m;
        if (abstractC13078a2 != null) {
            abstractC13078a2.m1687a(interfaceC13080b);
        }
        AbstractC13078a<?, Float> abstractC13078a3 = this.f34054n;
        if (abstractC13078a3 != null) {
            abstractC13078a3.m1687a(interfaceC13080b);
        }
        AbstractC13078a<PointF, PointF> abstractC13078a4 = this.f34046f;
        if (abstractC13078a4 != null) {
            abstractC13078a4.m1687a(interfaceC13080b);
        }
        AbstractC13078a<?, PointF> abstractC13078a5 = this.f34047g;
        if (abstractC13078a5 != null) {
            abstractC13078a5.m1687a(interfaceC13080b);
        }
        AbstractC13078a<C6016d, C6016d> abstractC13078a6 = this.f34048h;
        if (abstractC13078a6 != null) {
            abstractC13078a6.m1687a(interfaceC13080b);
        }
        AbstractC13078a<Float, Float> abstractC13078a7 = this.f34049i;
        if (abstractC13078a7 != null) {
            abstractC13078a7.m1687a(interfaceC13080b);
        }
        C13086c c13086c = this.f34051k;
        if (c13086c != null) {
            c13086c.m1687a(interfaceC13080b);
        }
        C13086c c13086c2 = this.f34052l;
        if (c13086c2 != null) {
            c13086c2.m1687a(interfaceC13080b);
        }
    }

    /* renamed from: c */
    public <T> boolean m1643c(T t, C6015c<T> c6015c) {
        C13086c c13086c;
        C13086c c13086c2;
        AbstractC13078a<?, Float> abstractC13078a;
        AbstractC13078a<?, Float> abstractC13078a2;
        if (t == InterfaceC2230k.f6465e) {
            AbstractC13078a<PointF, PointF> abstractC13078a3 = this.f34046f;
            if (abstractC13078a3 == null) {
                this.f34046f = new C13099p(c6015c, new PointF());
                return true;
            }
            abstractC13078a3.m1680n(c6015c);
            return true;
        } else if (t == InterfaceC2230k.f6466f) {
            AbstractC13078a<?, PointF> abstractC13078a4 = this.f34047g;
            if (abstractC13078a4 == null) {
                this.f34047g = new C13099p(c6015c, new PointF());
                return true;
            }
            abstractC13078a4.m1680n(c6015c);
            return true;
        } else {
            if (t == InterfaceC2230k.f6467g) {
                AbstractC13078a<?, PointF> abstractC13078a5 = this.f34047g;
                if (abstractC13078a5 instanceof C13096m) {
                    ((C13096m) abstractC13078a5).m1648r(c6015c);
                    return true;
                }
            }
            if (t == InterfaceC2230k.f6468h) {
                AbstractC13078a<?, PointF> abstractC13078a6 = this.f34047g;
                if (abstractC13078a6 instanceof C13096m) {
                    ((C13096m) abstractC13078a6).m1647s(c6015c);
                    return true;
                }
            }
            if (t == InterfaceC2230k.f6473m) {
                AbstractC13078a<C6016d, C6016d> abstractC13078a7 = this.f34048h;
                if (abstractC13078a7 == null) {
                    this.f34048h = new C13099p(c6015c, new C6016d());
                    return true;
                }
                abstractC13078a7.m1680n(c6015c);
                return true;
            } else if (t == InterfaceC2230k.f6474n) {
                AbstractC13078a<Float, Float> abstractC13078a8 = this.f34049i;
                if (abstractC13078a8 == null) {
                    this.f34049i = new C13099p(c6015c, Float.valueOf(0.0f));
                    return true;
                }
                abstractC13078a8.m1680n(c6015c);
                return true;
            } else if (t == InterfaceC2230k.f6463c) {
                AbstractC13078a<Integer, Integer> abstractC13078a9 = this.f34050j;
                if (abstractC13078a9 == null) {
                    this.f34050j = new C13099p(c6015c, 100);
                    return true;
                }
                abstractC13078a9.m1680n(c6015c);
                return true;
            } else if (t == InterfaceC2230k.f6453A && (abstractC13078a2 = this.f34053m) != null) {
                if (abstractC13078a2 == null) {
                    this.f34053m = new C13099p(c6015c, 100);
                    return true;
                }
                abstractC13078a2.m1680n(c6015c);
                return true;
            } else if (t == InterfaceC2230k.f6454B && (abstractC13078a = this.f34054n) != null) {
                if (abstractC13078a == null) {
                    this.f34054n = new C13099p(c6015c, 100);
                    return true;
                }
                abstractC13078a.m1680n(c6015c);
                return true;
            } else if (t == InterfaceC2230k.f6475o && (c13086c2 = this.f34051k) != null) {
                if (c13086c2 == null) {
                    this.f34051k = new C13086c(Collections.singletonList(new C6013a(Float.valueOf(0.0f))));
                }
                this.f34051k.m1680n(c6015c);
                return true;
            } else if (t != InterfaceC2230k.f6476p || (c13086c = this.f34052l) == null) {
                return false;
            } else {
                if (c13086c == null) {
                    this.f34052l = new C13086c(Collections.singletonList(new C6013a(Float.valueOf(0.0f))));
                }
                this.f34052l.m1680n(c6015c);
                return true;
            }
        }
    }

    /* renamed from: e */
    public AbstractC13078a<?, Float> m1641e() {
        return this.f34054n;
    }

    /* renamed from: f */
    public Matrix m1640f() {
        float m1668p;
        this.f34041a.reset();
        AbstractC13078a<?, PointF> abstractC13078a = this.f34047g;
        if (abstractC13078a != null) {
            PointF mo1634h = abstractC13078a.mo1634h();
            float f = mo1634h.x;
            if (f != 0.0f || mo1634h.y != 0.0f) {
                this.f34041a.preTranslate(f, mo1634h.y);
            }
        }
        AbstractC13078a<Float, Float> abstractC13078a2 = this.f34049i;
        if (abstractC13078a2 != null) {
            if (abstractC13078a2 instanceof C13099p) {
                m1668p = abstractC13078a2.mo1634h().floatValue();
            } else {
                m1668p = ((C13086c) abstractC13078a2).m1668p();
            }
            if (m1668p != 0.0f) {
                this.f34041a.preRotate(m1668p);
            }
        }
        if (this.f34051k != null) {
            C13086c c13086c = this.f34052l;
            float cos = c13086c == null ? 0.0f : (float) Math.cos(Math.toRadians((-c13086c.m1668p()) + 90.0f));
            C13086c c13086c2 = this.f34052l;
            float sin = c13086c2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c13086c2.m1668p()) + 90.0f));
            m1642d();
            float[] fArr = this.f34045e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f34042b.setValues(fArr);
            m1642d();
            float[] fArr2 = this.f34045e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians(this.f34051k.m1668p()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f34043c.setValues(fArr2);
            m1642d();
            float[] fArr3 = this.f34045e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f34044d.setValues(fArr3);
            this.f34043c.preConcat(this.f34042b);
            this.f34044d.preConcat(this.f34043c);
            this.f34041a.preConcat(this.f34044d);
        }
        AbstractC13078a<C6016d, C6016d> abstractC13078a3 = this.f34048h;
        if (abstractC13078a3 != null) {
            C6016d mo1634h2 = abstractC13078a3.mo1634h();
            if (mo1634h2.m22352b() != 1.0f || mo1634h2.m22351c() != 1.0f) {
                this.f34041a.preScale(mo1634h2.m22352b(), mo1634h2.m22351c());
            }
        }
        AbstractC13078a<PointF, PointF> abstractC13078a4 = this.f34046f;
        if (abstractC13078a4 != null) {
            PointF mo1634h3 = abstractC13078a4.mo1634h();
            float f3 = mo1634h3.x;
            if (f3 != 0.0f || mo1634h3.y != 0.0f) {
                this.f34041a.preTranslate(-f3, -mo1634h3.y);
            }
        }
        return this.f34041a;
    }

    /* renamed from: g */
    public Matrix m1639g(float f) {
        AbstractC13078a<?, PointF> abstractC13078a = this.f34047g;
        PointF mo1634h = abstractC13078a == null ? null : abstractC13078a.mo1634h();
        AbstractC13078a<C6016d, C6016d> abstractC13078a2 = this.f34048h;
        C6016d mo1634h2 = abstractC13078a2 == null ? null : abstractC13078a2.mo1634h();
        this.f34041a.reset();
        if (mo1634h != null) {
            this.f34041a.preTranslate(mo1634h.x * f, mo1634h.y * f);
        }
        if (mo1634h2 != null) {
            double d = f;
            this.f34041a.preScale((float) Math.pow(mo1634h2.m22352b(), d), (float) Math.pow(mo1634h2.m22351c(), d));
        }
        AbstractC13078a<Float, Float> abstractC13078a3 = this.f34049i;
        if (abstractC13078a3 != null) {
            float floatValue = abstractC13078a3.mo1634h().floatValue();
            AbstractC13078a<PointF, PointF> abstractC13078a4 = this.f34046f;
            PointF mo1634h3 = abstractC13078a4 != null ? abstractC13078a4.mo1634h() : null;
            this.f34041a.preRotate(floatValue * f, mo1634h3 == null ? 0.0f : mo1634h3.x, mo1634h3 != null ? mo1634h3.y : 0.0f);
        }
        return this.f34041a;
    }

    /* renamed from: h */
    public AbstractC13078a<?, Integer> m1638h() {
        return this.f34050j;
    }

    /* renamed from: i */
    public AbstractC13078a<?, Float> m1637i() {
        return this.f34053m;
    }

    /* renamed from: j */
    public void m1636j(float f) {
        AbstractC13078a<Integer, Integer> abstractC13078a = this.f34050j;
        if (abstractC13078a != null) {
            abstractC13078a.mo1631m(f);
        }
        AbstractC13078a<?, Float> abstractC13078a2 = this.f34053m;
        if (abstractC13078a2 != null) {
            abstractC13078a2.mo1631m(f);
        }
        AbstractC13078a<?, Float> abstractC13078a3 = this.f34054n;
        if (abstractC13078a3 != null) {
            abstractC13078a3.mo1631m(f);
        }
        AbstractC13078a<PointF, PointF> abstractC13078a4 = this.f34046f;
        if (abstractC13078a4 != null) {
            abstractC13078a4.mo1631m(f);
        }
        AbstractC13078a<?, PointF> abstractC13078a5 = this.f34047g;
        if (abstractC13078a5 != null) {
            abstractC13078a5.mo1631m(f);
        }
        AbstractC13078a<C6016d, C6016d> abstractC13078a6 = this.f34048h;
        if (abstractC13078a6 != null) {
            abstractC13078a6.mo1631m(f);
        }
        AbstractC13078a<Float, Float> abstractC13078a7 = this.f34049i;
        if (abstractC13078a7 != null) {
            abstractC13078a7.mo1631m(f);
        }
        C13086c c13086c = this.f34051k;
        if (c13086c != null) {
            c13086c.mo1631m(f);
        }
        C13086c c13086c2 = this.f34052l;
        if (c13086c2 != null) {
            c13086c2.mo1631m(f);
        }
    }
}
