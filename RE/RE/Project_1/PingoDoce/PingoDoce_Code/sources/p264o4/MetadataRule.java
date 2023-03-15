package p264o4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import sd.C10171u;

/* renamed from: o4.c */
/* loaded from: classes.dex */
public final class MetadataRule {

    /* renamed from: a */
    private final List f20745a;

    /* renamed from: b */
    private final String f20746b;

    /* renamed from: c */
    private final String f20747c;

    /* renamed from: e */
    public static final C8017a f20744e = new C8017a(null);

    /* renamed from: d */
    private static final Set f20743d = new CopyOnWriteArraySet();

    /* compiled from: MetadataRule.kt */
    /* renamed from: o4.c$a */
    /* loaded from: classes.dex */
    public static final class C8017a {
        private C8017a() {
        }

        /* renamed from: a */
        private final void m17155a(JSONObject jSONObject) {
            List m8883q0;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    Intrinsics.checkIfNull(optString, "k");
                    if (!(optString.length() == 0)) {
                        Set m17161a = MetadataRule.m17161a();
                        Intrinsics.checkIfNull(next, "key");
                        m8883q0 = C10171u.m8883q0(optString, new String[]{","}, false, 0, 6, null);
                        Intrinsics.checkIfNull(optString2, "v");
                        m17161a.add(new MetadataRule(next, m8883q0, optString2, null));
                    }
                }
            }
        }

        /* renamed from: b */
        public final Set m17154b() {
            HashSet hashSet = new HashSet();
            for (MetadataRule metadataRule : MetadataRule.m17161a()) {
                hashSet.add(metadataRule.m17159c());
            }
            return hashSet;
        }

        /* renamed from: c */
        public final Set m17153c() {
            return new HashSet(MetadataRule.m17161a());
        }

        /* renamed from: d */
        public final void m17152d(String str) {
            Intrinsics.isThisObjectNull(str, "rulesFromServer");
            try {
                MetadataRule.m17161a().clear();
                m17155a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }

        public /* synthetic */ C8017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MetadataRule(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    /* renamed from: a */
    public static final /* synthetic */ Set m17161a() {
        if (CrashShieldHandler.m25963d(MetadataRule.class)) {
            return null;
        }
        try {
            return f20743d;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, MetadataRule.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final Set m17158d() {
        if (CrashShieldHandler.m25963d(MetadataRule.class)) {
            return null;
        }
        try {
            return f20744e.m17153c();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, MetadataRule.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m17156f(String str) {
        if (CrashShieldHandler.m25963d(MetadataRule.class)) {
            return;
        }
        try {
            f20744e.m17152d(str);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, MetadataRule.class);
        }
    }

    /* renamed from: b */
    public final List m17160b() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f20745a);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    public final String m17159c() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            return this.f20746b;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    public final String m17157e() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            return this.f20747c;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    private MetadataRule(String str, List list, String str2) {
        this.f20746b = str;
        this.f20747c = str2;
        this.f20745a = list;
    }
}
