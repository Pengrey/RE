package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p058d7.C4747a;
import p292p7.HandlerC8448e;
import p484z6.C13698a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.f0 */
/* loaded from: classes.dex */
public final class C2592f0 extends AbstractC2588e {
    @GuardedBy("connectionStatus")

    /* renamed from: f */
    private final HashMap<C13698a0, ServiceConnectionC2587d0> f7497f = new HashMap<>();

    /* renamed from: g */
    private final Context f7498g;

    /* renamed from: h */
    private volatile Handler f7499h;

    /* renamed from: i */
    private final C2589e0 f7500i;

    /* renamed from: j */
    private final C4747a f7501j;

    /* renamed from: k */
    private final long f7502k;

    /* renamed from: l */
    private final long f7503l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2592f0(Context context, Looper looper) {
        C2589e0 c2589e0 = new C2589e0(this, null);
        this.f7500i = c2589e0;
        this.f7498g = context.getApplicationContext();
        this.f7499h = new HandlerC8448e(looper, c2589e0);
        this.f7501j = C4747a.m26711b();
        this.f7502k = 5000L;
        this.f7503l = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2588e
    /* renamed from: d */
    protected final void mo33096d(C13698a0 c13698a0, ServiceConnection serviceConnection, String str) {
        C2597i.m33075k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f7497f) {
            ServiceConnectionC2587d0 serviceConnectionC2587d0 = this.f7497f.get(c13698a0);
            if (serviceConnectionC2587d0 != null) {
                if (serviceConnectionC2587d0.m33104h(serviceConnection)) {
                    serviceConnectionC2587d0.m33106f(serviceConnection, str);
                    if (serviceConnectionC2587d0.m33103i()) {
                        this.f7499h.sendMessageDelayed(this.f7499h.obtainMessage(0, c13698a0), this.f7502k);
                    }
                } else {
                    String obj = c13698a0.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                String obj2 = c13698a0.toString();
                StringBuilder sb3 = new StringBuilder(obj2.length() + 50);
                sb3.append("Nonexistent connection status for service config: ");
                sb3.append(obj2);
                throw new IllegalStateException(sb3.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2588e
    /* renamed from: f */
    public final boolean mo33095f(C13698a0 c13698a0, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m33102j;
        C2597i.m33075k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f7497f) {
            ServiceConnectionC2587d0 serviceConnectionC2587d0 = this.f7497f.get(c13698a0);
            if (serviceConnectionC2587d0 == null) {
                serviceConnectionC2587d0 = new ServiceConnectionC2587d0(this, c13698a0);
                serviceConnectionC2587d0.m33108d(serviceConnection, serviceConnection, str);
                serviceConnectionC2587d0.m33107e(str, executor);
                this.f7497f.put(c13698a0, serviceConnectionC2587d0);
            } else {
                this.f7499h.removeMessages(0, c13698a0);
                if (!serviceConnectionC2587d0.m33104h(serviceConnection)) {
                    serviceConnectionC2587d0.m33108d(serviceConnection, serviceConnection, str);
                    int m33111a = serviceConnectionC2587d0.m33111a();
                    if (m33111a == 1) {
                        serviceConnection.onServiceConnected(serviceConnectionC2587d0.m33110b(), serviceConnectionC2587d0.m33109c());
                    } else if (m33111a == 2) {
                        serviceConnectionC2587d0.m33107e(str, executor);
                    }
                } else {
                    String obj = c13698a0.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            m33102j = serviceConnectionC2587d0.m33102j();
        }
        return m33102j;
    }
}
