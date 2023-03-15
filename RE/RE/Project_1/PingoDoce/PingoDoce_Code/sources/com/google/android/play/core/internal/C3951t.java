package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p031b9.C1869z;

/* renamed from: com.google.android.play.core.internal.t */
/* loaded from: classes.dex */
public final class C3951t extends C3940i implements InterfaceC3930b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3951t(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // com.google.android.play.core.internal.InterfaceC3930b
    /* renamed from: J */
    public final void mo28530J(String str, Bundle bundle, InterfaceC3935d interfaceC3935d) throws RemoteException {
        Parcel m28559s = m28559s();
        m28559s.writeString(str);
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35241b(m28559s, interfaceC3935d);
        m28558y(2, m28559s);
    }
}
