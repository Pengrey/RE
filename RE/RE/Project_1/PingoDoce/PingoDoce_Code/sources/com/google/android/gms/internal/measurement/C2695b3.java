package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.b3 */
/* loaded from: classes.dex */
public final class C2695b3 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2695b3 zza;
    private int zze;
    private C2887n3 zzf;
    private C2775g3 zzg;
    private boolean zzh;
    private String zzi = BuildConfig.VERSION_NAME;

    static {
        C2695b3 c2695b3 = new C2695b3();
        zza = c2695b3;
        AbstractC2940q8.m32187n(C2695b3.class, c2695b3);
    }

    private C2695b3() {
    }

    /* renamed from: B */
    public static C2695b3 m32890B() {
        return zza;
    }

    /* renamed from: F */
    public static /* synthetic */ void m32886F(C2695b3 c2695b3, String str) {
        c2695b3.zze |= 8;
        c2695b3.zzi = str;
    }

    /* renamed from: C */
    public final C2775g3 m32889C() {
        C2775g3 c2775g3 = this.zzg;
        return c2775g3 == null ? C2775g3.m32640B() : c2775g3;
    }

    /* renamed from: D */
    public final C2887n3 m32888D() {
        C2887n3 c2887n3 = this.zzf;
        return c2887n3 == null ? C2887n3.m32455C() : c2887n3;
    }

    /* renamed from: E */
    public final String m32887E() {
        return this.zzi;
    }

    /* renamed from: G */
    public final boolean m32885G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean m32884H() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: I */
    public final boolean m32883I() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: J */
    public final boolean m32882J() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: K */
    public final boolean m32881K() {
        return (this.zze & 1) != 0;
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
                    return new C2679a3(null);
                }
                return new C2695b3();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
