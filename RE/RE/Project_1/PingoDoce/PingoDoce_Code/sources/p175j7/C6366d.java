package p175j7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: j7.d */
/* loaded from: classes.dex */
public final class C6366d extends C6363a implements InterfaceC6368f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6366d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p175j7.InterfaceC6368f
    /* renamed from: a */
    public final String mo21127a() throws RemoteException {
        Parcel m21131y = m21131y(1, m21132s());
        String readString = m21131y.readString();
        m21131y.recycle();
        return readString;
    }

    @Override // p175j7.InterfaceC6368f
    /* renamed from: u0 */
    public final boolean mo21126u0(boolean z) throws RemoteException {
        Parcel m21132s = m21132s();
        C6365c.m21130a(m21132s, true);
        Parcel m21131y = m21131y(2, m21132s);
        boolean m21129b = C6365c.m21129b(m21131y);
        m21131y.recycle();
        return m21129b;
    }
}
