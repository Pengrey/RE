package p309q7;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.l */
/* loaded from: classes.dex */
public final class C9684l {
    static {
        new C9682j();
    }

    /* renamed from: a */
    public static InputStream m10224a(InputStream inputStream, long j) {
        return new C9683k(inputStream, 1048577L);
    }

    /* renamed from: b */
    public static byte[] m10223b(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m10222c(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j = i;
            long j2 = j + j;
            i = j2 > 2147483647L ? Reader.READ_DONE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (inputStream.read() == -1) {
            return m10222c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: c */
    private static byte[] m10222c(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
