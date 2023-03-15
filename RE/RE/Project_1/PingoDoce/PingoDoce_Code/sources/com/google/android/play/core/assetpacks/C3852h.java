package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.InterfaceC3944m;
import com.google.android.play.core.tasks.C3973l;
import p031b9.AbstractRunnableC1845b;
import p031b9.C1844a;
import p031b9.C1854k;

/* renamed from: com.google.android.play.core.assetpacks.h */
/* loaded from: classes.dex */
final class C3852h extends AbstractRunnableC1845b {

    /* renamed from: A */
    final /* synthetic */ int f10967A;

    /* renamed from: B */
    final /* synthetic */ C3973l f10968B;

    /* renamed from: C */
    final /* synthetic */ C3880o f10969C;

    /* renamed from: x */
    final /* synthetic */ int f10970x;

    /* renamed from: y */
    final /* synthetic */ String f10971y;

    /* renamed from: z */
    final /* synthetic */ String f10972z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3852h(C3880o c3880o, C3973l c3973l, int i, String str, String str2, int i2, C3973l c3973l2) {
        super(c3973l);
        this.f10969C = c3880o;
        this.f10970x = i;
        this.f10971y = str;
        this.f10972z = str2;
        this.f10967A = i2;
        this.f10968B = c3973l2;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    protected final void mo28521a() {
        C1844a c1844a;
        C1854k c1854k;
        String str;
        Bundle m28671t;
        try {
            c1854k = this.f10969C.f11070c;
            str = this.f10969C.f11068a;
            Bundle m28675o = C3880o.m28675o(this.f10970x, this.f10971y, this.f10972z, this.f10967A);
            m28671t = C3880o.m28671t();
            ((InterfaceC3944m) c1854k.m35268f()).mo28554K0(str, m28675o, m28671t, new BinderC3864k(this.f10969C, this.f10968B));
        } catch (RemoteException e) {
            c1844a = C3880o.f11066f;
            c1844a.m35278e("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f10971y, this.f10972z, Integer.valueOf(this.f10967A), Integer.valueOf(this.f10970x));
            this.f10968B.m28499d(new RuntimeException(e));
        }
    }
}
