package p335rb;

import java.util.Arrays;

/* renamed from: rb.e */
/* loaded from: classes2.dex */
public class C9839e {

    /* renamed from: a */
    private final CharSequence f25777a;

    /* renamed from: b */
    private final int f25778b;

    /* renamed from: c */
    private final int f25779c;

    /* renamed from: d */
    private final byte[] f25780d;

    public C9839e(CharSequence charSequence, int i, int i2) {
        this.f25777a = charSequence;
        this.f25779c = i;
        this.f25778b = i2;
        byte[] bArr = new byte[i * i2];
        this.f25780d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    private void m9896a(int i) {
        m9891f(this.f25778b - 1, 0, i, 1);
        m9891f(this.f25778b - 1, 1, i, 2);
        m9891f(this.f25778b - 1, 2, i, 3);
        m9891f(0, this.f25779c - 2, i, 4);
        m9891f(0, this.f25779c - 1, i, 5);
        m9891f(1, this.f25779c - 1, i, 6);
        m9891f(2, this.f25779c - 1, i, 7);
        m9891f(3, this.f25779c - 1, i, 8);
    }

    /* renamed from: b */
    private void m9895b(int i) {
        m9891f(this.f25778b - 3, 0, i, 1);
        m9891f(this.f25778b - 2, 0, i, 2);
        m9891f(this.f25778b - 1, 0, i, 3);
        m9891f(0, this.f25779c - 4, i, 4);
        m9891f(0, this.f25779c - 3, i, 5);
        m9891f(0, this.f25779c - 2, i, 6);
        m9891f(0, this.f25779c - 1, i, 7);
        m9891f(1, this.f25779c - 1, i, 8);
    }

    /* renamed from: c */
    private void m9894c(int i) {
        m9891f(this.f25778b - 3, 0, i, 1);
        m9891f(this.f25778b - 2, 0, i, 2);
        m9891f(this.f25778b - 1, 0, i, 3);
        m9891f(0, this.f25779c - 2, i, 4);
        m9891f(0, this.f25779c - 1, i, 5);
        m9891f(1, this.f25779c - 1, i, 6);
        m9891f(2, this.f25779c - 1, i, 7);
        m9891f(3, this.f25779c - 1, i, 8);
    }

    /* renamed from: d */
    private void m9893d(int i) {
        m9891f(this.f25778b - 1, 0, i, 1);
        m9891f(this.f25778b - 1, this.f25779c - 1, i, 2);
        m9891f(0, this.f25779c - 3, i, 3);
        m9891f(0, this.f25779c - 2, i, 4);
        m9891f(0, this.f25779c - 1, i, 5);
        m9891f(1, this.f25779c - 3, i, 6);
        m9891f(1, this.f25779c - 2, i, 7);
        m9891f(1, this.f25779c - 1, i, 8);
    }

    /* renamed from: f */
    private void m9891f(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f25778b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f25779c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        m9888i(i2, i, (this.f25777a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    /* renamed from: g */
    private boolean m9890g(int i, int i2) {
        return this.f25780d[(i2 * this.f25779c) + i] < 0;
    }

    /* renamed from: i */
    private void m9888i(int i, int i2, boolean z) {
        this.f25780d[(i2 * this.f25779c) + i] = z ? (byte) 1 : (byte) 0;
    }

    /* renamed from: j */
    private void m9887j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m9891f(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m9891f(i4, i6, i3, 2);
        int i7 = i - 1;
        m9891f(i7, i5, i3, 3);
        m9891f(i7, i6, i3, 4);
        m9891f(i7, i2, i3, 5);
        m9891f(i, i5, i3, 6);
        m9891f(i, i6, i3, 7);
        m9891f(i, i2, i3, 8);
    }

    /* renamed from: e */
    public final boolean m9892e(int i, int i2) {
        return this.f25780d[(i2 * this.f25779c) + i] == 1;
    }

    /* renamed from: h */
    public final void m9889h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f25778b && i3 == 0) {
                m9896a(i4);
                i4++;
            }
            if (i5 == this.f25778b - 2 && i3 == 0 && this.f25779c % 4 != 0) {
                m9895b(i4);
                i4++;
            }
            if (i5 == this.f25778b - 2 && i3 == 0 && this.f25779c % 8 == 4) {
                m9894c(i4);
                i4++;
            }
            if (i5 == this.f25778b + 4 && i3 == 2 && this.f25779c % 8 == 0) {
                m9893d(i4);
                i4++;
            }
            do {
                if (i5 < this.f25778b && i3 >= 0 && m9890g(i3, i5)) {
                    m9887j(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.f25779c);
            int i6 = i5 + 1;
            int i7 = i3 + 3;
            do {
                if (i6 >= 0 && i7 < this.f25779c && m9890g(i7, i6)) {
                    m9887j(i6, i7, i4);
                    i4++;
                }
                i6 += 2;
                i7 -= 2;
                i = this.f25778b;
                if (i6 >= i) {
                    break;
                }
            } while (i7 >= 0);
            i5 = i6 + 3;
            i3 = i7 + 1;
            if (i5 >= i && i3 >= (i2 = this.f25779c)) {
                break;
            }
        }
        if (m9890g(i2 - 1, i - 1)) {
            m9888i(this.f25779c - 1, this.f25778b - 1, true);
            m9888i(this.f25779c - 2, this.f25778b - 2, true);
        }
    }
}
