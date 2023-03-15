package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ob */
/* loaded from: classes.dex */
public final class C2911ob implements InterfaceC2895nb {

    /* renamed from: a */
    public static final AbstractC2890n6 f7911a;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        f7911a = c2842k6.m32510e("measurement.androidId.delete_feature", true);
        c2842k6.m32510e("measurement.log_androidId_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2895nb
    public final boolean zza() {
        return ((Boolean) f7911a.m32438b()).booleanValue();
    }
}
