package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.gd */
/* loaded from: classes.dex */
public final class C2785gd implements InterfaceC2769fd {

    /* renamed from: a */
    public static final AbstractC2890n6 f7759a;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        f7759a = c2842k6.m32510e("measurement.validation.internal_limits_internal_event_params", true);
        c2842k6.m32512c("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2769fd
    public final boolean zza() {
        return ((Boolean) f7759a.m32438b()).booleanValue();
    }
}
