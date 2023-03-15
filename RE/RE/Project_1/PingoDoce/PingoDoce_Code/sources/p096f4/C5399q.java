package p096f4;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.C1107b;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p116g4.AbstractC5604c;
import p130h4.C5851g;
import p130h4.C5852h;
import p152i4.C6013a;
import p301q.C9559h;

/* renamed from: f4.q */
/* loaded from: classes.dex */
class C5399q {

    /* renamed from: b */
    private static C9559h<WeakReference<Interpolator>> f14855b;

    /* renamed from: a */
    private static final Interpolator f14854a = new LinearInterpolator();

    /* renamed from: c */
    static AbstractC5604c.C5605a f14856c = AbstractC5604c.C5605a.m23609a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    static AbstractC5604c.C5605a f14857d = AbstractC5604c.C5605a.m23609a("x", "y");

    C5399q() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m24417a(int i) {
        WeakReference<Interpolator> m10604f;
        synchronized (C5399q.class) {
            m10604f = m24411g().m10604f(i);
        }
        return m10604f;
    }

    /* renamed from: b */
    private static Interpolator m24416b(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = C5851g.m22901c(pointF.x, -1.0f, 1.0f);
        pointF.y = C5851g.m22901c(pointF.y, -100.0f, 100.0f);
        pointF2.x = C5851g.m22901c(pointF2.x, -1.0f, 1.0f);
        float m22901c = C5851g.m22901c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = m22901c;
        int m22882i = C5852h.m22882i(pointF.x, pointF.y, pointF2.x, m22901c);
        WeakReference<Interpolator> m24417a = m24417a(m22882i);
        Interpolator interpolator = m24417a != null ? m24417a.get() : null;
        if (m24417a == null || interpolator == null) {
            try {
                linearInterpolator = C1107b.m38491a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = C1107b.m38491a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                m24410h(m22882i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> C6013a<T> m24415c(AbstractC5604c abstractC5604c, C2201d c2201d, float f, InterfaceC5391j0<T> interfaceC5391j0, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return m24413e(c2201d, abstractC5604c, f, interfaceC5391j0);
        }
        if (z) {
            return m24414d(c2201d, abstractC5604c, f, interfaceC5391j0);
        }
        return m24412f(abstractC5604c, f, interfaceC5391j0);
    }

    /* renamed from: d */
    private static <T> C6013a<T> m24414d(C2201d c2201d, AbstractC5604c abstractC5604c, float f, InterfaceC5391j0<T> interfaceC5391j0) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        abstractC5604c.mo23591e();
        PointF pointF = null;
        boolean z = false;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        PointF pointF4 = null;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14856c)) {
                case 0:
                    f2 = (float) abstractC5604c.mo23603F();
                    break;
                case 1:
                    t3 = interfaceC5391j0.mo24395a(abstractC5604c, f);
                    break;
                case 2:
                    t2 = interfaceC5391j0.mo24395a(abstractC5604c, f);
                    break;
                case 3:
                    pointF = C5397p.m24420e(abstractC5604c, 1.0f);
                    break;
                case 4:
                    pointF4 = C5397p.m24420e(abstractC5604c, 1.0f);
                    break;
                case 5:
                    if (abstractC5604c.mo23600H() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF2 = C5397p.m24420e(abstractC5604c, f);
                    break;
                case 7:
                    pointF3 = C5397p.m24420e(abstractC5604c, f);
                    break;
                default:
                    abstractC5604c.mo23593b0();
                    break;
            }
        }
        abstractC5604c.mo23584t();
        if (z) {
            interpolator2 = f14854a;
            t = t3;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = m24416b(pointF, pointF4);
            } else {
                interpolator = f14854a;
            }
            interpolator2 = interpolator;
            t = t2;
        }
        C6013a<T> c6013a = new C6013a<>(c2201d, t3, t, interpolator2, f2, null);
        c6013a.f16616o = pointF2;
        c6013a.f16617p = pointF3;
        return c6013a;
    }

    /* renamed from: e */
    private static <T> C6013a<T> m24413e(C2201d c2201d, AbstractC5604c abstractC5604c, float f, InterfaceC5391j0<T> interfaceC5391j0) throws IOException {
        Interpolator interpolator;
        Interpolator m24416b;
        Interpolator m24416b2;
        T t;
        PointF pointF;
        C6013a<T> c6013a;
        PointF pointF2;
        float f2;
        PointF pointF3;
        abstractC5604c.mo23591e();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f3 = 0.0f;
        PointF pointF11 = null;
        T t3 = null;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14856c)) {
                case 0:
                    pointF2 = pointF4;
                    f3 = (float) abstractC5604c.mo23603F();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t2 = interfaceC5391j0.mo24395a(abstractC5604c, f);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t3 = interfaceC5391j0.mo24395a(abstractC5604c, f);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f3;
                    PointF pointF12 = pointF11;
                    if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_OBJECT) {
                        abstractC5604c.mo23591e();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (abstractC5604c.mo23580y()) {
                            int mo23595X = abstractC5604c.mo23595X(f14857d);
                            if (mo23595X == 0) {
                                AbstractC5604c.EnumC5606b mo23596R = abstractC5604c.mo23596R();
                                AbstractC5604c.EnumC5606b enumC5606b = AbstractC5604c.EnumC5606b.NUMBER;
                                if (mo23596R == enumC5606b) {
                                    f6 = (float) abstractC5604c.mo23603F();
                                    f4 = f6;
                                } else {
                                    abstractC5604c.mo23592c();
                                    f4 = (float) abstractC5604c.mo23603F();
                                    f6 = abstractC5604c.mo23596R() == enumC5606b ? (float) abstractC5604c.mo23603F() : f4;
                                    abstractC5604c.mo23589h();
                                }
                            } else if (mo23595X != 1) {
                                abstractC5604c.mo23593b0();
                            } else {
                                AbstractC5604c.EnumC5606b mo23596R2 = abstractC5604c.mo23596R();
                                AbstractC5604c.EnumC5606b enumC5606b2 = AbstractC5604c.EnumC5606b.NUMBER;
                                if (mo23596R2 == enumC5606b2) {
                                    f7 = (float) abstractC5604c.mo23603F();
                                    f5 = f7;
                                } else {
                                    abstractC5604c.mo23592c();
                                    f5 = (float) abstractC5604c.mo23603F();
                                    f7 = abstractC5604c.mo23596R() == enumC5606b2 ? (float) abstractC5604c.mo23603F() : f5;
                                    abstractC5604c.mo23589h();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f4, f5);
                        PointF pointF14 = new PointF(f6, f7);
                        abstractC5604c.mo23584t();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f3 = f2;
                        break;
                    } else {
                        pointF5 = C5397p.m24420e(abstractC5604c, f);
                        f3 = f2;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_OBJECT) {
                        abstractC5604c.mo23591e();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (abstractC5604c.mo23580y()) {
                            PointF pointF15 = pointF11;
                            int mo23595X2 = abstractC5604c.mo23595X(f14857d);
                            if (mo23595X2 != 0) {
                                pointF3 = pointF4;
                                if (mo23595X2 != 1) {
                                    abstractC5604c.mo23593b0();
                                } else {
                                    AbstractC5604c.EnumC5606b mo23596R3 = abstractC5604c.mo23596R();
                                    AbstractC5604c.EnumC5606b enumC5606b3 = AbstractC5604c.EnumC5606b.NUMBER;
                                    if (mo23596R3 == enumC5606b3) {
                                        f11 = (float) abstractC5604c.mo23603F();
                                        f3 = f3;
                                        f9 = f11;
                                    } else {
                                        float f12 = f3;
                                        abstractC5604c.mo23592c();
                                        float mo23603F = (float) abstractC5604c.mo23603F();
                                        float mo23603F2 = abstractC5604c.mo23596R() == enumC5606b3 ? (float) abstractC5604c.mo23603F() : mo23603F;
                                        abstractC5604c.mo23589h();
                                        f3 = f12;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f11 = mo23603F2;
                                        f9 = mo23603F;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f13 = f3;
                                AbstractC5604c.EnumC5606b mo23596R4 = abstractC5604c.mo23596R();
                                AbstractC5604c.EnumC5606b enumC5606b4 = AbstractC5604c.EnumC5606b.NUMBER;
                                if (mo23596R4 == enumC5606b4) {
                                    f10 = (float) abstractC5604c.mo23603F();
                                    f3 = f13;
                                    f8 = f10;
                                } else {
                                    abstractC5604c.mo23592c();
                                    f8 = (float) abstractC5604c.mo23603F();
                                    f10 = abstractC5604c.mo23596R() == enumC5606b4 ? (float) abstractC5604c.mo23603F() : f8;
                                    abstractC5604c.mo23589h();
                                    f3 = f13;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f3;
                        PointF pointF16 = new PointF(f8, f9);
                        PointF pointF17 = new PointF(f10, f11);
                        abstractC5604c.mo23584t();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f3 = f2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = C5397p.m24420e(abstractC5604c, f);
                        break;
                    }
                case 5:
                    if (abstractC5604c.mo23600H() == 1) {
                        z = true;
                    } else {
                        z = false;
                        continue;
                    }
                case 6:
                    pointF11 = C5397p.m24420e(abstractC5604c, f);
                    continue;
                case 7:
                    pointF4 = C5397p.m24420e(abstractC5604c, f);
                    continue;
                default:
                    pointF2 = pointF4;
                    abstractC5604c.mo23593b0();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f14 = f3;
        PointF pointF19 = pointF11;
        abstractC5604c.mo23584t();
        if (z) {
            interpolator = f14854a;
            t = t2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = m24416b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                m24416b = m24416b(pointF7, pointF9);
                m24416b2 = m24416b(pointF8, pointF10);
                t = t3;
                interpolator = null;
                if (m24416b == null && m24416b2 != null) {
                    pointF = pointF19;
                    c6013a = new C6013a<>(c2201d, t2, t, m24416b, m24416b2, f14, null);
                } else {
                    pointF = pointF19;
                    c6013a = new C6013a<>(c2201d, t2, t, interpolator, f14, null);
                }
                c6013a.f16616o = pointF;
                c6013a.f16617p = pointF18;
                return c6013a;
            } else {
                interpolator = f14854a;
            }
            t = t3;
        }
        m24416b = null;
        m24416b2 = null;
        if (m24416b == null) {
        }
        pointF = pointF19;
        c6013a = new C6013a<>(c2201d, t2, t, interpolator, f14, null);
        c6013a.f16616o = pointF;
        c6013a.f16617p = pointF18;
        return c6013a;
    }

    /* renamed from: f */
    private static <T> C6013a<T> m24412f(AbstractC5604c abstractC5604c, float f, InterfaceC5391j0<T> interfaceC5391j0) throws IOException {
        return new C6013a<>(interfaceC5391j0.mo24395a(abstractC5604c, f));
    }

    /* renamed from: g */
    private static C9559h<WeakReference<Interpolator>> m24411g() {
        if (f14855b == null) {
            f14855b = new C9559h<>();
        }
        return f14855b;
    }

    /* renamed from: h */
    private static void m24410h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C5399q.class) {
            f14855b.m10599l(i, weakReference);
        }
    }
}
