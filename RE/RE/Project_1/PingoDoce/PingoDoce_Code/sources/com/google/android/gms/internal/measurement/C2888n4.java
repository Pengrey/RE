package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* loaded from: classes.dex */
public final class C2888n4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C2888n4 zza;
    private InterfaceC3033w8 zze = AbstractC2940q8.m32180w();

    static {
        C2888n4 c2888n4 = new C2888n4();
        zza = c2888n4;
        AbstractC2940q8.m32187n(C2888n4.class, c2888n4);
    }

    private C2888n4() {
    }

    /* renamed from: A */
    public static C2872m4 m32447A() {
        return (C2872m4) zza.m32186o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m32443E(C2888n4 c2888n4, C2920p4 c2920p4) {
        c2920p4.getClass();
        InterfaceC3033w8 interfaceC3033w8 = c2888n4.zze;
        if (!interfaceC3033w8.mo31907a()) {
            c2888n4.zze = AbstractC2940q8.m32179x(interfaceC3033w8);
        }
        c2888n4.zze.add(c2920p4);
    }

    /* renamed from: C */
    public final C2920p4 m32445C(int i) {
        return (C2920p4) this.zze.get(0);
    }

    /* renamed from: D */
    public final List m32444D() {
        return this.zze;
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
                    return new C2872m4(null);
                }
                return new C2888n4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2920p4.class});
        }
        return (byte) 1;
    }
}
