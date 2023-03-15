package p356sf;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p181jd.Intrinsics;
import p489zc._ArraysJvm;
import sd.C10150d;
import tf.C10613f;

/* renamed from: sf.c */
/* loaded from: classes2.dex */
public final class Buffer implements InterfaceC10187e, InterfaceC10186d, Cloneable, ByteChannel {

    /* renamed from: w */
    public Segment f26525w;

    /* renamed from: x */
    private long f26526x;

    /* compiled from: Buffer.kt */
    /* renamed from: sf.c$a */
    /* loaded from: classes2.dex */
    public static final class C10183a implements Closeable {

        /* renamed from: w */
        public Buffer f26527w;

        /* renamed from: a */
        public final void m8790a(Segment segment) {
        }

        public void close() {
            if (this.f26527w != null) {
                this.f26527w = null;
                m8790a(null);
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    /* renamed from: A */
    public long mo8783A(InterfaceC10191h0 interfaceC10191h0) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10191h0, "source");
        long j = 0;
        while (true) {
            long read = interfaceC10191h0.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: A0 */
    public Buffer mo8773w0(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return m8791x0(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return m8814I0("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        Segment m8795o0 = m8795o0(i2);
        byte[] bArr = m8795o0.f26529a;
        int i3 = m8795o0.f26531c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = C10613f.m7520a()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        m8795o0.f26531c += i2;
        m8798f0(size() + i2);
        return this;
    }

    /* renamed from: B */
    public void mo8688B(Buffer buffer, long j) {
        Segment segment;
        Segment segment2;
        Intrinsics.isThisObjectNull(buffer, "source");
        if (buffer != this) {
            C10198n0.m8597b(buffer.size(), 0L, j);
            while (j > 0) {
                Segment segment3 = buffer.f26525w;
                Intrinsics.ifNullDoSomething(segment3);
                int i = segment3.f26531c;
                Intrinsics.ifNullDoSomething(buffer.f26525w);
                if (j < i - segment.f26530b) {
                    Segment segment4 = this.f26525w;
                    if (segment4 != null) {
                        Intrinsics.ifNullDoSomething(segment4);
                        segment2 = segment4.f26535g;
                    } else {
                        segment2 = null;
                    }
                    if (segment2 != null && segment2.f26533e) {
                        if ((segment2.f26531c + j) - (segment2.f26532d ? 0 : segment2.f26530b) <= 8192) {
                            Segment segment5 = buffer.f26525w;
                            Intrinsics.ifNullDoSomething(segment5);
                            segment5.m8784f(segment2, (int) j);
                            buffer.m8798f0(buffer.size() - j);
                            m8798f0(size() + j);
                            return;
                        }
                    }
                    Segment segment6 = buffer.f26525w;
                    Intrinsics.ifNullDoSomething(segment6);
                    buffer.f26525w = segment6.m8785e((int) j);
                }
                Segment segment7 = buffer.f26525w;
                Intrinsics.ifNullDoSomething(segment7);
                long j2 = segment7.f26531c - segment7.f26530b;
                buffer.f26525w = segment7.m8788b();
                Segment segment8 = this.f26525w;
                if (segment8 == null) {
                    this.f26525w = segment7;
                    segment7.f26535g = segment7;
                    segment7.f26534f = segment7;
                } else {
                    Intrinsics.ifNullDoSomething(segment8);
                    Segment segment9 = segment8.f26535g;
                    Intrinsics.ifNullDoSomething(segment9);
                    segment9.m8787c(segment7).m8789a();
                }
                buffer.m8798f0(buffer.size() - j2);
                m8798f0(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: B0 */
    public String mo8768B0(Charset charset) {
        Intrinsics.isThisObjectNull(charset, "charset");
        return m8803b0(this.f26526x, charset);
    }

    /* renamed from: C0 */
    public InputStream mo8767C0() {
        return new C10184b();
    }

    /* renamed from: D0 */
    public Buffer mo8775p(long j) {
        if (j == 0) {
            return m8791x0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment m8795o0 = m8795o0(i);
        byte[] bArr = m8795o0.f26529a;
        int i2 = m8795o0.f26531c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C10613f.m7520a()[(int) (15 & j)];
            j >>>= 4;
        }
        m8795o0.f26531c += i;
        m8798f0(size() + i);
        return this;
    }

    /* renamed from: E0 */
    public Buffer mo8781D(int i) {
        Segment m8795o0 = m8795o0(4);
        byte[] bArr = m8795o0.f26529a;
        int i2 = m8795o0.f26531c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        m8795o0.f26531c = i5 + 1;
        m8798f0(size() + 4);
        return this;
    }

    /* renamed from: F */
    public final Buffer m8819F() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.f26525w;
            Intrinsics.ifNullDoSomething(segment);
            Segment m8786d = segment.m8786d();
            buffer.f26525w = m8786d;
            m8786d.f26535g = m8786d;
            m8786d.f26534f = m8786d;
            for (Segment segment2 = segment.f26534f; segment2 != segment; segment2 = segment2.f26534f) {
                Segment segment3 = m8786d.f26535g;
                Intrinsics.ifNullDoSomething(segment3);
                Intrinsics.ifNullDoSomething(segment2);
                segment3.m8787c(segment2.m8786d());
            }
            buffer.m8798f0(size());
        }
        return buffer;
    }

    /* renamed from: F0 */
    public Buffer mo8772x(int i) {
        Segment m8795o0 = m8795o0(2);
        byte[] bArr = m8795o0.f26529a;
        int i2 = m8795o0.f26531c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        m8795o0.f26531c = i3 + 1;
        m8798f0(size() + 2);
        return this;
    }

    /* renamed from: G0 */
    public Buffer m8817G0(String str, int i, int i2, Charset charset) {
        Intrinsics.isThisObjectNull(str, "string");
        Intrinsics.isThisObjectNull(charset, "charset");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 >= i) {
            if (i2 <= str.length()) {
                if (Intrinsics.equals(charset, C10150d.f26472b)) {
                    return m8813J0(str, i, i2);
                }
                String substring = str.substring(i, i2);
                Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = substring.getBytes(charset);
                Intrinsics.checkIfNull(bytes, "this as java.lang.String).getBytes(charset)");
                return m8792v0(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
    }

    /* renamed from: H */
    public final Buffer m8816H(Buffer buffer, long j, long j2) {
        Intrinsics.isThisObjectNull(buffer, "out");
        C10198n0.m8597b(size(), j, j2);
        if (j2 != 0) {
            buffer.m8798f0(buffer.size() + j2);
            Segment segment = this.f26525w;
            while (true) {
                Intrinsics.ifNullDoSomething(segment);
                int i = segment.f26531c;
                int i2 = segment.f26530b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                segment = segment.f26534f;
            }
            while (j2 > 0) {
                Intrinsics.ifNullDoSomething(segment);
                Segment m8786d = segment.m8786d();
                int i3 = m8786d.f26530b + ((int) j);
                m8786d.f26530b = i3;
                m8786d.f26531c = Math.min(i3 + ((int) j2), m8786d.f26531c);
                Segment segment2 = buffer.f26525w;
                if (segment2 == null) {
                    m8786d.f26535g = m8786d;
                    m8786d.f26534f = m8786d;
                    buffer.f26525w = m8786d;
                } else {
                    Intrinsics.ifNullDoSomething(segment2);
                    Segment segment3 = segment2.f26535g;
                    Intrinsics.ifNullDoSomething(segment3);
                    segment3.m8787c(m8786d);
                }
                j2 -= m8786d.f26531c - m8786d.f26530b;
                segment = segment.f26534f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: H0 */
    public Buffer m8815H0(String str, Charset charset) {
        Intrinsics.isThisObjectNull(str, "string");
        Intrinsics.isThisObjectNull(charset, "charset");
        return m8817G0(str, 0, str.length(), charset);
    }

    /* renamed from: I */
    public int mo8766I(Options options) {
        Intrinsics.isThisObjectNull(options, "options");
        int m7516e = C10613f.m7516e(this, options, false, 2, null);
        if (m7516e == -1) {
            return -1;
        }
        skip(options.m8541l()[m7516e].size());
        return m7516e;
    }

    /* renamed from: I0 */
    public Buffer mo8774u0(String str) {
        Intrinsics.isThisObjectNull(str, "string");
        return m8813J0(str, 0, str.length());
    }

    /* renamed from: J */
    public String mo8765J() throws EOFException {
        return mo8756h0(Long.MAX_VALUE);
    }

    /* renamed from: J0 */
    public Buffer mo8776o(String str, int i, int i2) {
        char charAt;
        Intrinsics.isThisObjectNull(str, "string");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 >= i) {
            if (!(i2 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    Segment m8795o0 = m8795o0(1);
                    byte[] bArr = m8795o0.f26529a;
                    int i3 = m8795o0.f26531c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i4 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                    }
                    int i5 = m8795o0.f26531c;
                    int i6 = (i3 + i) - i5;
                    m8795o0.f26531c = i5 + i6;
                    m8798f0(size() + i6);
                } else {
                    if (charAt2 < 2048) {
                        Segment m8795o02 = m8795o0(2);
                        byte[] bArr2 = m8795o02.f26529a;
                        int i7 = m8795o02.f26531c;
                        bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                        m8795o02.f26531c = i7 + 2;
                        m8798f0(size() + 2);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                        if (charAt2 <= 56319) {
                            if (56320 <= charAt3 && charAt3 < 57344) {
                                int i9 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                                Segment m8795o03 = m8795o0(4);
                                byte[] bArr3 = m8795o03.f26529a;
                                int i10 = m8795o03.f26531c;
                                bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                m8795o03.f26531c = i10 + 4;
                                m8798f0(size() + 4);
                                i += 2;
                            }
                        }
                        m8791x0(63);
                        i = i8;
                    } else {
                        Segment m8795o04 = m8795o0(3);
                        byte[] bArr4 = m8795o04.f26529a;
                        int i11 = m8795o04.f26531c;
                        bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                        bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                        m8795o04.f26531c = i11 + 3;
                        m8798f0(size() + 3);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
    }

    /* renamed from: K */
    public byte[] mo8764K() {
        return mo8760U(size());
    }

    /* renamed from: K0 */
    public Buffer m8812K0(int i) {
        if (i < 128) {
            m8791x0(i);
        } else if (i < 2048) {
            Segment m8795o0 = m8795o0(2);
            byte[] bArr = m8795o0.f26529a;
            int i2 = m8795o0.f26531c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            m8795o0.f26531c = i2 + 2;
            m8798f0(size() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i < 57344) {
                z = true;
            }
            if (z) {
                m8791x0(63);
            } else if (i < 65536) {
                Segment m8795o02 = m8795o0(3);
                byte[] bArr2 = m8795o02.f26529a;
                int i3 = m8795o02.f26531c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                m8795o02.f26531c = i3 + 3;
                m8798f0(size() + 3);
            } else if (i <= 1114111) {
                Segment m8795o03 = m8795o0(4);
                byte[] bArr3 = m8795o03.f26529a;
                int i4 = m8795o03.f26531c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                m8795o03.f26531c = i4 + 4;
                m8798f0(size() + 4);
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C10198n0.m8589j(i));
            }
        }
        return this;
    }

    /* renamed from: L */
    public final byte m8811L(long j) {
        C10198n0.m8597b(size(), j, 1L);
        Segment segment = this.f26525w;
        if (segment == null) {
            Intrinsics.ifNullDoSomething(null);
            throw null;
        } else if (size() - j < j) {
            long size = size();
            while (size > j) {
                segment = segment.f26535g;
                Intrinsics.ifNullDoSomething(segment);
                size -= segment.f26531c - segment.f26530b;
            }
            Intrinsics.ifNullDoSomething(segment);
            return segment.f26529a[(int) ((segment.f26530b + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = (segment.f26531c - segment.f26530b) + j2;
                if (j3 <= j) {
                    segment = segment.f26534f;
                    Intrinsics.ifNullDoSomething(segment);
                    j2 = j3;
                } else {
                    Intrinsics.ifNullDoSomething(segment);
                    return segment.f26529a[(int) ((segment.f26530b + j) - j2)];
                }
            }
        }
    }

    /* renamed from: M */
    public long m8810M(byte b, long j, long j2) {
        Segment segment;
        int i;
        long j3 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (segment = this.f26525w) == null) {
                return -1L;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    segment = segment.f26535g;
                    Intrinsics.ifNullDoSomething(segment);
                    j3 -= segment.f26531c - segment.f26530b;
                }
                while (j3 < j2) {
                    byte[] bArr = segment.f26529a;
                    int min = (int) Math.min(segment.f26531c, (segment.f26530b + j2) - j3);
                    i = (int) ((segment.f26530b + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += segment.f26531c - segment.f26530b;
                    segment = segment.f26534f;
                    Intrinsics.ifNullDoSomething(segment);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (segment.f26531c - segment.f26530b) + j3;
                if (j4 > j) {
                    break;
                }
                segment = segment.f26534f;
                Intrinsics.ifNullDoSomething(segment);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = segment.f26529a;
                int min2 = (int) Math.min(segment.f26531c, (segment.f26530b + j2) - j3);
                i = (int) ((segment.f26530b + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i++;
                    }
                }
                j3 += segment.f26531c - segment.f26530b;
                segment = segment.f26534f;
                Intrinsics.ifNullDoSomething(segment);
                j = j3;
            }
            return -1L;
            return (i - segment.f26530b) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: O */
    public int mo8763O() throws EOFException {
        return C10198n0.m8593f(readInt());
    }

    /* renamed from: P */
    public long m8809P(ByteString byteString, long j) throws IOException {
        long j2 = j;
        Intrinsics.isThisObjectNull(byteString, "bytes");
        if (byteString.size() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                Segment segment = this.f26525w;
                if (segment != null) {
                    if (size() - j2 < j2) {
                        long size = size();
                        while (size > j2) {
                            segment = segment.f26535g;
                            Intrinsics.ifNullDoSomething(segment);
                            size -= segment.f26531c - segment.f26530b;
                        }
                        byte[] m8705q = byteString.m8705q();
                        byte b = m8705q[0];
                        int size2 = byteString.size();
                        long size3 = (size() - size2) + 1;
                        while (size < size3) {
                            byte[] bArr = segment.f26529a;
                            long j4 = size;
                            int min = (int) Math.min(segment.f26531c, (segment.f26530b + size3) - size);
                            for (int i = (int) ((segment.f26530b + j2) - j4); i < min; i++) {
                                if (bArr[i] == b && C10613f.m7519b(segment, i + 1, m8705q, 1, size2)) {
                                    return (i - segment.f26530b) + j4;
                                }
                            }
                            size = j4 + (segment.f26531c - segment.f26530b);
                            segment = segment.f26534f;
                            Intrinsics.ifNullDoSomething(segment);
                            j2 = size;
                        }
                    } else {
                        while (true) {
                            long j5 = (segment.f26531c - segment.f26530b) + j3;
                            if (j5 > j2) {
                                break;
                            }
                            segment = segment.f26534f;
                            Intrinsics.ifNullDoSomething(segment);
                            j3 = j5;
                        }
                        byte[] m8705q2 = byteString.m8705q();
                        byte b2 = m8705q2[0];
                        int size4 = byteString.size();
                        long size5 = (size() - size4) + 1;
                        while (j3 < size5) {
                            byte[] bArr2 = segment.f26529a;
                            long j6 = size5;
                            int min2 = (int) Math.min(segment.f26531c, (segment.f26530b + size5) - j3);
                            for (int i2 = (int) ((segment.f26530b + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2 && C10613f.m7519b(segment, i2 + 1, m8705q2, 1, size4)) {
                                    return (i2 - segment.f26530b) + j3;
                                }
                            }
                            j3 += segment.f26531c - segment.f26530b;
                            segment = segment.f26534f;
                            Intrinsics.ifNullDoSomething(segment);
                            j2 = j3;
                            size5 = j6;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: Q */
    public boolean mo8762Q() {
        return this.f26526x == 0;
    }

    /* renamed from: R */
    public long m8808R(ByteString byteString, long j) {
        int i;
        int i2;
        Intrinsics.isThisObjectNull(byteString, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            Segment segment = this.f26525w;
            if (segment == null) {
                return -1L;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    segment = segment.f26535g;
                    Intrinsics.ifNullDoSomething(segment);
                    j2 -= segment.f26531c - segment.f26530b;
                }
                if (byteString.size() == 2) {
                    byte m8714h = byteString.m8714h(0);
                    byte m8714h2 = byteString.m8714h(1);
                    while (j2 < size()) {
                        byte[] bArr = segment.f26529a;
                        i = (int) ((segment.f26530b + j) - j2);
                        int i3 = segment.f26531c;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (b != m8714h && b != m8714h2) {
                                i++;
                            }
                            i2 = segment.f26530b;
                        }
                        j2 += segment.f26531c - segment.f26530b;
                        segment = segment.f26534f;
                        Intrinsics.ifNullDoSomething(segment);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] m8705q = byteString.m8705q();
                while (j2 < size()) {
                    byte[] bArr2 = segment.f26529a;
                    i = (int) ((segment.f26530b + j) - j2);
                    int i4 = segment.f26531c;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        for (byte b3 : m8705q) {
                            if (b2 == b3) {
                                i2 = segment.f26530b;
                            }
                        }
                        i++;
                    }
                    j2 += segment.f26531c - segment.f26530b;
                    segment = segment.f26534f;
                    Intrinsics.ifNullDoSomething(segment);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j3 = (segment.f26531c - segment.f26530b) + j2;
                if (j3 > j) {
                    break;
                }
                segment = segment.f26534f;
                Intrinsics.ifNullDoSomething(segment);
                j2 = j3;
            }
            if (byteString.size() == 2) {
                byte m8714h3 = byteString.m8714h(0);
                byte m8714h4 = byteString.m8714h(1);
                while (j2 < size()) {
                    byte[] bArr3 = segment.f26529a;
                    i = (int) ((segment.f26530b + j) - j2);
                    int i5 = segment.f26531c;
                    while (i < i5) {
                        byte b4 = bArr3[i];
                        if (b4 != m8714h3 && b4 != m8714h4) {
                            i++;
                        }
                        i2 = segment.f26530b;
                    }
                    j2 += segment.f26531c - segment.f26530b;
                    segment = segment.f26534f;
                    Intrinsics.ifNullDoSomething(segment);
                    j = j2;
                }
                return -1L;
            }
            byte[] m8705q2 = byteString.m8705q();
            while (j2 < size()) {
                byte[] bArr4 = segment.f26529a;
                i = (int) ((segment.f26530b + j) - j2);
                int i6 = segment.f26531c;
                while (i < i6) {
                    byte b5 = bArr4[i];
                    for (byte b6 : m8705q2) {
                        if (b5 == b6) {
                            i2 = segment.f26530b;
                        }
                    }
                    i++;
                }
                j2 += segment.f26531c - segment.f26530b;
                segment = segment.f26534f;
                Intrinsics.ifNullDoSomething(segment);
                j = j2;
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: T */
    public long mo8761T(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "targetBytes");
        return m8808R(byteString, 0L);
    }

    /* renamed from: U */
    public byte[] mo8760U(long j) throws EOFException {
        if (j >= 0 && j <= 2147483647L) {
            if (size() >= j) {
                byte[] bArr = new byte[(int) j];
                m8806X(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    /* renamed from: W */
    public boolean m8807W(long j, ByteString byteString, int i, int i2) {
        Intrinsics.isThisObjectNull(byteString, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m8811L(i3 + j) != byteString.m8714h(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X */
    public void m8806X(byte[] bArr) throws EOFException {
        Intrinsics.isThisObjectNull(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    /* renamed from: a */
    public final void m8805a() {
        skip(size());
    }

    /* renamed from: a0 */
    public long m8804a0() throws EOFException {
        if (size() >= 8) {
            Segment segment = this.f26525w;
            Intrinsics.ifNullDoSomething(segment);
            int i = segment.f26530b;
            int i2 = segment.f26531c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = segment.f26529a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            m8798f0(size() - 8);
            if (i10 == i2) {
                this.f26525w = segment.m8788b();
                SegmentPool.m8770b(segment);
            } else {
                segment.f26530b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public Buffer mo8759b() {
        return this;
    }

    /* renamed from: b0 */
    public String m8803b0(long j, Charset charset) throws EOFException {
        Intrinsics.isThisObjectNull(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (this.f26526x >= j) {
                if (i == 0) {
                    return BuildConfig.VERSION_NAME;
                }
                Segment segment = this.f26525w;
                Intrinsics.ifNullDoSomething(segment);
                int i2 = segment.f26530b;
                if (i2 + j > segment.f26531c) {
                    return new String(mo8760U(j), charset);
                }
                int i3 = (int) j;
                String str = new String(segment.f26529a, i2, i3, charset);
                int i4 = segment.f26530b + i3;
                segment.f26530b = i4;
                this.f26526x -= j;
                if (i4 == segment.f26531c) {
                    this.f26525w = segment.m8788b();
                    SegmentPool.m8770b(segment);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    /* renamed from: c */
    public Buffer clone() {
        return m8819F();
    }

    /* renamed from: c0 */
    public short mo8758c0() throws EOFException {
        return C10198n0.m8591h(readShort());
    }

    public void close() {
    }

    /* renamed from: d0 */
    public String m8801d0() {
        return m8803b0(this.f26526x, C10150d.f26472b);
    }

    /* renamed from: e */
    public final long m8800e() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.f26525w;
        Intrinsics.ifNullDoSomething(segment);
        Segment segment2 = segment.f26535g;
        Intrinsics.ifNullDoSomething(segment2);
        int i = segment2.f26531c;
        if (i < 8192 && segment2.f26533e) {
            size -= i - segment2.f26530b;
        }
        return size;
    }

    /* renamed from: e0 */
    public int m8799e0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (size() != 0) {
            byte m8811L = m8811L(0L);
            boolean z = false;
            if ((m8811L & 128) == 0) {
                i = m8811L & Byte.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((m8811L & 224) == 192) {
                i = m8811L & 31;
                i2 = 2;
                i3 = 128;
            } else if ((m8811L & 240) == 224) {
                i = m8811L & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((m8811L & 248) != 240) {
                skip(1L);
                return 65533;
            } else {
                i = m8811L & 7;
                i2 = 4;
                i3 = 65536;
            }
            long j = i2;
            if (size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte m8811L2 = m8811L(j2);
                    if ((m8811L2 & 192) != 128) {
                        skip(j2);
                        return 65533;
                    }
                    i = (i << 6) | (m8811L2 & 63);
                }
                skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if (55296 <= i && i < 57344) {
                    z = true;
                }
                if (!z && i >= i3) {
                    return i;
                }
                return 65533;
            }
            throw new EOFException("size < " + i2 + ": " + size() + " (to read code point prefixed 0x" + C10198n0.m8590i(m8811L) + ')');
        }
        throw new EOFException();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Buffer)) {
                return false;
            }
            Buffer buffer = (Buffer) obj;
            if (size() != buffer.size()) {
                return false;
            }
            if (size() != 0) {
                Segment segment = this.f26525w;
                Intrinsics.ifNullDoSomething(segment);
                Segment segment2 = buffer.f26525w;
                Intrinsics.ifNullDoSomething(segment2);
                int i = segment.f26530b;
                int i2 = segment2.f26530b;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(segment.f26531c - i, segment2.f26531c - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (segment.f26529a[i] != segment2.f26529a[i2]) {
                            return false;
                        }
                        j2++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == segment.f26531c) {
                        segment = segment.f26534f;
                        Intrinsics.ifNullDoSomething(segment);
                        i = segment.f26530b;
                    }
                    if (i2 == segment2.f26531c) {
                        segment2 = segment2.f26534f;
                        Intrinsics.ifNullDoSomething(segment2);
                        i2 = segment2.f26530b;
                    }
                    j += min;
                }
            }
        }
        return true;
    }

    /* renamed from: f0 */
    public final void m8798f0(long j) {
        this.f26526x = j;
    }

    public void flush() {
    }

    /* renamed from: g0 */
    public long mo8757g0() throws EOFException {
        return C10198n0.m8592g(m8804a0());
    }

    /* renamed from: h0 */
    public String mo8756h0(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            byte b = (byte) 10;
            long m8810M = m8810M(b, 0L, j2);
            if (m8810M != -1) {
                return C10613f.m7518c(this, m8810M);
            }
            if (j2 < size() && m8811L(j2 - 1) == ((byte) 13) && m8811L(j2) == b) {
                return C10613f.m7518c(this, j2);
            }
            Buffer buffer = new Buffer();
            m8816H(buffer, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.mo8751r().m8709m() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public int hashCode() {
        Segment segment = this.f26525w;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.f26531c;
            for (int i3 = segment.f26530b; i3 < i2; i3++) {
                i = (i * 31) + segment.f26529a[i3];
            }
            segment = segment.f26534f;
            Intrinsics.ifNullDoSomething(segment);
        } while (segment != this.f26525w);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public final ByteString m8797j0() {
        if (size() <= 2147483647L) {
            return m8796l0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    /* renamed from: k0 */
    public long mo8755k0(ByteString byteString) throws IOException {
        Intrinsics.isThisObjectNull(byteString, "bytes");
        return m8809P(byteString, 0L);
    }

    /* renamed from: l */
    public String mo8754l(long j) throws EOFException {
        return m8803b0(j, C10150d.f26472b);
    }

    /* renamed from: l0 */
    public final ByteString m8796l0(int i) {
        if (i == 0) {
            return ByteString.f26547A;
        }
        C10198n0.m8597b(size(), 0L, i);
        Segment segment = this.f26525w;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.ifNullDoSomething(segment);
            int i5 = segment.f26531c;
            int i6 = segment.f26530b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                segment = segment.f26534f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.f26525w;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.ifNullDoSomething(segment2);
            bArr[i7] = segment2.f26529a;
            i2 += segment2.f26531c - segment2.f26530b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.f26530b;
            segment2.f26532d = true;
            i7++;
            segment2 = segment2.f26534f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    /* renamed from: n0 */
    public InterfaceC10187e mo8753n0() {
        return C10200t.m8565c(new PeekSource(this));
    }

    /* renamed from: o0 */
    public final Segment m8795o0(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            Segment segment = this.f26525w;
            if (segment == null) {
                Segment m8769c = SegmentPool.m8769c();
                this.f26525w = m8769c;
                m8769c.f26535g = m8769c;
                m8769c.f26534f = m8769c;
                return m8769c;
            }
            Intrinsics.ifNullDoSomething(segment);
            Segment segment2 = segment.f26535g;
            Intrinsics.ifNullDoSomething(segment2);
            return (segment2.f26531c + i > 8192 || !segment2.f26533e) ? segment2.m8787c(SegmentPool.m8769c()) : segment2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: q */
    public Buffer mo8752q() {
        return this;
    }

    /* renamed from: q0 */
    public Buffer mo8782C(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "byteString");
        byteString.m8721G(this, 0, byteString.size());
        return this;
    }

    /* renamed from: r */
    public ByteString mo8751r() {
        return mo8748u(size());
    }

    /* renamed from: r0 */
    public void mo8750r0(long j) throws EOFException {
        if (this.f26526x < j) {
            throw new EOFException();
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        Intrinsics.isThisObjectNull(byteBuffer, "sink");
        Segment segment = this.f26525w;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.f26531c - segment.f26530b);
        byteBuffer.put(segment.f26529a, segment.f26530b, min);
        int i = segment.f26530b + min;
        segment.f26530b = i;
        this.f26526x -= min;
        if (i == segment.f26531c) {
            this.f26525w = segment.m8788b();
            SegmentPool.m8770b(segment);
        }
        return min;
    }

    public byte readByte() throws EOFException {
        if (size() != 0) {
            Segment segment = this.f26525w;
            Intrinsics.ifNullDoSomething(segment);
            int i = segment.f26530b;
            int i2 = segment.f26531c;
            int i3 = i + 1;
            byte b = segment.f26529a[i];
            m8798f0(size() - 1);
            if (i3 == i2) {
                this.f26525w = segment.m8788b();
                SegmentPool.m8770b(segment);
            } else {
                segment.f26530b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public int readInt() throws EOFException {
        if (size() >= 4) {
            Segment segment = this.f26525w;
            Intrinsics.ifNullDoSomething(segment);
            int i = segment.f26530b;
            int i2 = segment.f26531c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.f26529a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            m8798f0(size() - 4);
            if (i8 == i2) {
                this.f26525w = segment.m8788b();
                SegmentPool.m8770b(segment);
            } else {
                segment.f26530b = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        if (size() >= 2) {
            Segment segment = this.f26525w;
            Intrinsics.ifNullDoSomething(segment);
            int i = segment.f26530b;
            int i2 = segment.f26531c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.f26529a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            m8798f0(size() - 2);
            if (i4 == i2) {
                this.f26525w = segment.m8788b();
                SegmentPool.m8770b(segment);
            } else {
                segment.f26530b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public boolean mo8749s(long j, ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "bytes");
        return m8807W(j, byteString, 0, byteString.size());
    }

    public final long size() {
        return this.f26526x;
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.f26525w;
            if (segment != null) {
                int min = (int) Math.min(j, segment.f26531c - segment.f26530b);
                long j2 = min;
                m8798f0(size() - j2);
                j -= j2;
                int i = segment.f26530b + min;
                segment.f26530b = i;
                if (i == segment.f26531c) {
                    this.f26525w = segment.m8788b();
                    SegmentPool.m8770b(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t0 */
    public Buffer mo8779Z(byte[] bArr) {
        Intrinsics.isThisObjectNull(bArr, "source");
        return m8792v0(bArr, 0, bArr.length);
    }

    /* renamed from: timeout */
    public Timeout mo40537timeout() {
        return Timeout.f26564d;
    }

    public String toString() {
        return m8797j0().toString();
    }

    /* renamed from: u */
    public ByteString mo8748u(long j) throws EOFException {
        if (j >= 0 && j <= 2147483647L) {
            if (size() >= j) {
                if (j >= 4096) {
                    ByteString m8796l0 = m8796l0((int) j);
                    skip(j);
                    return m8796l0;
                }
                return new ByteString(mo8760U(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    /* renamed from: v0 */
    public Buffer mo8777g(byte[] bArr, int i, int i2) {
        Intrinsics.isThisObjectNull(bArr, "source");
        long j = i2;
        C10198n0.m8597b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment m8795o0 = m8795o0(1);
            int min = Math.min(i3 - i, 8192 - m8795o0.f26531c);
            int i4 = i + min;
            _ArraysJvm.m319e(bArr, m8795o0.f26529a, m8795o0.f26531c, i, i4);
            m8795o0.f26531c += min;
            i = i4;
        }
        m8798f0(size() + j);
        return this;
    }

    /* renamed from: w */
    public long mo8747w(InterfaceC10189f0 interfaceC10189f0) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC10189f0, "sink");
        long size = size();
        if (size > 0) {
            interfaceC10189f0.mo8688B(this, size);
        }
        return size;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        Intrinsics.isThisObjectNull(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment m8795o0 = m8795o0(1);
            int min = Math.min(i, 8192 - m8795o0.f26531c);
            byteBuffer.get(m8795o0.f26529a, m8795o0.f26531c, min);
            i -= min;
            m8795o0.f26531c += min;
        }
        this.f26526x += remaining;
        return remaining;
    }

    /* renamed from: x0 */
    public Buffer mo8780S(int i) {
        Segment m8795o0 = m8795o0(1);
        byte[] bArr = m8795o0.f26529a;
        int i2 = m8795o0.f26531c;
        m8795o0.f26531c = i2 + 1;
        bArr[i2] = (byte) i;
        m8798f0(size() + 1);
        return this;
    }

    /* renamed from: z */
    public boolean mo8746z(long j) {
        return this.f26526x >= j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[EDGE_INSN: B:42:0x00ae->B:37:0x00ae ?: BREAK  , SYNTHETIC] */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo8745z0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            sf.c0 r6 = r14.f26525w
            p181jd.Intrinsics.ifNullDoSomething(r6)
            byte[] r7 = r6.f26529a
            int r8 = r6.f26530b
            int r9 = r6.f26531c
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            sf.c r0 = new sf.c
            r0.<init>()
            sf.c r0 = r0.m8821D0(r4)
            sf.c r0 = r0.m8791x0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m8801d0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = p356sf.C10198n0.m8590i(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            sf.c0 r7 = r6.m8788b()
            r14.f26525w = r7
            p356sf.SegmentPool.m8770b(r6)
            goto La8
        La6:
            r6.f26530b = r8
        La8:
            if (r1 != 0) goto Lae
            sf.c0 r6 = r14.f26525w
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.m8798f0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p356sf.Buffer.mo8745z0():long");
    }

    /* compiled from: Buffer.kt */
    /* renamed from: sf.c$b */
    /* loaded from: classes2.dex */
    public static final class C10184b extends InputStream {
        C10184b() {
        }

        public int available() {
            return (int) Math.min(Buffer.this.size(), (long) Reader.READ_DONE);
        }

        public void close() {
        }

        public int read() {
            if (Buffer.this.size() > 0) {
                return Buffer.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return Buffer.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            Intrinsics.isThisObjectNull(bArr, "sink");
            return Buffer.this.read(bArr, i, i2);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        Intrinsics.isThisObjectNull(bArr, "sink");
        C10198n0.m8597b(bArr.length, i, i2);
        Segment segment = this.f26525w;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.f26531c - segment.f26530b);
        byte[] bArr2 = segment.f26529a;
        int i3 = segment.f26530b;
        _ArraysJvm.m319e(bArr2, bArr, i, i3, i3 + min);
        segment.f26530b += min;
        m8798f0(size() - min);
        if (segment.f26530b == segment.f26531c) {
            this.f26525w = segment.m8788b();
            SegmentPool.m8770b(segment);
        }
        return min;
    }

    public long read(Buffer buffer, long j) {
        Intrinsics.isThisObjectNull(buffer, "sink");
        if (j >= 0) {
            if (size() == 0) {
                return -1L;
            }
            if (j > size()) {
                j = size();
            }
            buffer.mo8688B(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }
}
