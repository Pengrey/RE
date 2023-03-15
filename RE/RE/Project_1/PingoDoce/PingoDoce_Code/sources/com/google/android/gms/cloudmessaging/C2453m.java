package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.m */
/* loaded from: classes.dex */
final class C2453m {

    /* renamed from: a */
    private final Messenger f7122a;

    /* renamed from: b */
    private final zzd f7123b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2453m(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f7122a = new Messenger(iBinder);
            this.f7123b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f7123b = new zzd(iBinder);
            this.f7122a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m33540a(Message message) throws RemoteException {
        Messenger messenger = this.f7122a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f7123b;
        if (zzdVar != null) {
            zzdVar.m33525b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
