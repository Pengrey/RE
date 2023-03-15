package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.a0 */
/* loaded from: classes.dex */
public final class C2575a0 extends AbstractC2606o {

    /* renamed from: g */
    final /* synthetic */ AbstractC2576b f7442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2575a0(AbstractC2576b abstractC2576b, int i, Bundle bundle) {
        super(abstractC2576b, i, null);
        this.f7442g = abstractC2576b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2606o
    /* renamed from: f */
    protected final void mo33016f(ConnectionResult connectionResult) {
        if (this.f7442g.m33141t() && AbstractC2576b.m33150h0(this.f7442g)) {
            AbstractC2576b.m33156d0(this.f7442g, 16);
            return;
        }
        this.f7442g.f7453j.mo33137a(connectionResult);
        this.f7442g.m33176L(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2606o
    /* renamed from: g */
    protected final boolean mo33015g() {
        this.f7442g.f7453j.mo33137a(ConnectionResult.f7139A);
        return true;
    }
}
