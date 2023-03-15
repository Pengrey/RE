package p248n4;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p328r4.EventDeactivationManager;
import p377u4.AppEventsLoggerUtility;
import p468yc.C13195u;

/* renamed from: n4.o */
/* loaded from: classes.dex */
public final class SessionEventsState {

    /* renamed from: f */
    private static final String f20254f;

    /* renamed from: g */
    private static final int f20255g;

    /* renamed from: a */
    private List f20256a;

    /* renamed from: b */
    private final List f20257b;

    /* renamed from: c */
    private int f20258c;

    /* renamed from: d */
    private final AttributionIdentifiers f20259d;

    /* renamed from: e */
    private final String f20260e;

    /* compiled from: SessionEventsState.kt */
    /* renamed from: n4.o$a */
    /* loaded from: classes.dex */
    public static final class C7677a {
        private C7677a() {
        }

        public /* synthetic */ C7677a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7677a(null);
        String simpleName = SessionEventsState.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "SessionEventsState::class.java.simpleName");
        f20254f = simpleName;
        f20255g = DateTimeConstants.MILLIS_PER_SECOND;
    }

    public SessionEventsState(AttributionIdentifiers attributionIdentifiers, String str) {
        Intrinsics.isThisObjectNull(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.isThisObjectNull(str, "anonymousAppDeviceGUID");
        this.f20259d = attributionIdentifiers;
        this.f20260e = str;
        this.f20256a = new ArrayList();
        this.f20257b = new ArrayList();
    }

    /* renamed from: f */
    private final void m17743f(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                jSONObject = AppEventsLoggerUtility.m6940a(AppEventsLoggerUtility.EnumC10833a.CUSTOM_APP_EVENTS, this.f20259d, this.f20260e, z, context);
                if (this.f20258c > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.m34215A(jSONObject);
            Bundle m34193r = graphRequest.m34193r();
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkIfNull(jSONArray2, "events.toString()");
            m34193r.putString("custom_events", jSONArray2);
            graphRequest.m34211E(jSONArray2);
            graphRequest.m34213C(m34193r);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: a */
    public final synchronized void m17748a(AppEvent appEvent) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        Intrinsics.isThisObjectNull(appEvent, "event");
        if (this.f20256a.size() + this.f20257b.size() >= f20255g) {
            this.f20258c++;
        } else {
            this.f20256a.add(appEvent);
        }
    }

    /* renamed from: b */
    public final synchronized void m17747b(boolean z) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        if (z) {
            this.f20256a.addAll(this.f20257b);
        }
        this.f20257b.clear();
        this.f20258c = 0;
    }

    /* renamed from: c */
    public final synchronized int m17746c() {
        if (CrashShieldHandler.m25963d(this)) {
            return 0;
        }
        return this.f20256a.size();
    }

    /* renamed from: d */
    public final synchronized List m17745d() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        List list = this.f20256a;
        this.f20256a = new ArrayList();
        return list;
    }

    /* renamed from: e */
    public final int m17744e(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        if (CrashShieldHandler.m25963d(this)) {
            return 0;
        }
        try {
            Intrinsics.isThisObjectNull(graphRequest, "request");
            Intrinsics.isThisObjectNull(context, "applicationContext");
            synchronized (this) {
                int i = this.f20258c;
                EventDeactivationManager.m9924d(this.f20256a);
                this.f20257b.addAll(this.f20256a);
                this.f20256a.clear();
                JSONArray jSONArray = new JSONArray();
                for (AppEvent appEvent : this.f20257b) {
                    if (appEvent.m17852g()) {
                        if (z || !appEvent.m17851h()) {
                            jSONArray.put(appEvent.m17854e());
                        }
                    } else {
                        String str = f20254f;
                        Utility.m33973K(str, "Event with invalid checksum: " + appEvent);
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                C13195u c13195u = C13195u.f34156a;
                m17743f(graphRequest, context, i, jSONArray, z2);
                return jSONArray.length();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return 0;
        }
    }
}
