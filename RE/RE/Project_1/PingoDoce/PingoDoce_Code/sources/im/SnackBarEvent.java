package im;

import ne.AbstractC7703b;
import p181jd.Intrinsics;

/* renamed from: im.a */
/* loaded from: classes2.dex */
public final class SnackBarEvent extends AbstractC7703b {

    /* renamed from: b */
    private final SnackBarObject f17017b;

    public SnackBarEvent(SnackBarObject snackBarObject) {
        Intrinsics.isThisObjectNull(snackBarObject, "snackBarObject");
        this.f17017b = snackBarObject;
    }

    /* renamed from: c */
    public SnackBarObject mo17670b() {
        return this.f17017b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SnackBarEvent) && Intrinsics.equals(this.f17017b, ((SnackBarEvent) obj).f17017b);
    }

    public int hashCode() {
        return this.f17017b.hashCode();
    }

    public String toString() {
        SnackBarObject snackBarObject = this.f17017b;
        return "SnackBarEvent(snackBarObject=" + snackBarObject + ")";
    }
}
