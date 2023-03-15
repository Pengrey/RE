package p040c4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0013a;
import p130h4.C5848d;
import p130h4.C5851g;

/* renamed from: c4.l */
/* loaded from: classes.dex */
public class C2078l {

    /* renamed from: a */
    private final List<C0013a> f6034a;

    /* renamed from: b */
    private PointF f6035b;

    /* renamed from: c */
    private boolean f6036c;

    public C2078l(PointF pointF, boolean z, List<C0013a> list) {
        this.f6035b = pointF;
        this.f6036c = z;
        this.f6034a = new ArrayList(list);
    }

    /* renamed from: e */
    private void m34732e(float f, float f2) {
        if (this.f6035b == null) {
            this.f6035b = new PointF();
        }
        this.f6035b.set(f, f2);
    }

    /* renamed from: a */
    public List<C0013a> m34736a() {
        return this.f6034a;
    }

    /* renamed from: b */
    public PointF m34735b() {
        return this.f6035b;
    }

    /* renamed from: c */
    public void m34734c(C2078l c2078l, C2078l c2078l2, float f) {
        if (this.f6035b == null) {
            this.f6035b = new PointF();
        }
        this.f6036c = c2078l.m34733d() || c2078l2.m34733d();
        if (c2078l.m34736a().size() != c2078l2.m34736a().size()) {
            C5848d.m22929c("Curves must have the same number of control points. Shape 1: " + c2078l.m34736a().size() + "\tShape 2: " + c2078l2.m34736a().size());
        }
        int min = Math.min(c2078l.m34736a().size(), c2078l2.m34736a().size());
        if (this.f6034a.size() < min) {
            for (int size = this.f6034a.size(); size < min; size++) {
                this.f6034a.add(new C0013a());
            }
        } else if (this.f6034a.size() > min) {
            for (int size2 = this.f6034a.size() - 1; size2 >= min; size2--) {
                List<C0013a> list = this.f6034a;
                list.remove(list.size() - 1);
            }
        }
        PointF m34735b = c2078l.m34735b();
        PointF m34735b2 = c2078l2.m34735b();
        m34732e(C5851g.m22893k(m34735b.x, m34735b2.x, f), C5851g.m22893k(m34735b.y, m34735b2.y, f));
        for (int size3 = this.f6034a.size() - 1; size3 >= 0; size3--) {
            C0013a c0013a = c2078l.m34736a().get(size3);
            C0013a c0013a2 = c2078l2.m34736a().get(size3);
            PointF m42132a = c0013a.m42132a();
            PointF m42131b = c0013a.m42131b();
            PointF m42130c = c0013a.m42130c();
            PointF m42132a2 = c0013a2.m42132a();
            PointF m42131b2 = c0013a2.m42131b();
            PointF m42130c2 = c0013a2.m42130c();
            this.f6034a.get(size3).m42129d(C5851g.m22893k(m42132a.x, m42132a2.x, f), C5851g.m22893k(m42132a.y, m42132a2.y, f));
            this.f6034a.get(size3).m42128e(C5851g.m22893k(m42131b.x, m42131b2.x, f), C5851g.m22893k(m42131b.y, m42131b2.y, f));
            this.f6034a.get(size3).m42127f(C5851g.m22893k(m42130c.x, m42130c2.x, f), C5851g.m22893k(m42130c.y, m42130c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean m34733d() {
        return this.f6036c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f6034a.size() + "closed=" + this.f6036c + '}';
    }

    public C2078l() {
        this.f6034a = new ArrayList();
    }
}
