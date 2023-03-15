package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C3421e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.j1 */
/* loaded from: classes.dex */
public abstract class AbstractC2515j1<T> extends AbstractC2533p0 {

    /* renamed from: b */
    protected final C3421e<T> f7278b;

    public AbstractC2515j1(int i, C3421e<T> c3421e) {
        super(i);
        this.f7278b = c3421e;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: a */
    public final void mo33305a(Status status) {
        this.f7278b.m30799d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: b */
    public final void mo33304b(Exception exc) {
        this.f7278b.m30799d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: c */
    public final void mo33303c(C2506h0<?> c2506h0) throws DeadObjectException {
        try {
            mo33308h(c2506h0);
        } catch (DeadObjectException e) {
            mo33305a(AbstractC2534p1.m33301e(e));
            throw e;
        } catch (RemoteException e2) {
            mo33305a(AbstractC2534p1.m33301e(e2));
        } catch (RuntimeException e3) {
            this.f7278b.m30799d(e3);
        }
    }

    /* renamed from: h */
    protected abstract void mo33308h(C2506h0<?> c2506h0) throws RemoteException;
}
