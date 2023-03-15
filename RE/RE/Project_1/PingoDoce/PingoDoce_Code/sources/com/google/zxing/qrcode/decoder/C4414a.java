package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import p239mb.C7155b;

/* renamed from: com.google.zxing.qrcode.decoder.a */
/* loaded from: classes2.dex */
final class C4414a {

    /* renamed from: a */
    private final C7155b f11935a;

    /* renamed from: b */
    private C4432j f11936b;

    /* renamed from: c */
    private C4429g f11937c;

    /* renamed from: d */
    private boolean f11938d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4414a(C7155b c7155b) throws FormatException {
        int m19056i = c7155b.m19056i();
        if (m19056i >= 21 && (m19056i & 3) == 1) {
            this.f11935a = c7155b;
            return;
        }
        throw FormatException.m27702a();
    }

    /* renamed from: a */
    private int m27637a(int i, int i2, int i3) {
        return this.f11938d ? this.f11935a.m19059e(i2, i) : this.f11935a.m19059e(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m27636b() {
        int i = 0;
        while (i < this.f11935a.m19053l()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f11935a.m19056i(); i3++) {
                if (this.f11935a.m19059e(i, i3) != this.f11935a.m19059e(i3, i)) {
                    this.f11935a.m19060d(i3, i);
                    this.f11935a.m19060d(i, i3);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m27635c() throws FormatException {
        C4429g m27634d = m27634d();
        C4432j m27633e = m27633e();
        EnumC4416c enumC4416c = EnumC4416c.values()[m27634d.m27614c()];
        int m19056i = this.f11935a.m19056i();
        enumC4416c.unmaskBitMatrix(this.f11935a, m19056i);
        C7155b m27610a = m27633e.m27610a();
        byte[] bArr = new byte[m27633e.m27603h()];
        int i = m19056i - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < m19056i; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!m27610a.m19059e(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f11935a.m19059e(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == m27633e.m27603h()) {
            return bArr;
        }
        throw FormatException.m27702a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C4429g m27634d() throws FormatException {
        C4429g c4429g = this.f11937c;
        if (c4429g != null) {
            return c4429g;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m27637a(i3, 8, i2);
        }
        int m27637a = m27637a(8, 7, m27637a(8, 8, m27637a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            m27637a = m27637a(8, i4, m27637a);
        }
        int m19056i = this.f11935a.m19056i();
        int i5 = m19056i - 7;
        for (int i6 = m19056i - 1; i6 >= i5; i6--) {
            i = m27637a(8, i6, i);
        }
        for (int i7 = m19056i - 8; i7 < m19056i; i7++) {
            i = m27637a(i7, 8, i);
        }
        C4429g m27616a = C4429g.m27616a(m27637a, i);
        this.f11937c = m27616a;
        if (m27616a != null) {
            return m27616a;
        }
        throw FormatException.m27702a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C4432j m27633e() throws FormatException {
        C4432j c4432j = this.f11936b;
        if (c4432j != null) {
            return c4432j;
        }
        int m19056i = this.f11935a.m19056i();
        int i = (m19056i - 17) / 4;
        if (i <= 6) {
            return C4432j.m27602i(i);
        }
        int i2 = m19056i - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = m19056i - 9; i6 >= i2; i6--) {
                i4 = m27637a(i6, i5, i4);
            }
        }
        C4432j m27608c = C4432j.m27608c(i4);
        if (m27608c != null && m27608c.m27606e() == m19056i) {
            this.f11936b = m27608c;
            return m27608c;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = m19056i - 9; i8 >= i2; i8--) {
                i3 = m27637a(i7, i8, i3);
            }
        }
        C4432j m27608c2 = C4432j.m27608c(i3);
        if (m27608c2 != null && m27608c2.m27606e() == m19056i) {
            this.f11936b = m27608c2;
            return m27608c2;
        }
        throw FormatException.m27702a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m27632f() {
        if (this.f11937c == null) {
            return;
        }
        EnumC4416c.values()[this.f11937c.m27614c()].unmaskBitMatrix(this.f11935a, this.f11935a.m19056i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m27631g(boolean z) {
        this.f11936b = null;
        this.f11937c = null;
        this.f11938d = z;
    }
}
