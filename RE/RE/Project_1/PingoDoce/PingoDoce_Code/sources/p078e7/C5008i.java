package p078e7;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: e7.i */
/* loaded from: classes.dex */
public class C5008i {

    /* renamed from: a */
    private static final char[] f13946a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f13947b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m25904a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            char[] cArr2 = f13947b;
            cArr[i] = cArr2[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m25903b(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i = 0; i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0); i++) {
            char[] cArr = f13946a;
            sb2.append(cArr[(bArr[i] & 240) >>> 4]);
            sb2.append(cArr[bArr[i] & 15]);
        }
        return sb2.toString();
    }
}
