package p168j0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p126h0.InterfaceC5740f;
import p181jd.Intrinsics;
import p210l0.C6957b;
import p210l0.C6960e;
import p489zc.AbstractC13759f;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class PersistentHashMapBuilder<K, V> extends AbstractC13759f implements InterfaceC5740f.InterfaceC5741a {

    /* renamed from: A */
    private int f17034A;

    /* renamed from: B */
    private int f17035B;

    /* renamed from: w */
    private PersistentHashMap f17036w;

    /* renamed from: x */
    private C6960e f17037x;

    /* renamed from: y */
    private TrieNode f17038y;

    /* renamed from: z */
    private Object f17039z;

    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap) {
        Intrinsics.isThisObjectNull(persistentHashMap, "map");
        this.f17036w = persistentHashMap;
        this.f17037x = new C6960e();
        this.f17038y = this.f17036w.m21889q();
        this.f17035B = this.f17036w.size();
    }

    /* renamed from: b */
    public Set mo411b() {
        return new C6208h(this);
    }

    public void clear() {
        this.f17038y = TrieNode.f17051e.m21809a();
        m21872o(0);
    }

    public boolean containsKey(Object obj) {
        return this.f17038y.m21825k(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    /* renamed from: d */
    public Set mo410d() {
        return new C6210j(this);
    }

    /* renamed from: e */
    public int mo409e() {
        return this.f17035B;
    }

    /* renamed from: f */
    public Collection mo408f() {
        return new C6212l(this);
    }

    public Object get(Object obj) {
        return this.f17038y.m21821o(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    /* renamed from: h */
    public PersistentHashMap mo21191h() {
        PersistentHashMap persistentHashMap;
        if (this.f17038y == this.f17036w.m21889q()) {
            persistentHashMap = this.f17036w;
        } else {
            this.f17037x = new C6960e();
            persistentHashMap = new PersistentHashMap(this.f17038y, size());
        }
        this.f17036w = persistentHashMap;
        return persistentHashMap;
    }

    /* renamed from: j */
    public final int m21877j() {
        return this.f17034A;
    }

    /* renamed from: k */
    public final TrieNode m21876k() {
        return this.f17038y;
    }

    /* renamed from: l */
    public final C6960e m21875l() {
        return this.f17037x;
    }

    /* renamed from: m */
    public final void m21874m(int i) {
        this.f17034A = i;
    }

    /* renamed from: n */
    public final void m21873n(Object obj) {
        this.f17039z = obj;
    }

    /* renamed from: o */
    public void m21872o(int i) {
        this.f17035B = i;
        this.f17034A++;
    }

    public Object put(Object obj, Object obj2) {
        this.f17039z = null;
        this.f17038y = this.f17038y.m21855D(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        return this.f17039z;
    }

    public void putAll(Map map) {
        Intrinsics.isThisObjectNull(map, "from");
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            persistentHashMap = persistentHashMapBuilder == null ? null : persistentHashMapBuilder.m21878h();
        }
        if (persistentHashMap != null) {
            C6957b c6957b = new C6957b(0, 1, null);
            int size = size();
            this.f17038y = this.f17038y.m21854E(persistentHashMap.m21889q(), 0, c6957b, this);
            int size2 = (persistentHashMap.size() + size) - c6957b.m19706a();
            if (size != size2) {
                m21872o(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public Object remove(Object obj) {
        this.f17039z = null;
        TrieNode m21852G = this.f17038y.m21852G(obj == null ? 0 : obj.hashCode(), obj, 0, this);
        if (m21852G == null) {
            m21852G = TrieNode.f17051e.m21809a();
        }
        this.f17038y = m21852G;
        return this.f17039z;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode m21851H = this.f17038y.m21851H(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        if (m21851H == null) {
            m21851H = TrieNode.f17051e.m21809a();
        }
        this.f17038y = m21851H;
        return size != size();
    }
}
