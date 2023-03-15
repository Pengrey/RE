package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2720cc;
import com.google.android.gms.internal.measurement.InterfaceC2980t0;
import p058d7.C4747a;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* loaded from: classes.dex */
final class RunnableC3350u3 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ InterfaceC2980t0 f9021w;

    /* renamed from: x */
    final /* synthetic */ ServiceConnection f9022x;

    /* renamed from: y */
    final /* synthetic */ ServiceConnectionC3360v3 f9023y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3350u3(ServiceConnectionC3360v3 serviceConnectionC3360v3, InterfaceC2980t0 interfaceC2980t0, ServiceConnection serviceConnection) {
        this.f9023y = serviceConnectionC3360v3;
        this.f9021w = interfaceC2980t0;
        this.f9022x = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        ServiceConnectionC3360v3 serviceConnectionC3360v3 = this.f9023y;
        C3370w3 c3370w3 = serviceConnectionC3360v3.f9038b;
        str = serviceConnectionC3360v3.f9037a;
        InterfaceC2980t0 interfaceC2980t0 = this.f9021w;
        ServiceConnection serviceConnection = this.f9022x;
        c3370w3.f9051a.mo31118b().mo30825h();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = interfaceC2980t0.mo32090A(bundle2);
        } catch (Exception e) {
            c3370w3.f9051a.mo31116d().m31332r().m31397b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        if (bundle == null) {
            c3370w3.f9051a.mo31116d().m31332r().m31398a("Install Referrer Service returned a null response");
            bundle = null;
        }
        c3370w3.f9051a.mo31118b().mo30825h();
        C3242k4.m31100t();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                c3370w3.f9051a.mo31116d().m31327w().m31398a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    c3370w3.f9051a.mo31116d().m31328v().m31397b("InstallReferrer API result", string);
                    C3203g9 m31124N = c3370w3.f9051a.m31124N();
                    Uri parse = Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?"));
                    C2720cc.m32799b();
                    Bundle m31272t0 = m31124N.m31272t0(parse, c3370w3.f9051a.m31094z().m31373B(null, C3339t2.f8948t0));
                    if (m31272t0 == null) {
                        c3370w3.f9051a.mo31116d().m31332r().m31398a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = m31272t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                c3370w3.f9051a.mo31116d().m31332r().m31398a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                m31272t0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == c3370w3.f9051a.m31132F().f8962f.m31039a()) {
                            c3370w3.f9051a.mo31116d().m31328v().m31398a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c3370w3.f9051a.m31105o()) {
                            c3370w3.f9051a.m31132F().f8962f.m31038b(j);
                            c3370w3.f9051a.mo31116d().m31328v().m31397b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m31272t0.putString("_cis", "referrer API v2");
                            c3370w3.f9051a.m31129I().m31151t("auto", "_cmp", m31272t0, str);
                        }
                    }
                } else {
                    c3370w3.f9051a.mo31116d().m31332r().m31398a("No referrer defined in Install Referrer response");
                }
            }
        }
        C4747a.m26711b().m26710c(c3370w3.f9051a.mo31117c(), serviceConnection);
    }
}
