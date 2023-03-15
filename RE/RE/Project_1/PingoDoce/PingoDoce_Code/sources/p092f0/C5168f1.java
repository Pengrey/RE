package p092f0;

import java.util.ArrayList;
import p181jd.Intrinsics;

/* renamed from: f0.f1 */
/* loaded from: classes.dex */
public final class C5168f1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final boolean m25417A(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final boolean m25416B(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m25415C(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5 = z ? 1073741824 : 0;
        int i6 = z2 ? 536870912 : 0;
        int i7 = z3 ? 268435456 : 0;
        int i8 = i * 5;
        iArr[i8 + 0] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final boolean m25414D(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final int m25413E(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final int m25412F(ArrayList arrayList, int i, int i2) {
        int m25407K = m25407K(arrayList, i, i2);
        return m25407K >= 0 ? m25407K : -(m25407K + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final int m25411G(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 134217727;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final int m25410H(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final int m25409I(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m25379w(iArr[i2 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final int m25408J(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final int m25407K(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int m25511a = ((C5159d) arrayList.get(i4)).m25511a();
            if (m25511a < 0) {
                m25511a += i2;
            }
            int isLessOrEqual = Intrinsics.isLessOrEqual(m25511a, i);
            if (isLessOrEqual < 0) {
                i3 = i4 + 1;
            } else if (isLessOrEqual <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final int m25406L(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m25379w(iArr[i2 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m25405M(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m25404N(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
            iArr[(i * 5) + 3] = i2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m25403O(int[] iArr, int i, int i2) {
        if (i2 >= 0 && i2 < 134217727) {
            int i3 = (i * 5) + 1;
            iArr[i3] = i2 | (iArr[i3] & (-134217728));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m25402P(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }

    /* renamed from: a */
    public static final /* synthetic */ int m25401a(int[] iArr, int i) {
        return m25380v(iArr, i);
    }

    /* renamed from: b */
    public static final /* synthetic */ int m25400b(int i) {
        return m25379w(i);
    }

    /* renamed from: c */
    public static final /* synthetic */ int m25399c(int[] iArr, int i) {
        return m25378x(iArr, i);
    }

    /* renamed from: d */
    public static final /* synthetic */ int m25398d(int[] iArr, int i) {
        return m25377y(iArr, i);
    }

    /* renamed from: e */
    public static final /* synthetic */ int m25397e(int[] iArr, int i) {
        return m25376z(iArr, i);
    }

    /* renamed from: f */
    public static final /* synthetic */ boolean m25396f(int[] iArr, int i) {
        return m25417A(iArr, i);
    }

    /* renamed from: g */
    public static final /* synthetic */ boolean m25395g(int[] iArr, int i) {
        return m25416B(iArr, i);
    }

    /* renamed from: h */
    public static final /* synthetic */ void m25394h(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        m25415C(iArr, i, i2, z, z2, z3, i3, i4);
    }

    /* renamed from: i */
    public static final /* synthetic */ boolean m25393i(int[] iArr, int i) {
        return m25414D(iArr, i);
    }

    /* renamed from: j */
    public static final /* synthetic */ int m25392j(int[] iArr, int i) {
        return m25413E(iArr, i);
    }

    /* renamed from: k */
    public static final /* synthetic */ int m25391k(ArrayList arrayList, int i, int i2) {
        return m25412F(arrayList, i, i2);
    }

    /* renamed from: l */
    public static final /* synthetic */ int m25390l(int[] iArr, int i) {
        return m25411G(iArr, i);
    }

    /* renamed from: m */
    public static final /* synthetic */ int m25389m(int[] iArr, int i) {
        return m25410H(iArr, i);
    }

    /* renamed from: n */
    public static final /* synthetic */ int m25388n(int[] iArr, int i) {
        return m25409I(iArr, i);
    }

    /* renamed from: o */
    public static final /* synthetic */ int m25387o(int[] iArr, int i) {
        return m25408J(iArr, i);
    }

    /* renamed from: p */
    public static final /* synthetic */ int m25386p(ArrayList arrayList, int i, int i2) {
        return m25407K(arrayList, i, i2);
    }

    /* renamed from: q */
    public static final /* synthetic */ int m25385q(int[] iArr, int i) {
        return m25406L(iArr, i);
    }

    /* renamed from: r */
    public static final /* synthetic */ void m25384r(int[] iArr, int i, int i2) {
        m25405M(iArr, i, i2);
    }

    /* renamed from: s */
    public static final /* synthetic */ void m25383s(int[] iArr, int i, int i2) {
        m25404N(iArr, i, i2);
    }

    /* renamed from: t */
    public static final /* synthetic */ void m25382t(int[] iArr, int i, int i2) {
        m25403O(iArr, i, i2);
    }

    /* renamed from: u */
    public static final /* synthetic */ void m25381u(int[] iArr, int i, int i2) {
        m25402P(iArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final int m25380v(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return m25379w(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final int m25379w(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final int m25378x(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final int m25377y(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final int m25376z(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }
}
