package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC2741e1;
import com.google.android.gms.internal.measurement.InterfaceC2805i1;
import com.google.android.gms.internal.measurement.InterfaceC2853l1;
import com.google.android.gms.internal.measurement.InterfaceC2885n1;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p009a8.C0086s;
import p009a8.InterfaceC0083p;
import p133h7.BinderC5870d;
import p133h7.InterfaceC5867b;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC2741e1 {

    /* renamed from: a */
    C3242k4 f8289a = null;

    /* renamed from: b */
    private final Map f8290b = new C9545a();

    /* renamed from: y */
    private final void m31527y(InterfaceC2805i1 interfaceC2805i1, String str) {
        zzb();
        this.f8289a.m31124N().m31315I(interfaceC2805i1, str);
    }

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.f8289a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.f8289a.m31095y().m30831l(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31157h0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31181J(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.f8289a.m31095y().m30830m(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void generateEventId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        long m31276r0 = this.f8289a.m31124N().m31276r0();
        zzb();
        this.f8289a.m31124N().m31316H(interfaceC2805i1, m31276r0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getAppInstanceId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        this.f8289a.mo31118b().m31239z(new RunnableC3287o5(this, interfaceC2805i1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getCachedAppInstanceId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        m31527y(interfaceC2805i1, this.f8289a.m31129I().m31167X());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getConditionalUserProperties(String str, String str2, InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        this.f8289a.mo31118b().m31239z(new RunnableC3214h9(this, interfaceC2805i1, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getCurrentScreenClass(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        m31527y(interfaceC2805i1, this.f8289a.m31129I().m31166Y());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getCurrentScreenName(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        m31527y(interfaceC2805i1, this.f8289a.m31129I().m31165Z());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getGmpAppId(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        String str;
        zzb();
        C3233j6 m31129I = this.f8289a.m31129I();
        if (m31129I.f8410a.m31123O() != null) {
            str = m31129I.f8410a.m31123O();
        } else {
            try {
                str = C0086s.m41971b(m31129I.f8410a.mo31117c(), "google_app_id", m31129I.f8410a.m31120R());
            } catch (IllegalStateException e) {
                m31129I.f8410a.mo31116d().m31332r().m31397b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m31527y(interfaceC2805i1, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getMaxUserProperties(String str, InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31172S(str);
        zzb();
        this.f8289a.m31124N().m31317G(interfaceC2805i1, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getTestFlag(InterfaceC2805i1 interfaceC2805i1, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.f8289a.m31124N().m31315I(interfaceC2805i1, this.f8289a.m31129I().m31164a0());
        } else if (i == 1) {
            this.f8289a.m31124N().m31316H(interfaceC2805i1, this.f8289a.m31129I().m31168W().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.f8289a.m31124N().m31317G(interfaceC2805i1, this.f8289a.m31129I().m31169V().intValue());
            } else if (i != 4) {
            } else {
                this.f8289a.m31124N().m31321C(interfaceC2805i1, this.f8289a.m31129I().m31171T().booleanValue());
            }
        } else {
            C3203g9 m31124N = this.f8289a.m31124N();
            double doubleValue = this.f8289a.m31129I().m31170U().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                interfaceC2805i1.mo32591A(bundle);
            } catch (RemoteException e) {
                m31124N.f8410a.mo31116d().m31327w().m31397b("Error returning double value to wrapper", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void getUserProperties(String str, String str2, boolean z, InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        this.f8289a.mo31118b().m31239z(new RunnableC3256l7(this, interfaceC2805i1, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void initialize(InterfaceC5867b interfaceC5867b, zzcl zzclVar, long j) throws RemoteException {
        C3242k4 c3242k4 = this.f8289a;
        if (c3242k4 == null) {
            this.f8289a = C3242k4.m31130H((Context) C2597i.m33076j((Context) BinderC5870d.m22836H(interfaceC5867b)), zzclVar, Long.valueOf(j));
        } else {
            c3242k4.mo31116d().m31327w().m31398a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void isDataCollectionEnabled(InterfaceC2805i1 interfaceC2805i1) throws RemoteException {
        zzb();
        this.f8289a.mo31118b().m31239z(new RunnableC3225i9(this, interfaceC2805i1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31152s(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2805i1 interfaceC2805i1, long j) throws RemoteException {
        Bundle bundle2;
        zzb();
        C2597i.m33080f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f8289a.mo31118b().m31239z(new RunnableC3266m6(this, interfaceC2805i1, new zzau(str2, new zzas(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void logHealthData(int i, String str, InterfaceC5867b interfaceC5867b, InterfaceC5867b interfaceC5867b2, InterfaceC5867b interfaceC5867b3) throws RemoteException {
        zzb();
        this.f8289a.mo31116d().m31337F(i, true, false, str, interfaceC5867b == null ? null : BinderC5870d.m22836H(interfaceC5867b), interfaceC5867b2 == null ? null : BinderC5870d.m22836H(interfaceC5867b2), interfaceC5867b3 != null ? BinderC5870d.m22836H(interfaceC5867b3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void onActivityCreated(InterfaceC5867b interfaceC5867b, Bundle bundle, long j) throws RemoteException {
        zzb();
        C3222i6 c3222i6 = this.f8289a.m31129I().f8563c;
        if (c3222i6 != null) {
            this.f8289a.m31129I().m31156o();
            c3222i6.onActivityCreated((Activity) BinderC5870d.m22836H(interfaceC5867b), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void onActivityDestroyed(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        zzb();
        C3222i6 c3222i6 = this.f8289a.m31129I().f8563c;
        if (c3222i6 != null) {
            this.f8289a.m31129I().m31156o();
            c3222i6.onActivityDestroyed((Activity) BinderC5870d.m22836H(interfaceC5867b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void onActivityPaused(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        zzb();
        C3222i6 c3222i6 = this.f8289a.m31129I().f8563c;
        if (c3222i6 != null) {
            this.f8289a.m31129I().m31156o();
            c3222i6.onActivityPaused((Activity) BinderC5870d.m22836H(interfaceC5867b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void onActivityResumed(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        zzb();
        C3222i6 c3222i6 = this.f8289a.m31129I().f8563c;
        if (c3222i6 != null) {
            this.f8289a.m31129I().m31156o();
            c3222i6.onActivityResumed((Activity) BinderC5870d.m22836H(interfaceC5867b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void onActivitySaveInstanceState(InterfaceC5867b interfaceC5867b, InterfaceC2805i1 interfaceC2805i1, long j) throws RemoteException {
        zzb();
        C3222i6 c3222i6 = this.f8289a.m31129I().f8563c;
        Bundle bundle = new Bundle();
        if (c3222i6 != null) {
            this.f8289a.m31129I().m31156o();
            c3222i6.onActivitySaveInstanceState((Activity) BinderC5870d.m22836H(interfaceC5867b), bundle);
        }
        try {
            interfaceC2805i1.mo32591A(bundle);
        } catch (RemoteException e) {
            this.f8289a.mo31116d().m31327w().m31397b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void onActivityStarted(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        zzb();
        if (this.f8289a.m31129I().f8563c != null) {
            this.f8289a.m31129I().m31156o();
            Activity activity = (Activity) BinderC5870d.m22836H(interfaceC5867b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void onActivityStopped(InterfaceC5867b interfaceC5867b, long j) throws RemoteException {
        zzb();
        if (this.f8289a.m31129I().f8563c != null) {
            this.f8289a.m31129I().m31156o();
            Activity activity = (Activity) BinderC5870d.m22836H(interfaceC5867b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void performAction(Bundle bundle, InterfaceC2805i1 interfaceC2805i1, long j) throws RemoteException {
        zzb();
        interfaceC2805i1.mo32591A(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void registerOnMeasurementEventListener(InterfaceC2853l1 interfaceC2853l1) throws RemoteException {
        InterfaceC0083p interfaceC0083p;
        zzb();
        synchronized (this.f8290b) {
            interfaceC0083p = (InterfaceC0083p) this.f8290b.get(Integer.valueOf(interfaceC2853l1.mo32500b()));
            if (interfaceC0083p == null) {
                interfaceC0083p = new C3247k9(this, interfaceC2853l1);
                this.f8290b.put(Integer.valueOf(interfaceC2853l1.mo32500b()), interfaceC0083p);
            }
        }
        this.f8289a.m31129I().m31147x(interfaceC0083p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31146y(j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.f8289a.mo31116d().m31332r().m31398a("Conditional user property must not be null");
        } else {
            this.f8289a.m31129I().m31186E(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31183H(bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31185F(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setCurrentScreen(InterfaceC5867b interfaceC5867b, String str, String str2, long j) throws RemoteException {
        zzb();
        this.f8289a.m31127K().m30903E((Activity) BinderC5870d.m22836H(interfaceC5867b), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        C3233j6 m31129I = this.f8289a.m31129I();
        m31129I.m30845i();
        m31129I.f8410a.mo31118b().m31239z(new RunnableC3265m5(m31129I, z));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final C3233j6 m31129I = this.f8289a.m31129I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        m31129I.f8410a.mo31118b().m31239z(new Runnable() { // from class: com.google.android.gms.measurement.internal.k5
            @Override // java.lang.Runnable
            public final void run() {
                C3233j6.this.m31154q(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setEventInterceptor(InterfaceC2853l1 interfaceC2853l1) throws RemoteException {
        zzb();
        C3236j9 c3236j9 = new C3236j9(this, interfaceC2853l1);
        if (this.f8289a.mo31118b().m31253C()) {
            this.f8289a.m31129I().m31182I(c3236j9);
        } else {
            this.f8289a.mo31118b().m31239z(new RunnableC3257l8(this, c3236j9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setInstanceIdProvider(InterfaceC2885n1 interfaceC2885n1) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31181J(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        C3233j6 m31129I = this.f8289a.m31129I();
        m31129I.f8410a.mo31118b().m31239z(new RunnableC3298p5(m31129I, j));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setUserId(String str, long j) throws RemoteException {
        zzb();
        if (str != null && str.length() == 0) {
            this.f8289a.mo31116d().m31327w().m31398a("User ID must be non-empty");
        } else {
            this.f8289a.m31129I().m31178M(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void setUserProperty(String str, String str2, InterfaceC5867b interfaceC5867b, boolean z, long j) throws RemoteException {
        zzb();
        this.f8289a.m31129I().m31178M(str, str2, BinderC5870d.m22836H(interfaceC5867b), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2757f1
    public void unregisterOnMeasurementEventListener(InterfaceC2853l1 interfaceC2853l1) throws RemoteException {
        InterfaceC0083p interfaceC0083p;
        zzb();
        synchronized (this.f8290b) {
            interfaceC0083p = (InterfaceC0083p) this.f8290b.remove(Integer.valueOf(interfaceC2853l1.mo32500b()));
        }
        if (interfaceC0083p == null) {
            interfaceC0083p = new C3247k9(this, interfaceC2853l1);
        }
        this.f8289a.m31129I().m31176O(interfaceC0083p);
    }
}
