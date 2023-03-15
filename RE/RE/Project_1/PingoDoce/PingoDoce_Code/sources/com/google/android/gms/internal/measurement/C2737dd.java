package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.dd */
/* loaded from: classes.dex */
public final class C2737dd implements InterfaceC2721cd {

    /* renamed from: a */
    public static final AbstractC2890n6 f7711a;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        c2842k6.m32512c("measurement.id.lifecycle.app_in_background_parameter", 0L);
        c2842k6.m32510e("measurement.lifecycle.app_backgrounded_tracking", true);
        f7711a = c2842k6.m32510e("measurement.lifecycle.app_in_background_parameter", false);
        c2842k6.m32512c("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2721cd
    public final boolean zza() {
        return ((Boolean) f7711a.m32438b()).booleanValue();
    }
}
