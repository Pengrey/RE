package p148i0;

import java.util.ConcurrentModificationException;
import p181jd.Intrinsics;
import p297pd._Ranges;

/* renamed from: i0.h */
/* loaded from: classes.dex */
public final class PersistentVectorMutableIterator<T> extends AbstractC5981a {

    /* renamed from: A */
    private TrieIterator f16537A;

    /* renamed from: B */
    private int f16538B;

    /* renamed from: y */
    private final PersistentVectorBuilder f16539y;

    /* renamed from: z */
    private int f16540z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size());
        Intrinsics.isThisObjectNull(persistentVectorBuilder, "builder");
        this.f16539y = persistentVectorBuilder;
        this.f16540z = persistentVectorBuilder.m22482o();
        this.f16538B = -1;
        m22470l();
    }

    /* renamed from: h */
    private final void m22473h() {
        if (this.f16540z != this.f16539y.m22482o()) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: j */
    private final void m22472j() {
        if (this.f16538B == -1) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    private final void m22471k() {
        m22531f(this.f16539y.size());
        this.f16540z = this.f16539y.m22482o();
        this.f16538B = -1;
        m22470l();
    }

    /* renamed from: l */
    private final void m22470l() {
        int m15000i;
        Object[] m22481p = this.f16539y.m22481p();
        if (m22481p == null) {
            this.f16537A = null;
            return;
        }
        int m22455d = C5987l.m22455d(this.f16539y.size());
        m15000i = _Ranges.m15000i(m22534c(), m22455d);
        int m22480q = (this.f16539y.m22480q() / 5) + 1;
        TrieIterator trieIterator = this.f16537A;
        if (trieIterator == null) {
            this.f16537A = new TrieIterator(m22481p, m15000i, m22455d, m22480q);
            return;
        }
        Intrinsics.ifNullDoSomething(trieIterator);
        trieIterator.m22459l(m22481p, m15000i, m22455d, m22480q);
    }

    public void add(Object obj) {
        m22473h();
        this.f16539y.add(m22534c(), obj);
        m22532e(m22534c() + 1);
        m22471k();
    }

    public Object next() {
        m22473h();
        m22536a();
        this.f16538B = m22534c();
        TrieIterator trieIterator = this.f16537A;
        if (trieIterator == null) {
            Object[] m22479t = this.f16539y.m22479t();
            int m22534c = m22534c();
            m22532e(m22534c + 1);
            return m22479t[m22534c];
        } else if (trieIterator.hasNext()) {
            m22532e(m22534c() + 1);
            return trieIterator.next();
        } else {
            Object[] m22479t2 = this.f16539y.m22479t();
            int m22534c2 = m22534c();
            m22532e(m22534c2 + 1);
            return m22479t2[m22534c2 - trieIterator.m22533d()];
        }
    }

    public Object previous() {
        m22473h();
        m22535b();
        this.f16538B = m22534c() - 1;
        TrieIterator trieIterator = this.f16537A;
        if (trieIterator == null) {
            Object[] m22479t = this.f16539y.m22479t();
            m22532e(m22534c() - 1);
            return m22479t[m22534c()];
        } else if (m22534c() > trieIterator.m22533d()) {
            Object[] m22479t2 = this.f16539y.m22479t();
            m22532e(m22534c() - 1);
            return m22479t2[m22534c() - trieIterator.m22533d()];
        } else {
            m22532e(m22534c() - 1);
            return trieIterator.previous();
        }
    }

    public void remove() {
        m22473h();
        m22472j();
        this.f16539y.remove(this.f16538B);
        if (this.f16538B < m22534c()) {
            m22532e(this.f16538B);
        }
        m22471k();
    }

    public void set(Object obj) {
        m22473h();
        m22472j();
        this.f16539y.set(this.f16538B, obj);
        this.f16540z = this.f16539y.m22482o();
        m22470l();
    }
}
