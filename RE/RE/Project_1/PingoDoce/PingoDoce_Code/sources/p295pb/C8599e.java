package p295pb;

import androidx.constraintlayout.widget.C0868i;
import com.google.zxing.FormatException;
import p070e.C4906j;

/* renamed from: pb.e */
/* loaded from: classes2.dex */
public final class C8599e {

    /* renamed from: h */
    private static final C8599e[] f22207h = m15052a();

    /* renamed from: a */
    private final int f22208a;

    /* renamed from: b */
    private final int f22209b;

    /* renamed from: c */
    private final int f22210c;

    /* renamed from: d */
    private final int f22211d;

    /* renamed from: e */
    private final int f22212e;

    /* renamed from: f */
    private final C8602c f22213f;

    /* renamed from: g */
    private final int f22214g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Version.java */
    /* renamed from: pb.e$b */
    /* loaded from: classes2.dex */
    public static final class C8601b {

        /* renamed from: a */
        private final int f22215a;

        /* renamed from: b */
        private final int f22216b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m15043a() {
            return this.f22215a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m15042b() {
            return this.f22216b;
        }

        private C8601b(int i, int i2) {
            this.f22215a = i;
            this.f22216b = i2;
        }
    }

    private C8599e(int i, int i2, int i3, int i4, int i5, C8602c c8602c) {
        C8601b[] m15041a;
        this.f22208a = i;
        this.f22209b = i2;
        this.f22210c = i3;
        this.f22211d = i4;
        this.f22212e = i5;
        this.f22213f = c8602c;
        int m15040b = c8602c.m15040b();
        int i6 = 0;
        for (C8601b c8601b : c8602c.m15041a()) {
            i6 += c8601b.m15043a() * (c8601b.m15042b() + m15040b);
        }
        this.f22214g = i6;
    }

    /* renamed from: a */
    private static C8599e[] m15052a() {
        return new C8599e[]{new C8599e(1, 10, 10, 8, 8, new C8602c(5, new C8601b(1, 3))), new C8599e(2, 12, 12, 10, 10, new C8602c(7, new C8601b(1, 5))), new C8599e(3, 14, 14, 12, 12, new C8602c(10, new C8601b(1, 8))), new C8599e(4, 16, 16, 14, 14, new C8602c(12, new C8601b(1, 12))), new C8599e(5, 18, 18, 16, 16, new C8602c(14, new C8601b(1, 18))), new C8599e(6, 20, 20, 18, 18, new C8602c(18, new C8601b(1, 22))), new C8599e(7, 22, 22, 20, 20, new C8602c(20, new C8601b(1, 30))), new C8599e(8, 24, 24, 22, 22, new C8602c(24, new C8601b(1, 36))), new C8599e(9, 26, 26, 24, 24, new C8602c(28, new C8601b(1, 44))), new C8599e(10, 32, 32, 14, 14, new C8602c(36, new C8601b(1, 62))), new C8599e(11, 36, 36, 16, 16, new C8602c(42, new C8601b(1, 86))), new C8599e(12, 40, 40, 18, 18, new C8602c(48, new C8601b(1, 114))), new C8599e(13, 44, 44, 20, 20, new C8602c(56, new C8601b(1, 144))), new C8599e(14, 48, 48, 22, 22, new C8602c(68, new C8601b(1, 174))), new C8599e(15, 52, 52, 24, 24, new C8602c(42, new C8601b(2, C0868i.f2748C0))), new C8599e(16, 64, 64, 14, 14, new C8602c(56, new C8601b(2, 140))), new C8599e(17, 72, 72, 16, 16, new C8602c(36, new C8601b(4, 92))), new C8599e(18, 80, 80, 18, 18, new C8602c(48, new C8601b(4, 114))), new C8599e(19, 88, 88, 20, 20, new C8602c(56, new C8601b(4, 144))), new C8599e(20, 96, 96, 22, 22, new C8602c(68, new C8601b(4, 174))), new C8599e(21, C0868i.f2758E0, C0868i.f2758E0, 24, 24, new C8602c(56, new C8601b(6, 136))), new C8599e(22, C4906j.f13390C0, C4906j.f13390C0, 18, 18, new C8602c(68, new C8601b(6, 175))), new C8599e(23, 132, 132, 20, 20, new C8602c(62, new C8601b(8, 163))), new C8599e(24, 144, 144, 22, 22, new C8602c(62, new C8601b(8, 156), new C8601b(2, 155))), new C8599e(25, 8, 18, 6, 16, new C8602c(7, new C8601b(1, 5))), new C8599e(26, 8, 32, 6, 14, new C8602c(11, new C8601b(1, 10))), new C8599e(27, 12, 26, 10, 24, new C8602c(14, new C8601b(1, 16))), new C8599e(28, 12, 36, 10, 16, new C8602c(18, new C8601b(1, 22))), new C8599e(29, 16, 36, 14, 16, new C8602c(24, new C8601b(1, 32))), new C8599e(30, 16, 48, 14, 22, new C8602c(28, new C8601b(1, 49)))};
    }

    /* renamed from: h */
    public static C8599e m15045h(int i, int i2) throws FormatException {
        C8599e[] c8599eArr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C8599e c8599e : f22207h) {
                if (c8599e.f22209b == i && c8599e.f22210c == i2) {
                    return c8599e;
                }
            }
            throw FormatException.m27702a();
        }
        throw FormatException.m27702a();
    }

    /* renamed from: b */
    public int m15051b() {
        return this.f22212e;
    }

    /* renamed from: c */
    public int m15050c() {
        return this.f22211d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C8602c m15049d() {
        return this.f22213f;
    }

    /* renamed from: e */
    public int m15048e() {
        return this.f22210c;
    }

    /* renamed from: f */
    public int m15047f() {
        return this.f22209b;
    }

    /* renamed from: g */
    public int m15046g() {
        return this.f22214g;
    }

    /* renamed from: i */
    public int m15044i() {
        return this.f22208a;
    }

    public String toString() {
        return String.valueOf(this.f22208a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Version.java */
    /* renamed from: pb.e$c */
    /* loaded from: classes2.dex */
    public static final class C8602c {

        /* renamed from: a */
        private final int f22217a;

        /* renamed from: b */
        private final C8601b[] f22218b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C8601b[] m15041a() {
            return this.f22218b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m15040b() {
            return this.f22217a;
        }

        private C8602c(int i, C8601b c8601b) {
            this.f22217a = i;
            this.f22218b = new C8601b[]{c8601b};
        }

        private C8602c(int i, C8601b c8601b, C8601b c8601b2) {
            this.f22217a = i;
            this.f22218b = new C8601b[]{c8601b, c8601b2};
        }
    }
}
