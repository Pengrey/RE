package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.location.AbstractBinderC3102p;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p400v7.AbstractC11129a;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.i */
/* loaded from: classes.dex */
final class BinderC2662i extends AbstractBinderC3102p {

    /* renamed from: a */
    private final C2508i<AbstractC11129a> f7593a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2662i(C2508i<AbstractC11129a> c2508i) {
        this.f7593a = c2508i;
    }

    @Override // com.google.android.gms.location.InterfaceC3103q
    /* renamed from: Y0 */
    public final void mo31609Y0(LocationAvailability locationAvailability) {
        this.f7593a.m33354c(new C2661h(this, locationAvailability));
    }

    /* renamed from: a */
    public final synchronized void m32952a() {
        this.f7593a.m33356a();
    }

    @Override // com.google.android.gms.location.InterfaceC3103q
    /* renamed from: k0 */
    public final void mo31608k0(LocationResult locationResult) {
        this.f7593a.m33354c(new C2660g(this, locationResult));
    }
}
