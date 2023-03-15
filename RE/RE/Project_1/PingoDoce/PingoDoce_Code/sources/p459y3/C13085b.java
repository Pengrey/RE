package p459y3;

import java.util.List;
import p130h4.C5846b;
import p130h4.C5851g;
import p152i4.C6013a;
import p152i4.C6015c;

/* renamed from: y3.b */
/* loaded from: classes.dex */
public class C13085b extends AbstractC13089f<Integer> {
    public C13085b(List<C6013a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m1671p() {
        return m1670q(m1686b(), m1685d());
    }

    /* renamed from: q */
    public int m1670q(C6013a<Integer> c6013a, float f) {
        Integer num;
        Integer num2 = c6013a.f16603b;
        if (num2 != null && c6013a.f16604c != null) {
            int intValue = num2.intValue();
            int intValue2 = c6013a.f16604c.intValue();
            C6015c<A> c6015c = this.f34011e;
            if (c6015c != 0 && (num = (Integer) c6015c.m22355b(c6013a.f16608g, c6013a.f16609h.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, m1684e(), m1683f())) != null) {
                return num.intValue();
            }
            return C5846b.m22937c(C5851g.m22901c(f, 0.0f, 1.0f), intValue, intValue2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p459y3.AbstractC13078a
    /* renamed from: r */
    public Integer mo1633i(C6013a<Integer> c6013a, float f) {
        return Integer.valueOf(m1670q(c6013a, f));
    }
}
