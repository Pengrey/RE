package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import p217l7.BinderC6995d;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.k */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2433k extends BinderC6995d implements InterfaceC2434l {
    public AbstractBinderC2433k() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p217l7.BinderC6995d
    /* renamed from: s */
    protected final boolean mo19639s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo6885z0();
        } else if (i != 2) {
            return false;
        } else {
            mo6887b0();
        }
        return true;
    }
}
