package p396v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p489zc.C13769l0;
import p489zc.C13777q;
import p489zc.C13780s;

/* renamed from: v3.c */
/* loaded from: classes.dex */
public final class C11091c {
    /* renamed from: a */
    public static final <T> List<T> m6170a(List<? extends T> list) {
        List<T> m197g;
        int size = list.size();
        if (size == 0) {
            m197g = C13780s.m197g();
            return m197g;
        } else if (size != 1) {
            return Collections.unmodifiableList(new ArrayList(list));
        } else {
            return Collections.singletonList(C13777q.m256L(list));
        }
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m6169b(Map<K, ? extends V> map) {
        Map<K, V> m334e;
        int size = map.size();
        if (size == 0) {
            m334e = C13769l0.m334e();
            return m334e;
        } else if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        } else {
            Map.Entry entry = (Map.Entry) C13777q.m257K(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
    }
}
