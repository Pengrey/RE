package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C2566b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2472b;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.internal.AbstractC2588e;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p078e7.C5007h;
import p251n7.HandlerC7687f;
import p301q.C9552b;
import p462y6.InterfaceC13123e;
import p484z6.C13707e;
import p484z6.C13709g;
import p484z6.C13721r;
import p484z6.InterfaceC13710h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes.dex */
public class C2499f implements Handler.Callback {

    /* renamed from: r */
    public static final Status f7225r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: s */
    private static final Status f7226s = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: t */
    private static final Object f7227t = new Object();
    @GuardedBy("lock")

    /* renamed from: u */
    private static C2499f f7228u;

    /* renamed from: e */
    private TelemetryData f7233e;

    /* renamed from: f */
    private InterfaceC13710h f7234f;

    /* renamed from: g */
    private final Context f7235g;

    /* renamed from: h */
    private final C2566b f7236h;

    /* renamed from: i */
    private final C13721r f7237i;
    @NotOnlyInitialized

    /* renamed from: p */
    private final Handler f7244p;

    /* renamed from: q */
    private volatile boolean f7245q;

    /* renamed from: a */
    private long f7229a = 5000;

    /* renamed from: b */
    private long f7230b = 120000;

    /* renamed from: c */
    private long f7231c = 10000;

    /* renamed from: d */
    private boolean f7232d = false;

    /* renamed from: j */
    private final AtomicInteger f7238j = new AtomicInteger(1);

    /* renamed from: k */
    private final AtomicInteger f7239k = new AtomicInteger(0);

    /* renamed from: l */
    private final Map<C2485b<?>, C2506h0<?>> f7240l = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")

    /* renamed from: m */
    private C2560y f7241m = null;
    @GuardedBy("lock")

    /* renamed from: n */
    private final Set<C2485b<?>> f7242n = new C9552b();

    /* renamed from: o */
    private final Set<C2485b<?>> f7243o = new C9552b();

    private C2499f(Context context, Looper looper, C2566b c2566b) {
        this.f7245q = true;
        this.f7235g = context;
        HandlerC7687f handlerC7687f = new HandlerC7687f(looper, this);
        this.f7244p = handlerC7687f;
        this.f7236h = c2566b;
        this.f7237i = new C13721r(c2566b);
        if (C5007h.m25910a(context)) {
            this.f7245q = false;
        }
        handlerC7687f.sendMessage(handlerC7687f.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m33431a() {
        synchronized (f7227t) {
            C2499f c2499f = f7228u;
            if (c2499f != null) {
                c2499f.f7239k.incrementAndGet();
                Handler handler = c2499f.f7244p;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static Status m33423i(C2485b<?> c2485b, ConnectionResult connectionResult) {
        String m33460b = c2485b.m33460b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m33460b).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(m33460b);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(connectionResult, sb2.toString());
    }

    /* renamed from: j */
    private final C2506h0<?> m33422j(AbstractC2472b<?> abstractC2472b) {
        C2485b<?> m33491k = abstractC2472b.m33491k();
        C2506h0<?> c2506h0 = this.f7240l.get(m33491k);
        if (c2506h0 == null) {
            c2506h0 = new C2506h0<>(this, abstractC2472b);
            this.f7240l.put(m33491k, c2506h0);
        }
        if (c2506h0.m33382P()) {
            this.f7243o.add(m33491k);
        }
        c2506h0.m33394D();
        return c2506h0;
    }

    /* renamed from: k */
    private final InterfaceC13710h m33421k() {
        if (this.f7234f == null) {
            this.f7234f = C13709g.m562a(this.f7235g);
        }
        return this.f7234f;
    }

    /* renamed from: l */
    private final void m33420l() {
        TelemetryData telemetryData = this.f7233e;
        if (telemetryData != null) {
            if (telemetryData.m33187h() > 0 || m33425g()) {
                m33421k().mo560a(telemetryData);
            }
            this.f7233e = null;
        }
    }

    /* renamed from: m */
    private final <T> void m33419m(C3421e<T> c3421e, int i, AbstractC2472b abstractC2472b) {
        C2539r0 m33297b;
        if (i == 0 || (m33297b = C2539r0.m33297b(this, i, abstractC2472b.m33491k())) == null) {
            return;
        }
        AbstractC3419d<T> m30802a = c3421e.m30802a();
        final Handler handler = this.f7244p;
        handler.getClass();
        m30802a.mo30793c(new Executor() { // from class: com.google.android.gms.common.api.internal.b0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, m33297b);
    }

    /* renamed from: y */
    public static C2499f m33407y(Context context) {
        C2499f c2499f;
        synchronized (f7227t) {
            if (f7228u == null) {
                f7228u = new C2499f(context.getApplicationContext(), AbstractC2588e.m33099c().getLooper(), C2566b.m33240m());
            }
            c2499f = f7228u;
        }
        return c2499f;
    }

    /* renamed from: A */
    public final <O extends C2461a.InterfaceC2465d> AbstractC3419d<Void> m33441A(AbstractC2472b<O> abstractC2472b, AbstractC2522m<C2461a.InterfaceC2463b, ?> abstractC2522m, AbstractC2548u<C2461a.InterfaceC2463b, ?> abstractC2548u, Runnable runnable) {
        C3421e c3421e = new C3421e();
        m33419m(c3421e, abstractC2522m.m33322e(), abstractC2472b);
        C2524m1 c2524m1 = new C2524m1(new C2555w0(abstractC2522m, abstractC2548u, runnable), c3421e);
        Handler handler = this.f7244p;
        handler.sendMessage(handler.obtainMessage(8, new C2552v0(c2524m1, this.f7239k.get(), abstractC2472b)));
        return c3421e.m30802a();
    }

    /* renamed from: B */
    public final <O extends C2461a.InterfaceC2465d> AbstractC3419d<Boolean> m33440B(AbstractC2472b<O> abstractC2472b, C2508i.C2509a c2509a, int i) {
        C3421e c3421e = new C3421e();
        m33419m(c3421e, i, abstractC2472b);
        C2531o1 c2531o1 = new C2531o1(c2509a, c3421e);
        Handler handler = this.f7244p;
        handler.sendMessage(handler.obtainMessage(13, new C2552v0(c2531o1, this.f7239k.get(), abstractC2472b)));
        return c3421e.m30802a();
    }

    /* renamed from: G */
    public final <O extends C2461a.InterfaceC2465d> void m33435G(AbstractC2472b<O> abstractC2472b, int i, AbstractC2493d<? extends InterfaceC13123e, C2461a.InterfaceC2463b> abstractC2493d) {
        C2521l1 c2521l1 = new C2521l1(i, abstractC2493d);
        Handler handler = this.f7244p;
        handler.sendMessage(handler.obtainMessage(4, new C2552v0(c2521l1, this.f7239k.get(), abstractC2472b)));
    }

    /* renamed from: H */
    public final <O extends C2461a.InterfaceC2465d, ResultT> void m33434H(AbstractC2472b<O> abstractC2472b, int i, AbstractC2541s<C2461a.InterfaceC2463b, ResultT> abstractC2541s, C3421e<ResultT> c3421e, InterfaceC2535q interfaceC2535q) {
        m33419m(c3421e, abstractC2541s.m33290d(), abstractC2472b);
        C2528n1 c2528n1 = new C2528n1(i, abstractC2541s, c3421e, interfaceC2535q);
        Handler handler = this.f7244p;
        handler.sendMessage(handler.obtainMessage(4, new C2552v0(c2528n1, this.f7239k.get(), abstractC2472b)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final void m33433I(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f7244p;
        handler.sendMessage(handler.obtainMessage(18, new C2543s0(methodInvocation, i, j, i2)));
    }

    /* renamed from: J */
    public final void m33432J(ConnectionResult connectionResult, int i) {
        if (m33424h(connectionResult, i)) {
            return;
        }
        Handler handler = this.f7244p;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    /* renamed from: b */
    public final void m33430b() {
        Handler handler = this.f7244p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void m33429c(AbstractC2472b<?> abstractC2472b) {
        Handler handler = this.f7244p;
        handler.sendMessage(handler.obtainMessage(7, abstractC2472b));
    }

    /* renamed from: d */
    public final void m33428d(C2560y c2560y) {
        synchronized (f7227t) {
            if (this.f7241m != c2560y) {
                this.f7241m = c2560y;
                this.f7242n.clear();
            }
            this.f7242n.addAll(c2560y.m33255t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m33427e(C2560y c2560y) {
        synchronized (f7227t) {
            if (this.f7241m == c2560y) {
                this.f7241m = null;
                this.f7242n.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m33425g() {
        if (this.f7232d) {
            return false;
        }
        RootTelemetryConfiguration m566a = C13707e.m565b().m566a();
        if (m566a == null || m566a.m33189v()) {
            int m553a = this.f7237i.m553a(this.f7235g, 203400000);
            return m553a == -1 || m553a == 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean m33424h(ConnectionResult connectionResult, int i) {
        return this.f7236h.m33230w(this.f7235g, connectionResult, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C2506h0<?> c2506h0;
        C2485b c2485b;
        C2485b c2485b2;
        C2485b c2485b3;
        C2485b c2485b4;
        int i = message.what;
        switch (i) {
            case 1:
                this.f7231c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f7244p.removeMessages(12);
                for (C2485b<?> c2485b5 : this.f7240l.keySet()) {
                    Handler handler = this.f7244p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c2485b5), this.f7231c);
                }
                break;
            case 2:
                C2537q1 c2537q1 = (C2537q1) message.obj;
                Iterator<C2485b<?>> it = c2537q1.m33299a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C2485b<?> next = it.next();
                        C2506h0<?> c2506h02 = this.f7240l.get(next);
                        if (c2506h02 == null) {
                            c2537q1.m33298b(next, new ConnectionResult(13), null);
                            break;
                        } else if (c2506h02.m33383O()) {
                            c2537q1.m33298b(next, ConnectionResult.f7139A, c2506h02.m33362t().mo33341k());
                        } else {
                            ConnectionResult m33365q = c2506h02.m33365q();
                            if (m33365q != null) {
                                c2537q1.m33298b(next, m33365q, null);
                            } else {
                                c2506h02.m33388J(c2537q1);
                                c2506h02.m33394D();
                            }
                        }
                    }
                }
            case 3:
                for (C2506h0<?> c2506h03 : this.f7240l.values()) {
                    c2506h03.m33395C();
                    c2506h03.m33394D();
                }
                break;
            case 4:
            case 8:
            case 13:
                C2552v0 c2552v0 = (C2552v0) message.obj;
                C2506h0<?> c2506h04 = this.f7240l.get(c2552v0.f7362c.m33491k());
                if (c2506h04 == null) {
                    c2506h04 = m33422j(c2552v0.f7362c);
                }
                if (c2506h04.m33382P() && this.f7239k.get() != c2552v0.f7361b) {
                    c2552v0.f7360a.mo33305a(f7225r);
                    c2506h04.m33386L();
                    break;
                } else {
                    c2506h04.m33393E(c2552v0.f7360a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C2506h0<?>> it2 = this.f7240l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C2506h0<?> next2 = it2.next();
                        c2506h0 = next2.m33367o() == i2 ? next2 : null;
                    }
                }
                if (c2506h0 != null) {
                    if (connectionResult.m33522h() == 13) {
                        String mo33225e = this.f7236h.mo33225e(connectionResult.m33522h());
                        String m33521t = connectionResult.m33521t();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(mo33225e).length() + 69 + String.valueOf(m33521t).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(mo33225e);
                        sb2.append(": ");
                        sb2.append(m33521t);
                        C2506h0.m33359w(c2506h0, new Status(17, sb2.toString()));
                        break;
                    } else {
                        C2506h0.m33359w(c2506h0, m33423i(C2506h0.m33361u(c2506h0), connectionResult));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i2);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f7235g.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2489c.m33450c((Application) this.f7235g.getApplicationContext());
                    ComponentCallbacks2C2489c.m33451b().m33452a(new C2491c0(this));
                    if (!ComponentCallbacks2C2489c.m33451b().m33448e(true)) {
                        this.f7231c = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                m33422j((AbstractC2472b) message.obj);
                break;
            case 9:
                if (this.f7240l.containsKey(message.obj)) {
                    this.f7240l.get(message.obj).m33387K();
                    break;
                }
                break;
            case 10:
                for (C2485b<?> c2485b6 : this.f7243o) {
                    C2506h0<?> remove = this.f7240l.remove(c2485b6);
                    if (remove != null) {
                        remove.m33386L();
                    }
                }
                this.f7243o.clear();
                break;
            case 11:
                if (this.f7240l.containsKey(message.obj)) {
                    this.f7240l.get(message.obj).m33385M();
                    break;
                }
                break;
            case 12:
                if (this.f7240l.containsKey(message.obj)) {
                    this.f7240l.get(message.obj).m33381a();
                    break;
                }
                break;
            case 14:
                C2563z c2563z = (C2563z) message.obj;
                C2485b<?> m33251a = c2563z.m33251a();
                if (!this.f7240l.containsKey(m33251a)) {
                    c2563z.m33250b().m30800c(Boolean.FALSE);
                    break;
                } else {
                    c2563z.m33250b().m30800c(Boolean.valueOf(C2506h0.m33384N(this.f7240l.get(m33251a), false)));
                    break;
                }
            case 15:
                C2514j0 c2514j0 = (C2514j0) message.obj;
                Map<C2485b<?>, C2506h0<?>> map = this.f7240l;
                c2485b = c2514j0.f7276a;
                if (map.containsKey(c2485b)) {
                    Map<C2485b<?>, C2506h0<?>> map2 = this.f7240l;
                    c2485b2 = c2514j0.f7276a;
                    C2506h0.m33397A(map2.get(c2485b2), c2514j0);
                    break;
                }
                break;
            case 16:
                C2514j0 c2514j02 = (C2514j0) message.obj;
                Map<C2485b<?>, C2506h0<?>> map3 = this.f7240l;
                c2485b3 = c2514j02.f7276a;
                if (map3.containsKey(c2485b3)) {
                    Map<C2485b<?>, C2506h0<?>> map4 = this.f7240l;
                    c2485b4 = c2514j02.f7276a;
                    C2506h0.m33396B(map4.get(c2485b4), c2514j02);
                    break;
                }
                break;
            case 17:
                m33420l();
                break;
            case 18:
                C2543s0 c2543s0 = (C2543s0) message.obj;
                if (c2543s0.f7344c == 0) {
                    m33421k().mo560a(new TelemetryData(c2543s0.f7343b, Arrays.asList(c2543s0.f7342a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.f7233e;
                    if (telemetryData != null) {
                        List<MethodInvocation> m33186t = telemetryData.m33186t();
                        if (telemetryData.m33187h() == c2543s0.f7343b && (m33186t == null || m33186t.size() < c2543s0.f7345d)) {
                            this.f7233e.m33185v(c2543s0.f7342a);
                        } else {
                            this.f7244p.removeMessages(17);
                            m33420l();
                        }
                    }
                    if (this.f7233e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c2543s0.f7342a);
                        this.f7233e = new TelemetryData(c2543s0.f7343b, arrayList);
                        Handler handler2 = this.f7244p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c2543s0.f7344c);
                        break;
                    }
                }
                break;
            case 19:
                this.f7232d = false;
                break;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int m33418n() {
        return this.f7238j.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final C2506h0 m33408x(C2485b<?> c2485b) {
        return this.f7240l.get(c2485b);
    }
}
