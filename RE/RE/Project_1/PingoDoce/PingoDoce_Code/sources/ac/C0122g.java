package ac;

import java.util.Formatter;

/* renamed from: ac.g */
/* loaded from: classes2.dex */
class C0122g {

    /* renamed from: a */
    private final C0116c f292a;

    /* renamed from: b */
    private final C0117d[] f293b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0122g(C0116c c0116c) {
        this.f292a = new C0116c(c0116c);
        this.f293b = new C0117d[(c0116c.m41878e() - c0116c.m41876g()) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0116c m41838a() {
        return this.f292a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0117d m41837b(int i) {
        return this.f293b[m41834e(i)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0117d m41836c(int i) {
        C0117d c0117d;
        C0117d c0117d2;
        C0117d m41837b = m41837b(i);
        if (m41837b != null) {
            return m41837b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int m41834e = m41834e(i) - i2;
            if (m41834e >= 0 && (c0117d2 = this.f293b[m41834e]) != null) {
                return c0117d2;
            }
            int m41834e2 = m41834e(i) + i2;
            C0117d[] c0117dArr = this.f293b;
            if (m41834e2 < c0117dArr.length && (c0117d = c0117dArr[m41834e2]) != null) {
                return c0117d;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C0117d[] m41835d() {
        return this.f293b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m41834e(int i) {
        return i - this.f292a.m41876g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m41833f(int i, C0117d c0117d) {
        this.f293b[m41834e(i)] = c0117d;
    }

    public String toString() {
        C0117d[] c0117dArr;
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (C0117d c0117d : this.f293b) {
                if (c0117d == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(c0117d.m41870c()), Integer.valueOf(c0117d.m41868e()));
                    i++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
