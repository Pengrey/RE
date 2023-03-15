package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import java.util.Map;
import p079e8.InterfaceC5016c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes.dex */
public final class C2554w implements InterfaceC5016c {

    /* renamed from: a */
    final /* synthetic */ C3421e f7363a;

    /* renamed from: b */
    final /* synthetic */ C2557x f7364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2554w(C2557x c2557x, C3421e c3421e) {
        this.f7364b = c2557x;
        this.f7363a = c3421e;
    }

    @Override // p079e8.InterfaceC5016c
    /* renamed from: a */
    public final void mo4683a(AbstractC3419d abstractC3419d) {
        Map map;
        map = this.f7364b.f7369b;
        map.remove(this.f7363a);
    }
}
