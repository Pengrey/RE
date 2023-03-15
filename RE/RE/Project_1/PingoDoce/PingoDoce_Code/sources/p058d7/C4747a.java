package p058d7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p078e7.C5009j;
import p119g7.C5615c;
import p484z6.InterfaceC13703c0;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: d7.a */
/* loaded from: classes.dex */
public class C4747a {

    /* renamed from: b */
    private static final Object f13021b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile C4747a f13022c;

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f13023a = new ConcurrentHashMap<>();

    private C4747a() {
    }

    /* renamed from: b */
    public static C4747a m26711b() {
        if (f13022c == null) {
            synchronized (f13021b) {
                if (f13022c == null) {
                    f13022c = new C4747a();
                }
            }
        }
        C4747a c4747a = f13022c;
        C2597i.m33076j(c4747a);
        return c4747a;
    }

    /* renamed from: e */
    private static void m26708e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m26707f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C5615c.m23567a(context).m23572c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (m26706g(serviceConnection)) {
            ServiceConnection putIfAbsent = this.f13023a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean m26705h = m26705h(context, intent, serviceConnection, i, executor);
                if (m26705h) {
                    return m26705h;
                }
                return false;
            } finally {
                this.f13023a.remove(serviceConnection, serviceConnection);
            }
        }
        return m26705h(context, intent, serviceConnection, i, executor);
    }

    /* renamed from: g */
    private static boolean m26706g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC13703c0);
    }

    /* renamed from: h */
    private static final boolean m26705h(Context context, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return (!C5009j.m25893j() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean m26712a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m26707f(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    /* renamed from: c */
    public void m26710c(Context context, ServiceConnection serviceConnection) {
        if (m26706g(serviceConnection) && this.f13023a.containsKey(serviceConnection)) {
            try {
                m26708e(context, this.f13023a.get(serviceConnection));
                return;
            } finally {
                this.f13023a.remove(serviceConnection);
            }
        }
        m26708e(context, serviceConnection);
    }

    /* renamed from: d */
    public final boolean m26709d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return m26707f(context, str, intent, serviceConnection, i, true, executor);
    }
}
