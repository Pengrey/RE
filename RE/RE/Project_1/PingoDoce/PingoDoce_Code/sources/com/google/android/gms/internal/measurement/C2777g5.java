package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.g5 */
/* loaded from: classes.dex */
public final class C2777g5 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2777g5 zza;
    private int zze;
    private InterfaceC3033w8 zzf = AbstractC2940q8.m32180w();
    private C2713c5 zzg;

    static {
        C2777g5 c2777g5 = new C2777g5();
        zza = c2777g5;
        AbstractC2940q8.m32187n(C2777g5.class, c2777g5);
    }

    private C2777g5() {
    }

    /* renamed from: A */
    public final C2713c5 m32627A() {
        C2713c5 c2713c5 = this.zzg;
        return c2713c5 == null ? C2713c5.m32811C() : c2713c5;
    }

    /* renamed from: C */
    public final List m32625C() {
        return this.zzf;
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
                    return new C2761f5(null);
                }
                return new C2777g5();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C2857l5.class, "zzg"});
        }
        return (byte) 1;
    }
}
