package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.y */
/* loaded from: classes.dex */
public final class ServiceConnectionC2616y implements ServiceConnection {

    /* renamed from: a */
    private final int f7525a;

    /* renamed from: b */
    final /* synthetic */ AbstractC2576b f7526b;

    public ServiceConnectionC2616y(AbstractC2576b abstractC2576b, int i) {
        this.f7526b = abstractC2576b;
        this.f7525a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC2595h c2608q;
        AbstractC2576b abstractC2576b = this.f7526b;
        if (iBinder == null) {
            AbstractC2576b.m33156d0(abstractC2576b, 16);
            return;
        }
        obj = abstractC2576b.f7451h;
        synchronized (obj) {
            AbstractC2576b abstractC2576b2 = this.f7526b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2595h)) {
                c2608q = (InterfaceC2595h) queryLocalInterface;
            } else {
                c2608q = new C2608q(iBinder);
            }
            abstractC2576b2.f7452i = c2608q;
        }
        this.f7526b.m33154e0(0, null, this.f7525a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f7526b.f7451h;
        synchronized (obj) {
            this.f7526b.f7452i = null;
        }
        Handler handler = this.f7526b.f7449f;
        handler.sendMessage(handler.obtainMessage(6, this.f7525a, 1));
    }
}
