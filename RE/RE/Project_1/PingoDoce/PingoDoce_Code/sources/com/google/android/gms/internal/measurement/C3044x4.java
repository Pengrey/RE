package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.x4 */
/* loaded from: classes.dex */
public final class C3044x4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C3044x4 zza;
    private int zze;
    private int zzf;
    private InterfaceC3018v8 zzg = AbstractC2940q8.m32182s();

    static {
        C3044x4 c3044x4 = new C3044x4();
        zza = c3044x4;
        AbstractC2940q8.m32187n(C3044x4.class, c3044x4);
    }

    private C3044x4() {
    }

    /* renamed from: D */
    public static C3029w4 m31838D() {
        return (C3029w4) zza.m32186o();
    }

    /* renamed from: G */
    public static /* synthetic */ void m31835G(C3044x4 c3044x4, int i) {
        c3044x4.zze |= 1;
        c3044x4.zzf = i;
    }

    /* renamed from: H */
    public static /* synthetic */ void m31834H(C3044x4 c3044x4, Iterable iterable) {
        InterfaceC3018v8 interfaceC3018v8 = c3044x4.zzg;
        if (!interfaceC3018v8.mo31907a()) {
            c3044x4.zzg = AbstractC2940q8.m32181u(interfaceC3018v8);
        }
        AbstractC2699b7.m32866i(iterable, c3044x4.zzg);
    }

    /* renamed from: A */
    public final int m31841A() {
        return this.zzg.size();
    }

    /* renamed from: B */
    public final int m31840B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final long m31839C(int i) {
        return this.zzg.mo31957e(i);
    }

    /* renamed from: F */
    public final List m31836F() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean m31833I() {
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
                    return new C3029w4(null);
                }
                return new C3044x4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
