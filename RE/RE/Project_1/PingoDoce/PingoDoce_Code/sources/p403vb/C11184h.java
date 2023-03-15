package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.WriterException;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: vb.h */
/* loaded from: classes2.dex */
public class C11184h extends AbstractC11195s {
    /* renamed from: h */
    private static int m5800h(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }

    /* renamed from: i */
    private static int m5799i(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: j */
    static String m5798j(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb2.append("bU");
            } else if (charAt <= 26) {
                sb2.append('a');
                sb2.append((char) ((charAt + 'A') - 1));
            } else if (charAt <= 31) {
                sb2.append('b');
                sb2.append((char) ((charAt + 'A') - 27));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb2.append(charAt);
            } else if (charAt <= ',') {
                sb2.append('c');
                sb2.append((char) ((charAt + 'A') - 33));
            } else if (charAt <= '9') {
                sb2.append(charAt);
            } else if (charAt == ':') {
                sb2.append("cZ");
            } else if (charAt <= '?') {
                sb2.append('b');
                sb2.append((char) ((charAt + 'F') - 59));
            } else if (charAt == '@') {
                sb2.append("bV");
            } else if (charAt <= 'Z') {
                sb2.append(charAt);
            } else if (charAt <= '_') {
                sb2.append('b');
                sb2.append((char) ((charAt + 'K') - 91));
            } else if (charAt == '`') {
                sb2.append("bW");
            } else if (charAt <= 'z') {
                sb2.append('d');
                sb2.append((char) ((charAt + 'A') - 97));
            } else if (charAt <= 127) {
                sb2.append('b');
                sb2.append((char) ((charAt + 'P') - 123));
            } else {
                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
            }
        }
        return sb2.toString();
    }

    @Override // p403vb.AbstractC11195s, com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.CODE_93) {
            return super.mo497a(str, enumC4392a, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(enumC4392a)));
    }

    @Override // p403vb.AbstractC11195s
    /* renamed from: e */
    public boolean[] mo5779e(String str) {
        String m5798j = m5798j(str);
        int length = m5798j.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[((m5798j.length() + 2 + 2) * 9) + 1];
            int m5800h = m5800h(zArr, 0, C11183g.f28733e);
            for (int i = 0; i < length; i++) {
                m5800h += m5800h(zArr, m5800h, C11183g.f28732d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(m5798j.charAt(i))]);
            }
            int m5799i = m5799i(m5798j, 20);
            int[] iArr = C11183g.f28732d;
            int m5800h2 = m5800h + m5800h(zArr, m5800h, iArr[m5799i]);
            int m5800h3 = m5800h2 + m5800h(zArr, m5800h2, iArr[m5799i(m5798j + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(m5799i), 15)]);
            zArr[m5800h3 + m5800h(zArr, m5800h3, C11183g.f28733e)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }
}
