package p488zb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.InterfaceC4413q;
import com.google.zxing.WriterException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import p063dc.C4778d;
import p063dc.C4779e;
import p063dc.EnumC4777c;
import p239mb.C7155b;

/* renamed from: zb.d */
/* loaded from: classes2.dex */
public final class C13747d implements InterfaceC4413q {
    /* renamed from: b */
    private static C7155b m496b(byte[][] bArr, int i) {
        int i2 = i * 2;
        C7155b c7155b = new C7155b(bArr[0].length + i2, bArr.length + i2);
        c7155b.m19062b();
        int m19056i = (c7155b.m19056i() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    c7155b.m19051n(i4 + i, m19056i);
                }
            }
            i3++;
            m19056i--;
        }
        return c7155b;
    }

    /* renamed from: c */
    private static C7155b m495c(C4779e c4779e, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        c4779e.m26636e(str, i);
        byte[][] m26649b = c4779e.m26635f().m26649b(1, 4);
        if ((i3 > i2) != (m26649b[0].length < m26649b.length)) {
            m26649b = m494d(m26649b);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / m26649b[0].length;
        int length2 = i3 / m26649b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] m26649b2 = c4779e.m26635f().m26649b(length, length << 2);
            if (z) {
                m26649b2 = m494d(m26649b2);
            }
            return m496b(m26649b2, i4);
        }
        return m496b(m26649b, i4);
    }

    /* renamed from: d */
    private static byte[][] m494d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.PDF_417) {
            C4779e c4779e = new C4779e();
            if (map != null) {
                EnumC4401f enumC4401f = EnumC4401f.PDF417_COMPACT;
                if (map.containsKey(enumC4401f)) {
                    c4779e.m26633h(Boolean.valueOf(map.get(enumC4401f).toString()).booleanValue());
                }
                EnumC4401f enumC4401f2 = EnumC4401f.PDF417_COMPACTION;
                if (map.containsKey(enumC4401f2)) {
                    c4779e.m26632i(EnumC4777c.valueOf(map.get(enumC4401f2).toString()));
                }
                EnumC4401f enumC4401f3 = EnumC4401f.PDF417_DIMENSIONS;
                if (map.containsKey(enumC4401f3)) {
                    C4778d c4778d = (C4778d) map.get(enumC4401f3);
                    c4779e.m26631j(c4778d.m26644a(), c4778d.m26642c(), c4778d.m26643b(), c4778d.m26641d());
                }
                EnumC4401f enumC4401f4 = EnumC4401f.MARGIN;
                r9 = map.containsKey(enumC4401f4) ? Integer.parseInt(map.get(enumC4401f4).toString()) : 30;
                EnumC4401f enumC4401f5 = EnumC4401f.ERROR_CORRECTION;
                r0 = map.containsKey(enumC4401f5) ? Integer.parseInt(map.get(enumC4401f5).toString()) : 2;
                EnumC4401f enumC4401f6 = EnumC4401f.CHARACTER_SET;
                if (map.containsKey(enumC4401f6)) {
                    c4779e.m26630k(Charset.forName(map.get(enumC4401f6).toString()));
                }
            }
            return m495c(c4779e, str, r0, i, i2, r9);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(enumC4392a)));
    }
}
