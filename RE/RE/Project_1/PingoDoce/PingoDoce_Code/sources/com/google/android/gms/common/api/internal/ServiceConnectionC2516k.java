package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC2576b;
import com.google.android.gms.common.internal.AbstractC2588e;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.InterfaceC2590f;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes.dex */
public final class ServiceConnectionC2516k implements C2461a.InterfaceC2470f, ServiceConnection {

    /* renamed from: a */
    private final String f7279a;

    /* renamed from: b */
    private final String f7280b;

    /* renamed from: c */
    private final ComponentName f7281c;

    /* renamed from: d */
    private final Context f7282d;

    /* renamed from: e */
    private final InterfaceC2496e f7283e;

    /* renamed from: f */
    private final Handler f7284f;

    /* renamed from: g */
    private final InterfaceC2519l f7285g;

    /* renamed from: h */
    private IBinder f7286h;

    /* renamed from: i */
    private boolean f7287i;

    /* renamed from: j */
    private String f7288j;

    /* renamed from: s */
    private final void m33335s() {
        if (Thread.currentThread() != this.f7284f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: t */
    private final void m33334t(String str) {
        String.valueOf(this.f7286h);
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: a */
    public final void mo33348a(AbstractC2576b.InterfaceC2581e interfaceC2581e) {
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: b */
    public final boolean mo33347b() {
        m33335s();
        return this.f7286h != null;
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: c */
    public final Set<Scope> mo33117c() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: d */
    public final void mo33346d(InterfaceC2590f interfaceC2590f, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: e */
    public final void mo33345e(String str) {
        m33335s();
        this.f7288j = str;
        mo32942n();
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: f */
    public final boolean mo33344f() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: i */
    public final boolean mo33343i() {
        m33335s();
        return this.f7287i;
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: j */
    public final Feature[] mo33342j() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: k */
    public final String mo33341k() {
        String str = this.f7279a;
        if (str != null) {
            return str;
        }
        C2597i.m33076j(this.f7281c);
        return this.f7281c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: l */
    public final String mo33340l() {
        return this.f7288j;
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: m */
    public final void mo33339m(AbstractC2576b.InterfaceC2579c interfaceC2579c) {
        m33335s();
        m33334t("Connect started.");
        if (mo33347b()) {
            try {
                mo33345e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f7281c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f7279a).setAction(this.f7280b);
            }
            boolean bindService = this.f7282d.bindService(intent, this, AbstractC2588e.m33101a());
            this.f7287i = bindService;
            if (!bindService) {
                this.f7286h = null;
                this.f7285g.mo33333y(new ConnectionResult(16));
            }
            m33334t("Finished connect.");
        } catch (SecurityException e) {
            this.f7287i = false;
            this.f7286h = null;
            throw e;
        }
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: n */
    public final void mo32942n() {
        m33335s();
        m33334t("Disconnect called.");
        try {
            this.f7282d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f7287i = false;
        this.f7286h = null;
    }

    @Override // com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: o */
    public final boolean mo20508o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f7284f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.u0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2516k.this.m33337q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7284f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.t0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2516k.this.m33338p();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void m33338p() {
        this.f7287i = false;
        this.f7286h = null;
        m33334t("Disconnected.");
        this.f7283e.mo33363s(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m33337q(IBinder iBinder) {
        this.f7287i = false;
        this.f7286h = iBinder;
        m33334t("Connected.");
        this.f7283e.mo33390H(new Bundle());
    }

    /* renamed from: r */
    public final void m33336r(String str) {
    }
}
