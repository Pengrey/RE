package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.WriterException;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: vb.f */
/* loaded from: classes2.dex */
public final class C11182f extends AbstractC11195s {
    /* renamed from: h */
    private static void m5808h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: i */
    private static String m5807i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        sb2.append("%V");
                    } else if (charAt == '`') {
                        sb2.append("%W");
                    } else if (charAt != '-' && charAt != '.') {
                        if (charAt <= 26) {
                            sb2.append('$');
                            sb2.append((char) ((charAt - 1) + 65));
                        } else if (charAt < ' ') {
                            sb2.append('%');
                            sb2.append((char) ((charAt - 27) + 65));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb2.append('/');
                            sb2.append((char) ((charAt - '!') + 65));
                        } else if (charAt <= '9') {
                            sb2.append((char) ((charAt - '0') + 48));
                        } else if (charAt <= '?') {
                            sb2.append('%');
                            sb2.append((char) ((charAt - ';') + 70));
                        } else if (charAt <= 'Z') {
                            sb2.append((char) ((charAt - 'A') + 65));
                        } else if (charAt <= '_') {
                            sb2.append('%');
                            sb2.append((char) ((charAt - '[') + 75));
                        } else if (charAt <= 'z') {
                            sb2.append('+');
                            sb2.append((char) ((charAt - 'a') + 65));
                        } else if (charAt <= 127) {
                            sb2.append('%');
                            sb2.append((char) ((charAt - '{') + 80));
                        } else {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                        }
                    }
                }
                sb2.append(charAt);
            } else {
                sb2.append("%U");
            }
        }
        return sb2.toString();
    }

    @Override // p403vb.AbstractC11195s, com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.CODE_39) {
            return super.mo497a(str, enumC4392a, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(enumC4392a)));
    }

    @Override // p403vb.AbstractC11195s
    /* renamed from: e */
    public boolean[] mo5779e(String str) {
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                    str = m5807i(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(length * 13) + 25];
            m5808h(148, iArr);
            int m5782b = AbstractC11195s.m5782b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int m5782b2 = m5782b + AbstractC11195s.m5782b(zArr, m5782b, iArr2, false);
            for (int i2 = 0; i2 < length; i2++) {
                m5808h(C11181e.f28726e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2))], iArr);
                int m5782b3 = m5782b2 + AbstractC11195s.m5782b(zArr, m5782b2, iArr, true);
                m5782b2 = m5782b3 + AbstractC11195s.m5782b(zArr, m5782b3, iArr2, false);
            }
            m5808h(148, iArr);
            AbstractC11195s.m5782b(zArr, m5782b2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
