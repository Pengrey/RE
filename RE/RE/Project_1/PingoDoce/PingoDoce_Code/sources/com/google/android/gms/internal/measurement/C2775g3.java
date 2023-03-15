package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.g3 */
/* loaded from: classes.dex */
public final class C2775g3 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2775g3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = BuildConfig.VERSION_NAME;
    private String zzi = BuildConfig.VERSION_NAME;
    private String zzj = BuildConfig.VERSION_NAME;

    static {
        C2775g3 c2775g3 = new C2775g3();
        zza = c2775g3;
        AbstractC2940q8.m32187n(C2775g3.class, c2775g3);
    }

    private C2775g3() {
    }

    /* renamed from: B */
    public static C2775g3 m32640B() {
        return zza;
    }

    /* renamed from: C */
    public final String m32639C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final String m32638D() {
        return this.zzj;
    }

    /* renamed from: E */
    public final String m32637E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final boolean m32636F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m32635G() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: H */
    public final boolean m32634H() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: I */
    public final boolean m32633I() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: J */
    public final boolean m32632J() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: K */
    public final boolean m32631K() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: L */
    public final int m32630L() {
        int m32742a = C2759f3.m32742a(this.zzf);
        if (m32742a == 0) {
            return 1;
        }
        return m32742a;
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
                    return new C2711c3(null);
                }
                return new C2775g3();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C2743e3.f7719a, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
