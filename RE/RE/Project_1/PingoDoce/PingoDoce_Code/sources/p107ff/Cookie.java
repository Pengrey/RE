package p107ff;

import gf.Util;
import gf.hostnames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p181jd.Intrinsics;
import p222lf.dates;
import p489zc.C13780s;
import sd.C10156i;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: ff.m */
/* loaded from: classes2.dex */
public final class Cookie {

    /* renamed from: j */
    public static final C5485a f15501j = new C5485a(null);

    /* renamed from: k */
    private static final Pattern f15502k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l */
    private static final Pattern f15503l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m */
    private static final Pattern f15504m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    private static final Pattern f15505n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f15506a;

    /* renamed from: b */
    private final String f15507b;

    /* renamed from: c */
    private final long f15508c;

    /* renamed from: d */
    private final String f15509d;

    /* renamed from: e */
    private final String f15510e;

    /* renamed from: f */
    private final boolean f15511f;

    /* renamed from: g */
    private final boolean f15512g;

    /* renamed from: h */
    private final boolean f15513h;

    /* renamed from: i */
    private final boolean f15514i;

    /* compiled from: Cookie.kt */
    /* renamed from: ff.m$a */
    /* loaded from: classes2.dex */
    public static final class C5485a {
        private C5485a() {
        }

        public /* synthetic */ C5485a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
            if (r1 != ':') goto L7;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final int m24084a(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L0:
                if (r7 >= r8) goto L49
                int r0 = r7 + 1
                char r1 = r6.charAt(r7)
                r2 = 32
                r3 = 1
                r4 = 0
                if (r1 >= r2) goto L12
                r2 = 9
                if (r1 != r2) goto L41
            L12:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L41
                r2 = 57
                if (r1 > r2) goto L20
                r2 = 48
                if (r2 > r1) goto L20
                r2 = r3
                goto L21
            L20:
                r2 = r4
            L21:
                if (r2 != 0) goto L41
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L2d
                r2 = 97
                if (r2 > r1) goto L2d
                r2 = r3
                goto L2e
            L2d:
                r2 = r4
            L2e:
                if (r2 != 0) goto L41
                r2 = 90
                if (r1 > r2) goto L3a
                r2 = 65
                if (r2 > r1) goto L3a
                r2 = r3
                goto L3b
            L3a:
                r2 = r4
            L3b:
                if (r2 != 0) goto L41
                r2 = 58
                if (r1 != r2) goto L42
            L41:
                r4 = r3
            L42:
                r1 = r9 ^ 1
                if (r4 != r1) goto L47
                return r7
            L47:
                r7 = r0
                goto L0
            L49:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.Cookie.C5485a.m24084a(java.lang.String, int, int, boolean):int");
        }

        /* renamed from: b */
        private final boolean m24083b(String str, String str2) {
            boolean m8944p;
            if (Intrinsics.equals(str, str2)) {
                return true;
            }
            m8944p = StringsJVM.m8944p(str, str2, false, 2, null);
            return m8944p && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.m23408i(str);
        }

        /* renamed from: f */
        private final String m24079f(String str) {
            boolean m8944p;
            String m8891i0;
            m8944p = StringsJVM.m8944p(str, ".", false, 2, null);
            if (!m8944p) {
                m8891i0 = C10171u.m8891i0(str, ".");
                String m23444e = hostnames.m23444e(m8891i0);
                if (m23444e != null) {
                    return m23444e;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: g */
        private final long m24078g(String str, int i, int i2) {
            int m8905U;
            int m24084a = m24084a(str, i, i2, false);
            Matcher matcher = Cookie.m24096c().matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (m24084a < i2) {
                int m24084a2 = m24084a(str, m24084a + 1, i2, true);
                matcher.region(m24084a, m24084a2);
                if (i4 == -1 && matcher.usePattern(Cookie.m24096c()).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.checkIfNull(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.checkIfNull(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.checkIfNull(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(Cookie.m24098a()).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.checkIfNull(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(Cookie.m24097b()).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.checkIfNull(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    Intrinsics.checkIfNull(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.m24097b().pattern();
                    Intrinsics.checkIfNull(pattern, "MONTH_PATTERN.pattern()");
                    m8905U = C10171u.m8905U(pattern, lowerCase, 0, false, 6, null);
                    i6 = m8905U / 4;
                } else if (i3 == -1 && matcher.usePattern(Cookie.m24095d()).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkIfNull(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                m24084a = m24084a(str, m24084a2 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                if (i6 != -1) {
                    if (1 <= i5 && i5 < 32) {
                        if (i4 >= 0 && i4 < 24) {
                            if (i7 >= 0 && i7 < 60) {
                                if (i8 >= 0 && i8 < 60) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f15903e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: h */
        private final long m24077h(String str) {
            boolean m8948C;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new C10156i("-?\\d+").m9021d(str)) {
                    m8948C = StringsJVM.m8948C(str, "-", false, 2, null);
                    return m8948C ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* renamed from: c */
        public final Cookie m24082c(HttpUrl httpUrl, String str) {
            Intrinsics.isThisObjectNull(httpUrl, "url");
            Intrinsics.isThisObjectNull(str, "setCookie");
            return m24081d(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
            if (r1 > 253402300799999L) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p107ff.Cookie m24081d(long r26, p107ff.HttpUrl r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.Cookie.C5485a.m24081d(long, ff.v, java.lang.String):ff.m");
        }

        /* renamed from: e */
        public final List m24080e(HttpUrl httpUrl, Headers headers) {
            List m197g;
            Intrinsics.isThisObjectNull(httpUrl, "url");
            Intrinsics.isThisObjectNull(headers, "headers");
            List m24008q = headers.m24008q("Set-Cookie");
            int size = m24008q.size();
            ArrayList arrayList = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Cookie m24082c = m24082c(httpUrl, (String) m24008q.get(i));
                if (m24082c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m24082c);
                }
                i = i2;
            }
            if (arrayList != null) {
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkIfNull(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
                return unmodifiableList;
            }
            m197g = C13780s.m197g();
            return m197g;
        }
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f15506a = str;
        this.f15507b = str2;
        this.f15508c = j;
        this.f15509d = str3;
        this.f15510e = str4;
        this.f15511f = z;
        this.f15512g = z2;
        this.f15513h = z3;
        this.f15514i = z4;
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    /* renamed from: a */
    public static final /* synthetic */ Pattern m24098a() {
        return f15504m;
    }

    /* renamed from: b */
    public static final /* synthetic */ Pattern m24097b() {
        return f15503l;
    }

    /* renamed from: c */
    public static final /* synthetic */ Pattern m24096c() {
        return f15505n;
    }

    /* renamed from: d */
    public static final /* synthetic */ Pattern m24095d() {
        return f15502k;
    }

    /* renamed from: e */
    public final String m24094e() {
        return this.f15509d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (Intrinsics.equals(cookie.f15506a, this.f15506a) && Intrinsics.equals(cookie.f15507b, this.f15507b) && cookie.f15508c == this.f15508c && Intrinsics.equals(cookie.f15509d, this.f15509d) && Intrinsics.equals(cookie.f15510e, this.f15510e) && cookie.f15511f == this.f15511f && cookie.f15512g == this.f15512g && cookie.f15513h == this.f15513h && cookie.f15514i == this.f15514i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final long m24093f() {
        return this.f15508c;
    }

    /* renamed from: g */
    public final boolean m24092g() {
        return this.f15514i;
    }

    /* renamed from: h */
    public final boolean m24091h() {
        return this.f15512g;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f15506a.hashCode()) * 31) + this.f15507b.hashCode()) * 31) + Long.hashCode(this.f15508c)) * 31) + this.f15509d.hashCode()) * 31) + this.f15510e.hashCode()) * 31) + Boolean.hashCode(this.f15511f)) * 31) + Boolean.hashCode(this.f15512g)) * 31) + Boolean.hashCode(this.f15513h)) * 31) + Boolean.hashCode(this.f15514i);
    }

    /* renamed from: i */
    public final String m24090i() {
        return this.f15506a;
    }

    /* renamed from: j */
    public final String m24089j() {
        return this.f15510e;
    }

    /* renamed from: k */
    public final boolean m24088k() {
        return this.f15513h;
    }

    /* renamed from: l */
    public final boolean m24087l() {
        return this.f15511f;
    }

    /* renamed from: m */
    public final String m24086m(boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m24090i());
        sb2.append('=');
        sb2.append(m24085n());
        if (m24088k()) {
            if (m24093f() == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(dates.m19473b(new Date(m24093f())));
            }
        }
        if (!m24092g()) {
            sb2.append("; domain=");
            if (z) {
                sb2.append(".");
            }
            sb2.append(m24094e());
        }
        sb2.append("; path=");
        sb2.append(m24089j());
        if (m24087l()) {
            sb2.append("; secure");
        }
        if (m24091h()) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "toString()");
        return sb3;
    }

    /* renamed from: n */
    public final String m24085n() {
        return this.f15507b;
    }

    public String toString() {
        return m24086m(false);
    }
}
