package nf;

import com.github.aachartmodel.aainfographics.BuildConfig;
import gf.Util;
import p181jd.Intrinsics;
import p356sf.ByteString;
import sd.StringsJVM;

/* renamed from: nf.b */
/* loaded from: classes2.dex */
public final class C7705b {

    /* renamed from: a */
    public static final C7705b f20317a = new C7705b();

    /* renamed from: b */
    public static final ByteString f20318b = ByteString.f26546z.m8692d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    private static final String[] f20319c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    private static final String[] f20320d = new String[64];

    /* renamed from: e */
    private static final String[] f20321e;

    static {
        String m8936x;
        String[] strArr = new String[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.checkIfNull(binaryString, "toBinaryString(it)");
            m8936x = StringsJVM.m8936x(Util.m23397t("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i2] = m8936x;
        }
        f20321e = strArr;
        String[] strArr2 = f20320d;
        strArr2[0] = BuildConfig.VERSION_NAME;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = 0;
        while (i3 < 1) {
            int i4 = iArr[i3];
            i3++;
            String[] strArr3 = f20320d;
            strArr3[i4 | 8] = Intrinsics.addStrAndObj(strArr3[i4], "|PADDED");
        }
        String[] strArr4 = f20320d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i5 = 0;
        while (i5 < 3) {
            int i6 = iArr2[i5];
            i5++;
            int i7 = 0;
            while (i7 < 1) {
                int i8 = iArr[i7];
                i7++;
                String[] strArr5 = f20320d;
                int i9 = i8 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) strArr5[i8]);
                sb2.append('|');
                sb2.append((Object) strArr5[i6]);
                strArr5[i9] = sb2.toString();
                strArr5[i9 | 8] = ((Object) strArr5[i8]) + '|' + ((Object) strArr5[i6]) + "|PADDED";
            }
        }
        int length = f20320d.length;
        while (i < length) {
            int i10 = i + 1;
            String[] strArr6 = f20320d;
            if (strArr6[i] == null) {
                strArr6[i] = f20321e[i];
            }
            i = i10;
        }
    }

    private C7705b() {
    }

    /* renamed from: a */
    public final String m17664a(int i, int i2) {
        String str;
        String m8935y;
        String m8935y2;
        if (i2 == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : f20321e[i2];
            } else if (i != 7 && i != 8) {
                String[] strArr = f20320d;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    Intrinsics.ifNullDoSomething(str);
                } else {
                    str = f20321e[i2];
                }
                String str2 = str;
                if (i == 5 && (i2 & 4) != 0) {
                    m8935y2 = StringsJVM.m8935y(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
                    return m8935y2;
                } else if (i != 0 || (i2 & 32) == 0) {
                    return str2;
                } else {
                    m8935y = StringsJVM.m8935y(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                    return m8935y;
                }
            }
        }
        return f20321e[i2];
    }

    /* renamed from: b */
    public final String m17663b(int i) {
        String[] strArr = f20319c;
        return i < strArr.length ? strArr[i] : Util.m23397t("0x%02x", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final String m17662c(boolean z, int i, int i2, int i3, int i4) {
        return Util.m23397t("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m17663b(i3), m17664a(i3, i4));
    }
}
