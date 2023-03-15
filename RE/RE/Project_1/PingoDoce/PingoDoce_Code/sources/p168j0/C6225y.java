package p168j0;

import java.util.Map;
import p181jd.Intrinsics;
import p210l0.C6956a;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* renamed from: j0.y */
/* loaded from: classes.dex */
public final class C6225y<K, V> extends AbstractC6221u {

    /* renamed from: z */
    private final C6209i f17062z;

    public C6225y(C6209i c6209i) {
        Intrinsics.isThisObjectNull(c6209i, "parentIterator");
        this.f17062z = c6209i;
    }

    /* renamed from: n */
    public Map.Entry next() {
        C6956a.m19707a(m21801e());
        m21795m(m21802d() + 2);
        return new PersistentHashMapBuilderContentIterators(this.f17062z, m21803c()[m21802d() - 2], m21803c()[m21802d() - 1]);
    }
}
