package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC2576b;
import p292p7.HandlerC8448e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.v */
/* loaded from: classes.dex */
public final class HandlerC2613v extends HandlerC8448e {

    /* renamed from: a */
    final /* synthetic */ AbstractC2576b f7519a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2613v(AbstractC2576b abstractC2576b, Looper looper) {
        super(looper);
        this.f7519a = abstractC2576b;
    }

    /* renamed from: a */
    private static final void m33026a(Message message) {
        AbstractC2614w abstractC2614w = (AbstractC2614w) message.obj;
        abstractC2614w.mo33023b();
        abstractC2614w.m33020e();
    }

    /* renamed from: b */
    private static final boolean m33025b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC2576b.InterfaceC2577a interfaceC2577a;
        AbstractC2576b.InterfaceC2577a interfaceC2577a2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z;
        if (this.f7519a.f7466w.get() != message.arg1) {
            if (m33025b(message)) {
                m33026a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i != 1 && i != 7 && ((i != 4 || this.f7519a.m33141t()) && message.what != 5)) || this.f7519a.m33149i()) {
            int i2 = message.what;
            if (i2 == 4) {
                this.f7519a.f7463t = new ConnectionResult(message.arg2);
                if (AbstractC2576b.m33150h0(this.f7519a)) {
                    AbstractC2576b abstractC2576b = this.f7519a;
                    z = abstractC2576b.f7464u;
                    if (!z) {
                        abstractC2576b.m33148i0(3, null);
                        return;
                    }
                }
                AbstractC2576b abstractC2576b2 = this.f7519a;
                connectionResult2 = abstractC2576b2.f7463t;
                ConnectionResult connectionResult3 = connectionResult2 != null ? abstractC2576b2.f7463t : new ConnectionResult(8);
                this.f7519a.f7453j.mo33137a(connectionResult3);
                this.f7519a.m33176L(connectionResult3);
                return;
            } else if (i2 == 5) {
                AbstractC2576b abstractC2576b3 = this.f7519a;
                connectionResult = abstractC2576b3.f7463t;
                ConnectionResult connectionResult4 = connectionResult != null ? abstractC2576b3.f7463t : new ConnectionResult(8);
                this.f7519a.f7453j.mo33137a(connectionResult4);
                this.f7519a.m33176L(connectionResult4);
                return;
            } else if (i2 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                this.f7519a.f7453j.mo33137a(connectionResult5);
                this.f7519a.m33176L(connectionResult5);
                return;
            } else if (i2 == 6) {
                this.f7519a.m33148i0(5, null);
                AbstractC2576b abstractC2576b4 = this.f7519a;
                interfaceC2577a = abstractC2576b4.f7458o;
                if (interfaceC2577a != null) {
                    interfaceC2577a2 = abstractC2576b4.f7458o;
                    interfaceC2577a2.mo30929s(message.arg2);
                }
                this.f7519a.m33175M(message.arg2);
                AbstractC2576b.m33151g0(this.f7519a, 5, 1, null);
                return;
            } else if (i2 == 2 && !this.f7519a.m33160b()) {
                m33026a(message);
                return;
            } else if (m33025b(message)) {
                ((AbstractC2614w) message.obj).m33022c();
                return;
            } else {
                int i3 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i3);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
                return;
            }
        }
        m33026a(message);
    }
}
