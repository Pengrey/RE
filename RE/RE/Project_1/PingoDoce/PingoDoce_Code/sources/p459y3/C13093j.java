package p459y3;

import android.graphics.PointF;
import java.util.List;
import p152i4.C6013a;
import p152i4.C6015c;

/* renamed from: y3.j */
/* loaded from: classes.dex */
public class C13093j extends AbstractC13089f<PointF> {

    /* renamed from: i */
    private final PointF f34031i;

    public C13093j(List<C6013a<PointF>> list) {
        super(list);
        this.f34031i = new PointF();
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: p */
    public PointF mo1633i(C6013a<PointF> c6013a, float f) {
        return mo1655j(c6013a, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p459y3.AbstractC13078a
    /* renamed from: q */
    public PointF mo1655j(C6013a<PointF> c6013a, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c6013a.f16603b;
        if (pointF3 != null && (pointF = c6013a.f16604c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            C6015c<A> c6015c = this.f34011e;
            if (c6015c == 0 || (pointF2 = (PointF) c6015c.m22355b(c6013a.f16608g, c6013a.f16609h.floatValue(), pointF4, pointF5, f, m1684e(), m1683f())) == null) {
                PointF pointF6 = this.f34031i;
                float f4 = pointF4.x;
                float f5 = f4 + (f2 * (pointF5.x - f4));
                float f6 = pointF4.y;
                pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
                return this.f34031i;
            }
            return pointF2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
