package p243n;

import java.util.HashMap;
import java.util.Map;
import p243n.C7547b;

/* renamed from: n.a */
/* loaded from: classes.dex */
public class C7546a<K, V> extends C7547b<K, V> {

    /* renamed from: A */
    private HashMap<K, C7547b.C7550c<K, V>> f19999A = new HashMap<>();

    public boolean contains(K k) {
        return this.f19999A.containsKey(k);
    }

    @Override // p243n.C7547b
    /* renamed from: f */
    protected C7547b.C7550c<K, V> mo18166f(K k) {
        return this.f19999A.get(k);
    }

    @Override // p243n.C7547b
    /* renamed from: o */
    public V mo18162o(K k, V v) {
        C7547b.C7550c<K, V> mo18166f = mo18166f(k);
        if (mo18166f != null) {
            return mo18166f.f20005x;
        }
        this.f19999A.put(k, m18163l(k, v));
        return null;
    }

    @Override // p243n.C7547b
    /* renamed from: p */
    public V mo18161p(K k) {
        V v = (V) super.mo18161p(k);
        this.f19999A.remove(k);
        return v;
    }

    /* renamed from: q */
    public Map.Entry<K, V> m18168q(K k) {
        if (contains(k)) {
            return this.f19999A.get(k).f20007z;
        }
        return null;
    }
}
