package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes.dex */
abstract class AbstractC2606o extends AbstractC2614w<Boolean> {

    /* renamed from: d */
    public final int f7512d;

    /* renamed from: e */
    public final Bundle f7513e;

    /* renamed from: f */
    final /* synthetic */ AbstractC2576b f7514f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2606o(AbstractC2576b abstractC2576b, int i, Bundle bundle) {
        super(abstractC2576b, Boolean.TRUE);
        this.f7514f = abstractC2576b;
        this.f7512d = i;
        this.f7513e = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2614w
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo33024a(Boolean bool) {
        if (this.f7512d != 0) {
            this.f7514f.m33148i0(1, null);
            Bundle bundle = this.f7513e;
            mo33016f(new ConnectionResult(this.f7512d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else if (mo33015g()) {
        } else {
            this.f7514f.m33148i0(1, null);
            mo33016f(new ConnectionResult(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2614w
    /* renamed from: b */
    public final void mo33023b() {
    }

    /* renamed from: f */
    protected abstract void mo33016f(ConnectionResult connectionResult);

    /* renamed from: g */
    protected abstract boolean mo33015g();
}
