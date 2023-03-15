package p459y3;

import android.view.animation.Interpolator;
import com.airbnb.lottie.C2199c;
import java.util.ArrayList;
import java.util.List;
import p152i4.C6013a;
import p152i4.C6015c;

/* renamed from: y3.a */
/* loaded from: classes.dex */
public abstract class AbstractC13078a<K, A> {

    /* renamed from: c */
    private final InterfaceC13082d<K> f34009c;

    /* renamed from: e */
    protected C6015c<A> f34011e;

    /* renamed from: a */
    final List<InterfaceC13080b> f34007a = new ArrayList(1);

    /* renamed from: b */
    private boolean f34008b = false;

    /* renamed from: d */
    protected float f34010d = 0.0f;

    /* renamed from: f */
    private A f34012f = null;

    /* renamed from: g */
    private float f34013g = -1.0f;

    /* renamed from: h */
    private float f34014h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y3.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC13080b {
        /* renamed from: c */
        void mo1678c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y3.a$c */
    /* loaded from: classes.dex */
    public static final class C13081c<T> implements InterfaceC13082d<T> {
        private C13081c() {
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: a */
        public float mo1676a() {
            return 1.0f;
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: b */
        public boolean mo1675b(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: c */
        public float mo1674c() {
            return 0.0f;
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: d */
        public C6013a<T> mo1673d() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: e */
        public boolean mo1672e(float f) {
            return false;
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y3.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC13082d<T> {
        /* renamed from: a */
        float mo1676a();

        /* renamed from: b */
        boolean mo1675b(float f);

        /* renamed from: c */
        float mo1674c();

        /* renamed from: d */
        C6013a<T> mo1673d();

        /* renamed from: e */
        boolean mo1672e(float f);

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y3.a$e */
    /* loaded from: classes.dex */
    public static final class C13083e<T> implements InterfaceC13082d<T> {

        /* renamed from: a */
        private final List<? extends C6013a<T>> f34015a;

        /* renamed from: c */
        private C6013a<T> f34017c = null;

        /* renamed from: d */
        private float f34018d = -1.0f;

        /* renamed from: b */
        private C6013a<T> f34016b = m1677f(0.0f);

        C13083e(List<? extends C6013a<T>> list) {
            this.f34015a = list;
        }

        /* renamed from: f */
        private C6013a<T> m1677f(float f) {
            List<? extends C6013a<T>> list = this.f34015a;
            C6013a<T> c6013a = list.get(list.size() - 1);
            if (f >= c6013a.m22361e()) {
                return c6013a;
            }
            for (int size = this.f34015a.size() - 2; size >= 1; size--) {
                C6013a<T> c6013a2 = this.f34015a.get(size);
                if (this.f34016b != c6013a2 && c6013a2.m22365a(f)) {
                    return c6013a2;
                }
            }
            return this.f34015a.get(0);
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: a */
        public float mo1676a() {
            List<? extends C6013a<T>> list = this.f34015a;
            return list.get(list.size() - 1).m22364b();
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: b */
        public boolean mo1675b(float f) {
            C6013a<T> c6013a = this.f34017c;
            C6013a<T> c6013a2 = this.f34016b;
            if (c6013a == c6013a2 && this.f34018d == f) {
                return true;
            }
            this.f34017c = c6013a2;
            this.f34018d = f;
            return false;
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: c */
        public float mo1674c() {
            return this.f34015a.get(0).m22361e();
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: d */
        public C6013a<T> mo1673d() {
            return this.f34016b;
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: e */
        public boolean mo1672e(float f) {
            if (this.f34016b.m22365a(f)) {
                return !this.f34016b.m22358h();
            }
            this.f34016b = m1677f(f);
            return true;
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y3.a$f */
    /* loaded from: classes.dex */
    public static final class C13084f<T> implements InterfaceC13082d<T> {

        /* renamed from: a */
        private final C6013a<T> f34019a;

        /* renamed from: b */
        private float f34020b = -1.0f;

        C13084f(List<? extends C6013a<T>> list) {
            this.f34019a = list.get(0);
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: a */
        public float mo1676a() {
            return this.f34019a.m22364b();
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: b */
        public boolean mo1675b(float f) {
            if (this.f34020b == f) {
                return true;
            }
            this.f34020b = f;
            return false;
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: c */
        public float mo1674c() {
            return this.f34019a.m22361e();
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: d */
        public C6013a<T> mo1673d() {
            return this.f34019a;
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        /* renamed from: e */
        public boolean mo1672e(float f) {
            return !this.f34019a.m22358h();
        }

        @Override // p459y3.AbstractC13078a.InterfaceC13082d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC13078a(List<? extends C6013a<K>> list) {
        this.f34009c = m1679o(list);
    }

    /* renamed from: g */
    private float m1682g() {
        if (this.f34013g == -1.0f) {
            this.f34013g = this.f34009c.mo1674c();
        }
        return this.f34013g;
    }

    /* renamed from: o */
    private static <T> InterfaceC13082d<T> m1679o(List<? extends C6013a<T>> list) {
        if (list.isEmpty()) {
            return new C13081c();
        }
        if (list.size() == 1) {
            return new C13084f(list);
        }
        return new C13083e(list);
    }

    /* renamed from: a */
    public void m1687a(InterfaceC13080b interfaceC13080b) {
        this.f34007a.add(interfaceC13080b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C6013a<K> m1686b() {
        C2199c.m34435a("BaseKeyframeAnimation#getCurrentKeyframe");
        C6013a<K> mo1673d = this.f34009c.mo1673d();
        C2199c.m34434b("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo1673d;
    }

    /* renamed from: c */
    float mo1635c() {
        if (this.f34014h == -1.0f) {
            this.f34014h = this.f34009c.mo1676a();
        }
        return this.f34014h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public float m1685d() {
        C6013a<K> m1686b = m1686b();
        if (m1686b.m22358h()) {
            return 0.0f;
        }
        return m1686b.f16605d.getInterpolation(m1684e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m1684e() {
        if (this.f34008b) {
            return 0.0f;
        }
        C6013a<K> m1686b = m1686b();
        if (m1686b.m22358h()) {
            return 0.0f;
        }
        return (this.f34010d - m1686b.m22361e()) / (m1686b.m22364b() - m1686b.m22361e());
    }

    /* renamed from: f */
    public float m1683f() {
        return this.f34010d;
    }

    /* renamed from: h */
    public A mo1634h() {
        A mo1633i;
        float m1684e = m1684e();
        if (this.f34011e == null && this.f34009c.mo1675b(m1684e)) {
            return this.f34012f;
        }
        C6013a<K> m1686b = m1686b();
        Interpolator interpolator = m1686b.f16606e;
        if (interpolator != null && m1686b.f16607f != null) {
            mo1633i = mo1655j(m1686b, m1684e, interpolator.getInterpolation(m1684e), m1686b.f16607f.getInterpolation(m1684e));
        } else {
            mo1633i = mo1633i(m1686b, m1685d());
        }
        this.f34012f = mo1633i;
        return mo1633i;
    }

    /* renamed from: i */
    abstract A mo1633i(C6013a<K> c6013a, float f);

    /* renamed from: j */
    protected A mo1655j(C6013a<K> c6013a, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo1632k() {
        for (int i = 0; i < this.f34007a.size(); i++) {
            this.f34007a.get(i).mo1678c();
        }
    }

    /* renamed from: l */
    public void m1681l() {
        this.f34008b = true;
    }

    /* renamed from: m */
    public void mo1631m(float f) {
        if (this.f34009c.isEmpty()) {
            return;
        }
        if (f < m1682g()) {
            f = m1682g();
        } else if (f > mo1635c()) {
            f = mo1635c();
        }
        if (f == this.f34010d) {
            return;
        }
        this.f34010d = f;
        if (this.f34009c.mo1672e(f)) {
            mo1632k();
        }
    }

    /* renamed from: n */
    public void m1680n(C6015c<A> c6015c) {
        C6015c<A> c6015c2 = this.f34011e;
        if (c6015c2 != null) {
            c6015c2.m22354c(null);
        }
        this.f34011e = c6015c;
        if (c6015c != null) {
            c6015c.m22354c(this);
        }
    }
}
