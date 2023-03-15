package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.jd */
/* loaded from: classes.dex */
public final class C2833jd implements InterfaceC2817id {

    /* renamed from: a */
    public static final AbstractC2890n6 f7807a;

    /* renamed from: b */
    public static final AbstractC2890n6 f7808b;

    /* renamed from: c */
    public static final AbstractC2890n6 f7809c;

    /* renamed from: d */
    public static final AbstractC2890n6 f7810d;

    /* renamed from: e */
    public static final AbstractC2890n6 f7811e;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        f7807a = c2842k6.m32510e("measurement.test.boolean_flag", false);
        f7808b = c2842k6.m32513b("measurement.test.double_flag", -3.0d);
        f7809c = c2842k6.m32512c("measurement.test.int_flag", -2L);
        f7810d = c2842k6.m32512c("measurement.test.long_flag", -1L);
        f7811e = c2842k6.m32511d("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2817id
    /* renamed from: a */
    public final long mo32520a() {
        return ((Long) f7810d.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2817id
    /* renamed from: b */
    public final String mo32519b() {
        return (String) f7811e.m32438b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2817id
    /* renamed from: d */
    public final boolean mo32518d() {
        return ((Boolean) f7807a.m32438b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2817id
    public final double zza() {
        return ((Double) f7808b.m32438b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2817id
    public final long zzb() {
        return ((Long) f7809c.m32438b()).longValue();
    }
}
