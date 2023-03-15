package p260o0;

import java.util.Iterator;
import java.util.Map;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
/* renamed from: o0.z */
/* loaded from: classes.dex */
public final class C7998z<K, V> extends AbstractC7997y implements Iterator, InterfaceC6650a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7998z(C7987t c7987t, Iterator it) {
        super(c7987t, it);
        Intrinsics.isThisObjectNull(c7987t, "map");
        Intrinsics.isThisObjectNull(it, "iterator");
    }

    public Object next() {
        Map.Entry m17206f = m17206f();
        if (m17206f != null) {
            m17209c();
            return m17206f.getKey();
        }
        throw new IllegalStateException();
    }
}
