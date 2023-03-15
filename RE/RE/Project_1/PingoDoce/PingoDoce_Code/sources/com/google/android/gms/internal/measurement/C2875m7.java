package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.m7 */
/* loaded from: classes.dex */
final class C2875m7 extends C2923p7 {

    /* renamed from: z */
    private final int f7857z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2875m7(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC2955r7.m32147t(0, i2, bArr.length);
        this.f7857z = i2;
    }

    @Override // com.google.android.gms.internal.measurement.C2923p7
    /* renamed from: B */
    protected final int mo32203B() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.C2923p7, com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: b */
    public final byte mo32155b(int i) {
        int i2 = this.f7857z;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb2 = new StringBuilder(22);
                sb2.append("Index < 0: ");
                sb2.append(i);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Index > length: ");
            sb3.append(i);
            sb3.append(", ");
            sb3.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        return this.f7923y[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C2923p7, com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: f */
    public final byte mo32154f(int i) {
        return this.f7923y[i];
    }

    @Override // com.google.android.gms.internal.measurement.C2923p7, com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: g */
    public final int mo32153g() {
        return this.f7857z;
    }
}
