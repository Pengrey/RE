package p335rb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.m */
/* loaded from: classes2.dex */
public final class C9847m extends C9837c {
    @Override // p335rb.C9837c
    /* renamed from: c */
    int mo9832c(char c, StringBuilder sb2) {
        if (c == ' ') {
            sb2.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb2.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb2.append((char) ((c - 'a') + 14));
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
        } else if (c >= '[' && c <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c - '[') + 22));
            return 2;
        } else if (c == '`') {
            sb2.append((char) 2);
            sb2.append((char) (c - '`'));
            return 2;
        } else if (c <= 'Z') {
            sb2.append((char) 2);
            sb2.append((char) ((c - 'A') + 1));
            return 2;
        } else if (c <= 127) {
            sb2.append((char) 2);
            sb2.append((char) ((c - '{') + 27));
            return 2;
        } else {
            sb2.append("\u0001\u001e");
            return mo9832c((char) (c - 128), sb2) + 2;
        }
    }

    @Override // p335rb.C9837c
    /* renamed from: e */
    public int mo9831e() {
        return 2;
    }
}
