package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p010a9.C0092b;
import p031b9.C1844a;
import p031b9.InterfaceC1864u;
import p045c9.AbstractC2098c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.t */
/* loaded from: classes.dex */
public final class C3900t extends AbstractC2098c<AssetPackState> {

    /* renamed from: g */
    private final C3862j1 f11141g;

    /* renamed from: h */
    private final C3897s0 f11142h;

    /* renamed from: i */
    private final InterfaceC1864u<InterfaceC3833c3> f11143i;

    /* renamed from: j */
    private final C3861j0 f11144j;

    /* renamed from: k */
    private final C3909v0 f11145k;

    /* renamed from: l */
    private final C0092b f11146l;

    /* renamed from: m */
    private final InterfaceC1864u<Executor> f11147m;

    /* renamed from: n */
    private final InterfaceC1864u<Executor> f11148n;

    /* renamed from: o */
    private final Handler f11149o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3900t(Context context, C3862j1 c3862j1, C3897s0 c3897s0, InterfaceC1864u<InterfaceC3833c3> interfaceC1864u, C3909v0 c3909v0, C3861j0 c3861j0, C0092b c0092b, InterfaceC1864u<Executor> interfaceC1864u2, InterfaceC1864u<Executor> interfaceC1864u3) {
        super(new C1844a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f11149o = new Handler(Looper.getMainLooper());
        this.f11141g = c3862j1;
        this.f11142h = c3897s0;
        this.f11143i = interfaceC1864u;
        this.f11145k = c3909v0;
        this.f11144j = c3861j0;
        this.f11146l = c0092b;
        this.f11147m = interfaceC1864u2;
        this.f11148n = interfaceC1864u3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045c9.AbstractC2098c
    /* renamed from: a */
    public final void mo28641a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f6080a.m35278e("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f6080a.m35278e("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundleExtra2 != null) {
            this.f11146l.m41968a(bundleExtra2);
        }
        final AssetPackState m28769a = AssetPackState.m28769a(bundleExtra, stringArrayList.get(0), this.f11145k, C3908v.f11190a);
        this.f6080a.m35280c("ListenerRegistryBroadcastReceiver.onReceive: %s", m28769a);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f11144j.m28733a(pendingIntent);
        }
        this.f11148n.m35248c().execute(new Runnable(this, bundleExtra, m28769a) { // from class: com.google.android.play.core.assetpacks.r

            /* renamed from: w */
            private final C3900t f11110w;

            /* renamed from: x */
            private final Bundle f11111x;

            /* renamed from: y */
            private final AssetPackState f11112y;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11110w = this;
                this.f11111x = bundleExtra;
                this.f11112y = m28769a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11110w.m28639g(this.f11111x, this.f11112y);
            }
        });
        this.f11147m.m35248c().execute(new Runnable(this, bundleExtra) { // from class: com.google.android.play.core.assetpacks.s

            /* renamed from: w */
            private final C3900t f11122w;

            /* renamed from: x */
            private final Bundle f11123x;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11122w = this;
                this.f11123x = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11122w.m28640f(this.f11123x);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m28640f(Bundle bundle) {
        if (this.f11141g.m28728e(bundle)) {
            this.f11142h.m28643a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m28639g(Bundle bundle, AssetPackState assetPackState) {
        if (this.f11141g.m28724i(bundle)) {
            m28638h(assetPackState);
            this.f11143i.m35248c().mo28651c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m28638h(final AssetPackState assetPackState) {
        this.f11149o.post(new Runnable(this, assetPackState) { // from class: com.google.android.play.core.assetpacks.q

            /* renamed from: w */
            private final C3900t f11101w;

            /* renamed from: x */
            private final AssetPackState f11102x;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11101w = this;
                this.f11102x = assetPackState;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11101w.m34693b(this.f11102x);
            }
        });
    }
}
