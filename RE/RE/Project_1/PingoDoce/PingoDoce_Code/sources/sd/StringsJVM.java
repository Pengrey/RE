package sd;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Collection;
import java.util.Iterator;
import p181jd.Intrinsics;
import p297pd.C8611f;
import p297pd._Ranges;
import p489zc.AbstractC13762g0;
import p489zc.AbstractList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.t */
/* loaded from: classes2.dex */
public class StringsJVM extends StringNumberConversions {
    /* renamed from: A */
    public static boolean m8950A(String str, String str2, boolean z) {
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m8941s(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m8949B(String str, String str2, int i, boolean z, int i2, Object obj) {
        boolean m8934z;
        if ((i2 & 4) != 0) {
            z = false;
        }
        m8934z = m8934z(str, str2, i, z);
        return m8934z;
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m8948C(String str, String str2, boolean z, int i, Object obj) {
        boolean m8950A;
        if ((i & 2) != 0) {
            z = false;
        }
        m8950A = m8950A(str, str2, z);
        return m8950A;
    }

    /* renamed from: m */
    public static String m8947m(char[] cArr) {
        Intrinsics.isThisObjectNull(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: n */
    public static String m8946n(char[] cArr, int i, int i2) {
        Intrinsics.isThisObjectNull(cArr, "<this>");
        AbstractList.f34868w.m448a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    /* renamed from: o */
    public static boolean m8945o(String str, String str2, boolean z) {
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m8941s(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m8944p(String str, String str2, boolean z, int i, Object obj) {
        boolean m8945o;
        if ((i & 2) != 0) {
            z = false;
        }
        m8945o = m8945o(str, str2, z);
        return m8945o;
    }

    /* renamed from: q */
    public static boolean m8943q(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: r */
    public static boolean m8942r(CharSequence charSequence) {
        boolean z;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        if (charSequence.length() != 0) {
            C8611f m8912N = C10171u.m8912N(charSequence);
            if (!(m8912N instanceof Collection) || !((Collection) m8912N).isEmpty()) {
                Iterator<Integer> it = m8912N.iterator();
                while (it.hasNext()) {
                    if (!CharJVM.m9042c(charSequence.charAt(((AbstractC13762g0) it).mo404a()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public static final boolean m8941s(String str, int i, String str2, int i2, int i3, boolean z) {
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m8940t(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return m8941s(str, i, str2, i2, i3, z);
    }

    /* renamed from: u */
    public static String m8939u(CharSequence charSequence, int i) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i != 0) {
            if (i != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb2 = new StringBuilder(charSequence.length() * i);
                        AbstractC13762g0 mo15031o = new C8611f(1, i).mo15031o();
                        while (mo15031o.hasNext()) {
                            mo15031o.mo404a();
                            sb2.append(charSequence);
                        }
                        String sb3 = sb2.toString();
                        Intrinsics.checkIfNull(sb3, "{\n                    va…tring()\n                }");
                        return sb3;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        cArr[i2] = charAt;
                    }
                    return new String(cArr);
                }
                return BuildConfig.VERSION_NAME;
            }
            return charSequence.toString();
        } else {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* renamed from: v */
    public static final String m8938v(String str, char c, char c2, boolean z) {
        Intrinsics.isThisObjectNull(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            Intrinsics.checkIfNull(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C10149c.m9039f(charAt, c, z)) {
                charAt = c2;
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    /* renamed from: w */
    public static final String m8937w(String str, String str2, String str3, boolean z) {
        int m15005d;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "oldValue");
        Intrinsics.isThisObjectNull(str3, "newValue");
        int i = 0;
        int m8909Q = C10171u.m8909Q(str, str2, 0, z);
        if (m8909Q < 0) {
            return str;
        }
        int length = str2.length();
        m15005d = _Ranges.m15005d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i, m8909Q);
                sb2.append(str3);
                i = m8909Q + length;
                if (m8909Q >= str.length()) {
                    break;
                }
                m8909Q = C10171u.m8909Q(str, str2, m8909Q + m15005d, z);
            } while (m8909Q > 0);
            sb2.append((CharSequence) str, i, str.length());
            String sb3 = sb2.toString();
            Intrinsics.checkIfNull(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: x */
    public static /* synthetic */ String m8936x(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m8938v(str, c, c2, z);
    }

    /* renamed from: y */
    public static /* synthetic */ String m8935y(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m8937w(str, str2, str3, z);
    }

    /* renamed from: z */
    public static boolean m8934z(String str, String str2, int i, boolean z) {
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m8941s(str, i, str2, 0, str2.length(), z);
    }
}
