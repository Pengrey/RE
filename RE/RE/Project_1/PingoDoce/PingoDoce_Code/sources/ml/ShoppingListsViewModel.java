package ml;

import p181jd.Intrinsics;

/* renamed from: ml.k */
/* loaded from: classes2.dex */
public final class ShoppingListsViewModel implements InterfaceC7504a {

    /* renamed from: w */
    private final String f19851w;

    public ShoppingListsViewModel(String str) {
        Intrinsics.isThisObjectNull(str, "label");
        this.f19851w = str;
    }

    /* renamed from: a */
    public final String m18313a() {
        return this.f19851w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShoppingListsViewModel) && Intrinsics.equals(this.f19851w, ((ShoppingListsViewModel) obj).f19851w);
    }

    public int hashCode() {
        return this.f19851w.hashCode();
    }

    public String toString() {
        String str = this.f19851w;
        return "ShoppingListsHeader(label=" + str + ")";
    }
}
