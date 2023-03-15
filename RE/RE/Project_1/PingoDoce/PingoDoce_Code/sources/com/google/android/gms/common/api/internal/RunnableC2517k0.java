package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2461a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* loaded from: classes.dex */
final class RunnableC2517k0 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ ConnectionResult f7289w;

    /* renamed from: x */
    final /* synthetic */ C2520l0 f7290x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2517k0(C2520l0 c2520l0, ConnectionResult connectionResult) {
        this.f7290x = c2520l0;
        this.f7289w = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C2485b c2485b;
        C2461a.InterfaceC2470f interfaceC2470f;
        C2461a.InterfaceC2470f interfaceC2470f2;
        C2461a.InterfaceC2470f interfaceC2470f3;
        C2461a.InterfaceC2470f interfaceC2470f4;
        C2520l0 c2520l0 = this.f7290x;
        map = c2520l0.f7296f.f7240l;
        c2485b = c2520l0.f7292b;
        C2506h0 c2506h0 = (C2506h0) map.get(c2485b);
        if (c2506h0 == null) {
            return;
        }
        if (this.f7289w.m33524D()) {
            this.f7290x.f7295e = true;
            interfaceC2470f = this.f7290x.f7291a;
            if (interfaceC2470f.mo20508o()) {
                this.f7290x.m33326h();
                return;
            }
            try {
                C2520l0 c2520l02 = this.f7290x;
                interfaceC2470f3 = c2520l02.f7291a;
                interfaceC2470f4 = c2520l02.f7291a;
                interfaceC2470f3.mo33346d(null, interfaceC2470f4.mo33117c());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                interfaceC2470f2 = this.f7290x.f7291a;
                interfaceC2470f2.mo33345e("Failed to get service from broker.");
                c2506h0.m33391G(new ConnectionResult(10), null);
                return;
            }
        }
        c2506h0.m33391G(this.f7289w, null);
    }
}
