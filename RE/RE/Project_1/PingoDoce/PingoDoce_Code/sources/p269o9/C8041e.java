package p269o9;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o9.e */
/* loaded from: classes.dex */
public class C8041e implements Closeable {

    /* renamed from: C */
    private static final Logger f20783C = Logger.getLogger(C8041e.class.getName());

    /* renamed from: A */
    private C8043b f20784A;

    /* renamed from: B */
    private final byte[] f20785B = new byte[16];

    /* renamed from: w */
    private final RandomAccessFile f20786w;

    /* renamed from: x */
    int f20787x;

    /* renamed from: y */
    private int f20788y;

    /* renamed from: z */
    private C8043b f20789z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* renamed from: o9.e$a */
    /* loaded from: classes.dex */
    public class C8042a implements InterfaceC8045d {

        /* renamed from: a */
        boolean f20790a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f20791b;

        C8042a(C8041e c8041e, StringBuilder sb2) {
            this.f20791b = sb2;
        }

        @Override // p269o9.C8041e.InterfaceC8045d
        /* renamed from: a */
        public void mo17065a(InputStream inputStream, int i) throws IOException {
            if (this.f20790a) {
                this.f20790a = false;
            } else {
                this.f20791b.append(", ");
            }
            this.f20791b.append(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* renamed from: o9.e$b */
    /* loaded from: classes.dex */
    public static class C8043b {

        /* renamed from: c */
        static final C8043b f20792c = new C8043b(0, 0);

        /* renamed from: a */
        final int f20793a;

        /* renamed from: b */
        final int f20794b;

        C8043b(int i, int i2) {
            this.f20793a = i;
            this.f20794b = i2;
        }

        public String toString() {
            return C8043b.class.getSimpleName() + "[position = " + this.f20793a + ", length = " + this.f20794b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFile.java */
    /* renamed from: o9.e$c */
    /* loaded from: classes.dex */
    public final class C8044c extends InputStream {

        /* renamed from: w */
        private int f20795w;

        /* renamed from: x */
        private int f20796x;

        /* synthetic */ C8044c(C8041e c8041e, C8043b c8043b, C8042a c8042a) {
            this(c8043b);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            C8041e.m17095M(bArr, "buffer");
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.f20796x;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    C8041e.this.m17086d0(this.f20795w, bArr, i, i2);
                    this.f20795w = C8041e.this.m17080l0(this.f20795w + i2);
                    this.f20796x -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private C8044c(C8043b c8043b) {
            this.f20795w = C8041e.this.m17080l0(c8043b.f20793a + 4);
            this.f20796x = c8043b.f20794b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f20796x == 0) {
                return -1;
            }
            C8041e.this.f20786w.seek(this.f20795w);
            int read = C8041e.this.f20786w.read();
            this.f20795w = C8041e.this.m17080l0(this.f20795w + 1);
            this.f20796x--;
            return read;
        }
    }

    /* compiled from: QueueFile.java */
    /* renamed from: o9.e$d */
    /* loaded from: classes.dex */
    public interface InterfaceC8045d {
        /* renamed from: a */
        void mo17065a(InputStream inputStream, int i) throws IOException;
    }

    public C8041e(File file) throws IOException {
        if (!file.exists()) {
            m17097H(file);
        }
        this.f20786w = m17094P(file);
        m17092W();
    }

    /* renamed from: E */
    private void m17099E(int i) throws IOException {
        int i2 = i + 4;
        int m17089a0 = m17089a0();
        if (m17089a0 >= i2) {
            return;
        }
        int i3 = this.f20787x;
        do {
            m17089a0 += i3;
            i3 <<= 1;
        } while (m17089a0 < i2);
        m17083f0(i3);
        C8043b c8043b = this.f20784A;
        int m17080l0 = m17080l0(c8043b.f20793a + 4 + c8043b.f20794b);
        if (m17080l0 < this.f20789z.f20793a) {
            FileChannel channel = this.f20786w.getChannel();
            channel.position(this.f20787x);
            long j = m17080l0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f20784A.f20793a;
        int i5 = this.f20789z.f20793a;
        if (i4 < i5) {
            int i6 = (this.f20787x + i4) - 16;
            m17079o0(i3, this.f20788y, i5, i6);
            this.f20784A = new C8043b(i6, this.f20784A.f20794b);
        } else {
            m17079o0(i3, this.f20788y, i5, i4);
        }
        this.f20787x = i3;
    }

    /* renamed from: H */
    private static void m17097H(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m17094P = m17094P(file2);
        try {
            m17094P.setLength(4096L);
            m17094P.seek(0L);
            byte[] bArr = new byte[16];
            m17076t0(bArr, 4096, 0, 0, 0);
            m17094P.write(bArr);
            m17094P.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            m17094P.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static <T> T m17095M(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: P */
    private static RandomAccessFile m17094P(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: R */
    private C8043b m17093R(int i) throws IOException {
        if (i == 0) {
            return C8043b.f20792c;
        }
        this.f20786w.seek(i);
        return new C8043b(i, this.f20786w.readInt());
    }

    /* renamed from: W */
    private void m17092W() throws IOException {
        this.f20786w.seek(0L);
        this.f20786w.readFully(this.f20785B);
        int m17091X = m17091X(this.f20785B, 0);
        this.f20787x = m17091X;
        if (m17091X <= this.f20786w.length()) {
            this.f20788y = m17091X(this.f20785B, 4);
            int m17091X2 = m17091X(this.f20785B, 8);
            int m17091X3 = m17091X(this.f20785B, 12);
            this.f20789z = m17093R(m17091X2);
            this.f20784A = m17093R(m17091X3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f20787x + ", Actual length: " + this.f20786w.length());
    }

    /* renamed from: X */
    private static int m17091X(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: a0 */
    private int m17089a0() {
        return this.f20787x - m17081j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m17086d0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int m17080l0 = m17080l0(i);
        int i4 = m17080l0 + i3;
        int i5 = this.f20787x;
        if (i4 <= i5) {
            this.f20786w.seek(m17080l0);
            this.f20786w.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m17080l0;
        this.f20786w.seek(m17080l0);
        this.f20786w.readFully(bArr, i2, i6);
        this.f20786w.seek(16L);
        this.f20786w.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: e0 */
    private void m17084e0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int m17080l0 = m17080l0(i);
        int i4 = m17080l0 + i3;
        int i5 = this.f20787x;
        if (i4 <= i5) {
            this.f20786w.seek(m17080l0);
            this.f20786w.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m17080l0;
        this.f20786w.seek(m17080l0);
        this.f20786w.write(bArr, i2, i6);
        this.f20786w.seek(16L);
        this.f20786w.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: f0 */
    private void m17083f0(int i) throws IOException {
        this.f20786w.setLength(i);
        this.f20786w.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public int m17080l0(int i) {
        int i2 = this.f20787x;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: o0 */
    private void m17079o0(int i, int i2, int i3, int i4) throws IOException {
        m17076t0(this.f20785B, i, i2, i3, i4);
        this.f20786w.seek(0L);
        this.f20786w.write(this.f20785B);
    }

    /* renamed from: q0 */
    private static void m17078q0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: t0 */
    private static void m17076t0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            m17078q0(bArr, i, i2);
            i += 4;
        }
    }

    /* renamed from: F */
    public synchronized void m17098F(InterfaceC8045d interfaceC8045d) throws IOException {
        int i = this.f20789z.f20793a;
        for (int i2 = 0; i2 < this.f20788y; i2++) {
            C8043b m17093R = m17093R(i);
            interfaceC8045d.mo17065a(new C8044c(this, m17093R, null), m17093R.f20794b);
            i = m17080l0(m17093R.f20793a + 4 + m17093R.f20794b);
        }
    }

    /* renamed from: L */
    public synchronized boolean m17096L() {
        return this.f20788y == 0;
    }

    /* renamed from: b0 */
    public synchronized void m17088b0() throws IOException {
        if (!m17096L()) {
            if (this.f20788y == 1) {
                m17074y();
            } else {
                C8043b c8043b = this.f20789z;
                int m17080l0 = m17080l0(c8043b.f20793a + 4 + c8043b.f20794b);
                m17086d0(m17080l0, this.f20785B, 0, 4);
                int m17091X = m17091X(this.f20785B, 0);
                m17079o0(this.f20787x, this.f20788y - 1, m17080l0, this.f20784A.f20793a);
                this.f20788y--;
                this.f20789z = new C8043b(m17080l0, m17091X);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f20786w.close();
    }

    /* renamed from: j0 */
    public int m17081j0() {
        if (this.f20788y == 0) {
            return 16;
        }
        C8043b c8043b = this.f20784A;
        int i = c8043b.f20793a;
        int i2 = this.f20789z.f20793a;
        if (i >= i2) {
            return (i - i2) + 4 + c8043b.f20794b + 16;
        }
        return (((i + 4) + c8043b.f20794b) + this.f20787x) - i2;
    }

    /* renamed from: t */
    public void m17077t(byte[] bArr) throws IOException {
        m17075v(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C8041e.class.getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f20787x);
        sb2.append(", size=");
        sb2.append(this.f20788y);
        sb2.append(", first=");
        sb2.append(this.f20789z);
        sb2.append(", last=");
        sb2.append(this.f20784A);
        sb2.append(", element lengths=[");
        try {
            m17098F(new C8042a(this, sb2));
        } catch (IOException e) {
            f20783C.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* renamed from: v */
    public synchronized void m17075v(byte[] bArr, int i, int i2) throws IOException {
        int m17080l0;
        m17095M(bArr, "buffer");
        if ((i | i2) >= 0 && i2 <= bArr.length - i) {
            m17099E(i2);
            boolean m17096L = m17096L();
            if (m17096L) {
                m17080l0 = 16;
            } else {
                C8043b c8043b = this.f20784A;
                m17080l0 = m17080l0(c8043b.f20793a + 4 + c8043b.f20794b);
            }
            C8043b c8043b2 = new C8043b(m17080l0, i2);
            m17078q0(this.f20785B, 0, i2);
            m17084e0(c8043b2.f20793a, this.f20785B, 0, 4);
            m17084e0(c8043b2.f20793a + 4, bArr, i, i2);
            m17079o0(this.f20787x, this.f20788y + 1, m17096L ? c8043b2.f20793a : this.f20789z.f20793a, c8043b2.f20793a);
            this.f20784A = c8043b2;
            this.f20788y++;
            if (m17096L) {
                this.f20789z = c8043b2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: y */
    public synchronized void m17074y() throws IOException {
        m17079o0(4096, 0, 0, 0);
        this.f20788y = 0;
        C8043b c8043b = C8043b.f20792c;
        this.f20789z = c8043b;
        this.f20784A = c8043b;
        if (this.f20787x > 4096) {
            m17083f0(4096);
        }
        this.f20787x = 4096;
    }
}
