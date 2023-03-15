package p356sf;

import p181jd.Intrinsics;

/* renamed from: sf.j0 */
/* loaded from: classes2.dex */
public final class Utf8 {
    /* renamed from: a */
    public static final long m8630a(String str, int i, int i2) {
        int i3;
        Intrinsics.isThisObjectNull(str, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 >= i) {
            if (!(i2 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            long j = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    j++;
                } else {
                    if (charAt < 2048) {
                        i3 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i3 = 3;
                    } else {
                        int i4 = i + 1;
                        char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j++;
                            i = i4;
                        } else {
                            j += 4;
                            i += 2;
                        }
                    }
                    j += i3;
                }
                i++;
            }
            return j;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m8629b(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m8630a(str, i, i2);
    }
}
