package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.C3425g;
import com.google.firebase.C4175c;
import com.google.firebase.installations.C4259c;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import la.AbstractC7020d;
import la.AbstractC7024f;
import la.C7019c;
import p102fa.InterfaceC5439f;
import p136ha.InterfaceC5882b;
import p158ia.C6068f;
import p158ia.InterfaceC6066d;
import p178ja.InterfaceC6411a;
import p200ka.AbstractC6621d;
import p200ka.C6618b;
import p200ka.C6619c;
import pa.InterfaceC8592i;

/* renamed from: com.google.firebase.installations.c */
/* loaded from: classes.dex */
public class C4259c implements InterfaceC6066d {

    /* renamed from: m */
    private static final Object f11580m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f11581n = new ThreadFactoryC4260a();

    /* renamed from: a */
    private final C4175c f11582a;

    /* renamed from: b */
    private final C7019c f11583b;

    /* renamed from: c */
    private final C6619c f11584c;

    /* renamed from: d */
    private final C4267h f11585d;

    /* renamed from: e */
    private final C6618b f11586e;

    /* renamed from: f */
    private final C6068f f11587f;

    /* renamed from: g */
    private final Object f11588g;

    /* renamed from: h */
    private final ExecutorService f11589h;

    /* renamed from: i */
    private final ExecutorService f11590i;

    /* renamed from: j */
    private String f11591j;

    /* renamed from: k */
    private Set<InterfaceC6411a> f11592k;

    /* renamed from: l */
    private final List<InterfaceC4266g> f11593l;

    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.c$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC4260a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f11594a = new AtomicInteger(1);

        ThreadFactoryC4260a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f11594a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.c$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4261b {

        /* renamed from: a */
        static final /* synthetic */ int[] f11595a;

        /* renamed from: b */
        static final /* synthetic */ int[] f11596b;

        static {
            int[] iArr = new int[AbstractC7024f.EnumC7026b.values().length];
            f11596b = iArr;
            try {
                iArr[AbstractC7024f.EnumC7026b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11596b[AbstractC7024f.EnumC7026b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11596b[AbstractC7024f.EnumC7026b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC7020d.EnumC7022b.values().length];
            f11595a = iArr2;
            try {
                iArr2[AbstractC7020d.EnumC7022b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11595a[AbstractC7020d.EnumC7022b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4259c(C4175c c4175c, InterfaceC5882b<InterfaceC8592i> interfaceC5882b, InterfaceC5882b<InterfaceC5439f> interfaceC5882b2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f11581n), c4175c, new C7019c(c4175c.m28441h(), interfaceC5882b, interfaceC5882b2), new C6619c(c4175c), C4267h.m28135c(), new C6618b(c4175c), new C6068f());
    }

    /* renamed from: A */
    private void m28175A(AbstractC6621d abstractC6621d) {
        synchronized (this.f11588g) {
            Iterator<InterfaceC4266g> it = this.f11593l.iterator();
            while (it.hasNext()) {
                if (it.next().mo28139a(abstractC6621d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: B */
    private synchronized void m28174B(String str) {
        this.f11591j = str;
    }

    /* renamed from: C */
    private synchronized void m28173C(AbstractC6621d abstractC6621d, AbstractC6621d abstractC6621d2) {
        if (this.f11592k.size() != 0 && !abstractC6621d.mo20468d().equals(abstractC6621d2.mo20468d())) {
            for (InterfaceC6411a interfaceC6411a : this.f11592k) {
                interfaceC6411a.m21015a(abstractC6621d2.mo20468d());
            }
        }
    }

    /* renamed from: e */
    private AbstractC3419d<AbstractC4264f> m28169e() {
        C3421e c3421e = new C3421e();
        m28167g(new C4262d(this.f11585d, c3421e));
        return c3421e.m30802a();
    }

    /* renamed from: f */
    private AbstractC3419d<String> m28168f() {
        C3421e c3421e = new C3421e();
        m28167g(new C4263e(c3421e));
        return c3421e.m30802a();
    }

    /* renamed from: g */
    private void m28167g(InterfaceC4266g interfaceC4266g) {
        synchronized (this.f11588g) {
            this.f11593l.add(interfaceC4266g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m28154t(boolean r3) {
        /*
            r2 = this;
            ka.d r0 = r2.m28158p()
            boolean r1 = r0.m20463i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.m20460l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.h r3 = r2.f11585d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            boolean r3 = r3.m28132f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            ka.d r3 = r2.m28164j(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            goto L26
        L22:
            ka.d r3 = r2.m28149y(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
        L26:
            r2.m28155s(r3)
            r2.m28173C(r0, r3)
            boolean r0 = r3.m20461k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.mo20468d()
            r2.m28174B(r0)
        L39:
            boolean r0 = r3.m20463i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.EnumC4254a.BAD_CONFIG
            r3.<init>(r0)
            r2.m28148z(r3)
            goto L5e
        L4a:
            boolean r0 = r3.m20462j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m28148z(r3)
            goto L5e
        L5b:
            r2.m28175A(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.m28148z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C4259c.m28154t(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m28152v(final boolean z) {
        AbstractC6621d m28157q = m28157q();
        if (z) {
            m28157q = m28157q.m20456p();
        }
        m28175A(m28157q);
        this.f11590i.execute(new Runnable() { // from class: ia.b
            @Override // java.lang.Runnable
            public final void run() {
                C4259c.this.m28154t(z);
            }
        });
    }

    /* renamed from: j */
    private AbstractC6621d m28164j(AbstractC6621d abstractC6621d) throws FirebaseInstallationsException {
        AbstractC7024f m19594e = this.f11583b.m19594e(m28163k(), abstractC6621d.mo20468d(), m28156r(), abstractC6621d.mo20466f());
        int i = C4261b.f11596b[m19594e.mo19560b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m28174B(null);
                    return abstractC6621d.m20454r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC4254a.UNAVAILABLE);
            }
            return abstractC6621d.m20455q("BAD CONFIG");
        }
        return abstractC6621d.m20457o(m19594e.mo19559c(), m19594e.mo19558d(), this.f11585d.m28136b());
    }

    /* renamed from: m */
    private synchronized String m28161m() {
        return this.f11591j;
    }

    /* renamed from: n */
    public static C4259c m28160n() {
        return m28159o(C4175c.m28440i());
    }

    /* renamed from: o */
    public static C4259c m28159o(C4175c c4175c) {
        C2597i.m33084b(c4175c != null, "Null is not a valid value of FirebaseApp.");
        return (C4259c) c4175c.m28442g(InterfaceC6066d.class);
    }

    /* renamed from: p */
    private AbstractC6621d m28158p() {
        AbstractC6621d m20472c;
        synchronized (f11580m) {
            C4258b m28177a = C4258b.m28177a(this.f11582a.m28441h(), "generatefid.lock");
            m20472c = this.f11584c.m20472c();
            if (m28177a != null) {
                m28177a.m28176b();
            }
        }
        return m20472c;
    }

    /* renamed from: q */
    private AbstractC6621d m28157q() {
        AbstractC6621d m20472c;
        synchronized (f11580m) {
            C4258b m28177a = C4258b.m28177a(this.f11582a.m28441h(), "generatefid.lock");
            m20472c = this.f11584c.m20472c();
            if (m20472c.m20462j()) {
                m20472c = this.f11584c.m20474a(m20472c.m20452t(m28150x(m20472c)));
            }
            if (m28177a != null) {
                m28177a.m28176b();
            }
        }
        return m20472c;
    }

    /* renamed from: s */
    private void m28155s(AbstractC6621d abstractC6621d) {
        synchronized (f11580m) {
            C4258b m28177a = C4258b.m28177a(this.f11582a.m28441h(), "generatefid.lock");
            this.f11584c.m20474a(abstractC6621d);
            if (m28177a != null) {
                m28177a.m28176b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m28153u() {
        m28152v(false);
    }

    /* renamed from: w */
    private void m28151w() {
        C2597i.m33079g(m28162l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2597i.m33079g(m28156r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2597i.m33079g(m28163k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2597i.m33084b(C4267h.m28130h(m28162l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2597i.m33084b(C4267h.m28131g(m28163k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: x */
    private String m28150x(AbstractC6621d abstractC6621d) {
        if ((!this.f11582a.m28439j().equals("CHIME_ANDROID_SDK") && !this.f11582a.m28431r()) || !abstractC6621d.m20459m()) {
            return this.f11587f.m22289a();
        }
        String m20478f = this.f11586e.m20478f();
        return TextUtils.isEmpty(m20478f) ? this.f11587f.m22289a() : m20478f;
    }

    /* renamed from: y */
    private AbstractC6621d m28149y(AbstractC6621d abstractC6621d) throws FirebaseInstallationsException {
        AbstractC7020d m19595d = this.f11583b.m19595d(m28163k(), abstractC6621d.mo20468d(), m28156r(), m28162l(), (abstractC6621d.mo20468d() == null || abstractC6621d.mo20468d().length() != 11) ? null : this.f11586e.m20475i());
        int i = C4261b.f11595a[m19595d.mo19575e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return abstractC6621d.m20455q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC4254a.UNAVAILABLE);
        }
        return abstractC6621d.m20453s(m19595d.mo19577c(), m19595d.mo19576d(), this.f11585d.m28136b(), m19595d.mo19578b().mo19559c(), m19595d.mo19578b().mo19558d());
    }

    /* renamed from: z */
    private void m28148z(Exception exc) {
        synchronized (this.f11588g) {
            Iterator<InterfaceC4266g> it = this.f11593l.iterator();
            while (it.hasNext()) {
                if (it.next().mo28138b(exc)) {
                    it.remove();
                }
            }
        }
    }

    @Override // p158ia.InterfaceC6066d
    /* renamed from: a */
    public AbstractC3419d<AbstractC4264f> mo22290a(final boolean z) {
        m28151w();
        AbstractC3419d<AbstractC4264f> m28169e = m28169e();
        this.f11589h.execute(new Runnable() { // from class: ia.c
            @Override // java.lang.Runnable
            public final void run() {
                C4259c.this.m28152v(z);
            }
        });
        return m28169e;
    }

    @Override // p158ia.InterfaceC6066d
    public AbstractC3419d<String> getId() {
        m28151w();
        String m28161m = m28161m();
        if (m28161m != null) {
            return C3425g.m30765e(m28161m);
        }
        AbstractC3419d<String> m28168f = m28168f();
        this.f11589h.execute(new Runnable() { // from class: ia.a
            @Override // java.lang.Runnable
            public final void run() {
                C4259c.this.m28153u();
            }
        });
        return m28168f;
    }

    /* renamed from: k */
    String m28163k() {
        return this.f11582a.m28438k().m28182b();
    }

    /* renamed from: l */
    String m28162l() {
        return this.f11582a.m28438k().m28181c();
    }

    /* renamed from: r */
    String m28156r() {
        return this.f11582a.m28438k().m28179e();
    }

    C4259c(ExecutorService executorService, C4175c c4175c, C7019c c7019c, C6619c c6619c, C4267h c4267h, C6618b c6618b, C6068f c6068f) {
        this.f11588g = new Object();
        this.f11592k = new HashSet();
        this.f11593l = new ArrayList();
        this.f11582a = c4175c;
        this.f11583b = c7019c;
        this.f11584c = c6619c;
        this.f11585d = c4267h;
        this.f11586e = c6618b;
        this.f11587f = c6068f;
        this.f11589h = executorService;
        this.f11590i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f11581n);
    }
}
