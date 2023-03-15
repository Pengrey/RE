package p236m7;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: m7.h */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7141h extends BinderC7138e implements InterfaceC7142i {
    public AbstractBinderC7141h() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // p236m7.BinderC7138e
    /* renamed from: s */
    protected final boolean mo19098s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo19097U0((Status) C7139f.m19101a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
