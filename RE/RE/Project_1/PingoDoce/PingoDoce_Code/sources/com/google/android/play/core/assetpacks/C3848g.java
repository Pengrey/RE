package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.InterfaceC3944m;
import com.google.android.play.core.tasks.C3973l;
import p031b9.AbstractRunnableC1845b;
import p031b9.C1844a;
import p031b9.C1854k;

/* renamed from: com.google.android.play.core.assetpacks.g */
/* loaded from: classes.dex */
final class C3848g extends AbstractRunnableC1845b {

    /* renamed from: x */
    final /* synthetic */ int f10956x;

    /* renamed from: y */
    final /* synthetic */ C3973l f10957y;

    /* renamed from: z */
    final /* synthetic */ C3880o f10958z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3848g(C3880o c3880o, C3973l c3973l, int i, C3973l c3973l2) {
        super(c3973l);
        this.f10958z = c3880o;
        this.f10956x = i;
        this.f10957y = c3973l2;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    protected final void mo28521a() {
        C1844a c1844a;
        C1854k c1854k;
        String str;
        Bundle m28677m;
        Bundle m28671t;
        try {
            c1854k = this.f10958z.f11070c;
            str = this.f10958z.f11068a;
            m28677m = C3880o.m28677m(this.f10956x);
            m28671t = C3880o.m28671t();
            ((InterfaceC3944m) c1854k.m35268f()).mo28552X(str, m28677m, m28671t, new BinderC3860j(this.f10958z, this.f10957y, (int[]) null));
        } catch (RemoteException e) {
            c1844a = C3880o.f11066f;
            c1844a.m35279d(e, "notifySessionFailed", new Object[0]);
        }
    }
}
