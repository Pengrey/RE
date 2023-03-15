package p335rb;

import androidx.constraintlayout.widget.C0868i;
import org.joda.time.DateTimeConstants;
import p070e.C4906j;

/* renamed from: rb.i */
/* loaded from: classes2.dex */
public final class C9843i {

    /* renamed from: a */
    private static final int[] f25790a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b */
    private static final int[][] f25791b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, C4906j.f13612y0, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, DateTimeConstants.HOURS_PER_WEEK, 39, 245, 60, 97, C4906j.f13390C0}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, C4906j.f13385B0, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, C0868i.f2778I0, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, DateTimeConstants.HOURS_PER_WEEK, 2, 188, 160, 153, 145, 253, 79, C0868i.f2773H0, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, C0868i.f2778I0, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, C4906j.f13410G0, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, C0868i.f2753D0, 174, 37, 151, 170, 53, 75, 34, 249, C4906j.f13395D0, 17, 138, 110, 213, 141, 136, C4906j.f13390C0, 151, 233, DateTimeConstants.HOURS_PER_WEEK, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, C0868i.f2748C0, C4906j.f13390C0, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, C0868i.f2743B0, 137, 95, C4906j.f13385B0, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, C0868i.f2763F0, C4906j.f13400E0, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, C0868i.f2763F0, 214, 111, 57, C4906j.f13395D0, 21, 1, 253, 57, 54, C0868i.f2743B0, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, C4906j.f13617z0, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, C4906j.f13380A0, 23, 37, 90, 170, 205, 131, 88, C4906j.f13390C0, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, C4906j.f13617z0, 203, 29, 232, 144, 238, 22, 150, 201, C4906j.f13617z0, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, C0868i.f2768G0, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, C4906j.f13380A0, 202, 188, 201, 189, 143, C0868i.f2773H0, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, C0868i.f2768G0, 232, 7, 94, 166, 224, C4906j.f13410G0, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, C4906j.f13400E0, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, C0868i.f2773H0, 153, 132, 63, 96, C0868i.f2753D0, 82, 186}};

    /* renamed from: c */
    private static final int[] f25792c = new int[256];

    /* renamed from: d */
    private static final int[] f25793d = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            f25793d[i2] = i;
            f25792c[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    /* renamed from: a */
    private static String m9863a(CharSequence charSequence, int i) {
        return m9862b(charSequence, 0, charSequence.length(), i);
    }

    /* renamed from: b */
    private static String m9862b(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = f25790a;
            if (i4 >= iArr.length) {
                i4 = -1;
                break;
            } else if (iArr[i4] == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int[] iArr2 = f25791b[i4];
            char[] cArr = new char[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                cArr[i5] = 0;
            }
            for (int i6 = i; i6 < i + i2; i6++) {
                int i7 = i3 - 1;
                int charAt = cArr[i7] ^ charSequence.charAt(i6);
                while (i7 > 0) {
                    if (charAt != 0 && iArr2[i7] != 0) {
                        char c = cArr[i7 - 1];
                        int[] iArr3 = f25793d;
                        int[] iArr4 = f25792c;
                        cArr[i7] = (char) (c ^ iArr3[(iArr4[charAt] + iArr4[iArr2[i7]]) % 255]);
                    } else {
                        cArr[i7] = cArr[i7 - 1];
                    }
                    i7--;
                }
                if (charAt != 0 && iArr2[0] != 0) {
                    int[] iArr5 = f25793d;
                    int[] iArr6 = f25792c;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[iArr2[0]]) % 255];
                } else {
                    cArr[0] = 0;
                }
            }
            char[] cArr2 = new char[i3];
            for (int i8 = 0; i8 < i3; i8++) {
                cArr2[i8] = cArr[(i3 - i8) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i3)));
    }

    /* renamed from: c */
    public static String m9861c(String str, C9845k c9845k) {
        if (str.length() == c9845k.m9845a()) {
            StringBuilder sb2 = new StringBuilder(c9845k.m9845a() + c9845k.m9843c());
            sb2.append(str);
            int mo9840f = c9845k.mo9840f();
            if (mo9840f == 1) {
                sb2.append(m9863a(str, c9845k.m9843c()));
            } else {
                sb2.setLength(sb2.capacity());
                int[] iArr = new int[mo9840f];
                int[] iArr2 = new int[mo9840f];
                int i = 0;
                while (i < mo9840f) {
                    int i2 = i + 1;
                    iArr[i] = c9845k.mo9844b(i2);
                    iArr2[i] = c9845k.m9842d(i2);
                    i = i2;
                }
                for (int i3 = 0; i3 < mo9840f; i3++) {
                    StringBuilder sb3 = new StringBuilder(iArr[i3]);
                    for (int i4 = i3; i4 < c9845k.m9845a(); i4 += mo9840f) {
                        sb3.append(str.charAt(i4));
                    }
                    String m9863a = m9863a(sb3.toString(), iArr2[i3]);
                    int i5 = 0;
                    int i6 = i3;
                    while (i6 < iArr2[i3] * mo9840f) {
                        sb2.setCharAt(c9845k.m9845a() + i6, m9863a.charAt(i5));
                        i6 += mo9840f;
                        i5++;
                    }
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }
}
