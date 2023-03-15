package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ec */
/* loaded from: classes.dex */
public final class C2752ec implements InterfaceC2736dc {

    /* renamed from: a */
    public static final AbstractC2890n6 f7725a;

    /* renamed from: b */
    public static final AbstractC2890n6 f7726b;

    static {
        C2842k6 m32514a = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement")).m32514a();
        f7725a = m32514a.m32510e("measurement.enhanced_campaign.client", false);
        f7726b = m32514a.m32510e("measurement.enhanced_campaign.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736dc
    /* renamed from: a */
    public final boolean mo32756a() {
        return ((Boolean) f7726b.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736dc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736dc
    public final boolean zzb() {
        return ((Boolean) f7725a.m32438b()).booleanValue();
    }
}
