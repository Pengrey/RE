package p403vb;

import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4410n;
import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;
import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vb.v */
/* loaded from: classes2.dex */
public final class C11198v {

    /* renamed from: a */
    private final int[] f28756a = new int[4];

    /* renamed from: b */
    private final StringBuilder f28757b = new StringBuilder();

    /* renamed from: a */
    private int m5776a(C7154a c7154a, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f28756a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m19072l = c7154a.m19072l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < m19072l; i3++) {
            int m5764k = AbstractC11201y.m5764k(c7154a, iArr2, i, AbstractC11201y.f28768h);
            sb2.append((char) ((m5764k % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m5764k >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = c7154a.m19073k(c7154a.m19074j(i));
            }
        }
        if (sb2.length() == 2) {
            if (Integer.parseInt(sb2.toString()) % 4 == i2) {
                return i;
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: c */
    private static Map<EnumC4410n, Object> m5774c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC4410n.class);
        enumMap.put((EnumMap) EnumC4410n.ISSUE_NUMBER, (EnumC4410n) Integer.valueOf(str));
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C4409m m5775b(int i, C7154a c7154a, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f28757b;
        sb2.setLength(0);
        int m5776a = m5776a(c7154a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC4410n, Object> m5774c = m5774c(sb3);
        float f = i;
        C4409m c4409m = new C4409m(sb3, null, new C4411o[]{new C4411o((iArr[0] + iArr[1]) / 2.0f, f), new C4411o(m5776a, f)}, EnumC4392a.UPC_EAN_EXTENSION);
        if (m5774c != null) {
            c4409m.m27644g(m5774c);
        }
        return c4409m;
    }
}
