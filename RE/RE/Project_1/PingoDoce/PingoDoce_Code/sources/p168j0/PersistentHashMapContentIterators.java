package p168j0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: j0.e */
/* loaded from: classes.dex */
public abstract class PersistentHashMapContentIterators<K, V, T> implements Iterator, InterfaceC6650a {

    /* renamed from: w */
    private final AbstractC6221u[] f17031w;

    /* renamed from: x */
    private int f17032x;

    /* renamed from: y */
    private boolean f17033y;

    public PersistentHashMapContentIterators(TrieNode trieNode, AbstractC6221u[] abstractC6221uArr) {
        Intrinsics.isThisObjectNull(trieNode, "node");
        Intrinsics.isThisObjectNull(abstractC6221uArr, "path");
        this.f17031w = abstractC6221uArr;
        this.f17033y = true;
        abstractC6221uArr[0].m21797k(trieNode.m21820p(), trieNode.m21823m() * 2);
        this.f17032x = 0;
        m21882c();
    }

    /* renamed from: a */
    private final void m21884a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c */
    private final void m21882c() {
        if (this.f17031w[this.f17032x].m21801e()) {
            return;
        }
        int i = this.f17032x;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                int m21880e = m21880e(i);
                if (m21880e == -1 && this.f17031w[i].m21800f()) {
                    this.f17031w[i].m21798j();
                    m21880e = m21880e(i);
                }
                if (m21880e != -1) {
                    this.f17032x = m21880e;
                    return;
                }
                if (i > 0) {
                    this.f17031w[i - 1].m21798j();
                }
                this.f17031w[i].m21797k(TrieNode.f17051e.m21809a().m21820p(), 0);
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
        }
        this.f17033y = false;
    }

    /* renamed from: e */
    private final int m21880e(int i) {
        if (this.f17031w[i].m21801e()) {
            return i;
        }
        if (this.f17031w[i].m21800f()) {
            TrieNode m21804b = this.f17031w[i].m21804b();
            if (i == 6) {
                this.f17031w[i + 1].m21797k(m21804b.m21820p(), m21804b.m21820p().length);
            } else {
                this.f17031w[i + 1].m21797k(m21804b.m21820p(), m21804b.m21823m() * 2);
            }
            return m21880e(i + 1);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Object m21883b() {
        m21884a();
        return this.f17031w[this.f17032x].m21805a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final AbstractC6221u[] m21881d() {
        return this.f17031w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final void m21879f(int i) {
        this.f17032x = i;
    }

    public boolean hasNext() {
        return this.f17033y;
    }

    public Object next() {
        m21884a();
        Object next = this.f17031w[this.f17032x].next();
        m21882c();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
