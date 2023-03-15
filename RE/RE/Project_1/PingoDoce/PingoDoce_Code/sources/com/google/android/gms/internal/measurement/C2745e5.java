package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.e5 */
/* loaded from: classes.dex */
public final class C2745e5 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2745e5 zza;
    private int zze;
    private String zzf = BuildConfig.VERSION_NAME;
    private InterfaceC3033w8 zzg = AbstractC2940q8.m32180w();

    static {
        C2745e5 c2745e5 = new C2745e5();
        zza = c2745e5;
        AbstractC2940q8.m32187n(C2745e5.class, c2745e5);
    }

    private C2745e5() {
    }

    /* renamed from: B */
    public final String m32759B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final List m32758C() {
        return this.zzg;
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
                    return new C2729d5(null);
                }
                return new C2745e5();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C2857l5.class});
        }
        return (byte) 1;
    }
}
