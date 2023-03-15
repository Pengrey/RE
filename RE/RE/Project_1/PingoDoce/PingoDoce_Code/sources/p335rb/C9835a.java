package p335rb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.a */
/* loaded from: classes2.dex */
public final class C9835a implements InterfaceC9841g {
    /* renamed from: b */
    private static char m9903b(char c, char c2) {
        if (C9844j.m9855f(c) && C9844j.m9855f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p335rb.InterfaceC9841g
    /* renamed from: a */
    public void mo9833a(C9842h c9842h) {
        if (C9844j.m9860a(c9842h.m9879d(), c9842h.f25786f) >= 2) {
            c9842h.m9865r(m9903b(c9842h.m9879d().charAt(c9842h.f25786f), c9842h.m9879d().charAt(c9842h.f25786f + 1)));
            c9842h.f25786f += 2;
            return;
        }
        char m9880c = c9842h.m9880c();
        int m9847n = C9844j.m9847n(c9842h.m9879d(), c9842h.f25786f, m9902c());
        if (m9847n == m9902c()) {
            if (C9844j.m9854g(m9880c)) {
                c9842h.m9865r((char) 235);
                c9842h.m9865r((char) ((m9880c - 128) + 1));
                c9842h.f25786f++;
                return;
            }
            c9842h.m9865r((char) (m9880c + 1));
            c9842h.f25786f++;
        } else if (m9847n == 1) {
            c9842h.m9865r((char) 230);
            c9842h.m9868o(1);
        } else if (m9847n == 2) {
            c9842h.m9865r((char) 239);
            c9842h.m9868o(2);
        } else if (m9847n == 3) {
            c9842h.m9865r((char) 238);
            c9842h.m9868o(3);
        } else if (m9847n == 4) {
            c9842h.m9865r((char) 240);
            c9842h.m9868o(4);
        } else if (m9847n == 5) {
            c9842h.m9865r((char) 231);
            c9842h.m9868o(5);
        } else {
            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(m9847n)));
        }
    }

    /* renamed from: c */
    public int m9902c() {
        return 0;
    }
}
