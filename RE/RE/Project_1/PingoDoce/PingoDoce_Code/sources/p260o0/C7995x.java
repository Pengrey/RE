package p260o0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p203kd.InterfaceC6653d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
/* renamed from: o0.x */
/* loaded from: classes.dex */
public final class C7995x<K, V> extends AbstractC7997y implements Iterator, InterfaceC6650a {

    /* compiled from: SnapshotStateMap.kt */
    /* renamed from: o0.x$a */
    /* loaded from: classes.dex */
    public static final class C7996a implements Map.Entry, InterfaceC6653d.InterfaceC6654a {

        /* renamed from: w */
        private final Object f20714w;

        /* renamed from: x */
        private Object f20715x;

        C7996a() {
            Map.Entry m17208d = C7995x.this.m17208d();
            Intrinsics.ifNullDoSomething(m17208d);
            this.f20714w = m17208d.getKey();
            Map.Entry m17208d2 = C7995x.this.m17208d();
            Intrinsics.ifNullDoSomething(m17208d2);
            this.f20715x = m17208d2.getValue();
        }

        /* renamed from: a */
        public void m17212a(Object obj) {
            this.f20715x = obj;
        }

        public Object getKey() {
            return this.f20714w;
        }

        public Object getValue() {
            return this.f20715x;
        }

        public Object setValue(Object obj) {
            C7995x c7995x = C7995x.this;
            if (c7995x.m17207e().m17250j() == AbstractC7997y.m17211a(c7995x)) {
                Object value = getValue();
                c7995x.m17207e().put(getKey(), obj);
                m17212a(obj);
                return value;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7995x(C7987t c7987t, Iterator it) {
        super(c7987t, it);
        Intrinsics.isThisObjectNull(c7987t, "map");
        Intrinsics.isThisObjectNull(it, "iterator");
    }

    /* renamed from: j */
    public Map.Entry mo16093j() {
        m17209c();
        if (m17208d() != null) {
            return new C7996a();
        }
        throw new IllegalStateException();
    }
}
