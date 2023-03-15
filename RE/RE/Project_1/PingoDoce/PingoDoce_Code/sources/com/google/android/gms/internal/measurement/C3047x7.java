package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.x7 */
/* loaded from: classes.dex */
public final class C3047x7 extends AbstractC3062y7 {

    /* renamed from: d */
    private final byte[] f8086d;

    /* renamed from: e */
    private final int f8087e;

    /* renamed from: f */
    private int f8088f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3047x7(byte[] bArr, int i, int i2) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f8086d = bArr;
            this.f8088f = 0;
            this.f8087e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
    }

    /* renamed from: E */
    public final void m31831E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f8086d, this.f8088f, i2);
            this.f8088f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8088f), Integer.valueOf(this.f8087e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: F */
    public final void m31830F(String str) throws IOException {
        int i = this.f8088f;
        try {
            int m31798a = AbstractC3062y7.m31798a(str.length() * 3);
            int m31798a2 = AbstractC3062y7.m31798a(str.length());
            if (m31798a2 == m31798a) {
                int i2 = i + m31798a2;
                this.f8088f = i2;
                int m32614b = C2783gb.m32614b(str, this.f8086d, i2, this.f8087e - i2);
                this.f8088f = i;
                mo31778u((m32614b - i) - m31798a2);
                this.f8088f = m32614b;
                return;
            }
            mo31778u(C2783gb.m32613c(str));
            byte[] bArr = this.f8086d;
            int i3 = this.f8088f;
            this.f8088f = C2783gb.m32614b(str, bArr, i3, this.f8087e - i3);
        } catch (C2767fb e) {
            this.f8088f = i;
            m31794e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: g */
    public final int mo31792g() {
        return this.f8087e - this.f8088f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: h */
    public final void mo31791h(byte b) throws IOException {
        try {
            byte[] bArr = this.f8086d;
            int i = this.f8088f;
            this.f8088f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8088f), Integer.valueOf(this.f8087e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: i */
    public final void mo31790i(int i, boolean z) throws IOException {
        mo31778u(i << 3);
        mo31791h(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: j */
    public final void mo31789j(int i, AbstractC2955r7 abstractC2955r7) throws IOException {
        mo31778u((i << 3) | 2);
        mo31778u(abstractC2955r7.mo32153g());
        abstractC2955r7.mo32149p(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: k */
    public final void mo31788k(int i, int i2) throws IOException {
        mo31778u((i << 3) | 5);
        mo31787l(i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: l */
    public final void mo31787l(int i) throws IOException {
        try {
            byte[] bArr = this.f8086d;
            int i2 = this.f8088f;
            int i3 = i2 + 1;
            this.f8088f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f8088f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f8088f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f8088f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8088f), Integer.valueOf(this.f8087e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: m */
    public final void mo31786m(int i, long j) throws IOException {
        mo31778u((i << 3) | 1);
        mo31785n(j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: n */
    public final void mo31785n(long j) throws IOException {
        try {
            byte[] bArr = this.f8086d;
            int i = this.f8088f;
            int i2 = i + 1;
            this.f8088f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f8088f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f8088f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f8088f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f8088f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f8088f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f8088f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f8088f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8088f), Integer.valueOf(this.f8087e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: o */
    public final void mo31784o(int i, int i2) throws IOException {
        mo31778u(i << 3);
        mo31783p(i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: p */
    public final void mo31783p(int i) throws IOException {
        if (i >= 0) {
            mo31778u(i);
        } else {
            mo31776w(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: q */
    public final void mo31782q(byte[] bArr, int i, int i2) throws IOException {
        m31831E(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: r */
    public final void mo31781r(int i, String str) throws IOException {
        mo31778u((i << 3) | 2);
        m31830F(str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: s */
    public final void mo31780s(int i, int i2) throws IOException {
        mo31778u((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: t */
    public final void mo31779t(int i, int i2) throws IOException {
        mo31778u(i << 3);
        mo31778u(i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: u */
    public final void mo31778u(int i) throws IOException {
        boolean z;
        z = AbstractC3062y7.f8102c;
        if (z) {
            int i2 = C2731d7.f7705a;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f8086d;
                int i3 = this.f8088f;
                this.f8088f = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8088f), Integer.valueOf(this.f8087e), 1), e);
            }
        }
        byte[] bArr2 = this.f8086d;
        int i4 = this.f8088f;
        this.f8088f = i4 + 1;
        bArr2[i4] = (byte) i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: v */
    public final void mo31777v(int i, long j) throws IOException {
        mo31778u(i << 3);
        mo31776w(j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3062y7
    /* renamed from: w */
    public final void mo31776w(long j) throws IOException {
        boolean z;
        z = AbstractC3062y7.f8102c;
        if (z && this.f8087e - this.f8088f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f8086d;
                int i = this.f8088f;
                this.f8088f = i + 1;
                C2703bb.m32838s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f8086d;
            int i2 = this.f8088f;
            this.f8088f = i2 + 1;
            C2703bb.m32838s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f8086d;
                int i3 = this.f8088f;
                this.f8088f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8088f), Integer.valueOf(this.f8087e), 1), e);
            }
        }
        byte[] bArr4 = this.f8086d;
        int i4 = this.f8088f;
        this.f8088f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
