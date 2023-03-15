package p122gc;

/* renamed from: gc.d */
/* loaded from: classes2.dex */
final class C5637d {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m23490a(C5634b c5634b) {
        return m23489b(c5634b, true) + m23489b(c5634b, false);
    }

    /* renamed from: b */
    private static int m23489b(C5634b c5634b, boolean z) {
        int m23516d = z ? c5634b.m23516d() : c5634b.m23515e();
        int m23515e = z ? c5634b.m23515e() : c5634b.m23516d();
        byte[][] m23517c = c5634b.m23517c();
        int i = 0;
        for (int i2 = 0; i2 < m23516d; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < m23515e; i4++) {
                byte b2 = z ? m23517c[i2][i4] : m23517c[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    i3 = 1;
                    b = b2;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m23488c(C5634b c5634b) {
        byte[][] m23517c = c5634b.m23517c();
        int m23515e = c5634b.m23515e();
        int m23516d = c5634b.m23516d();
        int i = 0;
        for (int i2 = 0; i2 < m23516d - 1; i2++) {
            byte[] bArr = m23517c[i2];
            int i3 = 0;
            while (i3 < m23515e - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    int i5 = i2 + 1;
                    if (b == m23517c[i5][i3] && b == m23517c[i5][i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m23487d(C5634b c5634b) {
        byte[][] m23517c = c5634b.m23517c();
        int m23515e = c5634b.m23515e();
        int m23516d = c5634b.m23516d();
        int i = 0;
        for (int i2 = 0; i2 < m23516d; i2++) {
            for (int i3 = 0; i3 < m23515e; i3++) {
                byte[] bArr = m23517c[i2];
                int i4 = i3 + 6;
                if (i4 < m23515e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m23484g(bArr, i3 - 4, i3) || m23484g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < m23516d && m23517c[i2][i3] == 1 && m23517c[i2 + 1][i3] == 0 && m23517c[i2 + 2][i3] == 1 && m23517c[i2 + 3][i3] == 1 && m23517c[i2 + 4][i3] == 1 && m23517c[i2 + 5][i3] == 0 && m23517c[i5][i3] == 1 && (m23483h(m23517c, i3, i2 - 4, i2) || m23483h(m23517c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m23486e(C5634b c5634b) {
        byte[][] m23517c = c5634b.m23517c();
        int m23515e = c5634b.m23515e();
        int m23516d = c5634b.m23516d();
        int i = 0;
        for (int i2 = 0; i2 < m23516d; i2++) {
            byte[] bArr = m23517c[i2];
            for (int i3 = 0; i3 < m23515e; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int m23516d2 = c5634b.m23516d() * c5634b.m23515e();
        return ((Math.abs((i << 1) - m23516d2) * 10) / m23516d2) * 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    public static boolean m23485f(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
        return i4 == 0;
    }

    /* renamed from: g */
    private static boolean m23484g(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m23483h(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
