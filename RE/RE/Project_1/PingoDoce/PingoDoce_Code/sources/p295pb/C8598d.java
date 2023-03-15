package p295pb;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.C4395a;
import com.google.zxing.common.reedsolomon.C4397c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import p239mb.C7155b;
import p239mb.C7158e;

/* renamed from: pb.d */
/* loaded from: classes2.dex */
public final class C8598d {

    /* renamed from: a */
    private final C4397c f22206a = new C4397c(C4395a.f11899m);

    /* renamed from: a */
    private void m15054a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f22206a.m27670a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m27703a();
        }
    }

    /* renamed from: b */
    public C7158e m15053b(C7155b c7155b) throws FormatException, ChecksumException {
        C8593a c8593a = new C8593a(c7155b);
        C8594b[] m15065b = C8594b.m15065b(c8593a.m15074c(), c8593a.m15075b());
        int i = 0;
        for (C8594b c8594b : m15065b) {
            i += c8594b.m15064c();
        }
        byte[] bArr = new byte[i];
        int length = m15065b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C8594b c8594b2 = m15065b[i2];
            byte[] m15066a = c8594b2.m15066a();
            int m15064c = c8594b2.m15064c();
            m15054a(m15066a, m15064c);
            for (int i3 = 0; i3 < m15064c; i3++) {
                bArr[(i3 * length) + i2] = m15066a[i3];
            }
        }
        return C8595c.m15063a(bArr);
    }
}
