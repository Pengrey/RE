package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.C2461a.InterfaceC2463b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2597i;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC2493d<R extends InterfaceC13123e, A extends C2461a.InterfaceC2463b> extends BasePendingResult<R> {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2493d(C2461a<?> c2461a, AbstractC2475c abstractC2475c) {
        super((AbstractC2475c) C2597i.m33075k(abstractC2475c, "GoogleApiClient must not be null"));
        C2597i.m33075k(c2461a, "Api must not be null");
        c2461a.m33504b();
    }

    /* renamed from: o */
    private void m33443o(RemoteException remoteException) {
        m33442p(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* renamed from: l */
    protected abstract void mo33446l(A a) throws RemoteException;

    /* renamed from: m */
    protected void m33445m(R r) {
    }

    /* renamed from: n */
    public final void m33444n(A a) throws DeadObjectException {
        try {
            mo33446l(a);
        } catch (DeadObjectException e) {
            m33443o(e);
            throw e;
        } catch (RemoteException e2) {
            m33443o(e2);
        }
    }

    /* renamed from: p */
    public final void m33442p(Status status) {
        C2597i.m33084b(!status.m33511D(), "Failed result must not be success");
        R mo1566c = mo1566c(status);
        m33473f(mo1566c);
        m33445m(mo1566c);
    }
}
