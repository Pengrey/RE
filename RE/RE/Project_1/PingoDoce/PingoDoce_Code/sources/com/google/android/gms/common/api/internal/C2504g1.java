package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.internal.AbstractC2541s;
import com.google.android.gms.tasks.C3421e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.g1 */
/* loaded from: classes.dex */
public final class C2504g1 extends AbstractC2541s {

    /* renamed from: d */
    final /* synthetic */ AbstractC2541s.C2542a f7257d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2504g1(AbstractC2541s.C2542a c2542a, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f7257d = c2542a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC2541s
    /* renamed from: b */
    public final void mo33292b(C2461a.InterfaceC2463b interfaceC2463b, C3421e c3421e) throws RemoteException {
        InterfaceC2529o interfaceC2529o;
        interfaceC2529o = this.f7257d.f7338a;
        interfaceC2529o.mo19090a(interfaceC2463b, c3421e);
    }
}
