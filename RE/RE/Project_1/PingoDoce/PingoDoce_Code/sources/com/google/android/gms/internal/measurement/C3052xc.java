package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.xc */
/* loaded from: classes.dex */
public final class C3052xc implements InterfaceC3037wc {

    /* renamed from: a */
    public static final AbstractC2890n6 f8091a;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        f8091a = c2842k6.m32510e("measurement.client.sessions.check_on_reset_and_enable2", true);
        c2842k6.m32510e("measurement.client.sessions.check_on_startup", true);
        c2842k6.m32510e("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3037wc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3037wc
    public final boolean zzb() {
        return ((Boolean) f8091a.m32438b()).booleanValue();
    }
}
