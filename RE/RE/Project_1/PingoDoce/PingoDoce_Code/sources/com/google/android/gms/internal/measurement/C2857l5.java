package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.l5 */
/* loaded from: classes.dex */
public final class C2857l5 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2857l5 zza;
    private int zze;
    private int zzf;
    private InterfaceC3033w8 zzg = AbstractC2940q8.m32180w();
    private String zzh = BuildConfig.VERSION_NAME;
    private String zzi = BuildConfig.VERSION_NAME;
    private boolean zzj;
    private double zzk;

    static {
        C2857l5 c2857l5 = new C2857l5();
        zza = c2857l5;
        AbstractC2940q8.m32187n(C2857l5.class, c2857l5);
    }

    private C2857l5() {
    }

    /* renamed from: A */
    public final double m32498A() {
        return this.zzk;
    }

    /* renamed from: C */
    public final String m32496C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final String m32495D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final List m32494E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final boolean m32493F() {
        return this.zzj;
    }

    /* renamed from: G */
    public final boolean m32492G() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: H */
    public final boolean m32491H() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: I */
    public final boolean m32490I() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: J */
    public final int m32489J() {
        int m32515a = C2841k5.m32515a(this.zzf);
        if (m32515a == 0) {
            return 1;
        }
        return m32515a;
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
                    return new C2793h5(null);
                }
                return new C2857l5();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C2825j5.f7800a, "zzg", C2857l5.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
