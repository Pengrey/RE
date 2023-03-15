package p168j0;

import java.util.Map;
import p210l0.C6956a;

/* renamed from: j0.v */
/* loaded from: classes.dex */
public final class C6222v<K, V> extends AbstractC6221u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* renamed from: n */
    public Map.Entry<K, V> next() {
        C6956a.m19707a(m21801e());
        m21795m(m21802d() + 2);
        return new C6205b(m21803c()[m21802d() - 2], m21803c()[m21802d() - 1]);
    }
}
