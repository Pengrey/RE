package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.AbstractBinderC2656c;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.tasks.C3421e;
import p484z6.C13697a;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.h */
/* loaded from: classes.dex */
final class BinderC3094h extends AbstractBinderC2656c {

    /* renamed from: a */
    final /* synthetic */ C3421e f8199a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3094h(C3084a c3084a, C3421e c3421e) {
        this.f8199a = c3421e;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC2657d
    /* renamed from: a */
    public final void mo31615a() {
    }

    @Override // com.google.android.gms.internal.location.InterfaceC2657d
    /* renamed from: u1 */
    public final void mo31614u1(zzaa zzaaVar) throws RemoteException {
        Status status = zzaaVar.getStatus();
        if (status == null) {
            this.f8199a.m30799d(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.m33508t() == 0) {
            this.f8199a.m30800c(Boolean.TRUE);
        } else {
            this.f8199a.m30799d(C13697a.m580a(status));
        }
    }
}
