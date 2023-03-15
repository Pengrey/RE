package p356sf;

import java.nio.ByteBuffer;
import p181jd.Intrinsics;

/* renamed from: sf.a0 */
/* loaded from: classes2.dex */
public final class RealBufferedSink implements InterfaceC10186d {

    /* renamed from: w */
    public final InterfaceC10189f0 f26518w;

    /* renamed from: x */
    public final Buffer f26519x;

    /* renamed from: y */
    public boolean f26520y;

    public RealBufferedSink(InterfaceC10189f0 interfaceC10189f0) {
        Intrinsics.isThisObjectNull(interfaceC10189f0, "sink");
        this.f26518w = interfaceC10189f0;
        this.f26519x = new Buffer();
    }

    /* renamed from: A */
    public long mo8783A(InterfaceC10191h0 interfaceC10191h0) {
        Intrinsics.isThisObjectNull(interfaceC10191h0, "source");
        long j = 0;
        while (true) {
            long read = interfaceC10191h0.read(this.f26519x, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            m8828a();
        }
    }

    /* renamed from: B */
    public void mo8688B(Buffer buffer, long j) {
        Intrinsics.isThisObjectNull(buffer, "source");
        if (!this.f26520y) {
            this.f26519x.mo8688B(buffer, j);
            m8828a();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: C */
    public InterfaceC10186d mo8782C(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "byteString");
        if (!this.f26520y) {
            this.f26519x.m8794q0(byteString);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: D */
    public InterfaceC10186d mo8781D(int i) {
        if (!this.f26520y) {
            this.f26519x.m8820E0(i);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: S */
    public InterfaceC10186d mo8780S(int i) {
        if (!this.f26520y) {
            this.f26519x.m8791x0(i);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: Z */
    public InterfaceC10186d mo8779Z(byte[] bArr) {
        Intrinsics.isThisObjectNull(bArr, "source");
        if (!this.f26520y) {
            this.f26519x.m8793t0(bArr);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public InterfaceC10186d m8828a() {
        if (!this.f26520y) {
            long m8800e = this.f26519x.m8800e();
            if (m8800e > 0) {
                this.f26518w.mo8688B(this.f26519x, m8800e);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public Buffer mo8778b() {
        return this.f26519x;
    }

    public void close() {
        if (this.f26520y) {
            return;
        }
        Throwable th2 = null;
        try {
            if (this.f26519x.size() > 0) {
                InterfaceC10189f0 interfaceC10189f0 = this.f26518w;
                Buffer buffer = this.f26519x;
                interfaceC10189f0.mo8688B(buffer, buffer.size());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f26518w.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        this.f26520y = true;
        if (th2 != null) {
            throw th2;
        }
    }

    public void flush() {
        if (!this.f26520y) {
            if (this.f26519x.size() > 0) {
                InterfaceC10189f0 interfaceC10189f0 = this.f26518w;
                Buffer buffer = this.f26519x;
                interfaceC10189f0.mo8688B(buffer, buffer.size());
            }
            this.f26518w.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: g */
    public InterfaceC10186d mo8777g(byte[] bArr, int i, int i2) {
        Intrinsics.isThisObjectNull(bArr, "source");
        if (!this.f26520y) {
            this.f26519x.m8792v0(bArr, i, i2);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f26520y;
    }

    /* renamed from: o */
    public InterfaceC10186d mo8776o(String str, int i, int i2) {
        Intrinsics.isThisObjectNull(str, "string");
        if (!this.f26520y) {
            this.f26519x.m8813J0(str, i, i2);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: p */
    public InterfaceC10186d mo8775p(long j) {
        if (!this.f26520y) {
            this.f26519x.m8821D0(j);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: timeout */
    public Timeout mo40536timeout() {
        return this.f26518w.mo40536timeout();
    }

    public String toString() {
        return "buffer(" + this.f26518w + ')';
    }

    /* renamed from: u0 */
    public InterfaceC10186d mo8774u0(String str) {
        Intrinsics.isThisObjectNull(str, "string");
        if (!this.f26520y) {
            this.f26519x.m8814I0(str);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: w0 */
    public InterfaceC10186d mo8773w0(long j) {
        if (!this.f26520y) {
            this.f26519x.m8822A0(j);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        Intrinsics.isThisObjectNull(byteBuffer, "source");
        if (!this.f26520y) {
            int write = this.f26519x.write(byteBuffer);
            m8828a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: x */
    public InterfaceC10186d mo8772x(int i) {
        if (!this.f26520y) {
            this.f26519x.m8818F0(i);
            return m8828a();
        }
        throw new IllegalStateException("closed".toString());
    }
}
