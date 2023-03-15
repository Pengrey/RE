package com.squareup.moshi;

import com.squareup.moshi.AbstractC4470f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.o */
/* loaded from: classes2.dex */
final class C4494o<K, V> extends AbstractC4470f<Map<K, V>> {

    /* renamed from: c */
    public static final AbstractC4470f.InterfaceC4474d f12136c = new C4495a();

    /* renamed from: a */
    private final AbstractC4470f<K> f12137a;

    /* renamed from: b */
    private final AbstractC4470f<V> f12138b;

    /* compiled from: MapJsonAdapter.java */
    /* renamed from: com.squareup.moshi.o$a */
    /* loaded from: classes2.dex */
    class C4495a implements AbstractC4470f.InterfaceC4474d {
        C4495a() {
        }

        @Override // com.squareup.moshi.AbstractC4470f.InterfaceC4474d
        @Nullable
        /* renamed from: a */
        public AbstractC4470f<?> mo27356a(Type type, Set<? extends Annotation> set, C4496p c4496p) {
            Class<?> m27330g;
            if (set.isEmpty() && (m27330g = C4516s.m27330g(type)) == Map.class) {
                Type[] m27328i = C4516s.m27328i(type, m27330g);
                return new C4494o(c4496p, m27328i[0], m27328i[1]).m27474f();
            }
            return null;
        }
    }

    C4494o(C4496p c4496p, Type type, Type type2) {
        this.f12137a = c4496p.m27368d(type);
        this.f12138b = c4496p.m27368d(type2);
    }

    @Override // com.squareup.moshi.AbstractC4470f
    /* renamed from: k */
    public Map<K, V> mo10144b(AbstractC4476h abstractC4476h) throws IOException {
        C4484n c4484n = new C4484n();
        abstractC4476h.mo27437c();
        while (abstractC4476h.mo27427y()) {
            abstractC4476h.mo27438a0();
            K mo10144b = this.f12137a.mo10144b(abstractC4476h);
            V mo10144b2 = this.f12138b.mo10144b(abstractC4476h);
            Object put = c4484n.put(mo10144b, mo10144b2);
            if (put != null) {
                throw new JsonDataException("Map key '" + mo10144b + "' has multiple values at path " + abstractC4476h.m27462v() + ": " + put + " and " + mo10144b2);
            }
        }
        abstractC4476h.mo27433h();
        return c4484n;
    }

    @Override // com.squareup.moshi.AbstractC4470f
    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, Map<K, V> map) throws IOException {
        abstractC4483m.mo27406c();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                abstractC4483m.m27413P();
                this.f12137a.mo10143i(abstractC4483m, entry.getKey());
                this.f12138b.mo10143i(abstractC4483m, entry.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + abstractC4483m.m27398v());
            }
        }
        abstractC4483m.mo27399t();
    }

    public String toString() {
        return "JsonAdapter(" + this.f12137a + "=" + this.f12138b + ")";
    }
}
