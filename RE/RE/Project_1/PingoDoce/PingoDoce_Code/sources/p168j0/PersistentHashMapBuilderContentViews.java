package p168j0;

import java.util.Map;
import java.util.Map.Entry;
import p181jd.Intrinsics;
import p489zc.AbstractC13761g;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public abstract class PersistentHashMapBuilderContentViews<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC13761g {
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m21903f((Map.Entry) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m21903f(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
            return m21902h(entry);
        }
        return false;
    }

    /* renamed from: h */
    public abstract boolean m21902h(Map.Entry entry);

    /* renamed from: l */
    public final boolean m21901l(Map.Entry entry) {
        Intrinsics.isThisObjectNull(entry, "element");
        if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
            return m21900o(entry);
        }
        return false;
    }

    /* renamed from: o */
    public abstract boolean m21900o(Map.Entry entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return m21901l((Map.Entry) obj);
        }
        return false;
    }
}
