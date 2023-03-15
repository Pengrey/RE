package p036c0;

import p181jd.Intrinsics;

/* renamed from: c0.e */
/* loaded from: classes.dex */
public final class C1963e {

    /* renamed from: a */
    private final C1964a f5777a;

    /* renamed from: b */
    private final C1964a f5778b;

    /* renamed from: c */
    private final boolean f5779c;

    /* compiled from: Selection.kt */
    /* renamed from: c0.e$a */
    /* loaded from: classes.dex */
    public static final class C1964a {
    }

    /* renamed from: a */
    public final C1964a m35017a() {
        return this.f5778b;
    }

    /* renamed from: b */
    public final boolean m35016b() {
        return this.f5779c;
    }

    /* renamed from: c */
    public final C1964a m35015c() {
        return this.f5777a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1963e) {
            C1963e c1963e = (C1963e) obj;
            return Intrinsics.equals(this.f5777a, c1963e.f5777a) && Intrinsics.equals(this.f5778b, c1963e.f5778b) && this.f5779c == c1963e.f5779c;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Selection(start=" + this.f5777a + ", end=" + this.f5778b + ", handlesCrossed=" + this.f5779c + ')';
    }
}
