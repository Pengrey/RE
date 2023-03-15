package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3415b;
import com.google.firebase.C4175c;
import com.google.firebase.crashlytics.internal.common.C4184a;
import com.google.firebase.crashlytics.internal.common.C4196g;
import com.google.firebase.crashlytics.internal.common.C4221l;
import com.google.firebase.crashlytics.internal.common.C4232r;
import com.google.firebase.crashlytics.internal.common.C4234t;
import com.google.firebase.crashlytics.internal.common.C4239v;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p136ha.InterfaceC5880a;
import p157i9.InterfaceC6056a;
import p158ia.InterfaceC6066d;
import p199k9.C6612d;
import p219l9.C7005d;
import p219l9.C7008e;
import p219l9.C7011f;
import p219l9.InterfaceC7002a;
import p333r9.C9828b;
import p355s9.C10098f;
import p382u9.C10855d;

/* renamed from: com.google.firebase.crashlytics.a */
/* loaded from: classes.dex */
public class C4181a {

    /* renamed from: a */
    final C4221l f11415a;

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.a$a */
    /* loaded from: classes.dex */
    class C4182a implements InterfaceC3415b<Void, Object> {
        C4182a() {
        }

        @Override // com.google.android.gms.tasks.InterfaceC3415b
        /* renamed from: a */
        public Object mo4684a(AbstractC3419d<Void> abstractC3419d) throws Exception {
            if (abstractC3419d.mo30780p()) {
                return null;
            }
            C7011f.m19611f().m19612e("Error fetching settings.", abstractC3419d.mo30785k());
            return null;
        }
    }

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.a$b */
    /* loaded from: classes.dex */
    class CallableC4183b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ boolean f11416a;

        /* renamed from: b */
        final /* synthetic */ C4221l f11417b;

        /* renamed from: c */
        final /* synthetic */ C10855d f11418c;

        CallableC4183b(boolean z, C4221l c4221l, C10855d c10855d) {
            this.f11416a = z;
            this.f11417b = c4221l;
            this.f11418c = c10855d;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void mo28414a() throws Exception {
            if (this.f11416a) {
                this.f11417b.m28270g(this.f11418c);
                return null;
            }
            return null;
        }
    }

    private C4181a(C4221l c4221l) {
        this.f11415a = c4221l;
    }

    /* renamed from: a */
    public static C4181a m28418a() {
        C4181a c4181a = (C4181a) C4175c.m28440i().m28442g(C4181a.class);
        Objects.requireNonNull(c4181a, "FirebaseCrashlytics component is not present.");
        return c4181a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4181a m28417b(C4175c c4175c, InterfaceC6066d interfaceC6066d, InterfaceC5880a<InterfaceC7002a> interfaceC5880a, InterfaceC5880a<InterfaceC6056a> interfaceC5880a2) {
        Context m28441h = c4175c.m28441h();
        String packageName = m28441h.getPackageName();
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19610g("Initializing Firebase Crashlytics " + C4221l.m28268i() + " for " + packageName);
        C10098f c10098f = new C10098f(m28441h);
        C4232r c4232r = new C4232r(c4175c);
        C4239v c4239v = new C4239v(m28441h, packageName, interfaceC6066d, c4232r);
        C7005d c7005d = new C7005d(interfaceC5880a);
        C6612d c6612d = new C6612d(interfaceC5880a2);
        C4221l c4221l = new C4221l(c4175c, c4239v, c7005d, c4232r, c6612d.m20494e(), c6612d.m20495d(), c10098f, C4234t.m28212c("Crashlytics Exception Handler"));
        String m28181c = c4175c.m28438k().m28181c();
        String m28364n = C4196g.m28364n(m28441h);
        C7011f m19611f2 = C7011f.m19611f();
        m19611f2.m19615b("Mapping file ID is: " + m28364n);
        try {
            C4184a m28413a = C4184a.m28413a(m28441h, c4239v, m28181c, m28364n, new C7008e(m28441h));
            C7011f m19611f3 = C7011f.m19611f();
            m19611f3.m19608i("Installer package name is: " + m28413a.f11421c);
            ExecutorService m28212c = C4234t.m28212c("com.google.firebase.crashlytics.startup");
            C10855d m6860l = C10855d.m6860l(m28441h, m28181c, c4239v, new C9828b(), m28413a.f11423e, m28413a.f11424f, c10098f, c4232r);
            m6860l.m6857o(m28212c).mo30788h(m28212c, new C4182a());
            C3425g.m30767c(m28212c, new CallableC4183b(c4221l.m28262o(m28413a, m6860l), c4221l, m6860l));
            return new C4181a(c4221l);
        } catch (PackageManager.NameNotFoundException e) {
            C7011f.m19611f().m19612e("Error retrieving app package info.", e);
            return null;
        }
    }

    /* renamed from: c */
    public void m28416c(String str) {
        this.f11415a.m28266k(str);
    }

    /* renamed from: d */
    public void m28415d(Throwable th2) {
        if (th2 == null) {
            C7011f.m19611f().m19606k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f11415a.m28265l(th2);
        }
    }
}
