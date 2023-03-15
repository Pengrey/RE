package p356sf;

import androidx.constraintlayout.widget.C0868i;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p181jd.Intrinsics;
import sd.CharJVM;
import tf.C10613f;

/* renamed from: sf.b0 */
/* loaded from: classes2.dex */
public final class RealBufferedSource implements InterfaceC10187e {

    /* renamed from: w */
    public final InterfaceC10191h0 f26521w;

    /* renamed from: x */
    public final Buffer f26522x;

    /* renamed from: y */
    public boolean f26523y;

    public RealBufferedSource(InterfaceC10191h0 interfaceC10191h0) {
        Intrinsics.isThisObjectNull(interfaceC10191h0, "source");
        this.f26521w = interfaceC10191h0;
        this.f26522x = new Buffer();
    }

    /* renamed from: B0 */
    public String mo8768B0(Charset charset) {
        Intrinsics.isThisObjectNull(charset, "charset");
        this.f26522x.mo8783A(this.f26521w);
        return this.f26522x.mo8768B0(charset);
    }

    /* renamed from: C0 */
    public InputStream mo8767C0() {
        return new C10182a();
    }

    /* renamed from: I */
    public int mo8766I(Options options) {
        Intrinsics.isThisObjectNull(options, "options");
        if (!this.f26523y) {
            while (true) {
                int m7517d = C10613f.m7517d(this.f26522x, options, true);
                if (m7517d == -2) {
                    if (this.f26521w.read(this.f26522x, 8192L) == -1) {
                        break;
                    }
                } else if (m7517d != -1) {
                    this.f26522x.skip(options.m8541l()[m7517d].size());
                    return m7517d;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: J */
    public String mo8765J() {
        return mo8756h0(Long.MAX_VALUE);
    }

    /* renamed from: K */
    public byte[] mo8764K() {
        this.f26522x.mo8783A(this.f26521w);
        return this.f26522x.mo8764K();
    }

    /* renamed from: O */
    public int mo8763O() {
        mo8750r0(4L);
        return this.f26522x.mo8763O();
    }

    /* renamed from: Q */
    public boolean mo8762Q() {
        if (!this.f26523y) {
            return this.f26522x.mo8762Q() && this.f26521w.read(this.f26522x, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: T */
    public long mo8761T(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "targetBytes");
        return m8824h(byteString, 0L);
    }

    /* renamed from: U */
    public byte[] mo8760U(long j) {
        mo8750r0(j);
        return this.f26522x.mo8760U(j);
    }

    /* renamed from: a */
    public long m8827a(byte b) {
        return m8826c(b, 0L, Long.MAX_VALUE);
    }

    /* renamed from: b */
    public Buffer mo8759b() {
        return this.f26522x;
    }

    /* renamed from: c */
    public long m8826c(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f26523y) {
            if (0 > j || j > j2) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
            }
            while (j < j2) {
                long m8810M = this.f26522x.m8810M(b, j, j2);
                if (m8810M != -1) {
                    return m8810M;
                }
                long size = this.f26522x.size();
                if (size >= j2 || this.f26521w.read(this.f26522x, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, size);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: c0 */
    public short mo8758c0() {
        mo8750r0(2L);
        return this.f26522x.mo8758c0();
    }

    public void close() {
        if (this.f26523y) {
            return;
        }
        this.f26523y = true;
        this.f26521w.close();
        this.f26522x.m8805a();
    }

    /* renamed from: e */
    public long m8825e(ByteString byteString, long j) {
        Intrinsics.isThisObjectNull(byteString, "bytes");
        if (!(!this.f26523y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m8809P = this.f26522x.m8809P(byteString, j);
            if (m8809P != -1) {
                return m8809P;
            }
            long size = this.f26522x.size();
            if (this.f26521w.read(this.f26522x, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - byteString.size()) + 1);
        }
    }

    /* renamed from: g0 */
    public long mo8757g0() {
        mo8750r0(8L);
        return this.f26522x.mo8757g0();
    }

    /* renamed from: h */
    public long m8824h(ByteString byteString, long j) {
        Intrinsics.isThisObjectNull(byteString, "targetBytes");
        if (!(!this.f26523y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m8808R = this.f26522x.m8808R(byteString, j);
            if (m8808R != -1) {
                return m8808R;
            }
            long size = this.f26522x.size();
            if (this.f26521w.read(this.f26522x, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    /* renamed from: h0 */
    public String mo8756h0(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long m8826c = m8826c(b, 0L, j2);
            if (m8826c != -1) {
                return C10613f.m7518c(this.f26522x, m8826c);
            }
            if (j2 < Long.MAX_VALUE && mo8746z(j2) && this.f26522x.m8811L(j2 - 1) == ((byte) 13) && mo8746z(1 + j2) && this.f26522x.m8811L(j2) == b) {
                return C10613f.m7518c(this.f26522x, j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.f26522x;
            buffer2.m8816H(buffer, 0L, Math.min(32, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f26522x.size(), j) + " content=" + buffer.mo8751r().m8709m() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public boolean isOpen() {
        return !this.f26523y;
    }

    /* renamed from: k0 */
    public long mo8755k0(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "bytes");
        return m8825e(byteString, 0L);
    }

    /* renamed from: l */
    public String mo8754l(long j) {
        mo8750r0(j);
        return this.f26522x.mo8754l(j);
    }

    /* renamed from: n0 */
    public InterfaceC10187e mo8753n0() {
        return C10200t.m8565c(new PeekSource(this));
    }

    /* renamed from: q */
    public Buffer mo8752q() {
        return this.f26522x;
    }

    /* renamed from: r */
    public ByteString mo8751r() {
        this.f26522x.mo8783A(this.f26521w);
        return this.f26522x.mo8751r();
    }

    /* renamed from: r0 */
    public void mo8750r0(long j) {
        if (!mo8746z(j)) {
            throw new EOFException();
        }
    }

    public long read(Buffer buffer, long j) {
        Intrinsics.isThisObjectNull(buffer, "sink");
        if (j >= 0) {
            if (!this.f26523y) {
                if (this.f26522x.size() == 0 && this.f26521w.read(this.f26522x, 8192L) == -1) {
                    return -1L;
                }
                return this.f26522x.read(buffer, Math.min(j, this.f26522x.size()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    public byte readByte() {
        mo8750r0(1L);
        return this.f26522x.readByte();
    }

    public int readInt() {
        mo8750r0(4L);
        return this.f26522x.readInt();
    }

    public short readShort() {
        mo8750r0(2L);
        return this.f26522x.readShort();
    }

    /* renamed from: s */
    public boolean mo8749s(long j, ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "bytes");
        return m8823t(j, byteString, 0, byteString.size());
    }

    public void skip(long j) {
        if (!(!this.f26523y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.f26522x.size() == 0 && this.f26521w.read(this.f26522x, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f26522x.size());
            this.f26522x.skip(min);
            j -= min;
        }
    }

    /* renamed from: t */
    public boolean m8823t(long j, ByteString byteString, int i, int i2) {
        int i3;
        Intrinsics.isThisObjectNull(byteString, "bytes");
        if (!this.f26523y) {
            if (j >= 0 && i >= 0 && i2 >= 0 && byteString.size() - i >= i2) {
                for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                    long j2 = i3 + j;
                    i3 = (mo8746z(1 + j2) && this.f26522x.m8811L(j2) == byteString.m8714h(i + i3)) ? i3 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: timeout */
    public Timeout mo40537timeout() {
        return this.f26521w.mo40537timeout();
    }

    public String toString() {
        return "buffer(" + this.f26521w + ')';
    }

    /* renamed from: u */
    public ByteString mo8748u(long j) {
        mo8750r0(j);
        return this.f26522x.mo8748u(j);
    }

    /* renamed from: w */
    public long mo8747w(InterfaceC10189f0 interfaceC10189f0) {
        Intrinsics.isThisObjectNull(interfaceC10189f0, "sink");
        long j = 0;
        while (this.f26521w.read(this.f26522x, 8192L) != -1) {
            long m8800e = this.f26522x.m8800e();
            if (m8800e > 0) {
                j += m8800e;
                interfaceC10189f0.mo8688B(this.f26522x, m8800e);
            }
        }
        if (this.f26522x.size() > 0) {
            long size = j + this.f26522x.size();
            Buffer buffer = this.f26522x;
            interfaceC10189f0.mo8688B(buffer, buffer.size());
            return size;
        }
        return j;
    }

    /* renamed from: z */
    public boolean mo8746z(long j) {
        if (j >= 0) {
            if (!this.f26523y) {
                while (this.f26522x.size() < j) {
                    if (this.f26521w.read(this.f26522x, 8192L) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    /* renamed from: z0 */
    public long mo8745z0() {
        byte m8811L;
        int m9044a;
        int m9044a2;
        mo8750r0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo8746z(i2)) {
                break;
            }
            m8811L = this.f26522x.m8811L(i);
            if ((m8811L < ((byte) 48) || m8811L > ((byte) 57)) && ((m8811L < ((byte) 97) || m8811L > ((byte) C0868i.f2748C0)) && (m8811L < ((byte) 65) || m8811L > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            m9044a = CharJVM.m9044a(16);
            m9044a2 = CharJVM.m9044a(m9044a);
            String num = Integer.toString(m8811L, m9044a2);
            Intrinsics.checkIfNull(num, "toString(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f26522x.mo8745z0();
    }

    /* compiled from: RealBufferedSource.kt */
    /* renamed from: sf.b0$a */
    /* loaded from: classes2.dex */
    public static final class C10182a extends InputStream {
        C10182a() {
        }

        public int available() {
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (!realBufferedSource.f26523y) {
                return (int) Math.min(realBufferedSource.f26522x.size(), (long) Reader.READ_DONE);
            }
            throw new IOException("closed");
        }

        public void close() {
            RealBufferedSource.this.close();
        }

        public int read() {
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (!realBufferedSource.f26523y) {
                if (realBufferedSource.f26522x.size() == 0) {
                    RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                    if (realBufferedSource2.f26521w.read(realBufferedSource2.f26522x, 8192L) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.f26522x.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return RealBufferedSource.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            Intrinsics.isThisObjectNull(bArr, "data");
            if (!RealBufferedSource.this.f26523y) {
                C10198n0.m8597b(bArr.length, i, i2);
                if (RealBufferedSource.this.f26522x.size() == 0) {
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    if (realBufferedSource.f26521w.read(realBufferedSource.f26522x, 8192L) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.f26522x.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    public int read(ByteBuffer byteBuffer) {
        Intrinsics.isThisObjectNull(byteBuffer, "sink");
        if (this.f26522x.size() == 0 && this.f26521w.read(this.f26522x, 8192L) == -1) {
            return -1;
        }
        return this.f26522x.read(byteBuffer);
    }
}
