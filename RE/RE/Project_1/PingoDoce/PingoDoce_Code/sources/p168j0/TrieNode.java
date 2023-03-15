package p168j0;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p210l0.C6956a;
import p210l0.C6957b;
import p210l0.C6960e;
import p297pd.C8608d;
import p297pd.C8611f;
import p297pd._Ranges;

/* renamed from: j0.t */
/* loaded from: classes.dex */
public final class TrieNode<K, V> {

    /* renamed from: e */
    public static final C6219a f17051e = new C6219a(null);

    /* renamed from: f */
    private static final TrieNode f17052f = new TrieNode(0, 0, new Object[0]);

    /* renamed from: a */
    private int f17053a;

    /* renamed from: b */
    private int f17054b;

    /* renamed from: c */
    private final C6960e f17055c;

    /* renamed from: d */
    private Object[] f17056d;

    /* compiled from: TrieNode.kt */
    /* renamed from: j0.t$a */
    /* loaded from: classes.dex */
    public static final class C6219a {
        private C6219a() {
        }

        public /* synthetic */ C6219a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TrieNode m21809a() {
            return TrieNode.m21835a();
        }
    }

    /* compiled from: TrieNode.kt */
    /* renamed from: j0.t$b */
    /* loaded from: classes.dex */
    public static final class C6220b<K, V> {

        /* renamed from: a */
        private TrieNode f17057a;

        /* renamed from: b */
        private final int f17058b;

        public C6220b(TrieNode trieNode, int i) {
            Intrinsics.isThisObjectNull(trieNode, "node");
            this.f17057a = trieNode;
            this.f17058b = i;
        }

        /* renamed from: a */
        public final TrieNode m21808a() {
            return this.f17057a;
        }

        /* renamed from: b */
        public final int m21807b() {
            return this.f17058b;
        }

        /* renamed from: c */
        public final void m21806c(TrieNode trieNode) {
            Intrinsics.isThisObjectNull(trieNode, "<set-?>");
            this.f17057a = trieNode;
        }
    }

    public TrieNode(int i, int i2, Object[] objArr, C6960e c6960e) {
        Intrinsics.isThisObjectNull(objArr, "buffer");
        this.f17053a = i;
        this.f17054b = i2;
        this.f17055c = c6960e;
        this.f17056d = objArr;
    }

    /* renamed from: A */
    private final TrieNode m21858A(int i, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.m21872o(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.m21873n(m21836W(i));
        if (this.f17056d.length == 2) {
            return null;
        }
        if (this.f17055c == persistentHashMapBuilder.m21875l()) {
            this.f17056d = C6224x.m21792b(this.f17056d, i);
            return this;
        }
        return new TrieNode(0, 0, C6224x.m21792b(this.f17056d, i), persistentHashMapBuilder.m21875l());
    }

    /* renamed from: B */
    private final TrieNode m21857B(int i, Object obj, Object obj2, C6960e c6960e) {
        int m21822n = m21822n(i);
        if (this.f17055c == c6960e) {
            this.f17056d = C6224x.m21793a(this.f17056d, m21822n, obj, obj2);
            this.f17053a = i | this.f17053a;
            return this;
        }
        return new TrieNode(i | this.f17053a, this.f17054b, C6224x.m21793a(this.f17056d, m21822n, obj, obj2), c6960e);
    }

    /* renamed from: C */
    private final TrieNode m21856C(int i, int i2, int i3, Object obj, Object obj2, int i4, C6960e c6960e) {
        if (this.f17055c == c6960e) {
            this.f17056d = m21832d(i, i2, i3, obj, obj2, i4, c6960e);
            this.f17053a ^= i2;
            this.f17054b |= i2;
            return this;
        }
        return new TrieNode(this.f17053a ^ i2, i2 | this.f17054b, m21832d(i, i2, i3, obj, obj2, i4, c6960e), c6960e);
    }

    /* renamed from: F */
    private final TrieNode m21853F(TrieNode trieNode, int i, int i2, C6957b c6957b, PersistentHashMapBuilder persistentHashMapBuilder) {
        if (m21818r(i)) {
            TrieNode m21845N = m21845N(m21844O(i));
            if (trieNode.m21818r(i)) {
                return m21845N.m21854E(trieNode.m21845N(trieNode.m21844O(i)), i2 + 5, c6957b, persistentHashMapBuilder);
            }
            if (trieNode.m21819q(i)) {
                int m21822n = trieNode.m21822n(i);
                Object m21816t = trieNode.m21816t(m21822n);
                Object m21836W = trieNode.m21836W(m21822n);
                int size = persistentHashMapBuilder.size();
                TrieNode m21855D = m21845N.m21855D(m21816t != null ? m21816t.hashCode() : 0, m21816t, m21836W, i2 + 5, persistentHashMapBuilder);
                if (persistentHashMapBuilder.size() == size) {
                    c6957b.m19704c(c6957b.m19706a() + 1);
                    return m21855D;
                }
                return m21855D;
            }
            return m21845N;
        } else if (trieNode.m21818r(i)) {
            TrieNode m21845N2 = trieNode.m21845N(trieNode.m21844O(i));
            if (m21819q(i)) {
                int m21822n2 = m21822n(i);
                Object m21816t2 = m21816t(m21822n2);
                int i3 = i2 + 5;
                if (!m21845N2.m21825k(m21816t2 == null ? 0 : m21816t2.hashCode(), m21816t2, i3)) {
                    return m21845N2.m21855D(m21816t2 != null ? m21816t2.hashCode() : 0, m21816t2, m21836W(m21822n2), i3, persistentHashMapBuilder);
                }
                c6957b.m19704c(c6957b.m19706a() + 1);
            }
            return m21845N2;
        } else {
            int m21822n3 = m21822n(i);
            Object m21816t3 = m21816t(m21822n3);
            Object m21836W2 = m21836W(m21822n3);
            int m21822n4 = trieNode.m21822n(i);
            Object m21816t4 = trieNode.m21816t(m21822n4);
            return m21815u(m21816t3 == null ? 0 : m21816t3.hashCode(), m21816t3, m21836W2, m21816t4 != null ? m21816t4.hashCode() : 0, m21816t4, trieNode.m21836W(m21822n4), i2 + 5, persistentHashMapBuilder.m21875l());
        }
    }

    /* renamed from: I */
    private final TrieNode m21850I(int i, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.m21872o(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.m21873n(m21836W(i));
        if (this.f17056d.length == 2) {
            return null;
        }
        if (this.f17055c == persistentHashMapBuilder.m21875l()) {
            this.f17056d = C6224x.m21792b(this.f17056d, i);
            this.f17053a ^= i2;
            return this;
        }
        return new TrieNode(i2 ^ this.f17053a, this.f17054b, C6224x.m21792b(this.f17056d, i), persistentHashMapBuilder.m21875l());
    }

    /* renamed from: J */
    private final TrieNode m21849J(int i, int i2, C6960e c6960e) {
        Object[] objArr = this.f17056d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f17055c == c6960e) {
            this.f17056d = C6224x.m21791c(objArr, i);
            this.f17054b ^= i2;
            return this;
        }
        return new TrieNode(this.f17053a, i2 ^ this.f17054b, C6224x.m21791c(objArr, i), c6960e);
    }

    /* renamed from: K */
    private final TrieNode m21848K(TrieNode trieNode, TrieNode trieNode2, int i, int i2, C6960e c6960e) {
        if (trieNode2 == null) {
            return m21849J(i, i2, c6960e);
        }
        return (this.f17055c == c6960e || trieNode != trieNode2) ? m21847L(i, trieNode2, c6960e) : this;
    }

    /* renamed from: L */
    private final TrieNode m21847L(int i, TrieNode trieNode, C6960e c6960e) {
        Object[] objArr = this.f17056d;
        if (objArr.length == 1 && trieNode.f17056d.length == 2 && trieNode.f17054b == 0) {
            trieNode.f17053a = this.f17054b;
            return trieNode;
        } else if (this.f17055c == c6960e) {
            objArr[i] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
            copyOf[i] = trieNode;
            return new TrieNode(this.f17053a, this.f17054b, copyOf, c6960e);
        }
    }

    /* renamed from: M */
    private final TrieNode m21846M(int i, Object obj, PersistentHashMapBuilder persistentHashMapBuilder) {
        if (this.f17055c == persistentHashMapBuilder.m21875l()) {
            this.f17056d[i + 1] = obj;
            return this;
        }
        persistentHashMapBuilder.m21874m(persistentHashMapBuilder.m21877j() + 1);
        Object[] objArr = this.f17056d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = obj;
        return new TrieNode(this.f17053a, this.f17054b, copyOf, persistentHashMapBuilder.m21875l());
    }

    /* renamed from: R */
    private final TrieNode m21841R(int i, int i2) {
        Object[] objArr = this.f17056d;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode(i2 ^ this.f17053a, this.f17054b, C6224x.m21792b(objArr, i));
    }

    /* renamed from: S */
    private final TrieNode m21840S(int i, int i2) {
        Object[] objArr = this.f17056d;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode(this.f17053a, i2 ^ this.f17054b, C6224x.m21791c(objArr, i));
    }

    /* renamed from: T */
    private final TrieNode m21839T(TrieNode trieNode, TrieNode trieNode2, int i, int i2) {
        if (trieNode2 == null) {
            return m21840S(i, i2);
        }
        return trieNode != trieNode2 ? m21838U(i, i2, trieNode2) : this;
    }

    /* renamed from: U */
    private final TrieNode m21838U(int i, int i2, TrieNode trieNode) {
        Object[] objArr = trieNode.f17056d;
        if (objArr.length == 2 && trieNode.f17054b == 0) {
            if (this.f17056d.length == 1) {
                trieNode.f17053a = this.f17054b;
                return trieNode;
            }
            return new TrieNode(this.f17053a ^ i2, i2 ^ this.f17054b, C6224x.m21789e(this.f17056d, i, m21822n(i2), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.f17056d;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        copyOf[i] = trieNode;
        return new TrieNode(this.f17053a, this.f17054b, copyOf);
    }

    /* renamed from: V */
    private final TrieNode m21837V(int i, Object obj) {
        Object[] objArr = this.f17056d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = obj;
        return new TrieNode(this.f17053a, this.f17054b, copyOf);
    }

    /* renamed from: W */
    private final Object m21836W(int i) {
        return this.f17056d[i + 1];
    }

    /* renamed from: a */
    public static final /* synthetic */ TrieNode m21835a() {
        return f17052f;
    }

    /* renamed from: b */
    private final C6220b m21834b() {
        return new C6220b(this, 1);
    }

    /* renamed from: c */
    private final C6220b m21833c() {
        return new C6220b(this, 0);
    }

    /* renamed from: d */
    private final Object[] m21832d(int i, int i2, int i3, Object obj, Object obj2, int i4, C6960e c6960e) {
        Object m21816t = m21816t(i);
        return C6224x.m21790d(this.f17056d, i, m21844O(i2) + 1, m21815u(m21816t == null ? 0 : m21816t.hashCode(), m21816t, m21836W(i), i3, obj, obj2, i4 + 5, c6960e));
    }

    /* renamed from: e */
    private final int m21831e() {
        if (this.f17054b == 0) {
            return this.f17056d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f17053a);
        int length = this.f17056d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += m21845N(i).m21831e();
        }
        return bitCount;
    }

    /* renamed from: f */
    private final boolean m21830f(Object obj) {
        C8611f m14992q;
        C8608d m14993p;
        m14992q = _Ranges.m14992q(0, this.f17056d.length);
        m14993p = _Ranges.m14993p(m14992q, 2);
        int m15034f = m14993p.m15034f();
        int m15033h = m14993p.m15033h();
        int m15032l = m14993p.m15032l();
        if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
            while (true) {
                int i = m15034f + m15032l;
                if (Intrinsics.equals(obj, this.f17056d[m15034f])) {
                    return true;
                }
                if (m15034f == m15033h) {
                    break;
                }
                m15034f = i;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final Object m21829g(Object obj) {
        C8611f m14992q;
        C8608d m14993p;
        m14992q = _Ranges.m14992q(0, this.f17056d.length);
        m14993p = _Ranges.m14993p(m14992q, 2);
        int m15034f = m14993p.m15034f();
        int m15033h = m14993p.m15033h();
        int m15032l = m14993p.m15032l();
        if ((m15032l <= 0 || m15034f > m15033h) && (m15032l >= 0 || m15033h > m15034f)) {
            return null;
        }
        while (true) {
            int i = m15034f + m15032l;
            if (Intrinsics.equals(obj, m21816t(m15034f))) {
                return m21836W(m15034f);
            }
            if (m15034f == m15033h) {
                return null;
            }
            m15034f = i;
        }
    }

    /* renamed from: h */
    private final C6220b m21828h(Object obj, Object obj2) {
        C8611f m14992q;
        C8608d m14993p;
        m14992q = _Ranges.m14992q(0, this.f17056d.length);
        m14993p = _Ranges.m14993p(m14992q, 2);
        int m15034f = m14993p.m15034f();
        int m15033h = m14993p.m15033h();
        int m15032l = m14993p.m15032l();
        if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
            while (true) {
                int i = m15034f + m15032l;
                if (Intrinsics.equals(obj, m21816t(m15034f))) {
                    if (obj2 == m21836W(m15034f)) {
                        return null;
                    }
                    Object[] objArr = this.f17056d;
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
                    copyOf[m15034f + 1] = obj2;
                    return new TrieNode(0, 0, copyOf).m21833c();
                } else if (m15034f == m15033h) {
                    break;
                } else {
                    m15034f = i;
                }
            }
        }
        return new TrieNode(0, 0, C6224x.m21793a(this.f17056d, 0, obj, obj2)).m21834b();
    }

    /* renamed from: i */
    private final TrieNode m21827i(Object obj) {
        C8611f m14992q;
        C8608d m14993p;
        m14992q = _Ranges.m14992q(0, this.f17056d.length);
        m14993p = _Ranges.m14993p(m14992q, 2);
        int m15034f = m14993p.m15034f();
        int m15033h = m14993p.m15033h();
        int m15032l = m14993p.m15032l();
        if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
            while (true) {
                int i = m15034f + m15032l;
                if (Intrinsics.equals(obj, m21816t(m15034f))) {
                    return m21826j(m15034f);
                }
                if (m15034f == m15033h) {
                    break;
                }
                m15034f = i;
            }
        }
        return this;
    }

    /* renamed from: j */
    private final TrieNode m21826j(int i) {
        Object[] objArr = this.f17056d;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode(0, 0, C6224x.m21792b(objArr, i));
    }

    /* renamed from: l */
    private final boolean m21824l(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f17054b == trieNode.f17054b && this.f17053a == trieNode.f17053a) {
            int length = this.f17056d.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (this.f17056d[i] != trieNode.f17056d[i]) {
                    return false;
                }
                i = i2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private final boolean m21818r(int i) {
        return (i & this.f17054b) != 0;
    }

    /* renamed from: s */
    private final TrieNode m21817s(int i, Object obj, Object obj2) {
        return new TrieNode(i | this.f17053a, this.f17054b, C6224x.m21793a(this.f17056d, m21822n(i), obj, obj2));
    }

    /* renamed from: t */
    private final Object m21816t(int i) {
        return this.f17056d[i];
    }

    /* renamed from: u */
    private final TrieNode m21815u(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C6960e c6960e) {
        if (i3 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj2, obj3, obj4}, c6960e);
        }
        int m21788f = C6224x.m21788f(i, i3);
        int m21788f2 = C6224x.m21788f(i2, i3);
        if (m21788f != m21788f2) {
            return new TrieNode((1 << m21788f) | (1 << m21788f2), 0, m21788f < m21788f2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c6960e);
        }
        return new TrieNode(0, 1 << m21788f, new Object[]{m21815u(i, obj, obj2, i2, obj3, obj4, i3 + 5, c6960e)}, c6960e);
    }

    /* renamed from: v */
    private final TrieNode m21814v(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        return new TrieNode(this.f17053a ^ i2, i2 | this.f17054b, m21832d(i, i2, i3, obj, obj2, i4, null));
    }

    /* renamed from: w */
    private final TrieNode m21813w(Object obj, Object obj2, PersistentHashMapBuilder persistentHashMapBuilder) {
        C8611f m14992q;
        C8608d m14993p;
        m14992q = _Ranges.m14992q(0, this.f17056d.length);
        m14993p = _Ranges.m14993p(m14992q, 2);
        int m15034f = m14993p.m15034f();
        int m15033h = m14993p.m15033h();
        int m15032l = m14993p.m15032l();
        if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
            while (true) {
                int i = m15034f + m15032l;
                if (Intrinsics.equals(obj, m21816t(m15034f))) {
                    persistentHashMapBuilder.m21873n(m21836W(m15034f));
                    if (this.f17055c == persistentHashMapBuilder.m21875l()) {
                        this.f17056d[m15034f + 1] = obj2;
                        return this;
                    }
                    persistentHashMapBuilder.m21874m(persistentHashMapBuilder.m21877j() + 1);
                    Object[] objArr = this.f17056d;
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
                    copyOf[m15034f + 1] = obj2;
                    return new TrieNode(0, 0, copyOf, persistentHashMapBuilder.m21875l());
                } else if (m15034f == m15033h) {
                    break;
                } else {
                    m15034f = i;
                }
            }
        }
        persistentHashMapBuilder.m21872o(persistentHashMapBuilder.size() + 1);
        return new TrieNode(0, 0, C6224x.m21793a(this.f17056d, 0, obj, obj2), persistentHashMapBuilder.m21875l());
    }

    /* renamed from: x */
    private final TrieNode m21812x(TrieNode trieNode, C6957b c6957b, C6960e c6960e) {
        C8611f m14992q;
        C8608d m14993p;
        C6956a.m19707a(this.f17054b == 0);
        C6956a.m19707a(this.f17053a == 0);
        C6956a.m19707a(trieNode.f17054b == 0);
        C6956a.m19707a(trieNode.f17053a == 0);
        Object[] objArr = this.f17056d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f17056d.length);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        int length = this.f17056d.length;
        m14992q = _Ranges.m14992q(0, trieNode.f17056d.length);
        m14993p = _Ranges.m14993p(m14992q, 2);
        int m15034f = m14993p.m15034f();
        int m15033h = m14993p.m15033h();
        int m15032l = m14993p.m15032l();
        if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
            while (true) {
                int i = m15034f + m15032l;
                if (!m21830f(trieNode.f17056d[m15034f])) {
                    Object[] objArr2 = trieNode.f17056d;
                    copyOf[length] = objArr2[m15034f];
                    copyOf[length + 1] = objArr2[m15034f + 1];
                    length += 2;
                } else {
                    c6957b.m19704c(c6957b.m19706a() + 1);
                }
                if (m15034f == m15033h) {
                    break;
                }
                m15034f = i;
            }
        }
        if (length == this.f17056d.length) {
            return this;
        }
        if (length == trieNode.f17056d.length) {
            return trieNode;
        }
        if (length == copyOf.length) {
            return new TrieNode(0, 0, copyOf, c6960e);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        Intrinsics.checkIfNull(copyOf2, "copyOf(this, newSize)");
        return new TrieNode(0, 0, copyOf2, c6960e);
    }

    /* renamed from: y */
    private final TrieNode m21811y(Object obj, PersistentHashMapBuilder persistentHashMapBuilder) {
        C8611f m14992q;
        C8608d m14993p;
        m14992q = _Ranges.m14992q(0, this.f17056d.length);
        m14993p = _Ranges.m14993p(m14992q, 2);
        int m15034f = m14993p.m15034f();
        int m15033h = m14993p.m15033h();
        int m15032l = m14993p.m15032l();
        if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
            while (true) {
                int i = m15034f + m15032l;
                if (Intrinsics.equals(obj, m21816t(m15034f))) {
                    return m21858A(m15034f, persistentHashMapBuilder);
                }
                if (m15034f == m15033h) {
                    break;
                }
                m15034f = i;
            }
        }
        return this;
    }

    /* renamed from: z */
    private final TrieNode m21810z(Object obj, Object obj2, PersistentHashMapBuilder persistentHashMapBuilder) {
        C8611f m14992q;
        C8608d m14993p;
        m14992q = _Ranges.m14992q(0, this.f17056d.length);
        m14993p = _Ranges.m14993p(m14992q, 2);
        int m15034f = m14993p.m15034f();
        int m15033h = m14993p.m15033h();
        int m15032l = m14993p.m15032l();
        if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
            while (true) {
                int i = m15034f + m15032l;
                if (Intrinsics.equals(obj, m21816t(m15034f)) && Intrinsics.equals(obj2, m21836W(m15034f))) {
                    return m21858A(m15034f, persistentHashMapBuilder);
                }
                if (m15034f == m15033h) {
                    break;
                }
                m15034f = i;
            }
        }
        return this;
    }

    /* renamed from: D */
    public final TrieNode m21855D(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode m21855D;
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "mutator");
        int m21788f = 1 << C6224x.m21788f(i, i2);
        if (m21819q(m21788f)) {
            int m21822n = m21822n(m21788f);
            if (Intrinsics.equals(obj, m21816t(m21822n))) {
                persistentHashMapBuilder.m21873n(m21836W(m21822n));
                return m21836W(m21822n) == obj2 ? this : m21846M(m21822n, obj2, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.m21872o(persistentHashMapBuilder.size() + 1);
            return m21856C(m21822n, m21788f, i, obj, obj2, i2, persistentHashMapBuilder.m21875l());
        } else if (m21818r(m21788f)) {
            int m21844O = m21844O(m21788f);
            TrieNode m21845N = m21845N(m21844O);
            if (i2 == 30) {
                m21855D = m21845N.m21813w(obj, obj2, persistentHashMapBuilder);
            } else {
                m21855D = m21845N.m21855D(i, obj, obj2, i2 + 5, persistentHashMapBuilder);
            }
            return m21845N == m21855D ? this : m21847L(m21844O, m21855D, persistentHashMapBuilder.m21875l());
        } else {
            persistentHashMapBuilder.m21872o(persistentHashMapBuilder.size() + 1);
            return m21857B(m21788f, obj, obj2, persistentHashMapBuilder.m21875l());
        }
    }

    /* renamed from: E */
    public final TrieNode m21854E(TrieNode trieNode, int i, C6957b c6957b, PersistentHashMapBuilder persistentHashMapBuilder) {
        Intrinsics.isThisObjectNull(trieNode, "otherNode");
        Intrinsics.isThisObjectNull(c6957b, "intersectionCounter");
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "mutator");
        if (this == trieNode) {
            c6957b.m19705b(m21831e());
            return this;
        } else if (i > 30) {
            return m21812x(trieNode, c6957b, persistentHashMapBuilder.m21875l());
        } else {
            int i2 = this.f17054b | trieNode.f17054b;
            int i3 = this.f17053a;
            int i4 = trieNode.f17053a;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (Intrinsics.equals(m21816t(m21822n(lowestOneBit)), trieNode.m21816t(trieNode.m21822n(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            int i7 = 0;
            if ((i2 & i6) == 0) {
                TrieNode trieNode2 = (Intrinsics.equals(this.f17055c, persistentHashMapBuilder.m21875l()) && this.f17053a == i6 && this.f17054b == i2) ? this : new TrieNode(i6, i2, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i2)]);
                int i8 = i2;
                int i9 = 0;
                while (i8 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i8);
                    trieNode2.m21820p()[(trieNode2.m21820p().length - 1) - i9] = m21853F(trieNode, lowestOneBit2, i, c6957b, persistentHashMapBuilder);
                    i9++;
                    i8 ^= lowestOneBit2;
                }
                while (i6 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i6);
                    int i10 = i7 * 2;
                    if (!trieNode.m21819q(lowestOneBit3)) {
                        int m21822n = m21822n(lowestOneBit3);
                        trieNode2.m21820p()[i10] = m21816t(m21822n);
                        trieNode2.m21820p()[i10 + 1] = m21836W(m21822n);
                    } else {
                        int m21822n2 = trieNode.m21822n(lowestOneBit3);
                        trieNode2.m21820p()[i10] = trieNode.m21816t(m21822n2);
                        trieNode2.m21820p()[i10 + 1] = trieNode.m21836W(m21822n2);
                        if (m21819q(lowestOneBit3)) {
                            c6957b.m19704c(c6957b.m19706a() + 1);
                        }
                    }
                    i7++;
                    i6 ^= lowestOneBit3;
                }
                return m21824l(trieNode2) ? this : trieNode.m21824l(trieNode2) ? trieNode : trieNode2;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: G */
    public final TrieNode m21852G(int i, Object obj, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode m21852G;
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "mutator");
        int m21788f = 1 << C6224x.m21788f(i, i2);
        if (m21819q(m21788f)) {
            int m21822n = m21822n(m21788f);
            return Intrinsics.equals(obj, m21816t(m21822n)) ? m21850I(m21822n, m21788f, persistentHashMapBuilder) : this;
        } else if (m21818r(m21788f)) {
            int m21844O = m21844O(m21788f);
            TrieNode m21845N = m21845N(m21844O);
            if (i2 == 30) {
                m21852G = m21845N.m21811y(obj, persistentHashMapBuilder);
            } else {
                m21852G = m21845N.m21852G(i, obj, i2 + 5, persistentHashMapBuilder);
            }
            return m21848K(m21845N, m21852G, m21844O, m21788f, persistentHashMapBuilder.m21875l());
        } else {
            return this;
        }
    }

    /* renamed from: H */
    public final TrieNode m21851H(int i, Object obj, Object obj2, int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode m21851H;
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "mutator");
        int m21788f = 1 << C6224x.m21788f(i, i2);
        if (m21819q(m21788f)) {
            int m21822n = m21822n(m21788f);
            return (Intrinsics.equals(obj, m21816t(m21822n)) && Intrinsics.equals(obj2, m21836W(m21822n))) ? m21850I(m21822n, m21788f, persistentHashMapBuilder) : this;
        } else if (m21818r(m21788f)) {
            int m21844O = m21844O(m21788f);
            TrieNode m21845N = m21845N(m21844O);
            if (i2 == 30) {
                m21851H = m21845N.m21810z(obj, obj2, persistentHashMapBuilder);
            } else {
                m21851H = m21845N.m21851H(i, obj, obj2, i2 + 5, persistentHashMapBuilder);
            }
            return m21848K(m21845N, m21851H, m21844O, m21788f, persistentHashMapBuilder.m21875l());
        } else {
            return this;
        }
    }

    /* renamed from: N */
    public final TrieNode m21845N(int i) {
        Object obj = this.f17056d[i];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    /* renamed from: O */
    public final int m21844O(int i) {
        return (this.f17056d.length - 1) - Integer.bitCount((i - 1) & this.f17054b);
    }

    /* renamed from: P */
    public final C6220b m21843P(int i, Object obj, Object obj2, int i2) {
        C6220b m21843P;
        int m21788f = 1 << C6224x.m21788f(i, i2);
        if (m21819q(m21788f)) {
            int m21822n = m21822n(m21788f);
            if (Intrinsics.equals(obj, m21816t(m21822n))) {
                if (m21836W(m21822n) == obj2) {
                    return null;
                }
                return m21837V(m21822n, obj2).m21833c();
            }
            return m21814v(m21822n, m21788f, i, obj, obj2, i2).m21834b();
        } else if (m21818r(m21788f)) {
            int m21844O = m21844O(m21788f);
            TrieNode m21845N = m21845N(m21844O);
            if (i2 == 30) {
                m21843P = m21845N.m21828h(obj, obj2);
                if (m21843P == null) {
                    return null;
                }
            } else {
                m21843P = m21845N.m21843P(i, obj, obj2, i2 + 5);
                if (m21843P == null) {
                    return null;
                }
            }
            m21843P.m21806c(m21838U(m21844O, m21788f, m21843P.m21808a()));
            return m21843P;
        } else {
            return m21817s(m21788f, obj, obj2).m21834b();
        }
    }

    /* renamed from: Q */
    public final TrieNode m21842Q(int i, Object obj, int i2) {
        TrieNode m21842Q;
        int m21788f = 1 << C6224x.m21788f(i, i2);
        if (m21819q(m21788f)) {
            int m21822n = m21822n(m21788f);
            return Intrinsics.equals(obj, m21816t(m21822n)) ? m21841R(m21822n, m21788f) : this;
        } else if (m21818r(m21788f)) {
            int m21844O = m21844O(m21788f);
            TrieNode m21845N = m21845N(m21844O);
            if (i2 == 30) {
                m21842Q = m21845N.m21827i(obj);
            } else {
                m21842Q = m21845N.m21842Q(i, obj, i2 + 5);
            }
            return m21839T(m21845N, m21842Q, m21844O, m21788f);
        } else {
            return this;
        }
    }

    /* renamed from: k */
    public final boolean m21825k(int i, Object obj, int i2) {
        int m21788f = 1 << C6224x.m21788f(i, i2);
        if (m21819q(m21788f)) {
            return Intrinsics.equals(obj, m21816t(m21822n(m21788f)));
        }
        if (m21818r(m21788f)) {
            TrieNode m21845N = m21845N(m21844O(m21788f));
            if (i2 == 30) {
                return m21845N.m21830f(obj);
            }
            return m21845N.m21825k(i, obj, i2 + 5);
        }
        return false;
    }

    /* renamed from: m */
    public final int m21823m() {
        return Integer.bitCount(this.f17053a);
    }

    /* renamed from: n */
    public final int m21822n(int i) {
        return Integer.bitCount((i - 1) & this.f17053a) * 2;
    }

    /* renamed from: o */
    public final Object m21821o(int i, Object obj, int i2) {
        int m21788f = 1 << C6224x.m21788f(i, i2);
        if (m21819q(m21788f)) {
            int m21822n = m21822n(m21788f);
            if (Intrinsics.equals(obj, m21816t(m21822n))) {
                return m21836W(m21822n);
            }
            return null;
        } else if (m21818r(m21788f)) {
            TrieNode m21845N = m21845N(m21844O(m21788f));
            if (i2 == 30) {
                return m21845N.m21829g(obj);
            }
            return m21845N.m21821o(i, obj, i2 + 5);
        } else {
            return null;
        }
    }

    /* renamed from: p */
    public final Object[] m21820p() {
        return this.f17056d;
    }

    /* renamed from: q */
    public final boolean m21819q(int i) {
        return (i & this.f17053a) != 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
        Intrinsics.isThisObjectNull(objArr, "buffer");
    }
}
