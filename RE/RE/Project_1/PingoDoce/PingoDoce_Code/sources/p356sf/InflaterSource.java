package p356sf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p181jd.Intrinsics;

/* renamed from: sf.o */
/* loaded from: classes2.dex */
public final class InflaterSource implements InterfaceC10191h0 {

    /* renamed from: w */
    private final InterfaceC10187e f26582w;

    /* renamed from: x */
    private final Inflater f26583x;

    /* renamed from: y */
    private int f26584y;

    /* renamed from: z */
    private boolean f26585z;

    public InflaterSource(InterfaceC10187e interfaceC10187e, Inflater inflater) {
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        Intrinsics.isThisObjectNull(inflater, "inflater");
        this.f26582w = interfaceC10187e;
        this.f26583x = inflater;
    }

    /* renamed from: e */
    private final void m8586e() {
        int i = this.f26584y;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f26583x.getRemaining();
        this.f26584y -= remaining;
        this.f26582w.skip(remaining);
    }

    /* renamed from: a */
    public final long m8588a(Buffer buffer, long j) throws IOException {
        Intrinsics.isThisObjectNull(buffer, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.f26585z) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    Segment m8795o0 = buffer.m8795o0(1);
                    m8587c();
                    int inflate = this.f26583x.inflate(m8795o0.f26529a, m8795o0.f26531c, (int) Math.min(j, 8192 - m8795o0.f26531c));
                    m8586e();
                    if (inflate > 0) {
                        m8795o0.f26531c += inflate;
                        long j2 = inflate;
                        buffer.m8798f0(buffer.size() + j2);
                        return j2;
                    }
                    if (m8795o0.f26530b == m8795o0.f26531c) {
                        buffer.f26525w = m8795o0.m8788b();
                        SegmentPool.m8770b(m8795o0);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    /* renamed from: c */
    public final boolean m8587c() throws IOException {
        if (this.f26583x.needsInput()) {
            if (this.f26582w.mo8762Q()) {
                return true;
            }
            Segment segment = this.f26582w.mo8759b().f26525w;
            Intrinsics.ifNullDoSomething(segment);
            int i = segment.f26531c;
            int i2 = segment.f26530b;
            int i3 = i - i2;
            this.f26584y = i3;
            this.f26583x.setInput(segment.f26529a, i2, i3);
            return false;
        }
        return false;
    }

    public void close() throws IOException {
        if (this.f26585z) {
            return;
        }
        this.f26583x.end();
        this.f26585z = true;
        this.f26582w.close();
    }

    public long read(Buffer buffer, long j) throws IOException {
        Intrinsics.isThisObjectNull(buffer, "sink");
        do {
            long m8588a = m8588a(buffer, j);
            if (m8588a > 0) {
                return m8588a;
            }
            if (this.f26583x.finished() || this.f26583x.needsDictionary()) {
                return -1L;
            }
        } while (!this.f26582w.mo8762Q());
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: timeout */
    public Timeout mo40537timeout() {
        return this.f26582w.mo40537timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(InterfaceC10191h0 interfaceC10191h0, Inflater inflater) {
        this(C10200t.m8565c(interfaceC10191h0), inflater);
        Intrinsics.isThisObjectNull(interfaceC10191h0, "source");
        Intrinsics.isThisObjectNull(inflater, "inflater");
    }
}
