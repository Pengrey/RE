package p482z4;

import androidx.constraintlayout.widget.C0868i;
import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p468yc.C13191r;
import p489zc.C13769l0;
import sd.StringsJVM;

/* renamed from: z4.a */
/* loaded from: classes.dex */
public final class C13633a {

    /* renamed from: g */
    private static C13633a f34648g;

    /* renamed from: h */
    public static final C13634a f34649h = new C13634a(null);

    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f34650a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f34651b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f34652c;

    /* renamed from: d */
    private final String f34653d;

    /* renamed from: e */
    private final String f34654e;

    /* renamed from: f */
    private final String f34655f;

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* renamed from: z4.a$a */
    /* loaded from: classes.dex */
    public static final class C13634a {
        private C13634a() {
        }

        /* renamed from: c */
        private final C13633a m757c() {
            HashMap m332g;
            HashMap m332g2;
            m332g = C13769l0.m332g(C13191r.m1447a(2, null), C13191r.m1447a(4, null), C13191r.m1447a(9, null), C13191r.m1447a(17, null), C13191r.m1447a(341, null));
            m332g2 = C13769l0.m332g(C13191r.m1447a(Integer.valueOf((int) C0868i.f2748C0), null), C13191r.m1447a(190, null), C13191r.m1447a(412, null));
            return new C13633a(null, m332g, m332g2, null, null, null);
        }

        /* renamed from: d */
        private final Map<Integer, Set<Integer>> m756d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
            return hashMap;
        }

        /* renamed from: a */
        public final C13633a m759a(JSONArray jSONArray) {
            String optString;
            boolean m8943q;
            boolean m8943q2;
            boolean m8943q3;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map<Integer, Set<Integer>> map = null;
            Map<Integer, Set<Integer>> map2 = null;
            Map<Integer, Set<Integer>> map3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                    m8943q = StringsJVM.m8943q(optString, "other", true);
                    if (m8943q) {
                        str = optJSONObject.optString("recovery_message", null);
                        map = m756d(optJSONObject);
                    } else {
                        m8943q2 = StringsJVM.m8943q(optString, "transient", true);
                        if (m8943q2) {
                            str2 = optJSONObject.optString("recovery_message", null);
                            map2 = m756d(optJSONObject);
                        } else {
                            m8943q3 = StringsJVM.m8943q(optString, "login_recoverable", true);
                            if (m8943q3) {
                                str3 = optJSONObject.optString("recovery_message", null);
                                map3 = m756d(optJSONObject);
                            }
                        }
                    }
                }
            }
            return new C13633a(map, map2, map3, str, str2, str3);
        }

        /* renamed from: b */
        public final synchronized C13633a m758b() {
            C13633a c13633a;
            if (C13633a.f34648g == null) {
                C13633a.f34648g = C13633a.f34649h.m757c();
            }
            c13633a = C13633a.f34648g;
            if (c13633a == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return c13633a;
        }

        public /* synthetic */ C13634a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13633a(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.f34650a = map;
        this.f34651b = map2;
        this.f34652c = map3;
        this.f34653d = str;
        this.f34654e = str2;
        this.f34655f = str3;
    }

    /* renamed from: c */
    public final FacebookRequestError.EnumC2269a m761c(int i, int i2, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return FacebookRequestError.EnumC2269a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f34650a;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = this.f34650a.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.EnumC2269a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f34652c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = this.f34652c.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.EnumC2269a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f34651b;
        if (map3 != null && map3.containsKey(Integer.valueOf(i)) && ((set = this.f34651b.get(Integer.valueOf(i))) == null || set.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.EnumC2269a.TRANSIENT;
        }
        return FacebookRequestError.EnumC2269a.OTHER;
    }

    /* renamed from: d */
    public final String m760d(FacebookRequestError.EnumC2269a enumC2269a) {
        if (enumC2269a != null) {
            int i = C13635b.f34656a[enumC2269a.ordinal()];
            if (i == 1) {
                return this.f34653d;
            }
            if (i == 2) {
                return this.f34655f;
            }
            if (i == 3) {
                return this.f34654e;
            }
        }
        return null;
    }
}
