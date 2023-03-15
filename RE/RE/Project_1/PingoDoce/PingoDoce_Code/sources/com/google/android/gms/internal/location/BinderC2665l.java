package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.location.AbstractBinderC3105s;
import p400v7.InterfaceC11130b;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.l */
/* loaded from: classes.dex */
final class BinderC2665l extends AbstractBinderC3105s {

    /* renamed from: a */
    private final C2508i<InterfaceC11130b> f7595a;

    @Override // com.google.android.gms.location.InterfaceC3106t
    /* renamed from: Y */
    public final synchronized void mo31605Y(Location location) {
        this.f7595a.m33354c(new C2664k(this, location));
    }
}
