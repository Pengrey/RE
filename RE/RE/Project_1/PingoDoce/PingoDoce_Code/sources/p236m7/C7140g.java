package p236m7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: m7.g */
/* loaded from: classes.dex */
public final class C7140g extends C7134a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C7140g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: H */
    public final void m19099H(String str, InterfaceC7142i interfaceC7142i) throws RemoteException {
        Parcel m19103s = m19103s();
        m19103s.writeString(str);
        C7139f.m19100b(m19103s, interfaceC7142i);
        m19102y(2, m19103s);
    }
}
