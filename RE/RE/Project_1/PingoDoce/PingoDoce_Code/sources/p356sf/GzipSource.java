package p356sf;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p181jd.Intrinsics;

/* renamed from: sf.n */
/* loaded from: classes2.dex */
public final class GzipSource implements InterfaceC10191h0 {

    /* renamed from: A */
    private final CRC32 f26576A;

    /* renamed from: w */
    private byte f26577w;

    /* renamed from: x */
    private final RealBufferedSource f26578x;

    /* renamed from: y */
    private final Inflater f26579y;

    /* renamed from: z */
    private final InflaterSource f26580z;

    public GzipSource(InterfaceC10191h0 interfaceC10191h0) {
        Intrinsics.isThisObjectNull(interfaceC10191h0, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(interfaceC10191h0);
        this.f26578x = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.f26579y = inflater;
        this.f26580z = new InflaterSource((InterfaceC10187e) realBufferedSource, inflater);
        this.f26576A = new CRC32();
    }

    /* renamed from: a */
    private final void m8602a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        Intrinsics.checkIfNull(format, "format(this, *args)");
        throw new IOException(format);
    }

    /* renamed from: c */
    private final void m8601c() throws IOException {
        this.f26578x.mo8750r0(10L);
        byte m8811L = this.f26578x.f26522x.m8811L(3L);
        boolean z = ((m8811L >> 1) & 1) == 1;
        if (z) {
            m8599h(this.f26578x.f26522x, 0L, 10L);
        }
        m8602a("ID1ID2", 8075, this.f26578x.readShort());
        this.f26578x.skip(8L);
        if (((m8811L >> 2) & 1) == 1) {
            this.f26578x.mo8750r0(2L);
            if (z) {
                m8599h(this.f26578x.f26522x, 0L, 2L);
            }
            long mo8758c0 = this.f26578x.f26522x.mo8758c0();
            this.f26578x.mo8750r0(mo8758c0);
            if (z) {
                m8599h(this.f26578x.f26522x, 0L, mo8758c0);
            }
            this.f26578x.skip(mo8758c0);
        }
        if (((m8811L >> 3) & 1) == 1) {
            long m8827a = this.f26578x.m8827a((byte) 0);
            if (m8827a != -1) {
                if (z) {
                    m8599h(this.f26578x.f26522x, 0L, m8827a + 1);
                }
                this.f26578x.skip(m8827a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((m8811L >> 4) & 1) == 1) {
            long m8827a2 = this.f26578x.m8827a((byte) 0);
            if (m8827a2 != -1) {
                if (z) {
                    m8599h(this.f26578x.f26522x, 0L, m8827a2 + 1);
                }
                this.f26578x.skip(m8827a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m8602a("FHCRC", this.f26578x.mo8758c0(), (short) this.f26576A.getValue());
            this.f26576A.reset();
        }
    }

    /* renamed from: e */
    private final void m8600e() throws IOException {
        m8602a("CRC", this.f26578x.mo8763O(), (int) this.f26576A.getValue());
        m8602a("ISIZE", this.f26578x.mo8763O(), (int) this.f26579y.getBytesWritten());
    }

    /* renamed from: h */
    private final void m8599h(Buffer buffer, long j, long j2) {
        int i;
        Segment segment = buffer.f26525w;
        Intrinsics.ifNullDoSomething(segment);
        while (true) {
            int i2 = segment.f26531c;
            int i3 = segment.f26530b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            segment = segment.f26534f;
            Intrinsics.ifNullDoSomething(segment);
        }
        while (j2 > 0) {
            int min = (int) Math.min(segment.f26531c - i, j2);
            this.f26576A.update(segment.f26529a, (int) (segment.f26530b + j), min);
            j2 -= min;
            segment = segment.f26534f;
            Intrinsics.ifNullDoSomething(segment);
            j = 0;
        }
    }

    public void close() throws IOException {
        this.f26580z.close();
    }

    public long read(Buffer buffer, long j) throws IOException {
        Intrinsics.isThisObjectNull(buffer, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.f26577w == 0) {
                m8601c();
                this.f26577w = (byte) 1;
            }
            if (this.f26577w == 1) {
                long size = buffer.size();
                long read = this.f26580z.read(buffer, j);
                if (read != -1) {
                    m8599h(buffer, size, read);
                    return read;
                }
                this.f26577w = (byte) 2;
            }
            if (this.f26577w == 2) {
                m8600e();
                this.f26577w = (byte) 3;
                if (!this.f26578x.mo8762Q()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    /* renamed from: timeout */
    public Timeout mo40537timeout() {
        return this.f26578x.mo40537timeout();
    }
}
