package p403vb;

import com.google.crypto.tink.shaded.protobuf.Reader;
import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import p239mb.C7154a;

/* renamed from: vb.a */
/* loaded from: classes2.dex */
public final class C11174a extends AbstractC11194r {

    /* renamed from: d */
    static final char[] f28712d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f28713e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f28714f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f28715a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f28716b = new int[80];

    /* renamed from: c */
    private int f28717c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m5824i(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m5823j(int i) {
        int[] iArr = this.f28716b;
        int i2 = this.f28717c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f28717c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f28716b = iArr2;
        }
    }

    /* renamed from: k */
    private int m5822k() throws NotFoundException {
        for (int i = 1; i < this.f28717c; i += 2) {
            int m5820m = m5820m(i);
            if (m5820m != -1 && m5824i(f28714f, f28712d[m5820m])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f28716b[i3];
                }
                if (i == 1 || this.f28716b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: l */
    private void m5821l(C7154a c7154a) throws NotFoundException {
        int i = 0;
        this.f28717c = 0;
        int m19073k = c7154a.m19073k(0);
        int m19072l = c7154a.m19072l();
        if (m19073k < m19072l) {
            boolean z = true;
            while (m19073k < m19072l) {
                if (c7154a.m19076g(m19073k) != z) {
                    i++;
                } else {
                    m5823j(i);
                    z = !z;
                    i = 1;
                }
                m19073k++;
            }
            m5823j(i);
            return;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: m */
    private int m5820m(int i) {
        int i2 = i + 7;
        if (i2 >= this.f28717c) {
            return -1;
        }
        int[] iArr = this.f28716b;
        int i3 = Reader.READ_DONE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f28713e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
        throw com.google.zxing.NotFoundException.m27700a();
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5819n(int r15) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p403vb.C11174a.m5819n(int):void");
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException {
        Arrays.fill(this.f28716b, 0);
        m5821l(c7154a);
        int m5822k = m5822k();
        this.f28715a.setLength(0);
        int i2 = m5822k;
        do {
            int m5820m = m5820m(i2);
            if (m5820m != -1) {
                this.f28715a.append((char) m5820m);
                i2 += 8;
                if (this.f28715a.length() > 1 && m5824i(f28714f, f28712d[m5820m])) {
                    break;
                }
            } else {
                throw NotFoundException.m27700a();
            }
        } while (i2 < this.f28717c);
        int i3 = i2 - 1;
        int i4 = this.f28716b[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.f28716b[i2 + i6];
        }
        if (i2 < this.f28717c && i4 < i5 / 2) {
            throw NotFoundException.m27700a();
        }
        m5819n(m5822k);
        for (int i7 = 0; i7 < this.f28715a.length(); i7++) {
            StringBuilder sb2 = this.f28715a;
            sb2.setCharAt(i7, f28712d[sb2.charAt(i7)]);
        }
        char charAt = this.f28715a.charAt(0);
        char[] cArr = f28714f;
        if (m5824i(cArr, charAt)) {
            StringBuilder sb3 = this.f28715a;
            if (m5824i(cArr, sb3.charAt(sb3.length() - 1))) {
                if (this.f28715a.length() > 3) {
                    if (map == null || !map.containsKey(EnumC4399d.RETURN_CODABAR_START_END)) {
                        StringBuilder sb4 = this.f28715a;
                        sb4.deleteCharAt(sb4.length() - 1);
                        this.f28715a.deleteCharAt(0);
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < m5822k; i9++) {
                        i8 += this.f28716b[i9];
                    }
                    float f = i8;
                    while (m5822k < i3) {
                        i8 += this.f28716b[m5822k];
                        m5822k++;
                    }
                    float f2 = i;
                    return new C4409m(this.f28715a.toString(), null, new C4411o[]{new C4411o(f, f2), new C4411o(i8, f2)}, EnumC4392a.CODABAR);
                }
                throw NotFoundException.m27700a();
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }
}
