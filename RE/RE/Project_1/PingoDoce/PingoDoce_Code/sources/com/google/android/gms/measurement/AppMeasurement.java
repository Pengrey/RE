package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.measurement.internal.C3242k4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p009a8.C0078k;
import p009a8.InterfaceC0085r;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f8281b;

    /* renamed from: a */
    private final AbstractC3126d f8282a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            C2597i.m33076j(bundle);
            this.mAppId = (String) C0078k.m41976a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C0078k.m41976a(bundle, "origin", String.class, null);
            this.mName = (String) C0078k.m41976a(bundle, "name", String.class, null);
            this.mValue = C0078k.m41976a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C0078k.m41976a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C0078k.m41976a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C0078k.m41976a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C0078k.m41976a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C0078k.m41976a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C0078k.m41976a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C0078k.m41976a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C0078k.m41976a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C0078k.m41976a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C0078k.m41976a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C0078k.m41976a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C0078k.m41976a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C3242k4 c3242k4) {
        this.f8282a = new C3123a(c3242k4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x002e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @androidx.annotation.Keep
    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = com.google.android.gms.measurement.AppMeasurement.f8281b
            if (r0 != 0) goto L59
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = com.google.android.gms.measurement.AppMeasurement.f8281b     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L54
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L56
            r3[r6] = r14     // Catch: java.lang.Throwable -> L56
            r3[r7] = r1     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L56
            a8.r r2 = (p009a8.InterfaceC0085r) r2     // Catch: java.lang.Throwable -> L56
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L39
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.f8281b = r14     // Catch: java.lang.Throwable -> L56
            goto L54
        L39:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.k4 r14 = com.google.android.gms.measurement.internal.C3242k4.m31130H(r14, r13, r1)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.f8281b = r1     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r14
        L59:
            com.google.android.gms.measurement.AppMeasurement r14 = com.google.android.gms.measurement.AppMeasurement.f8281b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f8282a.mo28465o(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f8282a.mo28464p(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f8282a.mo28461s(str);
    }

    @Keep
    public long generateEventId() {
        return this.f8282a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f8282a.mo28470c();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> mo28463q = this.f8282a.mo28463q(str, str2);
        ArrayList arrayList = new ArrayList(mo28463q == null ? 0 : mo28463q.size());
        for (Bundle bundle : mo28463q) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f8282a.mo28469g();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f8282a.mo28468l();
    }

    @Keep
    public String getGmpAppId() {
        return this.f8282a.mo28467m();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f8282a.mo28466n(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f8282a.mo28462r(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f8282a.mo28459u(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C2597i.m33076j(conditionalUserProperty);
        AbstractC3126d abstractC3126d = this.f8282a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C0078k.m41975b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC3126d.mo28460t(bundle);
    }

    public AppMeasurement(InterfaceC0085r interfaceC0085r) {
        this.f8282a = new C3124b(interfaceC0085r);
    }
}
