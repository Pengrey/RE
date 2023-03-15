package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC2576b;
import com.google.android.gms.common.internal.InterfaceC2590f;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* loaded from: classes.dex */
public final class C2520l0 implements AbstractC2576b.InterfaceC2579c, InterfaceC2498e1 {

    /* renamed from: a */
    private final C2461a.InterfaceC2470f f7291a;

    /* renamed from: b */
    private final C2485b<?> f7292b;

    /* renamed from: c */
    private InterfaceC2590f f7293c = null;

    /* renamed from: d */
    private Set<Scope> f7294d = null;

    /* renamed from: e */
    private boolean f7295e = false;

    /* renamed from: f */
    final /* synthetic */ C2499f f7296f;

    public C2520l0(C2499f c2499f, C2461a.InterfaceC2470f interfaceC2470f, C2485b<?> c2485b) {
        this.f7296f = c2499f;
        this.f7291a = interfaceC2470f;
        this.f7292b = c2485b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m33326h() {
        InterfaceC2590f interfaceC2590f;
        if (!this.f7295e || (interfaceC2590f = this.f7293c) == null) {
            return;
        }
        this.f7291a.mo33346d(interfaceC2590f, this.f7294d);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b.InterfaceC2579c
    /* renamed from: a */
    public final void mo33137a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f7296f.f7244p;
        handler.post(new RunnableC2517k0(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2498e1
    /* renamed from: b */
    public final void mo33332b(InterfaceC2590f interfaceC2590f, Set<Scope> set) {
        if (interfaceC2590f != null && set != null) {
            this.f7293c = interfaceC2590f;
            this.f7294d = set;
            m33326h();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        mo33331c(new ConnectionResult(4));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2498e1
    /* renamed from: c */
    public final void mo33331c(ConnectionResult connectionResult) {
        Map map;
        map = this.f7296f.f7240l;
        C2506h0 c2506h0 = (C2506h0) map.get(this.f7292b);
        if (c2506h0 != null) {
            c2506h0.m33389I(connectionResult);
        }
    }
}
