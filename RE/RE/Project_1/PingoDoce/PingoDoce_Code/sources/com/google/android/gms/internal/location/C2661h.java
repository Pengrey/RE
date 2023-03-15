package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.location.LocationAvailability;
import p400v7.AbstractC11129a;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.h */
/* loaded from: classes.dex */
final class C2661h implements C2508i.InterfaceC2510b<AbstractC11129a> {

    /* renamed from: a */
    final /* synthetic */ LocationAvailability f7592a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2661h(BinderC2662i binderC2662i, LocationAvailability locationAvailability) {
        this.f7592a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.C2508i.InterfaceC2510b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32951a(AbstractC11129a abstractC11129a) {
        abstractC11129a.mo6037a(this.f7592a);
    }

    @Override // com.google.android.gms.common.api.internal.C2508i.InterfaceC2510b
    /* renamed from: b */
    public final void mo32950b() {
    }
}
