package p335rb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.f */
/* loaded from: classes2.dex */
public final class C9840f implements InterfaceC9841g {
    /* renamed from: b */
    private static void m9886b(char c, StringBuilder sb2) {
        if (c >= ' ' && c <= '?') {
            sb2.append(c);
        } else if (c >= '@' && c <= '^') {
            sb2.append((char) (c - '@'));
        } else {
            C9844j.m9856e(c);
        }
    }

    /* renamed from: c */
    private static String m9885c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            int charAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
            char c = (char) ((charAt >> 8) & 255);
            char c2 = (char) (charAt & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append((char) ((charAt >> 16) & 255));
            if (length >= 2) {
                sb2.append(c);
            }
            if (length >= 3) {
                sb2.append(c2);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    private static void m9883e(C9842h c9842h, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                c9842h.m9867p();
                int m9845a = c9842h.m9876g().m9845a() - c9842h.m9882a();
                int m9877f = c9842h.m9877f();
                if (m9877f > m9845a) {
                    c9842h.m9866q(c9842h.m9882a() + 1);
                    m9845a = c9842h.m9876g().m9845a() - c9842h.m9882a();
                }
                if (m9877f <= m9845a && m9845a <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String m9885c = m9885c(charSequence, 0);
                if (!(!c9842h.m9874i()) || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    c9842h.m9866q(c9842h.m9882a() + i);
                    if (c9842h.m9876g().m9845a() - c9842h.m9882a() >= 3) {
                        c9842h.m9866q(c9842h.m9882a() + m9885c.length());
                        z = false;
                    }
                }
                if (z) {
                    c9842h.m9872k();
                    c9842h.f25786f -= i;
                } else {
                    c9842h.m9864s(m9885c);
                }
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            c9842h.m9868o(0);
        }
    }

    @Override // p335rb.InterfaceC9841g
    /* renamed from: a */
    public void mo9833a(C9842h c9842h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c9842h.m9874i()) {
                break;
            }
            m9886b(c9842h.m9880c(), sb2);
            c9842h.f25786f++;
            if (sb2.length() >= 4) {
                c9842h.m9864s(m9885c(sb2, 0));
                sb2.delete(0, 4);
                if (C9844j.m9847n(c9842h.m9879d(), c9842h.f25786f, m9884d()) != m9884d()) {
                    c9842h.m9868o(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        m9883e(c9842h, sb2);
    }

    /* renamed from: d */
    public int m9884d() {
        return 4;
    }
}
