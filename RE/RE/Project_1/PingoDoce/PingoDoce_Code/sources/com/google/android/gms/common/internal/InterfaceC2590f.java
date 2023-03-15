package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p292p7.BinderC8445b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes.dex */
public interface InterfaceC2590f extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.f$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC2591a extends BinderC8445b implements InterfaceC2590f {
        /* renamed from: y */
        public static InterfaceC2590f m33097y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC2590f ? (InterfaceC2590f) queryLocalInterface : new C2596h0(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
