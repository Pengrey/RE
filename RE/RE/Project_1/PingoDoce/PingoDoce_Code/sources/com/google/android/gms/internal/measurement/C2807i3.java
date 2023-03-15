package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.i3 */
/* loaded from: classes.dex */
public final class C2807i3 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2807i3 zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.VERSION_NAME;
    private C2695b3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C2807i3 c2807i3 = new C2807i3();
        zza = c2807i3;
        AbstractC2940q8.m32187n(C2807i3.class, c2807i3);
    }

    private C2807i3() {
    }

    /* renamed from: C */
    public static C2791h3 m32588C() {
        return (C2791h3) zza.m32186o();
    }

    /* renamed from: F */
    public static /* synthetic */ void m32585F(C2807i3 c2807i3, String str) {
        c2807i3.zze |= 2;
        c2807i3.zzg = str;
    }

    /* renamed from: A */
    public final int m32590A() {
        return this.zzf;
    }

    /* renamed from: B */
    public final C2695b3 m32589B() {
        C2695b3 c2695b3 = this.zzh;
        return c2695b3 == null ? C2695b3.m32890B() : c2695b3;
    }

    /* renamed from: E */
    public final String m32586E() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m32584G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final boolean m32583H() {
        return this.zzj;
    }

    /* renamed from: I */
    public final boolean m32582I() {
        return this.zzk;
    }

    /* renamed from: J */
    public final boolean m32581J() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: K */
    public final boolean m32580K() {
        return (this.zze & 32) != 0;
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
                    return new C2791h3(null);
                }
                return new C2807i3();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
