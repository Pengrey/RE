package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C3973l;

/* renamed from: com.google.android.play.core.assetpacks.k */
/* loaded from: classes.dex */
final class BinderC3864k extends BinderC3860j<ParcelFileDescriptor> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3864k(C3880o c3880o, C3973l<ParcelFileDescriptor> c3973l) {
        super(c3880o, c3973l);
    }

    @Override // com.google.android.play.core.assetpacks.BinderC3860j, com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: D1 */
    public final void mo28547D1(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo28547D1(bundle, bundle2);
        this.f10995a.m28498e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
