package p482z4;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p181jd.Intrinsics;

/* renamed from: z4.m */
/* loaded from: classes.dex */
public final class ProfileInformationCache {

    /* renamed from: a */
    private static final ConcurrentHashMap f34707a;

    static {
        new ProfileInformationCache();
        f34707a = new ConcurrentHashMap();
    }

    private ProfileInformationCache() {
    }

    /* renamed from: a */
    public static final JSONObject m682a(String str) {
        Intrinsics.isThisObjectNull(str, "accessToken");
        return (JSONObject) f34707a.get(str);
    }

    /* renamed from: b */
    public static final void m681b(String str, JSONObject jSONObject) {
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(jSONObject, "value");
        f34707a.put(str, jSONObject);
    }
}
