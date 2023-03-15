package p356sf;

import java.io.IOException;
import java.io.InputStream;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* renamed from: sf.p */
/* loaded from: classes2.dex */
public class C10199p implements InterfaceC10191h0 {

    /* renamed from: w */
    private final InputStream f26586w;

    /* renamed from: x */
    private final Timeout f26587x;

    public C10199p(InputStream inputStream, Timeout timeout) {
        Intrinsics.isThisObjectNull(inputStream, "input");
        Intrinsics.isThisObjectNull(timeout, "timeout");
        this.f26586w = inputStream;
        this.f26587x = timeout;
    }

    public void close() {
        this.f26586w.close();
    }

    public long read(Buffer buffer, long j) {
        Intrinsics.isThisObjectNull(buffer, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.f26587x.m8647f();
                Segment m8795o0 = buffer.m8795o0(1);
                int read = this.f26586w.read(m8795o0.f26529a, m8795o0.f26531c, (int) Math.min(j, 8192 - m8795o0.f26531c));
                if (read == -1) {
                    if (m8795o0.f26530b == m8795o0.f26531c) {
                        buffer.f26525w = m8795o0.m8788b();
                        SegmentPool.m8770b(m8795o0);
                        return -1L;
                    }
                    return -1L;
                }
                m8795o0.f26531c += read;
                long j2 = read;
                buffer.m8798f0(buffer.size() + j2);
                return j2;
            } catch (AssertionError e) {
                if (C10200t.m8564d(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    /* renamed from: timeout */
    public Timeout mo40537timeout() {
        return this.f26587x;
    }

    public String toString() {
        return "source(" + this.f26586w + ')';
    }
}
