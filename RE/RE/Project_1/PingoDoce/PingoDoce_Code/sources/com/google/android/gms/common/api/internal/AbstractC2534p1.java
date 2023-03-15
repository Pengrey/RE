package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.p1 */
/* loaded from: classes.dex */
public abstract class AbstractC2534p1 {

    /* renamed from: a */
    public final int f7320a;

    public AbstractC2534p1(int i) {
        this.f7320a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m33301e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo33305a(Status status);

    /* renamed from: b */
    public abstract void mo33304b(Exception exc);

    /* renamed from: c */
    public abstract void mo33303c(C2506h0<?> c2506h0) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo33302d(C2557x c2557x, boolean z);
}
