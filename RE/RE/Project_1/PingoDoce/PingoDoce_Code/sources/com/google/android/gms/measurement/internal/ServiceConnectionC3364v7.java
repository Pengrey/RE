package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC2576b;
import com.google.android.gms.common.internal.C2597i;
import p058d7.C4747a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* loaded from: classes.dex */
public final class ServiceConnectionC3364v7 implements ServiceConnection, AbstractC2576b.InterfaceC2577a, AbstractC2576b.InterfaceC2578b {

    /* renamed from: a */
    private volatile boolean f9044a;

    /* renamed from: b */
    private volatile C3153c3 f9045b;

    /* renamed from: c */
    final /* synthetic */ C3374w7 f9046c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC3364v7(C3374w7 c3374w7) {
        this.f9046c = c3374w7;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b.InterfaceC2577a
    /* renamed from: H */
    public final void mo30934H(Bundle bundle) {
        C2597i.m33081e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C2597i.m33076j(this.f9045b);
                this.f9046c.f8410a.mo31118b().m31239z(new RunnableC3333s7(this, (InterfaceC3369w2) this.f9045b.m33182D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f9045b = null;
                this.f9044a = false;
            }
        }
    }

    /* renamed from: b */
    public final void m30932b(Intent intent) {
        ServiceConnectionC3364v7 serviceConnectionC3364v7;
        this.f9046c.mo30825h();
        Context mo31117c = this.f9046c.f8410a.mo31117c();
        C4747a m26711b = C4747a.m26711b();
        synchronized (this) {
            if (this.f9044a) {
                this.f9046c.f8410a.mo31116d().m31328v().m31398a("Connection attempt already in progress");
                return;
            }
            this.f9046c.f8410a.mo31116d().m31328v().m31398a("Using local app measurement service");
            this.f9044a = true;
            serviceConnectionC3364v7 = this.f9046c.f9070c;
            m26711b.m26712a(mo31117c, intent, serviceConnectionC3364v7, 129);
        }
    }

    /* renamed from: c */
    public final void m30931c() {
        this.f9046c.mo30825h();
        Context mo31117c = this.f9046c.f8410a.mo31117c();
        synchronized (this) {
            if (this.f9044a) {
                this.f9046c.f8410a.mo31116d().m31328v().m31398a("Connection attempt already in progress");
            } else if (this.f9045b != null && (this.f9045b.m33149i() || this.f9045b.m33160b())) {
                this.f9046c.f8410a.mo31116d().m31328v().m31398a("Already awaiting connection attempt");
            } else {
                this.f9045b = new C3153c3(mo31117c, Looper.getMainLooper(), this, this);
                this.f9046c.f8410a.mo31116d().m31328v().m31398a("Connecting to remote service");
                this.f9044a = true;
                C2597i.m33076j(this.f9045b);
                this.f9045b.m33143q();
            }
        }
    }

    /* renamed from: d */
    public final void m30930d() {
        if (this.f9045b != null && (this.f9045b.m33160b() || this.f9045b.m33149i())) {
            this.f9045b.mo32942n();
        }
        this.f9045b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC3364v7 serviceConnectionC3364v7;
        InterfaceC3369w2 c3349u2;
        C2597i.m33081e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f9044a = false;
                this.f9046c.f8410a.mo31116d().m31332r().m31398a("Service connected with null binder");
                return;
            }
            InterfaceC3369w2 interfaceC3369w2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC3369w2) {
                        c3349u2 = (InterfaceC3369w2) queryLocalInterface;
                    } else {
                        c3349u2 = new C3349u2(iBinder);
                    }
                    interfaceC3369w2 = c3349u2;
                    this.f9046c.f8410a.mo31116d().m31328v().m31398a("Bound to IMeasurementService interface");
                } else {
                    this.f9046c.f8410a.mo31116d().m31332r().m31397b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f9046c.f8410a.mo31116d().m31332r().m31398a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC3369w2 == null) {
                this.f9044a = false;
                try {
                    C4747a m26711b = C4747a.m26711b();
                    Context mo31117c = this.f9046c.f8410a.mo31117c();
                    serviceConnectionC3364v7 = this.f9046c.f9070c;
                    m26711b.m26710c(mo31117c, serviceConnectionC3364v7);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f9046c.f8410a.mo31118b().m31239z(new RunnableC3311q7(this, interfaceC3369w2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2597i.m33081e("MeasurementServiceConnection.onServiceDisconnected");
        this.f9046c.f8410a.mo31116d().m31333q().m31398a("Service disconnected");
        this.f9046c.f8410a.mo31118b().m31239z(new RunnableC3322r7(this, componentName));
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b.InterfaceC2577a
    /* renamed from: s */
    public final void mo30929s(int i) {
        C2597i.m33081e("MeasurementServiceConnection.onConnectionSuspended");
        this.f9046c.f8410a.mo31116d().m31333q().m31398a("Service connection suspended");
        this.f9046c.f8410a.mo31118b().m31239z(new RunnableC3344t7(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b.InterfaceC2578b
    /* renamed from: y */
    public final void mo30928y(ConnectionResult connectionResult) {
        C2597i.m33081e("MeasurementServiceConnection.onConnectionFailed");
        C3197g3 m31133E = this.f9046c.f8410a.m31133E();
        if (m31133E != null) {
            m31133E.m31327w().m31397b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f9044a = false;
            this.f9045b = null;
        }
        this.f9046c.f8410a.mo31118b().m31239z(new RunnableC3354u7(this));
    }
}
