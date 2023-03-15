package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2964s0 extends BinderC2916p0 implements InterfaceC2980t0 {
    /* renamed from: y */
    public static InterfaceC2980t0 m32133y(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof InterfaceC2980t0 ? (InterfaceC2980t0) queryLocalInterface : new C2948r0(iBinder);
    }
}
