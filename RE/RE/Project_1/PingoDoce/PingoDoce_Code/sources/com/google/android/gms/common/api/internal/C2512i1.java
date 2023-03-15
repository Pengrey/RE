package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.InterfaceC3415b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.i1 */
/* loaded from: classes.dex */
public final class C2512i1 implements InterfaceC3415b<Boolean, Void> {
    @Override // com.google.android.gms.tasks.InterfaceC3415b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Void mo4684a(AbstractC3419d<Boolean> abstractC3419d) throws Exception {
        if (abstractC3419d.mo30784l().booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
