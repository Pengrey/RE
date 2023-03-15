package p459y3;

import java.util.Collections;
import p152i4.C6013a;
import p152i4.C6014b;
import p152i4.C6015c;

/* renamed from: y3.p */
/* loaded from: classes.dex */
public class C13099p<K, A> extends AbstractC13078a<K, A> {

    /* renamed from: i */
    private final A f34055i;

    public C13099p(C6015c<A> c6015c) {
        this(c6015c, null);
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: c */
    float mo1635c() {
        return 1.0f;
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: h */
    public A mo1634h() {
        C6015c<A> c6015c = this.f34011e;
        A a = this.f34055i;
        return c6015c.m22355b(0.0f, 0.0f, a, a, m1683f(), m1683f(), m1683f());
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: i */
    A mo1633i(C6013a<K> c6013a, float f) {
        return mo1634h();
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: k */
    public void mo1632k() {
        if (this.f34011e != null) {
            super.mo1632k();
        }
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: m */
    public void mo1631m(float f) {
        this.f34010d = f;
    }

    public C13099p(C6015c<A> c6015c, A a) {
        super(Collections.emptyList());
        new C6014b();
        m1680n(c6015c);
        this.f34055i = a;
    }
}
