package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.bc */
/* loaded from: classes.dex */
public final class C2704bc implements InterfaceC2688ac {

    /* renamed from: a */
    public static final AbstractC2890n6 f7674a;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        c2842k6.m32510e("measurement.client.consent_state_v1", true);
        c2842k6.m32510e("measurement.client.3p_consent_state_v1", true);
        c2842k6.m32510e("measurement.service.consent_state_v1_W36", true);
        f7674a = c2842k6.m32512c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2688ac
    public final long zza() {
        return ((Long) f7674a.m32438b()).longValue();
    }
}
