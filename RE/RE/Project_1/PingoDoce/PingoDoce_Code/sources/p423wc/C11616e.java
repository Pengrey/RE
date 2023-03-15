package p423wc;

import java.util.Collections;
import java.util.Map;

/* renamed from: wc.e */
/* loaded from: classes2.dex */
public final class C11616e<K, V> {

    /* renamed from: a */
    private final Map<K, V> f29704a;

    private C11616e(int i) {
        this.f29704a = C11612a.m4597b(i);
    }

    /* renamed from: b */
    public static <K, V> C11616e<K, V> m4592b(int i) {
        return new C11616e<>(i);
    }

    /* renamed from: a */
    public Map<K, V> m4593a() {
        if (this.f29704a.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.f29704a);
    }

    /* renamed from: c */
    public C11616e<K, V> m4591c(K k, V v) {
        this.f29704a.put(k, v);
        return this;
    }
}
