package p248n4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C2290b;
import com.facebook.EnumC2305f;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import p076e5.CrashShieldHandler;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p248n4.AppEventsLogger;
import p435x2.C12256a;
import p482z4.FetchedAppSettings;
import p482z4.Logger;

/* renamed from: n4.e */
/* loaded from: classes.dex */
public final class AppEventQueue {

    /* renamed from: a */
    private static final String f20214a;

    /* renamed from: b */
    private static final int f20215b;

    /* renamed from: c */
    private static volatile AppEventCollection f20216c;

    /* renamed from: d */
    private static final ScheduledExecutorService f20217d;

    /* renamed from: e */
    private static ScheduledFuture f20218e;

    /* renamed from: f */
    private static final Runnable f20219f;

    /* renamed from: g */
    public static final AppEventQueue f20220g = new AppEventQueue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.kt */
    /* renamed from: n4.e$a */
    /* loaded from: classes.dex */
    public static final class RunnableC7650a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ AccessTokenAppIdPair f20221w;

        /* renamed from: x */
        final /* synthetic */ AppEvent f20222x;

        RunnableC7650a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
            this.f20221w = accessTokenAppIdPair;
            this.f20222x = appEvent;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                AppEventQueue appEventQueue = AppEventQueue.f20220g;
                AppEventQueue.m17839a(appEventQueue).m17845a(this.f20221w, this.f20222x);
                if (AppEventsLogger.f20233b.m17812c() != AppEventsLogger.EnumC7659b.EXPLICIT_ONLY && AppEventQueue.m17839a(appEventQueue).m17842d() > AppEventQueue.m17837c(appEventQueue)) {
                    AppEventQueue.m17828l(EnumC7671j.EVENT_THRESHOLD);
                } else if (AppEventQueue.m17836d(appEventQueue) == null) {
                    AppEventQueue.m17833g(appEventQueue, AppEventQueue.m17835e(appEventQueue).schedule(AppEventQueue.m17838b(appEventQueue), 15, TimeUnit.SECONDS));
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.kt */
    /* renamed from: n4.e$b */
    /* loaded from: classes.dex */
    public static final class C7651b implements GraphRequest.InterfaceC2278b {

        /* renamed from: a */
        final /* synthetic */ AccessTokenAppIdPair f20223a;

        /* renamed from: b */
        final /* synthetic */ GraphRequest f20224b;

        /* renamed from: c */
        final /* synthetic */ SessionEventsState f20225c;

        /* renamed from: d */
        final /* synthetic */ FlushStatistics f20226d;

        C7651b(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
            this.f20223a = accessTokenAppIdPair;
            this.f20224b = graphRequest;
            this.f20225c = sessionEventsState;
            this.f20226d = flushStatistics;
        }

        /* renamed from: a */
        public final void mo15411a(GraphResponse graphResponse) {
            Intrinsics.isThisObjectNull(graphResponse, "response");
            AppEventQueue.m17826n(this.f20223a, this.f20224b, graphResponse, this.f20225c, this.f20226d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.kt */
    /* renamed from: n4.e$c */
    /* loaded from: classes.dex */
    public static final class RunnableC7652c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ EnumC7671j f20227w;

        RunnableC7652c(EnumC7671j enumC7671j) {
            this.f20227w = enumC7671j;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                AppEventQueue.m17828l(this.f20227w);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* compiled from: AppEventQueue.kt */
    /* renamed from: n4.e$d */
    /* loaded from: classes.dex */
    static final class RunnableC7653d implements Runnable {

        /* renamed from: w */
        public static final RunnableC7653d f20228w = new RunnableC7653d();

        RunnableC7653d() {
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                AppEventQueue.m17833g(AppEventQueue.f20220g, null);
                if (AppEventsLogger.f20233b.m17812c() != AppEventsLogger.EnumC7659b.EXPLICIT_ONLY) {
                    AppEventQueue.m17828l(EnumC7671j.TIMER);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.kt */
    /* renamed from: n4.e$e */
    /* loaded from: classes.dex */
    public static final class RunnableC7654e implements Runnable {

        /* renamed from: w */
        final /* synthetic */ AccessTokenAppIdPair f20229w;

        /* renamed from: x */
        final /* synthetic */ SessionEventsState f20230x;

        RunnableC7654e(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
            this.f20229w = accessTokenAppIdPair;
            this.f20230x = sessionEventsState;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                AppEventStore.m17823a(this.f20229w, this.f20230x);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventQueue.kt */
    /* renamed from: n4.e$f */
    /* loaded from: classes.dex */
    public static final class RunnableC7655f implements Runnable {

        /* renamed from: w */
        public static final RunnableC7655f f20231w = new RunnableC7655f();

        RunnableC7655f() {
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                AppEventQueue appEventQueue = AppEventQueue.f20220g;
                AppEventStore.m17822b(AppEventQueue.m17839a(appEventQueue));
                AppEventQueue.m17834f(appEventQueue, new AppEventCollection());
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    static {
        String name = AppEventQueue.class.getName();
        Intrinsics.checkIfNull(name, "AppEventQueue::class.java.name");
        f20214a = name;
        f20215b = 100;
        f20216c = new AppEventCollection();
        f20217d = Executors.newSingleThreadScheduledExecutor();
        f20219f = RunnableC7653d.f20228w;
    }

    private AppEventQueue() {
    }

    /* renamed from: a */
    public static final /* synthetic */ AppEventCollection m17839a(AppEventQueue appEventQueue) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return null;
        }
        try {
            return f20216c;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Runnable m17838b(AppEventQueue appEventQueue) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return null;
        }
        try {
            return f20219f;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ int m17837c(AppEventQueue appEventQueue) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return 0;
        }
        try {
            return f20215b;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return 0;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ ScheduledFuture m17836d(AppEventQueue appEventQueue) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return null;
        }
        try {
            return f20218e;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ ScheduledExecutorService m17835e(AppEventQueue appEventQueue) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return null;
        }
        try {
            return f20217d;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m17834f(AppEventQueue appEventQueue, AppEventCollection appEventCollection) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return;
        }
        try {
            f20216c = appEventCollection;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m17833g(AppEventQueue appEventQueue, ScheduledFuture scheduledFuture) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return;
        }
        try {
            f20218e = scheduledFuture;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
        }
    }

    /* renamed from: h */
    public static final void m17832h(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(accessTokenAppIdPair, "accessTokenAppId");
            Intrinsics.isThisObjectNull(appEvent, "appEvent");
            f20217d.execute(new RunnableC7650a(accessTokenAppIdPair, appEvent));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
        }
    }

    /* renamed from: i */
    public static final GraphRequest m17831i(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState, boolean z, FlushStatistics flushStatistics) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(accessTokenAppIdPair, "accessTokenAppId");
            Intrinsics.isThisObjectNull(sessionEventsState, "appEvents");
            Intrinsics.isThisObjectNull(flushStatistics, "flushState");
            String m17863b = accessTokenAppIdPair.m17863b();
            FetchedAppSettings m33985o = FetchedAppSettingsManager.m33985o(m17863b, false);
            GraphRequest.C2279c c2279c = GraphRequest.f6606s;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{m17863b}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            GraphRequest m34144x = c2279c.m34144x(null, format, null, null);
            Bundle m34193r = m34144x.m34193r();
            if (m34193r == null) {
                m34193r = new Bundle();
            }
            m34193r.putString("access_token", accessTokenAppIdPair.m17864a());
            String m17753c = InternalAppEventsLogger.f20250b.m17753c();
            if (m17753c != null) {
                m34193r.putString("device_token", m17753c);
            }
            String m17781i = AppEventsLoggerImpl.f20242j.m17781i();
            if (m17781i != null) {
                m34193r.putString("install_referrer", m17781i);
            }
            m34144x.m34213C(m34193r);
            boolean m730k = m33985o != null ? m33985o.m730k() : false;
            Context m34110e = C2290b.m34110e();
            Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
            int m17744e = sessionEventsState.m17744e(m34144x, m34110e, m730k, z);
            if (m17744e == 0) {
                return null;
            }
            flushStatistics.m17766c(flushStatistics.m17768a() + m17744e);
            m34144x.m34185z(new C7651b(accessTokenAppIdPair, m34144x, sessionEventsState, flushStatistics));
            return m34144x;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final List m17830j(AppEventCollection appEventCollection, FlushStatistics flushStatistics) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(appEventCollection, "appEventCollection");
            Intrinsics.isThisObjectNull(flushStatistics, "flushResults");
            boolean m34100o = C2290b.m34100o(C2290b.m34110e());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection.m17840f()) {
                SessionEventsState m17843c = appEventCollection.m17843c(accessTokenAppIdPair);
                if (m17843c != null) {
                    GraphRequest m17831i = m17831i(accessTokenAppIdPair, m17843c, m34100o, flushStatistics);
                    if (m17831i != null) {
                        arrayList.add(m17831i);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return null;
        }
    }

    /* renamed from: k */
    public static final void m17829k(EnumC7671j enumC7671j) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(enumC7671j, "reason");
            f20217d.execute(new RunnableC7652c(enumC7671j));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
        }
    }

    /* renamed from: l */
    public static final void m17828l(EnumC7671j enumC7671j) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(enumC7671j, "reason");
            f20216c.m17844b(AppEventStore.m17821c());
            try {
                FlushStatistics m17824p = m17824p(enumC7671j, f20216c);
                if (m17824p != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", m17824p.m17768a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", m17824p.m17767b());
                    C12256a.m3182b(C2290b.m34110e()).m3180d(intent);
                }
            } catch (Exception e) {
                Log.w(f20214a, "Caught unexpected exception while flushing app events: ", e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
        }
    }

    /* renamed from: m */
    public static final Set m17827m() {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return null;
        }
        try {
            return f20216c.m17840f();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return null;
        }
    }

    /* renamed from: n */
    public static final void m17826n(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, GraphResponse graphResponse, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
        String str;
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(accessTokenAppIdPair, "accessTokenAppId");
            Intrinsics.isThisObjectNull(graphRequest, "request");
            Intrinsics.isThisObjectNull(graphResponse, "response");
            Intrinsics.isThisObjectNull(sessionEventsState, "appEvents");
            Intrinsics.isThisObjectNull(flushStatistics, "flushState");
            FacebookRequestError m34083b = graphResponse.m34083b();
            String str2 = "Success";
            EnumC7672k enumC7672k = EnumC7672k.SUCCESS;
            boolean z = true;
            if (m34083b != null) {
                if (m34083b.m34227b() == -1) {
                    str2 = "Failed: No Connectivity";
                    enumC7672k = EnumC7672k.NO_CONNECTIVITY;
                } else {
                    C6429c0 c6429c0 = C6429c0.f17515a;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{graphResponse.toString(), m34083b.toString()}, 2));
                    Intrinsics.checkIfNull(str2, "java.lang.String.format(format, *args)");
                    enumC7672k = EnumC7672k.SERVER_ERROR;
                }
            }
            if (C2290b.m34093v(EnumC2305f.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) graphRequest.m34191t()).toString(2);
                    Intrinsics.checkIfNull(str, "jsonArray.toString(2)");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                Logger.f34697f.m701d(EnumC2305f.APP_EVENTS, f20214a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.m34197n()), str2, str);
            }
            if (m34083b == null) {
                z = false;
            }
            sessionEventsState.m17747b(z);
            EnumC7672k enumC7672k2 = EnumC7672k.NO_CONNECTIVITY;
            if (enumC7672k == enumC7672k2) {
                C2290b.m34103l().execute(new RunnableC7654e(accessTokenAppIdPair, sessionEventsState));
            }
            if (enumC7672k == EnumC7672k.SUCCESS || flushStatistics.m17767b() == enumC7672k2) {
                return;
            }
            flushStatistics.m17765d(enumC7672k);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
        }
    }

    /* renamed from: o */
    public static final void m17825o() {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return;
        }
        try {
            f20217d.execute(RunnableC7655f.f20231w);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
        }
    }

    /* renamed from: p */
    public static final FlushStatistics m17824p(EnumC7671j enumC7671j, AppEventCollection appEventCollection) {
        if (CrashShieldHandler.m25963d(AppEventQueue.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(enumC7671j, "reason");
            Intrinsics.isThisObjectNull(appEventCollection, "appEventCollection");
            FlushStatistics flushStatistics = new FlushStatistics();
            List<GraphRequest> m17830j = m17830j(appEventCollection, flushStatistics);
            if (!m17830j.isEmpty()) {
                Logger.f34697f.m701d(EnumC2305f.APP_EVENTS, f20214a, "Flushing %d events due to %s.", Integer.valueOf(flushStatistics.m17768a()), enumC7671j.toString());
                for (GraphRequest graphRequest : m17830j) {
                    graphRequest.m34201j();
                }
                return flushStatistics;
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventQueue.class);
            return null;
        }
    }
}
