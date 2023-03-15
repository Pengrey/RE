package p260o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ExceptionsH;
import p126h0.InterfaceC5736d;
import p126h0.InterfaceC5740f;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p260o0.C7987t;
import p297pd._Ranges;
import p468yc.C13182l;
import p468yc.C13191r;
import p468yc.C13195u;
import p489zc.Iterables;
import p489zc.MapsJVM;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
/* renamed from: o0.m */
/* loaded from: classes.dex */
public final class C7977m<K, V> extends AbstractC7979o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7977m(C7987t c7987t) {
        super(c7987t);
        Intrinsics.isThisObjectNull(c7987t, "map");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m17291h((Map.Entry) obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m17290l(collection)).booleanValue();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (C6431d0.m20945j(obj)) {
            return m17289o((Map.Entry) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public Void m17291h(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    public Iterator iterator() {
        return new C7995x(m17284b(), ((InterfaceC5736d) m17284b().m17249k().m17243g().entrySet()).iterator());
    }

    /* renamed from: l */
    public Void m17290l(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: o */
    public boolean m17289o(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        return Intrinsics.equals(m17284b().get(entry.getKey()), entry.getValue());
    }

    /* renamed from: p */
    public boolean m17288p(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        return m17284b().remove(entry.getKey()) != null;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (C6431d0.m20945j(obj)) {
            return m17288p((Map.Entry) obj);
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (m17284b().remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean retainAll(Collection collection) {
        int m186r;
        int m339b;
        int m15005d;
        Object obj;
        InterfaceC5740f m17243g;
        int m17242h;
        boolean z;
        Object obj2;
        AbstractC7961h m17368a;
        Intrinsics.isThisObjectNull(collection, "elements");
        m186r = Iterables.m186r(collection, 10);
        m339b = MapsJVM.m339b(m186r);
        m15005d = _Ranges.m15005d(m339b, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m15005d);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C13182l m1447a = C13191r.m1447a(entry.getKey(), entry.getValue());
            linkedHashMap.put(m1447a.m1460c(), m1447a.m1459d());
        }
        C7987t m17284b = m17284b();
        boolean z2 = false;
        do {
            obj = C7989u.f20695a;
            synchronized (obj) {
                C7987t.C7988a c7988a = (C7987t.C7988a) C7971l.m17299x((C7987t.C7988a) m17284b.m17255b(), AbstractC7961h.f20646d.m17368a());
                m17243g = c7988a.m17243g();
                m17242h = c7988a.m17242h();
                C13195u c13195u = C13195u.f34156a;
            }
            Intrinsics.ifNullDoSomething(m17243g);
            InterfaceC5740f.InterfaceC5741a<K, V> mo23201i = m17243g.mo23201i();
            z = true;
            for (Map.Entry entry2 : m17284b.entrySet()) {
                if ((linkedHashMap.containsKey(entry2.getKey()) && Intrinsics.equals(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    mo23201i.remove(entry2.getKey());
                    z2 = true;
                }
            }
            C13195u c13195u2 = C13195u.f34156a;
            InterfaceC5740f<K, V> mo21191h = mo23201i.mo21191h();
            if (Intrinsics.equals(mo21191h, m17243g)) {
                break;
            }
            obj2 = C7989u.f20695a;
            synchronized (obj2) {
                C7987t.C7988a c7988a2 = (C7987t.C7988a) m17284b.m17255b();
                C7971l.m17342A();
                synchronized (C7971l.m17297z()) {
                    m17368a = AbstractC7961h.f20646d.m17368a();
                    C7987t.C7988a c7988a3 = (C7987t.C7988a) C7971l.m17323T(c7988a2, m17284b, m17368a);
                    if (c7988a3.m17242h() == m17242h) {
                        c7988a3.m17241i(mo21191h);
                        c7988a3.m17240j(c7988a3.m17242h() + 1);
                    } else {
                        z = false;
                    }
                }
                C7971l.m17337F(m17368a, m17284b);
            }
        } while (!z);
        return z2;
    }
}
