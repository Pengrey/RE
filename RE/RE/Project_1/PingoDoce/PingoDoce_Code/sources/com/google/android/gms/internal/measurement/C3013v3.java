package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* loaded from: classes.dex */
public final class C3013v3 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C3013v3 zza;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;

    static {
        C3013v3 c3013v3 = new C3013v3();
        zza = c3013v3;
        AbstractC2940q8.m32187n(C3013v3.class, c3013v3);
    }

    private C3013v3() {
    }

    /* renamed from: B */
    public final String m31985B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final String m31984C() {
        return this.zzg;
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
                    return new C2998u3(null);
                }
                return new C3013v3();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
