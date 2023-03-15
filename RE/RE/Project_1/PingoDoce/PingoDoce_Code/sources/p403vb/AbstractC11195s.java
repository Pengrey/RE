package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.InterfaceC4413q;
import com.google.zxing.WriterException;
import java.util.Map;
import java.util.regex.Pattern;
import p239mb.C7155b;

/* renamed from: vb.s */
/* loaded from: classes2.dex */
public abstract class AbstractC11195s implements InterfaceC4413q {

    /* renamed from: a */
    private static final Pattern f28753a = Pattern.compile("[0-9]+");

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static int m5782b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public static void m5781c(String str) {
        if (!f28753a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    /* renamed from: g */
    private static C7155b m5778g(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C7155b c7155b = new C7155b(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                c7155b.m19050o(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return c7155b;
    }

    @Override // com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i >= 0 && i2 >= 0) {
            int mo5755f = mo5755f();
            if (map != null) {
                EnumC4401f enumC4401f = EnumC4401f.MARGIN;
                if (map.containsKey(enumC4401f)) {
                    mo5755f = Integer.parseInt(map.get(enumC4401f).toString());
                }
            }
            return m5778g(mo5779e(str), i, i2, mo5755f);
        }
        throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
    }

    /* renamed from: d */
    public final C7155b m5780d(String str, EnumC4392a enumC4392a, int i, int i2) throws WriterException {
        return mo497a(str, enumC4392a, i, i2, null);
    }

    /* renamed from: e */
    public abstract boolean[] mo5779e(String str);

    /* renamed from: f */
    public int mo5755f() {
        return 10;
    }
}
