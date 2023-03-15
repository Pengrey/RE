package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0908j;
import com.google.android.gms.tasks.C3425g;
import com.google.firebase.messaging.C4270a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p078e7.C5009j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes.dex */
public class C4279c {

    /* renamed from: a */
    private final Executor f11651a;

    /* renamed from: b */
    private final Context f11652b;

    /* renamed from: c */
    private final C4301i0 f11653c;

    public C4279c(Context context, C4301i0 c4301i0, Executor executor) {
        this.f11651a = executor;
        this.f11652b = context;
        this.f11653c = c4301i0;
    }

    /* renamed from: b */
    private boolean m28046b() {
        if (((KeyguardManager) this.f11652b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C5009j.m25897f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f11652b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m28045c(C4270a.C4271a c4271a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f11652b.getSystemService("notification")).notify(c4271a.f11633b, c4271a.f11634c, c4271a.f11632a.m39191b());
    }

    /* renamed from: d */
    private C4286e0 m28044d() {
        C4286e0 m28029e = C4286e0.m28029e(this.f11653c.m27954p("gcm.n.image"));
        if (m28029e != null) {
            m28029e.m28027t(this.f11651a);
        }
        return m28029e;
    }

    /* renamed from: e */
    private void m28043e(C0908j.C0916e c0916e, C4286e0 c4286e0) {
        if (c4286e0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C3425g.m30768b(c4286e0.m28028h(), 5L, TimeUnit.SECONDS);
            c0916e.m39178o(bitmap);
            c0916e.m39170w(new C0908j.C0910b().m39201i(bitmap).m39202h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c4286e0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(e.getCause())));
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c4286e0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m28047a() {
        if (this.f11653c.m27969a("gcm.n.noui")) {
            return true;
        }
        if (m28046b()) {
            return false;
        }
        C4286e0 m28044d = m28044d();
        C4270a.C4271a m28078d = C4270a.m28078d(this.f11652b, this.f11653c);
        m28043e(m28078d.f11632a, m28044d);
        m28045c(m28078d);
        return true;
    }
}
