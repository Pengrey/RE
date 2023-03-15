package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p292p7.BinderC8445b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.s */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2610s extends BinderC8445b implements InterfaceC2611t {
    /* renamed from: y */
    public static InterfaceC2611t m33060y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC2611t ? (InterfaceC2611t) queryLocalInterface : new C2609r(iBinder);
    }
}
