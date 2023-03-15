package p335rb;

import com.google.crypto.tink.shaded.protobuf.Reader;
import com.google.zxing.C4400e;
import java.util.Arrays;

/* renamed from: rb.j */
/* loaded from: classes2.dex */
public final class C9844j {
    /* renamed from: a */
    public static int m9860a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m9855f(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static String m9859b(String str, EnumC9846l enumC9846l, C4400e c4400e, C4400e c4400e2) {
        int i = 0;
        InterfaceC9841g[] interfaceC9841gArr = {new C9835a(), new C9837c(), new C9847m(), new C9848n(), new C9840f(), new C9836b()};
        C9842h c9842h = new C9842h(str);
        c9842h.m9869n(enumC9846l);
        c9842h.m9871l(c4400e, c4400e2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            c9842h.m9865r((char) 236);
            c9842h.m9870m(2);
            c9842h.f25786f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            c9842h.m9865r((char) 237);
            c9842h.m9870m(2);
            c9842h.f25786f += 7;
        }
        while (c9842h.m9874i()) {
            interfaceC9841gArr[i].mo9833a(c9842h);
            if (c9842h.m9878e() >= 0) {
                i = c9842h.m9878e();
                c9842h.m9873j();
            }
        }
        int m9882a = c9842h.m9882a();
        c9842h.m9867p();
        int m9845a = c9842h.m9876g().m9845a();
        if (m9882a < m9845a && i != 0 && i != 5 && i != 4) {
            c9842h.m9865r((char) 254);
        }
        StringBuilder m9881b = c9842h.m9881b();
        if (m9881b.length() < m9845a) {
            m9881b.append((char) 129);
        }
        while (m9881b.length() < m9845a) {
            m9881b.append(m9846o((char) 129, m9881b.length() + 1));
        }
        return c9842h.m9881b().toString();
    }

    /* renamed from: c */
    private static int m9858c(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil(fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: d */
    private static int m9857d(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m9856e(char c) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c)) + ')');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m9855f(char c) {
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m9854g(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: h */
    private static boolean m9853h(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                return c >= 'A' && c <= 'Z';
            }
            return true;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m9852i(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: j */
    private static boolean m9851j(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                return c >= 'a' && c <= 'z';
            }
            return true;
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m9850k(char c) {
        if (m9848m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: l */
    private static boolean m9849l(char c) {
        return false;
    }

    /* renamed from: m */
    private static boolean m9848m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m9847n(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        char c;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int m9858c = m9858c(fArr, iArr, Reader.READ_DONE, bArr);
                int m9857d = m9857d(bArr);
                if (iArr[0] == m9858c) {
                    return 0;
                }
                if (m9857d != 1 || bArr[5] <= 0) {
                    if (m9857d != 1 || bArr[4] <= 0) {
                        if (m9857d != 1 || bArr[2] <= 0) {
                            return (m9857d != 1 || bArr[3] <= 0) ? 1 : 3;
                        }
                        return 2;
                    }
                    return 4;
                }
                return 5;
            }
            char charAt = charSequence.charAt(i4);
            i3++;
            if (m9855f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m9854g(charAt)) {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m9853h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m9854g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m9851j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m9854g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m9850k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m9854g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m9852i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m9854g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m9849l(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i3 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m9858c(fArr, iArr2, Reader.READ_DONE, bArr2);
                int m9857d2 = m9857d(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (m9857d2 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (m9857d2 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (m9857d2 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i5 = i + i3 + 1; i5 < charSequence.length(); i5++) {
                            char charAt2 = charSequence.charAt(i5);
                            if (m9848m(charAt2)) {
                                return 3;
                            }
                            if (!m9850k(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    private static char m9846o(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}
