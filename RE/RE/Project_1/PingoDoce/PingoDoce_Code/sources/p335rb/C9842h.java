package p335rb;

import com.google.zxing.C4400e;
import java.nio.charset.StandardCharsets;

/* renamed from: rb.h */
/* loaded from: classes2.dex */
final class C9842h {

    /* renamed from: a */
    private final String f25781a;

    /* renamed from: b */
    private EnumC9846l f25782b;

    /* renamed from: c */
    private C4400e f25783c;

    /* renamed from: d */
    private C4400e f25784d;

    /* renamed from: e */
    private final StringBuilder f25785e;

    /* renamed from: f */
    int f25786f;

    /* renamed from: g */
    private int f25787g;

    /* renamed from: h */
    private C9845k f25788h;

    /* renamed from: i */
    private int f25789i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9842h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c);
        }
        this.f25781a = sb2.toString();
        this.f25782b = EnumC9846l.FORCE_NONE;
        this.f25785e = new StringBuilder(str.length());
        this.f25787g = -1;
    }

    /* renamed from: h */
    private int m9875h() {
        return this.f25781a.length() - this.f25789i;
    }

    /* renamed from: a */
    public int m9882a() {
        return this.f25785e.length();
    }

    /* renamed from: b */
    public StringBuilder m9881b() {
        return this.f25785e;
    }

    /* renamed from: c */
    public char m9880c() {
        return this.f25781a.charAt(this.f25786f);
    }

    /* renamed from: d */
    public String m9879d() {
        return this.f25781a;
    }

    /* renamed from: e */
    public int m9878e() {
        return this.f25787g;
    }

    /* renamed from: f */
    public int m9877f() {
        return m9875h() - this.f25786f;
    }

    /* renamed from: g */
    public C9845k m9876g() {
        return this.f25788h;
    }

    /* renamed from: i */
    public boolean m9874i() {
        return this.f25786f < m9875h();
    }

    /* renamed from: j */
    public void m9873j() {
        this.f25787g = -1;
    }

    /* renamed from: k */
    public void m9872k() {
        this.f25788h = null;
    }

    /* renamed from: l */
    public void m9871l(C4400e c4400e, C4400e c4400e2) {
        this.f25783c = c4400e;
        this.f25784d = c4400e2;
    }

    /* renamed from: m */
    public void m9870m(int i) {
        this.f25789i = i;
    }

    /* renamed from: n */
    public void m9869n(EnumC9846l enumC9846l) {
        this.f25782b = enumC9846l;
    }

    /* renamed from: o */
    public void m9868o(int i) {
        this.f25787g = i;
    }

    /* renamed from: p */
    public void m9867p() {
        m9866q(m9882a());
    }

    /* renamed from: q */
    public void m9866q(int i) {
        C9845k c9845k = this.f25788h;
        if (c9845k == null || i > c9845k.m9845a()) {
            this.f25788h = C9845k.m9834l(i, this.f25782b, this.f25783c, this.f25784d, true);
        }
    }

    /* renamed from: r */
    public void m9865r(char c) {
        this.f25785e.append(c);
    }

    /* renamed from: s */
    public void m9864s(String str) {
        this.f25785e.append(str);
    }
}
