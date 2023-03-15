package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* loaded from: classes.dex */
public final class C3042x2 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C3042x2 zza;
    private int zze;
    private int zzf;
    private InterfaceC3033w8 zzg = AbstractC2940q8.m32180w();
    private InterfaceC3033w8 zzh = AbstractC2940q8.m32180w();
    private boolean zzi;
    private boolean zzj;

    static {
        C3042x2 c3042x2 = new C3042x2();
        zza = c3042x2;
        AbstractC2940q8.m32187n(C3042x2.class, c3042x2);
    }

    private C3042x2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m31845I(C3042x2 c3042x2, int i, C2807i3 c2807i3) {
        c2807i3.getClass();
        InterfaceC3033w8 interfaceC3033w8 = c3042x2.zzg;
        if (!interfaceC3033w8.mo31907a()) {
            c3042x2.zzg = AbstractC2940q8.m32179x(interfaceC3033w8);
        }
        c3042x2.zzg.set(i, c2807i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ void m31844J(C3042x2 c3042x2, int i, C3072z2 c3072z2) {
        c3072z2.getClass();
        InterfaceC3033w8 interfaceC3033w8 = c3042x2.zzh;
        if (!interfaceC3033w8.mo31907a()) {
            c3042x2.zzh = AbstractC2940q8.m32179x(interfaceC3033w8);
        }
        c3042x2.zzh.set(i, c3072z2);
    }

    /* renamed from: A */
    public final int m31853A() {
        return this.zzf;
    }

    /* renamed from: B */
    public final int m31852B() {
        return this.zzh.size();
    }

    /* renamed from: C */
    public final int m31851C() {
        return this.zzg.size();
    }

    /* renamed from: E */
    public final C3072z2 m31849E(int i) {
        return (C3072z2) this.zzh.get(i);
    }

    /* renamed from: F */
    public final C2807i3 m31848F(int i) {
        return (C2807i3) this.zzg.get(i);
    }

    /* renamed from: G */
    public final List m31847G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final List m31846H() {
        return this.zzg;
    }

    /* renamed from: K */
    public final boolean m31843K() {
        return (this.zze & 1) != 0;
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
                    return new C3027w2(null);
                }
                return new C3042x2();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C2807i3.class, "zzh", C3072z2.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
