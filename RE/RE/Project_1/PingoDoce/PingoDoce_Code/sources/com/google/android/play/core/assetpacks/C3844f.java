package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.InterfaceC3944m;
import com.google.android.play.core.tasks.C3973l;
import p031b9.AbstractRunnableC1845b;
import p031b9.C1844a;
import p031b9.C1854k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.f */
/* loaded from: classes.dex */
public final class C3844f extends AbstractRunnableC1845b {

    /* renamed from: A */
    final /* synthetic */ int f10936A;

    /* renamed from: B */
    final /* synthetic */ C3880o f10937B;

    /* renamed from: x */
    final /* synthetic */ int f10938x;

    /* renamed from: y */
    final /* synthetic */ String f10939y;

    /* renamed from: z */
    final /* synthetic */ C3973l f10940z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3844f(C3880o c3880o, C3973l c3973l, int i, String str, C3973l c3973l2, int i2) {
        super(c3973l);
        this.f10937B = c3880o;
        this.f10938x = i;
        this.f10939y = str;
        this.f10940z = c3973l2;
        this.f10936A = i2;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    protected final void mo28521a() {
        C1844a c1844a;
        C1854k c1854k;
        String str;
        Bundle m28676n;
        Bundle m28671t;
        try {
            c1854k = this.f10937B.f11070c;
            str = this.f10937B.f11068a;
            m28676n = C3880o.m28676n(this.f10938x, this.f10939y);
            m28671t = C3880o.m28671t();
            ((InterfaceC3944m) c1854k.m35268f()).mo28555E1(str, m28676n, m28671t, new BinderC3876n(this.f10937B, this.f10940z, this.f10938x, this.f10939y, this.f10936A));
        } catch (RemoteException e) {
            c1844a = C3880o.f11066f;
            c1844a.m35279d(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
