package p177j9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j9.d */
/* loaded from: classes.dex */
public final class C6378d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f17420a;

    /* renamed from: b */
    private final Set<C6401q> f17421b;

    /* renamed from: c */
    private final int f17422c;

    /* renamed from: d */
    private final int f17423d;

    /* renamed from: e */
    private final InterfaceC6387h<T> f17424e;

    /* renamed from: f */
    private final Set<Class<?>> f17425f;

    /* compiled from: Component.java */
    /* renamed from: j9.d$b */
    /* loaded from: classes.dex */
    public static class C6380b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f17426a;

        /* renamed from: b */
        private final Set<C6401q> f17427b;

        /* renamed from: c */
        private int f17428c;

        /* renamed from: d */
        private int f17429d;

        /* renamed from: e */
        private InterfaceC6387h<T> f17430e;

        /* renamed from: f */
        private Set<Class<?>> f17431f;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public C6380b<T> m21099g() {
            this.f17429d = 1;
            return this;
        }

        /* renamed from: h */
        private C6380b<T> m21098h(int i) {
            C6410z.m21016d(this.f17428c == 0, "Instantiation type has already been set.");
            this.f17428c = i;
            return this;
        }

        /* renamed from: i */
        private void m21097i(Class<?> cls) {
            C6410z.m21019a(!this.f17426a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C6380b<T> m21104b(C6401q c6401q) {
            C6410z.m21017c(c6401q, "Null dependency");
            m21097i(c6401q.m21049c());
            this.f17427b.add(c6401q);
            return this;
        }

        /* renamed from: c */
        public C6380b<T> m21103c() {
            return m21098h(1);
        }

        /* renamed from: d */
        public C6378d<T> m21102d() {
            C6410z.m21016d(this.f17430e != null, "Missing required property: factory.");
            return new C6378d<>(new HashSet(this.f17426a), new HashSet(this.f17427b), this.f17428c, this.f17429d, this.f17430e, this.f17431f);
        }

        /* renamed from: e */
        public C6380b<T> m21101e() {
            return m21098h(2);
        }

        /* renamed from: f */
        public C6380b<T> m21100f(InterfaceC6387h<T> interfaceC6387h) {
            this.f17430e = (InterfaceC6387h) C6410z.m21017c(interfaceC6387h, "Null factory");
            return this;
        }

        @SafeVarargs
        private C6380b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f17426a = hashSet;
            this.f17427b = new HashSet();
            this.f17428c = 0;
            this.f17429d = 0;
            this.f17431f = new HashSet();
            C6410z.m21017c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C6410z.m21017c(cls2, "Null interface");
            }
            Collections.addAll(this.f17426a, clsArr);
        }
    }

    /* renamed from: c */
    public static <T> C6380b<T> m21119c(Class<T> cls) {
        return new C6380b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C6380b<T> m21118d(Class<T> cls, Class<? super T>... clsArr) {
        return new C6380b<>(cls, clsArr);
    }

    /* renamed from: i */
    public static <T> C6378d<T> m21113i(final T t, Class<T> cls) {
        return m21112j(cls).m21100f(new InterfaceC6387h() { // from class: j9.b
            @Override // p177j9.InterfaceC6387h
            /* renamed from: a */
            public final Object mo1546a(InterfaceC6381e interfaceC6381e) {
                Object m21108n;
                m21108n = C6378d.m21108n(t, interfaceC6381e);
                return m21108n;
            }
        }).m21102d();
    }

    /* renamed from: j */
    public static <T> C6380b<T> m21112j(Class<T> cls) {
        return m21119c(cls).m21099g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ Object m21108n(Object obj, InterfaceC6381e interfaceC6381e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m21107o(Object obj, InterfaceC6381e interfaceC6381e) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: p */
    public static <T> C6378d<T> m21106p(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return m21118d(cls, clsArr).m21100f(new InterfaceC6387h() { // from class: j9.c
            @Override // p177j9.InterfaceC6387h
            /* renamed from: a */
            public final Object mo1546a(InterfaceC6381e interfaceC6381e) {
                Object m21107o;
                m21107o = C6378d.m21107o(t, interfaceC6381e);
                return m21107o;
            }
        }).m21102d();
    }

    /* renamed from: e */
    public Set<C6401q> m21117e() {
        return this.f17421b;
    }

    /* renamed from: f */
    public InterfaceC6387h<T> m21116f() {
        return this.f17424e;
    }

    /* renamed from: g */
    public Set<Class<? super T>> m21115g() {
        return this.f17420a;
    }

    /* renamed from: h */
    public Set<Class<?>> m21114h() {
        return this.f17425f;
    }

    /* renamed from: k */
    public boolean m21111k() {
        return this.f17422c == 1;
    }

    /* renamed from: l */
    public boolean m21110l() {
        return this.f17422c == 2;
    }

    /* renamed from: m */
    public boolean m21109m() {
        return this.f17423d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f17420a.toArray()) + ">{" + this.f17422c + ", type=" + this.f17423d + ", deps=" + Arrays.toString(this.f17421b.toArray()) + "}";
    }

    private C6378d(Set<Class<? super T>> set, Set<C6401q> set2, int i, int i2, InterfaceC6387h<T> interfaceC6387h, Set<Class<?>> set3) {
        this.f17420a = Collections.unmodifiableSet(set);
        this.f17421b = Collections.unmodifiableSet(set2);
        this.f17422c = i;
        this.f17423d = i2;
        this.f17424e = interfaceC6387h;
        this.f17425f = Collections.unmodifiableSet(set3);
    }
}
