package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2465d;
import com.google.android.gms.common.api.internal.AbstractC2493d;
import com.google.android.gms.common.api.internal.AbstractC2541s;
import com.google.android.gms.common.api.internal.BinderC2501f1;
import com.google.android.gms.common.api.internal.C2481a;
import com.google.android.gms.common.api.internal.C2485b;
import com.google.android.gms.common.api.internal.C2499f;
import com.google.android.gms.common.api.internal.C2506h0;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.api.internal.C2523m0;
import com.google.android.gms.common.api.internal.C2525n;
import com.google.android.gms.common.api.internal.C2560y;
import com.google.android.gms.common.api.internal.InterfaceC2535q;
import com.google.android.gms.common.api.internal.ServiceConnectionC2516k;
import com.google.android.gms.common.internal.AbstractC2576b;
import com.google.android.gms.common.internal.C2583c;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p078e7.C5009j;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: classes.dex */
public abstract class AbstractC2472b<O extends C2461a.InterfaceC2465d> {

    /* renamed from: a */
    private final Context f7170a;

    /* renamed from: b */
    private final String f7171b;

    /* renamed from: c */
    private final C2461a<O> f7172c;

    /* renamed from: d */
    private final O f7173d;

    /* renamed from: e */
    private final C2485b<O> f7174e;

    /* renamed from: f */
    private final Looper f7175f;

    /* renamed from: g */
    private final int f7176g;
    @NotOnlyInitialized

    /* renamed from: h */
    private final AbstractC2475c f7177h;

    /* renamed from: i */
    private final InterfaceC2535q f7178i;

    /* renamed from: j */
    protected final C2499f f7179j;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.b$a */
    /* loaded from: classes.dex */
    public static class C2473a {

        /* renamed from: c */
        public static final C2473a f7180c = new C2474a().m33481a();

        /* renamed from: a */
        public final InterfaceC2535q f7181a;

        /* renamed from: b */
        public final Looper f7182b;

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.b$a$a */
        /* loaded from: classes.dex */
        public static class C2474a {

            /* renamed from: a */
            private InterfaceC2535q f7183a;

            /* renamed from: b */
            private Looper f7184b;

            /* renamed from: a */
            public C2473a m33481a() {
                if (this.f7183a == null) {
                    this.f7183a = new C2481a();
                }
                if (this.f7184b == null) {
                    this.f7184b = Looper.getMainLooper();
                }
                return new C2473a(this.f7183a, this.f7184b);
            }

            /* renamed from: b */
            public C2474a m33480b(Looper looper) {
                C2597i.m33075k(looper, "Looper must not be null.");
                this.f7184b = looper;
                return this;
            }

            /* renamed from: c */
            public C2474a m33479c(InterfaceC2535q interfaceC2535q) {
                C2597i.m33075k(interfaceC2535q, "StatusExceptionMapper must not be null.");
                this.f7183a = interfaceC2535q;
                return this;
            }
        }

        private C2473a(InterfaceC2535q interfaceC2535q, Account account, Looper looper) {
            this.f7181a = interfaceC2535q;
            this.f7182b = looper;
        }
    }

    public AbstractC2472b(Activity activity, C2461a<O> c2461a, O o, C2473a c2473a) {
        this(activity, activity, c2461a, o, c2473a);
    }

    /* renamed from: s */
    private final <A extends C2461a.InterfaceC2463b, T extends AbstractC2493d<? extends InterfaceC13123e, A>> T m33483s(int i, T t) {
        t.m33469j();
        this.f7179j.m33435G(this, i, t);
        return t;
    }

    /* renamed from: t */
    private final <TResult, A extends C2461a.InterfaceC2463b> AbstractC3419d<TResult> m33482t(int i, AbstractC2541s<A, TResult> abstractC2541s) {
        C3421e c3421e = new C3421e();
        this.f7179j.m33434H(this, i, abstractC2541s, c3421e, this.f7178i);
        return c3421e.m30802a();
    }

    /* renamed from: b */
    public AbstractC2475c m33500b() {
        return this.f7177h;
    }

    /* renamed from: c */
    protected C2583c.C2584a m33499c() {
        Account m33502b;
        Set<Scope> emptySet;
        GoogleSignInAccount m33501f;
        C2583c.C2584a c2584a = new C2583c.C2584a();
        O o = this.f7173d;
        if ((o instanceof C2461a.InterfaceC2465d.InterfaceC2467b) && (m33501f = ((C2461a.InterfaceC2465d.InterfaceC2467b) o).m33501f()) != null) {
            m33502b = m33501f.m33623b();
        } else {
            O o2 = this.f7173d;
            m33502b = o2 instanceof C2461a.InterfaceC2465d.InterfaceC2466a ? ((C2461a.InterfaceC2465d.InterfaceC2466a) o2).m33502b() : null;
        }
        c2584a.m33121d(m33502b);
        O o3 = this.f7173d;
        if (o3 instanceof C2461a.InterfaceC2465d.InterfaceC2467b) {
            GoogleSignInAccount m33501f2 = ((C2461a.InterfaceC2465d.InterfaceC2467b) o3).m33501f();
            if (m33501f2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = m33501f2.m33629G();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        c2584a.m33122c(emptySet);
        c2584a.m33120e(this.f7170a.getClass().getName());
        c2584a.m33123b(this.f7170a.getPackageName());
        return c2584a;
    }

    /* renamed from: d */
    public <TResult, A extends C2461a.InterfaceC2463b> AbstractC3419d<TResult> m33498d(AbstractC2541s<A, TResult> abstractC2541s) {
        return m33482t(2, abstractC2541s);
    }

    /* renamed from: e */
    public <TResult, A extends C2461a.InterfaceC2463b> AbstractC3419d<TResult> m33497e(AbstractC2541s<A, TResult> abstractC2541s) {
        return m33482t(0, abstractC2541s);
    }

    /* renamed from: f */
    public <A extends C2461a.InterfaceC2463b> AbstractC3419d<Void> m33496f(C2525n<A, ?> c2525n) {
        C2597i.m33076j(c2525n);
        C2597i.m33075k(c2525n.f7304a.m33324b(), "Listener has already been released.");
        C2597i.m33075k(c2525n.f7305b.m33278a(), "Listener has already been released.");
        return this.f7179j.m33441A(this, c2525n.f7304a, c2525n.f7305b, c2525n.f7306c);
    }

    /* renamed from: g */
    public AbstractC3419d<Boolean> m33495g(C2508i.C2509a<?> c2509a) {
        return m33494h(c2509a, 0);
    }

    /* renamed from: h */
    public AbstractC3419d<Boolean> m33494h(C2508i.C2509a<?> c2509a, int i) {
        C2597i.m33075k(c2509a, "Listener key cannot be null.");
        return this.f7179j.m33440B(this, c2509a, i);
    }

    /* renamed from: i */
    public <A extends C2461a.InterfaceC2463b, T extends AbstractC2493d<? extends InterfaceC13123e, A>> T m33493i(T t) {
        m33483s(1, t);
        return t;
    }

    /* renamed from: j */
    public <TResult, A extends C2461a.InterfaceC2463b> AbstractC3419d<TResult> m33492j(AbstractC2541s<A, TResult> abstractC2541s) {
        return m33482t(1, abstractC2541s);
    }

    /* renamed from: k */
    public final C2485b<O> m33491k() {
        return this.f7174e;
    }

    /* renamed from: l */
    public O m33490l() {
        return this.f7173d;
    }

    /* renamed from: m */
    public Context m33489m() {
        return this.f7170a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public String m33488n() {
        return this.f7171b;
    }

    /* renamed from: o */
    public Looper m33487o() {
        return this.f7175f;
    }

    /* renamed from: p */
    public final int m33486p() {
        return this.f7176g;
    }

    /* renamed from: q */
    public final C2461a.InterfaceC2470f m33485q(Looper looper, C2506h0<O> c2506h0) {
        C2461a.InterfaceC2470f mo6033a = ((C2461a.AbstractC2462a) C2597i.m33076j(this.f7172c.m33505a())).mo6033a(this.f7170a, looper, m33499c().m33124a(), this.f7173d, c2506h0, c2506h0);
        String m33488n = m33488n();
        if (m33488n != null && (mo6033a instanceof AbstractC2576b)) {
            ((AbstractC2576b) mo6033a).m33172P(m33488n);
        }
        if (m33488n != null && (mo6033a instanceof ServiceConnectionC2516k)) {
            ((ServiceConnectionC2516k) mo6033a).m33336r(m33488n);
        }
        return mo6033a;
    }

    /* renamed from: r */
    public final BinderC2501f1 m33484r(Context context, Handler handler) {
        return new BinderC2501f1(context, handler, m33499c().m33124a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC2472b(android.app.Activity r2, com.google.android.gms.common.api.C2461a<O> r3, O r4, com.google.android.gms.common.api.internal.InterfaceC2535q r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.b$a$a r0 = new com.google.android.gms.common.api.b$a$a
            r0.<init>()
            r0.m33479c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.m33480b(r5)
            com.google.android.gms.common.api.b$a r5 = r0.m33481a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC2472b.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.q):void");
    }

    private AbstractC2472b(Context context, Activity activity, C2461a<O> c2461a, O o, C2473a c2473a) {
        C2597i.m33075k(context, "Null context is not permitted.");
        C2597i.m33075k(c2461a, "Api must not be null.");
        C2597i.m33075k(c2473a, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f7170a = context.getApplicationContext();
        String str = null;
        if (C5009j.m25892k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f7171b = str;
        this.f7172c = c2461a;
        this.f7173d = o;
        this.f7175f = c2473a.f7182b;
        C2485b<O> m33461a = C2485b.m33461a(c2461a, o, str);
        this.f7174e = m33461a;
        this.f7177h = new C2523m0(this);
        C2499f m33407y = C2499f.m33407y(this.f7170a);
        this.f7179j = m33407y;
        this.f7176g = m33407y.m33418n();
        this.f7178i = c2473a.f7181a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C2560y.m33254u(activity, m33407y, m33461a);
        }
        m33407y.m33429c(this);
    }

    public AbstractC2472b(Context context, C2461a<O> c2461a, O o, C2473a c2473a) {
        this(context, null, c2461a, o, c2473a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC2472b(android.content.Context r2, com.google.android.gms.common.api.C2461a<O> r3, O r4, com.google.android.gms.common.api.internal.InterfaceC2535q r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.b$a$a r0 = new com.google.android.gms.common.api.b$a$a
            r0.<init>()
            r0.m33479c(r5)
            com.google.android.gms.common.api.b$a r5 = r0.m33481a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC2472b.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.q):void");
    }
}
