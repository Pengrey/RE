package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC2610s;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.InterfaceC2611t;
import com.google.android.gms.common.util.C2630a;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p078e7.C5008i;
import p133h7.BinderC5870d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.r */
/* loaded from: classes.dex */
public final class C2626r {

    /* renamed from: a */
    static final AbstractBinderC2624p f7547a;

    /* renamed from: b */
    static final AbstractBinderC2624p f7548b;

    /* renamed from: c */
    private static volatile InterfaceC2611t f7549c;

    /* renamed from: d */
    private static final Object f7550d;

    /* renamed from: e */
    private static Context f7551e;

    static {
        new BinderC2618j(AbstractBinderC2622n.m33012H("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC2619k(AbstractBinderC2622n.m33012H("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f7547a = new BinderC2620l(AbstractBinderC2622n.m33012H("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f7548b = new BinderC2621m(AbstractBinderC2622n.m33012H("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f7550d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2636x m33007a(String str, AbstractBinderC2622n abstractBinderC2622n, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m33002f(str, abstractBinderC2622n, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r6v0, types: [h7.b, android.os.IBinder] */
    /* renamed from: b */
    public static C2636x m33006b(String str, boolean z, boolean z2, boolean z3) {
        C2636x m32988d;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C2597i.m33076j(f7551e);
            try {
                m33001g();
                try {
                    zzq mo33030F1 = f7549c.mo33030F1(new zzn(str, z, false, BinderC5870d.m22835S1(f7551e), false));
                    if (mo33030F1.m32985t()) {
                        m32988d = C2636x.m32990b();
                    } else {
                        String m32986h = mo33030F1.m32986h();
                        if (m32986h == null) {
                            m32986h = "error checking package certificate";
                        }
                        m32988d = mo33030F1.m32984v() == 4 ? C2636x.m32988d(m32986h, new PackageManager.NameNotFoundException()) : C2636x.m32989c(m32986h);
                    }
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    m32988d = C2636x.m32988d("module call", e);
                }
            } catch (DynamiteModule.LoadingException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                String valueOf = String.valueOf(e2.getMessage());
                m32988d = C2636x.m32988d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
            }
            return m32988d;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ String m33005c(boolean z, String str, AbstractBinderC2622n abstractBinderC2622n) throws Exception {
        String str2 = true != (!z && m33002f(str, abstractBinderC2622n, true, false).f7556a) ? "not allowed" : "debug cert rejected";
        MessageDigest m32998b = C2630a.m32998b("SHA-1");
        C2597i.m33076j(m32998b);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, C5008i.m25904a(m32998b.digest(abstractBinderC2622n.mo33009S1())), Boolean.valueOf(z), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static synchronized void m33004d(Context context) {
        synchronized (C2626r.class) {
            if (f7551e != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f7551e = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m33003e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m33001g();
                return f7549c.mo33029f();
            } catch (RemoteException | DynamiteModule.LoadingException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: f */
    private static C2636x m33002f(final String str, final AbstractBinderC2622n abstractBinderC2622n, final boolean z, boolean z2) {
        try {
            m33001g();
            C2597i.m33076j(f7551e);
            try {
                return f7549c.mo33031C1(new zzs(str, abstractBinderC2622n, z, z2), BinderC5870d.m22835S1(f7551e.getPackageManager())) ? C2636x.m32990b() : new C2635w(new Callable() { // from class: com.google.android.gms.common.i
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C2626r.m33005c(z, str, abstractBinderC2622n);
                    }
                }, null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C2636x.m32988d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return C2636x.m32988d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    /* renamed from: g */
    private static void m33001g() throws DynamiteModule.LoadingException {
        if (f7549c != null) {
            return;
        }
        C2597i.m33076j(f7551e);
        synchronized (f7550d) {
            if (f7549c == null) {
                f7549c = AbstractBinderC2610s.m33060y(DynamiteModule.m32979e(f7551e, DynamiteModule.f7573d, "com.google.android.gms.googlecertificates").m32980d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
