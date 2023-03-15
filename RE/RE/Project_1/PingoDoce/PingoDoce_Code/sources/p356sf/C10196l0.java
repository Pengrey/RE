package p356sf;

import java.util.Arrays;
import p181jd.Intrinsics;
import p356sf.ByteString;

/* compiled from: -Base64.kt */
/* renamed from: sf.l0 */
/* loaded from: classes2.dex */
public final class C10196l0 {

    /* renamed from: a */
    private static final byte[] f26574a;

    static {
        ByteString.C10188a c10188a = ByteString.f26546z;
        f26574a = c10188a.m8692d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m8713i();
        c10188a.m8692d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m8713i();
    }

    /* renamed from: a */
    public static final byte[] m8616a(String str) {
        int i;
        char charAt;
        Intrinsics.isThisObjectNull(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i3 < length) {
                char charAt2 = str.charAt(i3);
                if ('A' <= charAt2 && charAt2 < '[') {
                    i = charAt2 - 'A';
                } else {
                    if ('a' <= charAt2 && charAt2 < '{') {
                        i = charAt2 - 'G';
                    } else {
                        if (('0' > charAt2 || charAt2 >= ':') ? false : false) {
                            i = charAt2 + 4;
                        } else if (charAt2 == '+' || charAt2 == '-') {
                            i = 62;
                        } else if (charAt2 == '/' || charAt2 == '_') {
                            i = 63;
                        } else {
                            if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                                return null;
                            }
                            i3++;
                        }
                    }
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    int i7 = i6 + 1;
                    bArr[i6] = (byte) (i5 >> 16);
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) (i5 >> 8);
                    bArr[i8] = (byte) i5;
                    i6 = i8 + 1;
                }
                i3++;
            } else {
                int i9 = i4 % 4;
                if (i9 != 1) {
                    if (i9 == 2) {
                        bArr[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i9 == 3) {
                        int i10 = i5 << 6;
                        int i11 = i6 + 1;
                        bArr[i6] = (byte) (i10 >> 16);
                        i6 = i11 + 1;
                        bArr[i11] = (byte) (i10 >> 8);
                    }
                    if (i6 == i2) {
                        return bArr;
                    }
                    byte[] copyOf = Arrays.copyOf(bArr, i6);
                    Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
                    return copyOf;
                }
                return null;
            }
        }
    }

    /* renamed from: b */
    public static final String m8615b(byte[] bArr, byte[] bArr2) {
        Intrinsics.isThisObjectNull(bArr, "<this>");
        Intrinsics.isThisObjectNull(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i10] = b5;
            bArr3[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i13] = bArr2[(b7 & 15) << 2];
            bArr3[i13 + 1] = (byte) 61;
        }
        return C10197m0.m8603b(bArr3);
    }

    /* renamed from: c */
    public static /* synthetic */ String m8614c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f26574a;
        }
        return m8615b(bArr, bArr2);
    }
}
