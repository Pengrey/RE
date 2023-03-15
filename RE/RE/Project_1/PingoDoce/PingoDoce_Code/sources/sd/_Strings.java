package sd;

import java.util.NoSuchElementException;
import p181jd.Intrinsics;
import p297pd._Ranges;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.w */
/* loaded from: classes2.dex */
public class _Strings extends C10175v {
    /* renamed from: L0 */
    public static String m8870L0(String str, int i) {
        int m15000i;
        Intrinsics.isThisObjectNull(str, "<this>");
        if (i >= 0) {
            m15000i = _Ranges.m15000i(i, str.length());
            String substring = str.substring(m15000i);
            Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: M0 */
    public static String m8869M0(String str, int i) {
        int m15005d;
        String m8865Q0;
        Intrinsics.isThisObjectNull(str, "<this>");
        if (i >= 0) {
            m15005d = _Ranges.m15005d(str.length() - i, 0);
            m8865Q0 = m8865Q0(str, m15005d);
            return m8865Q0;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: N0 */
    public static char m8868N0(CharSequence charSequence) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: O0 */
    public static char m8867O0(CharSequence charSequence) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(C10171u.m8911O(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: P0 */
    public static CharSequence m8866P0(CharSequence charSequence) {
        Intrinsics.isThisObjectNull(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkIfNull(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    /* renamed from: Q0 */
    public static String m8865Q0(String str, int i) {
        int m15000i;
        Intrinsics.isThisObjectNull(str, "<this>");
        if (i >= 0) {
            m15000i = _Ranges.m15000i(i, str.length());
            String substring = str.substring(0, m15000i);
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
