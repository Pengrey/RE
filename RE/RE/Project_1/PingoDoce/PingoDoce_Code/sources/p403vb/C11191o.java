package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.WriterException;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: vb.o */
/* loaded from: classes2.dex */
public final class C11191o extends AbstractC11195s {

    /* renamed from: b */
    private static final int[] f28746b = {1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f28747c = {3, 1, 1};

    /* renamed from: d */
    private static final int[][] f28748d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // p403vb.AbstractC11195s, com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.ITF) {
            return super.mo497a(str, enumC4392a, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(enumC4392a)));
    }

    @Override // p403vb.AbstractC11195s
    /* renamed from: e */
    public boolean[] mo5779e(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                AbstractC11195s.m5781c(str);
                boolean[] zArr = new boolean[(length * 9) + 9];
                int m5782b = AbstractC11195s.m5782b(zArr, 0, f28746b, true);
                for (int i = 0; i < length; i += 2) {
                    int digit = Character.digit(str.charAt(i), 10);
                    int digit2 = Character.digit(str.charAt(i + 1), 10);
                    int[] iArr = new int[10];
                    for (int i2 = 0; i2 < 5; i2++) {
                        int i3 = i2 * 2;
                        int[][] iArr2 = f28748d;
                        iArr[i3] = iArr2[digit][i2];
                        iArr[i3 + 1] = iArr2[digit2][i2];
                    }
                    m5782b += AbstractC11195s.m5782b(zArr, m5782b, iArr, true);
                }
                AbstractC11195s.m5782b(zArr, m5782b, f28747c, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
