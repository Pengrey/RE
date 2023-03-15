package p403vb;

import androidx.constraintlayout.widget.C0868i;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: vb.d */
/* loaded from: classes2.dex */
public final class C11179d extends AbstractC11195s {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Code128Writer.java */
    /* renamed from: vb.d$a */
    /* loaded from: classes2.dex */
    public enum EnumC11180a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: h */
    private static int m5814h(CharSequence charSequence, int i, int i2) {
        EnumC11180a m5813i;
        EnumC11180a m5813i2;
        char charAt;
        EnumC11180a m5813i3 = m5813i(charSequence, i);
        EnumC11180a enumC11180a = EnumC11180a.ONE_DIGIT;
        if (m5813i3 == enumC11180a) {
            if (i2 == 101) {
                return C0868i.f2743B0;
            }
            return 100;
        }
        EnumC11180a enumC11180a2 = EnumC11180a.UNCODABLE;
        if (m5813i3 == enumC11180a2) {
            if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) {
                return 100;
            }
            return C0868i.f2743B0;
        } else if (i2 == 101 && m5813i3 == EnumC11180a.FNC_1) {
            return C0868i.f2743B0;
        } else {
            if (i2 == 99) {
                return 99;
            }
            if (i2 == 100) {
                EnumC11180a enumC11180a3 = EnumC11180a.FNC_1;
                if (m5813i3 == enumC11180a3 || (m5813i = m5813i(charSequence, i + 2)) == enumC11180a2 || m5813i == enumC11180a) {
                    return 100;
                }
                if (m5813i == enumC11180a3) {
                    return m5813i(charSequence, i + 3) == EnumC11180a.TWO_DIGITS ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    m5813i2 = m5813i(charSequence, i3);
                    if (m5813i2 != EnumC11180a.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                return m5813i2 == EnumC11180a.ONE_DIGIT ? 100 : 99;
            }
            if (m5813i3 == EnumC11180a.FNC_1) {
                m5813i3 = m5813i(charSequence, i + 1);
            }
            return m5813i3 == EnumC11180a.TWO_DIGITS ? 99 : 100;
        }
    }

    /* renamed from: i */
    private static EnumC11180a m5813i(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return EnumC11180a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return EnumC11180a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return EnumC11180a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return EnumC11180a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 >= '0' && charAt2 <= '9') {
            return EnumC11180a.TWO_DIGITS;
        }
        return EnumC11180a.ONE_DIGIT;
    }

    @Override // p403vb.AbstractC11195s, com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.CODE_128) {
            return super.mo497a(str, enumC4392a, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(enumC4392a)));
    }

    @Override // p403vb.AbstractC11195s
    /* renamed from: e */
    public boolean[] mo5779e(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt <= 127) {
                            break;
                        } else {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                        }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (true) {
                int i7 = C0868i.f2753D0;
                if (i3 < length) {
                    int m5814h = m5814h(str, i3, i5);
                    int i8 = 100;
                    if (m5814h == i5) {
                        switch (str.charAt(i3)) {
                            case 241:
                                i8 = C0868i.f2748C0;
                                break;
                            case 242:
                                i8 = 97;
                                break;
                            case 243:
                                i8 = 96;
                                break;
                            case 244:
                                if (i5 == 101) {
                                    i8 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i5 != 100) {
                                    if (i5 == 101) {
                                        i8 = str.charAt(i3) - ' ';
                                        if (i8 < 0) {
                                            i8 += 96;
                                            break;
                                        }
                                    } else {
                                        i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                        i3++;
                                        break;
                                    }
                                } else {
                                    i8 = str.charAt(i3) - ' ';
                                    break;
                                }
                                break;
                        }
                        i3++;
                    } else {
                        if (i5 != 0) {
                            i7 = m5814h;
                        } else if (m5814h == 100) {
                            i7 = C0868i.f2758E0;
                        } else if (m5814h != 101) {
                            i7 = C0868i.f2763F0;
                        }
                        i8 = i7;
                        i5 = m5814h;
                    }
                    arrayList.add(C11178c.f28725a[i8]);
                    i4 += i8 * i6;
                    if (i3 != 0) {
                        i6++;
                    }
                } else {
                    int i9 = i4 % C0868i.f2753D0;
                    int[][] iArr = C11178c.f28725a;
                    arrayList.add(iArr[i9]);
                    arrayList.add(iArr[106]);
                    int i10 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i11 : iArr2) {
                            i10 += i11;
                        }
                    }
                    boolean[] zArr = new boolean[i10];
                    for (int[] iArr3 : arrayList) {
                        i += AbstractC11195s.m5782b(zArr, i, iArr3, true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
