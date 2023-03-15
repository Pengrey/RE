package com.google.zxing.qrcode.decoder;

import androidx.constraintlayout.widget.C0868i;
import com.google.zxing.FormatException;
import p070e.C4906j;
import p239mb.C7155b;

/* renamed from: com.google.zxing.qrcode.decoder.j */
/* loaded from: classes2.dex */
public final class C4432j {

    /* renamed from: e */
    private static final int[] f11952e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C4432j[] f11953f = m27609b();

    /* renamed from: a */
    private final int f11954a;

    /* renamed from: b */
    private final int[] f11955b;

    /* renamed from: c */
    private final C4434b[] f11956c;

    /* renamed from: d */
    private final int f11957d;

    /* compiled from: Version.java */
    /* renamed from: com.google.zxing.qrcode.decoder.j$a */
    /* loaded from: classes2.dex */
    public static final class C4433a {

        /* renamed from: a */
        private final int f11958a;

        /* renamed from: b */
        private final int f11959b;

        C4433a(int i, int i2) {
            this.f11958a = i;
            this.f11959b = i2;
        }

        /* renamed from: a */
        public int m27600a() {
            return this.f11958a;
        }

        /* renamed from: b */
        public int m27599b() {
            return this.f11959b;
        }
    }

    /* compiled from: Version.java */
    /* renamed from: com.google.zxing.qrcode.decoder.j$b */
    /* loaded from: classes2.dex */
    public static final class C4434b {

        /* renamed from: a */
        private final int f11960a;

        /* renamed from: b */
        private final C4433a[] f11961b;

        C4434b(int i, C4433a... c4433aArr) {
            this.f11960a = i;
            this.f11961b = c4433aArr;
        }

        /* renamed from: a */
        public C4433a[] m27598a() {
            return this.f11961b;
        }

        /* renamed from: b */
        public int m27597b() {
            return this.f11960a;
        }

        /* renamed from: c */
        public int m27596c() {
            int i = 0;
            for (C4433a c4433a : this.f11961b) {
                i += c4433a.m27600a();
            }
            return i;
        }

        /* renamed from: d */
        public int m27595d() {
            return this.f11960a * m27596c();
        }
    }

    private C4432j(int i, int[] iArr, C4434b... c4434bArr) {
        C4433a[] m27598a;
        this.f11954a = i;
        this.f11955b = iArr;
        this.f11956c = c4434bArr;
        int m27597b = c4434bArr[0].m27597b();
        int i2 = 0;
        for (C4433a c4433a : c4434bArr[0].m27598a()) {
            i2 += c4433a.m27600a() * (c4433a.m27599b() + m27597b);
        }
        this.f11957d = i2;
    }

    /* renamed from: b */
    private static C4432j[] m27609b() {
        return new C4432j[]{new C4432j(1, new int[0], new C4434b(7, new C4433a(1, 19)), new C4434b(10, new C4433a(1, 16)), new C4434b(13, new C4433a(1, 13)), new C4434b(17, new C4433a(1, 9))), new C4432j(2, new int[]{6, 18}, new C4434b(10, new C4433a(1, 34)), new C4434b(16, new C4433a(1, 28)), new C4434b(22, new C4433a(1, 22)), new C4434b(28, new C4433a(1, 16))), new C4432j(3, new int[]{6, 22}, new C4434b(15, new C4433a(1, 55)), new C4434b(26, new C4433a(1, 44)), new C4434b(18, new C4433a(2, 17)), new C4434b(22, new C4433a(2, 13))), new C4432j(4, new int[]{6, 26}, new C4434b(20, new C4433a(1, 80)), new C4434b(18, new C4433a(2, 32)), new C4434b(26, new C4433a(2, 24)), new C4434b(16, new C4433a(4, 9))), new C4432j(5, new int[]{6, 30}, new C4434b(26, new C4433a(1, C0868i.f2773H0)), new C4434b(24, new C4433a(2, 43)), new C4434b(18, new C4433a(2, 15), new C4433a(2, 16)), new C4434b(22, new C4433a(2, 11), new C4433a(2, 12))), new C4432j(6, new int[]{6, 34}, new C4434b(18, new C4433a(2, 68)), new C4434b(16, new C4433a(4, 27)), new C4434b(24, new C4433a(4, 19)), new C4434b(28, new C4433a(4, 15))), new C4432j(7, new int[]{6, 22, 38}, new C4434b(20, new C4433a(2, 78)), new C4434b(18, new C4433a(4, 31)), new C4434b(18, new C4433a(2, 14), new C4433a(4, 15)), new C4434b(26, new C4433a(4, 13), new C4433a(1, 14))), new C4432j(8, new int[]{6, 24, 42}, new C4434b(24, new C4433a(2, 97)), new C4434b(22, new C4433a(2, 38), new C4433a(2, 39)), new C4434b(22, new C4433a(4, 18), new C4433a(2, 19)), new C4434b(26, new C4433a(4, 14), new C4433a(2, 15))), new C4432j(9, new int[]{6, 26, 46}, new C4434b(30, new C4433a(2, C4906j.f13612y0)), new C4434b(22, new C4433a(3, 36), new C4433a(2, 37)), new C4434b(20, new C4433a(4, 16), new C4433a(4, 17)), new C4434b(24, new C4433a(4, 12), new C4433a(4, 13))), new C4432j(10, new int[]{6, 28, 50}, new C4434b(18, new C4433a(2, 68), new C4433a(2, 69)), new C4434b(26, new C4433a(4, 43), new C4433a(1, 44)), new C4434b(24, new C4433a(6, 19), new C4433a(2, 20)), new C4434b(28, new C4433a(6, 15), new C4433a(2, 16))), new C4432j(11, new int[]{6, 30, 54}, new C4434b(20, new C4433a(4, 81)), new C4434b(30, new C4433a(1, 50), new C4433a(4, 51)), new C4434b(28, new C4433a(4, 22), new C4433a(4, 23)), new C4434b(24, new C4433a(3, 12), new C4433a(8, 13))), new C4432j(12, new int[]{6, 32, 58}, new C4434b(24, new C4433a(2, 92), new C4433a(2, 93)), new C4434b(22, new C4433a(6, 36), new C4433a(2, 37)), new C4434b(26, new C4433a(4, 20), new C4433a(6, 21)), new C4434b(28, new C4433a(7, 14), new C4433a(4, 15))), new C4432j(13, new int[]{6, 34, 62}, new C4434b(26, new C4433a(4, C0868i.f2768G0)), new C4434b(22, new C4433a(8, 37), new C4433a(1, 38)), new C4434b(24, new C4433a(8, 20), new C4433a(4, 21)), new C4434b(22, new C4433a(12, 11), new C4433a(4, 12))), new C4432j(14, new int[]{6, 26, 46, 66}, new C4434b(30, new C4433a(3, 115), new C4433a(1, C4906j.f13612y0)), new C4434b(24, new C4433a(4, 40), new C4433a(5, 41)), new C4434b(20, new C4433a(11, 16), new C4433a(5, 17)), new C4434b(24, new C4433a(11, 12), new C4433a(5, 13))), new C4432j(15, new int[]{6, 26, 48, 70}, new C4434b(22, new C4433a(5, 87), new C4433a(1, 88)), new C4434b(24, new C4433a(5, 41), new C4433a(5, 42)), new C4434b(30, new C4433a(5, 24), new C4433a(7, 25)), new C4434b(24, new C4433a(11, 12), new C4433a(7, 13))), new C4432j(16, new int[]{6, 26, 50, 74}, new C4434b(24, new C4433a(5, 98), new C4433a(1, 99)), new C4434b(28, new C4433a(7, 45), new C4433a(3, 46)), new C4434b(24, new C4433a(15, 19), new C4433a(2, 20)), new C4434b(30, new C4433a(3, 15), new C4433a(13, 16))), new C4432j(17, new int[]{6, 30, 54, 78}, new C4434b(28, new C4433a(1, C0868i.f2768G0), new C4433a(5, C0868i.f2773H0)), new C4434b(28, new C4433a(10, 46), new C4433a(1, 47)), new C4434b(28, new C4433a(1, 22), new C4433a(15, 23)), new C4434b(28, new C4433a(2, 14), new C4433a(17, 15))), new C4432j(18, new int[]{6, 30, 56, 82}, new C4434b(30, new C4433a(5, C4906j.f13390C0), new C4433a(1, C4906j.f13395D0)), new C4434b(26, new C4433a(9, 43), new C4433a(4, 44)), new C4434b(28, new C4433a(17, 22), new C4433a(1, 23)), new C4434b(28, new C4433a(2, 14), new C4433a(19, 15))), new C4432j(19, new int[]{6, 30, 58, 86}, new C4434b(28, new C4433a(3, 113), new C4433a(4, 114)), new C4434b(26, new C4433a(3, 44), new C4433a(11, 45)), new C4434b(26, new C4433a(17, 21), new C4433a(4, 22)), new C4434b(26, new C4433a(9, 13), new C4433a(16, 14))), new C4432j(20, new int[]{6, 34, 62, 90}, new C4434b(28, new C4433a(3, C0868i.f2768G0), new C4433a(5, C0868i.f2773H0)), new C4434b(26, new C4433a(3, 41), new C4433a(13, 42)), new C4434b(30, new C4433a(15, 24), new C4433a(5, 25)), new C4434b(28, new C4433a(15, 15), new C4433a(10, 16))), new C4432j(21, new int[]{6, 28, 50, 72, 94}, new C4434b(28, new C4433a(4, C4906j.f13612y0), new C4433a(4, C4906j.f13617z0)), new C4434b(26, new C4433a(17, 42)), new C4434b(28, new C4433a(17, 22), new C4433a(6, 23)), new C4434b(30, new C4433a(19, 16), new C4433a(6, 17))), new C4432j(22, new int[]{6, 26, 50, 74, 98}, new C4434b(28, new C4433a(2, 111), new C4433a(7, 112)), new C4434b(28, new C4433a(17, 46)), new C4434b(30, new C4433a(7, 24), new C4433a(16, 25)), new C4434b(24, new C4433a(34, 13))), new C4432j(23, new int[]{6, 30, 54, 78, C0868i.f2748C0}, new C4434b(30, new C4433a(4, C4906j.f13395D0), new C4433a(5, C4906j.f13400E0)), new C4434b(28, new C4433a(4, 47), new C4433a(14, 48)), new C4434b(30, new C4433a(11, 24), new C4433a(14, 25)), new C4434b(30, new C4433a(16, 15), new C4433a(14, 16))), new C4432j(24, new int[]{6, 28, 54, 80, 106}, new C4434b(30, new C4433a(6, C4906j.f13617z0), new C4433a(4, C4906j.f13380A0)), new C4434b(28, new C4433a(6, 45), new C4433a(14, 46)), new C4434b(30, new C4433a(11, 24), new C4433a(16, 25)), new C4434b(30, new C4433a(30, 16), new C4433a(2, 17))), new C4432j(25, new int[]{6, 32, 58, 84, 110}, new C4434b(26, new C4433a(8, 106), new C4433a(4, C0868i.f2768G0)), new C4434b(28, new C4433a(8, 47), new C4433a(13, 48)), new C4434b(30, new C4433a(7, 24), new C4433a(22, 25)), new C4434b(30, new C4433a(22, 15), new C4433a(13, 16))), new C4432j(26, new int[]{6, 30, 58, 86, 114}, new C4434b(28, new C4433a(10, 114), new C4433a(2, 115)), new C4434b(28, new C4433a(19, 46), new C4433a(4, 47)), new C4434b(28, new C4433a(28, 22), new C4433a(6, 23)), new C4434b(30, new C4433a(33, 16), new C4433a(4, 17))), new C4432j(27, new int[]{6, 34, 62, 90, C4906j.f13380A0}, new C4434b(30, new C4433a(8, C4906j.f13400E0), new C4433a(4, C4906j.f13405F0)), new C4434b(28, new C4433a(22, 45), new C4433a(3, 46)), new C4434b(30, new C4433a(8, 23), new C4433a(26, 24)), new C4434b(30, new C4433a(12, 15), new C4433a(28, 16))), new C4432j(28, new int[]{6, 26, 50, 74, 98, C4906j.f13400E0}, new C4434b(30, new C4433a(3, C4906j.f13617z0), new C4433a(10, C4906j.f13380A0)), new C4434b(28, new C4433a(3, 45), new C4433a(23, 46)), new C4434b(30, new C4433a(4, 24), new C4433a(31, 25)), new C4434b(30, new C4433a(11, 15), new C4433a(31, 16))), new C4432j(29, new int[]{6, 30, 54, 78, C0868i.f2748C0, C4906j.f13420I0}, new C4434b(30, new C4433a(7, C4906j.f13612y0), new C4433a(7, C4906j.f13617z0)), new C4434b(28, new C4433a(21, 45), new C4433a(7, 46)), new C4434b(30, new C4433a(1, 23), new C4433a(37, 24)), new C4434b(30, new C4433a(19, 15), new C4433a(26, 16))), new C4432j(30, new int[]{6, 26, 52, 78, C0868i.f2758E0, 130}, new C4434b(30, new C4433a(5, 115), new C4433a(10, C4906j.f13612y0)), new C4434b(28, new C4433a(19, 47), new C4433a(10, 48)), new C4434b(30, new C4433a(15, 24), new C4433a(25, 25)), new C4434b(30, new C4433a(23, 15), new C4433a(25, 16))), new C4432j(31, new int[]{6, 30, 56, 82, C0868i.f2773H0, 134}, new C4434b(30, new C4433a(13, 115), new C4433a(3, C4906j.f13612y0)), new C4434b(28, new C4433a(2, 46), new C4433a(29, 47)), new C4434b(30, new C4433a(42, 24), new C4433a(1, 25)), new C4434b(30, new C4433a(23, 15), new C4433a(28, 16))), new C4432j(32, new int[]{6, 34, 60, 86, 112, 138}, new C4434b(30, new C4433a(17, 115)), new C4434b(28, new C4433a(10, 46), new C4433a(23, 47)), new C4434b(30, new C4433a(10, 24), new C4433a(35, 25)), new C4434b(30, new C4433a(19, 15), new C4433a(35, 16))), new C4432j(33, new int[]{6, 30, 58, 86, 114, 142}, new C4434b(30, new C4433a(17, 115), new C4433a(1, C4906j.f13612y0)), new C4434b(28, new C4433a(14, 46), new C4433a(21, 47)), new C4434b(30, new C4433a(29, 24), new C4433a(19, 25)), new C4434b(30, new C4433a(11, 15), new C4433a(46, 16))), new C4432j(34, new int[]{6, 34, 62, 90, C4906j.f13380A0, 146}, new C4434b(30, new C4433a(13, 115), new C4433a(6, C4906j.f13612y0)), new C4434b(28, new C4433a(14, 46), new C4433a(23, 47)), new C4434b(30, new C4433a(44, 24), new C4433a(7, 25)), new C4434b(30, new C4433a(59, 16), new C4433a(1, 17))), new C4432j(35, new int[]{6, 30, 54, 78, C0868i.f2748C0, C4906j.f13420I0, 150}, new C4434b(30, new C4433a(12, C4906j.f13395D0), new C4433a(7, C4906j.f13400E0)), new C4434b(28, new C4433a(12, 47), new C4433a(26, 48)), new C4434b(30, new C4433a(39, 24), new C4433a(14, 25)), new C4434b(30, new C4433a(22, 15), new C4433a(41, 16))), new C4432j(36, new int[]{6, 24, 50, 76, C0868i.f2748C0, 128, 154}, new C4434b(30, new C4433a(6, C4906j.f13395D0), new C4433a(14, C4906j.f13400E0)), new C4434b(28, new C4433a(6, 47), new C4433a(34, 48)), new C4434b(30, new C4433a(46, 24), new C4433a(10, 25)), new C4434b(30, new C4433a(2, 15), new C4433a(64, 16))), new C4432j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C4434b(30, new C4433a(17, C4906j.f13400E0), new C4433a(4, C4906j.f13405F0)), new C4434b(28, new C4433a(29, 46), new C4433a(14, 47)), new C4434b(30, new C4433a(49, 24), new C4433a(10, 25)), new C4434b(30, new C4433a(24, 15), new C4433a(46, 16))), new C4432j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C4434b(30, new C4433a(4, C4906j.f13400E0), new C4433a(18, C4906j.f13405F0)), new C4434b(28, new C4433a(13, 46), new C4433a(32, 47)), new C4434b(30, new C4433a(48, 24), new C4433a(14, 25)), new C4434b(30, new C4433a(42, 15), new C4433a(32, 16))), new C4432j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C4434b(30, new C4433a(20, C4906j.f13617z0), new C4433a(4, C4906j.f13380A0)), new C4434b(28, new C4433a(40, 47), new C4433a(7, 48)), new C4434b(30, new C4433a(43, 24), new C4433a(22, 25)), new C4434b(30, new C4433a(10, 15), new C4433a(67, 16))), new C4432j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C4434b(30, new C4433a(19, C4906j.f13380A0), new C4433a(6, C4906j.f13385B0)), new C4434b(28, new C4433a(18, 47), new C4433a(31, 48)), new C4434b(30, new C4433a(34, 24), new C4433a(34, 25)), new C4434b(30, new C4433a(20, 15), new C4433a(61, 16)))};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C4432j m27608c(int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (true) {
            int[] iArr = f11952e;
            if (i2 >= iArr.length) {
                if (i3 <= 3) {
                    return m27602i(i4);
                }
                return null;
            }
            int i5 = iArr[i2];
            if (i5 == i) {
                return m27602i(i2 + 7);
            }
            int m27612e = C4429g.m27612e(i, i5);
            if (m27612e < i3) {
                i4 = i2 + 7;
                i3 = m27612e;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public static C4432j m27604g(int i) throws FormatException {
        if (i % 4 == 1) {
            try {
                return m27602i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw FormatException.m27702a();
            }
        }
        throw FormatException.m27702a();
    }

    /* renamed from: i */
    public static C4432j m27602i(int i) {
        if (i > 0 && i <= 40) {
            return f11953f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7155b m27610a() {
        int m27606e = m27606e();
        C7155b c7155b = new C7155b(m27606e);
        c7155b.m19050o(0, 0, 9, 9);
        int i = m27606e - 8;
        c7155b.m19050o(i, 0, 8, 9);
        c7155b.m19050o(0, i, 9, 8);
        int length = this.f11955b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f11955b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if ((i2 != 0 || (i4 != 0 && i4 != length - 1)) && (i2 != length - 1 || i4 != 0)) {
                    c7155b.m19050o(this.f11955b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = m27606e - 17;
        c7155b.m19050o(6, 9, 1, i5);
        c7155b.m19050o(9, 6, i5, 1);
        if (this.f11954a > 6) {
            int i6 = m27606e - 11;
            c7155b.m19050o(i6, 0, 3, 6);
            c7155b.m19050o(0, i6, 6, 3);
        }
        return c7155b;
    }

    /* renamed from: d */
    public int[] m27607d() {
        return this.f11955b;
    }

    /* renamed from: e */
    public int m27606e() {
        return (this.f11954a * 4) + 17;
    }

    /* renamed from: f */
    public C4434b m27605f(EnumC4428f enumC4428f) {
        return this.f11956c[enumC4428f.ordinal()];
    }

    /* renamed from: h */
    public int m27603h() {
        return this.f11957d;
    }

    /* renamed from: j */
    public int m27601j() {
        return this.f11954a;
    }

    public String toString() {
        return String.valueOf(this.f11954a);
    }
}
