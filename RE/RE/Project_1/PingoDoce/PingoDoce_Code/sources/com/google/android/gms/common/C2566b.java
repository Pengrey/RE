package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0908j;
import androidx.fragment.app.ActivityC1354d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC2527n0;
import com.google.android.gms.common.api.internal.C2530o0;
import com.google.android.gms.common.api.internal.InterfaceC2505h;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.C2599j;
import p078e7.C5007h;
import p078e7.C5009j;
import p119g7.C5613a;
import p251n7.C7686e;
import p399v6.C11127a;
import p399v6.C11128b;
import p439x6.C12288c;
import p439x6.DialogFragmentC12286a;
import p484z6.AbstractDialogInterface$OnClickListenerC13720q;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.b */
/* loaded from: classes.dex */
public class C2566b extends C2567c {

    /* renamed from: d */
    private static final Object f7385d = new Object();

    /* renamed from: e */
    private static final C2566b f7386e = new C2566b();

    /* renamed from: c */
    private String f7387c;

    /* renamed from: m */
    public static C2566b m33240m() {
        return f7386e;
    }

    @Override // com.google.android.gms.common.C2567c
    /* renamed from: b */
    public Intent mo33228b(Context context, int i, String str) {
        return super.mo33228b(context, i, str);
    }

    @Override // com.google.android.gms.common.C2567c
    /* renamed from: c */
    public PendingIntent mo33227c(Context context, int i, int i2) {
        return super.mo33227c(context, i, i2);
    }

    @Override // com.google.android.gms.common.C2567c
    /* renamed from: e */
    public final String mo33225e(int i) {
        return super.mo33225e(i);
    }

    @Override // com.google.android.gms.common.C2567c
    /* renamed from: g */
    public int mo33223g(Context context) {
        return super.mo33223g(context);
    }

    @Override // com.google.android.gms.common.C2567c
    /* renamed from: h */
    public int mo33222h(Context context, int i) {
        return super.mo33222h(context, i);
    }

    @Override // com.google.android.gms.common.C2567c
    /* renamed from: j */
    public final boolean mo33220j(int i) {
        return super.mo33220j(i);
    }

    /* renamed from: k */
    public Dialog m33242k(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m33237p(activity, i, AbstractDialogInterface$OnClickListenerC13720q.m555b(activity, mo33228b(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: l */
    public PendingIntent m33241l(Context context, ConnectionResult connectionResult) {
        if (connectionResult.m33519y()) {
            return connectionResult.m33520v();
        }
        return mo33227c(context, connectionResult.m33522h(), 0);
    }

    /* renamed from: n */
    public boolean m33239n(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m33242k = m33242k(activity, i, i2, onCancelListener);
        if (m33242k == null) {
            return false;
        }
        m33234s(activity, m33242k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: o */
    public void m33238o(Context context, int i) {
        m33233t(context, i, null, m33226d(context, i, 0, "n"));
    }

    /* renamed from: p */
    final Dialog m33237p(Context context, int i, AbstractDialogInterface$OnClickListenerC13720q abstractDialogInterface$OnClickListenerC13720q, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C2599j.m33068d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m33069c = C2599j.m33069c(context, i);
        if (m33069c != null) {
            builder.setPositiveButton(m33069c, abstractDialogInterface$OnClickListenerC13720q);
        }
        String m33065g = C2599j.m33065g(context, i);
        if (m33065g != null) {
            builder.setTitle(m33065g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: q */
    public final Dialog m33236q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C2599j.m33068d(activity, 18));
        builder.setPositiveButton(BuildConfig.VERSION_NAME, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m33234s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: r */
    public final C2530o0 m33235r(Context context, AbstractC2527n0 abstractC2527n0) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C2530o0 c2530o0 = new C2530o0(abstractC2527n0);
        context.registerReceiver(c2530o0, intentFilter);
        c2530o0.m33310a(context);
        if (m33221i(context, "com.google.android.gms")) {
            return c2530o0;
        }
        abstractC2527n0.mo33282a();
        c2530o0.m33309b();
        return null;
    }

    /* renamed from: s */
    final void m33234s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC1354d) {
                C12288c.m3125y2(dialog, onCancelListener).mo3126x2(((ActivityC1354d) activity).m37323P(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC12286a.m3128a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: t */
    final void m33233t(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            m33232u(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String m33066f = C2599j.m33066f(context, i);
            String m33067e = C2599j.m33067e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C2597i.m33076j(context.getSystemService("notification"));
            C0908j.C0916e m39170w = new C0908j.C0916e(context).m39176q(true).m39187f(true).m39182k(m33066f).m39170w(new C0908j.C0914c().m39195h(m33067e));
            if (C5007h.m25908c(context)) {
                C2597i.m33073m(C5009j.m25898e());
                m39170w.m39172u(context.getApplicationInfo().icon).m39174s(2);
                if (C5007h.m25907d(context)) {
                    m39170w.m39192a(C11127a.f28557a, resources.getString(C11128b.common_open_on_phone), pendingIntent);
                } else {
                    m39170w.m39184i(pendingIntent);
                }
            } else {
                m39170w.m39172u(17301642).m39169x(resources.getString(C11128b.common_google_play_services_notification_ticker)).m39193A(System.currentTimeMillis()).m39184i(pendingIntent).m39183j(m33067e);
            }
            if (C5009j.m25895h()) {
                C2597i.m33073m(C5009j.m25895h());
                synchronized (f7385d) {
                    str2 = this.f7387c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String m33070b = C2599j.m33070b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", m33070b, 4));
                    } else if (!m33070b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(m33070b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                m39170w.m39186g(str2);
            }
            Notification m39191b = m39170w.m39191b();
            if (i == 1 || i == 2 || i == 3) {
                C2569e.f7392b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, m39191b);
        }
    }

    /* renamed from: u */
    final void m33232u(Context context) {
        new HandlerC2571g(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: v */
    public final boolean m33231v(Activity activity, InterfaceC2505h interfaceC2505h, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m33237p = m33237p(activity, i, AbstractDialogInterface$OnClickListenerC13720q.m554c(interfaceC2505h, mo33228b(activity, i, "d"), 2), onCancelListener);
        if (m33237p == null) {
            return false;
        }
        m33234s(activity, m33237p, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: w */
    public final boolean m33230w(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent m33241l;
        if (C5613a.m23575a(context) || (m33241l = m33241l(context, connectionResult)) == null) {
            return false;
        }
        m33233t(context, connectionResult.m33522h(), null, C7686e.m17718a(context, 0, GoogleApiActivity.m33514a(context, m33241l, i, true), C7686e.f20274a | 134217728));
        return true;
    }
}
