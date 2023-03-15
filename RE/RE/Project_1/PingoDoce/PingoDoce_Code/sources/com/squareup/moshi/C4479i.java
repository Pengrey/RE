package com.squareup.moshi;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.moshi.i */
/* loaded from: classes2.dex */
public final class C4479i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m27460a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i2]);
                sb2.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb2.append('.');
                if (strArr[i2] != null) {
                    sb2.append(strArr[i2]);
                }
            }
        }
        return sb2.toString();
    }
}
