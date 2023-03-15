package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C2566b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C2597i;
import p301q.C9552b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: classes.dex */
public final class C2560y extends AbstractDialogInterface$OnCancelListenerC2550u1 {

    /* renamed from: B */
    private final C9552b<C2485b<?>> f7372B;

    /* renamed from: C */
    private final C2499f f7373C;

    C2560y(InterfaceC2505h interfaceC2505h, C2499f c2499f, C2566b c2566b) {
        super(interfaceC2505h, c2566b);
        this.f7372B = new C9552b<>();
        this.f7373C = c2499f;
        this.f7200w.mo33245m("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m33254u(Activity activity, C2499f c2499f, C2485b<?> c2485b) {
        InterfaceC2505h m33464c = LifecycleCallback.m33464c(activity);
        C2560y c2560y = (C2560y) m33464c.mo33244q("ConnectionlessLifecycleHelper", C2560y.class);
        if (c2560y == null) {
            c2560y = new C2560y(m33464c, c2499f, C2566b.m33240m());
        }
        C2597i.m33075k(c2485b, "ApiKey cannot be null");
        c2560y.f7372B.add(c2485b);
        c2499f.m33428d(c2560y);
    }

    /* renamed from: v */
    private final void m33253v() {
        if (this.f7372B.isEmpty()) {
            return;
        }
        this.f7373C.m33428d(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo33260h() {
        super.mo33260h();
        m33253v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC2550u1, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo33259j() {
        super.mo33259j();
        m33253v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC2550u1, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo33258k() {
        super.mo33258k();
        this.f7373C.m33427e(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC2550u1
    /* renamed from: m */
    protected final void mo33257m(ConnectionResult connectionResult, int i) {
        this.f7373C.m33432J(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC2550u1
    /* renamed from: n */
    protected final void mo33256n() {
        this.f7373C.m33430b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C9552b<C2485b<?>> m33255t() {
        return this.f7372B;
    }
}
