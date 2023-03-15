package p356sf;

import java.security.MessageDigest;
import p181jd.Intrinsics;
import p489zc.C13768k;
import p489zc._ArraysJvm;
import tf.C10617j;

/* renamed from: sf.e0 */
/* loaded from: classes2.dex */
public final class SegmentedByteString extends ByteString {

    /* renamed from: B */
    private final transient byte[][] f26541B;

    /* renamed from: C */
    private final transient int[] f26542C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.f26547A.m8713i());
        Intrinsics.isThisObjectNull(bArr, "segments");
        Intrinsics.isThisObjectNull(iArr, "directory");
        this.f26541B = bArr;
        this.f26542C = iArr;
    }

    /* renamed from: K */
    private final ByteString m8738K() {
        return new ByteString(m8739J());
    }

    private final Object writeReplace() {
        return m8738K();
    }

    /* renamed from: C */
    public ByteString m8744C(int i, int i2) {
        int m8595d = C10198n0.m8595d(this, i2);
        if (i >= 0) {
            if (!(m8595d <= size())) {
                throw new IllegalArgumentException(("endIndex=" + m8595d + " > length(" + size() + ')').toString());
            }
            int i3 = m8595d - i;
            if (i3 >= 0) {
                if (i == 0 && m8595d == size()) {
                    return this;
                }
                if (i == m8595d) {
                    return ByteString.f26547A;
                }
                int m7486b = C10617j.m7486b(this, i);
                int m7486b2 = C10617j.m7486b(this, m8595d - 1);
                byte[][] bArr = (byte[][]) C13768k.m347p(m8740I(), m7486b, m7486b2 + 1);
                int[] iArr = new int[bArr.length * 2];
                if (m7486b <= m7486b2) {
                    int i4 = 0;
                    int i5 = m7486b;
                    while (true) {
                        iArr[i4] = Math.min(m8741H()[i5] - i, i3);
                        int i6 = i4 + 1;
                        iArr[i4 + bArr.length] = m8741H()[m8740I().length + i5];
                        if (i5 == m7486b2) {
                            break;
                        }
                        i5++;
                        i4 = i6;
                    }
                }
                int i7 = m7486b != 0 ? m8741H()[m7486b - 1] : 0;
                int length = bArr.length;
                iArr[length] = iArr[length] + (i - i7);
                return new SegmentedByteString(bArr, iArr);
            }
            throw new IllegalArgumentException(("endIndex=" + m8595d + " < beginIndex=" + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
    }

    /* renamed from: E */
    public ByteString m8743E() {
        return m8738K().m8723E();
    }

    /* renamed from: G */
    public void m8742G(Buffer buffer, int i, int i2) {
        Intrinsics.isThisObjectNull(buffer, "buffer");
        int i3 = i + i2;
        int m7486b = C10617j.m7486b(this, i);
        while (i < i3) {
            int i4 = m7486b == 0 ? 0 : m8741H()[m7486b - 1];
            int i5 = m8741H()[m8740I().length + m7486b];
            int min = Math.min(i3, (m8741H()[m7486b] - i4) + i4) - i;
            int i6 = i5 + (i - i4);
            Segment segment = new Segment(m8740I()[m7486b], i6, i6 + min, true, false);
            Segment segment2 = buffer.f26525w;
            if (segment2 == null) {
                segment.f26535g = segment;
                segment.f26534f = segment;
                buffer.f26525w = segment;
            } else {
                Intrinsics.ifNullDoSomething(segment2);
                Segment segment3 = segment2.f26535g;
                Intrinsics.ifNullDoSomething(segment3);
                segment3.m8787c(segment);
            }
            i += min;
            m7486b++;
        }
        buffer.m8798f0(buffer.size() + i2);
    }

    /* renamed from: H */
    public final int[] m8741H() {
        return this.f26542C;
    }

    /* renamed from: I */
    public final byte[][] m8740I() {
        return this.f26541B;
    }

    /* renamed from: J */
    public byte[] m8739J() {
        byte[] bArr = new byte[size()];
        int length = m8740I().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = m8741H()[length + i];
            int i5 = m8741H()[i];
            int i6 = i5 - i2;
            _ArraysJvm.m319e(m8740I()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: b */
    public String m8737b() {
        return m8738K().m8720b();
    }

    /* renamed from: e */
    public ByteString m8736e(String str) {
        Intrinsics.isThisObjectNull(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = m8740I().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m8741H()[length + i];
            int i4 = m8741H()[i];
            messageDigest.update(m8740I()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
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
            if (byteString.size() == size() && m8729v(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int m8712j = m8712j();
        if (m8712j != 0) {
            return m8712j;
        }
        int length = m8740I().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = m8741H()[length + i];
            int i5 = m8741H()[i];
            byte[] bArr = m8740I()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        m8698x(i2);
        return i2;
    }

    /* renamed from: k */
    public int m8735k() {
        return m8741H()[m8740I().length - 1];
    }

    /* renamed from: m */
    public String m8734m() {
        return m8738K().m8709m();
    }

    /* renamed from: o */
    public int m8733o(byte[] bArr, int i) {
        Intrinsics.isThisObjectNull(bArr, "other");
        return m8738K().m8707o(bArr, i);
    }

    /* renamed from: q */
    public byte[] m8732q() {
        return m8739J();
    }

    /* renamed from: r */
    public byte m8731r(int i) {
        C10198n0.m8597b(m8741H()[m8740I().length - 1], i, 1L);
        int m7486b = C10617j.m7486b(this, i);
        return m8740I()[m7486b][(i - (m7486b == 0 ? 0 : m8741H()[m7486b - 1])) + m8741H()[m8740I().length + m7486b]];
    }

    /* renamed from: t */
    public int m8730t(byte[] bArr, int i) {
        Intrinsics.isThisObjectNull(bArr, "other");
        return m8738K().m8702t(bArr, i);
    }

    public String toString() {
        return m8738K().toString();
    }

    /* renamed from: v */
    public boolean m8729v(int i, ByteString byteString, int i2, int i3) {
        Intrinsics.isThisObjectNull(byteString, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int m7486b = C10617j.m7486b(this, i);
        while (i < i4) {
            int i5 = m7486b == 0 ? 0 : m8741H()[m7486b - 1];
            int i6 = m8741H()[m8740I().length + m7486b];
            int min = Math.min(i4, (m8741H()[m7486b] - i5) + i5) - i;
            if (!byteString.m8699w(i2, m8740I()[m7486b], i6 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            m7486b++;
        }
        return true;
    }

    /* renamed from: w */
    public boolean m8728w(int i, byte[] bArr, int i2, int i3) {
        Intrinsics.isThisObjectNull(bArr, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int m7486b = C10617j.m7486b(this, i);
        while (i < i4) {
            int i5 = m7486b == 0 ? 0 : m8741H()[m7486b - 1];
            int i6 = m8741H()[m8740I().length + m7486b];
            int min = Math.min(i4, (m8741H()[m7486b] - i5) + i5) - i;
            if (!C10198n0.m8598a(m8740I()[m7486b], i6 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            m7486b++;
        }
        return true;
    }
}
