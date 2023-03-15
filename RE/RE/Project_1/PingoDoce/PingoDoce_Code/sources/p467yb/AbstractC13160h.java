package p467yb;

import p239mb.C7154a;

/* renamed from: yb.h */
/* loaded from: classes2.dex */
abstract class AbstractC13160h extends AbstractC13162j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC13160h(C7154a c7154a) {
        super(c7154a);
    }

    /* renamed from: e */
    private static void m1521e(StringBuilder sb2, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int charAt = sb2.charAt(i3 + i) - '0';
            if ((i3 & 1) == 0) {
                charAt *= 3;
            }
            i2 += charAt;
        }
        int i4 = 10 - (i2 % 10);
        sb2.append(i4 != 10 ? i4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m1520f(StringBuilder sb2, int i) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        m1519g(sb2, i, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m1519g(StringBuilder sb2, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int m1483f = m1514b().m1483f((i3 * 10) + i, 10);
            if (m1483f / 100 == 0) {
                sb2.append('0');
            }
            if (m1483f / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m1483f);
        }
        m1521e(sb2, i2);
    }
}
