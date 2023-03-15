package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.uc */
/* loaded from: classes.dex */
public final class C3007uc implements InterfaceC2992tc {

    /* renamed from: a */
    public static final AbstractC2890n6 f8035a;

    /* renamed from: b */
    public static final AbstractC2890n6 f8036b;

    /* renamed from: c */
    public static final AbstractC2890n6 f8037c;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        c2842k6.m32510e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f8035a = c2842k6.m32510e("measurement.audience.refresh_event_count_filters_timestamp", false);
        f8036b = c2842k6.m32510e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f8037c = c2842k6.m32510e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2992tc
    /* renamed from: a */
    public final boolean mo31998a() {
        return ((Boolean) f8036b.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2992tc
    /* renamed from: b */
    public final boolean mo31997b() {
        return ((Boolean) f8037c.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2992tc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2992tc
    public final boolean zzb() {
        return ((Boolean) f8035a.m32438b()).booleanValue();
    }
}
