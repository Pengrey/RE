package tf;

import p181jd.Intrinsics;
import p356sf.SegmentedByteString;

/* compiled from: -SegmentedByteString.kt */
/* renamed from: tf.j */
/* loaded from: classes2.dex */
public final class C10617j {
    /* renamed from: a */
    public static final int m7487a(int[] iArr, int i, int i2, int i3) {
        Intrinsics.isThisObjectNull(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m7486b(SegmentedByteString segmentedByteString, int i) {
        Intrinsics.isThisObjectNull(segmentedByteString, "<this>");
        int m7487a = m7487a(segmentedByteString.m8741H(), i + 1, 0, segmentedByteString.m8740I().length);
        return m7487a >= 0 ? m7487a : ~m7487a;
    }
}
