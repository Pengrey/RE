package p482z4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.GateKeeper;
import p006a5.GateKeeperRuntimeCache;
import p076e5.CrashShieldHandler;
import p181jd.C6429c0;
import p181jd.C6450z;
import p181jd.Intrinsics;

/* renamed from: z4.f */
/* loaded from: classes.dex */
public final class FetchedAppGateKeepersManager {

    /* renamed from: a */
    private static final AtomicBoolean f34660a;

    /* renamed from: b */
    private static final ConcurrentLinkedQueue f34661b;

    /* renamed from: c */
    private static final Map f34662c;

    /* renamed from: d */
    private static Long f34663d;

    /* renamed from: e */
    private static GateKeeperRuntimeCache f34664e;

    /* renamed from: f */
    public static final FetchedAppGateKeepersManager f34665f = new FetchedAppGateKeepersManager();

    /* compiled from: FetchedAppGateKeepersManager.kt */
    /* renamed from: z4.f$a */
    /* loaded from: classes.dex */
    public interface InterfaceC13638a {
        /* renamed from: a */
        void m741a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppGateKeepersManager.kt */
    /* renamed from: z4.f$b */
    /* loaded from: classes.dex */
    public static final class RunnableC13639b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ String f34666w;

        /* renamed from: x */
        final /* synthetic */ Context f34667x;

        /* renamed from: y */
        final /* synthetic */ String f34668y;

        RunnableC13639b(String str, Context context, String str2) {
            this.f34666w = str;
            this.f34667x = context;
            this.f34668y = str2;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                FetchedAppGateKeepersManager fetchedAppGateKeepersManager = FetchedAppGateKeepersManager.f34665f;
                String str = this.f34666w;
                Intrinsics.checkIfNull(str, "applicationId");
                JSONObject m754a = FetchedAppGateKeepersManager.m754a(fetchedAppGateKeepersManager, str);
                if (m754a.length() != 0) {
                    String str2 = this.f34666w;
                    Intrinsics.checkIfNull(str2, "applicationId");
                    fetchedAppGateKeepersManager.m744k(str2, m754a);
                    this.f34667x.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f34668y, m754a.toString()).apply();
                    FetchedAppGateKeepersManager.m751d(fetchedAppGateKeepersManager, Long.valueOf(System.currentTimeMillis()));
                }
                FetchedAppGateKeepersManager.m752c(fetchedAppGateKeepersManager);
                FetchedAppGateKeepersManager.m753b(fetchedAppGateKeepersManager).set(false);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppGateKeepersManager.kt */
    /* renamed from: z4.f$c */
    /* loaded from: classes.dex */
    public static final class RunnableC13640c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ InterfaceC13638a f34669w;

        RunnableC13640c(InterfaceC13638a interfaceC13638a) {
            this.f34669w = interfaceC13638a;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                this.f34669w.m741a();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    static {
        C6450z.m20906b(FetchedAppGateKeepersManager.class).mo10119a();
        f34660a = new AtomicBoolean(false);
        f34661b = new ConcurrentLinkedQueue();
        f34662c = new ConcurrentHashMap();
    }

    private FetchedAppGateKeepersManager() {
    }

    /* renamed from: a */
    public static final /* synthetic */ JSONObject m754a(FetchedAppGateKeepersManager fetchedAppGateKeepersManager, String str) {
        return fetchedAppGateKeepersManager.m750e(str);
    }

    /* renamed from: b */
    public static final /* synthetic */ AtomicBoolean m753b(FetchedAppGateKeepersManager fetchedAppGateKeepersManager) {
        return f34660a;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m752c(FetchedAppGateKeepersManager fetchedAppGateKeepersManager) {
        fetchedAppGateKeepersManager.m743l();
    }

    /* renamed from: d */
    public static final /* synthetic */ void m751d(FetchedAppGateKeepersManager fetchedAppGateKeepersManager, Long l) {
        f34663d = l;
    }

    /* renamed from: e */
    private final JSONObject m750e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", C2290b.m34098q());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.C2279c c2279c = GraphRequest.f6606s;
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, "mobile_sdk_gk"}, 2));
        Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
        GraphRequest m34145w = c2279c.m34145w(null, format, null);
        m34145w.m34212D(true);
        m34145w.m34213C(bundle);
        JSONObject m34081d = m34145w.m34201j().m34081d();
        return m34081d != null ? m34081d : new JSONObject();
    }

    /* renamed from: f */
    public static final boolean m749f(String str, String str2, boolean z) {
        Boolean bool;
        Intrinsics.isThisObjectNull(str, "name");
        Map m748g = f34665f.m748g(str2);
        return (m748g.containsKey(str) && (bool = (Boolean) m748g.get(str)) != null) ? bool.booleanValue() : z;
    }

    /* renamed from: h */
    private final boolean m747h(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < 3600000;
    }

    /* renamed from: j */
    public static final synchronized void m745j(InterfaceC13638a interfaceC13638a) {
        synchronized (FetchedAppGateKeepersManager.class) {
            if (interfaceC13638a != null) {
                f34661b.add(interfaceC13638a);
            }
            String m34109f = C2290b.m34109f();
            FetchedAppGateKeepersManager fetchedAppGateKeepersManager = f34665f;
            if (fetchedAppGateKeepersManager.m747h(f34663d) && f34662c.containsKey(m34109f)) {
                fetchedAppGateKeepersManager.m743l();
                return;
            }
            Context m34110e = C2290b.m34110e();
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m34109f}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            if (m34110e == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = m34110e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!Utility.m33977G(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    Utility.m33974J("FacebookSDK", e);
                }
                if (jSONObject != null) {
                    FetchedAppGateKeepersManager fetchedAppGateKeepersManager2 = f34665f;
                    Intrinsics.checkIfNull(m34109f, "applicationId");
                    fetchedAppGateKeepersManager2.m744k(m34109f, jSONObject);
                }
            }
            Executor m34103l = C2290b.m34103l();
            if (m34103l != null) {
                if (f34660a.compareAndSet(false, true)) {
                    m34103l.execute(new RunnableC13639b(m34109f, m34110e, format));
                }
            }
        }
    }

    /* renamed from: l */
    private final void m743l() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f34661b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            InterfaceC13638a interfaceC13638a = (InterfaceC13638a) concurrentLinkedQueue.poll();
            if (interfaceC13638a != null) {
                handler.post(new RunnableC13640c(interfaceC13638a));
            }
        }
    }

    /* renamed from: m */
    public static final JSONObject m742m(String str, boolean z) {
        Intrinsics.isThisObjectNull(str, "applicationId");
        if (!z) {
            Map map = f34662c;
            if (map.containsKey(str)) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                return jSONObject != null ? jSONObject : new JSONObject();
            }
        }
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager = f34665f;
        JSONObject m750e = fetchedAppGateKeepersManager.m750e(str);
        Context m34110e = C2290b.m34110e();
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
        m34110e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, m750e.toString()).apply();
        return fetchedAppGateKeepersManager.m744k(str, m750e);
    }

    /* renamed from: g */
    public final Map m748g(String str) {
        m746i();
        if (str != null) {
            Map map = f34662c;
            if (map.containsKey(str)) {
                GateKeeperRuntimeCache gateKeeperRuntimeCache = f34664e;
                List<GateKeeper> m42102a = gateKeeperRuntimeCache != null ? gateKeeperRuntimeCache.m42102a(str) : null;
                if (m42102a != null) {
                    HashMap hashMap = new HashMap();
                    for (GateKeeper gateKeeper : m42102a) {
                        hashMap.put(gateKeeper.m42104a(), Boolean.valueOf(gateKeeper.m42103b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.checkIfNull(next, "key");
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                GateKeeperRuntimeCache gateKeeperRuntimeCache2 = f34664e;
                if (gateKeeperRuntimeCache2 == null) {
                    gateKeeperRuntimeCache2 = new GateKeeperRuntimeCache();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                gateKeeperRuntimeCache2.m42101b(str, arrayList);
                f34664e = gateKeeperRuntimeCache2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    /* renamed from: i */
    public final void m746i() {
        m745j(null);
    }

    /* renamed from: k */
    public final synchronized JSONObject m744k(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray optJSONArray;
        Intrinsics.isThisObjectNull(str, "applicationId");
        jSONObject2 = (JSONObject) f34662c.get(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null || (jSONObject3 = optJSONArray.optJSONObject(0)) == null) {
            jSONObject3 = new JSONObject();
        }
        JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
        if (optJSONArray2 == null) {
            optJSONArray2 = new JSONArray();
        }
        int length = optJSONArray2.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
            } catch (JSONException e) {
                Utility.m33974J("FacebookSDK", e);
            }
        }
        f34662c.put(str, jSONObject2);
        return jSONObject2;
    }
}
