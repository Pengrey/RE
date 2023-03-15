package p183jg;

import p181jd.Intrinsics;

/* renamed from: jg.a */
/* loaded from: classes2.dex */
public final class PurchaseDate implements InterfaceC6458c {

    /* renamed from: w */
    private final String f17564w;

    public PurchaseDate(String str) {
        Intrinsics.isThisObjectNull(str, "date");
        this.f17564w = str;
    }

    /* renamed from: a */
    public final String m20848a() {
        return this.f17564w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseDate) && Intrinsics.equals(this.f17564w, ((PurchaseDate) obj).f17564w);
    }

    public int hashCode() {
        return this.f17564w.hashCode();
    }

    public String toString() {
        String str = this.f17564w;
        return "PurchaseDate(date=" + str + ")";
    }
}
