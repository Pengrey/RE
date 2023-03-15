package gb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.InterfaceC4413q;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import p179jb.C6412a;
import p179jb.C6414c;
import p239mb.C7155b;

/* renamed from: gb.c */
/* loaded from: classes2.dex */
public final class C5632c implements InterfaceC4413q {
    /* renamed from: b */
    private static C7155b m23523b(String str, EnumC4392a enumC4392a, int i, int i2, Charset charset, int i3, int i4) {
        if (enumC4392a == EnumC4392a.AZTEC) {
            return m23522c(C6414c.m21005d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(enumC4392a)));
    }

    /* renamed from: c */
    private static C7155b m23522c(C6412a c6412a, int i, int i2) {
        C7155b m21014a = c6412a.m21014a();
        if (m21014a != null) {
            int m19053l = m21014a.m19053l();
            int m19056i = m21014a.m19056i();
            int max = Math.max(i, m19053l);
            int max2 = Math.max(i2, m19056i);
            int min = Math.min(max / m19053l, max2 / m19056i);
            int i3 = (max - (m19053l * min)) / 2;
            int i4 = (max2 - (m19056i * min)) / 2;
            C7155b c7155b = new C7155b(max, max2);
            int i5 = 0;
            while (i5 < m19056i) {
                int i6 = 0;
                int i7 = i3;
                while (i6 < m19053l) {
                    if (m21014a.m19059e(i6, i5)) {
                        c7155b.m19050o(i7, i4, min, min);
                    }
                    i6++;
                    i7 += min;
                }
                i5++;
                i4 += min;
            }
            return c7155b;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 0;
        if (map != null) {
            EnumC4401f enumC4401f = EnumC4401f.CHARACTER_SET;
            if (map.containsKey(enumC4401f)) {
                charset = Charset.forName(map.get(enumC4401f).toString());
            }
            EnumC4401f enumC4401f2 = EnumC4401f.ERROR_CORRECTION;
            r1 = map.containsKey(enumC4401f2) ? Integer.parseInt(map.get(enumC4401f2).toString()) : 33;
            EnumC4401f enumC4401f3 = EnumC4401f.AZTEC_LAYERS;
            if (map.containsKey(enumC4401f3)) {
                i3 = Integer.parseInt(map.get(enumC4401f3).toString());
            }
        }
        return m23523b(str, enumC4392a, i, i2, charset, r1, i3);
    }
}
