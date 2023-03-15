package p335rb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.c */
/* loaded from: classes2.dex */
public class C9837c implements InterfaceC9841g {
    /* renamed from: b */
    private int m9899b(C9842h c9842h, StringBuilder sb2, StringBuilder sb3, int i) {
        int length = sb2.length();
        sb2.delete(length - i, length);
        c9842h.f25786f--;
        int mo9832c = mo9832c(c9842h.m9880c(), sb3);
        c9842h.m9872k();
        return mo9832c;
    }

    /* renamed from: d */
    private static String m9898d(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m9897g(C9842h c9842h, StringBuilder sb2) {
        c9842h.m9864s(m9898d(sb2, 0));
        sb2.delete(0, 3);
    }

    @Override // p335rb.InterfaceC9841g
    /* renamed from: a */
    public void mo9833a(C9842h c9842h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c9842h.m9874i()) {
                break;
            }
            char m9880c = c9842h.m9880c();
            c9842h.f25786f++;
            int mo9832c = mo9832c(m9880c, sb2);
            int m9882a = c9842h.m9882a() + ((sb2.length() / 3) << 1);
            c9842h.m9866q(m9882a);
            int m9845a = c9842h.m9876g().m9845a() - m9882a;
            if (!c9842h.m9874i()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && m9845a != 2) {
                    mo9832c = m9899b(c9842h, sb2, sb3, mo9832c);
                }
                while (sb2.length() % 3 == 1 && (mo9832c > 3 || m9845a != 1)) {
                    mo9832c = m9899b(c9842h, sb2, sb3, mo9832c);
                }
            } else if (sb2.length() % 3 == 0 && C9844j.m9847n(c9842h.m9879d(), c9842h.f25786f, mo9831e()) != mo9831e()) {
                c9842h.m9868o(0);
                break;
            }
        }
        mo9830f(c9842h, sb2);
    }

    /* renamed from: c */
    int mo9832c(char c, StringBuilder sb2) {
        if (c == ' ') {
            sb2.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb2.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb2.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb2.append((char) 0);
            sb2.append(c);
            return 2;
        } else if (c <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c - '!'));
            return 2;
        } else if (c <= '@') {
            sb2.append((char) 1);
            sb2.append((char) ((c - ':') + 15));
            return 2;
        } else if (c <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c - '[') + 22));
            return 2;
        } else if (c <= 127) {
            sb2.append((char) 2);
            sb2.append((char) (c - '`'));
            return 2;
        } else {
            sb2.append("\u0001\u001e");
            return mo9832c((char) (c - 128), sb2) + 2;
        }
    }

    /* renamed from: e */
    public int mo9831e() {
        return 1;
    }

    /* renamed from: f */
    void mo9830f(C9842h c9842h, StringBuilder sb2) {
        int length = sb2.length() % 3;
        int m9882a = c9842h.m9882a() + ((sb2.length() / 3) << 1);
        c9842h.m9866q(m9882a);
        int m9845a = c9842h.m9876g().m9845a() - m9882a;
        if (length == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                m9897g(c9842h, sb2);
            }
            if (c9842h.m9874i()) {
                c9842h.m9865r((char) 254);
            }
        } else if (m9845a == 1 && length == 1) {
            while (sb2.length() >= 3) {
                m9897g(c9842h, sb2);
            }
            if (c9842h.m9874i()) {
                c9842h.m9865r((char) 254);
            }
            c9842h.f25786f--;
        } else if (length == 0) {
            while (sb2.length() >= 3) {
                m9897g(c9842h, sb2);
            }
            if (m9845a > 0 || c9842h.m9874i()) {
                c9842h.m9865r((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        c9842h.m9868o(0);
    }
}
