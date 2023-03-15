package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.f4 */
/* loaded from: classes.dex */
public final class C2760f4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2760f4 zza;
    private int zze;
    private InterfaceC3033w8 zzf = AbstractC2940q8.m32180w();
    private String zzg = BuildConfig.VERSION_NAME;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C2760f4 c2760f4 = new C2760f4();
        zza = c2760f4;
        AbstractC2940q8.m32187n(C2760f4.class, c2760f4);
    }

    private C2760f4() {
    }

    /* renamed from: E */
    public static C2744e4 m32737E() {
        return (C2744e4) zza.m32186o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ void m32732J(C2760f4 c2760f4, int i, C2824j4 c2824j4) {
        c2824j4.getClass();
        c2760f4.m32721U();
        c2760f4.zzf.set(i, c2824j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* synthetic */ void m32731K(C2760f4 c2760f4, C2824j4 c2824j4) {
        c2824j4.getClass();
        c2760f4.m32721U();
        c2760f4.zzf.add(c2824j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static /* synthetic */ void m32730L(C2760f4 c2760f4, Iterable iterable) {
        c2760f4.m32721U();
        AbstractC2699b7.m32866i(iterable, c2760f4.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m32728N(C2760f4 c2760f4, int i) {
        c2760f4.m32721U();
        c2760f4.zzf.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static /* synthetic */ void m32727O(C2760f4 c2760f4, String str) {
        str.getClass();
        c2760f4.zze |= 1;
        c2760f4.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static /* synthetic */ void m32726P(C2760f4 c2760f4, long j) {
        c2760f4.zze |= 2;
        c2760f4.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static /* synthetic */ void m32725Q(C2760f4 c2760f4, long j) {
        c2760f4.zze |= 4;
        c2760f4.zzi = j;
    }

    /* renamed from: U */
    private final void m32721U() {
        InterfaceC3033w8 interfaceC3033w8 = this.zzf;
        if (interfaceC3033w8.mo31907a()) {
            return;
        }
        this.zzf = AbstractC2940q8.m32179x(interfaceC3033w8);
    }

    /* renamed from: A */
    public final int m32741A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final int m32740B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final long m32739C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final long m32738D() {
        return this.zzh;
    }

    /* renamed from: G */
    public final C2824j4 m32735G(int i) {
        return (C2824j4) this.zzf.get(i);
    }

    /* renamed from: H */
    public final String m32734H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List m32733I() {
        return this.zzf;
    }

    /* renamed from: R */
    public final boolean m32724R() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: S */
    public final boolean m32723S() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: T */
    public final boolean m32722T() {
        return (this.zze & 2) != 0;
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
                    return new C2744e4(null);
                }
                return new C2760f4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C2824j4.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
