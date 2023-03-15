package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ad */
/* loaded from: classes.dex */
public final class C2689ad implements InterfaceC3082zc {

    /* renamed from: a */
    public static final AbstractC2890n6 f7648a;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        c2842k6.m32510e("measurement.sdk.collection.enable_extend_user_property_size", true);
        c2842k6.m32510e("measurement.sdk.collection.last_deep_link_referrer2", true);
        f7648a = c2842k6.m32510e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c2842k6.m32512c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3082zc
    public final boolean zza() {
        return ((Boolean) f7648a.m32438b()).booleanValue();
    }
}
