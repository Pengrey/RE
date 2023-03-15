package p377u4;

import android.content.Context;
import com.facebook.EnumC2305f;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.Intrinsics;
import p248n4.AppEventsLogger;
import p468yc.C13191r;
import p482z4.Logger;
import p489zc.C13769l0;

/* renamed from: u4.c */
/* loaded from: classes.dex */
public final class AppEventsLoggerUtility {

    /* renamed from: a */
    private static final Map f28000a;

    /* compiled from: AppEventsLoggerUtility.kt */
    /* renamed from: u4.c$a */
    /* loaded from: classes.dex */
    public enum EnumC10833a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    static {
        HashMap m332g;
        new AppEventsLoggerUtility();
        m332g = C13769l0.m332g(C13191r.m1447a(EnumC10833a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), C13191r.m1447a(EnumC10833a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));
        f28000a = m332g;
    }

    private AppEventsLoggerUtility() {
    }

    /* renamed from: a */
    public static final JSONObject m6940a(EnumC10833a enumC10833a, AttributionIdentifiers attributionIdentifiers, String str, boolean z, Context context) throws JSONException {
        Intrinsics.isThisObjectNull(enumC10833a, "activityType");
        Intrinsics.isThisObjectNull(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f28000a.get(enumC10833a));
        String m17811d = AppEventsLogger.f20233b.m17811d();
        if (m17811d != null) {
            jSONObject.put("app_user_id", m17811d);
        }
        Utility.m33962V(jSONObject, attributionIdentifiers, str, z);
        try {
            Utility.m33961W(jSONObject, context);
        } catch (Exception e) {
            Logger.f34697f.m701d(EnumC2305f.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject m33940r = Utility.m33940r();
        if (m33940r != null) {
            Iterator<String> keys = m33940r.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, m33940r.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
