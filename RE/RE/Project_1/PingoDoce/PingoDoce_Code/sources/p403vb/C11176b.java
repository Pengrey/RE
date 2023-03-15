package p403vb;

/* renamed from: vb.b */
/* loaded from: classes2.dex */
public final class C11176b extends AbstractC11195s {

    /* renamed from: b */
    private static final char[] f28721b;

    /* renamed from: c */
    private static final char[] f28722c = {'T', 'N', '*', 'E'};

    /* renamed from: d */
    private static final char[] f28723d = {'/', ':', '+', '.'};

    /* renamed from: e */
    private static final char f28724e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f28721b = cArr;
        f28724e = cArr[0];
    }

    @Override // p403vb.AbstractC11195s
    /* renamed from: e */
    public boolean[] mo5779e(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c = f28724e;
            sb2.append(c);
            sb2.append(str);
            sb2.append(c);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f28721b;
            boolean m5824i = C11174a.m5824i(cArr, upperCase);
            boolean m5824i2 = C11174a.m5824i(cArr, upperCase2);
            char[] cArr2 = f28722c;
            boolean m5824i3 = C11174a.m5824i(cArr2, upperCase);
            boolean m5824i4 = C11174a.m5824i(cArr2, upperCase2);
            if (m5824i) {
                if (!m5824i2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (m5824i3) {
                if (!m5824i4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!m5824i2 && !m5824i4) {
                StringBuilder sb3 = new StringBuilder();
                char c2 = f28724e;
                sb3.append(c2);
                sb3.append(str);
                sb3.append(c2);
                str = sb3.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (!C11174a.m5824i(f28723d, str.charAt(i3))) {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
            } else {
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = C11174a.f28712d;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr3[i6]) {
                    i = C11174a.f28713e[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
