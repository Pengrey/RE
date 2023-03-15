package p382u9;

import com.google.firebase.crashlytics.internal.common.InterfaceC4231q;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p402v9.C11165a;
import p402v9.C11166b;
import p402v9.C11167c;
import p402v9.C11169e;

/* renamed from: u9.h */
/* loaded from: classes.dex */
class C10860h implements InterfaceC10859g {
    /* renamed from: b */
    private static C11165a m6846b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string = jSONObject2.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        String format = equals ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2);
        Locale locale = Locale.US;
        return new C11165a(string, format, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    /* renamed from: c */
    private static C11166b m6845c(JSONObject jSONObject) {
        return new C11166b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: d */
    private static C11167c m6844d() {
        return new C11167c(8, 4);
    }

    /* renamed from: e */
    private static long m6843e(InterfaceC4231q interfaceC4231q, long j, JSONObject jSONObject) {
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
        return new C11169e(m6843e(interfaceC4231q, optInt2, jSONObject), m6846b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), m6844d(), m6845c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
