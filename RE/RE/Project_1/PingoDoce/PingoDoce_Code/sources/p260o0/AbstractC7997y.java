package p260o0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
/* renamed from: o0.y */
/* loaded from: classes.dex */
public abstract class AbstractC7997y<K, V> {

    /* renamed from: A */
    private Map.Entry f20717A;

    /* renamed from: w */
    private final C7987t f20718w;

    /* renamed from: x */
    private final Iterator f20719x;

    /* renamed from: y */
    private int f20720y;

    /* renamed from: z */
    private Map.Entry f20721z;

    public AbstractC7997y(C7987t c7987t, Iterator it) {
        Intrinsics.isThisObjectNull(c7987t, "map");
        Intrinsics.isThisObjectNull(it, "iterator");
        this.f20718w = c7987t;
        this.f20719x = it;
        this.f20720y = c7987t.m17250j();
        m17209c();
    }

    /* renamed from: a */
    public static final /* synthetic */ int m17211a(AbstractC7997y abstractC7997y) {
        return abstractC7997y.f20720y;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m17210b(AbstractC7997y abstractC7997y, int i) {
        abstractC7997y.f20720y = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m17209c() {
        this.f20721z = this.f20717A;
        this.f20717A = this.f20719x.hasNext() ? (Map.Entry) this.f20719x.next() : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Map.Entry m17208d() {
        return this.f20721z;
    }

    /* renamed from: e */
    public final C7987t m17207e() {
        return this.f20718w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final Map.Entry m17206f() {
        return this.f20717A;
    }

    /* renamed from: h */
    protected final void m17205h(Map.Entry entry) {
        this.f20721z = entry;
    }

    public final boolean hasNext() {
        return this.f20717A != null;
    }

    public final void remove() {
        if (m17207e().m17250j() == m17211a(this)) {
            Map.Entry m17208d = m17208d();
            if (m17208d != null) {
                m17207e().remove(m17208d.getKey());
                m17205h(null);
                C13195u c13195u = C13195u.f34156a;
                m17210b(this, m17207e().m17250j());
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
