package p154i6;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p007a6.AbstractC0056o;
import p098f6.C5414a;
import p174j6.InterfaceC6313d;
import p216l6.InterfaceC6984a;
import p235m6.C7133a;

/* renamed from: i6.a */
/* loaded from: classes.dex */
public class C6020a implements InterfaceC6041v {

    /* renamed from: a */
    private final Context f16626a;

    /* renamed from: b */
    private final InterfaceC6313d f16627b;

    /* renamed from: c */
    private AlarmManager f16628c;

    /* renamed from: d */
    private final AbstractC2404c f16629d;

    /* renamed from: e */
    private final InterfaceC6984a f16630e;

    public C6020a(Context context, InterfaceC6313d interfaceC6313d, InterfaceC6984a interfaceC6984a, AbstractC2404c abstractC2404c) {
        this(context, interfaceC6313d, (AlarmManager) context.getSystemService("alarm"), interfaceC6984a, abstractC2404c);
    }

    @Override // p154i6.InterfaceC6041v
    /* renamed from: a */
    public void mo22310a(AbstractC0056o abstractC0056o, int i) {
        mo22309b(abstractC0056o, i, false);
    }

    @Override // p154i6.InterfaceC6041v
    /* renamed from: b */
    public void mo22309b(AbstractC0056o abstractC0056o, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", abstractC0056o.mo42044b());
        builder.appendQueryParameter("priority", String.valueOf(C7133a.m19105a(abstractC0056o.mo42042d())));
        if (abstractC0056o.mo42043c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(abstractC0056o.mo42043c(), 0));
        }
        Intent intent = new Intent(this.f16626a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && m22346c(intent)) {
            C5414a.m24382a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", abstractC0056o);
            return;
        }
        long mo21185i0 = this.f16627b.mo21185i0(abstractC0056o);
        long m33669g = this.f16629d.m33669g(abstractC0056o.mo42042d(), mo21185i0, i);
        C5414a.m24381b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", abstractC0056o, Long.valueOf(m33669g), Long.valueOf(mo21185i0), Integer.valueOf(i));
        this.f16628c.set(3, this.f16630e.mo19644a() + m33669g, PendingIntent.getBroadcast(this.f16626a, 0, intent, 0));
    }

    /* renamed from: c */
    boolean m22346c(Intent intent) {
        return PendingIntent.getBroadcast(this.f16626a, 0, intent, 536870912) != null;
    }

    C6020a(Context context, InterfaceC6313d interfaceC6313d, AlarmManager alarmManager, InterfaceC6984a interfaceC6984a, AbstractC2404c abstractC2404c) {
        this.f16626a = context;
        this.f16627b = interfaceC6313d;
        this.f16628c = alarmManager;
        this.f16630e = interfaceC6984a;
        this.f16629d = abstractC2404c;
    }
}
