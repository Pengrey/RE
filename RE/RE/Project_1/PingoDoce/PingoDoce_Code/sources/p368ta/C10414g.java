package p368ta;

import com.google.gson.AbstractC4376l;
import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.C4379o;
import com.google.gson.InterfaceC4391t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p421wa.C11605a;
import sa.AbstractC10122f;
import sa.C10100b;
import sa.C10104c;
import sa.C10135l;
import sa.InterfaceC10132i;

/* renamed from: ta.g */
/* loaded from: classes2.dex */
public final class C10414g implements InterfaceC4391t {

    /* renamed from: w */
    private final C10104c f27063w;

    /* renamed from: x */
    final boolean f27064x;

    /* compiled from: MapTypeAdapterFactory.java */
    /* renamed from: ta.g$a */
    /* loaded from: classes2.dex */
    private final class C10415a<K, V> extends AbstractC4385s<Map<K, V>> {

        /* renamed from: a */
        private final AbstractC4385s<K> f27065a;

        /* renamed from: b */
        private final AbstractC4385s<V> f27066b;

        /* renamed from: c */
        private final InterfaceC10132i<? extends Map<K, V>> f27067c;

        public C10415a(C4364f c4364f, Type type, AbstractC4385s<K> abstractC4385s, Type type2, AbstractC4385s<V> abstractC4385s2, InterfaceC10132i<? extends Map<K, V>> interfaceC10132i) {
            this.f27065a = new C10431m(c4364f, abstractC4385s, type);
            this.f27066b = new C10431m(c4364f, abstractC4385s2, type2);
            this.f27067c = interfaceC10132i;
        }

        /* renamed from: e */
        private String m8020e(AbstractC4376l abstractC4376l) {
            if (abstractC4376l.m27758t()) {
                C4379o m27762g = abstractC4376l.m27762g();
                if (m27762g.m27751D()) {
                    return String.valueOf(m27762g.m27744y());
                }
                if (m27762g.m27753B()) {
                    return Boolean.toString(m27762g.m27747u());
                }
                if (m27762g.m27750E()) {
                    return m27762g.mo27748l();
                }
                throw new AssertionError();
            } else if (abstractC4376l.m27760p()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public Map<K, V> mo27782e(C4387a c4387a) throws IOException {
            EnumC4389b mo8038o0 = c4387a.mo8038o0();
            if (mo8038o0 == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            Map<K, V> mo9083a = this.f27067c.mo9083a();
            if (mo8038o0 == EnumC4389b.BEGIN_ARRAY) {
                c4387a.mo8044a();
                while (c4387a.mo8055H()) {
                    c4387a.mo8044a();
                    K mo27782e = this.f27065a.mo27782e(c4387a);
                    if (mo9083a.put(mo27782e, this.f27066b.mo27782e(c4387a)) == null) {
                        c4387a.mo8037v();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + mo27782e);
                    }
                }
                c4387a.mo8037v();
            } else {
                c4387a.mo8041c();
                while (c4387a.mo8055H()) {
                    AbstractC10122f.f26413a.mo9099a(c4387a);
                    K mo27782e2 = this.f27065a.mo27782e(c4387a);
                    if (mo9083a.put(mo27782e2, this.f27066b.mo27782e(c4387a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + mo27782e2);
                    }
                }
                c4387a.mo8036y();
            }
            return mo9083a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.AbstractC4385s
        /* renamed from: g */
        public void mo27781f(C4390c c4390c, Map<K, V> map) throws IOException {
            if (map == null) {
                c4390c.mo8031P();
            } else if (!C10414g.this.f27064x) {
                c4390c.mo8029h();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c4390c.mo8032L(String.valueOf(entry.getKey()));
                    this.f27066b.mo27781f(c4390c, entry.getValue());
                }
                c4390c.mo8022y();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    AbstractC4376l m27741c = this.f27065a.m27741c(entry2.getKey());
                    arrayList.add(m27741c);
                    arrayList2.add(entry2.getValue());
                    z |= m27741c.m27761o() || m27741c.m27759q();
                }
                if (z) {
                    c4390c.mo8030e();
                    int size = arrayList.size();
                    while (i < size) {
                        c4390c.mo8030e();
                        C10135l.m9076b((AbstractC4376l) arrayList.get(i), c4390c);
                        this.f27066b.mo27781f(c4390c, arrayList2.get(i));
                        c4390c.mo8024v();
                        i++;
                    }
                    c4390c.mo8024v();
                    return;
                }
                c4390c.mo8029h();
                int size2 = arrayList.size();
                while (i < size2) {
                    c4390c.mo8032L(m8020e((AbstractC4376l) arrayList.get(i)));
                    this.f27066b.mo27781f(c4390c, arrayList2.get(i));
                    i++;
                }
                c4390c.mo8022y();
            }
        }
    }

    public C10414g(C10104c c10104c, boolean z) {
        this.f27063w = c10104c;
        this.f27064x = z;
    }

    /* renamed from: b */
    private AbstractC4385s<?> m8021b(C4364f c4364f, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return c4364f.m27794l(C11605a.m4630b(type));
        }
        return C10432n.f27138f;
    }

    @Override // com.google.gson.InterfaceC4391t
    /* renamed from: a */
    public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
        Type m4627e = c11605a.m4627e();
        if (Map.class.isAssignableFrom(c11605a.m4629c())) {
            Type[] m9133j = C10100b.m9133j(m4627e, C10100b.m9132k(m4627e));
            return new C10415a(c4364f, m9133j[0], m8021b(c4364f, m9133j[0]), m9133j[1], c4364f.m27794l(C11605a.m4630b(m9133j[1])), this.f27063w.m9121a(c11605a));
        }
        return null;
    }
}
