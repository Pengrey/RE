package p356sf;

import java.io.RandomAccessFile;
import p181jd.Intrinsics;

/* renamed from: sf.q */
/* loaded from: classes2.dex */
public final class JvmFileHandle extends FileHandle {

    /* renamed from: y */
    private final RandomAccessFile f26588y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        Intrinsics.isThisObjectNull(randomAccessFile, "randomAccessFile");
        this.f26588y = randomAccessFile;
    }

    /* renamed from: t */
    protected synchronized void m8585t() {
        this.f26588y.close();
    }

    /* renamed from: v */
    protected synchronized int m8584v(long j, byte[] bArr, int i, int i2) {
        Intrinsics.isThisObjectNull(bArr, "array");
        this.f26588y.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.f26588y.read(bArr, i, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    /* renamed from: y */
    protected synchronized long m8583y() {
        return this.f26588y.length();
    }
}
