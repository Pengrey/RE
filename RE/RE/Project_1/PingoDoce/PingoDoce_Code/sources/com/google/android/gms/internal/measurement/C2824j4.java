package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* loaded from: classes.dex */
public final class C2824j4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2824j4 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = BuildConfig.VERSION_NAME;
    private String zzg = BuildConfig.VERSION_NAME;
    private InterfaceC3033w8 zzk = AbstractC2940q8.m32180w();

    static {
        C2824j4 c2824j4 = new C2824j4();
        zza = c2824j4;
        AbstractC2940q8.m32187n(C2824j4.class, c2824j4);
    }

    private C2824j4() {
    }

    /* renamed from: E */
    public static C2808i4 m32554E() {
        return (C2808i4) zza.m32186o();
    }

    /* renamed from: J */
    public static /* synthetic */ void m32549J(C2824j4 c2824j4, String str) {
        str.getClass();
        c2824j4.zze |= 1;
        c2824j4.zzf = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m32548K(C2824j4 c2824j4, String str) {
        str.getClass();
        c2824j4.zze |= 2;
        c2824j4.zzg = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m32547L(C2824j4 c2824j4) {
        c2824j4.zze &= -3;
        c2824j4.zzg = zza.zzg;
    }

    /* renamed from: M */
    public static /* synthetic */ void m32546M(C2824j4 c2824j4, long j) {
        c2824j4.zze |= 4;
        c2824j4.zzh = j;
    }

    /* renamed from: N */
    public static /* synthetic */ void m32545N(C2824j4 c2824j4) {
        c2824j4.zze &= -5;
        c2824j4.zzh = 0L;
    }

    /* renamed from: O */
    public static /* synthetic */ void m32544O(C2824j4 c2824j4, double d) {
        c2824j4.zze |= 16;
        c2824j4.zzj = d;
    }

    /* renamed from: P */
    public static /* synthetic */ void m32543P(C2824j4 c2824j4) {
        c2824j4.zze &= -17;
        c2824j4.zzj = 0.0d;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m32542Q(C2824j4 c2824j4, C2824j4 c2824j42) {
        c2824j42.getClass();
        c2824j4.m32534Y();
        c2824j4.zzk.add(c2824j42);
    }

    /* renamed from: R */
    public static /* synthetic */ void m32541R(C2824j4 c2824j4, Iterable iterable) {
        c2824j4.m32534Y();
        AbstractC2699b7.m32866i(iterable, c2824j4.zzk);
    }

    /* renamed from: Y */
    private final void m32534Y() {
        InterfaceC3033w8 interfaceC3033w8 = this.zzk;
        if (interfaceC3033w8.mo31907a()) {
            return;
        }
        this.zzk = AbstractC2940q8.m32179x(interfaceC3033w8);
    }

    /* renamed from: A */
    public final double m32558A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final float m32557B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final int m32556C() {
        return this.zzk.size();
    }

    /* renamed from: D */
    public final long m32555D() {
        return this.zzh;
    }

    /* renamed from: G */
    public final String m32552G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final String m32551H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List m32550I() {
        return this.zzk;
    }

    /* renamed from: T */
    public final boolean m32539T() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: U */
    public final boolean m32538U() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: V */
    public final boolean m32537V() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: W */
    public final boolean m32536W() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: X */
    public final boolean m32535X() {
        return (this.zze & 2) != 0;
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
                    return new C2808i4(null);
                }
                return new C2824j4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C2824j4.class});
        }
        return (byte) 1;
    }
}
