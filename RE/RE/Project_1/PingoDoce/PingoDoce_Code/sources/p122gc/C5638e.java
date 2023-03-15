package p122gc;

import androidx.constraintlayout.widget.C0868i;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.C4432j;
import com.google.zxing.qrcode.decoder.EnumC4428f;
import p070e.C4906j;
import p239mb.C7154a;

/* renamed from: gc.e */
/* loaded from: classes2.dex */
final class C5638e {

    /* renamed from: a */
    private static final int[][] f15887a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f15888b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f15889c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, C0868i.f2748C0, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, C4906j.f13380A0, -1, -1}, new int[]{6, 26, 50, 74, 98, C4906j.f13400E0, -1}, new int[]{6, 30, 54, 78, C0868i.f2748C0, C4906j.f13420I0, -1}, new int[]{6, 26, 52, 78, C0868i.f2758E0, 130, -1}, new int[]{6, 30, 56, 82, C0868i.f2773H0, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, C4906j.f13380A0, 146, -1}, new int[]{6, 30, 54, 78, C0868i.f2748C0, C4906j.f13420I0, 150}, new int[]{6, 24, 50, 76, C0868i.f2748C0, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f15890d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23482a(C7154a c7154a, EnumC4428f enumC4428f, C4432j c4432j, int i, C5634b c5634b) throws WriterException {
        m23480c(c5634b);
        m23479d(c4432j, c5634b);
        m23471l(enumC4428f, i, c5634b);
        m23464s(c4432j, c5634b);
        m23477f(c7154a, i, c5634b);
    }

    /* renamed from: b */
    static int m23481b(int i, int i2) {
        if (i2 != 0) {
            int m23469n = m23469n(i2);
            int i3 = i << (m23469n - 1);
            while (m23469n(i3) >= m23469n) {
                i3 ^= i2 << (m23469n(i3) - m23469n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    static void m23480c(C5634b c5634b) {
        c5634b.m23519a((byte) -1);
    }

    /* renamed from: d */
    static void m23479d(C4432j c4432j, C5634b c5634b) throws WriterException {
        m23473j(c5634b);
        m23478e(c5634b);
        m23465r(c4432j, c5634b);
        m23472k(c5634b);
    }

    /* renamed from: e */
    private static void m23478e(C5634b c5634b) throws WriterException {
        if (c5634b.m23518b(8, c5634b.m23516d() - 8) != 0) {
            c5634b.m23514f(8, c5634b.m23516d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: f */
    static void m23477f(C7154a c7154a, int i, C5634b c5634b) throws WriterException {
        boolean z;
        int m23515e = c5634b.m23515e() - 1;
        int m23516d = c5634b.m23516d() - 1;
        int i2 = -1;
        int i3 = 0;
        while (m23515e > 0) {
            if (m23515e == 6) {
                m23515e--;
            }
            while (m23516d >= 0 && m23516d < c5634b.m23516d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = m23515e - i4;
                    if (m23468o(c5634b.m23518b(i5, m23516d))) {
                        if (i3 < c7154a.m19072l()) {
                            z = c7154a.m19076g(i3);
                            i3++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C5637d.m23485f(i, i5, m23516d)) {
                            z = !z;
                        }
                        c5634b.m23513g(i5, m23516d, z);
                    }
                }
                m23516d += i2;
            }
            i2 = -i2;
            m23516d += i2;
            m23515e -= 2;
        }
        if (i3 == c7154a.m19072l()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i3 + '/' + c7154a.m19072l());
    }

    /* renamed from: g */
    private static void m23476g(int i, int i2, C5634b c5634b) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (m23468o(c5634b.m23518b(i4, i2))) {
                c5634b.m23514f(i4, i2, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: h */
    private static void m23475h(int i, int i2, C5634b c5634b) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f15888b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                c5634b.m23514f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: i */
    private static void m23474i(int i, int i2, C5634b c5634b) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f15887a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                c5634b.m23514f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: j */
    private static void m23473j(C5634b c5634b) throws WriterException {
        int length = f15887a[0].length;
        m23474i(0, 0, c5634b);
        m23474i(c5634b.m23515e() - length, 0, c5634b);
        m23474i(0, c5634b.m23515e() - length, c5634b);
        m23476g(0, 7, c5634b);
        m23476g(c5634b.m23515e() - 8, 7, c5634b);
        m23476g(0, c5634b.m23515e() - 8, c5634b);
        m23470m(7, 0, c5634b);
        m23470m((c5634b.m23516d() - 7) - 1, 0, c5634b);
        m23470m(7, c5634b.m23516d() - 7, c5634b);
    }

    /* renamed from: k */
    private static void m23472k(C5634b c5634b) {
        int i = 8;
        while (i < c5634b.m23515e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m23468o(c5634b.m23518b(i, 6))) {
                c5634b.m23514f(i, 6, i3);
            }
            if (m23468o(c5634b.m23518b(6, i))) {
                c5634b.m23514f(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    static void m23471l(EnumC4428f enumC4428f, int i, C5634b c5634b) throws WriterException {
        C7154a c7154a = new C7154a();
        m23467p(enumC4428f, i, c7154a);
        for (int i2 = 0; i2 < c7154a.m19072l(); i2++) {
            boolean m19076g = c7154a.m19076g((c7154a.m19072l() - 1) - i2);
            int[] iArr = f15890d[i2];
            c5634b.m23513g(iArr[0], iArr[1], m19076g);
            if (i2 < 8) {
                c5634b.m23513g((c5634b.m23515e() - i2) - 1, 8, m19076g);
            } else {
                c5634b.m23513g(8, (c5634b.m23516d() - 7) + (i2 - 8), m19076g);
            }
        }
    }

    /* renamed from: m */
    private static void m23470m(int i, int i2, C5634b c5634b) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (m23468o(c5634b.m23518b(i, i4))) {
                c5634b.m23514f(i, i4, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: n */
    static int m23469n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    private static boolean m23468o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    static void m23467p(EnumC4428f enumC4428f, int i, C7154a c7154a) throws WriterException {
        if (C5639f.m23462b(i)) {
            int bits = (enumC4428f.getBits() << 3) | i;
            c7154a.m19080c(bits, 5);
            c7154a.m19080c(m23481b(bits, 1335), 10);
            C7154a c7154a2 = new C7154a();
            c7154a2.m19080c(21522, 15);
            c7154a.m19064u(c7154a2);
            if (c7154a.m19072l() == 15) {
                return;
            }
            throw new WriterException("should not happen but we got: " + c7154a.m19072l());
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: q */
    static void m23466q(C4432j c4432j, C7154a c7154a) throws WriterException {
        c7154a.m19080c(c4432j.m27601j(), 6);
        c7154a.m19080c(m23481b(c4432j.m27601j(), 7973), 12);
        if (c7154a.m19072l() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + c7154a.m19072l());
    }

    /* renamed from: r */
    private static void m23465r(C4432j c4432j, C5634b c5634b) {
        if (c4432j.m27601j() < 2) {
            return;
        }
        int[] iArr = f15889c[c4432j.m27601j() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && m23468o(c5634b.m23518b(i2, i))) {
                        m23475h(i2 - 2, i - 2, c5634b);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    static void m23464s(C4432j c4432j, C5634b c5634b) throws WriterException {
        if (c4432j.m27601j() < 7) {
            return;
        }
        C7154a c7154a = new C7154a();
        m23466q(c4432j, c7154a);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean m19076g = c7154a.m19076g(i);
                i--;
                c5634b.m23513g(i2, (c5634b.m23516d() - 11) + i3, m19076g);
                c5634b.m23513g((c5634b.m23516d() - 11) + i3, i2, m19076g);
            }
        }
    }
}
