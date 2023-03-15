package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.InterfaceC3944m;
import com.google.android.play.core.tasks.C3973l;
import p031b9.AbstractRunnableC1845b;
import p031b9.C1844a;
import p031b9.C1854k;

/* renamed from: com.google.android.play.core.assetpacks.e */
/* loaded from: classes.dex */
final class C3839e extends AbstractRunnableC1845b {

    /* renamed from: A */
    final /* synthetic */ int f10921A;

    /* renamed from: B */
    final /* synthetic */ C3973l f10922B;

    /* renamed from: C */
    final /* synthetic */ C3880o f10923C;

    /* renamed from: x */
    final /* synthetic */ int f10924x;

    /* renamed from: y */
    final /* synthetic */ String f10925y;

    /* renamed from: z */
    final /* synthetic */ String f10926z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3839e(C3880o c3880o, C3973l c3973l, int i, String str, String str2, int i2, C3973l c3973l2) {
        super(c3973l);
        this.f10923C = c3880o;
        this.f10924x = i;
        this.f10925y = str;
        this.f10926z = str2;
        this.f10921A = i2;
        this.f10922B = c3973l2;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    protected final void mo28521a() {
        C1844a c1844a;
        C1854k c1854k;
        String str;
        Bundle m28671t;
        try {
            c1854k = this.f10923C.f11070c;
            str = this.f10923C.f11068a;
            Bundle m28675o = C3880o.m28675o(this.f10924x, this.f10925y, this.f10926z, this.f10921A);
            m28671t = C3880o.m28671t();
            ((InterfaceC3944m) c1854k.m35268f()).mo28550m1(str, m28675o, m28671t, new BinderC3860j(this.f10923C, this.f10922B, (char[]) null));
        } catch (RemoteException e) {
            c1844a = C3880o.f11066f;
            c1844a.m35279d(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
