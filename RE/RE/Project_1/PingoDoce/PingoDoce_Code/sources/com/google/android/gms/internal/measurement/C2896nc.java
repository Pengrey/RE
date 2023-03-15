package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.nc */
/* loaded from: classes.dex */
public final class C2896nc implements InterfaceC2880mc {

    /* renamed from: a */
    public static final AbstractC2890n6 f7901a = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement")).m32510e("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2880mc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2880mc
    public final boolean zzb() {
        return ((Boolean) f7901a.m32438b()).booleanValue();
    }
}
