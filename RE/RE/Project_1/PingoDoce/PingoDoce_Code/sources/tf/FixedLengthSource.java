package tf;

import java.io.IOException;
import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.ForwardingSource;
import p356sf.InterfaceC10191h0;

/* renamed from: tf.b */
/* loaded from: classes2.dex */
public final class FixedLengthSource extends ForwardingSource {

    /* renamed from: w */
    private final long f27328w;

    /* renamed from: x */
    private final boolean f27329x;

    /* renamed from: y */
    private long f27330y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(InterfaceC10191h0 interfaceC10191h0, long j, boolean z) {
        super(interfaceC10191h0);
        Intrinsics.isThisObjectNull(interfaceC10191h0, "delegate");
        this.f27328w = j;
        this.f27329x = z;
    }

    /* renamed from: a */
    private final void m7565a(Buffer buffer, long j) {
        Buffer buffer2 = new Buffer();
        buffer2.mo8783A(buffer);
        buffer.mo8688B(buffer2, j);
        buffer2.m8805a();
    }

    public long read(Buffer buffer, long j) {
        Intrinsics.isThisObjectNull(buffer, "sink");
        long j2 = this.f27330y;
        long j3 = this.f27328w;
        if (j2 > j3) {
            j = 0;
        } else if (this.f27329x) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(buffer, j);
        int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
        if (i != 0) {
            this.f27330y += read;
        }
        long j5 = this.f27330y;
        long j6 = this.f27328w;
        if ((j5 >= j6 || i != 0) && j5 <= j6) {
            return read;
        }
        if (read > 0 && j5 > j6) {
            m7565a(buffer, buffer.size() - (this.f27330y - this.f27328w));
        }
        throw new IOException("expected " + this.f27328w + " bytes but got " + this.f27330y);
    }
}
