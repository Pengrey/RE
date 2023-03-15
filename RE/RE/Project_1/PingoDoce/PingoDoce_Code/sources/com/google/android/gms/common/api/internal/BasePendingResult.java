package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2597i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p251n7.HandlerC7687f;
import p462y6.AbstractC13119b;
import p462y6.InterfaceC13122d;
import p462y6.InterfaceC13123e;
import p462y6.InterfaceC13124f;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC13123e> extends AbstractC13119b<R> {

    /* renamed from: m */
    static final ThreadLocal<Boolean> f7186m = new C2553v1();

    /* renamed from: n */
    public static final /* synthetic */ int f7187n = 0;

    /* renamed from: a */
    private final Object f7188a;

    /* renamed from: b */
    protected final HandlerC2480a<R> f7189b;

    /* renamed from: c */
    private final CountDownLatch f7190c;

    /* renamed from: d */
    private final ArrayList<AbstractC13119b.InterfaceC13120a> f7191d;

    /* renamed from: e */
    private InterfaceC13124f<? super R> f7192e;

    /* renamed from: f */
    private final AtomicReference<C2518k1> f7193f;

    /* renamed from: g */
    private R f7194g;

    /* renamed from: h */
    private Status f7195h;

    /* renamed from: i */
    private volatile boolean f7196i;

    /* renamed from: j */
    private boolean f7197j;

    /* renamed from: k */
    private boolean f7198k;

    /* renamed from: l */
    private boolean f7199l;
    @KeepName
    private C2559x1 mResultGuardian;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes.dex */
    public static class HandlerC2480a<R extends InterfaceC13123e> extends HandlerC7687f {
        public HandlerC2480a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m33467a(InterfaceC13124f<? super R> interfaceC13124f, R r) {
            int i = BasePendingResult.f7187n;
            sendMessage(obtainMessage(1, new Pair((InterfaceC13124f) C2597i.m33076j(interfaceC13124f), r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                InterfaceC13124f interfaceC13124f = (InterfaceC13124f) pair.first;
                InterfaceC13123e interfaceC13123e = (InterfaceC13123e) pair.second;
                try {
                    interfaceC13124f.m1567a(interfaceC13123e);
                } catch (RuntimeException e) {
                    BasePendingResult.m33468k(interfaceC13123e);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i);
                Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).m33475d(Status.f7158E);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f7188a = new Object();
        this.f7190c = new CountDownLatch(1);
        this.f7191d = new ArrayList<>();
        this.f7193f = new AtomicReference<>();
        this.f7199l = false;
        this.f7189b = new HandlerC2480a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    /* renamed from: g */
    private final R m33472g() {
        R r;
        synchronized (this.f7188a) {
            C2597i.m33072n(!this.f7196i, "Result has already been consumed.");
            C2597i.m33072n(m33474e(), "Result is not ready.");
            r = this.f7194g;
            this.f7194g = null;
            this.f7192e = null;
            this.f7196i = true;
        }
        if (this.f7193f.getAndSet(null) == null) {
            return (R) C2597i.m33076j(r);
        }
        throw null;
    }

    /* renamed from: h */
    private final void m33471h(R r) {
        this.f7194g = r;
        this.f7195h = r.getStatus();
        this.f7190c.countDown();
        if (this.f7197j) {
            this.f7192e = null;
        } else {
            InterfaceC13124f<? super R> interfaceC13124f = this.f7192e;
            if (interfaceC13124f == null) {
                if (this.f7194g instanceof InterfaceC13122d) {
                    this.mResultGuardian = new C2559x1(this, null);
                }
            } else {
                this.f7189b.removeMessages(2);
                this.f7189b.m33467a(interfaceC13124f, m33472g());
            }
        }
        ArrayList<AbstractC13119b.InterfaceC13120a> arrayList = this.f7191d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo550a(this.f7195h);
        }
        this.f7191d.clear();
    }

    /* renamed from: k */
    public static void m33468k(InterfaceC13123e interfaceC13123e) {
        if (interfaceC13123e instanceof InterfaceC13122d) {
            try {
                ((InterfaceC13122d) interfaceC13123e).m1568a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC13123e)), e);
            }
        }
    }

    @Override // p462y6.AbstractC13119b
    /* renamed from: a */
    public final void mo1572a(AbstractC13119b.InterfaceC13120a interfaceC13120a) {
        C2597i.m33084b(interfaceC13120a != null, "Callback cannot be null.");
        synchronized (this.f7188a) {
            if (m33474e()) {
                interfaceC13120a.mo550a(this.f7195h);
            } else {
                this.f7191d.add(interfaceC13120a);
            }
        }
    }

    @Override // p462y6.AbstractC13119b
    /* renamed from: b */
    public final R mo1571b(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C2597i.m33077i("await must not be called on the UI thread when time is greater than zero.");
        }
        C2597i.m33072n(!this.f7196i, "Result has already been consumed.");
        C2597i.m33072n(true, "Cannot await if then() has been called.");
        try {
            if (!this.f7190c.await(j, timeUnit)) {
                m33475d(Status.f7158E);
            }
        } catch (InterruptedException unused) {
            m33475d(Status.f7156C);
        }
        C2597i.m33072n(m33474e(), "Result is not ready.");
        return m33472g();
    }

    /* renamed from: c */
    public abstract R mo1566c(Status status);

    @Deprecated
    /* renamed from: d */
    public final void m33475d(Status status) {
        synchronized (this.f7188a) {
            if (!m33474e()) {
                m33473f(mo1566c(status));
                this.f7198k = true;
            }
        }
    }

    /* renamed from: e */
    public final boolean m33474e() {
        return this.f7190c.getCount() == 0;
    }

    /* renamed from: f */
    public final void m33473f(R r) {
        synchronized (this.f7188a) {
            if (!this.f7198k && !this.f7197j) {
                m33474e();
                C2597i.m33072n(!m33474e(), "Results have already been set");
                C2597i.m33072n(!this.f7196i, "Result has already been consumed");
                m33471h(r);
                return;
            }
            m33468k(r);
        }
    }

    /* renamed from: j */
    public final void m33469j() {
        boolean z = true;
        if (!this.f7199l && !f7186m.get().booleanValue()) {
            z = false;
        }
        this.f7199l = z;
    }

    public BasePendingResult(AbstractC2475c abstractC2475c) {
        this.f7188a = new Object();
        this.f7190c = new CountDownLatch(1);
        this.f7191d = new ArrayList<>();
        this.f7193f = new AtomicReference<>();
        this.f7199l = false;
        this.f7189b = new HandlerC2480a<>(abstractC2475c != null ? abstractC2475c.mo33319c() : Looper.getMainLooper());
        new WeakReference(abstractC2475c);
    }
}
