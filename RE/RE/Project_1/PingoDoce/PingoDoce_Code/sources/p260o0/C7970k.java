package p260o0;

import p181jd.Intrinsics;

/* compiled from: SnapshotIdSet.kt */
/* renamed from: o0.k */
/* loaded from: classes.dex */
public final class C7970k {
    /* renamed from: a */
    public static final /* synthetic */ int m17345a(long j) {
        return m17343c(j);
    }

    /* renamed from: b */
    public static final int m17344b(int[] iArr, int i) {
        Intrinsics.isThisObjectNull(iArr, "<this>");
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i >= i4) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    private static final int m17343c(long j) {
        int i = 32;
        if ((4294967295L & j) == 0) {
            j >>= 32;
        } else {
            i = 0;
        }
        if ((65535 & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }
}
