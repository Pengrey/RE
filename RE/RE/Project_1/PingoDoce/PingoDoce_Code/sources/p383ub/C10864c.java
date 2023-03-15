package p383ub;

import com.google.zxing.ChecksumException;
import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.C4395a;
import com.google.zxing.common.reedsolomon.C4397c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import p239mb.C7155b;
import p239mb.C7158e;

/* renamed from: ub.c */
/* loaded from: classes2.dex */
public final class C10864c {

    /* renamed from: a */
    private final C4397c f28069a = new C4397c(C4395a.f11901o);

    /* renamed from: a */
    private void m6828a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f28069a.m27670a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m27703a();
        }
    }

    /* renamed from: b */
    public C7158e m6827b(C7155b c7155b, Map<EnumC4399d, ?> map) throws FormatException, ChecksumException {
        byte[] bArr;
        byte[] m6838a = new C10862a(c7155b).m6838a();
        m6828a(m6838a, 0, 10, 10, 0);
        int i = m6838a[0] & 15;
        if (i == 2 || i == 3 || i == 4) {
            m6828a(m6838a, 20, 84, 40, 1);
            m6828a(m6838a, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (i == 5) {
            m6828a(m6838a, 20, 68, 56, 1);
            m6828a(m6838a, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.m27702a();
        }
        System.arraycopy(m6838a, 0, bArr, 0, 10);
        System.arraycopy(m6838a, 20, bArr, 10, bArr.length - 10);
        return C10863b.m6837a(bArr, i);
    }
}
