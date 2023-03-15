package p154i6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p007a6.AbstractC0056o;
import p098f6.C5414a;
import p174j6.InterfaceC6313d;
import p235m6.C7133a;

/* renamed from: i6.c */
/* loaded from: classes.dex */
public class C6022c implements InterfaceC6041v {

    /* renamed from: a */
    private final Context f16632a;

    /* renamed from: b */
    private final InterfaceC6313d f16633b;

    /* renamed from: c */
    private final AbstractC2404c f16634c;

    public C6022c(Context context, InterfaceC6313d interfaceC6313d, AbstractC2404c abstractC2404c) {
        this.f16632a = context;
        this.f16633b = interfaceC6313d;
        this.f16634c = abstractC2404c;
    }

    /* renamed from: d */
    private boolean m22344d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // p154i6.InterfaceC6041v
    /* renamed from: a */
    public void mo22310a(AbstractC0056o abstractC0056o, int i) {
        mo22309b(abstractC0056o, i, false);
    }

    @Override // p154i6.InterfaceC6041v
    /* renamed from: b */
    public void mo22309b(AbstractC0056o abstractC0056o, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f16632a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f16632a.getSystemService("jobscheduler");
        int m22345c = m22345c(abstractC0056o);
        if (!z && m22344d(jobScheduler, m22345c, i)) {
            C5414a.m24382a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC0056o);
            return;
        }
        long mo21185i0 = this.f16633b.mo21185i0(abstractC0056o);
        JobInfo.Builder m33673c = this.f16634c.m33673c(new JobInfo.Builder(m22345c, componentName), abstractC0056o.mo42042d(), mo21185i0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", abstractC0056o.mo42044b());
        persistableBundle.putInt("priority", C7133a.m19105a(abstractC0056o.mo42042d()));
        if (abstractC0056o.mo42043c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC0056o.mo42043c(), 0));
        }
        m33673c.setExtras(persistableBundle);
        C5414a.m24381b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC0056o, Integer.valueOf(m22345c), Long.valueOf(this.f16634c.m33669g(abstractC0056o.mo42042d(), mo21185i0, i)), Long.valueOf(mo21185i0), Integer.valueOf(i));
        jobScheduler.schedule(m33673c.build());
    }

    /* renamed from: c */
    int m22345c(AbstractC0056o abstractC0056o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f16632a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC0056o.mo42044b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C7133a.m19105a(abstractC0056o.mo42042d())).array());
        if (abstractC0056o.mo42043c() != null) {
            adler32.update(abstractC0056o.mo42043c());
        }
        return (int) adler32.getValue();
    }
}
