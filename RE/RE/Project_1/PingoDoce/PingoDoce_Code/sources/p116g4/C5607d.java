package p116g4;

/* renamed from: g4.d */
/* loaded from: classes.dex */
final class C5607d {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m23608a(int i, int[] iArr, String[] strArr, int[] iArr2) {
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
