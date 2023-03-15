package p459y3;

import java.util.List;
import p130h4.C5851g;
import p152i4.C6013a;
import p152i4.C6015c;

/* renamed from: y3.c */
/* loaded from: classes.dex */
public class C13086c extends AbstractC13089f<Float> {
    public C13086c(List<C6013a<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float m1668p() {
        return m1667q(m1686b(), m1685d());
    }

    /* renamed from: q */
    float m1667q(C6013a<Float> c6013a, float f) {
        Float f2;
        if (c6013a.f16603b != null && c6013a.f16604c != null) {
            C6015c<A> c6015c = this.f34011e;
            if (c6015c != 0 && (f2 = (Float) c6015c.m22355b(c6013a.f16608g, c6013a.f16609h.floatValue(), c6013a.f16603b, c6013a.f16604c, f, m1684e(), m1683f())) != null) {
                return f2.floatValue();
            }
            return C5851g.m22893k(c6013a.m22360f(), c6013a.m22363c(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p459y3.AbstractC13078a
    /* renamed from: r */
    public Float mo1633i(C6013a<Float> c6013a, float f) {
        return Float.valueOf(m1667q(c6013a, f));
    }
}
