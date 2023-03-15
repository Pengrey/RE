package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C3973l;
import p031b9.C1844a;
import p031b9.C1854k;

/* renamed from: com.google.android.play.core.assetpacks.n */
/* loaded from: classes.dex */
final class BinderC3876n extends BinderC3860j<Void> {

    /* renamed from: c */
    final int f11032c;

    /* renamed from: d */
    final String f11033d;

    /* renamed from: e */
    final int f11034e;

    /* renamed from: f */
    final /* synthetic */ C3880o f11035f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3876n(C3880o c3880o, C3973l<Void> c3973l, int i, String str, int i2) {
        super(c3880o, c3973l);
        this.f11035f = c3880o;
        this.f11032c = i;
        this.f11033d = str;
        this.f11034e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC3860j, com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: i */
    public final void mo28540i(Bundle bundle) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f11035f.f11070c;
        c1854k.m35272b();
        int i = bundle.getInt("error_code");
        c1844a = C3880o.f11066f;
        c1844a.m35278e("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f11034e;
        if (i2 > 0) {
            this.f11035f.m28684f(this.f11032c, this.f11033d, i2 - 1);
        }
    }
}
