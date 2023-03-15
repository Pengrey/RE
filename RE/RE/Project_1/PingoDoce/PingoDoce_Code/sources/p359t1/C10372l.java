package p359t1;

import p181jd.Intrinsics;

/* renamed from: t1.l */
/* loaded from: classes.dex */
public final class C10372l extends AbstractC10364e {

    /* renamed from: y */
    private final InterfaceC10375o f26981y;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10372l) && Intrinsics.equals(this.f26981y, ((C10372l) obj).f26981y);
    }

    /* renamed from: f */
    public final InterfaceC10375o m8097f() {
        return this.f26981y;
    }

    public int hashCode() {
        return this.f26981y.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f26981y + ')';
    }
}
