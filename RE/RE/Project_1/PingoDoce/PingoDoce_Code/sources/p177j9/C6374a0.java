package p177j9;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p081ea.InterfaceC5025c;
import p136ha.InterfaceC5880a;
import p136ha.InterfaceC5882b;

/* renamed from: j9.a0 */
/* loaded from: classes.dex */
final class C6374a0 extends AbstractC6373a {

    /* renamed from: a */
    private final Set<Class<?>> f17409a;

    /* renamed from: b */
    private final Set<Class<?>> f17410b;

    /* renamed from: c */
    private final Set<Class<?>> f17411c;

    /* renamed from: d */
    private final Set<Class<?>> f17412d;

    /* renamed from: e */
    private final Set<Class<?>> f17413e;

    /* renamed from: f */
    private final Set<Class<?>> f17414f;

    /* renamed from: g */
    private final InterfaceC6381e f17415g;

    /* compiled from: RestrictedComponentContainer.java */
    /* renamed from: j9.a0$a */
    /* loaded from: classes.dex */
    private static class C6375a implements InterfaceC5025c {

        /* renamed from: a */
        private final Set<Class<?>> f17416a;

        /* renamed from: b */
        private final InterfaceC5025c f17417b;

        public C6375a(Set<Class<?>> set, InterfaceC5025c interfaceC5025c) {
            this.f17416a = set;
            this.f17417b = interfaceC5025c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6374a0(C6378d<?> c6378d, InterfaceC6381e interfaceC6381e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C6401q c6401q : c6378d.m21117e()) {
            if (c6401q.m21047e()) {
                if (c6401q.m21045g()) {
                    hashSet4.add(c6401q.m21049c());
                } else {
                    hashSet.add(c6401q.m21049c());
                }
            } else if (c6401q.m21048d()) {
                hashSet3.add(c6401q.m21049c());
            } else if (c6401q.m21045g()) {
                hashSet5.add(c6401q.m21049c());
            } else {
                hashSet2.add(c6401q.m21049c());
            }
        }
        if (!c6378d.m21114h().isEmpty()) {
            hashSet.add(InterfaceC5025c.class);
        }
        this.f17409a = Collections.unmodifiableSet(hashSet);
        this.f17410b = Collections.unmodifiableSet(hashSet2);
        this.f17411c = Collections.unmodifiableSet(hashSet3);
        this.f17412d = Collections.unmodifiableSet(hashSet4);
        this.f17413e = Collections.unmodifiableSet(hashSet5);
        this.f17414f = c6378d.m21114h();
        this.f17415g = interfaceC6381e;
    }

    @Override // p177j9.AbstractC6373a, p177j9.InterfaceC6381e
    /* renamed from: a */
    public <T> T mo21096a(Class<T> cls) {
        if (this.f17409a.contains(cls)) {
            T t = (T) this.f17415g.mo21096a(cls);
            return !cls.equals(InterfaceC5025c.class) ? t : (T) new C6375a(this.f17414f, (InterfaceC5025c) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // p177j9.AbstractC6373a, p177j9.InterfaceC6381e
    /* renamed from: b */
    public <T> Set<T> mo21095b(Class<T> cls) {
        if (this.f17412d.contains(cls)) {
            return this.f17415g.mo21095b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // p177j9.InterfaceC6381e
    /* renamed from: c */
    public <T> InterfaceC5882b<T> mo21086c(Class<T> cls) {
        if (this.f17410b.contains(cls)) {
            return this.f17415g.mo21086c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // p177j9.InterfaceC6381e
    /* renamed from: d */
    public <T> InterfaceC5882b<Set<T>> mo21085d(Class<T> cls) {
        if (this.f17413e.contains(cls)) {
            return this.f17415g.mo21085d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // p177j9.InterfaceC6381e
    /* renamed from: e */
    public <T> InterfaceC5880a<T> mo21084e(Class<T> cls) {
        if (this.f17411c.contains(cls)) {
            return this.f17415g.mo21084e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
