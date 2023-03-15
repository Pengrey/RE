package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C3158c8;
import p009a8.InterfaceC0087t;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC0087t {

    /* renamed from: w */
    private C3158c8 f8283w;

    /* renamed from: d */
    private final C3158c8 m31533d() {
        if (this.f8283w == null) {
            this.f8283w = new C3158c8(this);
        }
        return this.f8283w;
    }

    @Override // p009a8.InterfaceC0087t
    /* renamed from: a */
    public final void mo31531a(Intent intent) {
    }

    @Override // p009a8.InterfaceC0087t
    /* renamed from: b */
    public final boolean mo31530b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p009a8.InterfaceC0087t
    @TargetApi(24)
    /* renamed from: c */
    public final void mo31529c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m31533d().m31445e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m31533d().m31444f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m31533d().m31443g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m31533d().m31441i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m31533d().m31440j(intent);
        return true;
    }
}
