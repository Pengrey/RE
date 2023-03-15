package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.hc */
/* loaded from: classes.dex */
public final class C2800hc implements InterfaceC2784gc {

    /* renamed from: a */
    public static final AbstractC2890n6 f7771a;

    /* renamed from: b */
    public static final AbstractC2890n6 f7772b;

    static {
        C2842k6 m32514a = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement")).m32514a();
        m32514a.m32510e("measurement.collection.event_safelist", true);
        f7771a = m32514a.m32510e("measurement.service.store_null_safelist", false);
        f7772b = m32514a.m32510e("measurement.service.store_safelist", false);
        m32514a.m32512c("measurement.id.service.store_safelist", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2784gc
    /* renamed from: a */
    public final boolean mo32599a() {
        return ((Boolean) f7772b.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2784gc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2784gc
    public final boolean zzb() {
        return ((Boolean) f7771a.m32438b()).booleanValue();
    }
}
