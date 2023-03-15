package p177j9;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p081ea.InterfaceC5025c;
import p081ea.InterfaceC5026d;
import p136ha.InterfaceC5880a;
import p136ha.InterfaceC5882b;
import p177j9.C6393n;
import p487z9.InterfaceC13733a;

/* renamed from: j9.n */
/* loaded from: classes.dex */
public class C6393n extends AbstractC6373a implements InterfaceC13733a {

    /* renamed from: g */
    private static final InterfaceC5882b<Set<Object>> f17443g = C6390k.f17438a;

    /* renamed from: a */
    private final Map<C6378d<?>, InterfaceC5882b<?>> f17444a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC5882b<?>> f17445b;

    /* renamed from: c */
    private final Map<Class<?>, C6405u<?>> f17446c;

    /* renamed from: d */
    private final List<InterfaceC5882b<InterfaceC6388i>> f17447d;

    /* renamed from: e */
    private final C6403s f17448e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f17449f;

    /* compiled from: ComponentRuntime.java */
    /* renamed from: j9.n$b */
    /* loaded from: classes.dex */
    public static final class C6395b {

        /* renamed from: a */
        private final Executor f17450a;

        /* renamed from: b */
        private final List<InterfaceC5882b<InterfaceC6388i>> f17451b = new ArrayList();

        /* renamed from: c */
        private final List<C6378d<?>> f17452c = new ArrayList();

        C6395b(Executor executor) {
            this.f17450a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ InterfaceC6388i m21063f(InterfaceC6388i interfaceC6388i) {
            return interfaceC6388i;
        }

        /* renamed from: b */
        public C6395b m21067b(C6378d<?> c6378d) {
            this.f17452c.add(c6378d);
            return this;
        }

        /* renamed from: c */
        public C6395b m21066c(final InterfaceC6388i interfaceC6388i) {
            this.f17451b.add(new InterfaceC5882b() { // from class: j9.o
                @Override // p136ha.InterfaceC5882b
                public final Object get() {
                    InterfaceC6388i m21063f;
                    m21063f = C6393n.C6395b.m21063f(InterfaceC6388i.this);
                    return m21063f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public C6395b m21065d(Collection<InterfaceC5882b<InterfaceC6388i>> collection) {
            this.f17451b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C6393n m21064e() {
            return new C6393n(this.f17450a, this.f17451b, this.f17452c);
        }
    }

    /* renamed from: i */
    public static C6395b m21080i(Executor executor) {
        return new C6395b(executor);
    }

    /* renamed from: j */
    private void m21079j(List<C6378d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC5882b<InterfaceC6388i>> it = this.f17447d.iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC6388i interfaceC6388i = it.next().get();
                    if (interfaceC6388i != null) {
                        list.addAll(interfaceC6388i.getComponents());
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f17444a.isEmpty()) {
                C6397p.m21062a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f17444a.keySet());
                arrayList2.addAll(list);
                C6397p.m21062a(arrayList2);
            }
            for (final C6378d<?> c6378d : list) {
                this.f17444a.put(c6378d, new C6404t(new InterfaceC5882b() { // from class: j9.j
                    @Override // p136ha.InterfaceC5882b
                    public final Object get() {
                        Object m21075n;
                        m21075n = C6393n.this.m21075n(c6378d);
                        return m21075n;
                    }
                }));
            }
            arrayList.addAll(m21070s(list));
            arrayList.addAll(m21069t());
            m21071r();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m21072q();
    }

    /* renamed from: k */
    private void m21078k(Map<C6378d<?>, InterfaceC5882b<?>> map, boolean z) {
        for (Map.Entry<C6378d<?>, InterfaceC5882b<?>> entry : map.entrySet()) {
            C6378d<?> key = entry.getKey();
            InterfaceC5882b<?> value = entry.getValue();
            if (key.m21111k() || (key.m21110l() && z)) {
                value.get();
            }
        }
        this.f17448e.m21037d();
    }

    /* renamed from: m */
    private static <T> List<T> m21076m(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m21075n(C6378d c6378d) {
        return c6378d.m21116f().mo1546a(new C6374a0(c6378d, this));
    }

    /* renamed from: q */
    private void m21072q() {
        Boolean bool = this.f17449f.get();
        if (bool != null) {
            m21078k(this.f17444a, bool.booleanValue());
        }
    }

    /* renamed from: r */
    private void m21071r() {
        for (C6378d<?> c6378d : this.f17444a.keySet()) {
            for (C6401q c6401q : c6378d.m21117e()) {
                if (c6401q.m21045g() && !this.f17446c.containsKey(c6401q.m21049c())) {
                    this.f17446c.put(c6401q.m21049c(), C6405u.m21032b(Collections.emptySet()));
                } else if (this.f17445b.containsKey(c6401q.m21049c())) {
                    continue;
                } else if (!c6401q.m21046f()) {
                    if (!c6401q.m21045g()) {
                        this.f17445b.put(c6401q.m21049c(), C6409y.m21025e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c6378d, c6401q.m21049c()));
                }
            }
        }
    }

    /* renamed from: s */
    private List<Runnable> m21070s(List<C6378d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C6378d<?> c6378d : list) {
            if (c6378d.m21109m()) {
                final InterfaceC5882b<?> interfaceC5882b = this.f17444a.get(c6378d);
                for (Class<? super Object> cls : c6378d.m21115g()) {
                    if (!this.f17445b.containsKey(cls)) {
                        this.f17445b.put(cls, interfaceC5882b);
                    } else {
                        final C6409y c6409y = (C6409y) this.f17445b.get(cls);
                        arrayList.add(new Runnable() { // from class: j9.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                C6409y.this.m21020j(interfaceC5882b);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private List<Runnable> m21069t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C6378d<?>, InterfaceC5882b<?>> entry : this.f17444a.entrySet()) {
            C6378d<?> key = entry.getKey();
            if (!key.m21109m()) {
                InterfaceC5882b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m21115g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f17446c.containsKey(entry2.getKey())) {
                this.f17446c.put((Class) entry2.getKey(), C6405u.m21032b((Collection) entry2.getValue()));
            } else {
                final C6405u<?> c6405u = this.f17446c.get(entry2.getKey());
                for (final InterfaceC5882b interfaceC5882b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: j9.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6405u.this.m21033a(interfaceC5882b);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // p177j9.InterfaceC6381e
    /* renamed from: c */
    public synchronized <T> InterfaceC5882b<T> mo21086c(Class<T> cls) {
        C6410z.m21017c(cls, "Null interface requested.");
        return (InterfaceC5882b<T>) this.f17445b.get(cls);
    }

    @Override // p177j9.InterfaceC6381e
    /* renamed from: d */
    public synchronized <T> InterfaceC5882b<Set<T>> mo21085d(Class<T> cls) {
        C6405u<?> c6405u = this.f17446c.get(cls);
        if (c6405u != null) {
            return c6405u;
        }
        return (InterfaceC5882b<Set<T>>) f17443g;
    }

    @Override // p177j9.InterfaceC6381e
    /* renamed from: e */
    public <T> InterfaceC5880a<T> mo21084e(Class<T> cls) {
        InterfaceC5882b<T> mo21086c = mo21086c(cls);
        if (mo21086c == null) {
            return C6409y.m21025e();
        }
        if (mo21086c instanceof C6409y) {
            return (C6409y) mo21086c;
        }
        return C6409y.m21021i(mo21086c);
    }

    /* renamed from: l */
    public void m21077l(boolean z) {
        HashMap hashMap;
        if (this.f17449f.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f17444a);
            }
            m21078k(hashMap, z);
        }
    }

    private C6393n(Executor executor, Iterable<InterfaceC5882b<InterfaceC6388i>> iterable, Collection<C6378d<?>> collection) {
        this.f17444a = new HashMap();
        this.f17445b = new HashMap();
        this.f17446c = new HashMap();
        this.f17449f = new AtomicReference<>();
        C6403s c6403s = new C6403s(executor);
        this.f17448e = c6403s;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6378d.m21106p(c6403s, C6403s.class, InterfaceC5026d.class, InterfaceC5025c.class));
        arrayList.add(C6378d.m21106p(this, InterfaceC13733a.class, new Class[0]));
        for (C6378d<?> c6378d : collection) {
            if (c6378d != null) {
                arrayList.add(c6378d);
            }
        }
        this.f17447d = m21076m(iterable);
        m21079j(arrayList);
    }
}
