package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2583c;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p030b8.C1837a;
import p030b8.C1841e;
import p030b8.InterfaceC1842f;
import p044c8.BinderC2094a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.f1 */
/* loaded from: classes.dex */
public final class BinderC2501f1 extends BinderC2094a implements AbstractC2475c.InterfaceC2476a, AbstractC2475c.InterfaceC2477b {

    /* renamed from: h */
    private static final C2461a.AbstractC2462a<? extends InterfaceC1842f, C1837a> f7247h = C1841e.f5555c;

    /* renamed from: a */
    private final Context f7248a;

    /* renamed from: b */
    private final Handler f7249b;

    /* renamed from: c */
    private final C2461a.AbstractC2462a<? extends InterfaceC1842f, C1837a> f7250c;

    /* renamed from: d */
    private final Set<Scope> f7251d;

    /* renamed from: e */
    private final C2583c f7252e;

    /* renamed from: f */
    private InterfaceC1842f f7253f;

    /* renamed from: g */
    private InterfaceC2498e1 f7254g;

    public BinderC2501f1(Context context, Handler handler, C2583c c2583c) {
        C2461a.AbstractC2462a<? extends InterfaceC1842f, C1837a> abstractC2462a = f7247h;
        this.f7248a = context;
        this.f7249b = handler;
        this.f7252e = (C2583c) C2597i.m33075k(c2583c, "ClientSettings must not be null");
        this.f7251d = c2583c.m33129g();
        this.f7250c = abstractC2462a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U1 */
    public static /* bridge */ /* synthetic */ void m33404U1(BinderC2501f1 binderC2501f1, zak zakVar) {
        ConnectionResult m30809h = zakVar.m30809h();
        if (m30809h.m33524D()) {
            zav zavVar = (zav) C2597i.m33076j(zakVar.m30808t());
            ConnectionResult m33014h = zavVar.m33014h();
            if (!m33014h.m33524D()) {
                String valueOf = String.valueOf(m33014h);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                binderC2501f1.f7254g.mo33331c(m33014h);
                binderC2501f1.f7253f.mo32942n();
                return;
            }
            binderC2501f1.f7254g.mo33332b(zavVar.m33013t(), binderC2501f1.f7251d);
        } else {
            binderC2501f1.f7254g.mo33331c(m30809h);
        }
        binderC2501f1.f7253f.mo32942n();
    }

    @Override // com.google.android.gms.signin.internal.InterfaceC3409d
    /* renamed from: D0 */
    public final void mo30811D0(zak zakVar) {
        this.f7249b.post(new RunnableC2495d1(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2496e
    /* renamed from: H */
    public final void mo33390H(Bundle bundle) {
        this.f7253f.mo30814g(this);
    }

    /* renamed from: V1 */
    public final void m33403V1(InterfaceC2498e1 interfaceC2498e1) {
        InterfaceC1842f interfaceC1842f = this.f7253f;
        if (interfaceC1842f != null) {
            interfaceC1842f.mo32942n();
        }
        this.f7252e.m33125k(Integer.valueOf(System.identityHashCode(this)));
        C2461a.AbstractC2462a<? extends InterfaceC1842f, C1837a> abstractC2462a = this.f7250c;
        Context context = this.f7248a;
        Looper looper = this.f7249b.getLooper();
        C2583c c2583c = this.f7252e;
        this.f7253f = abstractC2462a.mo6033a(context, looper, c2583c, c2583c.m33128h(), this, this);
        this.f7254g = interfaceC2498e1;
        Set<Scope> set = this.f7251d;
        if (set != null && !set.isEmpty()) {
            this.f7253f.mo30812p();
        } else {
            this.f7249b.post(new RunnableC2492c1(this));
        }
    }

    /* renamed from: W1 */
    public final void m33402W1() {
        InterfaceC1842f interfaceC1842f = this.f7253f;
        if (interfaceC1842f != null) {
            interfaceC1842f.mo32942n();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2496e
    /* renamed from: s */
    public final void mo33363s(int i) {
        this.f7253f.mo32942n();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2519l
    /* renamed from: y */
    public final void mo33333y(ConnectionResult connectionResult) {
        this.f7254g.mo33331c(connectionResult);
    }
}
