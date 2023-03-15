package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* loaded from: classes.dex */
public final class C3190f7 extends AbstractC3259m {

    /* renamed from: e */
    final /* synthetic */ C3374w7 f8442e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3190f7(C3374w7 c3374w7, InterfaceC3199g5 interfaceC3199g5) {
        super(interfaceC3199g5);
        this.f8442e = c3374w7;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3259m
    /* renamed from: c */
    public final void mo31054c() {
        C3374w7 c3374w7 = this.f8442e;
        c3374w7.mo30825h();
        if (c3374w7.m30853z()) {
            c3374w7.f8410a.mo31116d().m31328v().m31398a("Inactivity, disconnecting from the service");
            c3374w7.m30871Q();
        }
    }
}
