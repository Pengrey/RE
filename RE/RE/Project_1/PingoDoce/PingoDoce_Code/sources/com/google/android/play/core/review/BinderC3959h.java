package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC3934c;
import com.google.android.play.core.tasks.C3973l;
import p031b9.C1844a;

/* renamed from: com.google.android.play.core.review.h */
/* loaded from: classes.dex */
class BinderC3959h<T> extends AbstractBinderC3934c {

    /* renamed from: a */
    final C1844a f11243a;

    /* renamed from: b */
    final C3973l<T> f11244b;

    /* renamed from: c */
    final /* synthetic */ C3961j f11245c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3959h(C3961j c3961j, C1844a c1844a, C3973l<T> c3973l) {
        this.f11245c = c3961j;
        this.f11243a = c1844a;
        this.f11244b = c3973l;
    }

    @Override // com.google.android.play.core.internal.InterfaceC3935d
    /* renamed from: i */
    public void mo28520i(Bundle bundle) throws RemoteException {
        this.f11245c.f11247a.m35272b();
        this.f11243a.m35277f("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
