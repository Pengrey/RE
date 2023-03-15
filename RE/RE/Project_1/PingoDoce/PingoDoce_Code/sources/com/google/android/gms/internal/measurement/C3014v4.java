package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.v4 */
/* loaded from: classes.dex */
public final class C3014v4 extends AbstractC2940q8 implements InterfaceC2989t9 {
    private static final C3014v4 zza;
    private InterfaceC3018v8 zze = AbstractC2940q8.m32182s();
    private InterfaceC3018v8 zzf = AbstractC2940q8.m32182s();
    private InterfaceC3033w8 zzg = AbstractC2940q8.m32180w();
    private InterfaceC3033w8 zzh = AbstractC2940q8.m32180w();

    static {
        C3014v4 c3014v4 = new C3014v4();
        zza = c3014v4;
        AbstractC2940q8.m32187n(C3014v4.class, c3014v4);
    }

    private C3014v4() {
    }

    /* renamed from: F */
    public static C2999u4 m31978F() {
        return (C2999u4) zza.m32186o();
    }

    /* renamed from: H */
    public static C3014v4 m31976H() {
        return zza;
    }

    /* renamed from: N */
    public static /* synthetic */ void m31970N(C3014v4 c3014v4, Iterable iterable) {
        InterfaceC3018v8 interfaceC3018v8 = c3014v4.zze;
        if (!interfaceC3018v8.mo31907a()) {
            c3014v4.zze = AbstractC2940q8.m32181u(interfaceC3018v8);
        }
        AbstractC2699b7.m32866i(iterable, c3014v4.zze);
    }

    /* renamed from: P */
    public static /* synthetic */ void m31968P(C3014v4 c3014v4, Iterable iterable) {
        InterfaceC3018v8 interfaceC3018v8 = c3014v4.zzf;
        if (!interfaceC3018v8.mo31907a()) {
            c3014v4.zzf = AbstractC2940q8.m32181u(interfaceC3018v8);
        }
        AbstractC2699b7.m32866i(iterable, c3014v4.zzf);
    }

    /* renamed from: R */
    public static /* synthetic */ void m31966R(C3014v4 c3014v4, Iterable iterable) {
        c3014v4.m31962V();
        AbstractC2699b7.m32866i(iterable, c3014v4.zzg);
    }

    /* renamed from: S */
    public static /* synthetic */ void m31965S(C3014v4 c3014v4, int i) {
        c3014v4.m31962V();
        c3014v4.zzg.remove(i);
    }

    /* renamed from: T */
    public static /* synthetic */ void m31964T(C3014v4 c3014v4, Iterable iterable) {
        c3014v4.m31961W();
        AbstractC2699b7.m32866i(iterable, c3014v4.zzh);
    }

    /* renamed from: U */
    public static /* synthetic */ void m31963U(C3014v4 c3014v4, int i) {
        c3014v4.m31961W();
        c3014v4.zzh.remove(i);
    }

    /* renamed from: V */
    private final void m31962V() {
        InterfaceC3033w8 interfaceC3033w8 = this.zzg;
        if (interfaceC3033w8.mo31907a()) {
            return;
        }
        this.zzg = AbstractC2940q8.m32179x(interfaceC3033w8);
    }

    /* renamed from: W */
    private final void m31961W() {
        InterfaceC3033w8 interfaceC3033w8 = this.zzh;
        if (interfaceC3033w8.mo31907a()) {
            return;
        }
        this.zzh = AbstractC2940q8.m32179x(interfaceC3033w8);
    }

    /* renamed from: A */
    public final int m31983A() {
        return this.zzg.size();
    }

    /* renamed from: B */
    public final int m31982B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int m31981C() {
        return this.zzh.size();
    }

    /* renamed from: D */
    public final int m31980D() {
        return this.zze.size();
    }

    /* renamed from: E */
    public final C2728d4 m31979E(int i) {
        return (C2728d4) this.zzg.get(i);
    }

    /* renamed from: I */
    public final C3044x4 m31975I(int i) {
        return (C3044x4) this.zzh.get(i);
    }

    /* renamed from: J */
    public final List m31974J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final List m31973K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final List m31972L() {
        return this.zzh;
    }

    /* renamed from: M */
    public final List m31971M() {
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
                    return new C2999u4(null);
                }
                return new C3014v4();
            }
            return AbstractC2940q8.m32188m(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C2728d4.class, "zzh", C3044x4.class});
        }
        return (byte) 1;
    }
}
