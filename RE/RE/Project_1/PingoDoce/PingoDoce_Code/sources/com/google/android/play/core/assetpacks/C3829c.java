package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.InterfaceC3944m;
import com.google.android.play.core.tasks.C3973l;
import java.util.ArrayList;
import java.util.List;
import p031b9.AbstractRunnableC1845b;
import p031b9.C1844a;
import p031b9.C1854k;

/* renamed from: com.google.android.play.core.assetpacks.c */
/* loaded from: classes.dex */
final class C3829c extends AbstractRunnableC1845b {

    /* renamed from: x */
    final /* synthetic */ List f10896x;

    /* renamed from: y */
    final /* synthetic */ C3973l f10897y;

    /* renamed from: z */
    final /* synthetic */ C3880o f10898z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3829c(C3880o c3880o, C3973l c3973l, List list, C3973l c3973l2) {
        super(c3973l);
        this.f10898z = c3880o;
        this.f10896x = list;
        this.f10897y = c3973l2;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    protected final void mo28521a() {
        C1844a c1844a;
        C1854k c1854k;
        String str;
        Bundle m28671t;
        ArrayList m28686d = C3880o.m28686d(this.f10896x);
        try {
            c1854k = this.f10898z.f11070c;
            str = this.f10898z.f11068a;
            m28671t = C3880o.m28671t();
            ((InterfaceC3944m) c1854k.m35268f()).mo28553W0(str, m28686d, m28671t, new BinderC3860j(this.f10898z, this.f10897y, (byte[]) null));
        } catch (RemoteException e) {
            c1844a = C3880o.f11066f;
            c1844a.m35279d(e, "cancelDownloads(%s)", this.f10896x);
        }
    }
}
