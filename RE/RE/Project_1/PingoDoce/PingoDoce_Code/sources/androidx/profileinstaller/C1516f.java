package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: androidx.profileinstaller.f */
/* loaded from: classes.dex */
class C1516f {

    /* renamed from: a */
    static final byte[] f4425a = {112, 114, 111, 0};

    /* renamed from: b */
    static final byte[] f4426b = {112, 114, 109, 0};

    /* renamed from: A */
    private static void m36859A(OutputStream outputStream, C1509b[] c1509bArr) throws IOException {
        byte[] m36858a = m36858a(c1509bArr, C1517g.f4427a);
        C1510c.m36870q(outputStream, c1509bArr.length);
        C1510c.m36875l(outputStream, m36858a);
    }

    /* renamed from: a */
    private static byte[] m36858a(C1509b[] c1509bArr, byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (C1509b c1509b : c1509bArr) {
            i2 += C1510c.m36877j(m36857b(c1509b.f4414a, c1509b.f4415b, bArr)) + 16 + (c1509b.f4417d * 2) + c1509b.f4418e + m36856c(c1509b.f4419f);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, C1517g.f4428b)) {
            int length = c1509bArr.length;
            while (i < length) {
                C1509b c1509b2 = c1509bArr[i];
                m36838u(byteArrayOutputStream, c1509b2, m36857b(c1509b2.f4414a, c1509b2.f4415b, bArr));
                m36839t(byteArrayOutputStream, c1509b2);
                i++;
            }
        } else {
            for (C1509b c1509b3 : c1509bArr) {
                m36838u(byteArrayOutputStream, c1509b3, m36857b(c1509b3.f4414a, c1509b3.f4415b, bArr));
            }
            int length2 = c1509bArr.length;
            while (i < length2) {
                m36839t(byteArrayOutputStream, c1509bArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C1510c.m36885b("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: b */
    private static String m36857b(String str, String str2, byte[] bArr) {
        if (str2.equals("classes.dex")) {
            return str;
        }
        return str + C1517g.m36832a(bArr) + str2;
    }

    /* renamed from: c */
    private static int m36856c(int i) {
        return m36845n(i * 2) / 8;
    }

    /* renamed from: d */
    private static int m36855d(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw C1510c.m36885b("Unexpected flag: " + i);
            }
            return i2;
        }
        throw C1510c.m36885b("HOT methods are not stored in the bitmap");
    }

    /* renamed from: e */
    private static void m36854e(InputStream inputStream, C1509b c1509b) throws IOException {
        int i = 0;
        for (int i2 = 0; i2 < c1509b.f4417d; i2++) {
            i += C1510c.m36880g(inputStream);
            c1509b.f4420g[i2] = i;
        }
    }

    /* renamed from: f */
    private static int m36853f(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(m36855d(2, i, i2)) ? 2 : 0;
        return bitSet.get(m36855d(4, i, i2)) ? i3 | 4 : i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static byte[] m36852g(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, C1510c.m36884c(inputStream, bArr.length))) {
            return C1510c.m36884c(inputStream, C1517g.f4427a.length);
        }
        throw C1510c.m36885b("Invalid magic");
    }

    /* renamed from: h */
    private static void m36851h(InputStream inputStream, C1509b c1509b) throws IOException {
        int available = inputStream.available() - c1509b.f4418e;
        int i = 0;
        while (inputStream.available() > available) {
            i += C1510c.m36880g(inputStream);
            c1509b.f4421h.put(Integer.valueOf(i), 1);
            for (int m36880g = C1510c.m36880g(inputStream); m36880g > 0; m36880g--) {
                m36843p(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw C1510c.m36885b("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C1509b[] m36850i(InputStream inputStream, byte[] bArr, C1509b[] c1509bArr) throws IOException {
        if (Arrays.equals(bArr, C1517g.f4431e)) {
            int m36878i = C1510c.m36878i(inputStream);
            byte[] m36883d = C1510c.m36883d(inputStream, (int) C1510c.m36879h(inputStream), (int) C1510c.m36879h(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m36883d);
                try {
                    C1509b[] m36849j = m36849j(byteArrayInputStream, m36878i, c1509bArr);
                    byteArrayInputStream.close();
                    return m36849j;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw C1510c.m36885b("Content found after the end of file");
        }
        throw C1510c.m36885b("Unsupported meta version");
    }

    /* renamed from: j */
    private static C1509b[] m36849j(InputStream inputStream, int i, C1509b[] c1509bArr) throws IOException {
        if (inputStream.available() == 0) {
            return new C1509b[0];
        }
        if (i == c1509bArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int m36880g = C1510c.m36880g(inputStream);
                iArr[i2] = C1510c.m36880g(inputStream);
                strArr[i2] = C1510c.m36882e(inputStream, m36880g);
            }
            for (int i3 = 0; i3 < i; i3++) {
                C1509b c1509b = c1509bArr[i3];
                if (c1509b.f4415b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    c1509b.f4417d = i4;
                    c1509b.f4420g = new int[i4];
                    m36854e(inputStream, c1509b);
                } else {
                    throw C1510c.m36885b("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c1509bArr;
        }
        throw C1510c.m36885b("Mismatched number of dex files found in metadata");
    }

    /* renamed from: k */
    private static void m36848k(InputStream inputStream, C1509b c1509b) throws IOException {
        BitSet valueOf = BitSet.valueOf(C1510c.m36884c(inputStream, C1510c.m36886a(c1509b.f4419f * 2)));
        int i = 0;
        while (true) {
            int i2 = c1509b.f4419f;
            if (i >= i2) {
                return;
            }
            int m36853f = m36853f(valueOf, i, i2);
            if (m36853f != 0) {
                Integer num = c1509b.f4421h.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                c1509b.f4421h.put(Integer.valueOf(i), Integer.valueOf(m36853f | num.intValue()));
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C1509b[] m36847l(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, C1517g.f4427a)) {
            int m36878i = C1510c.m36878i(inputStream);
            byte[] m36883d = C1510c.m36883d(inputStream, (int) C1510c.m36879h(inputStream), (int) C1510c.m36879h(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m36883d);
                try {
                    C1509b[] m36846m = m36846m(byteArrayInputStream, str, m36878i);
                    byteArrayInputStream.close();
                    return m36846m;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw C1510c.m36885b("Content found after the end of file");
        }
        throw C1510c.m36885b("Unsupported version");
    }

    /* renamed from: m */
    private static C1509b[] m36846m(InputStream inputStream, String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new C1509b[0];
        }
        C1509b[] c1509bArr = new C1509b[i];
        for (int i2 = 0; i2 < i; i2++) {
            int m36880g = C1510c.m36880g(inputStream);
            int m36880g2 = C1510c.m36880g(inputStream);
            c1509bArr[i2] = new C1509b(str, C1510c.m36882e(inputStream, m36880g), C1510c.m36879h(inputStream), m36880g2, (int) C1510c.m36879h(inputStream), (int) C1510c.m36879h(inputStream), new int[m36880g2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C1509b c1509b = c1509bArr[i3];
            m36851h(inputStream, c1509b);
            m36854e(inputStream, c1509b);
            m36848k(inputStream, c1509b);
        }
        return c1509bArr;
    }

    /* renamed from: n */
    private static int m36845n(int i) {
        return ((i + 8) - 1) & (-8);
    }

    /* renamed from: o */
    private static void m36844o(byte[] bArr, int i, int i2, C1509b c1509b) {
        int m36855d = m36855d(i, i2, c1509b.f4419f);
        int i3 = m36855d / 8;
        bArr[i3] = (byte) ((1 << (m36855d % 8)) | bArr[i3]);
    }

    /* renamed from: p */
    private static void m36843p(InputStream inputStream) throws IOException {
        C1510c.m36880g(inputStream);
        int m36878i = C1510c.m36878i(inputStream);
        if (m36878i == 6 || m36878i == 7) {
            return;
        }
        while (m36878i > 0) {
            C1510c.m36878i(inputStream);
            for (int m36878i2 = C1510c.m36878i(inputStream); m36878i2 > 0; m36878i2--) {
                C1510c.m36880g(inputStream);
            }
            m36878i--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static boolean m36842q(OutputStream outputStream, byte[] bArr, C1509b[] c1509bArr) throws IOException {
        if (Arrays.equals(bArr, C1517g.f4427a)) {
            m36859A(outputStream, c1509bArr);
            return true;
        } else if (Arrays.equals(bArr, C1517g.f4429c)) {
            m36834y(outputStream, c1509bArr);
            return true;
        } else if (Arrays.equals(bArr, C1517g.f4428b)) {
            m36833z(outputStream, c1509bArr);
            return true;
        } else if (Arrays.equals(bArr, C1517g.f4430d)) {
            m36835x(outputStream, c1509bArr);
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: r */
    private static void m36841r(OutputStream outputStream, C1509b c1509b) throws IOException {
        int i = 0;
        for (int i2 : c1509b.f4420g) {
            Integer valueOf = Integer.valueOf(i2);
            C1510c.m36872o(outputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static void m36840s(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f4425a);
        outputStream.write(bArr);
    }

    /* renamed from: t */
    private static void m36839t(OutputStream outputStream, C1509b c1509b) throws IOException {
        m36836w(outputStream, c1509b);
        m36841r(outputStream, c1509b);
        m36837v(outputStream, c1509b);
    }

    /* renamed from: u */
    private static void m36838u(OutputStream outputStream, C1509b c1509b, String str) throws IOException {
        C1510c.m36872o(outputStream, C1510c.m36877j(str));
        C1510c.m36872o(outputStream, c1509b.f4417d);
        C1510c.m36871p(outputStream, c1509b.f4418e);
        C1510c.m36871p(outputStream, c1509b.f4416c);
        C1510c.m36871p(outputStream, c1509b.f4419f);
        C1510c.m36874m(outputStream, str);
    }

    /* renamed from: v */
    private static void m36837v(OutputStream outputStream, C1509b c1509b) throws IOException {
        byte[] bArr = new byte[m36856c(c1509b.f4419f)];
        for (Map.Entry<Integer, Integer> entry : c1509b.f4421h.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                m36844o(bArr, 2, intValue, c1509b);
            }
            if ((intValue2 & 4) != 0) {
                m36844o(bArr, 4, intValue, c1509b);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: w */
    private static void m36836w(OutputStream outputStream, C1509b c1509b) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c1509b.f4421h.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C1510c.m36872o(outputStream, intValue - i);
                C1510c.m36872o(outputStream, 0);
                i = intValue;
            }
        }
    }

    /* renamed from: x */
    private static void m36835x(OutputStream outputStream, C1509b[] c1509bArr) throws IOException {
        C1510c.m36872o(outputStream, c1509bArr.length);
        for (C1509b c1509b : c1509bArr) {
            String m36857b = m36857b(c1509b.f4414a, c1509b.f4415b, C1517g.f4430d);
            C1510c.m36872o(outputStream, C1510c.m36877j(m36857b));
            C1510c.m36872o(outputStream, c1509b.f4421h.size());
            C1510c.m36872o(outputStream, c1509b.f4420g.length);
            C1510c.m36871p(outputStream, c1509b.f4416c);
            C1510c.m36874m(outputStream, m36857b);
            for (Integer num : c1509b.f4421h.keySet()) {
                C1510c.m36872o(outputStream, num.intValue());
            }
            for (int i : c1509b.f4420g) {
                C1510c.m36872o(outputStream, i);
            }
        }
    }

    /* renamed from: y */
    private static void m36834y(OutputStream outputStream, C1509b[] c1509bArr) throws IOException {
        C1510c.m36870q(outputStream, c1509bArr.length);
        for (C1509b c1509b : c1509bArr) {
            String m36857b = m36857b(c1509b.f4414a, c1509b.f4415b, C1517g.f4429c);
            C1510c.m36872o(outputStream, C1510c.m36877j(m36857b));
            C1510c.m36872o(outputStream, c1509b.f4420g.length);
            C1510c.m36871p(outputStream, c1509b.f4421h.size() * 4);
            C1510c.m36871p(outputStream, c1509b.f4416c);
            C1510c.m36874m(outputStream, m36857b);
            for (Integer num : c1509b.f4421h.keySet()) {
                C1510c.m36872o(outputStream, num.intValue());
                C1510c.m36872o(outputStream, 0);
            }
            for (int i : c1509b.f4420g) {
                C1510c.m36872o(outputStream, i);
            }
        }
    }

    /* renamed from: z */
    private static void m36833z(OutputStream outputStream, C1509b[] c1509bArr) throws IOException {
        byte[] m36858a = m36858a(c1509bArr, C1517g.f4428b);
        C1510c.m36870q(outputStream, c1509bArr.length);
        C1510c.m36875l(outputStream, m36858a);
    }
}
