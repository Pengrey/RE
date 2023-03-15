package p356sf;

import java.io.IOException;
import p181jd.Intrinsics;

/* renamed from: sf.l */
/* loaded from: classes2.dex */
public abstract class ForwardingSource implements InterfaceC10191h0 {
    private final InterfaceC10191h0 delegate;

    public ForwardingSource(InterfaceC10191h0 interfaceC10191h0) {
        Intrinsics.isThisObjectNull(interfaceC10191h0, "delegate");
        this.delegate = interfaceC10191h0;
    }

    /* renamed from: -deprecated_delegate */
    public final InterfaceC10191h0 m39648deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC10191h0 delegate() {
        return this.delegate;
    }

    public long read(Buffer buffer, long j) throws IOException {
        Intrinsics.isThisObjectNull(buffer, "sink");
        return this.delegate.read(buffer, j);
    }

    /* renamed from: timeout */
    public Timeout mo40537timeout() {
        return this.delegate.mo40537timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
