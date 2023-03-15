package p356sf;

import java.io.OutputStream;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* renamed from: sf.x */
/* loaded from: classes2.dex */
public final class C10204x implements InterfaceC10189f0 {

    /* renamed from: w */
    private final OutputStream f26593w;

    /* renamed from: x */
    private final Timeout f26594x;

    public C10204x(OutputStream outputStream, Timeout timeout) {
        Intrinsics.isThisObjectNull(outputStream, "out");
        Intrinsics.isThisObjectNull(timeout, "timeout");
        this.f26593w = outputStream;
        this.f26594x = timeout;
    }

    /* renamed from: B */
    public void mo8688B(Buffer buffer, long j) {
        Intrinsics.isThisObjectNull(buffer, "source");
        C10198n0.m8597b(buffer.size(), 0L, j);
        while (j > 0) {
            this.f26594x.m8647f();
            Segment segment = buffer.f26525w;
            Intrinsics.ifNullDoSomething(segment);
            int min = (int) Math.min(j, segment.f26531c - segment.f26530b);
            this.f26593w.write(segment.f26529a, segment.f26530b, min);
            segment.f26530b += min;
            long j2 = min;
            j -= j2;
            buffer.m8798f0(buffer.size() - j2);
            if (segment.f26530b == segment.f26531c) {
                buffer.f26525w = segment.m8788b();
                SegmentPool.m8770b(segment);
            }
        }
    }

    public void close() {
        this.f26593w.close();
    }

    public void flush() {
        this.f26593w.flush();
    }

    /* renamed from: timeout */
    public Timeout mo40536timeout() {
        return this.f26594x;
    }

    public String toString() {
        return "sink(" + this.f26593w + ')';
    }
}
