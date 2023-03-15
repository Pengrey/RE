package p434x1;

import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpannableExtensions.android.kt */
/* renamed from: x1.d */
/* loaded from: classes.dex */
public final class C12251d {

    /* renamed from: a */
    private final Object f32296a;

    /* renamed from: b */
    private final int f32297b;

    /* renamed from: c */
    private final int f32298c;

    public C12251d(Object obj, int i, int i2) {
        Intrinsics.isThisObjectNull(obj, "span");
        this.f32296a = obj;
        this.f32297b = i;
        this.f32298c = i2;
    }

    /* renamed from: a */
    public final Object m3212a() {
        return this.f32296a;
    }

    /* renamed from: b */
    public final int m3211b() {
        return this.f32297b;
    }

    /* renamed from: c */
    public final int m3210c() {
        return this.f32298c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12251d) {
            C12251d c12251d = (C12251d) obj;
            return Intrinsics.equals(this.f32296a, c12251d.f32296a) && this.f32297b == c12251d.f32297b && this.f32298c == c12251d.f32298c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f32296a.hashCode() * 31) + Integer.hashCode(this.f32297b)) * 31) + Integer.hashCode(this.f32298c);
    }

    public String toString() {
        return "SpanRange(span=" + this.f32296a + ", start=" + this.f32297b + ", end=" + this.f32298c + ')';
    }
}
