package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.p7 */
/* loaded from: classes.dex */
public class C2923p7 extends AbstractC2907o7 {

    /* renamed from: y */
    protected final byte[] f7923y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2923p7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f7923y = bArr;
    }

    /* renamed from: B */
    protected int mo32203B() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: b */
    public byte mo32155b(int i) {
        return this.f7923y[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2955r7) && mo32153g() == ((AbstractC2955r7) obj).mo32153g()) {
            if (mo32153g() == 0) {
                return true;
            }
            if (obj instanceof C2923p7) {
                C2923p7 c2923p7 = (C2923p7) obj;
                int m32146u = m32146u();
                int m32146u2 = c2923p7.m32146u();
                if (m32146u == 0 || m32146u2 == 0 || m32146u == m32146u2) {
                    int mo32153g = mo32153g();
                    if (mo32153g <= c2923p7.mo32153g()) {
                        if (mo32153g <= c2923p7.mo32153g()) {
                            byte[] bArr = this.f7923y;
                            byte[] bArr2 = c2923p7.f7923y;
                            c2923p7.mo32203B();
                            int i = 0;
                            int i2 = 0;
                            while (i < mo32153g) {
                                if (bArr[i] != bArr2[i2]) {
                                    return false;
                                }
                                i++;
                                i2++;
                            }
                            return true;
                        }
                        int mo32153g2 = c2923p7.mo32153g();
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Ran off end of other: 0, ");
                        sb2.append(mo32153g);
                        sb2.append(", ");
                        sb2.append(mo32153g2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    int mo32153g3 = mo32153g();
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Length too large: ");
                    sb3.append(mo32153g);
                    sb3.append(mo32153g3);
                    throw new IllegalArgumentException(sb3.toString());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: f */
    public byte mo32154f(int i) {
        return this.f7923y[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: g */
    public int mo32153g() {
        return this.f7923y.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: h */
    protected final int mo32152h(int i, int i2, int i3) {
        return C3048x8.m31826d(i, this.f7923y, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: l */
    public final AbstractC2955r7 mo32151l(int i, int i2) {
        int m32147t = AbstractC2955r7.m32147t(0, i2, mo32153g());
        return m32147t == 0 ? AbstractC2955r7.f7969x : new C2875m7(this.f7923y, 0, m32147t);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: o */
    protected final String mo32150o(Charset charset) {
        return new String(this.f7923y, 0, mo32153g(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: p */
    public final void mo32149p(C2795h7 c2795h7) throws IOException {
        ((C3047x7) c2795h7).m31831E(this.f7923y, 0, mo32153g());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2955r7
    /* renamed from: q */
    public final boolean mo32148q() {
        return C2783gb.m32610f(this.f7923y, 0, mo32153g());
    }
}
