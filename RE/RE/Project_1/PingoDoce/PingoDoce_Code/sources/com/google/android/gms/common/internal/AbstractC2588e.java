package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;
import p484z6.C13698a0;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes.dex */
public abstract class AbstractC2588e {

    /* renamed from: a */
    private static int f7491a = 4225;

    /* renamed from: b */
    private static final Object f7492b = new Object();

    /* renamed from: c */
    private static C2592f0 f7493c = null;

    /* renamed from: d */
    static HandlerThread f7494d = null;

    /* renamed from: e */
    private static boolean f7495e = false;

    /* renamed from: a */
    public static int m33101a() {
        return f7491a;
    }

    /* renamed from: b */
    public static AbstractC2588e m33100b(Context context) {
        Looper mainLooper;
        synchronized (f7492b) {
            if (f7493c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f7495e) {
                    mainLooper = m33099c().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                f7493c = new C2592f0(applicationContext, mainLooper);
            }
        }
        return f7493c;
    }

    /* renamed from: c */
    public static HandlerThread m33099c() {
        synchronized (f7492b) {
            HandlerThread handlerThread = f7494d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f7494d = handlerThread2;
            handlerThread2.start();
            return f7494d;
        }
    }

    /* renamed from: d */
    protected abstract void mo33096d(C13698a0 c13698a0, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m33098e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo33096d(new C13698a0(str, str2, i, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo33095f(C13698a0 c13698a0, ServiceConnection serviceConnection, String str, Executor executor);
}
