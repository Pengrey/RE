package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C3158c8;
import p009a8.InterfaceC0087t;
import p360t2.AbstractC10376a;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC0087t {

    /* renamed from: w */
    private C3158c8 f8285w;

    /* renamed from: d */
    private final C3158c8 m31528d() {
        if (this.f8285w == null) {
            this.f8285w = new C3158c8(this);
        }
        return this.f8285w;
    }

    @Override // p009a8.InterfaceC0087t
    /* renamed from: a */
    public final void mo31531a(Intent intent) {
        AbstractC10376a.m8093b(intent);
    }

    @Override // p009a8.InterfaceC0087t
    /* renamed from: b */
    public final boolean mo31530b(int i) {
        return stopSelfResult(i);
    }

    @Override // p009a8.InterfaceC0087t
    /* renamed from: c */
    public final void mo31529c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m31528d().m31448b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m31528d().m31445e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m31528d().m31444f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m31528d().m31443g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        m31528d().m31449a(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m31528d().m31440j(intent);
        return true;
    }
}
