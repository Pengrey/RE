package ec;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.InterfaceC4413q;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.EnumC4428f;
import java.util.Map;
import p122gc.C5634b;
import p122gc.C5635c;
import p122gc.C5639f;
import p239mb.C7155b;

/* renamed from: ec.b */
/* loaded from: classes2.dex */
public final class C5030b implements InterfaceC4413q {
    /* renamed from: b */
    private static C7155b m25869b(C5639f c5639f, int i, int i2, int i3) {
        C5634b m23463a = c5639f.m23463a();
        if (m23463a != null) {
            int m23515e = m23463a.m23515e();
            int m23516d = m23463a.m23516d();
            int i4 = i3 << 1;
            int i5 = m23515e + i4;
            int i6 = i4 + m23516d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (m23515e * min)) / 2;
            int i8 = (max2 - (m23516d * min)) / 2;
            C7155b c7155b = new C7155b(max, max2);
            int i9 = 0;
            while (i9 < m23516d) {
                int i10 = 0;
                int i11 = i7;
                while (i10 < m23515e) {
                    if (m23463a.m23518b(i10, i9) == 1) {
                        c7155b.m19050o(i11, i8, min, min);
                    }
                    i10++;
                    i11 += min;
                }
                i9++;
                i8 += min;
            }
            return c7155b;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (!str.isEmpty()) {
            if (enumC4392a == EnumC4392a.QR_CODE) {
                if (i >= 0 && i2 >= 0) {
                    EnumC4428f enumC4428f = EnumC4428f.L;
                    int i3 = 4;
                    if (map != null) {
                        EnumC4401f enumC4401f = EnumC4401f.ERROR_CORRECTION;
                        if (map.containsKey(enumC4401f)) {
                            enumC4428f = EnumC4428f.valueOf(map.get(enumC4401f).toString());
                        }
                        EnumC4401f enumC4401f2 = EnumC4401f.MARGIN;
                        if (map.containsKey(enumC4401f2)) {
                            i3 = Integer.parseInt(map.get(enumC4401f2).toString());
                        }
                    }
                    return m25869b(C5635c.m23499n(str, enumC4428f, map), i, i2, i3);
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(enumC4392a)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
