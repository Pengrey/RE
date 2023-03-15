package p459y3;

import java.util.List;
import p130h4.C5851g;
import p152i4.C6013a;
import p152i4.C6015c;
import p152i4.C6016d;

/* renamed from: y3.k */
/* loaded from: classes.dex */
public class C13094k extends AbstractC13089f<C6016d> {

    /* renamed from: i */
    private final C6016d f34032i;

    public C13094k(List<C6013a<C6016d>> list) {
        super(list);
        this.f34032i = new C6016d();
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: p */
    public C6016d mo1633i(C6013a<C6016d> c6013a, float f) {
        C6016d c6016d;
        C6016d c6016d2;
        C6016d c6016d3 = c6013a.f16603b;
        if (c6016d3 != null && (c6016d = c6013a.f16604c) != null) {
            C6016d c6016d4 = c6016d3;
            C6016d c6016d5 = c6016d;
            C6015c<A> c6015c = this.f34011e;
            if (c6015c == 0 || (c6016d2 = (C6016d) c6015c.m22355b(c6013a.f16608g, c6013a.f16609h.floatValue(), c6016d4, c6016d5, f, m1684e(), m1683f())) == null) {
                this.f34032i.m22350d(C5851g.m22893k(c6016d4.m22352b(), c6016d5.m22352b(), f), C5851g.m22893k(c6016d4.m22351c(), c6016d5.m22351c(), f));
                return this.f34032i;
            }
            return c6016d2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
