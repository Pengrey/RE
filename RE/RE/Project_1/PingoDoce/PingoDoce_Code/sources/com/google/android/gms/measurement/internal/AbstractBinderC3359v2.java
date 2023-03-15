package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.BinderC2916p0;
import com.google.android.gms.internal.measurement.C2932q0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.v2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3359v2 extends BinderC2916p0 implements InterfaceC3369w2 {
    public AbstractBinderC3359v2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2916p0
    /* renamed from: s */
    protected final boolean mo30936s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo30914j1((zzau) C2932q0.m32199a(parcel, zzau.CREATOR), (zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo30926I0((zzks) C2932q0.m32199a(parcel, zzks.CREATOR), (zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                mo30915h1((zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo30918Z((zzau) C2932q0.m32199a(parcel, zzau.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo30910x1((zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List mo30919S0 = mo30919S0((zzp) C2932q0.m32199a(parcel, zzp.CREATOR), C2932q0.m32194f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30919S0);
                return true;
            case 9:
                byte[] mo30909z1 = mo30909z1((zzau) C2932q0.m32199a(parcel, zzau.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(mo30909z1);
                return true;
            case 10:
                mo30924M(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String mo30911w0 = mo30911w0((zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(mo30911w0);
                return true;
            case 12:
                mo30917a0((zzab) C2932q0.m32199a(parcel, zzab.CREATOR), (zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo30923M0((zzab) C2932q0.m32199a(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List mo30920R = mo30920R(parcel.readString(), parcel.readString(), C2932q0.m32194f(parcel), (zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30920R);
                return true;
            case 15:
                List mo30916e0 = mo30916e0(parcel.readString(), parcel.readString(), parcel.readString(), C2932q0.m32194f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30916e0);
                return true;
            case 16:
                List mo30912q1 = mo30912q1(parcel.readString(), parcel.readString(), (zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30912q1);
                return true;
            case 17:
                List mo30922N0 = mo30922N0(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(mo30922N0);
                return true;
            case 18:
                mo30913o0((zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo30921Q((Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR), (zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                mo30925L((zzp) C2932q0.m32199a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
