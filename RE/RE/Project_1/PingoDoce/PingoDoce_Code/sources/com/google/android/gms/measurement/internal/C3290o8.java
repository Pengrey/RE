package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.o8 */
/* loaded from: classes.dex */
public final class C3290o8 extends AbstractC3259m {

    /* renamed from: e */
    final /* synthetic */ C3301p8 f8745e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3290o8(C3301p8 c3301p8, InterfaceC3199g5 interfaceC3199g5) {
        super(interfaceC3199g5);
        this.f8745e = c3301p8;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3259m
    /* renamed from: c */
    public final void mo31054c() {
        this.f8745e.m31047m();
        this.f8745e.f8410a.mo31116d().m31328v().m31398a("Starting upload from DelayedRunnable");
        this.f8745e.f8820b.m31515B();
    }
}
