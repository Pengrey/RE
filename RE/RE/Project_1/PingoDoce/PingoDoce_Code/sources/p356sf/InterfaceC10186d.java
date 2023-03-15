package p356sf;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: sf.d */
/* loaded from: classes2.dex */
public interface InterfaceC10186d extends InterfaceC10189f0, WritableByteChannel {
    /* renamed from: A */
    long mo8783A(InterfaceC10191h0 interfaceC10191h0) throws IOException;

    /* renamed from: C */
    InterfaceC10186d mo8782C(ByteString byteString) throws IOException;

    /* renamed from: D */
    InterfaceC10186d mo8781D(int i) throws IOException;

    /* renamed from: S */
    InterfaceC10186d mo8780S(int i) throws IOException;

    /* renamed from: Z */
    InterfaceC10186d mo8779Z(byte[] bArr) throws IOException;

    /* renamed from: b */
    Buffer mo8778b();

    @Override // p356sf.InterfaceC10189f0, java.io.Flushable
    void flush() throws IOException;

    /* renamed from: g */
    InterfaceC10186d mo8777g(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: o */
    InterfaceC10186d mo8776o(String str, int i, int i2) throws IOException;

    /* renamed from: p */
    InterfaceC10186d mo8775p(long j) throws IOException;

    /* renamed from: u0 */
    InterfaceC10186d mo8774u0(String str) throws IOException;

    /* renamed from: w0 */
    InterfaceC10186d mo8773w0(long j) throws IOException;

    /* renamed from: x */
    InterfaceC10186d mo8772x(int i) throws IOException;
}
