package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import p484z6.C13698a0;
import p484z6.C13700b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.e0 */
/* loaded from: classes.dex */
public final class C2589e0 implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C2592f0 f7496a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2589e0(C2592f0 c2592f0, C13700b0 c13700b0) {
        this.f7496a = c2592f0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.f7496a.f7497f;
            synchronized (hashMap) {
                C13698a0 c13698a0 = (C13698a0) message.obj;
                hashMap2 = this.f7496a.f7497f;
                ServiceConnectionC2587d0 serviceConnectionC2587d0 = (ServiceConnectionC2587d0) hashMap2.get(c13698a0);
                if (serviceConnectionC2587d0 != null && serviceConnectionC2587d0.m33103i()) {
                    if (serviceConnectionC2587d0.m33102j()) {
                        serviceConnectionC2587d0.m33105g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f7496a.f7497f;
                    hashMap3.remove(c13698a0);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            hashMap4 = this.f7496a.f7497f;
            synchronized (hashMap4) {
                C13698a0 c13698a02 = (C13698a0) message.obj;
                hashMap5 = this.f7496a.f7497f;
                ServiceConnectionC2587d0 serviceConnectionC2587d02 = (ServiceConnectionC2587d0) hashMap5.get(c13698a02);
                if (serviceConnectionC2587d02 != null && serviceConnectionC2587d02.m33111a() == 3) {
                    String valueOf = String.valueOf(c13698a02);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName m33110b = serviceConnectionC2587d02.m33110b();
                    if (m33110b == null) {
                        m33110b = c13698a02.m578b();
                    }
                    if (m33110b == null) {
                        String m576d = c13698a02.m576d();
                        C2597i.m33076j(m576d);
                        m33110b = new ComponentName(m576d, "unknown");
                    }
                    serviceConnectionC2587d02.onServiceDisconnected(m33110b);
                }
            }
            return true;
        }
    }
}
