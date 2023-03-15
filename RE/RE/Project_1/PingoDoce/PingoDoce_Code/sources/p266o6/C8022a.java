package p266o6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.C2567c;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.ServiceConnectionC2460a;
import com.google.android.gms.common.internal.C2597i;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p058d7.C4747a;
import p175j7.AbstractBinderC6367e;
import p175j7.InterfaceC6368f;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@ParametersAreNonnullByDefault
/* renamed from: o6.a */
/* loaded from: classes.dex */
public class C8022a {
    @GuardedBy("this")

    /* renamed from: a */
    ServiceConnectionC2460a f20756a;
    @GuardedBy("this")

    /* renamed from: b */
    InterfaceC6368f f20757b;
    @GuardedBy("this")

    /* renamed from: c */
    boolean f20758c;

    /* renamed from: d */
    final Object f20759d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    C8025c f20760e;
    @GuardedBy("this")

    /* renamed from: f */
    private final Context f20761f;

    /* renamed from: g */
    final long f20762g;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    /* renamed from: o6.a$a */
    /* loaded from: classes.dex */
    public static final class C8023a {

        /* renamed from: a */
        private final String f20763a;

        /* renamed from: b */
        private final boolean f20764b;

        @Deprecated
        public C8023a(String str, boolean z) {
            this.f20763a = str;
            this.f20764b = z;
        }

        /* renamed from: a */
        public String m17131a() {
            return this.f20763a;
        }

        /* renamed from: b */
        public boolean m17130b() {
            return this.f20764b;
        }

        public String toString() {
            String str = this.f20763a;
            boolean z = this.f20764b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z);
            return sb2.toString();
        }
    }

    public C8022a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C2597i.m33076j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f20761f = context;
        this.f20758c = false;
        this.f20762g = j;
    }

    /* renamed from: a */
    public static C8023a m17138a(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C8022a c8022a = new C8022a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c8022a.m17135d(false);
            C8023a m17133f = c8022a.m17133f(-1);
            c8022a.m17134e(m17133f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, BuildConfig.VERSION_NAME, null);
            return m17133f;
        } finally {
        }
    }

    /* renamed from: b */
    public static void m17137b(boolean z) {
    }

    /* renamed from: f */
    private final C8023a m17133f(int i) throws IOException {
        C8023a c8023a;
        C2597i.m33077i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f20758c) {
                synchronized (this.f20759d) {
                    C8025c c8025c = this.f20760e;
                    if (c8025c == null || !c8025c.f20769z) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m17135d(false);
                    if (!this.f20758c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            C2597i.m33076j(this.f20756a);
            C2597i.m33076j(this.f20757b);
            try {
                c8023a = new C8023a(this.f20757b.mo21127a(), this.f20757b.mo21126u0(true));
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            }
        }
        m17132g();
        return c8023a;
    }

    /* renamed from: g */
    private final void m17132g() {
        synchronized (this.f20759d) {
            C8025c c8025c = this.f20760e;
            if (c8025c != null) {
                c8025c.f20768y.countDown();
                try {
                    this.f20760e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f20762g;
            if (j > 0) {
                this.f20760e = new C8025c(this, j);
            }
        }
    }

    /* renamed from: c */
    public final void m17136c() {
        C2597i.m33077i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f20761f == null || this.f20756a == null) {
                return;
            }
            if (this.f20758c) {
                C4747a.m26711b().m26710c(this.f20761f, this.f20756a);
            }
            this.f20758c = false;
            this.f20757b = null;
            this.f20756a = null;
        }
    }

    /* renamed from: d */
    protected final void m17135d(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C2597i.m33077i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f20758c) {
                m17136c();
            }
            Context context = this.f20761f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int mo33222h = C2567c.m33224f().mo33222h(context, C2569e.f7391a);
                if (mo33222h != 0 && mo33222h != 2) {
                    throw new IOException("Google Play services not available");
                }
                ServiceConnectionC2460a serviceConnectionC2460a = new ServiceConnectionC2460a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C4747a.m26711b().m26712a(context, intent, serviceConnectionC2460a, 1)) {
                    this.f20756a = serviceConnectionC2460a;
                    try {
                        this.f20757b = AbstractBinderC6367e.m21128s(serviceConnectionC2460a.m33516a(10000L, TimeUnit.MILLISECONDS));
                        this.f20758c = true;
                        if (z) {
                            m17132g();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    /* renamed from: e */
    final boolean m17134e(C8023a c8023a, boolean z, float f, long j, String str, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c8023a != null) {
                hashMap.put("limit_ad_tracking", true != c8023a.m17130b() ? "0" : "1");
                String m17131a = c8023a.m17131a();
                if (m17131a != null) {
                    hashMap.put("ad_id_size", Integer.toString(m17131a.length()));
                }
            }
            if (th2 != null) {
                hashMap.put("error", th2.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new C8024b(this, hashMap).start();
            return true;
        }
        return false;
    }

    protected final void finalize() throws Throwable {
        m17136c();
        super.finalize();
    }
}
