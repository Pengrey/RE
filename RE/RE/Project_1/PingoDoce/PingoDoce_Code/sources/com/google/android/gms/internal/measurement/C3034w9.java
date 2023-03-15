package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.w9 */
/* loaded from: classes.dex */
final class C3034w9 implements InterfaceC2734da {

    /* renamed from: a */
    private final InterfaceC2973s9 f8071a;

    /* renamed from: b */
    private final AbstractC2958ra f8072b;

    /* renamed from: c */
    private final boolean f8073c;

    /* renamed from: d */
    private final AbstractC2748e8 f8074d;

    private C3034w9(AbstractC2958ra abstractC2958ra, AbstractC2748e8 abstractC2748e8, InterfaceC2973s9 interfaceC2973s9) {
        this.f8072b = abstractC2958ra;
        this.f8073c = abstractC2748e8.mo32704c(interfaceC2973s9);
        this.f8074d = abstractC2748e8;
        this.f8071a = interfaceC2973s9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C3034w9 m31896j(AbstractC2958ra abstractC2958ra, AbstractC2748e8 abstractC2748e8, InterfaceC2973s9 interfaceC2973s9) {
        return new C3034w9(abstractC2958ra, abstractC2748e8, interfaceC2973s9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: a */
    public final void mo31905a(Object obj) {
        this.f8072b.mo32055g(obj);
        this.f8074d.mo32705b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: b */
    public final boolean mo31904b(Object obj) {
        this.f8074d.mo32706a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: c */
    public final void mo31903c(Object obj, byte[] bArr, int i, int i2, C2747e7 c2747e7) throws IOException {
        AbstractC2940q8 abstractC2940q8 = (AbstractC2940q8) obj;
        if (abstractC2940q8.zzc == C2974sa.m32106c()) {
            abstractC2940q8.zzc = C2974sa.m32104e();
        }
        AbstractC2908o8 abstractC2908o8 = (AbstractC2908o8) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: d */
    public final Object mo31902d() {
        return this.f8071a.mo32113a().mo32135v();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: e */
    public final int mo31901e(Object obj) {
        AbstractC2958ra abstractC2958ra = this.f8072b;
        int mo32060b = abstractC2958ra.mo32060b(abstractC2958ra.mo32059c(obj));
        if (this.f8073c) {
            this.f8074d.mo32706a(obj);
            throw null;
        }
        return mo32060b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: f */
    public final void mo31900f(Object obj, Object obj2) {
        C2766fa.m32666f(this.f8072b, obj, obj2);
        if (this.f8073c) {
            C2766fa.m32667e(this.f8074d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: g */
    public final boolean mo31899g(Object obj, Object obj2) {
        if (this.f8072b.mo32059c(obj).equals(this.f8072b.mo32059c(obj2))) {
            if (this.f8073c) {
                this.f8074d.mo32706a(obj);
                this.f8074d.mo32706a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: h */
    public final void mo31898h(Object obj, C3077z7 c3077z7) throws IOException {
        this.f8074d.mo32706a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2734da
    /* renamed from: i */
    public final int mo31897i(Object obj) {
        int hashCode = this.f8072b.mo32059c(obj).hashCode();
        if (this.f8073c) {
            this.f8074d.mo32706a(obj);
            throw null;
        }
        return hashCode;
    }
}
