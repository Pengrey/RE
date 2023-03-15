package p459y3;

import java.util.List;
import p130h4.C5851g;
import p152i4.C6013a;
import p152i4.C6015c;

/* renamed from: y3.e */
/* loaded from: classes.dex */
public class C13088e extends AbstractC13089f<Integer> {
    public C13088e(List<C6013a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m1664p() {
        return m1663q(m1686b(), m1685d());
    }

    /* renamed from: q */
    int m1663q(C6013a<Integer> c6013a, float f) {
        Integer num;
        if (c6013a.f16603b != null && c6013a.f16604c != null) {
            C6015c<A> c6015c = this.f34011e;
            if (c6015c != 0 && (num = (Integer) c6015c.m22355b(c6013a.f16608g, c6013a.f16609h.floatValue(), c6013a.f16603b, c6013a.f16604c, f, m1684e(), m1683f())) != null) {
                return num.intValue();
            }
            return C5851g.m22892l(c6013a.m22359g(), c6013a.m22362d(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p459y3.AbstractC13078a
    /* renamed from: r */
    public Integer mo1633i(C6013a<Integer> c6013a, float f) {
        return Integer.valueOf(m1663q(c6013a, f));
    }
}
