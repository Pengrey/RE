package p064dd;

/* renamed from: dd.c */
/* loaded from: classes2.dex */
public final class C4785c {
    /* renamed from: a */
    private static final int m26611a(int i, int i2, int i3) {
        return m26609c(m26609c(i, i3) - m26609c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m26610b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m26611a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m26611a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: c */
    private static final int m26609c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
