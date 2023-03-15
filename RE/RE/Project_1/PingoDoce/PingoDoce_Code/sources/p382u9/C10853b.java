package p382u9;

import com.google.firebase.crashlytics.internal.common.InterfaceC4231q;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p402v9.C11165a;
import p402v9.C11166b;
import p402v9.C11167c;
import p402v9.C11169e;
import p402v9.InterfaceC11168d;

/* renamed from: u9.b */
/* loaded from: classes.dex */
class C10853b implements InterfaceC10859g {
    /* renamed from: b */
    private static C11165a m6874b(JSONObject jSONObject) throws JSONException {
        return new C11165a(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    /* renamed from: c */
    private static C11166b m6873c(JSONObject jSONObject) {
        return new C11166b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: d */
    private static C11167c m6872d(JSONObject jSONObject) {
        return new C11167c(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static InterfaceC11168d m6871e(InterfaceC4231q interfaceC4231q) {
        JSONObject jSONObject = new JSONObject();
        return new C11169e(m6870f(interfaceC4231q, 3600L, jSONObject), null, m6872d(jSONObject), m6873c(jSONObject), 0, DateTimeConstants.SECONDS_PER_HOUR);
    }

    /* renamed from: f */
    private static long m6870f(InterfaceC4231q interfaceC4231q, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return interfaceC4231q.mo28223a() + (j * 1000);
    }

    @Override // p382u9.InterfaceC10859g
    /* renamed from: a */
    public C11169e mo6847a(InterfaceC4231q interfaceC4231q, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", DateTimeConstants.SECONDS_PER_HOUR);
        return new C11169e(m6870f(interfaceC4231q, optInt2, jSONObject), m6874b(jSONObject.getJSONObject("app")), m6872d(jSONObject.getJSONObject("session")), m6873c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
