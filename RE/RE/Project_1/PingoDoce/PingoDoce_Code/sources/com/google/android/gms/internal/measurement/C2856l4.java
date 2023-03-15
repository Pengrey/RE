package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.l4 */
/* loaded from: classes.dex */
public final class C2856l4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2856l4 zza;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;
    private C3073z3 zzh;

    static {
        C2856l4 c2856l4 = new C2856l4();
        zza = c2856l4;
        AbstractC2940q8.m32187n(C2856l4.class, c2856l4);
    }

    private C2856l4() {
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
                    return new C2840k4(null);
                }
                return new C2856l4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
