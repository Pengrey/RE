package p162ig;

import p181jd.Intrinsics;

/* renamed from: ig.a */
/* loaded from: classes2.dex */
public final class Term {

    /* renamed from: a */
    private final String f16828a;

    /* renamed from: b */
    private final String f16829b;

    public Term(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "title");
        this.f16828a = str;
        this.f16829b = str2;
    }

    /* renamed from: a */
    public final String m22124a() {
        return this.f16828a;
    }

    /* renamed from: b */
    public final String m22123b() {
        return this.f16829b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Term) {
            Term term = (Term) obj;
            return Intrinsics.equals(this.f16828a, term.f16828a) && Intrinsics.equals(this.f16829b, term.f16829b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f16828a.hashCode() * 31;
        String str = this.f16829b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f16828a;
        String str2 = this.f16829b;
        return "TermUrl(title=" + str + ", url=" + str2 + ")";
    }
}
