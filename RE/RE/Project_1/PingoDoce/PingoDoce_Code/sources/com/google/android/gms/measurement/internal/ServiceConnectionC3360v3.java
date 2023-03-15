package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC2964s0;
import com.google.android.gms.internal.measurement.InterfaceC2980t0;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.v3 */
/* loaded from: classes.dex */
public final class ServiceConnectionC3360v3 implements ServiceConnection {

    /* renamed from: a */
    private final String f9037a;

    /* renamed from: b */
    final /* synthetic */ C3370w3 f9038b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC3360v3(C3370w3 c3370w3, String str) {
        this.f9038b = c3370w3;
        this.f9037a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                InterfaceC2980t0 m32133y = AbstractBinderC2964s0.m32133y(iBinder);
                if (m32133y == null) {
                    this.f9038b.f9051a.mo31116d().m31327w().m31398a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f9038b.f9051a.mo31116d().m31328v().m31398a("Install Referrer Service connected");
                this.f9038b.f9051a.mo31118b().m31239z(new RunnableC3350u3(this, m32133y, this));
                return;
            } catch (RuntimeException e) {
                this.f9038b.f9051a.mo31116d().m31327w().m31397b("Exception occurred while calling Install Referrer API", e);
                return;
            }
        }
        this.f9038b.f9051a.mo31116d().m31327w().m31398a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9038b.f9051a.mo31116d().m31328v().m31398a("Install Referrer Service disconnected");
    }
}
