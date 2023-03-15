package p269o9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p219l9.C7011f;

/* renamed from: o9.b */
/* loaded from: classes.dex */
class C8036b {

    /* renamed from: a */
    private final Map<String, String> f20776a = new HashMap();

    /* renamed from: b */
    private final int f20777b;

    /* renamed from: c */
    private final int f20778c;

    public C8036b(int i, int i2) {
        this.f20777b = i;
        this.f20778c = i2;
    }

    /* renamed from: b */
    private String m17117b(String str) {
        if (str != null) {
            return m17116c(str, this.f20778c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m17116c(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > i ? trim.substring(0, i) : trim;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized Map<String, String> m17118a() {
        return Collections.unmodifiableMap(new HashMap(this.f20776a));
    }

    /* renamed from: d */
    public synchronized void m17115d(Map<String, String> map) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m17117b = m17117b(entry.getKey());
            if (this.f20776a.size() >= this.f20777b && !this.f20776a.containsKey(m17117b)) {
                i++;
            }
            String value = entry.getValue();
            this.f20776a.put(m17117b, value == null ? BuildConfig.VERSION_NAME : m17116c(value, this.f20778c));
        }
        if (i > 0) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19606k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f20777b);
        }
    }
}
