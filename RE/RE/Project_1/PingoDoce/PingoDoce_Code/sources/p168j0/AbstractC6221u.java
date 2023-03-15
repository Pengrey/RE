package p168j0;

import java.util.Iterator;
import java.util.Objects;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p210l0.C6956a;

/* compiled from: PersistentHashMapContentIterators.kt */
/* renamed from: j0.u */
/* loaded from: classes.dex */
public abstract class AbstractC6221u<K, V, T> implements Iterator, InterfaceC6650a {

    /* renamed from: w */
    private Object[] f17059w = TrieNode.f17051e.m21809a().m21820p();

    /* renamed from: x */
    private int f17060x;

    /* renamed from: y */
    private int f17061y;

    /* renamed from: a */
    public final Object m21805a() {
        C6956a.m19707a(m21801e());
        return this.f17059w[this.f17061y];
    }

    /* renamed from: b */
    public final TrieNode m21804b() {
        C6956a.m19707a(m21800f());
        Object obj = this.f17059w[this.f17061y];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Object[] m21803c() {
        return this.f17059w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final int m21802d() {
        return this.f17061y;
    }

    /* renamed from: e */
    public final boolean m21801e() {
        return this.f17061y < this.f17060x;
    }

    /* renamed from: f */
    public final boolean m21800f() {
        C6956a.m19707a(this.f17061y >= this.f17060x);
        return this.f17061y < this.f17059w.length;
    }

    /* renamed from: h */
    public final void m21799h() {
        C6956a.m19707a(m21801e());
        this.f17061y += 2;
    }

    public boolean hasNext() {
        return m21801e();
    }

    /* renamed from: j */
    public final void m21798j() {
        C6956a.m19707a(m21800f());
        this.f17061y++;
    }

    /* renamed from: k */
    public final void m21797k(Object[] objArr, int i) {
        Intrinsics.isThisObjectNull(objArr, "buffer");
        m21796l(objArr, i, 0);
    }

    /* renamed from: l */
    public final void m21796l(Object[] objArr, int i, int i2) {
        Intrinsics.isThisObjectNull(objArr, "buffer");
        this.f17059w = objArr;
        this.f17060x = i;
        this.f17061y = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final void m21795m(int i) {
        this.f17061y = i;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
