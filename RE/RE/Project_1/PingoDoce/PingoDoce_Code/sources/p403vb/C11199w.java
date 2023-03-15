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
/* renamed from: vb.w */
/* loaded from: classes2.dex */
public final class C11199w {

    /* renamed from: c */
    private static final int[] f28758c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f28759a = new int[4];

    /* renamed from: b */
    private final StringBuilder f28760b = new StringBuilder();

    /* renamed from: a */
    private int m5773a(C7154a c7154a, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f28759a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m19072l = c7154a.m19072l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < m19072l; i3++) {
            int m5764k = AbstractC11201y.m5764k(c7154a, iArr2, i, AbstractC11201y.f28768h);
            sb2.append((char) ((m5764k % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m5764k >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = c7154a.m19073k(c7154a.m19074j(i));
            }
        }
        if (sb2.length() == 5) {
            if (m5770d(sb2.toString()) == m5771c(i2)) {
                return i;
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: c */
    private static int m5771c(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f28758c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: d */
    private static int m5770d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.equals("90000") == false) goto L9;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m5769e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            if (r1 == r2) goto L15
            goto L4f
        L15:
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r1
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r4
            goto L3e
        L35:
            java.lang.String r2 = "90000"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r3 = "$"
            goto L4f
        L4d:
            java.lang.String r3 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L6e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "0"
            java.lang.String r5 = r1.concat(r5)
            goto L72
        L6e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p403vb.C11199w.m5769e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static Map<EnumC4410n, Object> m5768f(String str) {
        String m5769e;
        if (str.length() == 5 && (m5769e = m5769e(str)) != null) {
            EnumMap enumMap = new EnumMap(EnumC4410n.class);
            enumMap.put((EnumMap) EnumC4410n.SUGGESTED_PRICE, (EnumC4410n) m5769e);
            return enumMap;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C4409m m5772b(int i, C7154a c7154a, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f28760b;
        sb2.setLength(0);
        int m5773a = m5773a(c7154a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC4410n, Object> m5768f = m5768f(sb3);
        float f = i;
        C4409m c4409m = new C4409m(sb3, null, new C4411o[]{new C4411o((iArr[0] + iArr[1]) / 2.0f, f), new C4411o(m5773a, f)}, EnumC4392a.UPC_EAN_EXTENSION);
        if (m5768f != null) {
            c4409m.m27644g(m5768f);
        }
        return c4409m;
    }
}
