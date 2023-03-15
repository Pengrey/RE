package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.md */
/* loaded from: classes.dex */
public final class C2881md implements InterfaceC2865ld {

    /* renamed from: a */
    public static final AbstractC2890n6 f7862a;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        c2842k6.m32510e("measurement.module.pixie.ees", true);
        f7862a = c2842k6.m32510e("measurement.module.pixie.fix_array", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2865ld
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2865ld
    public final boolean zzb() {
        return ((Boolean) f7862a.m32438b()).booleanValue();
    }
}
