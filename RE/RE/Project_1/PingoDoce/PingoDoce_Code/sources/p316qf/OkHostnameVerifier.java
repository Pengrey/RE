package p316qf;

import gf.Util;
import gf.hostnames;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p181jd.Intrinsics;
import p356sf.Utf8;
import p489zc.C13780s;
import p489zc._Collections;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: qf.d */
/* loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a */
    public static final OkHostnameVerifier f25586a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    /* renamed from: b */
    private final String m10108b(String str) {
        if (m10106d(str)) {
            Locale locale = Locale.US;
            Intrinsics.checkIfNull(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    /* renamed from: c */
    private final List m10107c(X509Certificate x509Certificate, int i) {
        List m197g;
        Object obj;
        List m197g2;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                m197g2 = C13780s.m197g();
                return m197g2;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.equals(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            m197g = C13780s.m197g();
            return m197g;
        }
    }

    /* renamed from: d */
    private final boolean m10106d(String str) {
        return str.length() == ((int) Utf8.m8629b(str, 0, 0, 3, null));
    }

    /* renamed from: f */
    private final boolean m10104f(String str, String str2) {
        boolean m8948C;
        boolean m8944p;
        boolean m8948C2;
        boolean m8944p2;
        boolean m8944p3;
        boolean m8944p4;
        boolean m8922H;
        boolean m8948C3;
        int m8906T;
        boolean m8944p5;
        int m8901Y;
        if (!(str == null || str.length() == 0)) {
            m8948C = StringsJVM.m8948C(str, ".", false, 2, null);
            if (!m8948C) {
                m8944p = StringsJVM.m8944p(str, "..", false, 2, null);
                if (!m8944p) {
                    if (!(str2 == null || str2.length() == 0)) {
                        m8948C2 = StringsJVM.m8948C(str2, ".", false, 2, null);
                        if (!m8948C2) {
                            m8944p2 = StringsJVM.m8944p(str2, "..", false, 2, null);
                            if (!m8944p2) {
                                m8944p3 = StringsJVM.m8944p(str, ".", false, 2, null);
                                if (!m8944p3) {
                                    str = Intrinsics.addStrAndObj(str, ".");
                                }
                                String str3 = str;
                                m8944p4 = StringsJVM.m8944p(str2, ".", false, 2, null);
                                if (!m8944p4) {
                                    str2 = Intrinsics.addStrAndObj(str2, ".");
                                }
                                String m10108b = m10108b(str2);
                                m8922H = C10171u.m8922H(m10108b, "*", false, 2, null);
                                if (!m8922H) {
                                    return Intrinsics.equals(str3, m10108b);
                                }
                                m8948C3 = StringsJVM.m8948C(m10108b, "*.", false, 2, null);
                                if (m8948C3) {
                                    m8906T = C10171u.m8906T(m10108b, '*', 1, false, 4, null);
                                    if (m8906T == -1 && str3.length() >= m10108b.length() && !Intrinsics.equals("*.", m10108b)) {
                                        String substring = m10108b.substring(1);
                                        Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
                                        m8944p5 = StringsJVM.m8944p(str3, substring, false, 2, null);
                                        if (m8944p5) {
                                            int length = str3.length() - substring.length();
                                            if (length > 0) {
                                                m8901Y = C10171u.m8901Y(str3, '.', length - 1, false, 4, null);
                                                if (m8901Y != -1) {
                                                    return false;
                                                }
                                            }
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m10103g(String str, X509Certificate x509Certificate) {
        String m10108b = m10108b(str);
        List<String> m10107c = m10107c(x509Certificate, 2);
        if ((m10107c instanceof Collection) && m10107c.isEmpty()) {
            return false;
        }
        for (String str2 : m10107c) {
            if (f25586a.m10104f(m10108b, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m10102h(String str, X509Certificate x509Certificate) {
        String m23444e = hostnames.m23444e(str);
        List<String> m10107c = m10107c(x509Certificate, 7);
        if ((m10107c instanceof Collection) && m10107c.isEmpty()) {
            return false;
        }
        for (String str2 : m10107c) {
            if (Intrinsics.equals(m23444e, hostnames.m23444e(str2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List m10109a(X509Certificate x509Certificate) {
        List m467b0;
        Intrinsics.isThisObjectNull(x509Certificate, "certificate");
        m467b0 = _Collections.m467b0(m10107c(x509Certificate, 7), m10107c(x509Certificate, 2));
        return m467b0;
    }

    /* renamed from: e */
    public final boolean m10105e(String str, X509Certificate x509Certificate) {
        Intrinsics.isThisObjectNull(str, "host");
        Intrinsics.isThisObjectNull(x509Certificate, "certificate");
        return Util.m23408i(str) ? m10102h(str, x509Certificate) : m10103g(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        Intrinsics.isThisObjectNull(str, "host");
        Intrinsics.isThisObjectNull(sSLSession, "session");
        if (m10106d(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return m10105e(str, (X509Certificate) certificate);
    }
}
