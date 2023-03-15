package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.z4 */
/* loaded from: classes.dex */
public final class C3074z4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C3074z4 zza;
    private int zze;
    private long zzf;
    private String zzg = BuildConfig.VERSION_NAME;
    private String zzh = BuildConfig.VERSION_NAME;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C3074z4 c3074z4 = new C3074z4();
        zza = c3074z4;
        AbstractC2940q8.m32187n(C3074z4.class, c3074z4);
    }

    private C3074z4() {
    }

    /* renamed from: D */
    public static C3059y4 m31708D() {
        return (C3059y4) zza.m32186o();
    }

    /* renamed from: H */
    public static /* synthetic */ void m31704H(C3074z4 c3074z4, long j) {
        c3074z4.zze |= 1;
        c3074z4.zzf = j;
    }

    /* renamed from: I */
    public static /* synthetic */ void m31703I(C3074z4 c3074z4, String str) {
        str.getClass();
        c3074z4.zze |= 2;
        c3074z4.zzg = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m31702J(C3074z4 c3074z4, String str) {
        str.getClass();
        c3074z4.zze |= 4;
        c3074z4.zzh = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m31701K(C3074z4 c3074z4) {
        c3074z4.zze &= -5;
        c3074z4.zzh = zza.zzh;
    }

    /* renamed from: L */
    public static /* synthetic */ void m31700L(C3074z4 c3074z4, long j) {
        c3074z4.zze |= 8;
        c3074z4.zzi = j;
    }

    /* renamed from: M */
    public static /* synthetic */ void m31699M(C3074z4 c3074z4) {
        c3074z4.zze &= -9;
        c3074z4.zzi = 0L;
    }

    /* renamed from: N */
    public static /* synthetic */ void m31698N(C3074z4 c3074z4, double d) {
        c3074z4.zze |= 32;
        c3074z4.zzk = d;
    }

    /* renamed from: O */
    public static /* synthetic */ void m31697O(C3074z4 c3074z4) {
        c3074z4.zze &= -33;
        c3074z4.zzk = 0.0d;
    }

    /* renamed from: A */
    public final double m31711A() {
        return this.zzk;
    }

    /* renamed from: B */
    public final long m31710B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final long m31709C() {
        return this.zzf;
    }

    /* renamed from: F */
    public final String m31706F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String m31705G() {
        return this.zzh;
    }

    /* renamed from: P */
    public final boolean m31696P() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: Q */
    public final boolean m31695Q() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: R */
    public final boolean m31694R() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: S */
    public final boolean m31693S() {
        return (this.zze & 4) != 0;
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
                    return new C3059y4(null);
                }
                return new C3074z4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
