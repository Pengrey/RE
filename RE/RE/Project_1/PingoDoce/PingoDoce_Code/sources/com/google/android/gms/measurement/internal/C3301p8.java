package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C2995u0;
import com.google.android.gms.internal.measurement.C3010v0;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.p8 */
/* loaded from: classes.dex */
public final class C3301p8 extends AbstractC3323r8 {

    /* renamed from: d */
    private final AlarmManager f8786d;

    /* renamed from: e */
    private AbstractC3259m f8787e;

    /* renamed from: f */
    private Integer f8788f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3301p8(C3137a9 c3137a9) {
        super(c3137a9);
        this.f8786d = (AlarmManager) this.f8410a.mo31117c().getSystemService("alarm");
    }

    /* renamed from: o */
    private final int m31045o() {
        if (this.f8788f == null) {
            String valueOf = String.valueOf(this.f8410a.mo31117c().getPackageName());
            this.f8788f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f8788f.intValue();
    }

    /* renamed from: p */
    private final PendingIntent m31044p() {
        Context mo31117c = this.f8410a.mo31117c();
        return C2995u0.m32049a(mo31117c, 0, new Intent().setClassName(mo31117c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C2995u0.f8018a);
    }

    /* renamed from: q */
    private final AbstractC3259m m31043q() {
        if (this.f8787e == null) {
            this.f8787e = new C3290o8(this, this.f8820b.m31488b0());
        }
        return this.f8787e;
    }

    @TargetApi(24)
    /* renamed from: r */
    private final void m31042r() {
        JobScheduler jobScheduler = (JobScheduler) this.f8410a.mo31117c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m31045o());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3323r8
    /* renamed from: l */
    protected final boolean mo30839l() {
        AlarmManager alarmManager = this.f8786d;
        if (alarmManager != null) {
            alarmManager.cancel(m31044p());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m31042r();
            return false;
        }
        return false;
    }

    /* renamed from: m */
    public final void m31047m() {
        m31026i();
        this.f8410a.mo31116d().m31328v().m31398a("Unscheduling upload");
        AlarmManager alarmManager = this.f8786d;
        if (alarmManager != null) {
            alarmManager.cancel(m31044p());
        }
        m31043q().m31086b();
        if (Build.VERSION.SDK_INT >= 24) {
            m31042r();
        }
    }

    /* renamed from: n */
    public final void m31046n(long j) {
        m31026i();
        this.f8410a.mo31114f();
        Context mo31117c = this.f8410a.mo31117c();
        if (!C3203g9.m31300X(mo31117c)) {
            this.f8410a.mo31116d().m31333q().m31398a("Receiver not registered/enabled");
        }
        if (!C3203g9.m31299Y(mo31117c, false)) {
            this.f8410a.mo31116d().m31333q().m31398a("Service not registered/enabled");
        }
        m31047m();
        this.f8410a.mo31116d().m31328v().m31397b("Scheduling upload, millis", Long.valueOf(j));
        long mo25912c = this.f8410a.mo31115e().mo25912c() + j;
        this.f8410a.m31094z();
        if (j < Math.max(0L, ((Long) C3339t2.f8956y.m31018a(null)).longValue()) && !m31043q().m31084e()) {
            m31043q().m31085d(j);
        }
        this.f8410a.mo31114f();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f8786d;
            if (alarmManager != null) {
                this.f8410a.m31094z();
                alarmManager.setInexactRepeating(2, mo25912c, Math.max(((Long) C3339t2.f8947t.m31018a(null)).longValue(), j), m31044p());
                return;
            }
            return;
        }
        Context mo31117c2 = this.f8410a.mo31117c();
        ComponentName componentName = new ComponentName(mo31117c2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m31045o = m31045o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C3010v0.m31987a(mo31117c2, new JobInfo.Builder(m31045o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
