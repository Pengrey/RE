package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.n3 */
/* loaded from: classes.dex */
public final class C3274n3 extends BroadcastReceiver {

    /* renamed from: a */
    private final C3137a9 f8699a;

    /* renamed from: b */
    private boolean f8700b;

    /* renamed from: c */
    private boolean f8701c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3274n3(C3137a9 c3137a9) {
        C2597i.m33076j(c3137a9);
        this.f8699a = c3137a9;
    }

    /* renamed from: b */
    public final void m31066b() {
        this.f8699a.m31483g();
        this.f8699a.mo31118b().mo30825h();
        if (this.f8700b) {
            return;
        }
        this.f8699a.mo31117c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f8701c = this.f8699a.m31493X().m31090m();
        this.f8699a.mo31116d().m31328v().m31397b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f8701c));
        this.f8700b = true;
    }

    /* renamed from: c */
    public final void m31065c() {
        this.f8699a.m31483g();
        this.f8699a.mo31118b().mo30825h();
        this.f8699a.mo31118b().mo30825h();
        if (this.f8700b) {
            this.f8699a.mo31116d().m31328v().m31398a("Unregistering connectivity change receiver");
            this.f8700b = false;
            this.f8701c = false;
            try {
                this.f8699a.mo31117c().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f8699a.mo31116d().m31332r().m31397b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f8699a.m31483g();
        String action = intent.getAction();
        this.f8699a.mo31116d().m31328v().m31397b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m31090m = this.f8699a.m31493X().m31090m();
            if (this.f8701c != m31090m) {
                this.f8701c = m31090m;
                this.f8699a.mo31118b().m31239z(new RunnableC3263m3(this, m31090m));
                return;
            }
            return;
        }
        this.f8699a.mo31116d().m31327w().m31397b("NetworkBroadcastReceiver received unknown action", action);
    }
}
