package p335rb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.b */
/* loaded from: classes2.dex */
public final class C9836b implements InterfaceC9841g {
    /* renamed from: c */
    private static char m9900c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    @Override // p335rb.InterfaceC9841g
    /* renamed from: a */
    public void mo9833a(C9842h c9842h) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!c9842h.m9874i()) {
                break;
            }
            sb2.append(c9842h.m9880c());
            c9842h.f25786f++;
            if (C9844j.m9847n(c9842h.m9879d(), c9842h.f25786f, m9901b()) != m9901b()) {
                c9842h.m9868o(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int m9882a = c9842h.m9882a() + length + 1;
        c9842h.m9866q(m9882a);
        boolean z = c9842h.m9876g().m9845a() - m9882a > 0;
        if (c9842h.m9874i() || z) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb2.length();
        for (int i = 0; i < length2; i++) {
            c9842h.m9865r(m9900c(sb2.charAt(i), c9842h.m9882a() + 1));
        }
    }

    /* renamed from: b */
    public int m9901b() {
        return 5;
    }
}
