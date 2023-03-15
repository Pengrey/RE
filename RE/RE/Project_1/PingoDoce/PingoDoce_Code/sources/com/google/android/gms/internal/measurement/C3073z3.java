package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* loaded from: classes.dex */
public final class C3073z3 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C3073z3 zza;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;
    private String zzh = BuildConfig.VERSION_NAME;
    private String zzi = BuildConfig.VERSION_NAME;
    private String zzj = BuildConfig.VERSION_NAME;
    private String zzk = BuildConfig.VERSION_NAME;
    private String zzl = BuildConfig.VERSION_NAME;

    static {
        C3073z3 c3073z3 = new C3073z3();
        zza = c3073z3;
        AbstractC2940q8.m32187n(C3073z3.class, c3073z3);
    }

    private C3073z3() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new C3058y3(null);
                }
                return new C3073z3();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
