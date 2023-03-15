package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C3973l;
import p031b9.C1844a;

/* renamed from: com.google.android.play.core.review.i */
/* loaded from: classes.dex */
final class BinderC3960i extends BinderC3959h<ReviewInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3960i(C3961j c3961j, C3973l c3973l) {
        super(c3961j, new C1844a("OnRequestInstallCallback"), c3973l);
    }

    @Override // com.google.android.play.core.review.BinderC3959h, com.google.android.play.core.internal.InterfaceC3935d
    /* renamed from: i */
    public final void mo28520i(Bundle bundle) throws RemoteException {
        super.mo28520i(bundle);
        this.f11244b.m28498e(ReviewInfo.m28527b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
