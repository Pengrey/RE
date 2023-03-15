package p356sf;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: sf.h0 */
/* loaded from: classes2.dex */
public interface InterfaceC10191h0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(Buffer buffer, long j) throws IOException;

    /* renamed from: timeout */
    Timeout mo40537timeout();
}
