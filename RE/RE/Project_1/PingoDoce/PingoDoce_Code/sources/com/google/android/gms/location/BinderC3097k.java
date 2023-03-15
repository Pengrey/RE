package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.C2545t;
import com.google.android.gms.internal.location.AbstractBinderC2656c;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.k */
/* loaded from: classes.dex */
class BinderC3097k extends AbstractBinderC2656c {

    /* renamed from: a */
    private final C3421e<Void> f8201a;

    public BinderC3097k(C3421e<Void> c3421e) {
        this.f8201a = c3421e;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC2657d
    /* renamed from: u1 */
    public final void mo31614u1(zzaa zzaaVar) {
        C2545t.m33281a(zzaaVar.getStatus(), this.f8201a);
    }
}
