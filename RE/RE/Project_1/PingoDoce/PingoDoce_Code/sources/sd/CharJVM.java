package sd;

import java.util.Locale;
import p181jd.Intrinsics;
import p297pd.C8611f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.b */
/* loaded from: classes2.dex */
public class CharJVM {
    /* renamed from: a */
    public static int m9044a(int i) {
        if (new C8611f(2, 36).m15028q(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C8611f(2, 36));
    }

    /* renamed from: b */
    public static final int m9043b(char c, int i) {
        return Character.digit((int) c, i);
    }

    /* renamed from: c */
    public static final boolean m9042c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: d */
    public static String m9041d(char c, Locale locale) {
        Intrinsics.isThisObjectNull(locale, "locale");
        String m9040e = m9040e(c, locale);
        if (m9040e.length() <= 1) {
            String valueOf = String.valueOf(c);
            Intrinsics.m20929f(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkIfNull(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !Intrinsics.equals(m9040e, upperCase) ? m9040e : String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return m9040e;
        } else {
            char charAt = m9040e.charAt(0);
            Intrinsics.m20929f(m9040e, "null cannot be cast to non-null type java.lang.String");
            String substring = m9040e.substring(1);
            Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
            Intrinsics.m20929f(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    /* renamed from: e */
    public static final String m9040e(char c, Locale locale) {
        Intrinsics.isThisObjectNull(locale, "locale");
        String valueOf = String.valueOf(c);
        Intrinsics.m20929f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkIfNull(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
