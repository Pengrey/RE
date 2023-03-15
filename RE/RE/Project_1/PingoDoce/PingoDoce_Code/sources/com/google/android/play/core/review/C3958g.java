package com.google.android.play.core.review;

import android.os.RemoteException;
import com.google.android.play.core.tasks.C3973l;
import p010a9.C0091a;
import p031b9.AbstractRunnableC1845b;
import p031b9.C1844a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.review.g */
/* loaded from: classes.dex */
public final class C3958g extends AbstractRunnableC1845b {

    /* renamed from: x */
    final /* synthetic */ C3973l f11241x;

    /* renamed from: y */
    final /* synthetic */ C3961j f11242y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3958g(C3961j c3961j, C3973l c3973l, C3973l c3973l2) {
        super(c3973l);
        this.f11242y = c3961j;
        this.f11241x = c3973l2;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    protected final void mo28521a() {
        C1844a c1844a;
        String str;
        String str2;
        try {
            str2 = this.f11242y.f11248b;
            this.f11242y.f11247a.m35268f().mo28530J(str2, C0091a.m41970a(), new BinderC3960i(this.f11242y, this.f11241x));
        } catch (RemoteException e) {
            c1844a = C3961j.f11246c;
            str = this.f11242y.f11248b;
            c1844a.m35279d(e, "error requesting in-app review for %s", str);
            this.f11241x.m28499d(new RuntimeException(e));
        }
    }
}
