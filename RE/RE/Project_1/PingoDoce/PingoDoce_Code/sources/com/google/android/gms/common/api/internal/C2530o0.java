package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* loaded from: classes.dex */
public final class C2530o0 extends BroadcastReceiver {

    /* renamed from: a */
    Context f7317a;

    /* renamed from: b */
    private final AbstractC2527n0 f7318b;

    public C2530o0(AbstractC2527n0 abstractC2527n0) {
        this.f7318b = abstractC2527n0;
    }

    /* renamed from: a */
    public final void m33310a(Context context) {
        this.f7317a = context;
    }

    /* renamed from: b */
    public final synchronized void m33309b() {
        Context context = this.f7317a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f7317a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f7318b.mo33282a();
            m33309b();
        }
    }
}
