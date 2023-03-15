package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p031b9.C1869z;

/* renamed from: com.google.android.play.core.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3934c extends BinderC3941j implements InterfaceC3935d {
    public AbstractBinderC3934c() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.internal.BinderC3941j
    /* renamed from: s */
    protected final boolean mo28536s(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo28520i((Bundle) C1869z.m35242a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
