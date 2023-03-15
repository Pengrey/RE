package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p007a6.AbstractC0056o;
import p007a6.C0062t;
import p154i6.RunnableC6021b;
import p235m6.C7133a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m33678b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C0062t.m42028f(context);
        AbstractC0056o.AbstractC0057a mo42036d = AbstractC0056o.m42045a().mo42038b(queryParameter).mo42036d(C7133a.m19104b(intValue));
        if (queryParameter2 != null) {
            mo42036d.mo42037c(Base64.decode(queryParameter2, 0));
        }
        C0062t.m42031c().m42029e().m22322v(mo42036d.mo42039a(), i, RunnableC6021b.f16631w);
    }
}
