package p356sf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: sf.e */
/* loaded from: classes2.dex */
public interface InterfaceC10187e extends InterfaceC10191h0, ReadableByteChannel {
    /* renamed from: B0 */
    String mo8768B0(Charset charset) throws IOException;

    /* renamed from: C0 */
    InputStream mo8767C0();

    /* renamed from: I */
    int mo8766I(Options options) throws IOException;

    /* renamed from: J */
    String mo8765J() throws IOException;

    /* renamed from: K */
    byte[] mo8764K() throws IOException;

    /* renamed from: O */
    int mo8763O() throws IOException;

    /* renamed from: Q */
    boolean mo8762Q() throws IOException;

    /* renamed from: T */
    long mo8761T(ByteString byteString) throws IOException;

    /* renamed from: U */
    byte[] mo8760U(long j) throws IOException;

    /* renamed from: b */
    Buffer mo8759b();

    /* renamed from: c0 */
    short mo8758c0() throws IOException;

    /* renamed from: g0 */
    long mo8757g0() throws IOException;

    /* renamed from: h0 */
    String mo8756h0(long j) throws IOException;

    /* renamed from: k0 */
    long mo8755k0(ByteString byteString) throws IOException;

    /* renamed from: l */
    String mo8754l(long j) throws IOException;

    /* renamed from: n0 */
    InterfaceC10187e mo8753n0();

    /* renamed from: q */
    Buffer mo8752q();

    /* renamed from: r */
    ByteString mo8751r() throws IOException;

    /* renamed from: r0 */
    void mo8750r0(long j) throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    /* renamed from: s */
    boolean mo8749s(long j, ByteString byteString) throws IOException;

    void skip(long j) throws IOException;

    /* renamed from: u */
    ByteString mo8748u(long j) throws IOException;

    /* renamed from: w */
    long mo8747w(InterfaceC10189f0 interfaceC10189f0) throws IOException;

    /* renamed from: z */
    boolean mo8746z(long j) throws IOException;

    /* renamed from: z0 */
    long mo8745z0() throws IOException;
}
