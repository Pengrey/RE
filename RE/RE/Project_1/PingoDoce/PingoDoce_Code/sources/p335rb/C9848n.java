package p335rb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.n */
/* loaded from: classes2.dex */
public final class C9848n extends C9837c {
    @Override // p335rb.C9837c, p335rb.InterfaceC9841g
    /* renamed from: a */
    public void mo9833a(C9842h c9842h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c9842h.m9874i()) {
                break;
            }
            char m9880c = c9842h.m9880c();
            c9842h.f25786f++;
            mo9832c(m9880c, sb2);
            if (sb2.length() % 3 == 0) {
                C9837c.m9897g(c9842h, sb2);
                if (C9844j.m9847n(c9842h.m9879d(), c9842h.f25786f, mo9831e()) != mo9831e()) {
                    c9842h.m9868o(0);
                    break;
                }
            }
        }
        mo9830f(c9842h, sb2);
    }

    @Override // p335rb.C9837c
    /* renamed from: c */
    int mo9832c(char c, StringBuilder sb2) {
        if (c == '\r') {
            sb2.append((char) 0);
        } else if (c == ' ') {
            sb2.append((char) 3);
        } else if (c == '*') {
            sb2.append((char) 1);
        } else if (c == '>') {
            sb2.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb2.append((char) ((c - '0') + 4));
        } else if (c >= 'A' && c <= 'Z') {
            sb2.append((char) ((c - 'A') + 14));
        } else {
            C9844j.m9856e(c);
        }
        return 1;
    }

    @Override // p335rb.C9837c
    /* renamed from: e */
    public int mo9831e() {
        return 3;
    }

    @Override // p335rb.C9837c
    /* renamed from: f */
    void mo9830f(C9842h c9842h, StringBuilder sb2) {
        c9842h.m9867p();
        int m9845a = c9842h.m9876g().m9845a() - c9842h.m9882a();
        c9842h.f25786f -= sb2.length();
        if (c9842h.m9877f() > 1 || m9845a > 1 || c9842h.m9877f() != m9845a) {
            c9842h.m9865r((char) 254);
        }
        if (c9842h.m9878e() < 0) {
            c9842h.m9868o(0);
        }
    }
}
