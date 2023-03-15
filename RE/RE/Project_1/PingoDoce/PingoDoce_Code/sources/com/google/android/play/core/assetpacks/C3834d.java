package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.InterfaceC3944m;
import com.google.android.play.core.tasks.C3973l;
import java.util.Map;
import p031b9.AbstractRunnableC1845b;
import p031b9.C1844a;
import p031b9.C1854k;

/* renamed from: com.google.android.play.core.assetpacks.d */
/* loaded from: classes.dex */
final class C3834d extends AbstractRunnableC1845b {

    /* renamed from: x */
    final /* synthetic */ Map f10909x;

    /* renamed from: y */
    final /* synthetic */ C3973l f10910y;

    /* renamed from: z */
    final /* synthetic */ C3880o f10911z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3834d(C3880o c3880o, C3973l c3973l, Map map, C3973l c3973l2) {
        super(c3973l);
        this.f10911z = c3880o;
        this.f10909x = map;
        this.f10910y = c3973l2;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    protected final void mo28521a() {
        C1844a c1844a;
        C1854k c1854k;
        String str;
        try {
            c1854k = this.f10911z.f11070c;
            str = this.f10911z.f11068a;
            ((InterfaceC3944m) c1854k.m35268f()).mo28556B1(str, C3880o.m28680j(this.f10909x), new BinderC3868l(this.f10911z, this.f10910y));
        } catch (RemoteException e) {
            c1844a = C3880o.f11066f;
            c1844a.m35279d(e, "syncPacks", new Object[0]);
            this.f10910y.m28499d(new RuntimeException(e));
        }
    }
}
