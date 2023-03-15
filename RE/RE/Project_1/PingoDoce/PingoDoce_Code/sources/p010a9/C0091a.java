package p010a9;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p031b9.C1844a;

/* renamed from: a9.a */
/* loaded from: classes.dex */
public class C0091a {

    /* renamed from: a */
    private static final Map<String, Map<String, Integer>> f194a;

    static {
        new HashSet(Arrays.asList("review"));
        new HashSet(Arrays.asList("native", "unity"));
        f194a = new HashMap();
        new C1844a("PlayCoreVersion");
    }

    /* renamed from: a */
    public static Bundle m41970a() {
        Bundle bundle = new Bundle();
        Map<String, Integer> m41969b = m41969b("review");
        bundle.putInt("playcore_version_code", m41969b.get("java").intValue());
        if (m41969b.containsKey("native")) {
            bundle.putInt("playcore_native_version", m41969b.get("native").intValue());
        }
        if (m41969b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", m41969b.get("unity").intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized Map<String, Integer> m41969b(String str) {
        Map<String, Integer> map;
        synchronized (C0091a.class) {
            Map<String, Map<String, Integer>> map2 = f194a;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10800);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        return map;
    }
}
