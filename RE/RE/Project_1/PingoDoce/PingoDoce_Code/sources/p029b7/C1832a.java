package p029b7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import p251n7.C7682a;
import p251n7.C7684c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: b7.a */
/* loaded from: classes.dex */
public final class C1832a extends C7682a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1832a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: S1 */
    public final void m35283S1(TelemetryData telemetryData) throws RemoteException {
        Parcel m17724s = m17724s();
        C7684c.m17720b(m17724s, telemetryData);
        m17725H(1, m17724s);
    }
}
