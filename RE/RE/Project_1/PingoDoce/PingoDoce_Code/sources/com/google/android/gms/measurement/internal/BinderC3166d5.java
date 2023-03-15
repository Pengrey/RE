package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.C2570f;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.C2691b;
import com.google.android.gms.internal.measurement.C2709c1;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p009a8.C0079l;
import p078e7.C5010k;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* loaded from: classes.dex */
public final class BinderC3166d5 extends AbstractBinderC3359v2 {

    /* renamed from: a */
    private final C3137a9 f8386a;

    /* renamed from: b */
    private Boolean f8387b;

    /* renamed from: c */
    private String f8388c;

    public BinderC3166d5(C3137a9 c3137a9, String str) {
        C2597i.m33076j(c3137a9);
        this.f8386a = c3137a9;
        this.f8388c = null;
    }

    /* renamed from: W1 */
    private final void m31402W1(zzp zzpVar, boolean z) {
        C2597i.m33076j(zzpVar);
        C2597i.m33080f(zzpVar.f9204w);
        m31401X1(zzpVar.f9204w, false);
        this.f8386a.m31482g0().m31313K(zzpVar.f9205x, zzpVar.f9198M);
    }

    /* renamed from: X1 */
    private final void m31401X1(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f8387b == null) {
                        if (!"com.google.android.gms".equals(this.f8388c) && !C5010k.m25891a(this.f8386a.mo31117c(), Binder.getCallingUid()) && !C2570f.m33205a(this.f8386a.mo31117c()).m33203c(Binder.getCallingUid())) {
                            z2 = false;
                            this.f8387b = Boolean.valueOf(z2);
                        }
                        z2 = true;
                        this.f8387b = Boolean.valueOf(z2);
                    }
                    if (this.f8387b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f8386a.mo31116d().m31332r().m31397b("Measurement Service called with invalid calling package. appId", C3197g3.m31324z(str));
                    throw e;
                }
            }
            if (this.f8388c == null && C2569e.m33207j(this.f8386a.mo31117c(), Binder.getCallingUid(), str)) {
                this.f8388c = str;
            }
            if (str.equals(this.f8388c)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.f8386a.mo31116d().m31332r().m31398a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: y */
    private final void m31400y(zzau zzauVar, zzp zzpVar) {
        this.f8386a.m31490a();
        this.f8386a.m31479i(zzauVar, zzpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final zzau m31407H(zzau zzauVar, zzp zzpVar) {
        zzas zzasVar;
        if ("_cmp".equals(zzauVar.f9175w) && (zzasVar = zzauVar.f9176x) != null && zzasVar.m30819h() != 0) {
            String m30820F = zzauVar.f9176x.m30820F("_cis");
            if ("referrer broadcast".equals(m30820F) || "referrer API".equals(m30820F)) {
                this.f8386a.mo31116d().m31329u().m31397b("Event has been filtered ", zzauVar.toString());
                return new zzau("_cmpx", zzauVar.f9176x, zzauVar.f9177y, zzauVar.f9178z);
            }
        }
        return zzauVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: I0 */
    public final void mo30926I0(zzks zzksVar, zzp zzpVar) {
        C2597i.m33076j(zzksVar);
        m31402W1(zzpVar, false);
        m31403V1(new RunnableC3401z4(this, zzksVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: L */
    public final void mo30925L(zzp zzpVar) {
        C2597i.m33080f(zzpVar.f9204w);
        C2597i.m33076j(zzpVar.f9203R);
        RunnableC3361v4 runnableC3361v4 = new RunnableC3361v4(this, zzpVar);
        C2597i.m33076j(runnableC3361v4);
        if (this.f8386a.mo31118b().m31253C()) {
            runnableC3361v4.run();
        } else {
            this.f8386a.mo31118b().m31255A(runnableC3361v4);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: M */
    public final void mo30924M(long j, String str, String str2, String str3) {
        m31403V1(new RunnableC3155c5(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: M0 */
    public final void mo30923M0(zzab zzabVar) {
        C2597i.m33076j(zzabVar);
        C2597i.m33076j(zzabVar.f9172y);
        C2597i.m33080f(zzabVar.f9170w);
        m31401X1(zzabVar.f9170w, true);
        m31403V1(new RunnableC3275n4(this, new zzab(zzabVar)));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: N0 */
    public final List mo30922N0(String str, String str2, String str3) {
        m31401X1(str, true);
        try {
            return (List) this.f8386a.mo31118b().m31246s(new CallableC3319r4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f8386a.mo31116d().m31332r().m31397b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: Q */
    public final void mo30921Q(final Bundle bundle, zzp zzpVar) {
        m31402W1(zzpVar, false);
        final String str = zzpVar.f9204w;
        C2597i.m33076j(str);
        m31403V1(new Runnable() { // from class: com.google.android.gms.measurement.internal.l4
            @Override // java.lang.Runnable
            public final void run() {
                BinderC3166d5.this.m31404U1(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: R */
    public final List mo30920R(String str, String str2, boolean z, zzp zzpVar) {
        m31402W1(zzpVar, false);
        String str3 = zzpVar.f9204w;
        C2597i.m33076j(str3);
        try {
            List<C3181e9> list = (List) this.f8386a.mo31118b().m31246s(new CallableC3286o4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3181e9 c3181e9 : list) {
                if (z || !C3203g9.m31302V(c3181e9.f8424c)) {
                    arrayList.add(new zzks(c3181e9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f8386a.mo31116d().m31332r().m31396c("Failed to query user properties. appId", C3197g3.m31324z(zzpVar.f9204w), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: S0 */
    public final List mo30919S0(zzp zzpVar, boolean z) {
        m31402W1(zzpVar, false);
        String str = zzpVar.f9204w;
        C2597i.m33076j(str);
        try {
            List<C3181e9> list = (List) this.f8386a.mo31118b().m31246s(new CallableC3133a5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3181e9 c3181e9 : list) {
                if (z || !C3203g9.m31302V(c3181e9.f8424c)) {
                    arrayList.add(new zzks(c3181e9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f8386a.mo31116d().m31332r().m31396c("Failed to get user properties. appId", C3197g3.m31324z(zzpVar.f9204w), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T1 */
    public final void m31405T1(zzau zzauVar, zzp zzpVar) {
        if (!this.f8386a.m31491Z().m31380u(zzpVar.f9204w)) {
            m31400y(zzauVar, zzpVar);
            return;
        }
        this.f8386a.mo31116d().m31328v().m31397b("EES config found for", zzpVar.f9204w);
        C3176e4 m31491Z = this.f8386a.m31491Z();
        String str = zzpVar.f9204w;
        C2709c1 c2709c1 = TextUtils.isEmpty(str) ? null : (C2709c1) m31491Z.f8407i.m10631d(str);
        if (c2709c1 != null) {
            try {
                Map m31430I = this.f8386a.m31484f0().m31430I(zzauVar.f9176x.m30817v(), true);
                String m41974a = C0079l.m41974a(zzauVar.f9175w);
                if (m41974a == null) {
                    m41974a = zzauVar.f9175w;
                }
                if (c2709c1.m32818e(new C2691b(m41974a, zzauVar.f9178z, m31430I))) {
                    if (c2709c1.m32816g()) {
                        this.f8386a.mo31116d().m31328v().m31397b("EES edited event", zzauVar.f9175w);
                        m31400y(this.f8386a.m31484f0().m31438A(c2709c1.m32822a().m32827b()), zzpVar);
                    } else {
                        m31400y(zzauVar, zzpVar);
                    }
                    if (c2709c1.m32817f()) {
                        for (C2691b c2691b : c2709c1.m32822a().m32826c()) {
                            this.f8386a.mo31116d().m31328v().m31397b("EES logging created event", c2691b.m32898d());
                            m31400y(this.f8386a.m31484f0().m31438A(c2691b), zzpVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f8386a.mo31116d().m31332r().m31396c("EES error. appId, eventName", zzpVar.f9205x, zzauVar.f9175w);
            }
            this.f8386a.mo31116d().m31328v().m31397b("EES was not applied to event", zzauVar.f9175w);
            m31400y(zzauVar, zzpVar);
            return;
        }
        this.f8386a.mo31116d().m31328v().m31397b("EES not loaded for", zzpVar.f9204w);
        m31400y(zzauVar, zzpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U1 */
    public final /* synthetic */ void m31404U1(String str, Bundle bundle) {
        C3226j m31495V = this.f8386a.m31495V();
        m31495V.mo30825h();
        m31495V.m31026i();
        byte[] m32865k = m31495V.f8820b.m31484f0().m31437B(new C3281o(m31495V.f8410a, BuildConfig.VERSION_NAME, str, "dep", 0L, 0L, bundle)).m32865k();
        m31495V.f8410a.mo31116d().m31328v().m31396c("Saving default event parameters, appId, data size", m31495V.f8410a.m31134D().m31454d(str), Integer.valueOf(m32865k.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", m32865k);
        try {
            if (m31495V.m31223P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                m31495V.f8410a.mo31116d().m31332r().m31397b("Failed to insert default event parameters (got -1). appId", C3197g3.m31324z(str));
            }
        } catch (SQLiteException e) {
            m31495V.f8410a.mo31116d().m31332r().m31396c("Error storing default event parameters. appId", C3197g3.m31324z(str), e);
        }
    }

    /* renamed from: V1 */
    final void m31403V1(Runnable runnable) {
        C2597i.m33076j(runnable);
        if (this.f8386a.mo31118b().m31253C()) {
            runnable.run();
        } else {
            this.f8386a.mo31118b().m31239z(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: Z */
    public final void mo30918Z(zzau zzauVar, String str, String str2) {
        C2597i.m33076j(zzauVar);
        C2597i.m33080f(str);
        m31401X1(str, true);
        m31403V1(new RunnableC3381x4(this, zzauVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: a0 */
    public final void mo30917a0(zzab zzabVar, zzp zzpVar) {
        C2597i.m33076j(zzabVar);
        C2597i.m33076j(zzabVar.f9172y);
        m31402W1(zzpVar, false);
        zzab zzabVar2 = new zzab(zzabVar);
        zzabVar2.f9170w = zzpVar.f9204w;
        m31403V1(new RunnableC3264m4(this, zzabVar2, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: e0 */
    public final List mo30916e0(String str, String str2, String str3, boolean z) {
        m31401X1(str, true);
        try {
            List<C3181e9> list = (List) this.f8386a.mo31118b().m31246s(new CallableC3297p4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3181e9 c3181e9 : list) {
                if (z || !C3203g9.m31302V(c3181e9.f8424c)) {
                    arrayList.add(new zzks(c3181e9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f8386a.mo31116d().m31332r().m31396c("Failed to get user properties as. appId", C3197g3.m31324z(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: h1 */
    public final void mo30915h1(zzp zzpVar) {
        m31402W1(zzpVar, false);
        m31403V1(new RunnableC3144b5(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: j1 */
    public final void mo30914j1(zzau zzauVar, zzp zzpVar) {
        C2597i.m33076j(zzauVar);
        m31402W1(zzpVar, false);
        m31403V1(new RunnableC3371w4(this, zzauVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: o0 */
    public final void mo30913o0(zzp zzpVar) {
        C2597i.m33080f(zzpVar.f9204w);
        m31401X1(zzpVar.f9204w, false);
        m31403V1(new RunnableC3330s4(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: q1 */
    public final List mo30912q1(String str, String str2, zzp zzpVar) {
        m31402W1(zzpVar, false);
        String str3 = zzpVar.f9204w;
        C2597i.m33076j(str3);
        try {
            return (List) this.f8386a.mo31118b().m31246s(new CallableC3308q4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f8386a.mo31116d().m31332r().m31397b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: w0 */
    public final String mo30911w0(zzp zzpVar) {
        m31402W1(zzpVar, false);
        return this.f8386a.m31478i0(zzpVar);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: x1 */
    public final void mo30910x1(zzp zzpVar) {
        m31402W1(zzpVar, false);
        m31403V1(new RunnableC3351u4(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: z1 */
    public final byte[] mo30909z1(zzau zzauVar, String str) {
        C2597i.m33080f(str);
        C2597i.m33076j(zzauVar);
        m31401X1(str, true);
        this.f8386a.mo31116d().m31333q().m31397b("Log and bundle. event", this.f8386a.m31494W().m31454d(zzauVar.f9175w));
        long mo25913b = this.f8386a.mo31115e().mo25913b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f8386a.mo31118b().m31245t(new CallableC3391y4(this, zzauVar, str)).get();
            if (bArr == null) {
                this.f8386a.mo31116d().m31332r().m31397b("Log and bundle returned null. appId", C3197g3.m31324z(str));
                bArr = new byte[0];
            }
            this.f8386a.mo31116d().m31333q().m31395d("Log and bundle processed. event, size, time_ms", this.f8386a.m31494W().m31454d(zzauVar.f9175w), Integer.valueOf(bArr.length), Long.valueOf((this.f8386a.mo31115e().mo25913b() / 1000000) - mo25913b));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f8386a.mo31116d().m31332r().m31395d("Failed to log and bundle. appId, event, error", C3197g3.m31324z(str), this.f8386a.m31494W().m31454d(zzauVar.f9175w), e);
            return null;
        }
    }
}
