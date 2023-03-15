package p168j0;

import java.util.ConcurrentModificationException;
import p181jd.Intrinsics;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* renamed from: j0.g */
/* loaded from: classes.dex */
public class C6207g<K, V, T> extends PersistentHashMapContentIterators {

    /* renamed from: A */
    private Object f17040A;

    /* renamed from: B */
    private boolean f17041B;

    /* renamed from: C */
    private int f17042C;

    /* renamed from: z */
    private final PersistentHashMapBuilder f17043z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6207g(PersistentHashMapBuilder persistentHashMapBuilder, AbstractC6221u[] abstractC6221uArr) {
        super(persistentHashMapBuilder.m21876k(), abstractC6221uArr);
        Intrinsics.isThisObjectNull(persistentHashMapBuilder, "builder");
        Intrinsics.isThisObjectNull(abstractC6221uArr, "path");
        this.f17043z = persistentHashMapBuilder;
        this.f17042C = persistentHashMapBuilder.m21877j();
    }

    /* renamed from: h */
    private final void m21871h() {
        if (this.f17043z.m21877j() != this.f17042C) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: j */
    private final void m21870j() {
        if (!this.f17041B) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    private final void m21869k(int i, TrieNode trieNode, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            m21881d()[i2].m21796l(trieNode.m21820p(), trieNode.m21820p().length, 0);
            while (!Intrinsics.equals(m21881d()[i2].m21805a(), obj)) {
                m21881d()[i2].m21799h();
            }
            m21879f(i2);
            return;
        }
        int m21788f = 1 << C6224x.m21788f(i, i3);
        if (trieNode.m21819q(m21788f)) {
            m21881d()[i2].m21796l(trieNode.m21820p(), trieNode.m21823m() * 2, trieNode.m21822n(m21788f));
            m21879f(i2);
            return;
        }
        int m21844O = trieNode.m21844O(m21788f);
        TrieNode m21845N = trieNode.m21845N(m21844O);
        m21881d()[i2].m21796l(trieNode.m21820p(), trieNode.m21823m() * 2, m21844O);
        m21869k(i, m21845N, obj, i2 + 1);
    }

    /* renamed from: l */
    public final void m21868l(Object obj, Object obj2) {
        if (this.f17043z.containsKey(obj)) {
            if (hasNext()) {
                Object m21883b = m21883b();
                this.f17043z.put(obj, obj2);
                m21869k(m21883b == null ? 0 : m21883b.hashCode(), this.f17043z.m21876k(), m21883b, 0);
            } else {
                this.f17043z.put(obj, obj2);
            }
            this.f17042C = this.f17043z.m21877j();
        }
    }

    public Object next() {
        m21871h();
        this.f17040A = m21883b();
        this.f17041B = true;
        return super.next();
    }

    public void remove() {
        m21870j();
        if (hasNext()) {
            Object m21883b = m21883b();
            this.f17043z.remove(this.f17040A);
            m21869k(m21883b == null ? 0 : m21883b.hashCode(), this.f17043z.m21876k(), m21883b, 0);
        } else {
            this.f17043z.remove(this.f17040A);
        }
        this.f17040A = null;
        this.f17041B = false;
        this.f17042C = this.f17043z.m21877j();
    }
}
