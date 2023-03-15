package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* loaded from: classes.dex */
public final class C2728d4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2728d4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C2728d4 c2728d4 = new C2728d4();
        zza = c2728d4;
        AbstractC2940q8.m32187n(C2728d4.class, c2728d4);
    }

    private C2728d4() {
    }

    /* renamed from: C */
    public static C2712c4 m32791C() {
        return (C2712c4) zza.m32186o();
    }

    /* renamed from: E */
    public static /* synthetic */ void m32789E(C2728d4 c2728d4, int i) {
        c2728d4.zze |= 1;
        c2728d4.zzf = i;
    }

    /* renamed from: F */
    public static /* synthetic */ void m32788F(C2728d4 c2728d4, long j) {
        c2728d4.zze |= 2;
        c2728d4.zzg = j;
    }

    /* renamed from: A */
    public final int m32793A() {
        return this.zzf;
    }

    /* renamed from: B */
    public final long m32792B() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m32787G() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: H */
    public final boolean m32786H() {
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
                    return new C2712c4(null);
                }
                return new C2728d4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
