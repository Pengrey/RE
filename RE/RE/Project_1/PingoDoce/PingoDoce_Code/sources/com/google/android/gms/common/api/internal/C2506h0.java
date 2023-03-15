package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2566b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC2472b;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2465d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.tasks.C3421e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p029b7.C1836e;
import p078e7.C5000a;
import p301q.C9545a;
import p484z6.C13701c;
import p484z6.C13721r;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: classes.dex */
public final class C2506h0<O extends C2461a.InterfaceC2465d> implements AbstractC2475c.InterfaceC2476a, AbstractC2475c.InterfaceC2477b {
    @NotOnlyInitialized

    /* renamed from: b */
    private final C2461a.InterfaceC2470f f7259b;

    /* renamed from: c */
    private final C2485b<O> f7260c;

    /* renamed from: d */
    private final C2557x f7261d;

    /* renamed from: g */
    private final int f7264g;

    /* renamed from: h */
    private final BinderC2501f1 f7265h;

    /* renamed from: i */
    private boolean f7266i;

    /* renamed from: m */
    final /* synthetic */ C2499f f7270m;

    /* renamed from: a */
    private final Queue<AbstractC2534p1> f7258a = new LinkedList();

    /* renamed from: e */
    private final Set<C2537q1> f7262e = new HashSet();

    /* renamed from: f */
    private final Map<C2508i.C2509a<?>, C2555w0> f7263f = new HashMap();

    /* renamed from: j */
    private final List<C2514j0> f7267j = new ArrayList();

    /* renamed from: k */
    private ConnectionResult f7268k = null;

    /* renamed from: l */
    private int f7269l = 0;

    public C2506h0(C2499f c2499f, AbstractC2472b<O> abstractC2472b) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f7270m = c2499f;
        handler = c2499f.f7244p;
        C2461a.InterfaceC2470f m33485q = abstractC2472b.m33485q(handler.getLooper(), this);
        this.f7259b = m33485q;
        this.f7260c = abstractC2472b.m33491k();
        this.f7261d = new C2557x();
        this.f7264g = abstractC2472b.m33486p();
        if (!m33485q.mo20508o()) {
            this.f7265h = null;
            return;
        }
        context = c2499f.f7235g;
        handler2 = c2499f.f7244p;
        this.f7265h = abstractC2472b.m33484r(context, handler2);
    }

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ void m33397A(C2506h0 c2506h0, C2514j0 c2514j0) {
        if (c2506h0.f7267j.contains(c2514j0) && !c2506h0.f7266i) {
            if (c2506h0.f7259b.mo33347b()) {
                c2506h0.m33376f();
            } else {
                c2506h0.m33394D();
            }
        }
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m33396B(C2506h0 c2506h0, C2514j0 c2514j0) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] mo33306g;
        if (c2506h0.f7267j.remove(c2514j0)) {
            handler = c2506h0.f7270m.f7244p;
            handler.removeMessages(15, c2514j0);
            handler2 = c2506h0.f7270m.f7244p;
            handler2.removeMessages(16, c2514j0);
            feature = c2514j0.f7277b;
            ArrayList arrayList = new ArrayList(c2506h0.f7258a.size());
            for (AbstractC2534p1 abstractC2534p1 : c2506h0.f7258a) {
                if ((abstractC2534p1 instanceof AbstractC2533p0) && (mo33306g = ((AbstractC2533p0) abstractC2534p1).mo33306g(c2506h0)) != null && C5000a.m25920c(mo33306g, feature)) {
                    arrayList.add(abstractC2534p1);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC2534p1 abstractC2534p12 = (AbstractC2534p1) arrayList.get(i);
                c2506h0.f7258a.remove(abstractC2534p12);
                abstractC2534p12.mo33304b(new UnsupportedApiCallException(feature));
            }
        }
    }

    /* renamed from: N */
    public static /* bridge */ /* synthetic */ boolean m33384N(C2506h0 c2506h0, boolean z) {
        return c2506h0.m33368n(false);
    }

    /* renamed from: b */
    private final Feature m33380b(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] mo33342j = this.f7259b.mo33342j();
            if (mo33342j == null) {
                mo33342j = new Feature[0];
            }
            C9545a c9545a = new C9545a(mo33342j.length);
            for (Feature feature : mo33342j) {
                c9545a.put(feature.m33518h(), Long.valueOf(feature.m33517t()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) c9545a.get(feature2.m33518h());
                if (l == null || l.longValue() < feature2.m33517t()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m33379c(ConnectionResult connectionResult) {
        for (C2537q1 c2537q1 : this.f7262e) {
            c2537q1.m33298b(this.f7260c, connectionResult, C13701c.m575a(connectionResult, ConnectionResult.f7139A) ? this.f7259b.mo33341k() : null);
        }
        this.f7262e.clear();
    }

    /* renamed from: d */
    public final void m33378d(Status status) {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        m33377e(status, null, false);
    }

    /* renamed from: e */
    private final void m33377e(Status status, Exception exc, boolean z) {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        if ((status == null) != (exc == null)) {
            Iterator<AbstractC2534p1> it = this.f7258a.iterator();
            while (it.hasNext()) {
                AbstractC2534p1 next = it.next();
                if (!z || next.f7320a == 2) {
                    if (status != null) {
                        next.mo33305a(status);
                    } else {
                        next.mo33304b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: f */
    private final void m33376f() {
        ArrayList arrayList = new ArrayList(this.f7258a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC2534p1 abstractC2534p1 = (AbstractC2534p1) arrayList.get(i);
            if (!this.f7259b.mo33347b()) {
                return;
            }
            if (m33370l(abstractC2534p1)) {
                this.f7258a.remove(abstractC2534p1);
            }
        }
    }

    /* renamed from: g */
    public final void m33375g() {
        m33395C();
        m33379c(ConnectionResult.f7139A);
        m33371k();
        Iterator<C2555w0> it = this.f7263f.values().iterator();
        while (it.hasNext()) {
            C2555w0 next = it.next();
            if (m33380b(next.f7365a.m33323c()) != null) {
                it.remove();
            } else {
                try {
                    next.f7365a.mo33252d(this.f7259b, new C3421e<>());
                } catch (DeadObjectException unused) {
                    mo33363s(3);
                    this.f7259b.mo33345e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m33376f();
        m33373i();
    }

    /* renamed from: h */
    public final void m33374h(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        C13721r c13721r;
        m33395C();
        this.f7266i = true;
        this.f7261d.m33264e(i, this.f7259b.mo33340l());
        C2499f c2499f = this.f7270m;
        handler = c2499f.f7244p;
        handler2 = c2499f.f7244p;
        Message obtain = Message.obtain(handler2, 9, this.f7260c);
        j = this.f7270m.f7229a;
        handler.sendMessageDelayed(obtain, j);
        C2499f c2499f2 = this.f7270m;
        handler3 = c2499f2.f7244p;
        handler4 = c2499f2.f7244p;
        Message obtain2 = Message.obtain(handler4, 11, this.f7260c);
        j2 = this.f7270m.f7230b;
        handler3.sendMessageDelayed(obtain2, j2);
        c13721r = this.f7270m.f7237i;
        c13721r.m551c();
        for (C2555w0 c2555w0 : this.f7263f.values()) {
            c2555w0.f7367c.run();
        }
    }

    /* renamed from: i */
    private final void m33373i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.f7270m.f7244p;
        handler.removeMessages(12, this.f7260c);
        C2499f c2499f = this.f7270m;
        handler2 = c2499f.f7244p;
        handler3 = c2499f.f7244p;
        Message obtainMessage = handler3.obtainMessage(12, this.f7260c);
        j = this.f7270m.f7231c;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: j */
    private final void m33372j(AbstractC2534p1 abstractC2534p1) {
        abstractC2534p1.mo33302d(this.f7261d, m33382P());
        try {
            abstractC2534p1.mo33303c(this);
        } catch (DeadObjectException unused) {
            mo33363s(1);
            this.f7259b.mo33345e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: k */
    private final void m33371k() {
        Handler handler;
        Handler handler2;
        if (this.f7266i) {
            handler = this.f7270m.f7244p;
            handler.removeMessages(11, this.f7260c);
            handler2 = this.f7270m.f7244p;
            handler2.removeMessages(9, this.f7260c);
            this.f7266i = false;
        }
    }

    /* renamed from: l */
    private final boolean m33370l(AbstractC2534p1 abstractC2534p1) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j3;
        if (!(abstractC2534p1 instanceof AbstractC2533p0)) {
            m33372j(abstractC2534p1);
            return true;
        }
        AbstractC2533p0 abstractC2533p0 = (AbstractC2533p0) abstractC2534p1;
        Feature m33380b = m33380b(abstractC2533p0.mo33306g(this));
        if (m33380b == null) {
            m33372j(abstractC2534p1);
            return true;
        }
        String name = this.f7259b.getClass().getName();
        String m33518h = m33380b.m33518h();
        long m33517t = m33380b.m33517t();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(m33518h).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(m33518h);
        sb2.append(", ");
        sb2.append(m33517t);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        z = this.f7270m.f7245q;
        if (z && abstractC2533p0.mo33307f(this)) {
            C2514j0 c2514j0 = new C2514j0(this.f7260c, m33380b, null);
            int indexOf = this.f7267j.indexOf(c2514j0);
            if (indexOf >= 0) {
                C2514j0 c2514j02 = this.f7267j.get(indexOf);
                handler5 = this.f7270m.f7244p;
                handler5.removeMessages(15, c2514j02);
                C2499f c2499f = this.f7270m;
                handler6 = c2499f.f7244p;
                handler7 = c2499f.f7244p;
                Message obtain = Message.obtain(handler7, 15, c2514j02);
                j3 = this.f7270m.f7229a;
                handler6.sendMessageDelayed(obtain, j3);
                return false;
            }
            this.f7267j.add(c2514j0);
            C2499f c2499f2 = this.f7270m;
            handler = c2499f2.f7244p;
            handler2 = c2499f2.f7244p;
            Message obtain2 = Message.obtain(handler2, 15, c2514j0);
            j = this.f7270m.f7229a;
            handler.sendMessageDelayed(obtain2, j);
            C2499f c2499f3 = this.f7270m;
            handler3 = c2499f3.f7244p;
            handler4 = c2499f3.f7244p;
            Message obtain3 = Message.obtain(handler4, 16, c2514j0);
            j2 = this.f7270m.f7230b;
            handler3.sendMessageDelayed(obtain3, j2);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (m33369m(connectionResult)) {
                return false;
            }
            this.f7270m.m33424h(connectionResult, this.f7264g);
            return false;
        }
        abstractC2533p0.mo33304b(new UnsupportedApiCallException(m33380b));
        return true;
    }

    /* renamed from: m */
    private final boolean m33369m(ConnectionResult connectionResult) {
        Object obj;
        C2560y c2560y;
        Set set;
        C2560y c2560y2;
        obj = C2499f.f7227t;
        synchronized (obj) {
            C2499f c2499f = this.f7270m;
            c2560y = c2499f.f7241m;
            if (c2560y != null) {
                set = c2499f.f7242n;
                if (set.contains(this.f7260c)) {
                    c2560y2 = this.f7270m.f7241m;
                    c2560y2.m33269s(connectionResult, this.f7264g);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: n */
    public final boolean m33368n(boolean z) {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        if (this.f7259b.mo33347b() && this.f7263f.size() == 0) {
            if (!this.f7261d.m33262g()) {
                this.f7259b.mo33345e("Timing out service connection.");
                return true;
            }
            if (z) {
                m33373i();
            }
            return false;
        }
        return false;
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ C2485b m33361u(C2506h0 c2506h0) {
        return c2506h0.f7260c;
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ void m33359w(C2506h0 c2506h0, Status status) {
        c2506h0.m33378d(status);
    }

    /* renamed from: C */
    public final void m33395C() {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        this.f7268k = null;
    }

    /* renamed from: D */
    public final void m33394D() {
        Handler handler;
        C13721r c13721r;
        Context context;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        if (this.f7259b.mo33347b() || this.f7259b.mo33343i()) {
            return;
        }
        try {
            C2499f c2499f = this.f7270m;
            c13721r = c2499f.f7237i;
            context = c2499f.f7235g;
            int m552b = c13721r.m552b(context, this.f7259b);
            if (m552b != 0) {
                ConnectionResult connectionResult = new ConnectionResult(m552b, null);
                String name = this.f7259b.getClass().getName();
                String obj = connectionResult.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + obj.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(obj);
                Log.w("GoogleApiManager", sb2.toString());
                m33391G(connectionResult, null);
                return;
            }
            C2499f c2499f2 = this.f7270m;
            C2461a.InterfaceC2470f interfaceC2470f = this.f7259b;
            C2520l0 c2520l0 = new C2520l0(c2499f2, interfaceC2470f, this.f7260c);
            if (interfaceC2470f.mo20508o()) {
                ((BinderC2501f1) C2597i.m33076j(this.f7265h)).m33403V1(c2520l0);
            }
            try {
                this.f7259b.mo33339m(c2520l0);
            } catch (SecurityException e) {
                m33391G(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            m33391G(new ConnectionResult(10), e2);
        }
    }

    /* renamed from: E */
    public final void m33393E(AbstractC2534p1 abstractC2534p1) {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        if (this.f7259b.mo33347b()) {
            if (m33370l(abstractC2534p1)) {
                m33373i();
                return;
            } else {
                this.f7258a.add(abstractC2534p1);
                return;
            }
        }
        this.f7258a.add(abstractC2534p1);
        ConnectionResult connectionResult = this.f7268k;
        if (connectionResult != null && connectionResult.m33519y()) {
            m33391G(this.f7268k, null);
        } else {
            m33394D();
        }
    }

    /* renamed from: F */
    public final void m33392F() {
        this.f7269l++;
    }

    /* renamed from: G */
    public final void m33391G(ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        C13721r c13721r;
        boolean z;
        Status m33423i;
        Status m33423i2;
        Status m33423i3;
        Handler handler2;
        Handler handler3;
        long j;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        BinderC2501f1 binderC2501f1 = this.f7265h;
        if (binderC2501f1 != null) {
            binderC2501f1.m33402W1();
        }
        m33395C();
        c13721r = this.f7270m.f7237i;
        c13721r.m551c();
        m33379c(connectionResult);
        if ((this.f7259b instanceof C1836e) && connectionResult.m33522h() != 24) {
            this.f7270m.f7232d = true;
            C2499f c2499f = this.f7270m;
            handler5 = c2499f.f7244p;
            handler6 = c2499f.f7244p;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.m33522h() == 4) {
            status = C2499f.f7226s;
            m33378d(status);
        } else if (this.f7258a.isEmpty()) {
            this.f7268k = connectionResult;
        } else if (exc != null) {
            handler4 = this.f7270m.f7244p;
            C2597i.m33082d(handler4);
            m33377e(null, exc, false);
        } else {
            z = this.f7270m.f7245q;
            if (z) {
                m33423i2 = C2499f.m33423i(this.f7260c, connectionResult);
                m33377e(m33423i2, null, true);
                if (this.f7258a.isEmpty() || m33369m(connectionResult) || this.f7270m.m33424h(connectionResult, this.f7264g)) {
                    return;
                }
                if (connectionResult.m33522h() == 18) {
                    this.f7266i = true;
                }
                if (this.f7266i) {
                    C2499f c2499f2 = this.f7270m;
                    handler2 = c2499f2.f7244p;
                    handler3 = c2499f2.f7244p;
                    Message obtain = Message.obtain(handler3, 9, this.f7260c);
                    j = this.f7270m.f7229a;
                    handler2.sendMessageDelayed(obtain, j);
                    return;
                }
                m33423i3 = C2499f.m33423i(this.f7260c, connectionResult);
                m33378d(m33423i3);
                return;
            }
            m33423i = C2499f.m33423i(this.f7260c, connectionResult);
            m33378d(m33423i);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2496e
    /* renamed from: H */
    public final void mo33390H(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f7270m.f7244p;
        if (myLooper == handler.getLooper()) {
            m33375g();
            return;
        }
        handler2 = this.f7270m.f7244p;
        handler2.post(new RunnableC2494d0(this));
    }

    /* renamed from: I */
    public final void m33389I(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        C2461a.InterfaceC2470f interfaceC2470f = this.f7259b;
        String name = interfaceC2470f.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        interfaceC2470f.mo33345e(sb2.toString());
        m33391G(connectionResult, null);
    }

    /* renamed from: J */
    public final void m33388J(C2537q1 c2537q1) {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        this.f7262e.add(c2537q1);
    }

    /* renamed from: K */
    public final void m33387K() {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        if (this.f7266i) {
            m33394D();
        }
    }

    /* renamed from: L */
    public final void m33386L() {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        m33378d(C2499f.f7225r);
        this.f7261d.m33263f();
        for (C2508i.C2509a c2509a : (C2508i.C2509a[]) this.f7263f.keySet().toArray(new C2508i.C2509a[0])) {
            m33393E(new C2531o1(c2509a, new C3421e()));
        }
        m33379c(new ConnectionResult(4));
        if (this.f7259b.mo33347b()) {
            this.f7259b.mo33348a(new C2503g0(this));
        }
    }

    /* renamed from: M */
    public final void m33385M() {
        Handler handler;
        C2566b c2566b;
        Context context;
        Status status;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        if (this.f7266i) {
            m33371k();
            C2499f c2499f = this.f7270m;
            c2566b = c2499f.f7236h;
            context = c2499f.f7235g;
            if (c2566b.mo33223g(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m33378d(status);
            this.f7259b.mo33345e("Timing out connection while resuming.");
        }
    }

    /* renamed from: O */
    public final boolean m33383O() {
        return this.f7259b.mo33347b();
    }

    /* renamed from: P */
    public final boolean m33382P() {
        return this.f7259b.mo20508o();
    }

    /* renamed from: a */
    public final boolean m33381a() {
        return m33368n(true);
    }

    /* renamed from: o */
    public final int m33367o() {
        return this.f7264g;
    }

    /* renamed from: p */
    public final int m33366p() {
        return this.f7269l;
    }

    /* renamed from: q */
    public final ConnectionResult m33365q() {
        Handler handler;
        handler = this.f7270m.f7244p;
        C2597i.m33082d(handler);
        return this.f7268k;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2496e
    /* renamed from: s */
    public final void mo33363s(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f7270m.f7244p;
        if (myLooper == handler.getLooper()) {
            m33374h(i);
            return;
        }
        handler2 = this.f7270m.f7244p;
        handler2.post(new RunnableC2497e0(this, i));
    }

    /* renamed from: t */
    public final C2461a.InterfaceC2470f m33362t() {
        return this.f7259b;
    }

    /* renamed from: v */
    public final Map<C2508i.C2509a<?>, C2555w0> m33360v() {
        return this.f7263f;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2519l
    /* renamed from: y */
    public final void mo33333y(ConnectionResult connectionResult) {
        m33391G(connectionResult, null);
    }
}
