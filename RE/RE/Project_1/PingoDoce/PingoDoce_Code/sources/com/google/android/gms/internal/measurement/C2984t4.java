package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.t4 */
/* loaded from: classes.dex */
public final class C2984t4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2984t4 zza;
    private int zze;
    private int zzf = 1;
    private InterfaceC3033w8 zzg = AbstractC2940q8.m32180w();

    static {
        C2984t4 c2984t4 = new C2984t4();
        zza = c2984t4;
        AbstractC2940q8.m32187n(C2984t4.class, c2984t4);
    }

    private C2984t4() {
    }

    /* renamed from: A */
    public static C2936q4 m32073A() {
        return (C2936q4) zza.m32186o();
    }

    /* renamed from: C */
    public static /* synthetic */ void m32071C(C2984t4 c2984t4, C2792h4 c2792h4) {
        c2792h4.getClass();
        InterfaceC3033w8 interfaceC3033w8 = c2984t4.zzg;
        if (!interfaceC3033w8.mo31907a()) {
            c2984t4.zzg = AbstractC2940q8.m32179x(interfaceC3033w8);
        }
        c2984t4.zzg.add(c2792h4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2940q8
    /* renamed from: z */
    public final Object mo31692z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C2936q4(null);
                }
                return new C2984t4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C2968s4.f7982a, "zzg", C2792h4.class});
        }
        return (byte) 1;
    }
}
