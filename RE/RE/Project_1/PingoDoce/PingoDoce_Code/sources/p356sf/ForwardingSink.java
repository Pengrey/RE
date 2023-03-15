package p356sf;

import java.io.IOException;
import p181jd.Intrinsics;

/* renamed from: sf.k */
/* loaded from: classes2.dex */
public abstract class ForwardingSink implements InterfaceC10189f0 {

    /* renamed from: w */
    private final InterfaceC10189f0 f26569w;

    public ForwardingSink(InterfaceC10189f0 interfaceC10189f0) {
        Intrinsics.isThisObjectNull(interfaceC10189f0, "delegate");
        this.f26569w = interfaceC10189f0;
    }

    /* renamed from: B */
    public void mo8688B(Buffer buffer, long j) throws IOException {
        Intrinsics.isThisObjectNull(buffer, "source");
        this.f26569w.mo8688B(buffer, j);
    }

    public void close() throws IOException {
        this.f26569w.close();
    }

    public void flush() throws IOException {
        this.f26569w.flush();
    }

    /* renamed from: timeout */
    public Timeout mo40536timeout() {
        return this.f26569w.mo40536timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f26569w + ')';
    }
}
