package p168j0;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126h0.InterfaceC5733b;
import p126h0.InterfaceC5736d;
import p126h0.InterfaceC5740f;
import p168j0.TrieNode;
import p181jd.Intrinsics;
import p489zc.AbstractMap;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class PersistentHashMap<K, V> extends AbstractMap implements InterfaceC5740f {

    /* renamed from: y */
    public static final C6206a f17027y = new C6206a(null);

    /* renamed from: z */
    private static final PersistentHashMap f17028z = new PersistentHashMap(TrieNode.f17051e.m21809a(), 0);

    /* renamed from: w */
    private final TrieNode f17029w;

    /* renamed from: x */
    private final int f17030x;

    /* compiled from: PersistentHashMap.kt */
    /* renamed from: j0.d$a */
    /* loaded from: classes.dex */
    public static final class C6206a {
        private C6206a() {
        }

        public /* synthetic */ C6206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PersistentHashMap m21885a() {
            return PersistentHashMap.m21893m();
        }
    }

    public PersistentHashMap(TrieNode trieNode, int i) {
        Intrinsics.isThisObjectNull(trieNode, "node");
        this.f17029w = trieNode;
        this.f17030x = i;
    }

    /* renamed from: m */
    public static final /* synthetic */ PersistentHashMap m21893m() {
        return f17028z;
    }

    /* renamed from: o */
    private final InterfaceC5736d m21891o() {
        return new PersistentHashMapContentViews(this);
    }

    public boolean containsKey(Object obj) {
        return this.f17029w.m21825k(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    /* renamed from: e */
    public final Set m21898e() {
        return m21891o();
    }

    public Object get(Object obj) {
        return this.f17029w.m21821o(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    /* renamed from: h */
    public int m21896h() {
        return this.f17030x;
    }

    /* renamed from: n */
    public PersistentHashMapBuilder mo23201i() {
        return new PersistentHashMapBuilder(this);
    }

    /* renamed from: p */
    public InterfaceC5736d m21897f() {
        return new C6215p(this);
    }

    /* renamed from: q */
    public final TrieNode m21889q() {
        return this.f17029w;
    }

    /* renamed from: r */
    public InterfaceC5733b m21894j() {
        return new C6217r(this);
    }

    /* renamed from: s */
    public PersistentHashMap m21887s(Object obj, Object obj2) {
        TrieNode.C6220b m21843P = this.f17029w.m21843P(obj == null ? 0 : obj.hashCode(), obj, obj2, 0);
        return m21843P == null ? this : new PersistentHashMap(m21843P.m21808a(), size() + m21843P.m21807b());
    }

    /* renamed from: t */
    public PersistentHashMap m21886t(Object obj) {
        TrieNode m21842Q = this.f17029w.m21842Q(obj == null ? 0 : obj.hashCode(), obj, 0);
        if (this.f17029w == m21842Q) {
            return this;
        }
        if (m21842Q == null) {
            return f17027y.m21885a();
        }
        return new PersistentHashMap(m21842Q, size() - 1);
    }
}
