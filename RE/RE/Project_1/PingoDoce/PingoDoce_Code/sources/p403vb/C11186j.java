package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: vb.j */
/* loaded from: classes2.dex */
public final class C11186j extends AbstractC11202z {
    @Override // p403vb.AbstractC11195s, com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.EAN_13) {
            return super.mo497a(str, enumC4392a, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(enumC4392a)));
    }

    @Override // p403vb.AbstractC11195s
    /* renamed from: e */
    public boolean[] mo5779e(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + AbstractC11201y.m5756s(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!AbstractC11201y.m5765j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        AbstractC11195s.m5781c(str);
        int i = C11185i.f28736j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int m5782b = AbstractC11195s.m5782b(zArr, 0, AbstractC11201y.f28764d, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            m5782b += AbstractC11195s.m5782b(zArr, m5782b, AbstractC11201y.f28768h[digit], false);
        }
        int m5782b2 = m5782b + AbstractC11195s.m5782b(zArr, m5782b, AbstractC11201y.f28765e, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            m5782b2 += AbstractC11195s.m5782b(zArr, m5782b2, AbstractC11201y.f28767g[Character.digit(str.charAt(i3), 10)], true);
        }
        AbstractC11195s.m5782b(zArr, m5782b2, AbstractC11201y.f28764d, true);
        return zArr;
    }
}
