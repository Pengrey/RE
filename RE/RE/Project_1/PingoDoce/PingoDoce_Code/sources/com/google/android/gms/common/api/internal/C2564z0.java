package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.api.internal.C2525n;
import com.google.android.gms.tasks.C3421e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.z0 */
/* loaded from: classes.dex */
public final class C2564z0 extends AbstractC2548u {

    /* renamed from: b */
    final /* synthetic */ C2525n.C2526a f7380b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2564z0(C2525n.C2526a c2526a, C2508i.C2509a c2509a) {
        super(c2509a);
        this.f7380b = c2526a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC2548u
    /* renamed from: b */
    public final void mo33249b(C2461a.InterfaceC2463b interfaceC2463b, C3421e<Boolean> c3421e) throws RemoteException {
        InterfaceC2529o interfaceC2529o;
        interfaceC2529o = this.f7380b.f7308b;
        interfaceC2529o.mo19090a(interfaceC2463b, c3421e);
    }
}
