package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: vb.b0 */
/* loaded from: classes2.dex */
public final class C11177b0 extends AbstractC11202z {
    @Override // p403vb.AbstractC11195s, com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.UPC_E) {
            return super.mo497a(str, enumC4392a, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(enumC4392a)));
    }

    @Override // p403vb.AbstractC11195s
    /* renamed from: e */
    public boolean[] mo5779e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC11201y.m5756s(C11175a0.m5818t(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!AbstractC11201y.m5765j(C11175a0.m5818t(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        AbstractC11195s.m5781c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = C11175a0.f28719k[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int m5782b = AbstractC11195s.m5782b(zArr, 0, AbstractC11201y.f28764d, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit2 += 10;
            }
            m5782b += AbstractC11195s.m5782b(zArr, m5782b, AbstractC11201y.f28768h[digit2], false);
        }
        AbstractC11195s.m5782b(zArr, m5782b, AbstractC11201y.f28766f, false);
        return zArr;
    }
}
