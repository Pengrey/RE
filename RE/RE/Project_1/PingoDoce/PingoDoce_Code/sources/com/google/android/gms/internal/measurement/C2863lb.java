package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.lb */
/* loaded from: classes.dex */
public final class C2863lb implements InterfaceC2847kb {

    /* renamed from: a */
    public static final AbstractC2890n6 f7844a;

    /* renamed from: b */
    public static final AbstractC2890n6 f7845b;

    /* renamed from: c */
    public static final AbstractC2890n6 f7846c;

    /* renamed from: d */
    public static final AbstractC2890n6 f7847d;

    /* renamed from: e */
    public static final AbstractC2890n6 f7848e;

    /* renamed from: f */
    public static final AbstractC2890n6 f7849f;

    static {
        C2842k6 m32514a = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement")).m32514a();
        f7844a = m32514a.m32510e("measurement.adid_zero.app_instance_id_fix", true);
        f7845b = m32514a.m32510e("measurement.adid_zero.service", true);
        f7846c = m32514a.m32510e("measurement.adid_zero.adid_uid", false);
        m32514a.m32512c("measurement.id.adid_zero.service", 0L);
        f7847d = m32514a.m32510e("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f7848e = m32514a.m32510e("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f7849f = m32514a.m32510e("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2847kb
    /* renamed from: a */
    public final boolean mo32478a() {
        return ((Boolean) f7845b.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2847kb
    /* renamed from: b */
    public final boolean mo32477b() {
        return ((Boolean) f7846c.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2847kb
    /* renamed from: d */
    public final boolean mo32476d() {
        return ((Boolean) f7847d.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2847kb
    /* renamed from: e */
    public final boolean mo32475e() {
        return ((Boolean) f7848e.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2847kb
    /* renamed from: f */
    public final boolean mo32474f() {
        return ((Boolean) f7849f.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2847kb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2847kb
    public final boolean zzb() {
        return ((Boolean) f7844a.m32438b()).booleanValue();
    }
}
