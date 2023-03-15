package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.C2775g3;
import com.google.android.gms.internal.measurement.C2887n3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.q9 */
/* loaded from: classes.dex */
public abstract class AbstractC3313q9 {

    /* renamed from: a */
    final String f8821a;

    /* renamed from: b */
    final int f8822b;

    /* renamed from: c */
    Boolean f8823c;

    /* renamed from: d */
    Boolean f8824d;

    /* renamed from: e */
    Long f8825e;

    /* renamed from: f */
    Long f8826f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3313q9(String str, int i) {
        this.f8821a = str;
        this.f8822b = i;
    }

    /* renamed from: d */
    private static Boolean m31037d(String str, int i, boolean z, String str2, List list, String str3, C3197g3 c3197g3) {
        if (i == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c3197g3 != null) {
                        c3197g3.m31327w().m31397b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m31036e(BigDecimal bigDecimal, C2775g3 c2775g3, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C2597i.m33076j(c2775g3);
        if (c2775g3.m32635G()) {
            if (c2775g3.m32630L() != 1) {
                if (c2775g3.m32630L() == 5) {
                    if (!c2775g3.m32631K() || !c2775g3.m32632J()) {
                        return null;
                    }
                } else if (!c2775g3.m32634H()) {
                    return null;
                }
                int m32630L = c2775g3.m32630L();
                if (c2775g3.m32630L() == 5) {
                    if (C3159c9.m31425N(c2775g3.m32637E()) && C3159c9.m31425N(c2775g3.m32638D())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c2775g3.m32637E());
                            bigDecimal4 = new BigDecimal(c2775g3.m32638D());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C3159c9.m31425N(c2775g3.m32639C())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(c2775g3.m32639C());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (m32630L == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = m32630L - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                } else if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                } else if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                            r2 = false;
                        }
                        return Boolean.valueOf(r2);
                    }
                    return null;
                } else if (bigDecimal2 == null) {
                    return null;
                } else {
                    if (d == 0.0d) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                    }
                    if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                        r2 = false;
                    }
                    return Boolean.valueOf(r2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Boolean m31035f(String str, C2887n3 c2887n3, C3197g3 c3197g3) {
        String m32454D;
        List list;
        C2597i.m33076j(c2887n3);
        if (str == null || !c2887n3.m32449I() || c2887n3.m32448J() == 1) {
            return null;
        }
        if (c2887n3.m32448J() == 7) {
            if (c2887n3.m32457A() == 0) {
                return null;
            }
        } else if (!c2887n3.m32450H()) {
            return null;
        }
        int m32448J = c2887n3.m32448J();
        boolean m32452F = c2887n3.m32452F();
        if (!m32452F && m32448J != 2 && m32448J != 7) {
            m32454D = c2887n3.m32454D().toUpperCase(Locale.ENGLISH);
        } else {
            m32454D = c2887n3.m32454D();
        }
        String str2 = m32454D;
        if (c2887n3.m32457A() == 0) {
            list = null;
        } else {
            List<String> m32453E = c2887n3.m32453E();
            if (!m32452F) {
                ArrayList arrayList = new ArrayList(m32453E.size());
                for (String str3 : m32453E) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                m32453E = Collections.unmodifiableList(arrayList);
            }
            list = m32453E;
        }
        return m31037d(str, m32448J, m32452F, str2, list, m32448J == 2 ? str2 : null, c3197g3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Boolean m31034g(double d, C2775g3 c2775g3) {
        try {
            return m31036e(new BigDecimal(d), c2775g3, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Boolean m31033h(long j, C2775g3 c2775g3) {
        try {
            return m31036e(new BigDecimal(j), c2775g3, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Boolean m31032i(String str, C2775g3 c2775g3) {
        if (C3159c9.m31425N(str)) {
            try {
                return m31036e(new BigDecimal(str), c2775g3, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Boolean m31031j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo31023a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo31022b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo31021c();
}
