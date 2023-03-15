package com.google.android.gms.location;

import com.google.android.gms.tasks.C3421e;
import p400v7.AbstractC11129a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.f */
/* loaded from: classes.dex */
public final class C3092f extends AbstractC11129a {

    /* renamed from: a */
    final /* synthetic */ C3421e f8195a;

    /* renamed from: b */
    final /* synthetic */ C3084a f8196b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3092f(C3084a c3084a, C3421e c3421e) {
        this.f8196b = c3084a;
        this.f8195a = c3421e;
    }

    @Override // p400v7.AbstractC11129a
    /* renamed from: a */
    public final void mo6037a(LocationAvailability locationAvailability) {
    }

    @Override // p400v7.AbstractC11129a
    /* renamed from: b */
    public final void mo6036b(LocationResult locationResult) {
        this.f8195a.m30798e(locationResult.m31624h());
        this.f8196b.m31619w(this);
    }
}
