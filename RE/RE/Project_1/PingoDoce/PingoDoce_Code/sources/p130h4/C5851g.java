package p130h4;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p005a4.C0013a;
import p005a4.C0018e;
import p040c4.C2078l;
import p436x3.InterfaceC12272k;

/* renamed from: h4.g */
/* loaded from: classes.dex */
public class C5851g {

    /* renamed from: a */
    private static PointF f16269a = new PointF();

    /* renamed from: a */
    public static PointF m22903a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static double m22902b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /* renamed from: c */
    public static float m22901c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: d */
    public static int m22900d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: e */
    public static boolean m22899e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: f */
    private static int m22898f(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m22897g(float f, float f2) {
        return m22896h((int) f, (int) f2);
    }

    /* renamed from: h */
    private static int m22896h(int i, int i2) {
        return i - (i2 * m22898f(i, i2));
    }

    /* renamed from: i */
    public static void m22895i(C2078l c2078l, Path path) {
        path.reset();
        PointF m34735b = c2078l.m34735b();
        path.moveTo(m34735b.x, m34735b.y);
        f16269a.set(m34735b.x, m34735b.y);
        for (int i = 0; i < c2078l.m34736a().size(); i++) {
            C0013a c0013a = c2078l.m34736a().get(i);
            PointF m42132a = c0013a.m42132a();
            PointF m42131b = c0013a.m42131b();
            PointF m42130c = c0013a.m42130c();
            if (m42132a.equals(f16269a) && m42131b.equals(m42130c)) {
                path.lineTo(m42130c.x, m42130c.y);
            } else {
                path.cubicTo(m42132a.x, m42132a.y, m42131b.x, m42131b.y, m42130c.x, m42130c.y);
            }
            f16269a.set(m42130c.x, m42130c.y);
        }
        if (c2078l.m34733d()) {
            path.close();
        }
    }

    /* renamed from: j */
    public static double m22894j(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: k */
    public static float m22893k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static int m22892l(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: m */
    public static void m22891m(C0018e c0018e, int i, List<C0018e> list, C0018e c0018e2, InterfaceC12272k interfaceC12272k) {
        if (c0018e.m42117c(interfaceC12272k.mo3147a(), i)) {
            list.add(c0018e2.m42119a(interfaceC12272k.mo3147a()).m42111i(interfaceC12272k));
        }
    }
}
