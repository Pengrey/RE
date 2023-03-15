package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.Callable;
import p009a8.C0068a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.w8 */
/* loaded from: classes.dex */
public final class CallableC3375w8 implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzp f9077a;

    /* renamed from: b */
    final /* synthetic */ C3137a9 f9078b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC3375w8(C3137a9 c3137a9, zzp zzpVar) {
        this.f9078b = c3137a9;
        this.f9077a = zzpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C0068a m31496U = this.f9078b.m31496U((String) C2597i.m33076j(this.f9077a.f9204w));
        EnumC3193g enumC3193g = EnumC3193g.ANALYTICS_STORAGE;
        if (m31496U.m41984i(enumC3193g) && C0068a.m41991b(this.f9077a.f9203R).m41984i(enumC3193g)) {
            return this.f9078b.m31499R(this.f9077a).m30964d0();
        }
        this.f9078b.mo31116d().m31328v().m31398a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
