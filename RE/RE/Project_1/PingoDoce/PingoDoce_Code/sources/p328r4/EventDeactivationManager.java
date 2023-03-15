package p328r4;

import com.facebook.C2290b;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p248n4.AppEvent;
import p482z4.FetchedAppSettings;

/* renamed from: r4.a */
/* loaded from: classes.dex */
public final class EventDeactivationManager {

    /* renamed from: a */
    private static boolean f25754a;

    /* renamed from: d */
    public static final EventDeactivationManager f25757d = new EventDeactivationManager();

    /* renamed from: b */
    private static final List f25755b = new ArrayList();

    /* renamed from: c */
    private static final Set f25756c = new HashSet();

    /* compiled from: EventDeactivationManager.kt */
    /* renamed from: r4.a$a */
    /* loaded from: classes.dex */
    public static final class C9814a {

        /* renamed from: a */
        private String f25758a;

        /* renamed from: b */
        private List f25759b;

        public C9814a(String str, List list) {
            Intrinsics.isThisObjectNull(str, "eventName");
            Intrinsics.isThisObjectNull(list, "deprecateParams");
            this.f25758a = str;
            this.f25759b = list;
        }

        /* renamed from: a */
        public final List m9923a() {
            return this.f25759b;
        }

        /* renamed from: b */
        public final String m9922b() {
            return this.f25758a;
        }

        /* renamed from: c */
        public final void m9921c(List list) {
            Intrinsics.isThisObjectNull(list, "<set-?>");
            this.f25759b = list;
        }
    }

    private EventDeactivationManager() {
    }

    /* renamed from: a */
    public static final void m9927a() {
        if (CrashShieldHandler.m25963d(EventDeactivationManager.class)) {
            return;
        }
        try {
            f25754a = true;
            f25757d.m9926b();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, EventDeactivationManager.class);
        }
    }

    /* renamed from: b */
    private final synchronized void m9926b() {
        FetchedAppSettings m33985o;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            String m34109f = C2290b.m34109f();
            Intrinsics.checkIfNull(m34109f, "FacebookSdk.getApplicationId()");
            m33985o = FetchedAppSettingsManager.m33985o(m34109f, false);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return;
        }
        if (m33985o != null) {
            String m734g = m33985o.m734g();
            if (m734g != null) {
                if (m734g.length() > 0) {
                    JSONObject jSONObject = new JSONObject(m734g);
                    f25755b.clear();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                Set set = f25756c;
                                Intrinsics.checkIfNull(next, "key");
                                set.add(next);
                            } else {
                                JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                Intrinsics.checkIfNull(next, "key");
                                C9814a c9814a = new C9814a(next, new ArrayList());
                                if (optJSONArray != null) {
                                    c9814a.m9921c(Utility.m33950h(optJSONArray));
                                }
                                f25755b.add(c9814a);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m9925c(Map map, String str) {
        if (CrashShieldHandler.m25963d(EventDeactivationManager.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(map, "parameters");
            Intrinsics.isThisObjectNull(str, "eventName");
            if (f25754a) {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                for (C9814a c9814a : new ArrayList(f25755b)) {
                    if (!(!Intrinsics.equals(c9814a.m9922b(), str))) {
                        for (String str2 : arrayList) {
                            if (c9814a.m9923a().contains(str2)) {
                                map.remove(str2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, EventDeactivationManager.class);
        }
    }

    /* renamed from: d */
    public static final void m9924d(List list) {
        if (CrashShieldHandler.m25963d(EventDeactivationManager.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(list, "events");
            if (f25754a) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (f25756c.contains(((AppEvent) it.next()).m17853f())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, EventDeactivationManager.class);
        }
    }
}
