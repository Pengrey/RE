package p260o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p126h0.C5732a;
import p126h0.InterfaceC5740f;
import p181jd.Intrinsics;
import p203kd.InterfaceC6653d;
import p260o0.AbstractC7961h;
import p260o0.InterfaceC7950b0;
import p468yc.C13195u;

/* compiled from: SnapshotStateMap.kt */
/* renamed from: o0.t */
/* loaded from: classes.dex */
public final class C7987t<K, V> implements Map, InterfaceC7950b0, InterfaceC6653d {

    /* renamed from: w */
    private AbstractC7953c0 f20689w = new C7988a(C5732a.m23211a());

    /* renamed from: x */
    private final Set f20690x = new C7977m(this);

    /* renamed from: y */
    private final Set f20691y = new C7978n(this);

    /* renamed from: z */
    private final Collection f20692z = new C7980p(this);

    /* compiled from: SnapshotStateMap.kt */
    /* renamed from: o0.t$a */
    /* loaded from: classes.dex */
    public static final class C7988a<K, V> extends AbstractC7953c0 {

        /* renamed from: c */
        private InterfaceC5740f f20693c;

        /* renamed from: d */
        private int f20694d;

        public C7988a(InterfaceC5740f interfaceC5740f) {
            Intrinsics.isThisObjectNull(interfaceC5740f, "map");
            this.f20693c = interfaceC5740f;
        }

        /* renamed from: a */
        public void mo17447a(AbstractC7953c0 abstractC7953c0) {
            Object obj;
            Intrinsics.isThisObjectNull(abstractC7953c0, "value");
            C7988a c7988a = (C7988a) abstractC7953c0;
            obj = C7989u.f20695a;
            synchronized (obj) {
                m17241i(c7988a.m17243g());
                m17240j(c7988a.m17242h());
                C13195u c13195u = C13195u.f34156a;
            }
        }

        /* renamed from: b */
        public AbstractC7953c0 mo17446b() {
            return new C7988a(this.f20693c);
        }

        /* renamed from: g */
        public final InterfaceC5740f m17243g() {
            return this.f20693c;
        }

        /* renamed from: h */
        public final int m17242h() {
            return this.f20694d;
        }

        /* renamed from: i */
        public final void m17241i(InterfaceC5740f interfaceC5740f) {
            Intrinsics.isThisObjectNull(interfaceC5740f, "<set-?>");
            this.f20693c = interfaceC5740f;
        }

        /* renamed from: j */
        public final void m17240j(int i) {
            this.f20694d = i;
        }
    }

    /* renamed from: b */
    public AbstractC7953c0 m17255b() {
        return this.f20689w;
    }

    public void clear() {
        Object obj;
        AbstractC7961h m17368a;
        AbstractC7961h.C7962a c7962a = AbstractC7961h.f20646d;
        C7988a c7988a = (C7988a) C7971l.m17299x((C7988a) m17255b(), c7962a.m17368a());
        c7988a.m17243g();
        InterfaceC5740f m23211a = C5732a.m23211a();
        if (m23211a != c7988a.m17243g()) {
            obj = C7989u.f20695a;
            synchronized (obj) {
                C7988a c7988a2 = (C7988a) m17255b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7988a c7988a3 = (C7988a) C7971l.m17323T(c7988a2, this, m17368a);
                    c7988a3.m17241i(m23211a);
                    c7988a3.m17240j(c7988a3.m17242h() + 1);
                }
                C7971l.m17337F(m17368a, this);
            }
        }
    }

    public boolean containsKey(Object obj) {
        return m17249k().m17243g().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return m17249k().m17243g().containsValue(obj);
    }

    /* renamed from: d */
    public Set m17254d() {
        return this.f20690x;
    }

    /* renamed from: e */
    public Set m17253e() {
        return this.f20691y;
    }

    public final /* bridge */ Set entrySet() {
        return m17254d();
    }

    /* renamed from: f */
    public void m17252f(AbstractC7953c0 abstractC7953c0) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "value");
        this.f20689w = (C7988a) abstractC7953c0;
    }

    public Object get(Object obj) {
        return m17249k().m17243g().get(obj);
    }

    /* renamed from: h */
    public AbstractC7953c0 m17251h(AbstractC7953c0 abstractC7953c0, AbstractC7953c0 abstractC7953c02, AbstractC7953c0 abstractC7953c03) {
        return InterfaceC7950b0.C7951a.m17472a(this, abstractC7953c0, abstractC7953c02, abstractC7953c03);
    }

    public boolean isEmpty() {
        return m17249k().m17243g().isEmpty();
    }

    /* renamed from: j */
    public final int m17250j() {
        return m17249k().m17242h();
    }

    /* renamed from: k */
    public final C7988a m17249k() {
        return (C7988a) C7971l.m17332K((C7988a) m17255b(), this);
    }

    public final /* bridge */ Set keySet() {
        return m17253e();
    }

    /* renamed from: l */
    public int m17248l() {
        return m17249k().m17243g().size();
    }

    /* renamed from: m */
    public Collection m17247m() {
        return this.f20692z;
    }

    /* renamed from: n */
    public final boolean m17246n(Object obj) {
        Object obj2;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.equals(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public Object put(Object obj, Object obj2) {
        Object obj3;
        AbstractC7961h.C7962a c7962a;
        InterfaceC5740f m17243g;
        int m17242h;
        V put;
        Object obj4;
        AbstractC7961h m17368a;
        boolean z;
        do {
            obj3 = C7989u.f20695a;
            synchronized (obj3) {
                c7962a = AbstractC7961h.f20646d;
                C7988a c7988a = (C7988a) C7971l.m17299x((C7988a) m17255b(), c7962a.m17368a());
                m17243g = c7988a.m17243g();
                m17242h = c7988a.m17242h();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17243g);
            InterfaceC5740f.InterfaceC5741a<K, V> mo23201i = m17243g.mo23201i();
            put = mo23201i.put(obj, obj2);
            InterfaceC5740f<K, V> mo21191h = mo23201i.mo21191h();
            if (Intrinsics.equals(mo21191h, m17243g)) {
                break;
            }
            obj4 = C7989u.f20695a;
            synchronized (obj4) {
                C7988a c7988a2 = (C7988a) m17255b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7988a c7988a3 = (C7988a) C7971l.m17323T(c7988a2, this, m17368a);
                    z = true;
                    if (c7988a3.m17242h() == m17242h) {
                        c7988a3.m17241i(mo21191h);
                        c7988a3.m17240j(c7988a3.m17242h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return put;
    }

    public void putAll(Map map) {
        Object obj;
        AbstractC7961h.C7962a c7962a;
        InterfaceC5740f m17243g;
        int m17242h;
        Object obj2;
        AbstractC7961h m17368a;
        boolean z;
        Intrinsics.isThisObjectNull(map, "from");
        do {
            obj = C7989u.f20695a;
            synchronized (obj) {
                c7962a = AbstractC7961h.f20646d;
                C7988a c7988a = (C7988a) C7971l.m17299x((C7988a) m17255b(), c7962a.m17368a());
                m17243g = c7988a.m17243g();
                m17242h = c7988a.m17242h();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17243g);
            InterfaceC5740f.InterfaceC5741a<K, V> mo23201i = m17243g.mo23201i();
            mo23201i.putAll(map);
            InterfaceC5740f<K, V> mo21191h = mo23201i.mo21191h();
            if (Intrinsics.equals(mo21191h, m17243g)) {
                return;
            }
            obj2 = C7989u.f20695a;
            synchronized (obj2) {
                C7988a c7988a2 = (C7988a) m17255b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7988a c7988a3 = (C7988a) C7971l.m17323T(c7988a2, this, m17368a);
                    z = true;
                    if (c7988a3.m17242h() == m17242h) {
                        c7988a3.m17241i(mo21191h);
                        c7988a3.m17240j(c7988a3.m17242h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
    }

    public Object remove(Object obj) {
        Object obj2;
        AbstractC7961h.C7962a c7962a;
        InterfaceC5740f m17243g;
        int m17242h;
        V remove;
        Object obj3;
        AbstractC7961h m17368a;
        boolean z;
        do {
            obj2 = C7989u.f20695a;
            synchronized (obj2) {
                c7962a = AbstractC7961h.f20646d;
                C7988a c7988a = (C7988a) C7971l.m17299x((C7988a) m17255b(), c7962a.m17368a());
                m17243g = c7988a.m17243g();
                m17242h = c7988a.m17242h();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17243g);
            InterfaceC5740f.InterfaceC5741a<K, V> mo23201i = m17243g.mo23201i();
            remove = mo23201i.remove(obj);
            InterfaceC5740f<K, V> mo21191h = mo23201i.mo21191h();
            if (Intrinsics.equals(mo21191h, m17243g)) {
                break;
            }
            obj3 = C7989u.f20695a;
            synchronized (obj3) {
                C7988a c7988a2 = (C7988a) m17255b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7988a c7988a3 = (C7988a) C7971l.m17323T(c7988a2, this, m17368a);
                    z = true;
                    if (c7988a3.m17242h() == m17242h) {
                        c7988a3.m17241i(mo21191h);
                        c7988a3.m17240j(c7988a3.m17242h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return remove;
    }

    public final /* bridge */ int size() {
        return m17248l();
    }

    public final /* bridge */ Collection values() {
        return m17247m();
    }
}
