package p356sf;

import java.io.Closeable;
import java.io.IOException;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: sf.g */
/* loaded from: classes2.dex */
public abstract class FileHandle implements Closeable {

    /* renamed from: w */
    private boolean f26548w;

    /* renamed from: x */
    private int f26549x;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileHandle.kt */
    /* renamed from: sf.g$a */
    /* loaded from: classes2.dex */
    public static final class C10190a implements InterfaceC10191h0 {

        /* renamed from: w */
        private final FileHandle f26550w;

        /* renamed from: x */
        private long f26551x;

        /* renamed from: y */
        private boolean f26552y;

        public C10190a(FileHandle fileHandle, long j) {
            Intrinsics.isThisObjectNull(fileHandle, "fileHandle");
            this.f26550w = fileHandle;
            this.f26551x = j;
        }

        public void close() {
            if (this.f26552y) {
                return;
            }
            this.f26552y = true;
            synchronized (this.f26550w) {
                FileHandle fileHandle = this.f26550w;
                FileHandle.m8682h(fileHandle, FileHandle.m8684c(fileHandle) - 1);
                if (FileHandle.m8684c(this.f26550w) == 0 && FileHandle.m8685a(this.f26550w)) {
                    C13195u c13195u = C13195u.f34156a;
                    this.f26550w.m8681t();
                }
            }
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "sink");
            if (!this.f26552y) {
                long m8683e = FileHandle.m8683e(this.f26550w, this.f26551x, buffer, j);
                if (m8683e != -1) {
                    this.f26551x += m8683e;
                }
                return m8683e;
            }
            throw new IllegalStateException("closed".toString());
        }

        /* renamed from: timeout */
        public Timeout mo40537timeout() {
            return Timeout.f26564d;
        }
    }

    public FileHandle(boolean z) {
    }

    /* renamed from: E */
    private final long m8687E(long j, Buffer buffer, long j2) {
        int i;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = j + j2;
        long j4 = j;
        while (true) {
            if (j4 >= j3) {
                break;
            }
            Segment m8795o0 = buffer.m8795o0(1);
            int m8680v = m8680v(j4, m8795o0.f26529a, m8795o0.f26531c, (int) Math.min(j3 - j4, 8192 - i));
            if (m8680v == -1) {
                if (m8795o0.f26530b == m8795o0.f26531c) {
                    buffer.f26525w = m8795o0.m8788b();
                    SegmentPool.m8770b(m8795o0);
                }
                if (j == j4) {
                    return -1L;
                }
            } else {
                m8795o0.f26531c += m8680v;
                long j5 = m8680v;
                j4 += j5;
                buffer.m8798f0(buffer.size() + j5);
            }
        }
        return j4 - j;
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m8685a(FileHandle fileHandle) {
        return fileHandle.f26548w;
    }

    /* renamed from: c */
    public static final /* synthetic */ int m8684c(FileHandle fileHandle) {
        return fileHandle.f26549x;
    }

    /* renamed from: e */
    public static final /* synthetic */ long m8683e(FileHandle fileHandle, long j, Buffer buffer, long j2) {
        return fileHandle.m8687E(j, buffer, j2);
    }

    /* renamed from: h */
    public static final /* synthetic */ void m8682h(FileHandle fileHandle, int i) {
        fileHandle.f26549x = i;
    }

    /* renamed from: F */
    public final InterfaceC10191h0 m8686F(long j) throws IOException {
        synchronized (this) {
            if (!this.f26548w) {
                this.f26549x++;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        return new C10190a(this, j);
    }

    public final void close() throws IOException {
        synchronized (this) {
            if (this.f26548w) {
                return;
            }
            this.f26548w = true;
            if (this.f26549x != 0) {
                return;
            }
            C13195u c13195u = C13195u.f34156a;
            m8681t();
        }
    }

    public final long size() throws IOException {
        synchronized (this) {
            if (!this.f26548w) {
                C13195u c13195u = C13195u.f34156a;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        return m8679y();
    }

    /* renamed from: t */
    protected abstract void m8681t() throws IOException;

    /* renamed from: v */
    protected abstract int m8680v(long j, byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: y */
    protected abstract long m8679y() throws IOException;
}
