package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import p031b9.C1844a;

/* loaded from: classes.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: A */
    private BinderC3916x f10872A;

    /* renamed from: B */
    private NotificationManager f10873B;

    /* renamed from: w */
    private final C1844a f10874w = new C1844a("AssetPackExtractionService");

    /* renamed from: x */
    Context f10875x;

    /* renamed from: y */
    C3903t2 f10876y;

    /* renamed from: z */
    C3924z f10877z;

    /* renamed from: c */
    private final synchronized void m28770c(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i >= 26 ? new Notification.Builder(this.f10875x, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.f10875x).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (i >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f10874w.m35277f("Starting foreground service.", new Object[0]);
        this.f10876y.m28628b(true);
        if (i >= 26) {
            this.f10873B.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: a */
    public final synchronized Bundle m28772a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        C1844a c1844a = this.f10874w;
        Integer valueOf = Integer.valueOf(i);
        c1844a.m35280c("updateServiceState: %d", valueOf);
        if (i == 1) {
            m28770c(bundle);
        } else if (i == 2) {
            m28771b();
        } else {
            this.f10874w.m35278e("Unknown action type received: %d", valueOf);
        }
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void m28771b() {
        this.f10874w.m35277f("Stopping service.", new Object[0]);
        this.f10876y.m28628b(false);
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f10872A;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f10874w.m35280c("onCreate", new Object[0]);
        C3902t1.m28636b(getApplicationContext()).mo1550a(this);
        this.f10872A = new BinderC3916x(this.f10875x, this, this.f10877z);
        this.f10873B = (NotificationManager) this.f10875x.getSystemService("notification");
    }
}
