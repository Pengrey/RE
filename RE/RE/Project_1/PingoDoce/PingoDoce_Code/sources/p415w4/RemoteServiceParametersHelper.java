package p415w4;

import android.os.Bundle;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.util.List;
import org.json.JSONArray;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p248n4.AppEvent;
import p328r4.EventDeactivationManager;
import p415w4.RemoteServiceWrapper;
import p482z4.FetchedAppSettings;
import p489zc._Collections;

/* renamed from: w4.b */
/* loaded from: classes.dex */
public final class RemoteServiceParametersHelper {

    /* renamed from: a */
    private static final String f29610a;

    /* renamed from: b */
    public static final RemoteServiceParametersHelper f29611b = new RemoteServiceParametersHelper();

    static {
        String simpleName = RemoteServiceWrapper.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        f29610a = simpleName;
    }

    private RemoteServiceParametersHelper() {
    }

    /* renamed from: a */
    public static final Bundle m4699a(RemoteServiceWrapper.EnumC11566a enumC11566a, String str, List list) {
        if (CrashShieldHandler.m25963d(RemoteServiceParametersHelper.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(enumC11566a, "eventType");
            Intrinsics.isThisObjectNull(str, "applicationId");
            Intrinsics.isThisObjectNull(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", enumC11566a.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EnumC11566a.CUSTOM_APP_EVENTS == enumC11566a) {
                JSONArray m4698b = f29611b.m4698b(list, str);
                if (m4698b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", m4698b.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, RemoteServiceParametersHelper.class);
            return null;
        }
    }

    /* renamed from: b */
    private final JSONArray m4698b(List list, String str) {
        List<AppEvent> m453p0;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            m453p0 = _Collections.m453p0(list);
            EventDeactivationManager.m9924d(m453p0);
            boolean m4697c = m4697c(str);
            for (AppEvent appEvent : m453p0) {
                if (appEvent.m17852g()) {
                    if ((!appEvent.m17851h()) || (appEvent.m17851h() && m4697c)) {
                        jSONArray.put(appEvent.m17854e());
                    }
                } else {
                    String str2 = f29610a;
                    Utility.m33973K(str2, "Event with invalid checksum: " + appEvent);
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    private final boolean m4697c(String str) {
        if (CrashShieldHandler.m25963d(this)) {
            return false;
        }
        try {
            FetchedAppSettings m33985o = FetchedAppSettingsManager.m33985o(str, false);
            if (m33985o != null) {
                return m33985o.m730k();
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return false;
        }
    }
}
