package p107ff;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p181jd.Intrinsics;

/* renamed from: ff.h */
/* loaded from: classes2.dex */
public final class Challenge {

    /* renamed from: a */
    private final String f15466a;

    /* renamed from: b */
    private final Map f15467b;

    public Challenge(String str, Map map) {
        String lowerCase;
        Intrinsics.isThisObjectNull(str, "scheme");
        Intrinsics.isThisObjectNull(map, "authParams");
        this.f15466a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 == null) {
                lowerCase = null;
            } else {
                Locale locale = Locale.US;
                Intrinsics.checkIfNull(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkIfNull(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f15467b = unmodifiableMap;
    }

    /* renamed from: a */
    public final Charset m24131a() {
        String str = (String) this.f15467b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkIfNull(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        Intrinsics.checkIfNull(charset, "ISO_8859_1");
        return charset;
    }

    /* renamed from: b */
    public final String m24130b() {
        return (String) this.f15467b.get("realm");
    }

    /* renamed from: c */
    public final String m24129c() {
        return this.f15466a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (Intrinsics.equals(challenge.f15466a, this.f15466a) && Intrinsics.equals(challenge.f15467b, this.f15467b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f15466a.hashCode()) * 31) + this.f15467b.hashCode();
    }

    public String toString() {
        return this.f15466a + " authParams=" + this.f15467b;
    }
}
