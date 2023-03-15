package p356sf;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: sf.f0 */
/* loaded from: classes2.dex */
public interface InterfaceC10189f0 extends Closeable, Flushable {
    /* renamed from: B */
    void mo8688B(Buffer buffer, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    /* renamed from: timeout */
    Timeout mo40536timeout();
}
