package ac;

import com.google.zxing.C4411o;
import com.google.zxing.NotFoundException;
import p239mb.C7155b;

/* renamed from: ac.c */
/* loaded from: classes2.dex */
final class C0116c {

    /* renamed from: a */
    private final C7155b f270a;

    /* renamed from: b */
    private final C4411o f271b;

    /* renamed from: c */
    private final C4411o f272c;

    /* renamed from: d */
    private final C4411o f273d;

    /* renamed from: e */
    private final C4411o f274e;

    /* renamed from: f */
    private final int f275f;

    /* renamed from: g */
    private final int f276g;

    /* renamed from: h */
    private final int f277h;

    /* renamed from: i */
    private final int f278i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0116c(C7155b c7155b, C4411o c4411o, C4411o c4411o2, C4411o c4411o3, C4411o c4411o4) throws NotFoundException {
        boolean z = false;
        boolean z2 = c4411o == null || c4411o2 == null;
        z = (c4411o3 == null || c4411o4 == null) ? true : z;
        if (z2 && z) {
            throw NotFoundException.m27700a();
        }
        if (z2) {
            c4411o = new C4411o(0.0f, c4411o3.m27639d());
            c4411o2 = new C4411o(0.0f, c4411o4.m27639d());
        } else if (z) {
            c4411o3 = new C4411o(c7155b.m19053l() - 1, c4411o.m27639d());
            c4411o4 = new C4411o(c7155b.m19053l() - 1, c4411o2.m27639d());
        }
        this.f270a = c7155b;
        this.f271b = c4411o;
        this.f272c = c4411o2;
        this.f273d = c4411o3;
        this.f274e = c4411o4;
        this.f275f = (int) Math.min(c4411o.m27640c(), c4411o2.m27640c());
        this.f276g = (int) Math.max(c4411o3.m27640c(), c4411o4.m27640c());
        this.f277h = (int) Math.min(c4411o.m27639d(), c4411o3.m27639d());
        this.f278i = (int) Math.max(c4411o2.m27639d(), c4411o4.m27639d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C0116c m41873j(C0116c c0116c, C0116c c0116c2) throws NotFoundException {
        return c0116c == null ? c0116c2 : c0116c2 == null ? c0116c : new C0116c(c0116c.f270a, c0116c.f271b, c0116c.f272c, c0116c2.f273d, c0116c2.f274e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ac.C0116c m41882a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.o r0 = r12.f271b
            com.google.zxing.o r1 = r12.f272c
            com.google.zxing.o r2 = r12.f273d
            com.google.zxing.o r3 = r12.f274e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.m27639d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.google.zxing.o r13 = new com.google.zxing.o
            float r4 = r4.m27640c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            com.google.zxing.o r13 = r12.f272c
            goto L34
        L32:
            com.google.zxing.o r13 = r12.f274e
        L34:
            float r0 = r13.m27639d()
            int r0 = (int) r0
            int r0 = r0 + r14
            mb.b r14 = r12.f270a
            int r14 = r14.m19056i()
            if (r0 < r14) goto L4a
            mb.b r14 = r12.f270a
            int r14 = r14.m19056i()
            int r0 = r14 + (-1)
        L4a:
            com.google.zxing.o r14 = new com.google.zxing.o
            float r13 = r13.m27640c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            ac.c r13 = new ac.c
            mb.b r7 = r12.f270a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0116c.m41882a(int, int, boolean):ac.c");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C4411o m41881b() {
        return this.f272c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C4411o m41880c() {
        return this.f274e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m41879d() {
        return this.f276g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m41878e() {
        return this.f278i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m41877f() {
        return this.f275f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m41876g() {
        return this.f277h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C4411o m41875h() {
        return this.f271b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C4411o m41874i() {
        return this.f273d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0116c(C0116c c0116c) {
        this.f270a = c0116c.f270a;
        this.f271b = c0116c.m41875h();
        this.f272c = c0116c.m41881b();
        this.f273d = c0116c.m41874i();
        this.f274e = c0116c.m41880c();
        this.f275f = c0116c.m41877f();
        this.f276g = c0116c.m41879d();
        this.f277h = c0116c.m41876g();
        this.f278i = c0116c.m41878e();
    }
}
