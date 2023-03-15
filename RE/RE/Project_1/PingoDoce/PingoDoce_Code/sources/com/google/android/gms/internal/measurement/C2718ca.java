package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ca */
/* loaded from: classes.dex */
final class C2718ca implements InterfaceC2909o9 {

    /* renamed from: a */
    private final InterfaceC2973s9 f7694a;

    /* renamed from: b */
    private final String f7695b;

    /* renamed from: c */
    private final Object[] f7696c;

    /* renamed from: d */
    private final int f7697d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2718ca(InterfaceC2973s9 interfaceC2973s9, String str, Object[] objArr) {
        this.f7694a = interfaceC2973s9;
        this.f7695b = str;
        this.f7696c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7697d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f7697d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2909o9
    /* renamed from: a */
    public final int mo32334a() {
        return (this.f7697d & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final String m32807b() {
        return this.f7695b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] m32806c() {
        return this.f7696c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2909o9
    public final InterfaceC2973s9 zza() {
        return this.f7694a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2909o9
    public final boolean zzb() {
        return (this.f7697d & 2) == 2;
    }
}
