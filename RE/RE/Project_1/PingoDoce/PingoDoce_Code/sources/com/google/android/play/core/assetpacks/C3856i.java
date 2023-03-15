package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.InterfaceC3944m;
import com.google.android.play.core.tasks.C3973l;
import p031b9.AbstractRunnableC1845b;
import p031b9.C1844a;
import p031b9.C1854k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.i */
/* loaded from: classes.dex */
public final class C3856i extends AbstractRunnableC1845b {

    /* renamed from: x */
    final /* synthetic */ C3973l f10983x;

    /* renamed from: y */
    final /* synthetic */ C3880o f10984y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3856i(C3880o c3880o, C3973l c3973l, C3973l c3973l2) {
        super(c3973l);
        this.f10984y = c3880o;
        this.f10983x = c3973l2;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    protected final void mo28521a() {
        C1844a c1844a;
        C1854k c1854k;
        String str;
        Bundle m28671t;
        try {
            c1854k = this.f10984y.f11071d;
            str = this.f10984y.f11068a;
            m28671t = C3880o.m28671t();
            ((InterfaceC3944m) c1854k.m35268f()).mo28551e1(str, m28671t, new BinderC3872m(this.f10984y, this.f10983x));
        } catch (RemoteException e) {
            c1844a = C3880o.f11066f;
            c1844a.m35279d(e, "keepAlive", new Object[0]);
        }
    }
}
