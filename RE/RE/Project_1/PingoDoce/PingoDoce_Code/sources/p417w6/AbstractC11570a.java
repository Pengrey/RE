package p417w6;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.C2457q;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p099f7.ThreadFactoryC5416b;
import p267o7.C8031e;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: w6.a */
/* loaded from: classes.dex */
public abstract class AbstractC11570a extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f29617a;

    public AbstractC11570a() {
        C8031e.m17126a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5416b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f29617a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: e */
    private final int m4686e(Context context, Intent intent) {
        AbstractC3419d<Void> m33533c;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            m33533c = C3425g.m30765e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            m33533c = C2457q.m33534b(context).m33533c(2, bundle);
        }
        int mo4689b = mo4689b(context, new CloudMessage(intent));
        try {
            C3425g.m30768b(m33533c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return mo4689b;
    }

    /* renamed from: f */
    private final int m4685f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo4688c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* renamed from: a */
    protected Executor m4690a() {
        return this.f29617a;
    }

    /* renamed from: b */
    protected abstract int mo4689b(Context context, CloudMessage cloudMessage);

    /* renamed from: c */
    protected abstract void mo4688c(Context context, Bundle bundle);

    /* renamed from: d */
    public final /* synthetic */ void m4687d(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        int m4686e;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m4686e = m4685f(context, intent2);
            } else {
                m4686e = m4686e(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(m4686e);
            }
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        m4690a().execute(new Runnable() { // from class: w6.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11570a.this.m4687d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
