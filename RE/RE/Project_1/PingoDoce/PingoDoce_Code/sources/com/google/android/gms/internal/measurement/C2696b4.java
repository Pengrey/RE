package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.b4 */
/* loaded from: classes.dex */
public final class C2696b4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2696b4 zza;
    private int zze;
    private int zzf;
    private C3014v4 zzg;
    private C3014v4 zzh;
    private boolean zzi;

    static {
        C2696b4 c2696b4 = new C2696b4();
        zza = c2696b4;
        AbstractC2940q8.m32187n(C2696b4.class, c2696b4);
    }

    private C2696b4() {
    }

    /* renamed from: B */
    public static C2680a4 m32879B() {
        return (C2680a4) zza.m32186o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m32875F(C2696b4 c2696b4, int i) {
        c2696b4.zze |= 1;
        c2696b4.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m32874G(C2696b4 c2696b4, C3014v4 c3014v4) {
        c3014v4.getClass();
        c2696b4.zzg = c3014v4;
        c2696b4.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m32873H(C2696b4 c2696b4, C3014v4 c3014v4) {
        c2696b4.zzh = c3014v4;
        c2696b4.zze |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m32872I(C2696b4 c2696b4, boolean z) {
        c2696b4.zze |= 8;
        c2696b4.zzi = z;
    }

    /* renamed from: A */
    public final int m32880A() {
        return this.zzf;
    }

    /* renamed from: D */
    public final C3014v4 m32877D() {
        C3014v4 c3014v4 = this.zzg;
        return c3014v4 == null ? C3014v4.m31976H() : c3014v4;
    }

    /* renamed from: E */
    public final C3014v4 m32876E() {
        C3014v4 c3014v4 = this.zzh;
        return c3014v4 == null ? C3014v4.m31976H() : c3014v4;
    }

    /* renamed from: J */
    public final boolean m32871J() {
        return this.zzi;
    }

    /* renamed from: K */
    public final boolean m32870K() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: L */
    public final boolean m32869L() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: M */
    public final boolean m32868M() {
        return (this.zze & 4) != 0;
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
                    return new C2680a4(null);
                }
                return new C2696b4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
