package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.qc */
/* loaded from: classes.dex */
public final class C2944qc implements InterfaceC2928pc {

    /* renamed from: a */
    public static final AbstractC2890n6 f7952a;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        c2842k6.m32510e("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f7952a = c2842k6.m32510e("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2928pc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2928pc
    public final boolean zzb() {
        return ((Boolean) f7952a.m32438b()).booleanValue();
    }
}
