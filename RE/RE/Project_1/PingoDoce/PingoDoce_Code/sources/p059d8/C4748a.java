package p059d8;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.util.C2633d;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import p078e7.C5006g;
import p078e7.C5011l;
import p078e7.InterfaceC5003d;
import p365t7.C10389b;
import p365t7.C10395h;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@ThreadSafe
/* renamed from: d8.a */
/* loaded from: classes.dex */
public class C4748a {

    /* renamed from: p */
    private static final long f13024p = TimeUnit.DAYS.toMillis(366);

    /* renamed from: q */
    private static volatile ScheduledExecutorService f13025q = null;

    /* renamed from: r */
    private static final Object f13026r = new Object();

    /* renamed from: s */
    private static volatile InterfaceC4752e f13027s = new C4750c();

    /* renamed from: a */
    private final Object f13028a;

    /* renamed from: b */
    private final PowerManager.WakeLock f13029b;

    /* renamed from: c */
    private int f13030c;

    /* renamed from: d */
    private Future<?> f13031d;

    /* renamed from: e */
    private long f13032e;

    /* renamed from: f */
    private final Set<C4753f> f13033f;

    /* renamed from: g */
    private boolean f13034g;

    /* renamed from: h */
    private int f13035h;

    /* renamed from: i */
    C10389b f13036i;

    /* renamed from: j */
    private InterfaceC5003d f13037j;

    /* renamed from: k */
    private WorkSource f13038k;

    /* renamed from: l */
    private final String f13039l;

    /* renamed from: m */
    private final Map<String, C4751d> f13040m;

    /* renamed from: n */
    private AtomicInteger f13041n;

    /* renamed from: o */
    private final ScheduledExecutorService f13042o;

    public C4748a(Context context, int i, String str) {
        String packageName = context.getPackageName();
        this.f13028a = new Object();
        this.f13030c = 0;
        this.f13033f = new HashSet();
        this.f13034g = true;
        this.f13037j = C5006g.m25911d();
        this.f13040m = new HashMap();
        this.f13041n = new AtomicInteger(0);
        C2597i.m33075k(context, "WakeLock: context must not be null");
        C2597i.m33079g(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f13036i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f13039l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f13039l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f13029b = newWakeLock;
            if (C5011l.m25887c(context)) {
                WorkSource m25888b = C5011l.m25888b(context, C2633d.m32992a(packageName) ? context.getPackageName() : packageName);
                this.f13038k = m25888b;
                if (m25888b != null) {
                    m26696i(newWakeLock, m25888b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f13025q;
            if (scheduledExecutorService == null) {
                synchronized (f13026r) {
                    scheduledExecutorService = f13025q;
                    if (scheduledExecutorService == null) {
                        C10395h.m8077a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f13025q = scheduledExecutorService;
                    }
                }
            }
            this.f13042o = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m26700e(C4748a c4748a) {
        synchronized (c4748a.f13028a) {
            if (c4748a.m26703b()) {
                Log.e("WakeLock", String.valueOf(c4748a.f13039l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                c4748a.m26698g();
                if (c4748a.m26703b()) {
                    c4748a.f13030c = 1;
                    c4748a.m26697h(0);
                }
            }
        }
    }

    /* renamed from: f */
    private final String m26699f(String str) {
        if (this.f13034g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    private final void m26698g() {
        if (this.f13033f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f13033f);
        this.f13033f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        C4753f c4753f = (C4753f) arrayList.get(0);
        throw null;
    }

    /* renamed from: h */
    private final void m26697h(int i) {
        synchronized (this.f13028a) {
            if (m26703b()) {
                if (this.f13034g) {
                    int i2 = this.f13030c - 1;
                    this.f13030c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f13030c = 0;
                }
                m26698g();
                for (C4751d c4751d : this.f13040m.values()) {
                    c4751d.f13044a = 0;
                }
                this.f13040m.clear();
                Future<?> future = this.f13031d;
                if (future != null) {
                    future.cancel(false);
                    this.f13031d = null;
                    this.f13032e = 0L;
                }
                this.f13035h = 0;
                if (this.f13029b.isHeld()) {
                    try {
                        this.f13029b.release();
                        if (this.f13036i != null) {
                            this.f13036i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f13039l).concat(" failed to release!"), e);
                            if (this.f13036i != null) {
                                this.f13036i = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f13039l).concat(" should be held!"));
                }
            }
        }
    }

    /* renamed from: i */
    private static void m26696i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    /* renamed from: a */
    public void m26704a(long j) {
        this.f13041n.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f13024p), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f13028a) {
            if (!m26703b()) {
                this.f13036i = C10389b.m8078a(false, null);
                this.f13029b.acquire();
                this.f13037j.mo25912c();
            }
            this.f13030c++;
            this.f13035h++;
            m26699f(null);
            C4751d c4751d = this.f13040m.get(null);
            if (c4751d == null) {
                c4751d = new C4751d(null);
                this.f13040m.put(null, c4751d);
            }
            c4751d.f13044a++;
            long mo25912c = this.f13037j.mo25912c();
            long j2 = Long.MAX_VALUE - mo25912c > max ? mo25912c + max : Long.MAX_VALUE;
            if (j2 > this.f13032e) {
                this.f13032e = j2;
                Future<?> future = this.f13031d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f13031d = this.f13042o.schedule(new Runnable() { // from class: d8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4748a.m26700e(C4748a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean m26703b() {
        boolean z;
        synchronized (this.f13028a) {
            z = this.f13030c > 0;
        }
        return z;
    }

    /* renamed from: c */
    public void m26702c() {
        if (this.f13041n.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f13039l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f13028a) {
            m26699f(null);
            if (this.f13040m.containsKey(null)) {
                C4751d c4751d = this.f13040m.get(null);
                if (c4751d != null) {
                    int i = c4751d.f13044a - 1;
                    c4751d.f13044a = i;
                    if (i == 0) {
                        this.f13040m.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f13039l).concat(" counter does not exist"));
            }
            m26697h(0);
        }
    }

    /* renamed from: d */
    public void m26701d(boolean z) {
        synchronized (this.f13028a) {
            this.f13034g = z;
        }
    }
}
