package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2567c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p484z6.C13698a0;
import p484z6.C13707e;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes.dex */
public abstract class AbstractC2576b<T extends IInterface> {

    /* renamed from: x */
    private static final Feature[] f7443x = new Feature[0];

    /* renamed from: a */
    private volatile String f7444a;

    /* renamed from: b */
    C2594g0 f7445b;

    /* renamed from: c */
    private final Context f7446c;

    /* renamed from: d */
    private final AbstractC2588e f7447d;

    /* renamed from: e */
    private final C2567c f7448e;

    /* renamed from: f */
    final Handler f7449f;

    /* renamed from: g */
    private final Object f7450g;

    /* renamed from: h */
    private final Object f7451h;
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: i */
    private InterfaceC2595h f7452i;

    /* renamed from: j */
    protected InterfaceC2579c f7453j;
    @GuardedBy("mLock")

    /* renamed from: k */
    private T f7454k;

    /* renamed from: l */
    private final ArrayList<AbstractC2614w<?>> f7455l;
    @GuardedBy("mLock")

    /* renamed from: m */
    private ServiceConnectionC2616y f7456m;
    @GuardedBy("mLock")

    /* renamed from: n */
    private int f7457n;

    /* renamed from: o */
    private final InterfaceC2577a f7458o;

    /* renamed from: p */
    private final InterfaceC2578b f7459p;

    /* renamed from: q */
    private final int f7460q;

    /* renamed from: r */
    private final String f7461r;

    /* renamed from: s */
    private volatile String f7462s;

    /* renamed from: t */
    private ConnectionResult f7463t;

    /* renamed from: u */
    private boolean f7464u;

    /* renamed from: v */
    private volatile zzj f7465v;

    /* renamed from: w */
    protected AtomicInteger f7466w;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2577a {
        /* renamed from: H */
        void mo30934H(Bundle bundle);

        /* renamed from: s */
        void mo30929s(int i);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2578b {
        /* renamed from: y */
        void mo30928y(ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.b$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2579c {
        /* renamed from: a */
        void mo33137a(ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.b$d */
    /* loaded from: classes.dex */
    protected class C2580d implements InterfaceC2579c {
        public C2580d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC2576b.InterfaceC2579c
        /* renamed from: a */
        public final void mo33137a(ConnectionResult connectionResult) {
            if (connectionResult.m33524D()) {
                AbstractC2576b abstractC2576b = AbstractC2576b.this;
                abstractC2576b.m33157d(null, abstractC2576b.mo33118C());
            } else if (AbstractC2576b.this.f7459p != null) {
                AbstractC2576b.this.f7459p.mo30928y(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.b$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2581e {
        /* renamed from: a */
        void mo33136a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC2576b(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.AbstractC2576b.InterfaceC2577a r13, com.google.android.gms.common.internal.AbstractC2576b.InterfaceC2578b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.e r3 = com.google.android.gms.common.internal.AbstractC2588e.m33100b(r10)
            com.google.android.gms.common.c r4 = com.google.android.gms.common.C2567c.m33224f()
            com.google.android.gms.common.internal.C2597i.m33076j(r13)
            com.google.android.gms.common.internal.C2597i.m33076j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC2576b.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.b$a, com.google.android.gms.common.internal.b$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public static /* bridge */ /* synthetic */ void m33158c0(AbstractC2576b abstractC2576b, zzj zzjVar) {
        abstractC2576b.f7465v = zzjVar;
        if (abstractC2576b.mo19094S()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f7541z;
            C13707e.m565b().m564c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.m33198E());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public static /* bridge */ /* synthetic */ void m33156d0(AbstractC2576b abstractC2576b, int i) {
        int i2;
        int i3;
        synchronized (abstractC2576b.f7450g) {
            i2 = abstractC2576b.f7457n;
        }
        if (i2 == 3) {
            abstractC2576b.f7464u = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC2576b.f7449f;
        handler.sendMessage(handler.obtainMessage(i3, abstractC2576b.f7466w.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static /* bridge */ /* synthetic */ boolean m33151g0(AbstractC2576b abstractC2576b, int i, int i2, IInterface iInterface) {
        synchronized (abstractC2576b.f7450g) {
            if (abstractC2576b.f7457n != i) {
                return false;
            }
            abstractC2576b.m33148i0(i2, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.or(BitSet.java:941)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: h0 */
    static /* bridge */ /* synthetic */ boolean m33150h0(com.google.android.gms.common.internal.AbstractC2576b r2) {
        /*
            boolean r0 = r2.f7464u
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.mo19096E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.m33183B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.mo19096E()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC2576b.m33150h0(com.google.android.gms.common.internal.b):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m33148i0(int i, T t) {
        C2594g0 c2594g0;
        C2594g0 c2594g02;
        C2597i.m33085a((i == 4) == (t != null));
        synchronized (this.f7450g) {
            this.f7457n = i;
            this.f7454k = t;
            if (i == 1) {
                ServiceConnectionC2616y serviceConnectionC2616y = this.f7456m;
                if (serviceConnectionC2616y != null) {
                    AbstractC2588e abstractC2588e = this.f7447d;
                    String m33087c = this.f7445b.m33087c();
                    C2597i.m33076j(m33087c);
                    abstractC2588e.m33098e(m33087c, this.f7445b.m33088b(), this.f7445b.m33089a(), serviceConnectionC2616y, m33165X(), this.f7445b.m33086d());
                    this.f7456m = null;
                }
            } else if (i == 2 || i == 3) {
                ServiceConnectionC2616y serviceConnectionC2616y2 = this.f7456m;
                if (serviceConnectionC2616y2 != null && (c2594g02 = this.f7445b) != null) {
                    String m33087c2 = c2594g02.m33087c();
                    String m33088b = c2594g02.m33088b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(m33087c2).length() + 70 + String.valueOf(m33088b).length());
                    sb2.append("Calling connect() while still connected, missing disconnect() for ");
                    sb2.append(m33087c2);
                    sb2.append(" on ");
                    sb2.append(m33088b);
                    Log.e("GmsClient", sb2.toString());
                    AbstractC2588e abstractC2588e2 = this.f7447d;
                    String m33087c3 = this.f7445b.m33087c();
                    C2597i.m33076j(m33087c3);
                    abstractC2588e2.m33098e(m33087c3, this.f7445b.m33088b(), this.f7445b.m33089a(), serviceConnectionC2616y2, m33165X(), this.f7445b.m33086d());
                    this.f7466w.incrementAndGet();
                }
                ServiceConnectionC2616y serviceConnectionC2616y3 = new ServiceConnectionC2616y(this, this.f7466w.get());
                this.f7456m = serviceConnectionC2616y3;
                if (this.f7457n == 3 && m33183B() != null) {
                    c2594g0 = new C2594g0(m33139y().getPackageName(), m33183B(), true, AbstractC2588e.m33101a(), false);
                } else {
                    c2594g0 = new C2594g0(m33181G(), mo19095F(), false, AbstractC2588e.m33101a(), mo33179I());
                }
                this.f7445b = c2594g0;
                if (c2594g0.m33086d() && mo19093h() < 17895000) {
                    String valueOf = String.valueOf(this.f7445b.m33087c());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                AbstractC2588e abstractC2588e3 = this.f7447d;
                String m33087c4 = this.f7445b.m33087c();
                C2597i.m33076j(m33087c4);
                if (!abstractC2588e3.mo33095f(new C13698a0(m33087c4, this.f7445b.m33088b(), this.f7445b.m33089a(), this.f7445b.m33086d()), serviceConnectionC2616y3, m33165X(), mo33112w())) {
                    String m33087c5 = this.f7445b.m33087c();
                    String m33088b2 = this.f7445b.m33088b();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(m33087c5).length() + 34 + String.valueOf(m33088b2).length());
                    sb3.append("unable to connect to service: ");
                    sb3.append(m33087c5);
                    sb3.append(" on ");
                    sb3.append(m33088b2);
                    Log.w("GmsClient", sb3.toString());
                    m33154e0(16, null, this.f7466w.get());
                }
            } else if (i == 4) {
                C2597i.m33076j(t);
                m33177K(t);
            }
        }
    }

    /* renamed from: A */
    protected Bundle mo19634A() {
        return new Bundle();
    }

    /* renamed from: B */
    protected String m33183B() {
        return null;
    }

    /* renamed from: C */
    protected Set<Scope> mo33118C() {
        return Collections.emptySet();
    }

    /* renamed from: D */
    public final T m33182D() throws DeadObjectException {
        T t;
        synchronized (this.f7450g) {
            if (this.f7457n != 5) {
                m33142r();
                t = this.f7454k;
                C2597i.m33075k(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public abstract String mo19096E();

    /* renamed from: F */
    protected abstract String mo19095F();

    /* renamed from: G */
    protected String m33181G() {
        return "com.google.android.gms";
    }

    /* renamed from: H */
    public ConnectionTelemetryConfiguration m33180H() {
        zzj zzjVar = this.f7465v;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f7541z;
    }

    /* renamed from: I */
    protected boolean mo33179I() {
        return mo19093h() >= 211700000;
    }

    /* renamed from: J */
    public boolean m33178J() {
        return this.f7465v != null;
    }

    /* renamed from: K */
    protected void m33177K(T t) {
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m33176L(ConnectionResult connectionResult) {
        connectionResult.m33522h();
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public void m33175M(int i) {
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public void m33174N(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f7449f;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2617z(this, i, iBinder, bundle)));
    }

    /* renamed from: O */
    public boolean m33173O() {
        return false;
    }

    /* renamed from: P */
    public void m33172P(String str) {
        this.f7462s = str;
    }

    /* renamed from: Q */
    public void m33171Q(int i) {
        Handler handler = this.f7449f;
        handler.sendMessage(handler.obtainMessage(6, this.f7466w.get(), i));
    }

    /* renamed from: R */
    protected void m33170R(InterfaceC2579c interfaceC2579c, int i, PendingIntent pendingIntent) {
        C2597i.m33075k(interfaceC2579c, "Connection progress callbacks cannot be null.");
        this.f7453j = interfaceC2579c;
        Handler handler = this.f7449f;
        handler.sendMessage(handler.obtainMessage(3, this.f7466w.get(), i, pendingIntent));
    }

    /* renamed from: S */
    public boolean mo19094S() {
        return false;
    }

    /* renamed from: X */
    protected final String m33165X() {
        String str = this.f7461r;
        return str == null ? this.f7446c.getClass().getName() : str;
    }

    /* renamed from: a */
    public void m33162a(InterfaceC2581e interfaceC2581e) {
        interfaceC2581e.mo33136a();
    }

    /* renamed from: b */
    public boolean m33160b() {
        boolean z;
        synchronized (this.f7450g) {
            z = this.f7457n == 4;
        }
        return z;
    }

    /* renamed from: d */
    public void m33157d(InterfaceC2590f interfaceC2590f, Set<Scope> set) {
        Bundle mo19634A = mo19634A();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f7460q, this.f7462s);
        getServiceRequest.f7425z = this.f7446c.getPackageName();
        getServiceRequest.f7414C = mo19634A;
        if (set != null) {
            getServiceRequest.f7413B = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo20508o()) {
            Account mo33113u = mo33113u();
            if (mo33113u == null) {
                mo33113u = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f7415D = mo33113u;
            if (interfaceC2590f != null) {
                getServiceRequest.f7412A = interfaceC2590f.asBinder();
            }
        } else if (m33173O()) {
            getServiceRequest.f7415D = mo33113u();
        }
        getServiceRequest.f7416E = f7443x;
        getServiceRequest.f7417F = mo19091v();
        if (mo19094S()) {
            getServiceRequest.f7420I = true;
        }
        try {
            synchronized (this.f7451h) {
                InterfaceC2595h interfaceC2595h = this.f7452i;
                if (interfaceC2595h != null) {
                    interfaceC2595h.mo33061y0(new BinderC2615x(this, this.f7466w.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m33171Q(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m33174N(8, null, null, this.f7466w.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m33174N(8, null, null, this.f7466w.get());
        }
    }

    /* renamed from: e */
    public void m33155e(String str) {
        this.f7444a = str;
        mo32942n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e0 */
    public final void m33154e0(int i, Bundle bundle, int i2) {
        Handler handler = this.f7449f;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C2575a0(this, i, null)));
    }

    /* renamed from: f */
    public boolean m33153f() {
        return true;
    }

    /* renamed from: h */
    public int mo19093h() {
        return C2567c.f7388a;
    }

    /* renamed from: i */
    public boolean m33149i() {
        boolean z;
        synchronized (this.f7450g) {
            int i = this.f7457n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final Feature[] m33147j() {
        zzj zzjVar = this.f7465v;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f7539x;
    }

    /* renamed from: k */
    public String m33146k() {
        C2594g0 c2594g0;
        if (m33160b() && (c2594g0 = this.f7445b) != null) {
            return c2594g0.m33088b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: l */
    public String m33145l() {
        return this.f7444a;
    }

    /* renamed from: m */
    public void m33144m(InterfaceC2579c interfaceC2579c) {
        C2597i.m33075k(interfaceC2579c, "Connection progress callbacks cannot be null.");
        this.f7453j = interfaceC2579c;
        m33148i0(2, null);
    }

    /* renamed from: n */
    public void mo32942n() {
        this.f7466w.incrementAndGet();
        synchronized (this.f7455l) {
            int size = this.f7455l.size();
            for (int i = 0; i < size; i++) {
                this.f7455l.get(i).m33021d();
            }
            this.f7455l.clear();
        }
        synchronized (this.f7451h) {
            this.f7452i = null;
        }
        m33148i0(1, null);
    }

    /* renamed from: o */
    public boolean mo20508o() {
        return false;
    }

    /* renamed from: q */
    public void m33143q() {
        int mo33222h = this.f7448e.mo33222h(this.f7446c, mo19093h());
        if (mo33222h != 0) {
            m33148i0(1, null);
            m33170R(new C2580d(), mo33222h, null);
            return;
        }
        m33144m(new C2580d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m33142r() {
        if (!m33160b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public abstract T mo19092s(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public boolean m33141t() {
        return false;
    }

    /* renamed from: u */
    public Account mo33113u() {
        return null;
    }

    /* renamed from: v */
    public Feature[] mo19091v() {
        return f7443x;
    }

    /* renamed from: w */
    protected Executor mo33112w() {
        return null;
    }

    /* renamed from: x */
    public Bundle m33140x() {
        return null;
    }

    /* renamed from: y */
    public final Context m33139y() {
        return this.f7446c;
    }

    /* renamed from: z */
    public int m33138z() {
        return this.f7460q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2576b(Context context, Looper looper, AbstractC2588e abstractC2588e, C2567c c2567c, int i, InterfaceC2577a interfaceC2577a, InterfaceC2578b interfaceC2578b, String str) {
        this.f7444a = null;
        this.f7450g = new Object();
        this.f7451h = new Object();
        this.f7455l = new ArrayList<>();
        this.f7457n = 1;
        this.f7463t = null;
        this.f7464u = false;
        this.f7465v = null;
        this.f7466w = new AtomicInteger(0);
        C2597i.m33075k(context, "Context must not be null");
        this.f7446c = context;
        C2597i.m33075k(looper, "Looper must not be null");
        C2597i.m33075k(abstractC2588e, "Supervisor must not be null");
        this.f7447d = abstractC2588e;
        C2597i.m33075k(c2567c, "API availability must not be null");
        this.f7448e = c2567c;
        this.f7449f = new HandlerC2613v(this, looper);
        this.f7460q = i;
        this.f7458o = interfaceC2577a;
        this.f7459p = interfaceC2578b;
        this.f7461r = str;
    }
}
