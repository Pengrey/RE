package p248n4;

import android.content.Context;
import com.facebook.C2290b;
import com.facebook.internal.AttributionIdentifiers;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p181jd.Intrinsics;

/* renamed from: n4.d */
/* loaded from: classes.dex */
public final class AppEventCollection {

    /* renamed from: a */
    private final HashMap f20213a = new HashMap();

    /* renamed from: e */
    private final synchronized SessionEventsState m17841e(AccessTokenAppIdPair accessTokenAppIdPair) {
        SessionEventsState sessionEventsState = (SessionEventsState) this.f20213a.get(accessTokenAppIdPair);
        if (sessionEventsState == null) {
            Context m34110e = C2290b.m34110e();
            AttributionIdentifiers.C2311a c2311a = AttributionIdentifiers.f6706h;
            Intrinsics.checkIfNull(m34110e, "context");
            AttributionIdentifiers m34022e = c2311a.m34022e(m34110e);
            sessionEventsState = m34022e != null ? new SessionEventsState(m34022e, AppEventsLogger.f20233b.m17813b(m34110e)) : null;
        }
        if (sessionEventsState == null) {
            return null;
        }
        this.f20213a.put(accessTokenAppIdPair, sessionEventsState);
        return sessionEventsState;
    }

    /* renamed from: a */
    public final synchronized void m17845a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        Intrinsics.isThisObjectNull(accessTokenAppIdPair, "accessTokenAppIdPair");
        Intrinsics.isThisObjectNull(appEvent, "appEvent");
        SessionEventsState m17841e = m17841e(accessTokenAppIdPair);
        if (m17841e != null) {
            m17841e.m17748a(appEvent);
        }
    }

    /* renamed from: b */
    public final synchronized void m17844b(PersistedEvents persistedEvents) {
        if (persistedEvents == null) {
            return;
        }
        for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.m17749c()) {
            SessionEventsState m17841e = m17841e(accessTokenAppIdPair);
            if (m17841e != null) {
                List<AppEvent> m17750b = persistedEvents.m17750b(accessTokenAppIdPair);
                if (m17750b == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                for (AppEvent appEvent : m17750b) {
                    m17841e.m17748a(appEvent);
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized SessionEventsState m17843c(AccessTokenAppIdPair accessTokenAppIdPair) {
        Intrinsics.isThisObjectNull(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (SessionEventsState) this.f20213a.get(accessTokenAppIdPair);
    }

    /* renamed from: d */
    public final synchronized int m17842d() {
        int i;
        i = 0;
        for (SessionEventsState sessionEventsState : this.f20213a.values()) {
            i += sessionEventsState.m17746c();
        }
        return i;
    }

    /* renamed from: f */
    public final synchronized Set m17840f() {
        Set keySet;
        keySet = this.f20213a.keySet();
        Intrinsics.checkIfNull(keySet, "stateMap.keys");
        return keySet;
    }
}
