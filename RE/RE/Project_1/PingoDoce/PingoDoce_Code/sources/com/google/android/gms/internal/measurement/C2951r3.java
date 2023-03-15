package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* loaded from: classes.dex */
public final class C2951r3 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2951r3 zza;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C2951r3 c2951r3 = new C2951r3();
        zza = c2951r3;
        AbstractC2940q8.m32187n(C2951r3.class, c2951r3);
    }

    private C2951r3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m32169D(C2951r3 c2951r3, String str) {
        str.getClass();
        c2951r3.zze |= 1;
        c2951r3.zzf = str;
    }

    /* renamed from: A */
    public final int m32172A() {
        return this.zzi;
    }

    /* renamed from: C */
    public final String m32170C() {
        return this.zzf;
    }

    /* renamed from: E */
    public final boolean m32168E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final boolean m32167F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean m32166G() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: H */
    public final boolean m32165H() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: I */
    public final boolean m32164I() {
        return (this.zze & 8) != 0;
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
                    return new C2919p3(null);
                }
                return new C2951r3();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
