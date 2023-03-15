package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.c5 */
/* loaded from: classes.dex */
public final class C2713c5 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2713c5 zza;
    private InterfaceC3033w8 zze = AbstractC2940q8.m32180w();

    static {
        C2713c5 c2713c5 = new C2713c5();
        zza = c2713c5;
        AbstractC2940q8.m32187n(C2713c5.class, c2713c5);
    }

    private C2713c5() {
    }

    /* renamed from: C */
    public static C2713c5 m32811C() {
        return zza;
    }

    /* renamed from: A */
    public final int m32813A() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final List m32810D() {
        return this.zze;
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
                    return new C2697b5(null);
                }
                return new C2713c5();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2745e5.class});
        }
        return (byte) 1;
    }
}
