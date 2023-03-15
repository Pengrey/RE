package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* loaded from: classes.dex */
public final class C3072z2 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C3072z2 zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.VERSION_NAME;
    private InterfaceC3033w8 zzh = AbstractC2940q8.m32180w();
    private boolean zzi;
    private C2775g3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C3072z2 c3072z2 = new C3072z2();
        zza = c3072z2;
        AbstractC2940q8.m32187n(C3072z2.class, c3072z2);
    }

    private C3072z2() {
    }

    /* renamed from: C */
    public static C3057y2 m31726C() {
        return (C3057y2) zza.m32186o();
    }

    /* renamed from: I */
    public static /* synthetic */ void m31720I(C3072z2 c3072z2, String str) {
        c3072z2.zze |= 2;
        c3072z2.zzg = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m31719J(C3072z2 c3072z2, int i, C2695b3 c2695b3) {
        c2695b3.getClass();
        InterfaceC3033w8 interfaceC3033w8 = c3072z2.zzh;
        if (!interfaceC3033w8.mo31907a()) {
            c3072z2.zzh = AbstractC2940q8.m32179x(interfaceC3033w8);
        }
        c3072z2.zzh.set(i, c2695b3);
    }

    /* renamed from: A */
    public final int m31728A() {
        return this.zzh.size();
    }

    /* renamed from: B */
    public final int m31727B() {
        return this.zzf;
    }

    /* renamed from: E */
    public final C2695b3 m31724E(int i) {
        return (C2695b3) this.zzh.get(i);
    }

    /* renamed from: F */
    public final C2775g3 m31723F() {
        C2775g3 c2775g3 = this.zzj;
        return c2775g3 == null ? C2775g3.m32640B() : c2775g3;
    }

    /* renamed from: G */
    public final String m31722G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final List m31721H() {
        return this.zzh;
    }

    /* renamed from: K */
    public final boolean m31718K() {
        return this.zzk;
    }

    /* renamed from: L */
    public final boolean m31717L() {
        return this.zzl;
    }

    /* renamed from: M */
    public final boolean m31716M() {
        return this.zzm;
    }

    /* renamed from: N */
    public final boolean m31715N() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: O */
    public final boolean m31714O() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: P */
    public final boolean m31713P() {
        return (this.zze & 64) != 0;
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
                    return new C3057y2(null);
                }
                return new C3072z2();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C2695b3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
