package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.InterfaceC2440a;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C2444d();

    /* renamed from: w */
    Messenger f7137w;

    /* renamed from: x */
    InterfaceC2440a f7138x;

    public zzd(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f7137w = new Messenger(iBinder);
        } else {
            this.f7138x = new InterfaceC2440a.C2441a(iBinder);
        }
    }

    /* renamed from: a */
    public final IBinder m33526a() {
        Messenger messenger = this.f7137w;
        return messenger != null ? messenger.getBinder() : this.f7138x.asBinder();
    }

    /* renamed from: b */
    public final void m33525b(Message message) throws RemoteException {
        Messenger messenger = this.f7137w;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f7138x.mo33558q0(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m33526a().equals(((zzd) obj).m33526a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m33526a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f7137w;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f7138x.asBinder());
        }
    }
}
