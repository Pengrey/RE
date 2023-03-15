package p260o0;

import id.InterfaceC6108l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p126h0.C5732a;
import p126h0.InterfaceC5737e;
import p181jd.AbstractC6438m;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6652c;
import p260o0.AbstractC7961h;
import p260o0.InterfaceC7950b0;
import p468yc.C13195u;

/* compiled from: SnapshotStateList.kt */
/* renamed from: o0.r */
/* loaded from: classes.dex */
public final class C7982r<T> implements List, InterfaceC7950b0, InterfaceC6652c {

    /* renamed from: w */
    private AbstractC7953c0 f20682w = new C7983a(C5732a.m23210b());

    /* compiled from: SnapshotStateList.kt */
    /* renamed from: o0.r$a */
    /* loaded from: classes.dex */
    public static final class C7983a<T> extends AbstractC7953c0 {

        /* renamed from: c */
        private InterfaceC5737e f20683c;

        /* renamed from: d */
        private int f20684d;

        public C7983a(InterfaceC5737e interfaceC5737e) {
            Intrinsics.isThisObjectNull(interfaceC5737e, "list");
            this.f20683c = interfaceC5737e;
        }

        /* renamed from: a */
        public void mo17447a(AbstractC7953c0 abstractC7953c0) {
            Object obj;
            Intrinsics.isThisObjectNull(abstractC7953c0, "value");
            obj = C7986s.f20688a;
            synchronized (obj) {
                m17264i(((C7983a) abstractC7953c0).m17266g());
                m17263j(((C7983a) abstractC7953c0).m17265h());
                C13195u c13195u = C13195u.f34156a;
            }
        }

        /* renamed from: b */
        public AbstractC7953c0 mo17446b() {
            return new C7983a(this.f20683c);
        }

        /* renamed from: g */
        public final InterfaceC5737e m17266g() {
            return this.f20683c;
        }

        /* renamed from: h */
        public final int m17265h() {
            return this.f20684d;
        }

        /* renamed from: i */
        public final void m17264i(InterfaceC5737e interfaceC5737e) {
            Intrinsics.isThisObjectNull(interfaceC5737e, "<set-?>");
            this.f20683c = interfaceC5737e;
        }

        /* renamed from: j */
        public final void m17263j(int i) {
            this.f20684d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapshotStateList.kt */
    /* renamed from: o0.r$b */
    /* loaded from: classes.dex */
    public static final class C7984b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ int f20685w;

        /* renamed from: x */
        final /* synthetic */ Collection f20686x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7984b(int i, Collection collection) {
            super(1);
            this.f20685w = i;
            this.f20686x = collection;
        }

        /* renamed from: a */
        public final Boolean mo9587d(List list) {
            Intrinsics.isThisObjectNull(list, "it");
            return Boolean.valueOf(list.addAll(this.f20685w, this.f20686x));
        }
    }

    /* compiled from: SnapshotStateList.kt */
    /* renamed from: o0.r$c */
    /* loaded from: classes.dex */
    static final class C7985c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Collection f20687w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7985c(Collection collection) {
            super(1);
            this.f20687w = collection;
        }

        /* renamed from: a */
        public final Boolean mo9587d(List list) {
            Intrinsics.isThisObjectNull(list, "it");
            return Boolean.valueOf(list.retainAll(this.f20687w));
        }
    }

    /* renamed from: q */
    private final boolean m17272q(InterfaceC6108l interfaceC6108l) {
        Object obj;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        Object mo9587d;
        Object obj2;
        AbstractC7961h m17368a;
        boolean z;
        do {
            obj = C7986s.f20688a;
            synchronized (obj) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e.InterfaceC5738a m23205i = m17266g.m23205i();
            mo9587d = interfaceC6108l.mo9587d(m23205i);
            InterfaceC5737e build = m23205i.build();
            if (Intrinsics.equals(build, m17266g)) {
                break;
            }
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    z = true;
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(build);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return ((Boolean) mo9587d).booleanValue();
    }

    public boolean add(Object obj) {
        Object obj2;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        boolean z;
        Object obj3;
        AbstractC7961h m17368a;
        do {
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e add = m17266g.add(obj);
            z = false;
            if (Intrinsics.equals(add, m17266g)) {
                return false;
            }
            obj3 = C7986s.f20688a;
            synchronized (obj3) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(add);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                        z = true;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return true;
    }

    public boolean addAll(int i, Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return m17272q(new C7984b(i, collection));
    }

    /* renamed from: b */
    public AbstractC7953c0 m17278b() {
        return this.f20682w;
    }

    public void clear() {
        Object obj;
        AbstractC7961h m17368a;
        obj = C7986s.f20688a;
        synchronized (obj) {
            C7983a c7983a = (C7983a) m17278b();
            C7971l.m17342A();
            synchronized (C7971l.m17297z()) {
                m17368a = AbstractC7961h.f20646d.m17368a();
                C7983a c7983a2 = (C7983a) C7971l.m17323T(c7983a, this, m17368a);
                c7983a2.m17264i(C5732a.m23210b());
                c7983a2.m17263j(c7983a2.m17265h() + 1);
            }
            C7971l.m17337F(m17368a, this);
        }
    }

    public boolean contains(Object obj) {
        return m17274o().m17266g().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return m17274o().m17266g().containsAll(collection);
    }

    /* renamed from: f */
    public void m17277f(AbstractC7953c0 abstractC7953c0) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "value");
        abstractC7953c0.m17443e(m17278b());
        this.f20682w = (C7983a) abstractC7953c0;
    }

    public Object get(int i) {
        return m17274o().m17266g().get(i);
    }

    /* renamed from: h */
    public AbstractC7953c0 m17276h(AbstractC7953c0 abstractC7953c0, AbstractC7953c0 abstractC7953c02, AbstractC7953c0 abstractC7953c03) {
        return InterfaceC7950b0.C7951a.m17472a(this, abstractC7953c0, abstractC7953c02, abstractC7953c03);
    }

    public int indexOf(Object obj) {
        return m17274o().m17266g().indexOf(obj);
    }

    public boolean isEmpty() {
        return m17274o().m17266g().isEmpty();
    }

    public Iterator iterator() {
        return listIterator();
    }

    /* renamed from: l */
    public final int m17275l() {
        return ((C7983a) C7971l.m17299x((C7983a) m17278b(), AbstractC7961h.f20646d.m17368a())).m17265h();
    }

    public int lastIndexOf(Object obj) {
        return m17274o().m17266g().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return new C7994w(this, 0);
    }

    /* renamed from: o */
    public final C7983a m17274o() {
        return (C7983a) C7971l.m17332K((C7983a) m17278b(), this);
    }

    /* renamed from: p */
    public int m17273p() {
        return m17274o().m17266g().size();
    }

    public final /* bridge */ Object remove(int i) {
        return m17271t(i);
    }

    public boolean removeAll(Collection collection) {
        Object obj;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        boolean z;
        Object obj2;
        AbstractC7961h m17368a;
        Intrinsics.isThisObjectNull(collection, "elements");
        do {
            obj = C7986s.f20688a;
            synchronized (obj) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e removeAll = m17266g.removeAll(collection);
            z = false;
            if (Intrinsics.equals(removeAll, m17266g)) {
                return false;
            }
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(removeAll);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                        z = true;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return true;
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return m17272q(new C7985c(collection));
    }

    public Object set(int i, Object obj) {
        Object obj2;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        Object obj3;
        AbstractC7961h m17368a;
        boolean z;
        Object obj4 = get(i);
        do {
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e interfaceC5737e = m17266g.set(i, obj);
            if (Intrinsics.equals(interfaceC5737e, m17266g)) {
                break;
            }
            obj3 = C7986s.f20688a;
            synchronized (obj3) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    z = true;
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(interfaceC5737e);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return obj4;
    }

    public final /* bridge */ int size() {
        return m17273p();
    }

    public List subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > size()) {
            z = false;
        }
        if (z) {
            return new SnapshotStateList(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: t */
    public Object m17271t(int i) {
        Object obj;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        Object obj2;
        AbstractC7961h m17368a;
        boolean z;
        Object obj3 = get(i);
        do {
            obj = C7986s.f20688a;
            synchronized (obj) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e m23203z = m17266g.m23203z(i);
            if (Intrinsics.equals(m23203z, m17266g)) {
                break;
            }
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    z = true;
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(m23203z);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return obj3;
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }

    /* renamed from: u */
    public final void m17270u(int i, int i2) {
        Object obj;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        Object obj2;
        AbstractC7961h m17368a;
        boolean z;
        do {
            obj = C7986s.f20688a;
            synchronized (obj) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e.InterfaceC5738a m23205i = m17266g.m23205i();
            m23205i.subList(i, i2).clear();
            InterfaceC5737e build = m23205i.build();
            if (Intrinsics.equals(build, m17266g)) {
                return;
            }
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    z = true;
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(build);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
    }

    /* renamed from: v */
    public final int m17269v(Collection collection, int i, int i2) {
        Object obj;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        Object obj2;
        AbstractC7961h m17368a;
        boolean z;
        Intrinsics.isThisObjectNull(collection, "elements");
        int size = size();
        do {
            obj = C7986s.f20688a;
            synchronized (obj) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e.InterfaceC5738a m23205i = m17266g.m23205i();
            m23205i.subList(i, i2).retainAll(collection);
            InterfaceC5737e build = m23205i.build();
            if (Intrinsics.equals(build, m17266g)) {
                break;
            }
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    z = true;
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(build);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return size - size();
    }

    public boolean addAll(Collection collection) {
        Object obj;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        boolean z;
        Object obj2;
        AbstractC7961h m17368a;
        Intrinsics.isThisObjectNull(collection, "elements");
        do {
            obj = C7986s.f20688a;
            synchronized (obj) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e addAll = m17266g.addAll(collection);
            z = false;
            if (Intrinsics.equals(addAll, m17266g)) {
                return false;
            }
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(addAll);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                        z = true;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return true;
    }

    public ListIterator listIterator(int i) {
        return new C7994w(this, i);
    }

    public boolean remove(Object obj) {
        Object obj2;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        boolean z;
        Object obj3;
        AbstractC7961h m17368a;
        do {
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e remove = m17266g.remove(obj);
            z = false;
            if (Intrinsics.equals(remove, m17266g)) {
                return false;
            }
            obj3 = C7986s.f20688a;
            synchronized (obj3) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(remove);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                        z = true;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
        return true;
    }

    public void add(int i, Object obj) {
        Object obj2;
        AbstractC7961h.C7962a c7962a;
        int m17265h;
        InterfaceC5737e m17266g;
        Object obj3;
        AbstractC7961h m17368a;
        boolean z;
        do {
            obj2 = C7986s.f20688a;
            synchronized (obj2) {
                c7962a = AbstractC7961h.f20646d;
                C7983a c7983a = (C7983a) C7971l.m17299x((C7983a) m17278b(), c7962a.m17368a());
                m17265h = c7983a.m17265h();
                m17266g = c7983a.m17266g();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17266g);
            InterfaceC5737e add = m17266g.add(i, obj);
            if (Intrinsics.equals(add, m17266g)) {
                return;
            }
            obj3 = C7986s.f20688a;
            synchronized (obj3) {
                C7983a c7983a2 = (C7983a) m17278b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = c7962a.m17368a();
                    C7983a c7983a3 = (C7983a) C7971l.m17323T(c7983a2, this, m17368a);
                    z = true;
                    if (c7983a3.m17265h() == m17265h) {
                        c7983a3.m17264i(add);
                        c7983a3.m17263j(c7983a3.m17265h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, this);
            }
        } while (!z);
    }
}
