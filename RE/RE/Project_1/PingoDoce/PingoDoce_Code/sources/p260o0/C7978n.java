package p260o0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsH;
import p126h0.InterfaceC5736d;
import p126h0.InterfaceC5740f;
import p181jd.Intrinsics;
import p260o0.C7987t;
import p468yc.C13195u;
import p489zc._Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
/* renamed from: o0.n */
/* loaded from: classes.dex */
public final class C7978n<K, V> extends AbstractC7979o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7978n(C7987t c7987t) {
        super(c7987t);
        Intrinsics.isThisObjectNull(c7987t, "map");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m17287h(obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m17286l(collection)).booleanValue();
    }

    public boolean contains(Object obj) {
        return m17284b().containsKey(obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!m17284b().containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public Void m17287h(Object obj) {
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: l */
    public Void m17286l(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: o */
    public C7998z iterator() {
        return new C7998z(m17284b(), ((InterfaceC5736d) m17284b().m17249k().m17243g().entrySet()).iterator());
    }

    public boolean remove(Object obj) {
        return m17284b().remove(obj) != null;
    }

    public boolean removeAll(Collection collection) {
        boolean z;
        Intrinsics.isThisObjectNull(collection, "elements");
        while (true) {
            for (Object obj : collection) {
                z = m17284b().remove(obj) != null || z;
            }
            return z;
        }
    }

    public boolean retainAll(Collection collection) {
        Set m451r0;
        Object obj;
        InterfaceC5740f m17243g;
        int m17242h;
        boolean z;
        Object obj2;
        AbstractC7961h m17368a;
        Intrinsics.isThisObjectNull(collection, "elements");
        m451r0 = _Collections.m451r0(collection);
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
            for (Map.Entry entry : m17284b.entrySet()) {
                if (!m451r0.contains(entry.getKey())) {
                    mo23201i.remove(entry.getKey());
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
