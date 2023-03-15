package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.t3 */
/* loaded from: classes.dex */
public final class C2983t3 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2983t3 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = BuildConfig.VERSION_NAME;
    private InterfaceC3033w8 zzi = AbstractC2940q8.m32180w();
    private InterfaceC3033w8 zzj = AbstractC2940q8.m32180w();
    private InterfaceC3033w8 zzk = AbstractC2940q8.m32180w();
    private String zzl = BuildConfig.VERSION_NAME;
    private InterfaceC3033w8 zzn = AbstractC2940q8.m32180w();

    static {
        C2983t3 c2983t3 = new C2983t3();
        zza = c2983t3;
        AbstractC2940q8.m32187n(C2983t3.class, c2983t3);
    }

    private C2983t3() {
    }

    /* renamed from: E */
    public static C2967s3 m32085E() {
        return (C2967s3) zza.m32186o();
    }

    /* renamed from: G */
    public static C2983t3 m32083G() {
        return zza;
    }

    /* renamed from: L */
    public static /* synthetic */ void m32078L(C2983t3 c2983t3, int i, C2951r3 c2951r3) {
        c2951r3.getClass();
        InterfaceC3033w8 interfaceC3033w8 = c2983t3.zzj;
        if (!interfaceC3033w8.mo31907a()) {
            c2983t3.zzj = AbstractC2940q8.m32179x(interfaceC3033w8);
        }
        c2983t3.zzj.set(i, c2951r3);
    }

    /* renamed from: A */
    public final int m32089A() {
        return this.zzn.size();
    }

    /* renamed from: B */
    public final int m32088B() {
        return this.zzj.size();
    }

    /* renamed from: C */
    public final long m32087C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final C2951r3 m32086D(int i) {
        return (C2951r3) this.zzj.get(i);
    }

    /* renamed from: H */
    public final String m32082H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List m32081I() {
        return this.zzk;
    }

    /* renamed from: J */
    public final List m32080J() {
        return this.zzn;
    }

    /* renamed from: K */
    public final List m32079K() {
        return this.zzi;
    }

    /* renamed from: N */
    public final boolean m32076N() {
        return this.zzm;
    }

    /* renamed from: O */
    public final boolean m32075O() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: P */
    public final boolean m32074P() {
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
                    return new C2967s3(null);
                }
                return new C2983t3();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C3013v3.class, "zzj", C2951r3.class, "zzk", C3042x2.class, "zzl", "zzm", "zzn", C2777g5.class});
        }
        return (byte) 1;
    }
}
