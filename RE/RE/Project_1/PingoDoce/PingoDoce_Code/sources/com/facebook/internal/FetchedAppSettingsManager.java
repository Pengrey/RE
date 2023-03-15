package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p306q4.C9654e;
import p377u4.AutomaticAnalyticsLogger;
import p377u4.C10835e;
import p482z4.C13633a;
import p482z4.C13646i;
import p482z4.FetchedAppGateKeepersManager;
import p482z4.FetchedAppSettings;
import p489zc.C13780s;

/* renamed from: com.facebook.internal.d */
/* loaded from: classes.dex */
public final class FetchedAppSettingsManager {

    /* renamed from: a */
    private static final String f6719a;

    /* renamed from: b */
    private static final List f6720b;

    /* renamed from: c */
    private static final Map f6721c;

    /* renamed from: d */
    private static final AtomicReference f6722d;

    /* renamed from: e */
    private static final ConcurrentLinkedQueue f6723e;

    /* renamed from: f */
    private static boolean f6724f;

    /* renamed from: g */
    private static JSONArray f6725g;

    /* renamed from: h */
    public static final FetchedAppSettingsManager f6726h = new FetchedAppSettingsManager();

    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d$a */
    /* loaded from: classes.dex */
    public enum EnumC2320a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2321b {
        /* renamed from: a */
        void mo17771a(FetchedAppSettings fetchedAppSettings);

        /* renamed from: b */
        void mo17770b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d$c */
    /* loaded from: classes.dex */
    public static final class RunnableC2322c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ Context f6727w;

        /* renamed from: x */
        final /* synthetic */ String f6728x;

        /* renamed from: y */
        final /* synthetic */ String f6729y;

        RunnableC2322c(Context context, String str, String str2) {
            this.f6727w = context;
            this.f6728x = str;
            this.f6729y = str2;
        }

        public final void run() {
            JSONObject jSONObject;
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f6727w.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                FetchedAppSettings fetchedAppSettings = null;
                String string = sharedPreferences.getString(this.f6728x, null);
                if (!Utility.m33977G(string)) {
                    if (string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            Utility.m33974J("FacebookSDK", e);
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f6726h;
                            String str = this.f6729y;
                            Intrinsics.checkIfNull(str, "applicationId");
                            fetchedAppSettings = fetchedAppSettingsManager.m33988l(str, jSONObject);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                FetchedAppSettingsManager fetchedAppSettingsManager2 = FetchedAppSettingsManager.f6726h;
                String str2 = this.f6729y;
                Intrinsics.checkIfNull(str2, "applicationId");
                JSONObject m33999a = FetchedAppSettingsManager.m33999a(fetchedAppSettingsManager2, str2);
                if (m33999a != null) {
                    String str3 = this.f6729y;
                    Intrinsics.checkIfNull(str3, "applicationId");
                    fetchedAppSettingsManager2.m33988l(str3, m33999a);
                    sharedPreferences.edit().putString(this.f6728x, m33999a.toString()).apply();
                }
                if (fetchedAppSettings != null) {
                    String m733h = fetchedAppSettings.m733h();
                    if (!FetchedAppSettingsManager.m33996d(fetchedAppSettingsManager2) && m733h != null && m733h.length() > 0) {
                        FetchedAppSettingsManager.m33993g(fetchedAppSettingsManager2, true);
                        Log.w(FetchedAppSettingsManager.m33995e(fetchedAppSettingsManager2), m733h);
                    }
                }
                String str4 = this.f6729y;
                Intrinsics.checkIfNull(str4, "applicationId");
                FetchedAppGateKeepersManager.m742m(str4, true);
                AutomaticAnalyticsLogger.m6936d();
                FetchedAppSettingsManager.m33997c(fetchedAppSettingsManager2).set(FetchedAppSettingsManager.m33998b(fetchedAppSettingsManager2).containsKey(this.f6729y) ? EnumC2320a.SUCCESS : EnumC2320a.ERROR);
                FetchedAppSettingsManager.m33994f(fetchedAppSettingsManager2);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d$d */
    /* loaded from: classes.dex */
    public static final class RunnableC2323d implements Runnable {

        /* renamed from: w */
        final /* synthetic */ InterfaceC2321b f6730w;

        RunnableC2323d(InterfaceC2321b interfaceC2321b) {
            this.f6730w = interfaceC2321b;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                this.f6730w.mo17770b();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d$e */
    /* loaded from: classes.dex */
    public static final class RunnableC2324e implements Runnable {

        /* renamed from: w */
        final /* synthetic */ InterfaceC2321b f6731w;

        /* renamed from: x */
        final /* synthetic */ FetchedAppSettings f6732x;

        RunnableC2324e(InterfaceC2321b interfaceC2321b, FetchedAppSettings fetchedAppSettings) {
            this.f6731w = interfaceC2321b;
            this.f6732x = fetchedAppSettings;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                this.f6731w.mo17771a(this.f6732x);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    static {
        List m194j;
        String simpleName = FetchedAppSettingsManager.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "FetchedAppSettingsManager::class.java.simpleName");
        f6719a = simpleName;
        m194j = C13780s.m194j("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
        f6720b = m194j;
        f6721c = new ConcurrentHashMap();
        f6722d = new AtomicReference(EnumC2320a.NOT_LOADED);
        f6723e = new ConcurrentLinkedQueue();
    }

    private FetchedAppSettingsManager() {
    }

    /* renamed from: a */
    public static final /* synthetic */ JSONObject m33999a(FetchedAppSettingsManager fetchedAppSettingsManager, String str) {
        return fetchedAppSettingsManager.m33991i(str);
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m33998b(FetchedAppSettingsManager fetchedAppSettingsManager) {
        return f6721c;
    }

    /* renamed from: c */
    public static final /* synthetic */ AtomicReference m33997c(FetchedAppSettingsManager fetchedAppSettingsManager) {
        return f6722d;
    }

    /* renamed from: d */
    public static final /* synthetic */ boolean m33996d(FetchedAppSettingsManager fetchedAppSettingsManager) {
        return f6724f;
    }

    /* renamed from: e */
    public static final /* synthetic */ String m33995e(FetchedAppSettingsManager fetchedAppSettingsManager) {
        return f6719a;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m33994f(FetchedAppSettingsManager fetchedAppSettingsManager) {
        fetchedAppSettingsManager.m33986n();
    }

    /* renamed from: g */
    public static final /* synthetic */ void m33993g(FetchedAppSettingsManager fetchedAppSettingsManager, boolean z) {
        f6724f = z;
    }

    /* renamed from: h */
    public static final void m33992h(InterfaceC2321b interfaceC2321b) {
        Intrinsics.isThisObjectNull(interfaceC2321b, "callback");
        f6723e.add(interfaceC2321b);
        m33989k();
    }

    /* renamed from: i */
    private final JSONObject m33991i(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f6720b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest m34145w = GraphRequest.f6606s.m34145w(null, str, null);
        m34145w.m34212D(true);
        m34145w.m34213C(bundle);
        JSONObject m34081d = m34145w.m34201j().m34081d();
        return m34081d != null ? m34081d : new JSONObject();
    }

    /* renamed from: j */
    public static final FetchedAppSettings m33990j(String str) {
        if (str != null) {
            return (FetchedAppSettings) f6721c.get(str);
        }
        return null;
    }

    /* renamed from: k */
    public static final void m33989k() {
        Context m34110e = C2290b.m34110e();
        String m34109f = C2290b.m34109f();
        if (Utility.m33977G(m34109f)) {
            f6722d.set(EnumC2320a.ERROR);
            f6726h.m33986n();
        } else if (f6721c.containsKey(m34109f)) {
            f6722d.set(EnumC2320a.SUCCESS);
            f6726h.m33986n();
        } else {
            AtomicReference atomicReference = f6722d;
            EnumC2320a enumC2320a = EnumC2320a.NOT_LOADED;
            EnumC2320a enumC2320a2 = EnumC2320a.LOADING;
            if (!(atomicReference.compareAndSet(enumC2320a, enumC2320a2) || atomicReference.compareAndSet(EnumC2320a.ERROR, enumC2320a2))) {
                f6726h.m33986n();
                return;
            }
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m34109f}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            C2290b.m34103l().execute(new RunnableC2322c(m34110e, format, m34109f));
        }
    }

    /* renamed from: m */
    private final Map m33987m(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                FetchedAppSettings.C13642b.C13643a c13643a = FetchedAppSettings.C13642b.f34682c;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                Intrinsics.checkIfNull(optJSONObject, "dialogConfigData.optJSONObject(i)");
                FetchedAppSettings.C13642b m727a = c13643a.m727a(optJSONObject);
                if (m727a != null) {
                    String m729a = m727a.m729a();
                    Map map = (Map) hashMap.get(m729a);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(m729a, map);
                    }
                    map.put(m727a.m728b(), m727a);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: n */
    private final synchronized void m33986n() {
        EnumC2320a enumC2320a = (EnumC2320a) f6722d.get();
        if (EnumC2320a.NOT_LOADED != enumC2320a && EnumC2320a.LOADING != enumC2320a) {
            FetchedAppSettings fetchedAppSettings = (FetchedAppSettings) f6721c.get(C2290b.m34109f());
            Handler handler = new Handler(Looper.getMainLooper());
            if (EnumC2320a.ERROR == enumC2320a) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f6723e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    handler.post(new RunnableC2323d((InterfaceC2321b) concurrentLinkedQueue.poll()));
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f6723e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    handler.post(new RunnableC2324e((InterfaceC2321b) concurrentLinkedQueue2.poll(), fetchedAppSettings));
                }
            }
        }
    }

    /* renamed from: o */
    public static final FetchedAppSettings m33985o(String str, boolean z) {
        Intrinsics.isThisObjectNull(str, "applicationId");
        if (!z) {
            Map map = f6721c;
            if (map.containsKey(str)) {
                return (FetchedAppSettings) map.get(str);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f6726h;
        JSONObject m33991i = fetchedAppSettingsManager.m33991i(str);
        if (m33991i != null) {
            FetchedAppSettings m33988l = fetchedAppSettingsManager.m33988l(str, m33991i);
            if (Intrinsics.equals(str, C2290b.m34109f())) {
                f6722d.set(EnumC2320a.SUCCESS);
                fetchedAppSettingsManager.m33986n();
            }
            return m33988l;
        }
        return null;
    }

    /* renamed from: l */
    public final FetchedAppSettings m33988l(String str, JSONObject jSONObject) {
        Intrinsics.isThisObjectNull(str, "applicationId");
        Intrinsics.isThisObjectNull(jSONObject, "settingsJSON");
        JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        C13633a.C13634a c13634a = C13633a.f34649h;
        C13633a m759a = c13634a.m759a(optJSONArray);
        if (m759a == null) {
            m759a = c13634a.m758b();
        }
        C13633a c13633a = m759a;
        int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
        f6725g = optJSONArray2;
        if (optJSONArray2 != null && C13646i.m716b()) {
            C9654e.m10278b(optJSONArray2 != null ? optJSONArray2.toString() : null);
        }
        boolean optBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String optString = jSONObject.optString("gdpv4_nux_content", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(optString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = jSONObject.optInt("app_events_session_timeout", C10835e.m6930a());
        EnumSet m33984a = EnumC2325e.Companion.m33984a(jSONObject.optLong("seamless_login"));
        Map m33987m = m33987m(jSONObject.optJSONObject("android_dialog_configs"));
        String optString2 = jSONObject.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkIfNull(optString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject.optString("smart_login_menu_icon_url");
        Intrinsics.checkIfNull(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject.optString("sdk_update_message");
        Intrinsics.checkIfNull(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        FetchedAppSettings fetchedAppSettings = new FetchedAppSettings(optBoolean, optString, optBoolean2, optInt2, m33984a, m33987m, z, c13633a, optString2, optString3, z2, z3, optJSONArray2, optString4, z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        f6721c.put(str, fetchedAppSettings);
        return fetchedAppSettings;
    }
}
