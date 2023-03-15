package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.n3 */
/* loaded from: classes.dex */
public final class C2887n3 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2887n3 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = BuildConfig.VERSION_NAME;
    private InterfaceC3033w8 zzi = AbstractC2940q8.m32180w();

    static {
        C2887n3 c2887n3 = new C2887n3();
        zza = c2887n3;
        AbstractC2940q8.m32187n(C2887n3.class, c2887n3);
    }

    private C2887n3() {
    }

    /* renamed from: C */
    public static C2887n3 m32455C() {
        return zza;
    }

    /* renamed from: A */
    public final int m32457A() {
        return this.zzi.size();
    }

    /* renamed from: D */
    public final String m32454D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List m32453E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final boolean m32452F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean m32451G() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: H */
    public final boolean m32450H() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: I */
    public final boolean m32449I() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: J */
    public final int m32448J() {
        int m32470a = C2871m3.m32470a(this.zzf);
        if (m32470a == 0) {
            return 1;
        }
        return m32470a;
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
                    return new C2823j3(null);
                }
                return new C2887n3();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C2855l3.f7835a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
