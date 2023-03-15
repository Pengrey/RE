package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: vb.l */
/* loaded from: classes2.dex */
public final class C11188l extends AbstractC11202z {
    @Override // p403vb.AbstractC11195s, com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.EAN_8) {
            return super.mo497a(str, enumC4392a, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(enumC4392a)));
    }

    @Override // p403vb.AbstractC11195s
    /* renamed from: e */
    public boolean[] mo5779e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC11201y.m5756s(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!AbstractC11201y.m5765j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        AbstractC11195s.m5781c(str);
        boolean[] zArr = new boolean[67];
        int m5782b = AbstractC11195s.m5782b(zArr, 0, AbstractC11201y.f28764d, true) + 0;
        for (int i = 0; i <= 3; i++) {
            m5782b += AbstractC11195s.m5782b(zArr, m5782b, AbstractC11201y.f28767g[Character.digit(str.charAt(i), 10)], false);
        }
        int m5782b2 = m5782b + AbstractC11195s.m5782b(zArr, m5782b, AbstractC11201y.f28765e, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            m5782b2 += AbstractC11195s.m5782b(zArr, m5782b2, AbstractC11201y.f28767g[Character.digit(str.charAt(i2), 10)], true);
        }
        AbstractC11195s.m5782b(zArr, m5782b2, AbstractC11201y.f28764d, true);
        return zArr;
    }
}
