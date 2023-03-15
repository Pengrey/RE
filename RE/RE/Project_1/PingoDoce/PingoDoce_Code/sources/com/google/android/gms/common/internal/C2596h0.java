package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p292p7.C8444a;
import p292p7.C8446c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.h0 */
/* loaded from: classes.dex */
public final class C2596h0 extends C8444a implements InterfaceC2590f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2596h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2590f
    public final Account zzb() throws RemoteException {
        Parcel m15399s = m15399s(2, m15398y());
        Account account = (Account) C8446c.m15396a(m15399s, Account.CREATOR);
        m15399s.recycle();
        return account;
    }
}
