package p459y3;

import android.graphics.PointF;
import java.util.Collections;
import p152i4.C6013a;
import p152i4.C6015c;

/* renamed from: y3.m */
/* loaded from: classes.dex */
public class C13096m extends AbstractC13078a<PointF, PointF> {

    /* renamed from: i */
    private final PointF f34035i;

    /* renamed from: j */
    private final PointF f34036j;

    /* renamed from: k */
    private final AbstractC13078a<Float, Float> f34037k;

    /* renamed from: l */
    private final AbstractC13078a<Float, Float> f34038l;

    /* renamed from: m */
    protected C6015c<Float> f34039m;

    /* renamed from: n */
    protected C6015c<Float> f34040n;

    public C13096m(AbstractC13078a<Float, Float> abstractC13078a, AbstractC13078a<Float, Float> abstractC13078a2) {
        super(Collections.emptyList());
        this.f34035i = new PointF();
        this.f34036j = new PointF();
        this.f34037k = abstractC13078a;
        this.f34038l = abstractC13078a2;
        mo1631m(m1683f());
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: m */
    public void mo1631m(float f) {
        this.f34037k.mo1631m(f);
        this.f34038l.mo1631m(f);
        this.f34035i.set(this.f34037k.mo1634h().floatValue(), this.f34038l.mo1634h().floatValue());
        for (int i = 0; i < this.f34007a.size(); i++) {
            this.f34007a.get(i).mo1678c();
        }
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: p */
    public PointF mo1634h() {
        return mo1633i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p459y3.AbstractC13078a
    /* renamed from: q */
    public PointF mo1633i(C6013a<PointF> c6013a, float f) {
        Float f2;
        C6013a<Float> m1686b;
        C6013a<Float> m1686b2;
        Float f3 = null;
        if (this.f34039m == null || (m1686b2 = this.f34037k.m1686b()) == null) {
            f2 = null;
        } else {
            float m1685d = this.f34037k.m1685d();
            Float f4 = m1686b2.f16609h;
            C6015c<Float> c6015c = this.f34039m;
            float f5 = m1686b2.f16608g;
            f2 = c6015c.m22355b(f5, f4 == null ? f5 : f4.floatValue(), m1686b2.f16603b, m1686b2.f16604c, f, f, m1685d);
        }
        if (this.f34040n != null && (m1686b = this.f34038l.m1686b()) != null) {
            float m1685d2 = this.f34038l.m1685d();
            Float f6 = m1686b.f16609h;
            C6015c<Float> c6015c2 = this.f34040n;
            float f7 = m1686b.f16608g;
            f3 = c6015c2.m22355b(f7, f6 == null ? f7 : f6.floatValue(), m1686b.f16603b, m1686b.f16604c, f, f, m1685d2);
        }
        if (f2 == null) {
            this.f34036j.set(this.f34035i.x, 0.0f);
        } else {
            this.f34036j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.f34036j;
            pointF.set(pointF.x, this.f34035i.y);
        } else {
            PointF pointF2 = this.f34036j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.f34036j;
    }

    /* renamed from: r */
    public void m1648r(C6015c<Float> c6015c) {
        C6015c<Float> c6015c2 = this.f34039m;
        if (c6015c2 != null) {
            c6015c2.m22354c(null);
        }
        this.f34039m = c6015c;
        if (c6015c != null) {
            c6015c.m22354c(this);
        }
    }

    /* renamed from: s */
    public void m1647s(C6015c<Float> c6015c) {
        C6015c<Float> c6015c2 = this.f34040n;
        if (c6015c2 != null) {
            c6015c2.m22354c(null);
        }
        this.f34040n = c6015c;
        if (c6015c != null) {
            c6015c.m22354c(this);
        }
    }
}
