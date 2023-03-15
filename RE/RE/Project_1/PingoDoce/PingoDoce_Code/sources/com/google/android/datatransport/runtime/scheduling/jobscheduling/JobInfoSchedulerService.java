package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p007a6.AbstractC0056o;
import p007a6.C0062t;
import p235m6.C7133a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m33676b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C0062t.m42028f(getApplicationContext());
        AbstractC0056o.AbstractC0057a mo42036d = AbstractC0056o.m42045a().mo42038b(string).mo42036d(C7133a.m19104b(i));
        if (string2 != null) {
            mo42036d.mo42037c(Base64.decode(string2, 0));
        }
        C0062t.m42031c().m42029e().m22322v(mo42036d.mo42039a(), i2, new Runnable() { // from class: i6.d
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m33676b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
