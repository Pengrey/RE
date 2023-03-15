package p356sf;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc._ArraysJvm;
import sd.StringsJVM;
import tf.C10614g;

/* renamed from: sf.f */
/* loaded from: classes2.dex */
public class ByteString implements Serializable, Comparable {

    /* renamed from: w */
    private final byte[] f26543w;

    /* renamed from: x */
    private transient int f26544x;

    /* renamed from: y */
    private transient String f26545y;

    /* renamed from: z */
    public static final C10188a f26546z = new C10188a(null);

    /* renamed from: A */
    public static final ByteString f26547A = new ByteString(new byte[0]);

    /* compiled from: ByteString.kt */
    /* renamed from: sf.f$a */
    /* loaded from: classes2.dex */
    public static final class C10188a {
        private C10188a() {
        }

        public /* synthetic */ C10188a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: f */
        public static /* synthetic */ ByteString m8690f(C10188a c10188a, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C10198n0.m8596c();
            }
            return c10188a.m8691e(bArr, i, i2);
        }

        /* renamed from: a */
        public final ByteString m8695a(String str) {
            Intrinsics.isThisObjectNull(str, "<this>");
            byte[] m8616a = C10196l0.m8616a(str);
            if (m8616a != null) {
                return new ByteString(m8616a);
            }
            return null;
        }

        /* renamed from: b */
        public final ByteString m8694b(String str) {
            Intrinsics.isThisObjectNull(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((C10614g.m7514b(str.charAt(i2)) << 4) + C10614g.m7514b(str.charAt(i2 + 1)));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        /* renamed from: c */
        public final ByteString m8693c(String str, Charset charset) {
            Intrinsics.isThisObjectNull(str, "<this>");
            Intrinsics.isThisObjectNull(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkIfNull(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        /* renamed from: d */
        public final ByteString m8692d(String str) {
            Intrinsics.isThisObjectNull(str, "<this>");
            ByteString byteString = new ByteString(C10197m0.m8604a(str));
            byteString.m8697y(str);
            return byteString;
        }

        /* renamed from: e */
        public final ByteString m8691e(byte[] bArr, int i, int i2) {
            byte[] m310n;
            Intrinsics.isThisObjectNull(bArr, "<this>");
            int m8594e = C10198n0.m8594e(bArr, i2);
            C10198n0.m8597b(bArr.length, i, m8594e);
            m310n = _ArraysJvm.m310n(bArr, i, m8594e + i);
            return new ByteString(m310n);
        }

        /* renamed from: g */
        public final ByteString m8689g(InputStream inputStream, int i) throws IOException {
            Intrinsics.isThisObjectNull(inputStream, "<this>");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    i2 += read;
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }
    }

    public ByteString(byte[] bArr) {
        Intrinsics.isThisObjectNull(bArr, "data");
        this.f26543w = bArr;
    }

    /* renamed from: D */
    public static /* synthetic */ ByteString m8724D(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C10198n0.m8596c();
            }
            return byteString.m8725C(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    /* renamed from: d */
    public static final ByteString m8718d(String str) {
        return f26546z.m8694b(str);
    }

    /* renamed from: f */
    public static final ByteString m8716f(String str) {
        return f26546z.m8692d(str);
    }

    /* renamed from: p */
    public static /* synthetic */ int m8706p(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.m8708n(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString m8689g = f26546z.m8689g(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("w");
        declaredField.setAccessible(true);
        declaredField.set(this, m8689g.f26543w);
    }

    /* renamed from: u */
    public static /* synthetic */ int m8701u(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C10198n0.m8596c();
            }
            return byteString.m8703s(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f26543w.length);
        objectOutputStream.write(this.f26543w);
    }

    /* renamed from: A */
    public final ByteString m8727A() {
        return m8717e("SHA-256");
    }

    /* renamed from: B */
    public final boolean m8726B(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "prefix");
        return m8700v(0, byteString, 0, byteString.size());
    }

    /* renamed from: C */
    public ByteString m8725C(int i, int i2) {
        byte[] m310n;
        int m8595d = C10198n0.m8595d(this, i2);
        if (i >= 0) {
            if (!(m8595d <= m8713i().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + m8713i().length + ')').toString());
            }
            if (m8595d - i >= 0) {
                if (i == 0 && m8595d == m8713i().length) {
                    return this;
                }
                m310n = _ArraysJvm.m310n(m8713i(), i, m8595d);
                return new ByteString(m310n);
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    /* renamed from: E */
    public ByteString m8723E() {
        byte b;
        for (int i = 0; i < m8713i().length; i++) {
            byte b2 = m8713i()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] m8713i = m8713i();
                byte[] copyOf = Arrays.copyOf(m8713i, m8713i.length);
                Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    /* renamed from: F */
    public String m8722F() {
        String m8710l = m8710l();
        if (m8710l == null) {
            String m8603b = C10197m0.m8603b(m8705q());
            m8697y(m8603b);
            return m8603b;
        }
        return m8710l;
    }

    /* renamed from: G */
    public void m8721G(Buffer buffer, int i, int i2) {
        Intrinsics.isThisObjectNull(buffer, "buffer");
        C10614g.m7512d(this, buffer, i, i2);
    }

    /* renamed from: b */
    public String m8720b() {
        return C10196l0.m8614c(m8713i(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(p356sf.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            p181jd.Intrinsics.isThisObjectNull(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.m8714h(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m8714h(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p356sf.ByteString.m8719c(sf.f):int");
    }

    /* renamed from: e */
    public ByteString m8717e(String str) {
        Intrinsics.isThisObjectNull(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f26543w, 0, size());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkIfNull(digest, "digestBytes");
        return new ByteString(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == m8713i().length && byteString.m8699w(0, m8713i(), 0, m8713i().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m8715g(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "suffix");
        return m8700v(size() - byteString.size(), byteString, 0, byteString.size());
    }

    /* renamed from: h */
    public final byte m8714h(int i) {
        return m8704r(i);
    }

    public int hashCode() {
        int m8712j = m8712j();
        if (m8712j != 0) {
            return m8712j;
        }
        int hashCode = Arrays.hashCode(m8713i());
        m8698x(hashCode);
        return hashCode;
    }

    /* renamed from: i */
    public final byte[] m8713i() {
        return this.f26543w;
    }

    /* renamed from: j */
    public final int m8712j() {
        return this.f26544x;
    }

    /* renamed from: k */
    public int m8711k() {
        return m8713i().length;
    }

    /* renamed from: l */
    public final String m8710l() {
        return this.f26545y;
    }

    /* renamed from: m */
    public String m8709m() {
        byte[] m8713i;
        String m8947m;
        char[] cArr = new char[m8713i().length * 2];
        int i = 0;
        for (byte b : m8713i()) {
            int i2 = i + 1;
            cArr[i] = C10614g.m7510f()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C10614g.m7510f()[b & 15];
        }
        m8947m = StringsJVM.m8947m(cArr);
        return m8947m;
    }

    /* renamed from: n */
    public final int m8708n(ByteString byteString, int i) {
        Intrinsics.isThisObjectNull(byteString, "other");
        return m8707o(byteString.m8705q(), i);
    }

    /* renamed from: o */
    public int m8707o(byte[] bArr, int i) {
        Intrinsics.isThisObjectNull(bArr, "other");
        int length = m8713i().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C10198n0.m8598a(m8713i(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    /* renamed from: q */
    public byte[] m8705q() {
        return m8713i();
    }

    /* renamed from: r */
    public byte m8704r(int i) {
        return m8713i()[i];
    }

    /* renamed from: s */
    public final int m8703s(ByteString byteString, int i) {
        Intrinsics.isThisObjectNull(byteString, "other");
        return m8702t(byteString.m8705q(), i);
    }

    public final int size() {
        return m8711k();
    }

    /* renamed from: t */
    public int m8702t(byte[] bArr, int i) {
        Intrinsics.isThisObjectNull(bArr, "other");
        for (int min = Math.min(C10198n0.m8595d(this, i), m8713i().length - bArr.length); -1 < min; min--) {
            if (C10198n0.m8598a(m8713i(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public String toString() {
        String m8935y;
        String m8935y2;
        String m8935y3;
        ByteString byteString;
        byte[] m310n;
        String str;
        if (m8713i().length == 0) {
            str = "[size=0]";
        } else {
            int m7515a = C10614g.m7515a(m8713i(), 64);
            if (m7515a == -1) {
                if (m8713i().length <= 64) {
                    str = "[hex=" + m8709m() + ']';
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[size=");
                    sb2.append(m8713i().length);
                    sb2.append(" hex=");
                    int m8595d = C10198n0.m8595d(this, 64);
                    if (!(m8595d <= m8713i().length)) {
                        throw new IllegalArgumentException(("endIndex > length(" + m8713i().length + ')').toString());
                    }
                    if (m8595d + 0 >= 0) {
                        if (m8595d == m8713i().length) {
                            byteString = this;
                        } else {
                            m310n = _ArraysJvm.m310n(m8713i(), 0, m8595d);
                            byteString = new ByteString(m310n);
                        }
                        sb2.append(byteString.m8709m());
                        sb2.append("…]");
                        return sb2.toString();
                    }
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
            } else {
                String m8722F = m8722F();
                String substring = m8722F.substring(0, m7515a);
                Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                m8935y = StringsJVM.m8935y(substring, "\\", "\\\\", false, 4, null);
                m8935y2 = StringsJVM.m8935y(m8935y, "\n", "\\n", false, 4, null);
                m8935y3 = StringsJVM.m8935y(m8935y2, "\r", "\\r", false, 4, null);
                if (m7515a < m8722F.length()) {
                    return "[size=" + m8713i().length + " text=" + m8935y3 + "…]";
                }
                return "[text=" + m8935y3 + ']';
            }
        }
        return str;
    }

    /* renamed from: v */
    public boolean m8700v(int i, ByteString byteString, int i2, int i3) {
        Intrinsics.isThisObjectNull(byteString, "other");
        return byteString.m8699w(i2, m8713i(), i, i3);
    }

    /* renamed from: w */
    public boolean m8699w(int i, byte[] bArr, int i2, int i3) {
        Intrinsics.isThisObjectNull(bArr, "other");
        return i >= 0 && i <= m8713i().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C10198n0.m8598a(m8713i(), i, bArr, i2, i3);
    }

    /* renamed from: x */
    public final void m8698x(int i) {
        this.f26544x = i;
    }

    /* renamed from: y */
    public final void m8697y(String str) {
        this.f26545y = str;
    }

    /* renamed from: z */
    public final ByteString m8696z() {
        return m8717e("SHA-1");
    }
}
