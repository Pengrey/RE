package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.p020os.C1022j;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2489c;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.util.C2632c;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import na.C7692a;
import p078e7.C5001b;
import p078e7.C5009j;
import p081ea.InterfaceC5025c;
import p136ha.InterfaceC5882b;
import p177j9.C6378d;
import p177j9.C6383g;
import p177j9.C6393n;
import p177j9.C6404t;
import p301q.C9545a;
import p484z6.C13701c;

/* renamed from: com.google.firebase.c */
/* loaded from: classes.dex */
public class C4175c {

    /* renamed from: i */
    private static final Object f11399i = new Object();

    /* renamed from: j */
    private static final Executor f11400j = new ExecutorC4179d();
    @GuardedBy("LOCK")

    /* renamed from: k */
    static final Map<String, C4175c> f11401k = new C9545a();

    /* renamed from: a */
    private final Context f11402a;

    /* renamed from: b */
    private final String f11403b;

    /* renamed from: c */
    private final C4253h f11404c;

    /* renamed from: d */
    private final C6393n f11405d;

    /* renamed from: g */
    private final C6404t<C7692a> f11408g;

    /* renamed from: e */
    private final AtomicBoolean f11406e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f11407f = new AtomicBoolean();

    /* renamed from: h */
    private final List<InterfaceC4177b> f11409h = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    /* renamed from: com.google.firebase.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC4177b {
        /* renamed from: a */
        void m28427a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* renamed from: com.google.firebase.c$c */
    /* loaded from: classes.dex */
    public static class C4178c implements ComponentCallbacks2C2489c.InterfaceC2490a {

        /* renamed from: a */
        private static AtomicReference<C4178c> f11410a = new AtomicReference<>();

        private C4178c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m28424c(Context context) {
            if (C5009j.m25902a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f11410a.get() == null) {
                    C4178c c4178c = new C4178c();
                    if (f11410a.compareAndSet(null, c4178c)) {
                        ComponentCallbacks2C2489c.m33450c(application);
                        ComponentCallbacks2C2489c.m33451b().m33452a(c4178c);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2489c.InterfaceC2490a
        /* renamed from: a */
        public void mo28426a(boolean z) {
            synchronized (C4175c.f11399i) {
                Iterator it = new ArrayList(C4175c.f11401k.values()).iterator();
                while (it.hasNext()) {
                    C4175c c4175c = (C4175c) it.next();
                    if (c4175c.f11406e.get()) {
                        c4175c.m28428u(z);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    /* renamed from: com.google.firebase.c$d */
    /* loaded from: classes.dex */
    private static class ExecutorC4179d implements Executor {

        /* renamed from: w */
        private static final Handler f11411w = new Handler(Looper.getMainLooper());

        private ExecutorC4179d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f11411w.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* renamed from: com.google.firebase.c$e */
    /* loaded from: classes.dex */
    public static class C4180e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C4180e> f11412b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f11413a;

        public C4180e(Context context) {
            this.f11413a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m28422b(Context context) {
            if (f11412b.get() == null) {
                C4180e c4180e = new C4180e(context);
                if (f11412b.compareAndSet(null, c4180e)) {
                    context.registerReceiver(c4180e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m28421c() {
            this.f11413a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C4175c.f11399i) {
                for (C4175c c4175c : C4175c.f11401k.values()) {
                    c4175c.m28436m();
                }
            }
            m28421c();
        }
    }

    protected C4175c(final Context context, String str, C4253h c4253h) {
        new CopyOnWriteArrayList();
        this.f11402a = (Context) C2597i.m33076j(context);
        this.f11403b = C2597i.m33080f(str);
        this.f11404c = (C4253h) C2597i.m33076j(c4253h);
        this.f11405d = C6393n.m21080i(f11400j).m21065d(C6383g.m21092c(context, ComponentDiscoveryService.class).m21093b()).m21066c(new FirebaseCommonRegistrar()).m21067b(C6378d.m21106p(context, Context.class, new Class[0])).m21067b(C6378d.m21106p(this, C4175c.class, new Class[0])).m21067b(C6378d.m21106p(c4253h, C4253h.class, new Class[0])).m21064e();
        this.f11408g = new C6404t<>(new InterfaceC5882b() { // from class: com.google.firebase.b
            @Override // p136ha.InterfaceC5882b
            public final Object get() {
                C7692a m28430s;
                m28430s = C4175c.this.m28430s(context);
                return m28430s;
            }
        });
    }

    /* renamed from: f */
    private void m28443f() {
        C2597i.m33072n(!this.f11407f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: i */
    public static C4175c m28440i() {
        C4175c c4175c;
        synchronized (f11399i) {
            c4175c = f11401k.get("[DEFAULT]");
            if (c4175c == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C2632c.m32993a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c4175c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m28436m() {
        if (!C1022j.m38736a(this.f11402a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m28439j());
            C4180e.m28422b(this.f11402a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m28439j());
        this.f11405d.m21077l(m28431r());
    }

    /* renamed from: n */
    public static C4175c m28435n(Context context) {
        synchronized (f11399i) {
            if (f11401k.containsKey("[DEFAULT]")) {
                return m28440i();
            }
            C4253h m28183a = C4253h.m28183a(context);
            if (m28183a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m28434o(context, m28183a);
        }
    }

    /* renamed from: o */
    public static C4175c m28434o(Context context, C4253h c4253h) {
        return m28433p(context, c4253h, "[DEFAULT]");
    }

    /* renamed from: p */
    public static C4175c m28433p(Context context, C4253h c4253h, String str) {
        C4175c c4175c;
        C4178c.m28424c(context);
        String m28429t = m28429t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f11399i) {
            Map<String, C4175c> map = f11401k;
            boolean z = !map.containsKey(m28429t);
            C2597i.m33072n(z, "FirebaseApp name " + m28429t + " already exists!");
            C2597i.m33075k(context, "Application context cannot be null.");
            c4175c = new C4175c(context, m28429t, c4253h);
            map.put(m28429t, c4175c);
        }
        c4175c.m28436m();
        return c4175c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ C7692a m28430s(Context context) {
        return new C7692a(context, m28437l(), (InterfaceC5025c) this.f11405d.mo21096a(InterfaceC5025c.class));
    }

    /* renamed from: t */
    private static String m28429t(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m28428u(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (InterfaceC4177b interfaceC4177b : this.f11409h) {
            interfaceC4177b.m28427a(z);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4175c) {
            return this.f11403b.equals(((C4175c) obj).m28439j());
        }
        return false;
    }

    /* renamed from: g */
    public <T> T m28442g(Class<T> cls) {
        m28443f();
        return (T) this.f11405d.mo21096a(cls);
    }

    /* renamed from: h */
    public Context m28441h() {
        m28443f();
        return this.f11402a;
    }

    public int hashCode() {
        return this.f11403b.hashCode();
    }

    /* renamed from: j */
    public String m28439j() {
        m28443f();
        return this.f11403b;
    }

    /* renamed from: k */
    public C4253h m28438k() {
        m28443f();
        return this.f11404c;
    }

    /* renamed from: l */
    public String m28437l() {
        return C5001b.m25919a(m28439j().getBytes(Charset.defaultCharset())) + "+" + C5001b.m25919a(m28438k().m28181c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: q */
    public boolean m28432q() {
        m28443f();
        return this.f11408g.get().m17708b();
    }

    /* renamed from: r */
    public boolean m28431r() {
        return "[DEFAULT]".equals(m28439j());
    }

    public String toString() {
        return C13701c.m573c(this).m572a("name", this.f11403b).m572a("options", this.f11404c).toString();
    }
}
