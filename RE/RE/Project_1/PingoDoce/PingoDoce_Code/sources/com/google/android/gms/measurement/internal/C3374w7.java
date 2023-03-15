package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.InterfaceC2805i1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p058d7.C4747a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* loaded from: classes.dex */
public final class C3374w7 extends AbstractC3380x3 {

    /* renamed from: c */
    private final ServiceConnectionC3364v7 f9070c;

    /* renamed from: d */
    private InterfaceC3369w2 f9071d;

    /* renamed from: e */
    private volatile Boolean f9072e;

    /* renamed from: f */
    private final AbstractC3259m f9073f;

    /* renamed from: g */
    private final C3279n8 f9074g;

    /* renamed from: h */
    private final List f9075h;

    /* renamed from: i */
    private final AbstractC3259m f9076i;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3374w7(C3242k4 c3242k4) {
        super(c3242k4);
        this.f9075h = new ArrayList();
        this.f9074g = new C3279n8(c3242k4.mo31115e());
        this.f9070c = new ServiceConnectionC3364v7(this);
        this.f9073f = new C3190f7(this, c3242k4);
        this.f9076i = new C3212h7(this, c3242k4);
    }

    /* renamed from: C */
    private final zzp m30885C(boolean z) {
        Pair m31030a;
        this.f8410a.mo31114f();
        C3379x2 m31136B = this.f8410a.m31136B();
        String str = null;
        if (z) {
            C3197g3 mo31116d = this.f8410a.mo31116d();
            if (mo31116d.f8410a.m31132F().f8960d != null && (m31030a = mo31116d.f8410a.m31132F().f8960d.m31030a()) != null && m31030a != C3340t3.f8958x) {
                String valueOf = String.valueOf(m31030a.second);
                String str2 = (String) m31030a.first;
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb2.append(valueOf);
                sb2.append(":");
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return m31136B.m30850q(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m30884D() {
        mo30825h();
        this.f8410a.mo31116d().m31328v().m31397b("Processing queued up service tasks", Integer.valueOf(this.f9075h.size()));
        for (Runnable runnable : this.f9075h) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                this.f8410a.mo31116d().m31332r().m31397b("Task exception while flushing queue", e);
            }
        }
        this.f9075h.clear();
        this.f9076i.m31086b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m30883E() {
        mo30825h();
        this.f9074g.m31063b();
        AbstractC3259m abstractC3259m = this.f9073f;
        this.f8410a.m31094z();
        abstractC3259m.m31085d(((Long) C3339t2.f8893K.m31018a(null)).longValue());
    }

    /* renamed from: F */
    private final void m30882F(Runnable runnable) throws IllegalStateException {
        mo30825h();
        if (m30853z()) {
            runnable.run();
            return;
        }
        int size = this.f9075h.size();
        this.f8410a.m31094z();
        if (size >= 1000) {
            this.f8410a.mo31116d().m31332r().m31398a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f9075h.add(runnable);
        this.f9076i.m31085d(60000L);
        m30872P();
    }

    /* renamed from: G */
    private final boolean m30881G() {
        this.f8410a.mo31114f();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m30875M(C3374w7 c3374w7, ComponentName componentName) {
        c3374w7.mo30825h();
        if (c3374w7.f9071d != null) {
            c3374w7.f9071d = null;
            c3374w7.f8410a.mo31116d().m31328v().m31397b("Disconnected from device MeasurementService", componentName);
            c3374w7.mo30825h();
            c3374w7.m30872P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean m30887A() {
        mo30825h();
        m30845i();
        return !m30886B() || this.f8410a.m31124N().m31282o0() >= ((Integer) C3339t2.f8928j0.m31018a(null)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m30886B() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3374w7.m30886B():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean m30878J() {
        return this.f9072e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m30873O() {
        mo30825h();
        m30845i();
        zzp m30885C = m30885C(true);
        this.f8410a.m31135C().m31523r();
        m30882F(new RunnableC3157c7(this, m30885C));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m30872P() {
        mo30825h();
        m30845i();
        if (m30853z()) {
            return;
        }
        if (!m30886B()) {
            if (this.f8410a.m31094z().m31368G()) {
                return;
            }
            this.f8410a.mo31114f();
            List<ResolveInfo> queryIntentServices = this.f8410a.mo31117c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f8410a.mo31117c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context mo31117c = this.f8410a.mo31117c();
                this.f8410a.mo31114f();
                intent.setComponent(new ComponentName(mo31117c, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f9070c.m30932b(intent);
                return;
            }
            this.f8410a.mo31116d().m31332r().m31398a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        this.f9070c.m30931c();
    }

    /* renamed from: Q */
    public final void m30871Q() {
        mo30825h();
        m30845i();
        this.f9070c.m30930d();
        try {
            C4747a.m26711b().m26710c(this.f8410a.mo31117c(), this.f9070c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f9071d = null;
    }

    /* renamed from: R */
    public final void m30870R(InterfaceC2805i1 interfaceC2805i1) {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3146b7(this, m30885C(false), interfaceC2805i1));
    }

    /* renamed from: S */
    public final void m30869S(AtomicReference atomicReference) {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3135a7(this, atomicReference, m30885C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T */
    public final void m30868T(InterfaceC2805i1 interfaceC2805i1, String str, String str2) {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3289o7(this, str, str2, m30885C(false), interfaceC2805i1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public final void m30867U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3278n7(this, atomicReference, null, str2, str3, m30885C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public final void m30866V(InterfaceC2805i1 interfaceC2805i1, String str, String str2, boolean z) {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3383x6(this, str, str2, m30885C(false), z, interfaceC2805i1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public final void m30865W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3300p7(this, atomicReference, null, str2, str3, m30885C(false), z));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3380x3
    /* renamed from: n */
    protected final boolean mo30840n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m30864o(zzau zzauVar, String str) {
        C2597i.m33076j(zzauVar);
        mo30825h();
        m30845i();
        m30881G();
        m30882F(new RunnableC3245k7(this, true, m30885C(true), this.f8410a.m31135C().m31519v(zzauVar), zzauVar, str));
    }

    /* renamed from: p */
    public final void m30863p(InterfaceC2805i1 interfaceC2805i1, zzau zzauVar, String str) {
        mo30825h();
        m30845i();
        if (this.f8410a.m31124N().m31280p0(C2569e.f7391a) != 0) {
            this.f8410a.mo31116d().m31327w().m31398a("Not bundling data. Service unavailable or out of date");
            this.f8410a.m31124N().m31318F(interfaceC2805i1, new byte[0]);
            return;
        }
        m30882F(new RunnableC3201g7(this, zzauVar, str, interfaceC2805i1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m30862q() {
        mo30825h();
        m30845i();
        zzp m30885C = m30885C(false);
        m30881G();
        this.f8410a.m31135C().m31524q();
        m30882F(new RunnableC3403z6(this, m30885C));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m30861r(InterfaceC3369w2 interfaceC3369w2, AbstractSafeParcelable abstractSafeParcelable, zzp zzpVar) {
        int i;
        mo30825h();
        m30845i();
        m30881G();
        this.f8410a.m31094z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List m31525p = this.f8410a.m31135C().m31525p(100);
            if (m31525p != null) {
                arrayList.addAll(m31525p);
                i = m31525p.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzau) {
                    try {
                        interfaceC3369w2.mo30914j1((zzau) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e) {
                        this.f8410a.mo31116d().m31332r().m31397b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzks) {
                    try {
                        interfaceC3369w2.mo30926I0((zzks) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e2) {
                        this.f8410a.mo31116d().m31332r().m31397b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzab) {
                    try {
                        interfaceC3369w2.mo30917a0((zzab) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e3) {
                        this.f8410a.mo31116d().m31332r().m31397b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f8410a.mo31116d().m31332r().m31398a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m30860s(zzab zzabVar) {
        C2597i.m33076j(zzabVar);
        mo30825h();
        m30845i();
        this.f8410a.mo31114f();
        m30882F(new RunnableC3267m7(this, true, m30885C(true), this.f8410a.m31135C().m31520u(zzabVar), new zzab(zzabVar), zzabVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m30859t(boolean z) {
        mo30825h();
        m30845i();
        if (z) {
            m30881G();
            this.f8410a.m31135C().m31524q();
        }
        if (m30887A()) {
            m30882F(new RunnableC3234j7(this, m30885C(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m30858u(C3299p6 c3299p6) {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3168d7(this, c3299p6));
    }

    /* renamed from: v */
    public final void m30857v(Bundle bundle) {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3179e7(this, m30885C(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m30856w() {
        mo30825h();
        m30845i();
        m30882F(new RunnableC3223i7(this, m30885C(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final void m30855x(InterfaceC3369w2 interfaceC3369w2) {
        mo30825h();
        C2597i.m33076j(interfaceC3369w2);
        this.f9071d = interfaceC3369w2;
        m30883E();
        m30884D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m30854y(zzks zzksVar) {
        mo30825h();
        m30845i();
        m30881G();
        m30882F(new RunnableC3393y6(this, m30885C(true), this.f8410a.m31135C().m31518w(zzksVar), zzksVar));
    }

    /* renamed from: z */
    public final boolean m30853z() {
        mo30825h();
        m30845i();
        return this.f9071d != null;
    }
}
