package gi;

import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: gi.c */
/* loaded from: classes2.dex */
public final class C5691c implements InterfaceC5692d {

    /* renamed from: a */
    private final boolean f15942a;

    public C5691c(boolean z) {
        this.f15942a = z;
    }

    @Override // gi.InterfaceC5692d
    /* renamed from: a */
    public EnumC5690a mo23336a() {
        return EnumC5690a.BenefitTitle;
    }

    /* renamed from: b */
    public final int m23337b() {
        return this.f15942a ? C2336R.string.lbl_ompd_coupon : C2336R.string.lbl_ompd_active_benefits;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5691c) && this.f15942a == ((C5691c) obj).f15942a;
    }

    public int hashCode() {
        boolean z = this.f15942a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f15942a;
        return "BenefitViewStateTitle(isCoupon=" + z + ")";
    }
}
