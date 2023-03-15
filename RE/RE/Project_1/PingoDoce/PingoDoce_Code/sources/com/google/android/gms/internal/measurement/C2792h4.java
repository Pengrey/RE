package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.h4 */
/* loaded from: classes.dex */
public final class C2792h4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2792h4 zza;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private long zzg;

    static {
        C2792h4 c2792h4 = new C2792h4();
        zza = c2792h4;
        AbstractC2940q8.m32187n(C2792h4.class, c2792h4);
    }

    private C2792h4() {
    }

    /* renamed from: A */
    public static C2776g4 m32604A() {
        return (C2776g4) zza.m32186o();
    }

    /* renamed from: C */
    public static /* synthetic */ void m32602C(C2792h4 c2792h4, String str) {
        str.getClass();
        c2792h4.zze |= 1;
        c2792h4.zzf = str;
    }

    /* renamed from: D */
    public static /* synthetic */ void m32601D(C2792h4 c2792h4, long j) {
        c2792h4.zze |= 2;
        c2792h4.zzg = j;
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
                    return new C2776g4(null);
                }
                return new C2792h4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
