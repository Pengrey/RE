package p107ff;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p064dd.C4785c;
import p181jd.Intrinsics;
import sd.StringsJVM;

/* renamed from: ff.x */
/* loaded from: classes2.dex */
public final class MediaType {

    /* renamed from: d */
    public static final C5505a f15564d = new C5505a(null);

    /* renamed from: e */
    private static final Pattern f15565e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    private static final Pattern f15566f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f15567a;

    /* renamed from: b */
    private final String f15568b;

    /* renamed from: c */
    private final String[] f15569c;

    /* compiled from: MediaType.kt */
    /* renamed from: ff.x$a */
    /* loaded from: classes2.dex */
    public static final class C5505a {
        private C5505a() {
        }

        public /* synthetic */ C5505a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MediaType m23909a(String str) {
            boolean m8948C;
            boolean m8944p;
            Intrinsics.isThisObjectNull(str, "<this>");
            Matcher matcher = MediaType.m23915b().matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                Intrinsics.checkIfNull(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                Intrinsics.checkIfNull(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                Intrinsics.checkIfNull(group2, "typeSubtype.group(2)");
                Intrinsics.checkIfNull(locale, "US");
                String lowerCase2 = group2.toLowerCase(locale);
                Intrinsics.checkIfNull(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.m23916a().matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else {
                                m8948C = StringsJVM.m8948C(group4, "'", false, 2, null);
                                if (m8948C) {
                                    m8944p = StringsJVM.m8944p(group4, "'", false, 2, null);
                                    if (m8944p && group4.length() > 2) {
                                        group4 = group4.substring(1, group4.length() - 1);
                                        Intrinsics.checkIfNull(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                }
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        /* renamed from: b */
        public final MediaType m23908b(String str) {
            Intrinsics.isThisObjectNull(str, "<this>");
            try {
                return m23909a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.f15567a = str;
        this.f15568b = str2;
        this.f15569c = strArr;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    /* renamed from: a */
    public static final /* synthetic */ Pattern m23916a() {
        return f15566f;
    }

    /* renamed from: b */
    public static final /* synthetic */ Pattern m23915b() {
        return f15565e;
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m23913d(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.m23914c(charset);
    }

    /* renamed from: e */
    public static final MediaType m23912e(String str) {
        return f15564d.m23909a(str);
    }

    /* renamed from: c */
    public final Charset m23914c(Charset charset) {
        String m23911f = m23911f("charset");
        if (m23911f == null) {
            return charset;
        }
        try {
            return Charset.forName(m23911f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.equals(((MediaType) obj).f15567a, this.f15567a);
    }

    /* renamed from: f */
    public final String m23911f(String str) {
        boolean m8943q;
        Intrinsics.isThisObjectNull(str, "name");
        int i = 0;
        int m26610b = C4785c.m26610b(0, this.f15569c.length - 1, 2);
        if (m26610b < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 2;
            m8943q = StringsJVM.m8943q(this.f15569c[i], str, true);
            if (m8943q) {
                return this.f15569c[i + 1];
            }
            if (i == m26610b) {
                return null;
            }
            i = i2;
        }
    }

    /* renamed from: g */
    public final String m23910g() {
        return this.f15568b;
    }

    public int hashCode() {
        return this.f15567a.hashCode();
    }

    public String toString() {
        return this.f15567a;
    }
}
