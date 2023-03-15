package sd;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p297pd.C8608d;
import p297pd.C8611f;
import p297pd._Ranges;
import p337rd.InterfaceC9870e;
import p337rd._Sequences;
import p468yc.C13182l;
import p468yc.C13191r;
import p489zc.AbstractC13762g0;
import p489zc.C13777q;
import p489zc.CollectionsJVM;
import p489zc.Iterables;
import p489zc._Arrays;
import p489zc._ArraysJvm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
/* renamed from: sd.u */
/* loaded from: classes2.dex */
public class C10171u extends StringsJVM {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Strings.kt */
    /* renamed from: sd.u$a */
    /* loaded from: classes2.dex */
    public static final class C10172a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ char[] f26500w;

        /* renamed from: x */
        final /* synthetic */ boolean f26501x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10172a(char[] cArr, boolean z) {
            super(2);
            this.f26500w = cArr;
            this.f26501x = z;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m8873a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final C13182l m8873a(CharSequence charSequence, int i) {
            Intrinsics.isThisObjectNull(charSequence, "$this$$receiver");
            int m8904V = C10171u.m8904V(charSequence, this.f26500w, i, this.f26501x);
            if (m8904V < 0) {
                return null;
            }
            return C13191r.m1447a(Integer.valueOf(m8904V), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Strings.kt */
    /* renamed from: sd.u$b */
    /* loaded from: classes2.dex */
    public static final class C10173b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ List f26502w;

        /* renamed from: x */
        final /* synthetic */ boolean f26503x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10173b(List list, boolean z) {
            super(2);
            this.f26502w = list;
            this.f26503x = z;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m8872a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final C13182l m8872a(CharSequence charSequence, int i) {
            Intrinsics.isThisObjectNull(charSequence, "$this$$receiver");
            C13182l m8930D = C10171u.m8930D(charSequence, this.f26502w, i, this.f26503x, false);
            if (m8930D != null) {
                return C13191r.m1447a(m8930D.m1460c(), Integer.valueOf(((String) m8930D.m1459d()).length()));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Strings.kt */
    /* renamed from: sd.u$c */
    /* loaded from: classes2.dex */
    public static final class C10174c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ CharSequence f26504w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10174c(CharSequence charSequence) {
            super(1);
            this.f26504w = charSequence;
        }

        /* renamed from: a */
        public final String mo9587d(C8611f c8611f) {
            Intrinsics.isThisObjectNull(c8611f, "it");
            return C10171u.m8876x0(this.f26504w, c8611f);
        }
    }

    /* renamed from: A0 */
    public static /* synthetic */ String m8933A0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m8875y0(str, c, str2);
    }

    /* renamed from: B0 */
    public static /* synthetic */ String m8932B0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m8874z0(str, str2, str3);
    }

    /* renamed from: C0 */
    public static String m8931C0(String str, char c, String str2) {
        int m8901Y;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "missingDelimiterValue");
        m8901Y = m8901Y(str, c, 0, false, 6, null);
        if (m8901Y == -1) {
            return str2;
        }
        String substring = str.substring(m8901Y + 1, str.length());
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: D */
    public static final /* synthetic */ C13182l m8930D(CharSequence charSequence, Collection collection, int i, boolean z, boolean z2) {
        return m8913M(charSequence, collection, i, z, z2);
    }

    /* renamed from: D0 */
    public static /* synthetic */ String m8929D0(String str, char c, String str2, int i, Object obj) {
        String m8931C0;
        if ((i & 2) != 0) {
            str2 = str;
        }
        m8931C0 = m8931C0(str, c, str2);
        return m8931C0;
    }

    /* renamed from: E */
    public static final boolean m8928E(CharSequence charSequence, char c, boolean z) {
        int m8906T;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        m8906T = m8906T(charSequence, c, 0, z, 2, null);
        return m8906T >= 0;
    }

    /* renamed from: E0 */
    public static final String m8927E0(String str, char c, String str2) {
        int m8906T;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "missingDelimiterValue");
        m8906T = m8906T(str, c, 0, false, 6, null);
        if (m8906T == -1) {
            return str2;
        }
        String substring = str.substring(0, m8906T);
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: F */
    public static boolean m8926F(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int m8905U;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(charSequence2, "other");
        if (charSequence2 instanceof String) {
            m8905U = m8905U(charSequence, (String) charSequence2, 0, z, 2, null);
            if (m8905U >= 0) {
                return true;
            }
        } else if (m8907S(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F0 */
    public static final String m8925F0(String str, String str2, String str3) {
        int m8905U;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "delimiter");
        Intrinsics.isThisObjectNull(str3, "missingDelimiterValue");
        m8905U = m8905U(str, str2, 0, false, 6, null);
        if (m8905U == -1) {
            return str3;
        }
        String substring = str.substring(0, m8905U);
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m8924G(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m8928E(charSequence, c, z);
    }

    /* renamed from: G0 */
    public static /* synthetic */ String m8923G0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m8927E0(str, c, str2);
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m8922H(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean m8926F;
        if ((i & 2) != 0) {
            z = false;
        }
        m8926F = m8926F(charSequence, charSequence2, z);
        return m8926F;
    }

    /* renamed from: H0 */
    public static /* synthetic */ String m8921H0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m8925F0(str, str2, str3);
    }

    /* renamed from: I */
    public static final boolean m8920I(CharSequence charSequence, char c, boolean z) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        return charSequence.length() > 0 && C10149c.m9039f(charSequence.charAt(m8911O(charSequence)), c, z);
    }

    /* renamed from: I0 */
    public static final String m8919I0(String str, char c, String str2) {
        int m8901Y;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "missingDelimiterValue");
        m8901Y = m8901Y(str, c, 0, false, 6, null);
        if (m8901Y == -1) {
            return str2;
        }
        String substring = str.substring(0, m8901Y);
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: J */
    public static final boolean m8918J(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean m8944p;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            m8944p = StringsJVM.m8944p((String) charSequence, (String) charSequence2, false, 2, null);
            return m8944p;
        }
        return m8892h0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: J0 */
    public static /* synthetic */ String m8917J0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m8919I0(str, c, str2);
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m8916K(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m8920I(charSequence, c, z);
    }

    /* renamed from: K0 */
    public static CharSequence m8915K0(CharSequence charSequence) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean m9042c = CharJVM.m9042c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!m9042c) {
                    break;
                }
                length--;
            } else if (m9042c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m8914L(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m8918J(charSequence, charSequence2, z);
    }

    /* renamed from: M */
    private static final C13182l m8913M(CharSequence charSequence, Collection collection, int i, boolean z, boolean z2) {
        int m15000i;
        C8608d m14994o;
        Object obj;
        Object obj2;
        int m15005d;
        if (!z && collection.size() == 1) {
            String str = (String) C13777q.m239e0(collection);
            int m8905U = !z2 ? m8905U(charSequence, str, i, false, 4, null) : m8900Z(charSequence, str, i, false, 4, null);
            if (m8905U < 0) {
                return null;
            }
            return C13191r.m1447a(Integer.valueOf(m8905U), str);
        }
        if (z2) {
            m15000i = _Ranges.m15000i(i, m8911O(charSequence));
            m14994o = _Ranges.m14994o(m15000i, 0);
        } else {
            m15005d = _Ranges.m15005d(i, 0);
            m14994o = new C8611f(m15005d, charSequence.length());
        }
        if (charSequence instanceof String) {
            int m15034f = m14994o.m15034f();
            int m15033h = m14994o.m15033h();
            int m15032l = m14994o.m15032l();
            if ((m15032l > 0 && m15034f <= m15033h) || (m15032l < 0 && m15033h <= m15034f)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (StringsJVM.m8941s(str2, 0, (String) charSequence, m15034f, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (m15034f == m15033h) {
                            break;
                        }
                        m15034f += m15032l;
                    } else {
                        return C13191r.m1447a(Integer.valueOf(m15034f), str3);
                    }
                }
            }
        } else {
            int m15034f2 = m14994o.m15034f();
            int m15033h2 = m14994o.m15033h();
            int m15032l2 = m14994o.m15032l();
            if ((m15032l2 > 0 && m15034f2 <= m15033h2) || (m15032l2 < 0 && m15033h2 <= m15034f2)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (m8892h0(str4, 0, charSequence, m15034f2, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (m15034f2 == m15033h2) {
                            break;
                        }
                        m15034f2 += m15032l2;
                    } else {
                        return C13191r.m1447a(Integer.valueOf(m15034f2), str5);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: N */
    public static final C8611f m8912N(CharSequence charSequence) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        return new C8611f(0, charSequence.length() - 1);
    }

    /* renamed from: O */
    public static final int m8911O(CharSequence charSequence) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: P */
    public static final int m8910P(CharSequence charSequence, char c, int i, boolean z) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m8904V(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: Q */
    public static final int m8909Q(CharSequence charSequence, String str, int i, boolean z) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m8907S(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: R */
    private static final int m8908R(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int m15000i;
        int m15005d;
        C8608d m14994o;
        int m15005d2;
        int m15000i2;
        if (!z2) {
            m15005d2 = _Ranges.m15005d(i, 0);
            m15000i2 = _Ranges.m15000i(i2, charSequence.length());
            m14994o = new C8611f(m15005d2, m15000i2);
        } else {
            m15000i = _Ranges.m15000i(i, m8911O(charSequence));
            m15005d = _Ranges.m15005d(i2, 0);
            m14994o = _Ranges.m14994o(m15000i, m15005d);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m15034f = m14994o.m15034f();
            int m15033h = m14994o.m15033h();
            int m15032l = m14994o.m15032l();
            if ((m15032l <= 0 || m15034f > m15033h) && (m15032l >= 0 || m15033h > m15034f)) {
                return -1;
            }
            while (!StringsJVM.m8941s((String) charSequence2, 0, (String) charSequence, m15034f, charSequence2.length(), z)) {
                if (m15034f == m15033h) {
                    return -1;
                }
                m15034f += m15032l;
            }
            return m15034f;
        }
        int m15034f2 = m14994o.m15034f();
        int m15033h2 = m14994o.m15033h();
        int m15032l2 = m14994o.m15032l();
        if ((m15032l2 <= 0 || m15034f2 > m15033h2) && (m15032l2 >= 0 || m15033h2 > m15034f2)) {
            return -1;
        }
        while (!m8892h0(charSequence2, 0, charSequence, m15034f2, charSequence2.length(), z)) {
            if (m15034f2 == m15033h2) {
                return -1;
            }
            m15034f2 += m15032l2;
        }
        return m15034f2;
    }

    /* renamed from: S */
    static /* synthetic */ int m8907S(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m8908R(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: T */
    public static /* synthetic */ int m8906T(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m8910P(charSequence, c, i, z);
    }

    /* renamed from: U */
    public static /* synthetic */ int m8905U(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m8909Q(charSequence, str, i, z);
    }

    /* renamed from: V */
    public static final int m8904V(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int m15005d;
        boolean z2;
        char m283K;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            m283K = _Arrays.m283K(cArr);
            return ((String) charSequence).indexOf(m283K, i);
        }
        m15005d = _Ranges.m15005d(i, 0);
        AbstractC13762g0 mo15031o = new C8611f(m15005d, m8911O(charSequence)).mo15031o();
        while (mo15031o.hasNext()) {
            int mo404a = mo15031o.mo404a();
            char charAt = charSequence.charAt(mo404a);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    continue;
                    break;
                } else if (C10149c.m9039f(cArr[i2], charAt, z)) {
                    z2 = true;
                    continue;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return mo404a;
            }
        }
        return -1;
    }

    /* renamed from: W */
    public static final int m8903W(CharSequence charSequence, char c, int i, boolean z) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m8899a0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: X */
    public static final int m8902X(CharSequence charSequence, String str, int i, boolean z) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return m8908R(charSequence, str, i, 0, z, true);
    }

    /* renamed from: Y */
    public static /* synthetic */ int m8901Y(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m8911O(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m8903W(charSequence, c, i, z);
    }

    /* renamed from: Z */
    public static /* synthetic */ int m8900Z(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m8911O(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m8902X(charSequence, str, i, z);
    }

    /* renamed from: a0 */
    public static final int m8899a0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int m15000i;
        char m283K;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            m283K = _Arrays.m283K(cArr);
            return ((String) charSequence).lastIndexOf(m283K, i);
        }
        for (m15000i = _Ranges.m15000i(i, m8911O(charSequence)); -1 < m15000i; m15000i--) {
            char charAt = charSequence.charAt(m15000i);
            int length = cArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (C10149c.m9039f(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return m15000i;
            }
        }
        return -1;
    }

    /* renamed from: b0 */
    public static final InterfaceC9870e m8898b0(CharSequence charSequence) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        return m8881s0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    /* renamed from: c0 */
    public static final List m8897c0(CharSequence charSequence) {
        List m9751m;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        m9751m = _Sequences.m9751m(m8898b0(charSequence));
        return m9751m;
    }

    /* renamed from: d0 */
    private static final InterfaceC9870e m8896d0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m8888l0(i2);
        return new Strings(charSequence, i, i2, new C10172a(cArr, z));
    }

    /* renamed from: e0 */
    private static final InterfaceC9870e m8895e0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        List m320d;
        m8888l0(i2);
        m320d = _ArraysJvm.m320d(strArr);
        return new Strings(charSequence, i, i2, new C10173b(m320d, z));
    }

    /* renamed from: f0 */
    static /* synthetic */ InterfaceC9870e m8894f0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m8896d0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: g0 */
    static /* synthetic */ InterfaceC9870e m8893g0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m8895e0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: h0 */
    public static final boolean m8892h0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C10149c.m9039f(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i0 */
    public static String m8891i0(String str, CharSequence charSequence) {
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(charSequence, "prefix");
        if (m8877w0(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: j0 */
    public static CharSequence m8890j0(CharSequence charSequence, int i, int i2) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(charSequence.length() - (i2 - i));
            sb2.append(charSequence, 0, i);
            Intrinsics.checkIfNull(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(charSequence, i2, charSequence.length());
            Intrinsics.checkIfNull(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
    }

    /* renamed from: k0 */
    public static String m8889k0(String str, CharSequence charSequence) {
        boolean m8914L;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(charSequence, "suffix");
        m8914L = m8914L(str, charSequence, false, 2, null);
        if (m8914L) {
            String substring = str.substring(0, str.length() - charSequence.length());
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: l0 */
    public static final void m8888l0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    /* renamed from: m0 */
    public static final List m8887m0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        Iterable<C8611f> m9758f;
        int m186r;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(cArr, "delimiters");
        if (cArr.length == 1) {
            return m8885o0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        m9758f = _Sequences.m9758f(m8894f0(charSequence, cArr, 0, z, i, 2, null));
        m186r = Iterables.m186r(m9758f, 10);
        ArrayList arrayList = new ArrayList(m186r);
        for (C8611f c8611f : m9758f) {
            arrayList.add(m8876x0(charSequence, c8611f));
        }
        return arrayList;
    }

    /* renamed from: n0 */
    public static final List m8886n0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        Iterable<C8611f> m9758f;
        int m186r;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return m8885o0(charSequence, str, z, i);
            }
        }
        m9758f = _Sequences.m9758f(m8893g0(charSequence, strArr, 0, z, i, 2, null));
        m186r = Iterables.m186r(m9758f, 10);
        ArrayList arrayList = new ArrayList(m186r);
        for (C8611f c8611f : m9758f) {
            arrayList.add(m8876x0(charSequence, c8611f));
        }
        return arrayList;
    }

    /* renamed from: o0 */
    private static final List m8885o0(CharSequence charSequence, String str, boolean z, int i) {
        List m202b;
        m8888l0(i);
        int i2 = 0;
        int m8909Q = m8909Q(charSequence, str, 0, z);
        if (m8909Q != -1 && i != 1) {
            boolean z2 = i > 0;
            ArrayList arrayList = new ArrayList(z2 ? _Ranges.m15000i(i, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i2, m8909Q).toString());
                i2 = str.length() + m8909Q;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                m8909Q = m8909Q(charSequence, str, i2, z);
            } while (m8909Q != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        m202b = CollectionsJVM.m202b(charSequence.toString());
        return m202b;
    }

    /* renamed from: p0 */
    public static /* synthetic */ List m8884p0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m8887m0(charSequence, cArr, z, i);
    }

    /* renamed from: q0 */
    public static /* synthetic */ List m8883q0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m8886n0(charSequence, strArr, z, i);
    }

    /* renamed from: r0 */
    public static final InterfaceC9870e m8882r0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        InterfaceC9870e m9753k;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(strArr, "delimiters");
        m9753k = _Sequences.m9753k(m8893g0(charSequence, strArr, 0, z, i, 2, null), new C10174c(charSequence));
        return m9753k;
    }

    /* renamed from: s0 */
    public static /* synthetic */ InterfaceC9870e m8881s0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m8882r0(charSequence, strArr, z, i);
    }

    /* renamed from: t0 */
    public static final boolean m8880t0(CharSequence charSequence, char c, boolean z) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        return charSequence.length() > 0 && C10149c.m9039f(charSequence.charAt(0), c, z);
    }

    /* renamed from: u0 */
    public static final boolean m8879u0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean m8948C;
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            m8948C = StringsJVM.m8948C((String) charSequence, (String) charSequence2, false, 2, null);
            return m8948C;
        }
        return m8892h0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: v0 */
    public static /* synthetic */ boolean m8878v0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m8880t0(charSequence, c, z);
    }

    /* renamed from: w0 */
    public static /* synthetic */ boolean m8877w0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m8879u0(charSequence, charSequence2, z);
    }

    /* renamed from: x0 */
    public static final String m8876x0(CharSequence charSequence, C8611f c8611f) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        Intrinsics.isThisObjectNull(c8611f, "range");
        return charSequence.subSequence(c8611f.m15026u().intValue(), c8611f.m15027t().intValue() + 1).toString();
    }

    /* renamed from: y0 */
    public static final String m8875y0(String str, char c, String str2) {
        int m8906T;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "missingDelimiterValue");
        m8906T = m8906T(str, c, 0, false, 6, null);
        if (m8906T == -1) {
            return str2;
        }
        String substring = str.substring(m8906T + 1, str.length());
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: z0 */
    public static final String m8874z0(String str, String str2, String str3) {
        int m8905U;
        Intrinsics.isThisObjectNull(str, "<this>");
        Intrinsics.isThisObjectNull(str2, "delimiter");
        Intrinsics.isThisObjectNull(str3, "missingDelimiterValue");
        m8905U = m8905U(str, str2, 0, false, 6, null);
        if (m8905U == -1) {
            return str3;
        }
        String substring = str.substring(m8905U + str2.length(), str.length());
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
