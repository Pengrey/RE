package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import p462y6.AbstractC13119b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes.dex */
public final class C2551v implements AbstractC13119b.InterfaceC13120a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f7358a;

    /* renamed from: b */
    final /* synthetic */ C2557x f7359b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2551v(C2557x c2557x, BasePendingResult basePendingResult) {
        this.f7359b = c2557x;
        this.f7358a = basePendingResult;
    }

    @Override // p462y6.AbstractC13119b.InterfaceC13120a
    /* renamed from: a */
    public final void mo550a(Status status) {
        Map map;
        map = this.f7359b.f7368a;
        map.remove(this.f7358a);
    }
}
