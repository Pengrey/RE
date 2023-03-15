package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C3973l;
import java.util.concurrent.atomic.AtomicBoolean;
import p031b9.C1844a;

/* renamed from: com.google.android.play.core.assetpacks.m */
/* loaded from: classes.dex */
final class BinderC3872m extends BinderC3860j<Void> {

    /* renamed from: c */
    final /* synthetic */ C3880o f11022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3872m(C3880o c3880o, C3973l<Void> c3973l) {
        super(c3880o, c3973l);
        this.f11022c = c3880o;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC3860j, com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: z */
    public final void mo28537z(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        C1844a c1844a;
        super.mo28537z(bundle, bundle2);
        atomicBoolean = this.f11022c.f11072e;
        if (!atomicBoolean.compareAndSet(true, false)) {
            c1844a = C3880o.f11066f;
            c1844a.m35276g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f11022c.mo28651c();
        }
    }
}
