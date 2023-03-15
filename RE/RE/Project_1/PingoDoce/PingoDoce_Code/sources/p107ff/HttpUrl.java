package p107ff;

import com.github.aachartmodel.aainfographics.BuildConfig;
import gf.Util;
import gf.hostnames;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070e.C4906j;
import p181jd.Intrinsics;
import p297pd.C8608d;
import p297pd.C8611f;
import p297pd._Ranges;
import p356sf.Buffer;
import p489zc.Iterables;
import sd.C10156i;
import sd.C10171u;
import sd.StringsJVM;
import sd._Strings;

/* renamed from: ff.v */
/* loaded from: classes2.dex */
public final class HttpUrl {

    /* renamed from: k */
    public static final C5502b f15543k = new C5502b(null);

    /* renamed from: l */
    private static final char[] f15544l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f15545a;

    /* renamed from: b */
    private final String f15546b;

    /* renamed from: c */
    private final String f15547c;

    /* renamed from: d */
    private final String f15548d;

    /* renamed from: e */
    private final int f15549e;

    /* renamed from: f */
    private final List f15550f;

    /* renamed from: g */
    private final List f15551g;

    /* renamed from: h */
    private final String f15552h;

    /* renamed from: i */
    private final String f15553i;

    /* renamed from: j */
    private final boolean f15554j;

    /* compiled from: HttpUrl.kt */
    /* renamed from: ff.v$a */
    /* loaded from: classes2.dex */
    public static final class C5500a {

        /* renamed from: i */
        public static final C5501a f15555i = new C5501a(null);

        /* renamed from: a */
        private String f15556a;

        /* renamed from: d */
        private String f15557d;

        /* renamed from: f */
        private final List f15558f;

        /* renamed from: g */
        private List f15559g;

        /* renamed from: h */
        private String f15560h;

        /* renamed from: b */
        private String f15561b = BuildConfig.VERSION_NAME;

        /* renamed from: c */
        private String f15562c = BuildConfig.VERSION_NAME;

        /* renamed from: e */
        private int f15563e = -1;

        /* compiled from: HttpUrl.kt */
        /* renamed from: ff.v$a$a */
        /* loaded from: classes2.dex */
        public static final class C5501a {
            private C5501a() {
            }

            public /* synthetic */ C5501a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public static final /* synthetic */ int m23939a(C5501a c5501a, String str, int i, int i2) {
                return c5501a.m23935e(str, i, i2);
            }

            /* renamed from: b */
            public static final /* synthetic */ int m23938b(C5501a c5501a, String str, int i, int i2) {
                return c5501a.m23934f(str, i, i2);
            }

            /* renamed from: c */
            public static final /* synthetic */ int m23937c(C5501a c5501a, String str, int i, int i2) {
                return c5501a.m23933g(str, i, i2);
            }

            /* renamed from: d */
            public static final /* synthetic */ int m23936d(C5501a c5501a, String str, int i, int i2) {
                return c5501a.m23932h(str, i, i2);
            }

            /* renamed from: e */
            private final int m23935e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(C5502b.m23930b(HttpUrl.f15543k, str, i, i2, BuildConfig.VERSION_NAME, false, false, false, false, null, 248, null));
                    boolean z = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z = true;
                    }
                    if (z) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* renamed from: f */
            private final int m23934f(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (charAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            /* renamed from: g */
            private final int m23933g(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((Intrinsics.isLessOrEqual(charAt, 97) < 0 || Intrinsics.isLessOrEqual(charAt, C4906j.f13400E0) > 0) && (Intrinsics.isLessOrEqual(charAt, 65) < 0 || Intrinsics.isLessOrEqual(charAt, 90) > 0)) {
                    return -1;
                }
                int i3 = i + 1;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    if (!(((((('a' <= charAt2 && charAt2 < '{') || ('A' <= charAt2 && charAt2 < '[')) || ('0' <= charAt2 && charAt2 < ':')) || charAt2 == '+') || charAt2 == '-') || charAt2 == '.')) {
                        if (charAt2 == ':') {
                            return i3;
                        }
                        return -1;
                    }
                    i3 = i4;
                }
                return -1;
            }

            /* renamed from: h */
            private final int m23932h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i = i4;
                }
                return i3;
            }
        }

        public C5500a() {
            ArrayList arrayList = new ArrayList();
            this.f15558f = arrayList;
            arrayList.add(BuildConfig.VERSION_NAME);
        }

        /* renamed from: d */
        private final int m23962d() {
            int i = this.f15563e;
            if (i != -1) {
                return i;
            }
            C5502b c5502b = HttpUrl.f15543k;
            String str = this.f15556a;
            Intrinsics.ifNullDoSomething(str);
            return c5502b.m23929c(str);
        }

        /* renamed from: o */
        private final boolean m23951o(String str) {
            boolean m8943q;
            if (Intrinsics.equals(str, ".")) {
                return true;
            }
            m8943q = StringsJVM.m8943q(str, "%2e", true);
            return m8943q;
        }

        /* renamed from: p */
        private final boolean m23950p(String str) {
            boolean m8943q;
            boolean m8943q2;
            boolean m8943q3;
            if (Intrinsics.equals(str, "..")) {
                return true;
            }
            m8943q = StringsJVM.m8943q(str, "%2e.", true);
            if (m8943q) {
                return true;
            }
            m8943q2 = StringsJVM.m8943q(str, ".%2e", true);
            if (m8943q2) {
                return true;
            }
            m8943q3 = StringsJVM.m8943q(str, "%2e%2e", true);
            return m8943q3;
        }

        /* renamed from: s */
        private final void m23947s() {
            List list = this.f15558f;
            if ((((String) list.remove(list.size() - 1)).length() == 0) && (!this.f15558f.isEmpty())) {
                List list2 = this.f15558f;
                list2.set(list2.size() - 1, BuildConfig.VERSION_NAME);
                return;
            }
            this.f15558f.add(BuildConfig.VERSION_NAME);
        }

        /* renamed from: u */
        private final void m23945u(String str, int i, int i2, boolean z, boolean z2) {
            String m23930b = C5502b.m23930b(HttpUrl.f15543k, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (m23951o(m23930b)) {
                return;
            }
            if (m23950p(m23930b)) {
                m23947s();
                return;
            }
            List list = this.f15558f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f15558f;
                list2.set(list2.size() - 1, m23930b);
            } else {
                this.f15558f.add(m23930b);
            }
            if (z) {
                this.f15558f.add(BuildConfig.VERSION_NAME);
            }
        }

        /* renamed from: w */
        private final void m23943w(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt != '/' && charAt != '\\') {
                List list = this.f15558f;
                list.set(list.size() - 1, BuildConfig.VERSION_NAME);
            } else {
                this.f15558f.clear();
                this.f15558f.add(BuildConfig.VERSION_NAME);
                i++;
            }
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    i = Util.m23400q(str, "/\\", i3, i2);
                    boolean z = i < i2;
                    m23945u(str, i3, i, z, true);
                    if (z) {
                        i3 = i + 1;
                    }
                }
                return;
            }
        }

        /* renamed from: A */
        public final void m23971A(List list) {
            this.f15559g = list;
        }

        /* renamed from: B */
        public final void m23970B(String str) {
            Intrinsics.isThisObjectNull(str, "<set-?>");
            this.f15561b = str;
        }

        /* renamed from: C */
        public final void m23969C(String str) {
            this.f15557d = str;
        }

        /* renamed from: D */
        public final void m23968D(int i) {
            this.f15563e = i;
        }

        /* renamed from: E */
        public final void m23967E(String str) {
            this.f15556a = str;
        }

        /* renamed from: F */
        public final C5500a m23966F(String str) {
            Intrinsics.isThisObjectNull(str, "username");
            m23970B(C5502b.m23930b(HttpUrl.f15543k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        /* renamed from: a */
        public final C5500a m23965a(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "encodedName");
            if (m23957i() == null) {
                m23971A(new ArrayList());
            }
            List m23957i = m23957i();
            Intrinsics.ifNullDoSomething(m23957i);
            C5502b c5502b = HttpUrl.f15543k;
            m23957i.add(C5502b.m23930b(c5502b, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List m23957i2 = m23957i();
            Intrinsics.ifNullDoSomething(m23957i2);
            m23957i2.add(str2 == null ? null : C5502b.m23930b(c5502b, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            return this;
        }

        /* renamed from: b */
        public final C5500a m23964b(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            if (m23957i() == null) {
                m23971A(new ArrayList());
            }
            List m23957i = m23957i();
            Intrinsics.ifNullDoSomething(m23957i);
            C5502b c5502b = HttpUrl.f15543k;
            m23957i.add(C5502b.m23930b(c5502b, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List m23957i2 = m23957i();
            Intrinsics.ifNullDoSomething(m23957i2);
            m23957i2.add(str2 == null ? null : C5502b.m23930b(c5502b, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            return this;
        }

        /* renamed from: c */
        public final HttpUrl m23963c() {
            int m186r;
            ArrayList arrayList;
            int m186r2;
            String str = this.f15556a;
            if (str != null) {
                C5502b c5502b = HttpUrl.f15543k;
                String m23925g = C5502b.m23925g(c5502b, this.f15561b, 0, 0, false, 7, null);
                String m23925g2 = C5502b.m23925g(c5502b, this.f15562c, 0, 0, false, 7, null);
                String str2 = this.f15557d;
                if (str2 != null) {
                    int m23962d = m23962d();
                    List<String> list = this.f15558f;
                    m186r = Iterables.m186r(list, 10);
                    ArrayList arrayList2 = new ArrayList(m186r);
                    for (String str3 : list) {
                        arrayList2.add(C5502b.m23925g(HttpUrl.f15543k, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f15559g;
                    if (list2 == null) {
                        arrayList = null;
                    } else {
                        m186r2 = Iterables.m186r(list2, 10);
                        arrayList = new ArrayList(m186r2);
                        for (String str4 : list2) {
                            arrayList.add(str4 == null ? null : C5502b.m23925g(HttpUrl.f15543k, str4, 0, 0, true, 3, null));
                        }
                    }
                    String str5 = this.f15560h;
                    return new HttpUrl(str, m23925g, m23925g2, str2, m23962d, arrayList2, arrayList, str5 == null ? null : C5502b.m23925g(HttpUrl.f15543k, str5, 0, 0, false, 7, null), toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: e */
        public final C5500a m23961e(String str) {
            List list = null;
            if (str != null) {
                C5502b c5502b = HttpUrl.f15543k;
                String m23930b = C5502b.m23930b(c5502b, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (m23930b != null) {
                    list = c5502b.m23923i(m23930b);
                }
            }
            m23971A(list);
            return this;
        }

        /* renamed from: f */
        public final String m23960f() {
            return this.f15560h;
        }

        /* renamed from: g */
        public final String m23959g() {
            return this.f15562c;
        }

        /* renamed from: h */
        public final List m23958h() {
            return this.f15558f;
        }

        /* renamed from: i */
        public final List m23957i() {
            return this.f15559g;
        }

        /* renamed from: j */
        public final String m23956j() {
            return this.f15561b;
        }

        /* renamed from: k */
        public final String m23955k() {
            return this.f15557d;
        }

        /* renamed from: l */
        public final int m23954l() {
            return this.f15563e;
        }

        /* renamed from: m */
        public final String m23953m() {
            return this.f15556a;
        }

        /* renamed from: n */
        public final C5500a m23952n(String str) {
            Intrinsics.isThisObjectNull(str, "host");
            String m23444e = hostnames.m23444e(C5502b.m23925g(HttpUrl.f15543k, str, 0, 0, false, 7, null));
            if (m23444e != null) {
                m23969C(m23444e);
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("unexpected host: ", str));
        }

        /* renamed from: q */
        public final C5500a m23949q(HttpUrl httpUrl, String str) {
            String m8865Q0;
            int m23400q;
            int i;
            int i2;
            String str2;
            boolean z;
            int i3;
            String str3;
            int i4;
            boolean z2;
            boolean m8934z;
            boolean m8934z2;
            String str4 = str;
            Intrinsics.isThisObjectNull(str4, "input");
            int m23442A = Util.m23442A(str4, 0, 0, 3, null);
            int m23440C = Util.m23440C(str4, m23442A, 0, 2, null);
            C5501a c5501a = f15555i;
            int m23937c = C5501a.m23937c(c5501a, str4, m23442A, m23440C);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            char c = 65535;
            boolean z3 = true;
            if (m23937c != -1) {
                m8934z = StringsJVM.m8934z(str4, "https:", m23442A, true);
                if (m8934z) {
                    this.f15556a = "https";
                    m23442A += 6;
                } else {
                    m8934z2 = StringsJVM.m8934z(str4, "http:", m23442A, true);
                    if (m8934z2) {
                        this.f15556a = "http";
                        m23442A += 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = str4.substring(0, m23937c);
                        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } else if (httpUrl != null) {
                this.f15556a = httpUrl.m23974r();
            } else {
                if (str.length() > 6) {
                    m8865Q0 = _Strings.m8865Q0(str4, 6);
                    str4 = Intrinsics.addStrAndObj(m8865Q0, "...");
                }
                throw new IllegalArgumentException(Intrinsics.addStrAndObj("Expected URL scheme 'http' or 'https' but no scheme was found for ", str4));
            }
            int m23936d = C5501a.m23936d(c5501a, str4, m23442A, m23440C);
            char c2 = '?';
            char c3 = '#';
            if (m23936d < 2 && httpUrl != null && Intrinsics.equals(httpUrl.m23974r(), this.f15556a)) {
                this.f15561b = httpUrl.m23985g();
                this.f15562c = httpUrl.m23989c();
                this.f15557d = httpUrl.m23983i();
                this.f15563e = httpUrl.m23978n();
                this.f15558f.clear();
                this.f15558f.addAll(httpUrl.m23987e());
                if (m23442A == m23440C || str4.charAt(m23442A) == '#') {
                    m23961e(httpUrl.m23986f());
                }
                i = m23440C;
            } else {
                int i5 = m23442A + m23936d;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    m23400q = Util.m23400q(str4, "@/\\?#", i5, m23440C);
                    char charAt = m23400q != m23440C ? str4.charAt(m23400q) : c;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    } else if (charAt == '@') {
                        if (!z4) {
                            int m23401p = Util.m23401p(str4, ':', i5, m23400q);
                            C5502b c5502b = HttpUrl.f15543k;
                            z = z3;
                            i3 = m23440C;
                            String str6 = str5;
                            String m23930b = C5502b.m23930b(c5502b, str, i5, m23401p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z5) {
                                m23930b = this.f15561b + "%40" + m23930b;
                            }
                            this.f15561b = m23930b;
                            if (m23401p != m23400q) {
                                this.f15562c = C5502b.m23930b(c5502b, str, m23401p + 1, m23400q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = z;
                            } else {
                                z2 = z4;
                            }
                            z4 = z2;
                            str3 = str6;
                            z5 = z;
                            i4 = m23400q;
                        } else {
                            z = z3;
                            i3 = m23440C;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f15562c);
                            sb3.append("%40");
                            str3 = str5;
                            i4 = m23400q;
                            sb3.append(C5502b.m23930b(HttpUrl.f15543k, str, i5, m23400q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f15562c = sb3.toString();
                        }
                        i5 = i4 + 1;
                        str5 = str3;
                        z3 = z;
                        m23440C = i3;
                        c3 = '#';
                        c2 = '?';
                        c = 65535;
                    }
                }
                boolean z6 = z3;
                String str7 = str5;
                i = m23440C;
                C5501a c5501a2 = f15555i;
                int m23938b = C5501a.m23938b(c5501a2, str4, i5, m23400q);
                int i6 = m23938b + 1;
                if (i6 < m23400q) {
                    i2 = i5;
                    this.f15557d = hostnames.m23444e(C5502b.m23925g(HttpUrl.f15543k, str, i5, m23938b, false, 4, null));
                    int m23939a = C5501a.m23939a(c5501a2, str4, i6, m23400q);
                    this.f15563e = m23939a;
                    if (!(m23939a != -1 ? z6 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i6, m23400q);
                        Intrinsics.checkIfNull(substring2, str7);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str7;
                } else {
                    i2 = i5;
                    str2 = str7;
                    C5502b c5502b2 = HttpUrl.f15543k;
                    this.f15557d = hostnames.m23444e(C5502b.m23925g(c5502b2, str, i2, m23938b, false, 4, null));
                    String str8 = this.f15556a;
                    Intrinsics.ifNullDoSomething(str8);
                    this.f15563e = c5502b2.m23929c(str8);
                }
                if (!(this.f15557d != null ? z6 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, m23938b);
                    Intrinsics.checkIfNull(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                m23442A = m23400q;
            }
            int i7 = i;
            int m23400q2 = Util.m23400q(str4, "?#", m23442A, i7);
            m23943w(str4, m23442A, m23400q2);
            if (m23400q2 < i7 && str4.charAt(m23400q2) == '?') {
                int m23401p2 = Util.m23401p(str4, '#', m23400q2, i7);
                C5502b c5502b3 = HttpUrl.f15543k;
                this.f15559g = c5502b3.m23923i(C5502b.m23930b(c5502b3, str, m23400q2 + 1, m23401p2, " \"'<>#", true, false, true, false, null, 208, null));
                m23400q2 = m23401p2;
            }
            if (m23400q2 < i7 && str4.charAt(m23400q2) == '#') {
                this.f15560h = C5502b.m23930b(HttpUrl.f15543k, str, m23400q2 + 1, i7, BuildConfig.VERSION_NAME, true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* renamed from: r */
        public final C5500a m23948r(String str) {
            Intrinsics.isThisObjectNull(str, "password");
            m23940z(C5502b.m23930b(HttpUrl.f15543k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        /* renamed from: t */
        public final C5500a m23946t(int i) {
            boolean z = false;
            if (1 <= i && i < 65536) {
                z = true;
            }
            if (z) {
                m23968D(i);
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("unexpected port: ", Integer.valueOf(i)).toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
            if ((m23959g().length() > 0) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
            if (r1 != r2.m23929c(r3)) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.m23953m()
                if (r1 == 0) goto L18
                java.lang.String r1 = r6.m23953m()
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L1d
            L18:
                java.lang.String r1 = "//"
                r0.append(r1)
            L1d:
                java.lang.String r1 = r6.m23956j()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L2b
                r1 = r2
                goto L2c
            L2b:
                r1 = r3
            L2c:
                r4 = 58
                if (r1 != 0) goto L3f
                java.lang.String r1 = r6.m23959g()
                int r1 = r1.length()
                if (r1 <= 0) goto L3c
                r1 = r2
                goto L3d
            L3c:
                r1 = r3
            L3d:
                if (r1 == 0) goto L63
            L3f:
                java.lang.String r1 = r6.m23956j()
                r0.append(r1)
                java.lang.String r1 = r6.m23959g()
                int r1 = r1.length()
                if (r1 <= 0) goto L51
                goto L52
            L51:
                r2 = r3
            L52:
                if (r2 == 0) goto L5e
                r0.append(r4)
                java.lang.String r1 = r6.m23959g()
                r0.append(r1)
            L5e:
                r1 = 64
                r0.append(r1)
            L63:
                java.lang.String r1 = r6.m23955k()
                if (r1 == 0) goto L91
                java.lang.String r1 = r6.m23955k()
                p181jd.Intrinsics.ifNullDoSomething(r1)
                r2 = 2
                r5 = 0
                boolean r1 = sd.C10163k.m9004G(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L8a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.m23955k()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L91
            L8a:
                java.lang.String r1 = r6.m23955k()
                r0.append(r1)
            L91:
                int r1 = r6.m23954l()
                r2 = -1
                if (r1 != r2) goto L9e
                java.lang.String r1 = r6.m23953m()
                if (r1 == 0) goto Lbd
            L9e:
                int r1 = r6.m23962d()
                java.lang.String r2 = r6.m23953m()
                if (r2 == 0) goto Lb7
                ff.v$b r2 = p107ff.HttpUrl.f15543k
                java.lang.String r3 = r6.m23953m()
                p181jd.Intrinsics.ifNullDoSomething(r3)
                int r2 = r2.m23929c(r3)
                if (r1 == r2) goto Lbd
            Lb7:
                r0.append(r4)
                r0.append(r1)
            Lbd:
                ff.v$b r1 = p107ff.HttpUrl.f15543k
                java.util.List r2 = r6.m23958h()
                r1.m23924h(r2, r0)
                java.util.List r2 = r6.m23957i()
                if (r2 == 0) goto Ldb
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.m23957i()
                p181jd.Intrinsics.ifNullDoSomething(r2)
                r1.m23922j(r2, r0)
            Ldb:
                java.lang.String r1 = r6.m23960f()
                if (r1 == 0) goto Led
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.m23960f()
                r0.append(r1)
            Led:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                p181jd.Intrinsics.checkIfNull(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.HttpUrl.C5500a.toString():java.lang.String");
        }

        /* renamed from: v */
        public final C5500a m23944v() {
            String m23955k = m23955k();
            m23969C(m23955k == null ? null : new C10156i("[\"<>^`{|}]").m9020e(m23955k, BuildConfig.VERSION_NAME));
            int size = m23958h().size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                m23958h().set(i2, C5502b.m23930b(HttpUrl.f15543k, (String) m23958h().get(i2), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List m23957i = m23957i();
            if (m23957i != null) {
                int size2 = m23957i.size();
                while (i < size2) {
                    int i3 = i + 1;
                    String str = (String) m23957i.get(i);
                    m23957i.set(i, str == null ? null : C5502b.m23930b(HttpUrl.f15543k, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                    i = i3;
                }
            }
            String m23960f = m23960f();
            m23941y(m23960f != null ? C5502b.m23930b(HttpUrl.f15543k, m23960f, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null);
            return this;
        }

        /* renamed from: x */
        public final C5500a m23942x(String str) {
            boolean m8943q;
            boolean m8943q2;
            Intrinsics.isThisObjectNull(str, "scheme");
            m8943q = StringsJVM.m8943q(str, "http", true);
            if (m8943q) {
                m23967E("http");
            } else {
                m8943q2 = StringsJVM.m8943q(str, "https", true);
                if (!m8943q2) {
                    throw new IllegalArgumentException(Intrinsics.addStrAndObj("unexpected scheme: ", str));
                }
                m23967E("https");
            }
            return this;
        }

        /* renamed from: y */
        public final void m23941y(String str) {
            this.f15560h = str;
        }

        /* renamed from: z */
        public final void m23940z(String str) {
            Intrinsics.isThisObjectNull(str, "<set-?>");
            this.f15562c = str;
        }
    }

    /* compiled from: HttpUrl.kt */
    /* renamed from: ff.v$b */
    /* loaded from: classes2.dex */
    public static final class C5502b {
        private C5502b() {
        }

        public /* synthetic */ C5502b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m23930b(C5502b c5502b, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return c5502b.m23931a(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        /* renamed from: e */
        private final boolean m23927e(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.m23435H(str.charAt(i + 1)) != -1 && Util.m23435H(str.charAt(i3)) != -1;
        }

        /* renamed from: g */
        public static /* synthetic */ String m23925g(C5502b c5502b, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return c5502b.m23926f(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
            if (m23927e(r16, r5, r18) == false) goto L39;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m23921k(p356sf.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lb9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb2
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.m8814I0(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L69
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L69
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L49
                if (r23 == 0) goto L69
            L49:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = sd.C10163k.m9004G(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.m23927e(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.m8812K0(r7)
                goto Lb2
            L67:
                r8 = r14
                goto L6c
            L69:
                r8 = r14
                r12 = r19
            L6c:
                if (r6 != 0) goto L73
                sf.c r6 = new sf.c
                r6.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = p181jd.Intrinsics.equals(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.m8817G0(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.m8812K0(r7)
            L8a:
                boolean r10 = r6.mo8762Q()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.m8791x0(r9)
                char[] r11 = p107ff.HttpUrl.m23991a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.m8791x0(r11)
                char[] r11 = p107ff.HttpUrl.m23991a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.m8791x0(r10)
                goto L8a
            Lb2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lb9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.HttpUrl.C5502b.m23921k(sf.c, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: l */
        private final void m23920l(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int m23435H = Util.m23435H(str.charAt(i + 1));
                    int m23435H2 = Util.m23435H(str.charAt(i3));
                    if (m23435H != -1 && m23435H2 != -1) {
                        buffer.m8791x0((m23435H << 4) + m23435H2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    buffer.m8812K0(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        buffer.m8791x0(32);
                        i++;
                    }
                    buffer.m8812K0(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        /* renamed from: a */
        public final String m23931a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            boolean m8924G;
            Intrinsics.isThisObjectNull(str, "<this>");
            Intrinsics.isThisObjectNull(str2, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                    m8924G = C10171u.m8924G(str2, (char) codePointAt, false, 2, null);
                    if (!m8924G) {
                        if (codePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!m23927e(str, i3, i2)) {
                                        Buffer buffer = new Buffer();
                                        buffer.m8813J0(str, i, i3);
                                        m23921k(buffer, str, i3, i2, str2, z, z2, z3, z4, charset);
                                        return buffer.m8801d0();
                                    }
                                    if (codePointAt == 43 || !z3) {
                                        i3 += Character.charCount(codePointAt);
                                    } else {
                                        Buffer buffer2 = new Buffer();
                                        buffer2.m8813J0(str, i, i3);
                                        m23921k(buffer2, str, i3, i2, str2, z, z2, z3, z4, charset);
                                        return buffer2.m8801d0();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                Buffer buffer22 = new Buffer();
                buffer22.m8813J0(str, i, i3);
                m23921k(buffer22, str, i3, i2, str2, z, z2, z3, z4, charset);
                return buffer22.m8801d0();
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: c */
        public final int m23929c(String str) {
            Intrinsics.isThisObjectNull(str, "scheme");
            if (Intrinsics.equals(str, "http")) {
                return 80;
            }
            return Intrinsics.equals(str, "https") ? 443 : -1;
        }

        /* renamed from: d */
        public final HttpUrl m23928d(String str) {
            Intrinsics.isThisObjectNull(str, "<this>");
            return new C5500a().m23949q(null, str).m23963c();
        }

        /* renamed from: f */
        public final String m23926f(String str, int i, int i2, boolean z) {
            Intrinsics.isThisObjectNull(str, "<this>");
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.m8813J0(str, i, i3);
                    m23920l(buffer, str, i3, i2, z);
                    return buffer.m8801d0();
                }
                i3 = i4;
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: h */
        public final void m23924h(List list, StringBuilder sb2) {
            Intrinsics.isThisObjectNull(list, "<this>");
            Intrinsics.isThisObjectNull(sb2, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb2.append('/');
                sb2.append((String) list.get(i));
            }
        }

        /* renamed from: i */
        public final List m23923i(String str) {
            int m8906T;
            int m8906T2;
            Intrinsics.isThisObjectNull(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                m8906T = C10171u.m8906T(str, '&', i, false, 4, null);
                if (m8906T == -1) {
                    m8906T = str.length();
                }
                int i2 = m8906T;
                m8906T2 = C10171u.m8906T(str, '=', i, false, 4, null);
                if (m8906T2 != -1 && m8906T2 <= i2) {
                    String substring = str.substring(i, m8906T2);
                    Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(m8906T2 + 1, i2);
                    Intrinsics.checkIfNull(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i, i2);
                    Intrinsics.checkIfNull(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        /* renamed from: j */
        public final void m23922j(List list, StringBuilder sb2) {
            C8611f m14992q;
            C8608d m14993p;
            Intrinsics.isThisObjectNull(list, "<this>");
            Intrinsics.isThisObjectNull(sb2, "out");
            m14992q = _Ranges.m14992q(0, list.size());
            m14993p = _Ranges.m14993p(m14992q, 2);
            int m15034f = m14993p.m15034f();
            int m15033h = m14993p.m15033h();
            int m15032l = m14993p.m15032l();
            if ((m15032l <= 0 || m15034f > m15033h) && (m15032l >= 0 || m15033h > m15034f)) {
                return;
            }
            while (true) {
                int i = m15034f + m15032l;
                String str = (String) list.get(m15034f);
                String str2 = (String) list.get(m15034f + 1);
                if (m15034f > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (m15034f == m15033h) {
                    return;
                }
                m15034f = i;
            }
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6) {
        Intrinsics.isThisObjectNull(str, "scheme");
        Intrinsics.isThisObjectNull(str2, "username");
        Intrinsics.isThisObjectNull(str3, "password");
        Intrinsics.isThisObjectNull(str4, "host");
        Intrinsics.isThisObjectNull(list, "pathSegments");
        Intrinsics.isThisObjectNull(str6, "url");
        this.f15545a = str;
        this.f15546b = str2;
        this.f15547c = str3;
        this.f15548d = str4;
        this.f15549e = i;
        this.f15550f = list;
        this.f15551g = list2;
        this.f15552h = str5;
        this.f15553i = str6;
        this.f15554j = Intrinsics.equals(str, "https");
    }

    /* renamed from: a */
    public static final /* synthetic */ char[] m23991a() {
        return f15544l;
    }

    /* renamed from: h */
    public static final HttpUrl m23984h(String str) {
        return f15543k.m23928d(str);
    }

    /* renamed from: b */
    public final String m23990b() {
        int m8906T;
        if (this.f15552h == null) {
            return null;
        }
        m8906T = C10171u.m8906T(this.f15553i, '#', 0, false, 6, null);
        String substring = this.f15553i.substring(m8906T + 1);
        Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c */
    public final String m23989c() {
        int m8906T;
        int m8906T2;
        if (this.f15547c.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        m8906T = C10171u.m8906T(this.f15553i, ':', this.f15545a.length() + 3, false, 4, null);
        m8906T2 = C10171u.m8906T(this.f15553i, '@', 0, false, 6, null);
        String substring = this.f15553i.substring(m8906T + 1, m8906T2);
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public final String m23988d() {
        int m8906T;
        m8906T = C10171u.m8906T(this.f15553i, '/', this.f15545a.length() + 3, false, 4, null);
        String str = this.f15553i;
        String substring = this.f15553i.substring(m8906T, Util.m23400q(str, "?#", m8906T, str.length()));
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public final List m23987e() {
        int m8906T;
        m8906T = C10171u.m8906T(this.f15553i, '/', this.f15545a.length() + 3, false, 4, null);
        String str = this.f15553i;
        int m23400q = Util.m23400q(str, "?#", m8906T, str.length());
        ArrayList arrayList = new ArrayList();
        while (m8906T < m23400q) {
            int i = m8906T + 1;
            int m23401p = Util.m23401p(this.f15553i, '/', i, m23400q);
            String substring = this.f15553i.substring(i, m23401p);
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            m8906T = m23401p;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.equals(((HttpUrl) obj).f15553i, this.f15553i);
    }

    /* renamed from: f */
    public final String m23986f() {
        int m8906T;
        if (this.f15551g == null) {
            return null;
        }
        m8906T = C10171u.m8906T(this.f15553i, '?', 0, false, 6, null);
        int i = m8906T + 1;
        String str = this.f15553i;
        String substring = this.f15553i.substring(i, Util.m23401p(str, '#', i, str.length()));
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g */
    public final String m23985g() {
        if (this.f15546b.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int length = this.f15545a.length() + 3;
        String str = this.f15553i;
        String substring = this.f15553i.substring(length, Util.m23400q(str, ":@", length, str.length()));
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f15553i.hashCode();
    }

    /* renamed from: i */
    public final String m23983i() {
        return this.f15548d;
    }

    /* renamed from: j */
    public final boolean m23982j() {
        return this.f15554j;
    }

    /* renamed from: k */
    public final C5500a m23981k() {
        C5500a c5500a = new C5500a();
        c5500a.m23967E(this.f15545a);
        c5500a.m23970B(m23985g());
        c5500a.m23940z(m23989c());
        c5500a.m23969C(this.f15548d);
        c5500a.m23968D(this.f15549e != f15543k.m23929c(this.f15545a) ? this.f15549e : -1);
        c5500a.m23958h().clear();
        c5500a.m23958h().addAll(m23987e());
        c5500a.m23961e(m23986f());
        c5500a.m23941y(m23990b());
        return c5500a;
    }

    /* renamed from: l */
    public final C5500a m23980l(String str) {
        Intrinsics.isThisObjectNull(str, "link");
        try {
            return new C5500a().m23949q(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final List m23979m() {
        return this.f15550f;
    }

    /* renamed from: n */
    public final int m23978n() {
        return this.f15549e;
    }

    /* renamed from: o */
    public final String m23977o() {
        if (this.f15551g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f15543k.m23922j(this.f15551g, sb2);
        return sb2.toString();
    }

    /* renamed from: p */
    public final String m23976p() {
        C5500a m23980l = m23980l("/...");
        Intrinsics.ifNullDoSomething(m23980l);
        return m23980l.m23966F(BuildConfig.VERSION_NAME).m23948r(BuildConfig.VERSION_NAME).m23963c().toString();
    }

    /* renamed from: q */
    public final HttpUrl m23975q(String str) {
        Intrinsics.isThisObjectNull(str, "link");
        C5500a m23980l = m23980l(str);
        if (m23980l == null) {
            return null;
        }
        return m23980l.m23963c();
    }

    /* renamed from: r */
    public final String m23974r() {
        return this.f15545a;
    }

    /* renamed from: s */
    public final URI m23973s() {
        String c5500a = m23981k().m23944v().toString();
        try {
            return new URI(c5500a);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new C10156i("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m9020e(c5500a, BuildConfig.VERSION_NAME));
                Intrinsics.checkIfNull(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: t */
    public final URL m23972t() {
        try {
            return new URL(this.f15553i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f15553i;
    }
}
