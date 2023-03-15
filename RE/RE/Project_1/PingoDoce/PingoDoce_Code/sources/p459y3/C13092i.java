package p459y3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p152i4.C6013a;
import p152i4.C6015c;

/* renamed from: y3.i */
/* loaded from: classes.dex */
public class C13092i extends AbstractC13089f<PointF> {

    /* renamed from: i */
    private final PointF f34027i;

    /* renamed from: j */
    private final float[] f34028j;

    /* renamed from: k */
    private final PathMeasure f34029k;

    /* renamed from: l */
    private C13091h f34030l;

    public C13092i(List<? extends C6013a<PointF>> list) {
        super(list);
        this.f34027i = new PointF();
        this.f34028j = new float[2];
        this.f34029k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p459y3.AbstractC13078a
    /* renamed from: p */
    public PointF mo1633i(C6013a<PointF> c6013a, float f) {
        PointF pointF;
        C13091h c13091h = (C13091h) c6013a;
        Path m1657j = c13091h.m1657j();
        if (m1657j == null) {
            return c6013a.f16603b;
        }
        C6015c<A> c6015c = this.f34011e;
        if (c6015c == 0 || (pointF = (PointF) c6015c.m22355b(c13091h.f16608g, c13091h.f16609h.floatValue(), c13091h.f16603b, c13091h.f16604c, m1684e(), f, m1683f())) == null) {
            if (this.f34030l != c13091h) {
                this.f34029k.setPath(m1657j, false);
                this.f34030l = c13091h;
            }
            PathMeasure pathMeasure = this.f34029k;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f34028j, null);
            PointF pointF2 = this.f34027i;
            float[] fArr = this.f34028j;
            pointF2.set(fArr[0], fArr[1]);
            return this.f34027i;
        }
        return pointF;
    }
}
