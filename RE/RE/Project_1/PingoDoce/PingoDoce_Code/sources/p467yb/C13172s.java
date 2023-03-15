package p467yb;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yb.s */
/* loaded from: classes2.dex */
public final class C13172s {

    /* renamed from: a */
    private final C7154a f34131a;

    /* renamed from: b */
    private final C13165m f34132b = new C13165m();

    /* renamed from: c */
    private final StringBuilder f34133c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13172s(C7154a c7154a) {
        this.f34131a = c7154a;
    }

    /* renamed from: b */
    private C13167n m1487b(int i) {
        char c;
        int m1483f = m1483f(i, 5);
        if (m1483f == 15) {
            return new C13167n(i + 5, '$');
        }
        if (m1483f >= 5 && m1483f < 15) {
            return new C13167n(i + 5, (char) ((m1483f + 48) - 5));
        }
        int m1483f2 = m1483f(i, 6);
        if (m1483f2 >= 32 && m1483f2 < 58) {
            return new C13167n(i + 6, (char) (m1483f2 + 33));
        }
        switch (m1483f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(m1483f2)));
        }
        return new C13167n(i + 6, c);
    }

    /* renamed from: d */
    private C13167n m1485d(int i) throws FormatException {
        char c;
        int m1483f = m1483f(i, 5);
        if (m1483f == 15) {
            return new C13167n(i + 5, '$');
        }
        if (m1483f >= 5 && m1483f < 15) {
            return new C13167n(i + 5, (char) ((m1483f + 48) - 5));
        }
        int m1483f2 = m1483f(i, 7);
        if (m1483f2 < 64 || m1483f2 >= 90) {
            if (m1483f2 >= 90 && m1483f2 < 116) {
                return new C13167n(i + 7, (char) (m1483f2 + 7));
            }
            switch (m1483f(i, 8)) {
                case 232:
                    c = '!';
                    break;
                case 233:
                    c = '\"';
                    break;
                case 234:
                    c = '%';
                    break;
                case 235:
                    c = '&';
                    break;
                case 236:
                    c = '\'';
                    break;
                case 237:
                    c = '(';
                    break;
                case 238:
                    c = ')';
                    break;
                case 239:
                    c = '*';
                    break;
                case 240:
                    c = '+';
                    break;
                case 241:
                    c = ',';
                    break;
                case 242:
                    c = '-';
                    break;
                case 243:
                    c = '.';
                    break;
                case 244:
                    c = '/';
                    break;
                case 245:
                    c = ':';
                    break;
                case 246:
                    c = ';';
                    break;
                case 247:
                    c = '<';
                    break;
                case 248:
                    c = '=';
                    break;
                case 249:
                    c = '>';
                    break;
                case 250:
                    c = '?';
                    break;
                case 251:
                    c = '_';
                    break;
                case 252:
                    c = ' ';
                    break;
                default:
                    throw FormatException.m27702a();
            }
            return new C13167n(i + 8, c);
        }
        return new C13167n(i + 7, (char) (m1483f2 + 1));
    }

    /* renamed from: e */
    private C13169p m1484e(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 > this.f34131a.m19072l()) {
            int m1483f = m1483f(i, 4);
            if (m1483f == 0) {
                return new C13169p(this.f34131a.m19072l(), 10, 10);
            }
            return new C13169p(this.f34131a.m19072l(), m1483f - 1, 10);
        }
        int m1483f2 = m1483f(i, 7) - 8;
        return new C13169p(i2, m1483f2 / 11, m1483f2 % 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m1482g(C7154a c7154a, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (c7154a.m19076g(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m1481h(int i) {
        int i2 = i + 3;
        if (i2 > this.f34131a.m19072l()) {
            return false;
        }
        while (i < i2) {
            if (this.f34131a.m19076g(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m1480i(int i) {
        int i2;
        if (i + 1 > this.f34131a.m19072l()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f34131a.m19072l(); i3++) {
            if (i3 == 2) {
                if (!this.f34131a.m19076g(i + 2)) {
                    return false;
                }
            } else if (this.f34131a.m19076g(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private boolean m1479j(int i) {
        int i2;
        if (i + 1 > this.f34131a.m19072l()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f34131a.m19072l(); i3++) {
            if (this.f34131a.m19076g(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m1478k(int i) {
        int m1483f;
        if (i + 5 > this.f34131a.m19072l()) {
            return false;
        }
        int m1483f2 = m1483f(i, 5);
        if (m1483f2 < 5 || m1483f2 >= 16) {
            return i + 6 <= this.f34131a.m19072l() && (m1483f = m1483f(i, 6)) >= 16 && m1483f < 63;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m1477l(int i) {
        int m1483f;
        if (i + 5 > this.f34131a.m19072l()) {
            return false;
        }
        int m1483f2 = m1483f(i, 5);
        if (m1483f2 < 5 || m1483f2 >= 16) {
            if (i + 7 > this.f34131a.m19072l()) {
                return false;
            }
            int m1483f3 = m1483f(i, 7);
            if (m1483f3 < 64 || m1483f3 >= 116) {
                return i + 8 <= this.f34131a.m19072l() && (m1483f = m1483f(i, 8)) >= 232 && m1483f < 253;
            }
            return true;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m1476m(int i) {
        if (i + 7 > this.f34131a.m19072l()) {
            return i + 4 <= this.f34131a.m19072l();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 < i3) {
                if (this.f34131a.m19076g(i2)) {
                    return true;
                }
                i2++;
            } else {
                return this.f34131a.m19076g(i3);
            }
        }
    }

    /* renamed from: n */
    private C13164l m1475n() {
        while (m1478k(this.f34132b.m1509a())) {
            C13167n m1487b = m1487b(this.f34132b.m1509a());
            this.f34132b.m1502h(m1487b.m1492a());
            if (m1487b.m1500c()) {
                return new C13164l(new C13168o(this.f34132b.m1509a(), this.f34133c.toString()), true);
            }
            this.f34133c.append(m1487b.m1501b());
        }
        if (m1481h(this.f34132b.m1509a())) {
            this.f34132b.m1508b(3);
            this.f34132b.m1503g();
        } else if (m1480i(this.f34132b.m1509a())) {
            if (this.f34132b.m1509a() + 5 < this.f34131a.m19072l()) {
                this.f34132b.m1508b(5);
            } else {
                this.f34132b.m1502h(this.f34131a.m19072l());
            }
            this.f34132b.m1504f();
        }
        return new C13164l(false);
    }

    /* renamed from: o */
    private C13168o m1474o() throws FormatException {
        C13164l m1472q;
        boolean m1510b;
        do {
            int m1509a = this.f34132b.m1509a();
            if (this.f34132b.m1507c()) {
                m1472q = m1475n();
                m1510b = m1472q.m1510b();
            } else if (this.f34132b.m1506d()) {
                m1472q = m1473p();
                m1510b = m1472q.m1510b();
            } else {
                m1472q = m1472q();
                m1510b = m1472q.m1510b();
            }
            if (!(m1509a != this.f34132b.m1509a()) && !m1510b) {
                break;
            }
        } while (!m1510b);
        return m1472q.m1511a();
    }

    /* renamed from: p */
    private C13164l m1473p() throws FormatException {
        while (m1477l(this.f34132b.m1509a())) {
            C13167n m1485d = m1485d(this.f34132b.m1509a());
            this.f34132b.m1502h(m1485d.m1492a());
            if (m1485d.m1500c()) {
                return new C13164l(new C13168o(this.f34132b.m1509a(), this.f34133c.toString()), true);
            }
            this.f34133c.append(m1485d.m1501b());
        }
        if (m1481h(this.f34132b.m1509a())) {
            this.f34132b.m1508b(3);
            this.f34132b.m1503g();
        } else if (m1480i(this.f34132b.m1509a())) {
            if (this.f34132b.m1509a() + 5 < this.f34131a.m19072l()) {
                this.f34132b.m1508b(5);
            } else {
                this.f34132b.m1502h(this.f34131a.m19072l());
            }
            this.f34132b.m1505e();
        }
        return new C13164l(false);
    }

    /* renamed from: q */
    private C13164l m1472q() throws FormatException {
        C13168o c13168o;
        while (m1476m(this.f34132b.m1509a())) {
            C13169p m1484e = m1484e(this.f34132b.m1509a());
            this.f34132b.m1502h(m1484e.m1492a());
            if (m1484e.m1494d()) {
                if (m1484e.m1493e()) {
                    c13168o = new C13168o(this.f34132b.m1509a(), this.f34133c.toString());
                } else {
                    c13168o = new C13168o(this.f34132b.m1509a(), this.f34133c.toString(), m1484e.m1495c());
                }
                return new C13164l(c13168o, true);
            }
            this.f34133c.append(m1484e.m1496b());
            if (m1484e.m1493e()) {
                return new C13164l(new C13168o(this.f34132b.m1509a(), this.f34133c.toString()), true);
            }
            this.f34133c.append(m1484e.m1495c());
        }
        if (m1479j(this.f34132b.m1509a())) {
            this.f34132b.m1505e();
            this.f34132b.m1508b(4);
        }
        return new C13164l(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m1488a(StringBuilder sb2, int i) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            C13168o m1486c = m1486c(i, str);
            String m1491a = C13171r.m1491a(m1486c.m1499b());
            if (m1491a != null) {
                sb2.append(m1491a);
            }
            String valueOf = m1486c.m1497d() ? String.valueOf(m1486c.m1498c()) : null;
            if (i != m1486c.m1492a()) {
                i = m1486c.m1492a();
                str = valueOf;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C13168o m1486c(int i, String str) throws FormatException {
        this.f34133c.setLength(0);
        if (str != null) {
            this.f34133c.append(str);
        }
        this.f34132b.m1502h(i);
        C13168o m1474o = m1474o();
        if (m1474o != null && m1474o.m1497d()) {
            return new C13168o(this.f34132b.m1509a(), this.f34133c.toString(), m1474o.m1498c());
        }
        return new C13168o(this.f34132b.m1509a(), this.f34133c.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m1483f(int i, int i2) {
        return m1482g(this.f34131a, i, i2);
    }
}
