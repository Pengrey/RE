package p010a9;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a9.b */
/* loaded from: classes.dex */
public final class C0092b {

    /* renamed from: a */
    private final Map<String, Object> f195a = new HashMap();

    /* renamed from: a */
    public final synchronized void m41968a(Bundle bundle) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && this.f195a.get(str) == null) {
                this.f195a.put(str, obj);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m41967b() {
        Object obj = this.f195a.get("usingExtractorStream");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }
}
