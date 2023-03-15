package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.b */
/* loaded from: classes.dex */
public final class C0970b {

    /* renamed from: e */
    public static final C0970b f3250e = new C0970b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3251a;

    /* renamed from: b */
    public final int f3252b;

    /* renamed from: c */
    public final int f3253c;

    /* renamed from: d */
    public final int f3254d;

    /* compiled from: Insets.java */
    /* renamed from: androidx.core.graphics.b$a */
    /* loaded from: classes.dex */
    static class C0971a {
        /* renamed from: a */
        static Insets m38933a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private C0970b(int i, int i2, int i3, int i4) {
        this.f3251a = i;
        this.f3252b = i2;
        this.f3253c = i3;
        this.f3254d = i4;
    }

    /* renamed from: a */
    public static C0970b m38938a(C0970b c0970b, C0970b c0970b2) {
        return m38937b(Math.max(c0970b.f3251a, c0970b2.f3251a), Math.max(c0970b.f3252b, c0970b2.f3252b), Math.max(c0970b.f3253c, c0970b2.f3253c), Math.max(c0970b.f3254d, c0970b2.f3254d));
    }

    /* renamed from: b */
    public static C0970b m38937b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f3250e;
        }
        return new C0970b(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C0970b m38936c(Rect rect) {
        return m38937b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0970b m38935d(Insets insets) {
        return m38937b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m38934e() {
        return C0971a.m38933a(this.f3251a, this.f3252b, this.f3253c, this.f3254d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0970b.class != obj.getClass()) {
            return false;
        }
        C0970b c0970b = (C0970b) obj;
        return this.f3254d == c0970b.f3254d && this.f3251a == c0970b.f3251a && this.f3253c == c0970b.f3253c && this.f3252b == c0970b.f3252b;
    }

    public int hashCode() {
        return (((((this.f3251a * 31) + this.f3252b) * 31) + this.f3253c) * 31) + this.f3254d;
    }

    public String toString() {
        return "Insets{left=" + this.f3251a + ", top=" + this.f3252b + ", right=" + this.f3253c + ", bottom=" + this.f3254d + '}';
    }
}
