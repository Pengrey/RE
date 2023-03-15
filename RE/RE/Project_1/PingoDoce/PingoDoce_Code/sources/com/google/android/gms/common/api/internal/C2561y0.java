package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.internal.C2525n;
import com.google.android.gms.tasks.C3421e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.y0 */
/* loaded from: classes.dex */
public final class C2561y0 extends AbstractC2522m {

    /* renamed from: e */
    final /* synthetic */ C2525n.C2526a f7374e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2561y0(C2525n.C2526a c2526a, C2508i c2508i, Feature[] featureArr, boolean z, int i) {
        super(c2508i, featureArr, z, i);
        this.f7374e = c2526a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC2522m
    /* renamed from: d */
    public final void mo33252d(C2461a.InterfaceC2463b interfaceC2463b, C3421e<Void> c3421e) throws RemoteException {
        InterfaceC2529o interfaceC2529o;
        interfaceC2529o = this.f7374e.f7307a;
        interfaceC2529o.mo19090a(interfaceC2463b, c3421e);
    }
}
