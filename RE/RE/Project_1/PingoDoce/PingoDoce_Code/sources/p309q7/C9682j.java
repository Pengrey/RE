package p309q7;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.j */
/* loaded from: classes.dex */
final class C9682j extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
    }
}
