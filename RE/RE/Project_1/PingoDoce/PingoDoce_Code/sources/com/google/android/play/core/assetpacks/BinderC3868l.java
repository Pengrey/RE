package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C3973l;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.l */
/* loaded from: classes.dex */
final class BinderC3868l extends BinderC3860j<List<String>> {

    /* renamed from: c */
    final /* synthetic */ C3880o f11018c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3868l(C3880o c3880o, C3973l<List<String>> c3973l) {
        super(c3880o, c3973l);
        this.f11018c = c3880o;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC3860j, com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: r */
    public final void mo28539r(List<Bundle> list) {
        super.mo28539r(list);
        this.f10995a.m28498e(C3880o.m28685e(this.f11018c, list));
    }
}
